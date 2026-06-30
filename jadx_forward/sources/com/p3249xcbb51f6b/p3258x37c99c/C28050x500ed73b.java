package com.p3249xcbb51f6b.p3258x37c99c;

/* renamed from: com.tenpay.wphk.HkWxKeyboardWindow */
/* loaded from: classes7.dex */
public class C28050x500ed73b extends android.widget.LinearLayout {

    /* renamed from: X_MODE_CHARACTER */
    public static final int f65706x441e3a34 = 1;

    /* renamed from: X_MODE_DOT */
    public static final int f65707x86cf494 = 2;

    /* renamed from: X_MODE_NONE */
    public static final int f65708x536292d = 0;

    /* renamed from: mContext */
    private android.content.Context f65709xd6cfe882;

    /* renamed from: mInputEditText */
    private android.widget.EditText f65710xd9196cd4;

    /* renamed from: mKeyD */
    private android.widget.RelativeLayout f65711x623a3d2;

    /* renamed from: mKeys */
    private android.widget.TextView[] f65712x623a401;

    /* renamed from: mOnTouchListener */
    private com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.OnTouchListener f65713x80f36d47;

    /* renamed from: mXMode */
    private int f65714xbefcfdce;

    /* renamed from: com.tenpay.wphk.HkWxKeyboardWindow$OnTouchListener */
    /* loaded from: classes7.dex */
    public interface OnTouchListener {
        /* renamed from: onTouch */
        boolean m122146xb05cb4a0(android.view.View view, android.view.MotionEvent motionEvent);
    }

    public C28050x500ed73b(android.content.Context context) {
        super(context);
        this.f65714xbefcfdce = 0;
        this.f65712x623a401 = new android.widget.TextView[11];
        m122138x316510(context);
    }

