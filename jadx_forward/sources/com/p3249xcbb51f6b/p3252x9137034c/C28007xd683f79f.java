package com.p3249xcbb51f6b.p3252x9137034c;

/* renamed from: com.tenpay.bankcard.TenpaySegmentEditText */
/* loaded from: classes9.dex */
public final class C28007xd683f79f extends android.widget.LinearLayout {

    /* renamed from: mTimeStamp */
    private static java.lang.String f62982x7c3d8309;

    /* renamed from: BG_LINE_COLOR */
    private final int f62983x3cd75b72;

    /* renamed from: BG_LINE_HEIGHT */
    private final int f62984x660de6d8;

    /* renamed from: BG_LINE_SIZE */
    private final int f62985x2b47f1f2;
    private final java.lang.String TAG;

    /* renamed from: mContext */
    private android.content.Context f62986xd6cfe882;

    /* renamed from: mEditArray */
    private java.util.List<android.widget.EditText> f62987x9d69482;

    /* renamed from: mEditState */
    com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.EditState f62988xad4e6ba;

    /* renamed from: mKeyboard */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 f62989x43041b74;

    /* renamed from: mNoFocus */
    private boolean f62990x1a7e7a6a;

    /* renamed from: mOnClickListener */
    private android.view.View.OnClickListener f62991x553ffa90;

    /* renamed from: mPaintBg */
    private android.graphics.Paint f62992x6e541416;

    /* renamed from: mPaintSplit */
    private android.graphics.Paint f62993xb42b5a9;

    /* renamed from: com.tenpay.bankcard.TenpaySegmentEditText$EditState */
    /* loaded from: classes6.dex */
    public enum EditState {
        DEFAULT,
        BANKCARD,
        BANKCARD_WITH_TAILNUM
    }

    public C28007xd683f79f(android.content.Context context) {
        this(context, null);
        this.f62986xd6cfe882 = context;
        m121678x316510();
    }

    /* renamed from: drawBackgroundLine */
    private void m121676xb3da4a6(android.graphics.Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float f17 = height - 4;
        canvas.drawRect(0.0f, f17, width, height, this.f62992x6e541416);
        float f18 = f17 - 9.0f;
        int size = this.f62987x9d69482.size();
        canvas.drawRect(0.0f, f18, 4.0f, f17, this.f62992x6e541416);
        int i17 = 0;
        float f19 = 0.0f;
        while (i17 < size) {
            int i18 = i17 == size + (-1) ? -4 : -2;
            float width2 = f19 + this.f62987x9d69482.get(i17).getWidth() + i18;
            canvas.drawRect(width2, f18, width2 + 4.0f, f17, this.f62992x6e541416);
            f19 = width2 - i18;
            i17++;
        }
    }

