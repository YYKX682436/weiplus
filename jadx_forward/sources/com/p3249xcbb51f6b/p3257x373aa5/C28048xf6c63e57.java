package com.p3249xcbb51f6b.p3257x373aa5;

/* renamed from: com.tenpay.view.TenpayKeyboardView */
/* loaded from: classes7.dex */
public class C28048xf6c63e57 extends android.widget.LinearLayout {

    /* renamed from: NUM_KEY_COUNT */
    private static final int f65680x23ac9556 = 10;

    /* renamed from: TOTAL_KEY_COUNT */
    private static final int f65681xbb693394 = 12;

    /* renamed from: deleteImage */
    private android.widget.ImageView f65682xbbe90670;

    /* renamed from: hSplitLines */
    private android.view.View[] f65683xde689e8d;

    /* renamed from: inputView */
    private com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd f65684x65bf118f;

    /* renamed from: keyCodes */
    private int[] f65685x1c51a507;

    /* renamed from: keyDel */
    private android.view.View f65686xbc5ddd2c;

    /* renamed from: keyListener */
    private android.view.View.OnClickListener f65687x4fff833;

    /* renamed from: keyResIds */
    private int[] f65688x86f52937;

    /* renamed from: keyX */
    private android.widget.TextView f65689x322dd9;

    /* renamed from: numKeys */
    private android.widget.TextView[] f65690x88b81a9a;

    /* renamed from: vSplitLines */
    private android.view.View[] f65691x2ea651b;

