package com.p3249xcbb51f6b.p3253x3f73626a;

/* renamed from: com.tenpay.miniapp.MiniAppSecureEditText */
/* loaded from: classes7.dex */
public final class C28009x4b3da7b8 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0083x8fabc05a {

    /* renamed from: DEFAULT_PASSWD_LENGTH */
    private static final int f63012x1307de09 = 6;

    /* renamed from: MAX_PASSWD_LENGTH */
    private static final int f63013x5700ebec = 32;

    /* renamed from: PASSWD_BLACK_DOT_SIZE */
    private static final int f63014xe2dbd578 = 7;

    /* renamed from: PASSWD_LEFT_PADDING */
    private static final int f63015xe6f703ba = -1500000;

    /* renamed from: certPem */
    private java.lang.String f63016x27decc54;

    /* renamed from: customHash */
    private byte[] f63017xa1b3a01f;

    /* renamed from: fitScUtil */
    private com.p3249xcbb51f6b.ndk.C28017xb1a251c3 f63018x3a3031e3;

    /* renamed from: isFixedInputLength */
    private boolean f63019xa4780c86;

    /* renamed from: mBlackListChar */
    private char[] f63020x17d8c6c6;

    /* renamed from: mClearBtnImg */
    private android.graphics.drawable.Drawable f63021x2e87b9c7;

    /* renamed from: mDensity */
    private float f63022xfaa547bb;

    /* renamed from: mPaintBackground */
    private android.graphics.Paint f63023x75d3fbff;

    /* renamed from: mPasswdListener */
    private com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.OnPasswdInputListener f63024x5be0673f;

    /* renamed from: mWhiteListChar */
    private char[] f63025xf03d38f0;

    /* renamed from: maxInputLength */
    private int f63026x6abf7b4c;

    /* renamed from: minInputLength */
    private int f63027x91e7399e;

    /* renamed from: nonce */
    private long f63028x64237ef;

    /* renamed from: salt */
    private java.lang.String f63029x35c056;

    /* renamed from: timeStamp */
    private long f63030x18638f6;

    /* renamed from: com.tenpay.miniapp.MiniAppSecureEditText$5, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: $SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType */
        static final /* synthetic */ int[] f63035xae1f2799;