    /* renamed from: getInputText */
    private java.lang.String m121677x652b8d61() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < this.f62987x9d69482.size(); i17++) {
            stringBuffer.append(this.f62987x9d69482.get(i17).getText().toString());
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2 == null || stringBuffer2.length() == 0) {
            return null;
        }
        stringBuffer2.trim().replaceAll(" ", "");
        return stringBuffer2;
    }

    /* renamed from: init */
    private void m121678x316510() {
        setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        setOrientation(0);
        m121687x6347c2af(true);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f62993xb42b5a9 = paint;
        paint.setStrokeWidth(0.0f);
        this.f62993xb42b5a9.setColor(-7829368);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f62992x6e541416 = paint2;
        paint2.setColor(-11615450);
        this.f62992x6e541416.setStyle(android.graphics.Paint.Style.FILL);
    }

    /* renamed from: setNoSystemInputOnEditText */
    public static void m121680x7dc1d88e(android.widget.EditText editText) {
        try {
            try {
                java.lang.reflect.Method method = android.widget.EditText.class.getMethod("setShowSoftInputOnFocus", java.lang.Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(editText, java.lang.Boolean.FALSE);
            } catch (java.lang.Exception unused) {
                editText.setInputType(0);
            }
        } catch (java.lang.NoSuchMethodException unused2) {
            java.lang.reflect.Method method2 = android.widget.EditText.class.getMethod("setSoftInputShownOnFocus", java.lang.Boolean.TYPE);
            method2.setAccessible(true);
            method2.invoke(editText, java.lang.Boolean.FALSE);
        } catch (java.lang.Exception unused3) {
        }
    }

    /* renamed from: setSalt */
    public static void m121681x764fefd8(java.lang.String str) {
        f62982x7c3d8309 = str;
    }

    /* renamed from: ClearInput */
    public void m121682x49eb759d() {
    }

    /* renamed from: get3DesEncrptData */
    public java.lang.String m121683x7d902dbb() {
        java.lang.String m121677x652b8d61 = m121677x652b8d61();
        if (m121677x652b8d61 == null || m121677x652b8d61.length() == 0) {
            return null;
        }
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        return c28013x36bca45.m121800xea62cd8a(m121677x652b8d61, c28013x36bca45.m121807xce19d7e6());
    }

    /* renamed from: getEncryptDataWithHash */
    public java.lang.String m121684x15a9108d(boolean z17) {
        java.lang.String m121677x652b8d61 = m121677x652b8d61();
        if (m121677x652b8d61 == null || m121677x652b8d61.length() == 0) {
            return null;
        }
        if (z17) {
            m121677x652b8d61 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121663xf830e4e1(m121677x652b8d61);
        }
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        java.lang.String str = f62982x7c3d8309;
        if (str != null) {
            c28013x36bca45.m121808x5d476ab4(str);
        }
        com.p314xaae8f345.mm.p2802xd031a825.b.a().g();
        return c28013x36bca45.m121803x8b1ff279(m121677x652b8d61);
    }

    /* renamed from: getInputLength */
    public int m121685xbad2461a() {
        java.lang.String m121677x652b8d61 = m121677x652b8d61();
        if (m121677x652b8d61 == null) {
            return 0;
        }
        return m121677x652b8d61.length();
    }

    /* renamed from: isMatchPattern */
    public boolean m121686xf3340455(java.lang.String str) {
        if (str != null) {
            try {
                return java.util.regex.Pattern.compile(str).matcher(m121677x652b8d61()).matches();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        m121676xb3da4a6(canvas);
    }

    @Override // android.view.View
    public void setFocusable(boolean z17) {
        com.p3249xcbb51f6b.p3252x9137034c.C28006x77975d46.d("MyTag", "setFocusable " + z17);
        for (int i17 = 0; i17 < this.f62987x9d69482.size(); i17++) {
            android.widget.EditText editText = this.f62987x9d69482.get(i17);
            editText.setFocusable(z17);
            editText.setFocusableInTouchMode(z17);
        }
    }

    /* renamed from: setIsBankcardFormat */
    public void m121687x6347c2af(boolean z17) {
        if (z17) {
            this.f62988xad4e6ba = com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.EditState.BANKCARD;
        } else if (com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.EditState.BANKCARD == this.f62988xad4e6ba) {
            this.f62988xad4e6ba = com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.EditState.DEFAULT;
        }
    }

    /* renamed from: setKeyboard */
    public void m121688x94991269(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a3) {
        this.f62989x43041b74 = c27990xda3033a3;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f62991x553ffa90 = onClickListener;
    }

    /* renamed from: setText */
    public void m121689x765074af(java.lang.String str) {
        m121690x765074af(str, null);
    }

    /* renamed from: setText */
    public void m121690x765074af(java.lang.String str, java.lang.String str2) {
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = c28013x36bca45.m121807xce19d7e6();
        }
        java.lang.String[] split = c28013x36bca45.m121798xe82f2162(str, str2).split("-");
        removeAllViews();
        this.f62990x1a7e7a6a = true;
        this.f62987x9d69482.clear();
        for (int i17 = 0; i17 < split.length; i17++) {
            final android.widget.EditText editText = new android.widget.EditText(this.f62986xd6cfe882);
            editText.setText(split[i17]);
            editText.setMaxLines(1);
            editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(split[i17].length())});
            editText.setGravity(17);
            editText.setInputType(2);
            editText.setBackgroundColor(0);
            editText.setSelectAllOnFocus(true);
            editText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tenpay.bankcard.TenpaySegmentEditText.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.this.f62991x553ffa90 != null) {
                        com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.this.f62991x553ffa90.onClick(view);
                    }
                    if (com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.this.f62990x1a7e7a6a) {
                        com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.this.setFocusable(true);
                        editText.requestFocus();
                        com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.this.f62990x1a7e7a6a = false;
                    }
                }
            });
            m121680x7dc1d88e(editText);
            ((android.view.inputmethod.InputMethodManager) this.f62986xd6cfe882.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 2);
            editText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.bankcard.TenpaySegmentEditText.2
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                    com.p3249xcbb51f6b.p3252x9137034c.C28006x77975d46.d("MyTag", "edit onFocusChange hasFocus=" + z17);
                    if (z17) {
                        if (com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.this.f62991x553ffa90 != null) {
                            com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.this.f62991x553ffa90.onClick(view);
                        }
                        if (com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.this.f62989x43041b74 != null) {
                            com.p3249xcbb51f6b.p3252x9137034c.C28006x77975d46.d("MyTag", "keyboard is not null");
                            com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.this.f62989x43041b74.m121476x53eb72f9(0);
                            com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.this.f62989x43041b74.m121469xce4186ff(editText);
                        }
                    }
                }
            });
            addView(editText, new android.widget.LinearLayout.LayoutParams(-2, -1, split[i17].length()));
            this.f62987x9d69482.add(editText);
        }
        setFocusable(false);
    }

    public C28007xd683f79f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "MyTag";
        this.f62983x3cd75b72 = -11615450;
        this.f62985x2b47f1f2 = 4;
        this.f62984x660de6d8 = 9;
        this.f62991x553ffa90 = null;
        this.f62990x1a7e7a6a = true;
        this.f62988xad4e6ba = com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.EditState.DEFAULT;
        this.f62986xd6cfe882 = null;
        this.f62987x9d69482 = new java.util.ArrayList();
        this.f62989x43041b74 = null;
        this.f62986xd6cfe882 = context;
        m121678x316510();
    }

    /* renamed from: isMatchPattern */
    private boolean m121679xf3340455(java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            try {
                return java.util.regex.Pattern.compile(str2).matcher(str).matches();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }
}
