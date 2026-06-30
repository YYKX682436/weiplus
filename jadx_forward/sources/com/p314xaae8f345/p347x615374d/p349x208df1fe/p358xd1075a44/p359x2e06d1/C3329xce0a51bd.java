package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKButton */
/* loaded from: classes9.dex */
public class C3329xce0a51bd extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3296x6bc4e37f> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d {
    public static final java.lang.String TAG = "MMKView.MMKButton";

    /* renamed from: accessibilityString */
    private java.lang.String f12973x54175aff;

    /* renamed from: disabledImage */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 f12975xe87eac3f;

    /* renamed from: horizontalPadding */
    private long f12977x1b08174d;

    /* renamed from: impl */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3296x6bc4e37f f12978x316220;

    /* renamed from: normalImage */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 f12981xef35f4b4;

    /* renamed from: pressedImage */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 f12983xdf205259;

    /* renamed from: selectedImage */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 f12985x55982f80;

    /* renamed from: textFontName */
    private java.lang.String f12987x5cb67c7;

    /* renamed from: textSize */
    private float f12991xc42d3ace;

    /* renamed from: verticalPadding */
    private long f12992xf8c53bbb;

    /* renamed from: textSelectedColor */
    private long f12990x87c2315b = -1;

    /* renamed from: textNormalColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f12988x7022cf4f = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(-1, 0);

    /* renamed from: textPressedColor */
    private long f12989x8597162e = -1;

    /* renamed from: textDisabledColor */
    private long f12986x1aa8ae1a = -1;

    /* renamed from: selectedColor */
    private long f12984x5544b588 = -1;

    /* renamed from: normalColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f12980xeee27abc = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(-1, 0);

    /* renamed from: pressedColor */
    private long f12982xdeccd861 = -1;

    /* renamed from: disabledColor */
    private long f12974xe82b3247 = -1;

    /* renamed from: isEnableHighlight */
    private boolean f12979x81967be7 = true;

    /* renamed from: fontStyle */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 f12976xa38e7aa2 = com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.REGULAR;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKButton$BackgroundColorDrawable */
    /* loaded from: classes9.dex */
    public static class BackgroundColorDrawable extends android.graphics.drawable.Drawable {

        /* renamed from: color */
        private int f12993x5a72f63;