        static {
            int[] iArr = new int[com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.EEncodeType.m121737xcee59d22().length];
            f63035xae1f2799 = iArr;
            try {
                iArr[com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.EEncodeType.TBase64.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f63035xae1f2799[com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.EEncodeType.THexLowerCase.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f63035xae1f2799[com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.EEncodeType.THexUpperCase.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tenpay.miniapp.MiniAppSecureEditText$EEncodeType */
    /* loaded from: classes7.dex */
    public enum EEncodeType {
        THexLowerCase,
        THexUpperCase,
        TBase64
    }

    /* renamed from: com.tenpay.miniapp.MiniAppSecureEditText$OnPasswdInputListener */
    /* loaded from: classes7.dex */
    public interface OnPasswdInputListener {
        /* renamed from: onDone */
        void mo53537xc3989e01();
    }

    public C28009x4b3da7b8(android.content.Context context) {
        super(context, null);
        this.f63027x91e7399e = 6;
        this.f63026x6abf7b4c = 6;
        this.f63019xa4780c86 = true;
    }

    /* renamed from: bytesToHex */
    private static java.lang.String m121706x526410f5(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() < 2) {
                sb6.append(0);
            }
            sb6.append(hexString.toLowerCase());
        }
        return sb6.toString();
    }

    /* renamed from: drawPasswdDot */
    private void m121707xd12f8ce7(android.graphics.Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int i17 = width / this.f63026x6abf7b4c;
        int length = m121708x652b8d61().length();
        for (int i18 = 0; i18 < length; i18++) {
            canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, this.f63022xfaa547bb * 7.0f, this.f63023x75d3fbff);
        }
    }

    /* renamed from: getInputText */
    private java.lang.String m121708x652b8d61() {
        return super.getText().toString().trim();
    }

    /* renamed from: init */
    private void m121709x316510(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.f63022xfaa547bb = getResources().getDisplayMetrics().density;
        m121713xbc8182be(true);
        setAccessibilityDelegate(new com.p3249xcbb51f6b.p3253x3f73626a.C28010x272d4e28());
    }

    /* renamed from: isValidChar */
    private boolean m121710x4097b68(char c17) {
        boolean z17;
        char[] cArr = this.f63025xf03d38f0;
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
        if (this.f63020x17d8c6c6 != null) {
            for (char c18 : this.f63025xf03d38f0) {
                if (c18 == c17) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: setBlackListChar */
    private void m121711xd00e0f1(char[] cArr) {
        this.f63020x17d8c6c6 = cArr;
    }

    /* renamed from: setClearBtnDrawableId */
    private void m121712xd30bb48a(int i17) {
        try {
            this.f63021x2e87b9c7 = getResources().getDrawable(i17);
        } catch (java.lang.Exception unused) {
            this.f63021x2e87b9c7 = null;
        }
        android.graphics.drawable.Drawable drawable = this.f63021x2e87b9c7;
        if (drawable == null) {
            setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.miniapp.MiniAppSecureEditText.3
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                }
            });
            setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.miniapp.MiniAppSecureEditText.4
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return false;
                }
            });
        } else {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f63021x2e87b9c7.getIntrinsicHeight());
            setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.miniapp.MiniAppSecureEditText.1
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                    if (z17) {
                        return;
                    }
                    com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8 c28009x4b3da7b8 = com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.this;
                    c28009x4b3da7b8.setCompoundDrawables(c28009x4b3da7b8.getCompoundDrawables()[0], com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.this.getCompoundDrawables()[1], null, com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.this.getCompoundDrawables()[3]);
                }
            });
            setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.miniapp.MiniAppSecureEditText.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return false;
                }
            });
        }
    }

    /* renamed from: setIsPasswordFormat */
    private void m121713xbc8182be(boolean z17) {
        if (!z17) {
            this.f63023x75d3fbff = null;
            return;
        }
        setPadding(f63015xe6f703ba, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f63023x75d3fbff = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f63023x75d3fbff.setColor(-16777216);
        setInputType(2);
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f63026x6abf7b4c)});
    }

    /* renamed from: setWhiteListChar */
    private void m121714xe565531b(char[] cArr) {
        this.f63025xf03d38f0 = cArr;
    }

    /* renamed from: beginCustomHash */
    public void m121715xb3ddf5a8() {
        if (android.text.TextUtils.isEmpty(m121708x652b8d61())) {
            return;
        }
        this.f63017xa1b3a01f = m121708x652b8d61().getBytes();
    }

    /* renamed from: customAppendSalt */
    public void m121716x896474e1(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(m121708x652b8d61())) {
            return;
        }
        byte[] bArr = new byte[this.f63017xa1b3a01f.length + str.length()];
        byte[] bArr2 = this.f63017xa1b3a01f;
        java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        java.lang.System.arraycopy(str.getBytes(), 0, bArr, this.f63017xa1b3a01f.length, str.length());
        this.f63017xa1b3a01f = bArr;
    }

    /* renamed from: customInsertSalt */
    public void m121717x427f8100(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(m121708x652b8d61())) {
            return;
        }
        byte[] bArr = new byte[this.f63017xa1b3a01f.length + str.length()];
        java.lang.System.arraycopy(str.getBytes(), 0, bArr, 0, str.length());
        java.lang.System.arraycopy(this.f63017xa1b3a01f, 0, bArr, str.length(), this.f63017xa1b3a01f.length);
        this.f63017xa1b3a01f = bArr;
    }

    /* renamed from: customPasswdEncode */
    public void m121718x4712c65(com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.EEncodeType eEncodeType) {
        if (android.text.TextUtils.isEmpty(m121708x652b8d61())) {
            return;
        }
        int i17 = com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.AnonymousClass5.f63035xae1f2799[eEncodeType.ordinal()];
        if (i17 == 1) {
            this.f63017xa1b3a01f = android.util.Base64.encodeToString(this.f63017xa1b3a01f, 0).trim().getBytes();
        } else if (i17 == 2) {
            this.f63017xa1b3a01f = m121706x526410f5(this.f63017xa1b3a01f).getBytes();
        } else {
            if (i17 != 3) {
                return;
            }
            this.f63017xa1b3a01f = m121706x526410f5(this.f63017xa1b3a01f).toUpperCase().getBytes();
        }
    }

    /* renamed from: customPasswdMd5 */
    public void m121719x6e1af18f() {
        if (android.text.TextUtils.isEmpty(m121708x652b8d61())) {
            return;
        }
        this.f63017xa1b3a01f = this.f63018x3a3031e3.md5(this.f63017xa1b3a01f);
    }

    /* renamed from: customPasswdSha1 */
    public void m121720x55460f14() {
        if (android.text.TextUtils.isEmpty(m121708x652b8d61())) {
            return;
        }
        this.f63017xa1b3a01f = this.f63018x3a3031e3.m121859x35d905(this.f63017xa1b3a01f);
    }

    /* renamed from: customPasswdSha256 */
    public void m121721x1bfea476() {
        if (android.text.TextUtils.isEmpty(m121708x652b8d61())) {
            return;
        }
        this.f63017xa1b3a01f = this.f63018x3a3031e3.m121860xca23b627(this.f63017xa1b3a01f);
    }

    /* renamed from: customPasswdSm3 */
    public void m121722x6e1b092a() {
        if (android.text.TextUtils.isEmpty(m121708x652b8d61())) {
            return;
        }
        this.f63017xa1b3a01f = this.f63018x3a3031e3.sm3(this.f63017xa1b3a01f);
    }

    /* renamed from: endCustomHashAndEncrypt */
    public java.lang.String m121723xb358c388(long j17, long j18) {
        byte[] bArr;
        java.lang.String m121836x92511a40;
        java.lang.String m121708x652b8d61 = m121708x652b8d61();
        if (android.text.TextUtils.isEmpty(m121708x652b8d61) || m121708x652b8d61.length() < this.f63027x91e7399e || this.f63018x3a3031e3 == null || (bArr = this.f63017xa1b3a01f) == null || j17 == 0 || j18 == 0) {
            return null;
        }
        java.lang.String m121706x526410f5 = m121706x526410f5(bArr);
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121836x92511a40 = this.f63018x3a3031e3.m121836x92511a40(this.f63016x27decc54, m121706x526410f5.getBytes(), null, j17, java.lang.String.valueOf(j18), 0, false);
            this.f63017xa1b3a01f = null;
        }
        return m121836x92511a40;
    }

    /* renamed from: getEncryptedData */
    public java.lang.String m121724xb3b5d7d8() {
        java.lang.String m121836x92511a40;
        java.lang.String m121708x652b8d61 = m121708x652b8d61();
        if (android.text.TextUtils.isEmpty(m121708x652b8d61) || m121708x652b8d61.length() < this.f63027x91e7399e || this.f63029x35c056 == null || this.f63030x18638f6 == 0 || this.f63028x64237ef == 0) {
            return null;
        }
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121836x92511a40 = this.f63018x3a3031e3.m121836x92511a40(this.f63016x27decc54, m121708x652b8d61.getBytes(), this.f63029x35c056.getBytes(), this.f63030x18638f6, java.lang.String.valueOf(this.f63028x64237ef), 7, false);
        }
        return m121836x92511a40;
    }

    /* renamed from: getLastError */
    public int m121725x75feee5c() {
        return this.f63018x3a3031e3.m121841x75feee5c();
    }

    /* renamed from: getVersion */
    public java.lang.String m121726x52c258a2() {
        return this.f63018x3a3031e3.m121847x52c258a2();
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        if ((getInputType() & 128) > 0) {
            return;
        }
        super.onCreateContextMenu(contextMenu);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            com.p3249xcbb51f6b.ndk.C28017xb1a251c3 c28017xb1a251c3 = this.f63018x3a3031e3;
            if (c28017xb1a251c3 != null) {
                c28017xb1a251c3.m121855x41012807();
                this.f63018x3a3031e3 = null;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        m121707xd12f8ce7(canvas);
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.OnPasswdInputListener onPasswdInputListener;
        super.onTextChanged(charSequence, i17, i18, i19);
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        for (int i27 = i17; i27 < i17 + i19; i27++) {
            if (!m121710x4097b68(charSequence.charAt(i27))) {
                java.lang.String charSequence2 = charSequence.toString();
                setText(charSequence2.substring(0, i27) + charSequence2.substring(i27 + 1));
                setSelection(i27);
                return;
            }
        }
        if (this.f63019xa4780c86 && charSequence.length() == this.f63026x6abf7b4c && (onPasswdInputListener = this.f63024x5be0673f) != null) {
            onPasswdInputListener.mo53537xc3989e01();
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if ((getInputType() & 128) > 0) {
            return true;
        }
        return super.onTextContextMenuItem(i17);
    }

    /* renamed from: setCertContext */
    public boolean m121727x1a180d29(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        boolean m121851x316510;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            com.p3249xcbb51f6b.ndk.C28017xb1a251c3 c28017xb1a251c3 = new com.p3249xcbb51f6b.ndk.C28017xb1a251c3();
            this.f63018x3a3031e3 = c28017xb1a251c3;
            this.f63016x27decc54 = str;
            m121851x316510 = c28017xb1a251c3.m121851x316510(str2, str3, null, null);
        }
        return m121851x316510;
    }

    /* renamed from: setInputLength */
    public void m121728x5137b98e(int i17, int i18) {
        this.f63027x91e7399e = i17;
        this.f63026x6abf7b4c = i18;
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i18)});
        this.f63019xa4780c86 = i17 == i18;
    }

    /* renamed from: setNonce */
    public void m121729x536df8ad(long j17) {
        this.f63028x64237ef = j17;
    }

    /* renamed from: setOnPasswdInputListener */
    public void m121730xc90120ff(com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8.OnPasswdInputListener onPasswdInputListener) {
        this.f63024x5be0673f = onPasswdInputListener;
    }

    /* renamed from: setSalt */
    public void m121731x764fefd8(java.lang.String str) {
        this.f63029x35c056 = str;
    }

    /* renamed from: setTimeStamp */
    public void m121732x5d476ab4(long j17) {
        this.f63030x18638f6 = j17;
    }

    public C28009x4b3da7b8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63027x91e7399e = 6;
        this.f63026x6abf7b4c = 6;
        this.f63019xa4780c86 = true;
        m121709x316510(context, attributeSet);
    }

    public C28009x4b3da7b8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f63027x91e7399e = 6;
        this.f63026x6abf7b4c = 6;
        this.f63019xa4780c86 = true;
        m121709x316510(context, attributeSet);
    }
}
