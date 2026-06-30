package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKLabelView */
/* loaded from: classes9.dex */
public class C3338xfdf6594e extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.TextView> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae {

    /* renamed from: ellipsize */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3395xd41eda6d f13071x5cacba8d;

    /* renamed from: richText */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4 f13074xa3855429;

    /* renamed from: textFontName */
    private java.lang.String f13077x5cb67c7;

    /* renamed from: textAlign */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 f13075xc07d95d8 = com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.LEFT;

    /* renamed from: maxLength */
    private int f13073xd0d4316a = -1;

    /* renamed from: textColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13076xc09b2e36 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(-1, 0);

    /* renamed from: fontStyle */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 f13072xa38e7aa2 = com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.REGULAR;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKLabelView$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$kinda$gen$Ellipsize */
        static final /* synthetic */ int[] f13078x45fd55a0;

        /* renamed from: $SwitchMap$com$tencent$kinda$gen$TextAlign */
        static final /* synthetic */ int[] f13079xa9ce30eb;

        static {
            int[] iArr = new int[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.m28388xcee59d22().length];
            f13079xa9ce30eb = iArr;
            try {
                iArr[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f13079xa9ce30eb[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f13079xa9ce30eb[com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.p314xaae8f345.p347x615374d.gen.EnumC3395xd41eda6d.m27445xcee59d22().length];
            f13078x45fd55a0 = iArr2;
            try {
                iArr2[com.p314xaae8f345.p347x615374d.gen.EnumC3395xd41eda6d.TAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f13078x45fd55a0[com.p314xaae8f345.p347x615374d.gen.EnumC3395xd41eda6d.HEAD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f13078x45fd55a0[com.p314xaae8f345.p347x615374d.gen.EnumC3395xd41eda6d.MIDDLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: updateTypeface */
    private void m26957xb95fc80() {
        java.lang.String str = this.f13077x5cb67c7;
        if (str != null) {
            int i17 = str.equalsIgnoreCase("WeChat-Sans-SS-Light") ? 2 : this.f13077x5cb67c7.equalsIgnoreCase("WeChat-Sans-SS-Medium") ? 0 : this.f13077x5cb67c7.equalsIgnoreCase("WeChat-Sans-SS-Regular") ? 3 : this.f13077x5cb67c7.equalsIgnoreCase("WeChat-Sans-SS-Bold") ? 1 : this.f13077x5cb67c7.equalsIgnoreCase("WeChat-Sans-Std-Medium") ? 4 : this.f13077x5cb67c7.equalsIgnoreCase("WeChat-Sans-Std-Light") ? 6 : this.f13077x5cb67c7.equalsIgnoreCase("WeChat-Sans-Std-Bold") ? 5 : this.f13077x5cb67c7.equalsIgnoreCase("WeChat-Sans-Std-Regular") ? 7 : -1;
            if (i17 != -1) {
                try {
                    mo27110xfb86a31b().setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.E(i17)));
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                    mo27110xfb86a31b().setTypeface(null, 0);
                    return;
                }
            }
        }
        com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 enumC3399x1b009a82 = this.f13072xa38e7aa2;
        if (enumC3399x1b009a82 == com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.BOLD) {
            mo27110xfb86a31b().setTypeface(null, 1);
        } else if (enumC3399x1b009a82 == com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.MEDIUM) {
            com.p314xaae8f345.mm.ui.bk.r0(mo27110xfb86a31b().getPaint(), 0.8f);
        } else {
            mo27110xfb86a31b().setTypeface(null, 0);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getAdjustsFontSizeToFitWidth */
    public boolean mo26958xb98cd80e() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getBaselineAdjustment */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3385xb7b3cc73 mo26959xc231bf88() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getEllipsize */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3395xd41eda6d mo26960x5c1a2bd7() {
        return this.f13071x5cacba8d;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getFontStyle */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 mo26961xa2fbebec() {
        return this.f13072xa38e7aa2;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getLineSpacingFactor */
    public float mo26962x6629df28() {
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getLines */
    public int mo26963x74c0f549() {
        return mo27110xfb86a31b().getLineCount();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getMaxLength */
    public int mo26964xd041a2b4() {
        return this.f13073xd0d4316a;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getText */
    public java.lang.String mo26965xfb85ada3() {
        java.lang.CharSequence text = mo27110xfb86a31b().getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getTextAlign */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 mo26966xbfeb0722() {
        return this.f13075xc07d95d8;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getTextColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26967xc0089f80() {
        return this.f13076xc09b2e36;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getTextFont */
    public java.lang.String mo26968x4001a492() {
        return this.f13077x5cb67c7;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: getTextSize */
    public float mo26969x40077844() {
        return i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) mo27110xfb86a31b().getTextSize());
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: notifyChanged */
    public void mo26970x380a4f2b() {
        super.mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setAdjustsFontSizeToFitWidth */
    public void mo26971x3593082(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setBaselineAdjustment */
    public void mo26972x595d4194(com.p314xaae8f345.p347x615374d.gen.EnumC3385xb7b3cc73 enumC3385xb7b3cc73) {
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setClickable */
    public void mo26280xe6a688a0(boolean z17) {
        super.mo26280xe6a688a0(z17);
        mo27110xfb86a31b().setEnabled(z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setEllipsize */
    public void mo26973xb86dec4b(com.p314xaae8f345.p347x615374d.gen.EnumC3395xd41eda6d enumC3395xd41eda6d) {
        this.f13071x5cacba8d = enumC3395xd41eda6d;
        int i17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3338xfdf6594e.AnonymousClass1.f13078x45fd55a0[enumC3395xd41eda6d.ordinal()];
        if (i17 == 1) {
            mo27110xfb86a31b().setEllipsize(android.text.TextUtils.TruncateAt.END);
        } else if (i17 == 2) {
            mo27110xfb86a31b().setEllipsize(android.text.TextUtils.TruncateAt.START);
        } else if (i17 == 3) {
            mo27110xfb86a31b().setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        }
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setFontStyle */
    public void mo26974xff4fac60(com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 enumC3399x1b009a82) {
        this.f13072xa38e7aa2 = enumC3399x1b009a82;
        m26957xb95fc80();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setLineSpacingFactor */
    public void mo26975x41bfeb9c(float f17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setLines */
    public void mo26976x534f0fbd(int i17) {
        if (i17 > 0) {
            mo27110xfb86a31b().setMaxLines(i17);
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setMaxLength */
    public void mo26977x2c956328(int i17) {
        if (i17 >= 0) {
            this.f13073xd0d4316a = i17;
            mo27110xfb86a31b().setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f13073xd0d4316a)});
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setText */
    public void mo26978x765074af(java.lang.String str) {
        if (str != null) {
            android.widget.TextView mo27110xfb86a31b = mo27110xfb86a31b();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            float textSize = mo27110xfb86a31b().getTextSize();
            ((ke0.e) xVar).getClass();
            mo27110xfb86a31b.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setTextAlign */
    public void mo26979x1c3ec796(com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 enumC3607x37efb5b8) {
        if (enumC3607x37efb5b8 != null) {
            this.f13075xc07d95d8 = enumC3607x37efb5b8;
            int gravity = mo27110xfb86a31b().getGravity();
            int i17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3338xfdf6594e.AnonymousClass1.f13079xa9ce30eb[this.f13075xc07d95d8.ordinal()];
            if (i17 == 1) {
                mo27110xfb86a31b().setGravity(gravity | 3);
            } else if (i17 == 2) {
                mo27110xfb86a31b().setGravity(17);
            } else {
                if (i17 != 3) {
                    return;
                }
                mo27110xfb86a31b().setGravity(5);
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setTextColor */
    public void mo26980x1c5c5ff4(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f13076xc09b2e36 = c3392x2ae78284;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType mMViewType = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.MMViewType.MMKLabelViewText;
        java.lang.Integer.toHexString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27190xf794c2a7(c3392x2ae78284, mMViewType)));
        mo27110xfb86a31b().setTextColor(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27190xf794c2a7(c3392x2ae78284, mMViewType)));
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setTextFont */
    public void mo26981x3aba059e(java.lang.String str) {
        if (str != null) {
            this.f13077x5cb67c7 = str;
            m26957xb95fc80();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3475xe4bdd7ae
    /* renamed from: setTextSize */
    public void mo26982x3abfd950(float f17) {
        if (f17 > 0.0f) {
            mo27110xfb86a31b().setTextSize(1, f17 * (mo26252x34575f87() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : 1.0f));
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.TextView mo26107x519d71c1(android.content.Context context) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3321x652bc3bf c3321x652bc3bf = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3321x652bc3bf(context);
        c3321x652bc3bf.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
        c3321x652bc3bf.setGravity(19);
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27196x28caef29()) {
            c3321x652bc3bf.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            this.f13076xc09b2e36 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(java.lang.Long.parseLong("E6000000", 16), java.lang.Long.parseLong("CCFFFFFF", 16));
        }
        return c3321x652bc3bf;
    }
}