        public BackgroundColorDrawable(int i17) {
            this.f12993x5a72f63 = i17;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            canvas.drawColor(this.f12993x5a72f63);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            int i17 = this.f12993x5a72f63;
            if (i17 == 0) {
                return -2;
            }
            return android.graphics.Color.alpha(i17) > 0 ? -3 : -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i17) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        }
    }

    /* renamed from: updateBackgroundWithColor */
    private void m26773x701fb926() {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        if (this.f12979x81967be7 && this.f12982xdeccd861 >= 0) {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3329xce0a51bd.BackgroundColorDrawable(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(this.f12982xdeccd861)));
        }
        if (this.f12984x5544b588 >= 0) {
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3329xce0a51bd.BackgroundColorDrawable(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(this.f12984x5544b588)));
        }
        if (this.f12974xe82b3247 >= 0) {
            stateListDrawable.addState(new int[]{-16842910}, new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3329xce0a51bd.BackgroundColorDrawable(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(this.f12974xe82b3247)));
        }
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f12980xeee27abc) >= 0) {
            stateListDrawable.addState(new int[0], new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3329xce0a51bd.BackgroundColorDrawable(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12980xeee27abc))));
        }
        m27113xd5656b5(stateListDrawable);
    }

    /* renamed from: updateBackgroundWithImage */
    private void m26774x7073331e() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 c3336xac2d8170;
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        if (this.f12979x81967be7 && (c3336xac2d8170 = this.f12983xdf205259) != null && !c3336xac2d8170.m26921xd03c7e17()) {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.f12983xdf205259.m26913x4a96be14());
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 c3336xac2d81702 = this.f12985x55982f80;
        if (c3336xac2d81702 != null && !c3336xac2d81702.m26921xd03c7e17()) {
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, this.f12985x55982f80.m26913x4a96be14());
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 c3336xac2d81703 = this.f12975xe87eac3f;
        if (c3336xac2d81703 != null && !c3336xac2d81703.m26921xd03c7e17()) {
            stateListDrawable.addState(new int[]{-16842910}, this.f12975xe87eac3f.m26913x4a96be14());
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 c3336xac2d81704 = this.f12981xef35f4b4;
        if (c3336xac2d81704 != null && !c3336xac2d81704.m26921xd03c7e17()) {
            stateListDrawable.addState(new int[0], this.f12981xef35f4b4.m26913x4a96be14());
        }
        mo27110xfb86a31b().m26389x706225d7(stateListDrawable);
    }

    /* renamed from: updateTextColor */
    private void m26775x875e76d() {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12988x7022cf4f) >= 0 || this.f12990x87c2315b >= 0 || this.f12989x8597162e >= 0 || this.f12986x1aa8ae1a >= 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (this.f12990x87c2315b >= 0) {
                arrayList.add(new int[]{android.R.attr.state_selected});
                arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(this.f12990x87c2315b)));
            }
            if (this.f12979x81967be7 && this.f12989x8597162e >= 0) {
                arrayList.add(new int[]{android.R.attr.state_pressed});
                arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(this.f12989x8597162e)));
            }
            if (this.f12986x1aa8ae1a >= 0) {
                arrayList.add(new int[]{-16842910});
                arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(this.f12986x1aa8ae1a)));
            }
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12988x7022cf4f) >= 0) {
                arrayList.add(new int[0]);
                arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12988x7022cf4f))));
            }
            int size = arrayList2.size();
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = ((java.lang.Integer) arrayList2.get(i17)).intValue();
            }
            int[][] iArr2 = new int[arrayList.size()];
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                iArr2[i18] = (int[]) arrayList.get(i18);
            }
            mo27110xfb86a31b().m26392x1c5c5ff4(new android.content.res.ColorStateList(iArr2, iArr));
        }
    }

    /* renamed from: updateTypeface */
    private void m26776xb95fc80() {
        java.lang.String str = this.f12987x5cb67c7;
        if (str != null) {
            int i17 = str.equalsIgnoreCase("WeChat-Sans-SS-Light") ? 2 : this.f12987x5cb67c7.equalsIgnoreCase("WeChat-Sans-SS-Medium") ? 0 : this.f12987x5cb67c7.equalsIgnoreCase("WeChat-Sans-SS-Regular") ? 3 : this.f12987x5cb67c7.equalsIgnoreCase("WeChat-Sans-SS-Bold") ? 1 : -1;
            if (i17 != -1) {
                try {
                    mo27110xfb86a31b().m26384xd8fd5d9().setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.E(i17)));
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                    return;
                }
            }
        }
        if (this.f12976xa38e7aa2 == com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.REGULAR) {
            mo27110xfb86a31b().m26384xd8fd5d9().setTypeface(null, 0);
        } else {
            mo27110xfb86a31b().m26384xd8fd5d9().setTypeface(null, 1);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getDisableColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26777x24a23fd1() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getDisableTextColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26778xd19c57a4() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getDisabledImage */
    public com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 mo26779xa5de6889() {
        return this.f12975xe87eac3f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getEnable */
    public boolean mo26780x17ac4879() {
        return mo27110xfb86a31b().isEnabled();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getExpandHitHeight */
    public long mo26781xaa0bb6ea() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getExpandHitWidth */
    public long mo26782x37ddc3a3() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getFontStyle */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 mo26783xa2fbebec() {
        return this.f12976xa38e7aa2;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getHorizontalPadding */
    public long mo26784x6e3c9e97() {
        return this.f12977x1b08174d;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getNormalColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26785xc8b8c186() {
        return this.f12980xeee27abc;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getNormalImage */
    public com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 mo26786xc90c3b7e() {
        return this.f12981xef35f4b4;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getPressedImage */
    public com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 mo26787x4012e4cf() {
        return this.f12983xdf205259;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getSelectedImage */
    public com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 mo26788x12f7ebca() {
        return this.f12985x55982f80;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getText */
    public java.lang.String mo26789xfb85ada3() {
        if (mo27110xfb86a31b().m26385xfb85ada3() != null) {
            return mo27110xfb86a31b().m26385xfb85ada3().toString();
        }
        return null;
    }

    /* renamed from: getTextFont */
    public java.lang.String m26790x4001a492() {
        return this.f12987x5cb67c7;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getTextNormalColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26791x5484a119() {
        return this.f12988x7022cf4f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getTextSize */
    public float mo26792x40077844() {
        return this.f12991xc42d3ace;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: getVerticalPadding */
    public long mo26793xdd270d85() {
        return this.f12992xf8c53bbb;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setDisableColor */
    public void mo26794x5aeb3add(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        long m27193xc76aa86a = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(c3392x2ae78284);
        if (this.f12974xe82b3247 == m27193xc76aa86a) {
            return;
        }
        this.f12974xe82b3247 = m27193xc76aa86a;
        m26773x701fb926();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setDisableTextColor */
    public void mo26795x7598ecb0(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        long m27193xc76aa86a = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(c3392x2ae78284);
        if (this.f12986x1aa8ae1a == m27193xc76aa86a) {
            return;
        }
        this.f12986x1aa8ae1a = m27193xc76aa86a;
        m26775x875e76d();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setDisabledImage */
    public void mo26796x38b4cefd(com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 interfaceC3471x84332fd0) {
        if (interfaceC3471x84332fd0 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) {
            this.f12975xe87eac3f = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) interfaceC3471x84332fd0;
            m26774x7073331e();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setEnable */
    public void mo26797xae17c85(boolean z17) {
        mo27110xfb86a31b().setEnabled(z17);
        mo27110xfb86a31b().m26390x7b888007(z17);
        m26775x875e76d();
        mo27110xfb86a31b().setClickable(z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setEnableHighLight */
    public void mo26283x6c46858f(boolean z17) {
        this.f12979x81967be7 = z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setExpandHitHeight */
    public void mo26798xe0e2505e(long j17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setExpandHitWidth */
    public void mo26799xffd42baf(long j17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setFontStyle */
    public void mo26800xff4fac60(com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 enumC3399x1b009a82) {
        this.f12976xa38e7aa2 = enumC3399x1b009a82;
        m26776xb95fc80();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setHorizontalPadding */
    public void mo26801x49d2ab0b(long j17) {
        this.f12977x1b08174d = j17;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3322x9e38a27f m26384xd8fd5d9 = mo27110xfb86a31b().m26384xd8fd5d9();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) m26384xd8fd5d9.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = i65.a.a(this.f13206xd6cfe882, (float) this.f12977x1b08174d);
            layoutParams.rightMargin = i65.a.a(this.f13206xd6cfe882, (float) this.f12977x1b08174d);
            m26384xd8fd5d9.setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setMinWidth */
    public void mo26304x24915916(float f17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3296x6bc4e37f mo27110xfb86a31b = mo27110xfb86a31b();
        if (mo27110xfb86a31b != null) {
            mo27110xfb86a31b.f12752x914a89a6 = false;
        }
        super.mo26304x24915916(f17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setNormalColor */
    public void mo26802x5f1e34fa(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12980xeee27abc) == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "MMKButton[" + mo26789xfb85ada3() + "] setNormalColor设置相同值。");
            return;
        }
        this.f12980xeee27abc = c3392x2ae78284;
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(c3392x2ae78284) != 0) {
            this.f12982xdeccd861 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27183x534eeba8(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(c3392x2ae78284), 436207616L);
            if (this.f12974xe82b3247 == -1) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27196x28caef29()) {
                    this.f12974xe82b3247 = java.lang.Long.parseLong("14FFFFFF", 16);
                } else {
                    this.f12974xe82b3247 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27183x534eeba8(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(c3392x2ae78284), 2583691263L);
                }
            }
        }
        m26773x701fb926();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "MMKButton[" + mo26789xfb85ada3() + "] setNormalColor设置完成后，normalColor：" + this.f12980xeee27abc + "，pressedColor：" + this.f12982xdeccd861 + "，disabledColor：" + this.f12974xe82b3247);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setNormalImage */
    public void mo26803x5f71aef2(com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 interfaceC3471x84332fd0) {
        if (interfaceC3471x84332fd0 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) {
            this.f12981xef35f4b4 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) interfaceC3471x84332fd0;
            m26774x7073331e();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setPressedImage */
    public void mo26804x765bdfdb(com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 interfaceC3471x84332fd0) {
        if (interfaceC3471x84332fd0 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) {
            this.f12983xdf205259 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) interfaceC3471x84332fd0;
            m26774x7073331e();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setSelectedImage */
    public void mo26805xa5ce523e(com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 interfaceC3471x84332fd0) {
        if (interfaceC3471x84332fd0 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) {
            this.f12985x55982f80 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) interfaceC3471x84332fd0;
            m26774x7073331e();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setText */
    public void mo26806x765074af(java.lang.String str) {
        if (str != null) {
            mo27110xfb86a31b().m26391x765074af(str);
        }
    }

    /* renamed from: setTextFont */
    public void m26807x3aba059e(java.lang.String str) {
        if (str != null) {
            this.f12987x5cb67c7 = str;
            mo27110xfb86a31b().m26393x3aba059e(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), str));
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setTextNormalColor */
    public void mo26808x8b5b3a8d(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12988x7022cf4f) != com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27190xf794c2a7(c3392x2ae78284, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType.MMKButtonText)) {
            this.f12988x7022cf4f = c3392x2ae78284;
            long m27193xc76aa86a = (153.0f << 24) | (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(c3392x2ae78284) & 16777215);
            this.f12989x8597162e = m27193xc76aa86a;
            if (this.f12986x1aa8ae1a == -1) {
                this.f12986x1aa8ae1a = m27193xc76aa86a;
            }
            java.lang.Long.toString(m27193xc76aa86a);
            java.lang.Long.toString(this.f12986x1aa8ae1a);
            java.lang.Long.toHexString(this.f12989x8597162e);
            java.lang.Long.toHexString(this.f12986x1aa8ae1a);
            m26775x875e76d();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setTextSize */
    public void mo26809x3abfd950(float f17) {
        if (f17 > 0.0f) {
            this.f12991xc42d3ace = f17 * (mo26252x34575f87() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : 1.0f);
            mo27110xfb86a31b().m26394x3abfd950(1, this.f12991xc42d3ace);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3430xf6ba6f5d
    /* renamed from: setVerticalPadding */
    public void mo26810x13fda6f9(long j17) {
        this.f12992xf8c53bbb = j17;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3322x9e38a27f m26384xd8fd5d9 = mo27110xfb86a31b().m26384xd8fd5d9();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) m26384xd8fd5d9.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.topMargin = i65.a.a(this.f13206xd6cfe882, (float) this.f12992xf8c53bbb);
            layoutParams.bottomMargin = i65.a.a(this.f13206xd6cfe882, (float) this.f12992xf8c53bbb);
            m26384xd8fd5d9.setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3296x6bc4e37f mo26107x519d71c1(android.content.Context context) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3296x6bc4e37f c3296x6bc4e37f = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3296x6bc4e37f(context);
        c3296x6bc4e37f.setClickable(true);
        c3296x6bc4e37f.setEnabled(true);
        return c3296x6bc4e37f;
    }
}
