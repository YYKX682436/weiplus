package com.p3249xcbb51f6b.p3258x37c99c;

/* renamed from: com.tenpay.wphk.HkWxSecureEditText */
/* loaded from: classes7.dex */
public final class C28051xcd51cf72 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0083x8fabc05a {

    /* renamed from: DEFAULT_PASSWD_LENGTH */
    private static final int f65716x1307de09 = 6;

    /* renamed from: MAX_PASSWD_LENGTH */
    private static final int f65717x5700ebec = 32;

    /* renamed from: PASSWD_BLACK_DOT_SIZE */
    private static final int f65718xe2dbd578 = 7;

    /* renamed from: PASSWD_LEFT_PADDING */
    private static final int f65719xe6f703ba = -1500000;

    /* renamed from: isFixedInputLength */
    private boolean f65720xa4780c86;

    /* renamed from: mBlackListChar */
    private char[] f65721x17d8c6c6;

    /* renamed from: mClearBtnImg */
    private android.graphics.drawable.Drawable f65722x2e87b9c7;

    /* renamed from: mDensity */
    private float f65723xfaa547bb;

    /* renamed from: mPaintBackground */
    private android.graphics.Paint f65724x75d3fbff;

    /* renamed from: mPasswdListener */
    private com.p3249xcbb51f6b.p3258x37c99c.C28051xcd51cf72.OnPasswdInputListener f65725x5be0673f;

    /* renamed from: mWhiteListChar */
    private char[] f65726xf03d38f0;

    /* renamed from: maxInputLength */
    private int f65727x6abf7b4c;

    /* renamed from: minInputLength */
    private int f65728x91e7399e;

    /* renamed from: noUpdate */
    private boolean f65729x29fa1dea;

    /* renamed from: randomKey */
    private byte[] f65730xceac669c;

    /* renamed from: realContent */
    private byte[] f65731x4bae04fb;

    /* renamed from: realLength */
    private int f65732x7c9a5224;

    /* renamed from: com.tenpay.wphk.HkWxSecureEditText$2, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: $SwitchMap$com$tenpay$wphk$HkWxSecureEditText$EncryptMode */
        static final /* synthetic */ int[] f65734x67705c88;