    /* renamed from: init */
    private void m122138x316510(android.content.Context context) {
        this.f65709xd6cfe882 = context.getApplicationContext();
        com.p3249xcbb51f6b.p3258x37c99c.C28053x5d737a8a.m122164x316510(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(this.f65709xd6cfe882.getResources().getIdentifier(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.f62761x542c3650, "layout", this.f65709xd6cfe882.getPackageName()), (android.view.ViewGroup) this, true);
        this.f65712x623a401[1] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_1"));
        this.f65712x623a401[2] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_2"));
        this.f65712x623a401[3] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_3"));
        this.f65712x623a401[4] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_4"));
        this.f65712x623a401[5] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_5"));
        this.f65712x623a401[6] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_6"));
        this.f65712x623a401[7] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_7"));
        this.f65712x623a401[8] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_8"));
        this.f65712x623a401[9] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_9"));
        this.f65712x623a401[10] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_x"));
        int i17 = 0;
        this.f65712x623a401[0] = (android.widget.TextView) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_0"));
        this.f65711x623a3d2 = (android.widget.RelativeLayout) inflate.findViewById(m122140x5db1b11("tenpay_keyboard_d"));
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tenpay.wphk.HkWxKeyboardWindow.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.f65710xd9196cd4 == null) {
                    return;
                }
                if (view.getId() != com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_x")) {
                    int i18 = view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_1") ? 8 : view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_2") ? 9 : view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_3") ? 10 : view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_4") ? 11 : view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_5") ? 12 : view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_6") ? 13 : view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_7") ? 14 : view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_8") ? 15 : view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_9") ? 16 : view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_0") ? 7 : view.getId() == com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.m122140x5db1b11("tenpay_keyboard_d") ? 67 : 0;
                    com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.f65710xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(0, i18));
                    com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.f65710xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(1, i18));
                    return;
                }
                int i19 = com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.f65714xbefcfdce;
                if (i19 != 1) {
                    if (i19 != 2) {
                        return;
                    }
                    com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.f65710xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(0, 56));
                } else {
                    com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.f65710xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(0, 59));
                    com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.f65710xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(0, 52));
                    com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.this.f65710xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(1, 59));
                }
            }
        };
        for (int i18 = 0; i18 <= 9; i18++) {
            this.f65712x623a401[i18].setContentDescription(java.lang.String.valueOf(i18));
        }
        this.f65712x623a401[10].setContentDescription("字母X");
        this.f65711x623a3d2.setContentDescription("删除");
        while (true) {
            android.widget.TextView[] textViewArr = this.f65712x623a401;
            if (i17 >= textViewArr.length) {
                this.f65711x623a3d2.setOnClickListener(onClickListener);
                return;
            } else {
                textViewArr[i17].setOnClickListener(onClickListener);
                i17++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.OnTouchListener onTouchListener = this.f65713x80f36d47;
            if (onTouchListener != null) {
                onTouchListener.m122146xb05cb4a0(this, motionEvent);
            }
        } catch (java.lang.Throwable unused) {
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getDrawableId */
    public int m122139xffdf924f(java.lang.String str) {
        return this.f65709xd6cfe882.getResources().getIdentifier(str, "drawable", this.f65709xd6cfe882.getPackageName());
    }

    /* renamed from: getId */
    public int m122140x5db1b11(java.lang.String str) {
        return this.f65709xd6cfe882.getResources().getIdentifier(str, dm.i4.f66865x76d1ec5a, this.f65709xd6cfe882.getPackageName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p3249xcbb51f6b.p3258x37c99c.C28053x5d737a8a.m122163x5cd39ffa();
    }

    /* renamed from: resetSecureAccessibility */
    public void m122141xa24be148() {
        int i17 = 0;
        while (true) {
            android.widget.TextView[] textViewArr = this.f65712x623a401;
            if (i17 >= textViewArr.length) {
                this.f65711x623a3d2.setAccessibilityDelegate(null);
                return;
            } else {
                textViewArr[i17].setAccessibilityDelegate(null);
                i17++;
            }
        }
    }

    /* renamed from: setInputEditText */
    public void m122142xce4186ff(android.widget.EditText editText) {
        if (editText != null) {
            this.f65710xd9196cd4 = editText;
            int imeOptions = editText.getImeOptions();
            java.lang.CharSequence imeActionLabel = this.f65710xd9196cd4.getImeActionLabel();
            if (!android.text.TextUtils.isEmpty(imeActionLabel)) {
                this.f65712x623a401[10].setText(imeActionLabel);
            }
            if (imeOptions != 1) {
                return;
            }
            this.f65714xbefcfdce = 0;
            if (android.text.TextUtils.isEmpty(imeActionLabel)) {
                this.f65712x623a401[10].setText("");
            }
        }
    }

    /* renamed from: setOnTouchListener */
    public void m122143xcc7da8b2(com.p3249xcbb51f6b.p3258x37c99c.C28050x500ed73b.OnTouchListener onTouchListener) {
        this.f65713x80f36d47 = onTouchListener;
    }

    /* renamed from: setSecureAccessibility */
    public void m122144x2408cb55(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        int i17 = 0;
        while (true) {
            android.widget.TextView[] textViewArr = this.f65712x623a401;
            if (i17 >= textViewArr.length) {
                this.f65711x623a3d2.setAccessibilityDelegate(accessibilityDelegate);
                return;
            } else {
                textViewArr[i17].setAccessibilityDelegate(accessibilityDelegate);
                i17++;
            }
        }
    }

    /* renamed from: setXMode */
    public void m122145x53eb72f9(int i17) {
        this.f65714xbefcfdce = i17;
        android.widget.TextView textView = this.f65712x623a401[10];
        if (i17 == 0) {
            textView.setText("");
            textView.setBackgroundResource(m122139xffdf924f("tenpay_keybtn_bottom_new"));
        } else if (i17 == 1) {
            textView.setText("X");
            textView.setBackgroundResource(m122139xffdf924f("tenpay_keybtn_bottom_new"));
        } else if (i17 != 2) {
            this.f65714xbefcfdce = 0;
        } else {
            textView.setText(".");
            textView.setBackgroundResource(m122139xffdf924f("tenpay_keybtn_bottom_new"));
        }
    }

    public C28050x500ed73b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65714xbefcfdce = 0;
        this.f65712x623a401 = new android.widget.TextView[11];
        m122138x316510(context);
    }
}
