package com.p3249xcbb51f6b.p3257x373aa5;

/* renamed from: com.tenpay.view.TenpaySecureInputView */
/* loaded from: classes7.dex */
public final class C28049x9de490cd extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0083x8fabc05a {

    /* renamed from: DEFAULT_MAX_LENGTH */
    private static final int f65693x3c3d31f = 32;

    /* renamed from: inputDataType */
    private com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType f65694x89315fee;

    /* renamed from: isSelfSet */
    private boolean f65695x5358e8ec;

    /* renamed from: mBlackListChar */
    private char[] f65696x17d8c6c6;

    /* renamed from: mWhiteListChar */
    private char[] f65697xf03d38f0;

    /* renamed from: maxInputLength */
    private int f65698x6abf7b4c;

    /* renamed from: minInputLength */
    private int f65699x91e7399e;

    /* renamed from: onInputListener */
    private com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.OnInputListener f65700xa1d9faff;

    /* renamed from: com.tenpay.view.TenpaySecureInputView$DataType */
    /* loaded from: classes7.dex */
    public enum DataType {
        Text,
        ID,
        BankCard,
        PhoneNum,
        Digits
    }

    /* renamed from: com.tenpay.view.TenpaySecureInputView$OnInputListener */
    /* loaded from: classes7.dex */
    public interface OnInputListener {
        /* renamed from: onInputChanged */
        void m122135xdc18b709(int i17);
    }

    public C28049x9de490cd(android.content.Context context) {
        super(context, null);
        this.f65694x89315fee = com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType.Text;
        this.f65699x91e7399e = 0;
        this.f65698x6abf7b4c = 32;
    }

    /* renamed from: getInputText */
    private java.lang.String m122117x652b8d61() {
        return super.getText().toString().replaceAll(" ", "");
    }

    /* renamed from: init */
    private void m122118x316510(android.content.Context context, android.util.AttributeSet attributeSet) {
        setInputType(0);
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f65698x6abf7b4c)});
    }

    /* renamed from: isValidChar */
    private boolean m122119x4097b68(char c17) {
        boolean z17;
        if (this.f65694x89315fee == com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType.BankCard && c17 == ' ') {
            return true;
        }
        char[] cArr = this.f65697xf03d38f0;
        if (cArr != null) {
            int length = cArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    z17 = true;
                    break;
                }
                if (cArr[i17] == c17) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17) {
                return false;
            }
        }
        if (this.f65696x17d8c6c6 != null) {
            for (char c18 : this.f65697xf03d38f0) {
                if (c18 == c17) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: checkInputData */
    public boolean m122120xd3622a6c(java.lang.String str) {
        java.lang.String m122117x652b8d61 = m122117x652b8d61();
        if (m122117x652b8d61.length() < this.f65699x91e7399e) {
            return false;
        }
        return java.util.regex.Pattern.compile(str).matcher(m122117x652b8d61).matches();
    }

    /* renamed from: clearInput */
    public void m122121xd319997d() {
        setText("");
    }

    /* renamed from: getDataHash */
    public java.lang.String m122122xe6777d4e(java.lang.String str) {
        return com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121935xf272b899(m122117x652b8d61(), str);
    }

    /* renamed from: getEncryptData */
    public java.lang.String m122123xeed02279(java.lang.String str, java.lang.String str2) {
        return com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121933x582422a6(str, m122117x652b8d61(), str2);
    }

    /* renamed from: getInputLength */
    public int m122124xbad2461a() {
        return getText().length();
    }

    /* renamed from: getLastError */
    public int m122125x75feee5c() {
        return com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121936x75feee5c();
    }

    /* renamed from: getVersion */
    public java.lang.String m122126x52c258a2() {
        return com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121937x52c258a2();
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            for (int i27 = i17; i27 < i17 + i19; i27++) {
                if (!m122119x4097b68(charSequence.charAt(i27))) {
                    java.lang.String charSequence2 = charSequence.toString();
                    setText(charSequence2.substring(0, i27) + charSequence2.substring(i27 + 1));
                    setSelection(i27);
                    return;
                }
            }
        }
        java.util.Objects.toString(this.f65694x89315fee);
        if (this.f65694x89315fee == com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType.BankCard) {
            if (this.f65695x5358e8ec) {
                this.f65695x5358e8ec = false;
            } else {
                java.lang.String m122117x652b8d61 = m122117x652b8d61();
                int length = m122117x652b8d61.length();
                if (length > 0) {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    for (int i28 = 0; i28 < length; i28++) {
                        stringBuffer.append(m122117x652b8d61.charAt(i28));
                        if (i28 % 4 == 3 && stringBuffer.length() < this.f65698x6abf7b4c) {
                            stringBuffer.append(' ');
                        }
                    }
                    this.f65695x5358e8ec = true;
                    setText(stringBuffer.toString());
                    setSelection(stringBuffer.length());
                }
            }
        }
        com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.OnInputListener onInputListener = this.f65700xa1d9faff;
        if (onInputListener != null) {
            onInputListener.m122135xdc18b709(m122117x652b8d61().length());
        }
    }

    /* renamed from: setDataType */
    public void m122127xe135ac86(com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType dataType) {
        this.f65694x89315fee = dataType;
        if (dataType == com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType.Text) {
            setInputType(1);
            return;
        }
        setInputType(0);
        if (dataType == com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType.ID) {
            m122128x6e4c4595(18, 18);
            m122130xe565531b(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'x'});
        } else if (dataType == com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType.BankCard) {
            m122130xe565531b(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
        } else if (dataType == com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType.PhoneNum) {
            m122130xe565531b(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
        } else if (dataType == com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType.Digits) {
            m122130xe565531b(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'});
        }
    }

    /* renamed from: setInputRange */
    public void m122128x6e4c4595(int i17, int i18) {
        this.f65699x91e7399e = i17;
        this.f65698x6abf7b4c = i18;
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i18)});
    }

    /* renamed from: setOnInputListener */
    public void m122129xbd12663d(com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.OnInputListener onInputListener) {
        this.f65700xa1d9faff = onInputListener;
    }

    /* renamed from: setWhiteListChar */
    public void m122130xe565531b(char[] cArr) {
        this.f65697xf03d38f0 = cArr;
    }

    public C28049x9de490cd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65694x89315fee = com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType.Text;
        this.f65699x91e7399e = 0;
        this.f65698x6abf7b4c = 32;
        m122118x316510(context, attributeSet);
    }

    public C28049x9de490cd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f65694x89315fee = com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd.DataType.Text;
        this.f65699x91e7399e = 0;
        this.f65698x6abf7b4c = 32;
        m122118x316510(context, attributeSet);
    }
}