    public C28048xf6c63e57(android.content.Context context) {
        super(context);
        this.f65690x88b81a9a = new android.widget.TextView[10];
        this.f65691x2ea651b = new android.view.View[6];
        this.f65683xde689e8d = new android.view.View[3];
        this.f65688x86f52937 = new int[12];
        this.f65685x1c51a507 = new int[12];
        this.f65687x4fff833 = new android.view.View.OnClickListener() { // from class: com.tenpay.view.TenpayKeyboardView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.p3249xcbb51f6b.p3257x373aa5.C28048xf6c63e57.this.f65684x65bf118f == null) {
                    return;
                }
                view.getId();
                int id6 = view.getId();
                int i17 = 0;
                for (int i18 = 0; i18 < 12; i18++) {
                    if (id6 == com.p3249xcbb51f6b.p3257x373aa5.C28048xf6c63e57.this.f65688x86f52937[i18]) {
                        i17 = com.p3249xcbb51f6b.p3257x373aa5.C28048xf6c63e57.this.f65685x1c51a507[i18];
                    }
                }
                com.p3249xcbb51f6b.p3257x373aa5.C28048xf6c63e57.this.f65684x65bf118f.dispatchKeyEvent(new android.view.KeyEvent(0, i17));
                com.p3249xcbb51f6b.p3257x373aa5.C28048xf6c63e57.this.f65684x65bf118f.dispatchKeyEvent(new android.view.KeyEvent(1, i17));
            }
        };
        m122101x316510(context);
    }

    /* renamed from: init */
    private void m122101x316510(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(context.getResources().getIdentifier("tenpay_sc_keyboard", "layout", context.getPackageName()), (android.view.ViewGroup) this, true);
        char[] charArray = "0123456789".toCharArray();
        for (int i17 = 0; i17 < 10; i17++) {
            this.f65688x86f52937[i17] = m122104x5db1b11("tenpay_sc_keyboard_" + charArray[i17]);
            this.f65690x88b81a9a[i17] = (android.widget.TextView) inflate.findViewById(this.f65688x86f52937[i17]);
            this.f65690x88b81a9a[i17].setOnClickListener(this.f65687x4fff833);
        }
        this.f65688x86f52937[10] = m122104x5db1b11("tenpay_sc_keyboard_x");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(this.f65688x86f52937[10]);
        this.f65689x322dd9 = textView;
        textView.setOnClickListener(this.f65687x4fff833);
        this.f65688x86f52937[11] = m122104x5db1b11("tenpay_sc_keyboard_del");
        android.view.View findViewById = inflate.findViewById(this.f65688x86f52937[11]);
        this.f65686xbc5ddd2c = findViewById;
        findViewById.setOnClickListener(this.f65687x4fff833);
        this.f65682xbbe90670 = (android.widget.ImageView) inflate.findViewById(m122104x5db1b11("tenpay_sc_keyboard_del_icon"));
        int i18 = 0;
        while (i18 < this.f65691x2ea651b.length) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tenpay_sc_keyboard_split_v");
            int i19 = i18 + 1;
            sb6.append(i19);
            this.f65691x2ea651b[i18] = inflate.findViewById(m122104x5db1b11(sb6.toString()));
            i18 = i19;
        }
        int i27 = 0;
        while (i27 < this.f65683xde689e8d.length) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tenpay_sc_keyboard_split_h");
            int i28 = i27 + 1;
            sb7.append(i28);
            this.f65683xde689e8d[i27] = inflate.findViewById(m122104x5db1b11(sb7.toString()));
            i27 = i28;
        }
        for (int i29 = 0; i29 <= 9; i29++) {
            this.f65685x1c51a507[i29] = i29 + 7;
        }
        int[] iArr = this.f65685x1c51a507;
        iArr[10] = 52;
        iArr[11] = 67;
    }

    /* renamed from: bindInputView */
    public void m122102xba2b81d2(com.p3249xcbb51f6b.p3257x373aa5.C28049x9de490cd c28049x9de490cd) {
        this.f65684x65bf118f = c28049x9de490cd;
    }

    /* renamed from: getDrawableId */
    public int m122103xffdf924f(java.lang.String str) {
        return getContext().getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    /* renamed from: getId */
    public int m122104x5db1b11(java.lang.String str) {
        return getContext().getResources().getIdentifier(str, dm.i4.f66865x76d1ec5a, getContext().getPackageName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: setDeleteBackground */
    public void m122105xa1c6d9bb(android.graphics.drawable.Drawable drawable) {
        this.f65686xbc5ddd2c.setBackground(drawable);
    }

    /* renamed from: setDeleteBackgroundColor */
    public void m122106x18974268(int i17) {
        this.f65686xbc5ddd2c.setBackgroundColor(i17);
    }

    /* renamed from: setDeleteImage */
    public void m122107x2c24c0ae(android.graphics.drawable.Drawable drawable) {
        this.f65682xbbe90670.setImageDrawable(drawable);
    }

    /* renamed from: setExtendBackground */
    public void m122108x7a81546a(android.graphics.drawable.Drawable drawable) {
        this.f65689x322dd9.setBackground(drawable);
    }

    /* renamed from: setExtendBackgroundColor */
    public void m122109xfdf91d19(int i17) {
        this.f65689x322dd9.setBackgroundColor(i17);
    }

    /* renamed from: setExtendChar */
    public void m122110xafa6af92(java.lang.Character ch6) {
        if (ch6 == null) {
            this.f65689x322dd9.setText("");
            this.f65685x1c51a507[10] = 0;
            return;
        }
        this.f65689x322dd9.setText(ch6.toString());
        if (ch6.equals('.')) {
            this.f65685x1c51a507[10] = 56;
        } else if (ch6.equals('X') || ch6.equals('x')) {
            this.f65685x1c51a507[10] = 52;
        }
    }

    /* renamed from: setLineColor */
    public void m122111xef26998d(int i17) {
        int i18 = 0;
        int i19 = 0;
        while (true) {
            android.view.View[] viewArr = this.f65691x2ea651b;
            if (i19 >= viewArr.length) {
                break;
            }
            viewArr[i19].setBackgroundColor(i17);
            i19++;
        }
        while (true) {
            android.view.View[] viewArr2 = this.f65683xde689e8d;
            if (i18 >= viewArr2.length) {
                return;
            }
            viewArr2[i18].setBackgroundColor(i17);
            i18++;
        }
    }

    /* renamed from: setLineWidth */
    public void m122112xf03d97f0(float f17) {
        int i17 = 0;
        int i18 = 0;
        while (true) {
            android.view.View[] viewArr = this.f65691x2ea651b;
            if (i18 >= viewArr.length) {
                break;
            }
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) viewArr[i18].getLayoutParams();
            layoutParams.width = (int) (0.5f + f17);
            this.f65691x2ea651b[i18].setLayoutParams(layoutParams);
            i18++;
        }
        while (true) {
            android.view.View[] viewArr2 = this.f65683xde689e8d;
            if (i17 >= viewArr2.length) {
                return;
            }
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) viewArr2[i17].getLayoutParams();
            layoutParams2.height = (int) (f17 + 0.5f);
            this.f65683xde689e8d[i17].setLayoutParams(layoutParams2);
            i17++;
        }
    }

    /* renamed from: setNumberBackground */
    public void m122113x41b941d9(android.graphics.drawable.Drawable drawable) {
        for (int i17 = 0; i17 < 10; i17++) {
            this.f65690x88b81a9a[i17].setBackground(drawable);
        }
    }

    /* renamed from: setNumberBackgroundColor */
    public void m122114x4b173d0a(int i17) {
        for (int i18 = 0; i18 < 10; i18++) {
            this.f65690x88b81a9a[i18].setBackgroundColor(i17);
        }
    }

    /* renamed from: setTextColor */
    public void m122115x1c5c5ff4(int i17) {
        for (int i18 = 0; i18 < 10; i18++) {
            this.f65690x88b81a9a[i18].setTextColor(i17);
            this.f65689x322dd9.setTextColor(i17);
        }
    }

    /* renamed from: setTextSize */
    public void m122116x3abfd950(float f17) {
        for (int i17 = 0; i17 < 10; i17++) {
            this.f65690x88b81a9a[i17].setTextSize(f17);
            this.f65689x322dd9.setTextSize(f17);
        }
    }

    public C28048xf6c63e57(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65690x88b81a9a = new android.widget.TextView[10];
        this.f65691x2ea651b = new android.view.View[6];
        this.f65683xde689e8d = new android.view.View[3];
        this.f65688x86f52937 = new int[12];
        this.f65685x1c51a507 = new int[12];
        this.f65687x4fff833 = new android.view.View.OnClickListener() { // from class: com.tenpay.view.TenpayKeyboardView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.p3249xcbb51f6b.p3257x373aa5.C28048xf6c63e57.this.f65684x65bf118f == null) {
                    return;
                }
                view.getId();
                int id6 = view.getId();
                int i17 = 0;
                for (int i18 = 0; i18 < 12; i18++) {
                    if (id6 == com.p3249xcbb51f6b.p3257x373aa5.C28048xf6c63e57.this.f65688x86f52937[i18]) {
                        i17 = com.p3249xcbb51f6b.p3257x373aa5.C28048xf6c63e57.this.f65685x1c51a507[i18];
                    }
                }
                com.p3249xcbb51f6b.p3257x373aa5.C28048xf6c63e57.this.f65684x65bf118f.dispatchKeyEvent(new android.view.KeyEvent(0, i17));
                com.p3249xcbb51f6b.p3257x373aa5.C28048xf6c63e57.this.f65684x65bf118f.dispatchKeyEvent(new android.view.KeyEvent(1, i17));
            }
        };
        m122101x316510(context);
    }
}