        static {
            int[] iArr = new int[com.p3249xcbb51f6b.p3258x37c99c.C28051xcd51cf72.EncryptMode.m122161xcee59d22().length];
            f65734x67705c88 = iArr;
            try {
                iArr[com.p3249xcbb51f6b.p3258x37c99c.C28051xcd51cf72.EncryptMode.RSA2048_WITH_MD5.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f65734x67705c88[com.p3249xcbb51f6b.p3258x37c99c.C28051xcd51cf72.EncryptMode.RSA2048_WITH_PBKDF2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.tenpay.wphk.HkWxSecureEditText$EncryptMode */
    /* loaded from: classes7.dex */
    public enum EncryptMode {
        RSA2048_WITH_MD5,
        RSA2048_WITH_PBKDF2
    }

    /* renamed from: com.tenpay.wphk.HkWxSecureEditText$OnPasswdInputListener */
    /* loaded from: classes7.dex */
    public interface OnPasswdInputListener {
        /* renamed from: onDone */
        void m122162xc3989e01();
    }

    public C28051xcd51cf72(android.content.Context context) {
        super(context, null);
        this.f65728x91e7399e = 6;
        this.f65727x6abf7b4c = 6;
        this.f65720xa4780c86 = true;
        this.f65730xceac669c = new byte[32];
        this.f65731x4bae04fb = new byte[32];
        this.f65732x7c9a5224 = 0;
        this.f65729x29fa1dea = false;
    }

    /* renamed from: drawPasswdDot */
    private void m122147xd12f8ce7(android.graphics.Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int i17 = width / this.f65727x6abf7b4c;
        int length = m122148x652b8d61().length();
        for (int i18 = 0; i18 < length; i18++) {
            canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, this.f65723xfaa547bb * 7.0f, this.f65724x75d3fbff);
        }
    }

    /* renamed from: getInputText */
    private java.lang.String m122148x652b8d61() {
        return super.getText().toString().trim();
    }

    /* renamed from: init */
    private void m122149x316510(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.f65723xfaa547bb = getResources().getDisplayMetrics().density;
        m122151xbc8182be(true);
        setAccessibilityDelegate(new com.p3249xcbb51f6b.p3258x37c99c.C28052x272d4e28());
    }

    /* renamed from: setClearBtnDrawableId */
    private void m122150xd30bb48a(int i17) {
        try {
            this.f65722x2e87b9c7 = getResources().getDrawable(i17);
        } catch (java.lang.Exception unused) {
            this.f65722x2e87b9c7 = null;
        }
        android.graphics.drawable.Drawable drawable = this.f65722x2e87b9c7;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f65722x2e87b9c7.getIntrinsicHeight());
            setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.wphk.HkWxSecureEditText.1
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                    if (z17) {
                        return;
                    }
                    com.p3249xcbb51f6b.p3258x37c99c.C28051xcd51cf72 c28051xcd51cf72 = com.p3249xcbb51f6b.p3258x37c99c.C28051xcd51cf72.this;
                    c28051xcd51cf72.setCompoundDrawables(c28051xcd51cf72.getCompoundDrawables()[0], c28051xcd51cf72.getCompoundDrawables()[1], null, c28051xcd51cf72.getCompoundDrawables()[3]);
                }
            });
        }
    }

    /* renamed from: setIsPasswordFormat */
    private void m122151xbc8182be(boolean z17) {
        if (!z17) {
            this.f65724x75d3fbff = null;
            return;
        }
        setPadding(f65719xe6f703ba, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f65724x75d3fbff = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f65724x75d3fbff.setColor(-16777216);
        setInputType(2);
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f65727x6abf7b4c)});
    }

    /* renamed from: updateText */
    private void m122152xee5c6596(java.lang.String str) {
        com.p3249xcbb51f6b.p3258x37c99c.C28051xcd51cf72.OnPasswdInputListener onPasswdInputListener;
        if (this.f65729x29fa1dea) {
            this.f65729x29fa1dea = false;
            return;
        }
        int length = str.length();
        if (this.f65730xceac669c == null || length > this.f65727x6abf7b4c) {
            return;
        }
        if (length == 0) {
            new java.security.SecureRandom().nextBytes(this.f65730xceac669c);
            this.f65732x7c9a5224 = 0;
            return;
        }
        int i17 = this.f65732x7c9a5224;
        if (length < i17) {
            this.f65732x7c9a5224 = i17 - 1;
            return;
        }
        int i18 = length - 1;
        this.f65731x4bae04fb[i18] = (byte) (str.charAt(i18) ^ this.f65730xceac669c[i18]);
        this.f65732x7c9a5224 = length;
        this.f65729x29fa1dea = true;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i19 = 0; i19 < this.f65732x7c9a5224; i19++) {
            stringBuffer.append('*');
        }
        setText(stringBuffer.toString());
        setSelection(this.f65732x7c9a5224);
        if (this.f65720xa4780c86 && str.length() == this.f65727x6abf7b4c && (onPasswdInputListener = this.f65725x5be0673f) != null) {
            onPasswdInputListener.m122162xc3989e01();
        }
    }

    /* renamed from: getEncryptData */
    public java.lang.String m122153xeed02279(com.p3249xcbb51f6b.p3258x37c99c.C28051xcd51cf72.EncryptMode encryptMode, long j17, java.lang.String str, java.lang.String str2) {
        int i17 = this.f65732x7c9a5224;
        if (i17 >= this.f65728x91e7399e && i17 <= this.f65727x6abf7b4c) {
            byte[] bArr = new byte[i17];
            for (int i18 = 0; i18 < this.f65732x7c9a5224; i18++) {
                bArr[i18] = (byte) (this.f65731x4bae04fb[i18] ^ this.f65730xceac669c[i18]);
            }
            if (i17 >= this.f65728x91e7399e && str != null && j17 != 0) {
                return com.p3249xcbb51f6b.ndk.C28019x9fc852e7.m121897xe6451c20(bArr, str.getBytes(), j17, str2, com.p3249xcbb51f6b.p3258x37c99c.C28051xcd51cf72.AnonymousClass2.f65734x67705c88[encryptMode.ordinal()] != 1 ? 2 : 1);
            }
        }
        return null;
    }

    /* renamed from: getLastError */
    public int m122154x75feee5c() {
        return com.p3249xcbb51f6b.ndk.C28019x9fc852e7.m121898x74627852();
    }

    /* renamed from: getVersion */
    public java.lang.String m122155x52c258a2() {
        return com.p3249xcbb51f6b.ndk.C28019x9fc852e7.m121899x52c258a2();
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        if ((getInputType() & 128) > 0) {
            return;
        }
        super.onCreateContextMenu(contextMenu);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        m122147xd12f8ce7(canvas);
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        m122152xee5c6596(charSequence.toString());
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if ((getInputType() & 128) > 0) {
            return true;
        }
        return super.onTextContextMenuItem(i17);
    }

    /* renamed from: setInputLength */
    public void m122156x5137b98e(int i17, int i18) {
        this.f65728x91e7399e = i17;
        this.f65727x6abf7b4c = i18;
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i18)});
        this.f65720xa4780c86 = i17 == i18;
    }

    /* renamed from: setOnPasswdInputListener */
    public void m122157xc90120ff(com.p3249xcbb51f6b.p3258x37c99c.C28051xcd51cf72.OnPasswdInputListener onPasswdInputListener) {
        this.f65725x5be0673f = onPasswdInputListener;
    }

    public C28051xcd51cf72(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65728x91e7399e = 6;
        this.f65727x6abf7b4c = 6;
        this.f65720xa4780c86 = true;
        this.f65730xceac669c = new byte[32];
        this.f65731x4bae04fb = new byte[32];
        this.f65732x7c9a5224 = 0;
        this.f65729x29fa1dea = false;
        m122149x316510(context, attributeSet);
    }

    public C28051xcd51cf72(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f65728x91e7399e = 6;
        this.f65727x6abf7b4c = 6;
        this.f65720xa4780c86 = true;
        this.f65730xceac669c = new byte[32];
        this.f65731x4bae04fb = new byte[32];
        this.f65732x7c9a5224 = 0;
        this.f65729x29fa1dea = false;
        m122149x316510(context, attributeSet);
    }
}
