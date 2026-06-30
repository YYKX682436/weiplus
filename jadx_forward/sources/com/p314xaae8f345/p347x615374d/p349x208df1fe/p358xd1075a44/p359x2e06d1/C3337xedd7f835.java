package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKImageView */
/* loaded from: classes9.dex */
public class C3337xedd7f835 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695 {

    /* renamed from: ImageData */
    private byte[] f13064x43130785;

    /* renamed from: _hellAccFlag_ */
    private byte f13065x7f11beae;

    /* renamed from: scaleType */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3598x7837784 f13068x901157a4;

    /* renamed from: image */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 f13067x5faa95b = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170();

    /* renamed from: defaultImage */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 f13066xd804a39a = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170();

    /* renamed from: tintColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13069x4f219128 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(0, 0);

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKImageView$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$kinda$gen$ScaleType */
        static final /* synthetic */ int[] f13070x7961f2b7;

        static {
            int[] iArr = new int[com.p314xaae8f345.p347x615374d.gen.EnumC3598x7837784.m28358xcee59d22().length];
            f13070x7961f2b7 = iArr;
            try {
                iArr[com.p314xaae8f345.p347x615374d.gen.EnumC3598x7837784.FILL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f13070x7961f2b7[com.p314xaae8f345.p347x615374d.gen.EnumC3598x7837784.ASPECTFIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f13070x7961f2b7[com.p314xaae8f345.p347x615374d.gen.EnumC3598x7837784.ASPECTFILL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f13070x7961f2b7[com.p314xaae8f345.p347x615374d.gen.EnumC3598x7837784.CENTER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: setIconColor */
    private void m26941x7541828(int i17, android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            int i18 = i17 != 0 ? (16777215 & i17) | (-16777216) : i17;
            int alpha = android.graphics.Color.alpha(i17);
            drawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP));
            if (i17 != 0) {
                drawable.setAlpha(alpha);
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: getDarkModeUrl */
    public java.lang.String mo26942xb0f14b40() {
        return this.f13067x5faa95b.m26912x93badde3();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: getDefaultUrl */
    public java.lang.String mo26943x16b3fb64() {
        return this.f13066xd804a39a.mo26918xb5887639();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: getImage */
    public com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 mo26944x74984fa5() {
        return this.f13067x5faa95b;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: getImageData */
    public byte[] mo26945xcb0e58ef() {
        return this.f13064x43130785;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: getScaleType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3598x7837784 mo26946x8f7ec8ee() {
        return this.f13068x901157a4;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: getTintColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26947x4e8f0272() {
        return this.f13069x4f219128;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: getUrl */
    public java.lang.String mo26948xb5887639() {
        return this.f13067x5faa95b.mo26918xb5887639();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setCornerRadius */
    public void mo26281xba0484c9(float f17) {
        super.mo26281xba0484c9(f17);
        if (!(mo27110xfb86a31b() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) || mo26261x755bd410() <= 0.0f) {
            return;
        }
        mo27110xfb86a31b().m75394x3288e7c1(true);
        mo27110xfb86a31b().m75395x7083e041(f17 / mo26261x755bd410());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: setDarkModeUrl */
    public void mo26949x4756beb4(java.lang.String str) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 m26909x2eaf75 = this.f13067x5faa95b.m26909x2eaf75();
        m26909x2eaf75.mo26922x4756beb4(str);
        mo26951x53266a19(m26909x2eaf75);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: setDefaultUrl */
    public void mo26950x44d84970(java.lang.String str) {
        if (this.f13066xd804a39a == null) {
            this.f13066xd804a39a = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170();
        }
        this.f13066xd804a39a.mo26928xca029dad(str);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 c3336xac2d8170 = this.f13067x5faa95b;
        if ((c3336xac2d8170 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c3336xac2d8170.mo26918xb5887639())) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f13066xd804a39a.mo26918xb5887639())) {
            if (this.f13066xd804a39a.m26921xd03c7e17()) {
                mo27110xfb86a31b().m75396xca029dad(this.f13066xd804a39a.mo26918xb5887639());
            } else {
                mo27110xfb86a31b().setImageBitmap(this.f13066xd804a39a.m26911x12501425());
            }
        }
        mo26281xba0484c9(2.0f);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: setImage */
    public void mo26951x53266a19(com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 interfaceC3471x84332fd0) {
        if (interfaceC3471x84332fd0 == null || !(interfaceC3471x84332fd0 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170)) {
            return;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 c3336xac2d8170 = this.f13067x5faa95b;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 c3336xac2d81702 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) interfaceC3471x84332fd0;
        this.f13067x5faa95b = c3336xac2d81702;
        if (c3336xac2d81702.m26921xd03c7e17()) {
            if (c3336xac2d8170 == null || c3336xac2d8170.mo26918xb5887639() == null || this.f13067x5faa95b.mo26918xb5887639() == null || !c3336xac2d8170.mo26918xb5887639().equals(this.f13067x5faa95b.mo26918xb5887639())) {
                mo27110xfb86a31b().setImageDrawable(null);
                mo27110xfb86a31b().m75396xca029dad(this.f13067x5faa95b.mo26918xb5887639());
            }
        } else if (this.f13067x5faa95b.m26911x12501425() != null) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), this.f13067x5faa95b.m26911x12501425());
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13069x4f219128) != 0) {
                bitmapDrawable.setColorFilter((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13069x4f219128), android.graphics.PorterDuff.Mode.SRC_ATOP);
                m26941x7541828((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13069x4f219128), bitmapDrawable);
            }
            mo27110xfb86a31b().setImageDrawable(bitmapDrawable);
        } else if (this.f13067x5faa95b.m26913x4a96be14() != null) {
            android.graphics.drawable.Drawable m26913x4a96be14 = this.f13067x5faa95b.m26913x4a96be14();
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13069x4f219128) != 0) {
                m26913x4a96be14.setColorFilter((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13069x4f219128), android.graphics.PorterDuff.Mode.SRC_ATOP);
                m26941x7541828((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13069x4f219128), m26913x4a96be14);
            }
            mo27110xfb86a31b().setImageDrawable(m26913x4a96be14);
        }
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: setImageData */
    public void mo26952x27621963(byte[] bArr) {
        if (bArr != null) {
            this.f13064x43130785 = bArr;
            int length = bArr.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(bArr);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/MMKImageView", "setImageData", "([B)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/kinda/framework/widget/base/MMKImageView", "setImageData", "([B)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            mo26288xf84e829(decodeByteArray.getHeight());
            mo27110xfb86a31b().setImageBitmap(decodeByteArray);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: setScaleType */
    public void mo26953xebd28962(com.p314xaae8f345.p347x615374d.gen.EnumC3598x7837784 enumC3598x7837784) {
        this.f13068x901157a4 = enumC3598x7837784;
        int i17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3337xedd7f835.AnonymousClass1.f13070x7961f2b7[enumC3598x7837784.ordinal()];
        if (i17 == 1) {
            mo27110xfb86a31b().setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        } else if (i17 == 2) {
            mo27110xfb86a31b().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else if (i17 == 3) {
            mo27110xfb86a31b().setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        } else if (i17 == 4) {
            mo27110xfb86a31b().setScaleType(android.widget.ImageView.ScaleType.CENTER);
        }
        mo26970x380a4f2b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: setTintColor */
    public void mo26954xaae2c2e6(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f13069x4f219128) != com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)) {
            this.f13069x4f219128 = c3392x2ae78284;
            android.graphics.drawable.Drawable drawable = mo27110xfb86a31b().getDrawable();
            if (drawable != null) {
                drawable.setColorFilter((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13069x4f219128), android.graphics.PorterDuff.Mode.SRC_ATOP);
                m26941x7541828((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.f13069x4f219128), drawable);
                mo27110xfb86a31b().setImageDrawable(drawable);
            }
            mo26970x380a4f2b();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3472xd49f7695
    /* renamed from: setUrl */
    public void mo26955xca029dad(java.lang.String str) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 m26909x2eaf75 = this.f13067x5faa95b.m26909x2eaf75();
        m26909x2eaf75.mo26926x23389b6d(str, this.f13069x4f219128);
        mo26951x53266a19(m26909x2eaf75);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 mo26107x519d71c1(android.content.Context context) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913(context, null);
        c19659x677e0913.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        c19659x677e0913.setAdjustViewBounds(true);
        c19659x677e0913.m75397xc185581c(true);
        c19659x677e0913.m75392xb52e7fa7(com.p314xaae8f345.mm.p2802xd031a825.f.a());
        this.f13067x5faa95b.m26924x1cf594f3(false);
        this.f13066xd804a39a.m26924x1cf594f3(false);
        c19659x677e0913.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        return c19659x677e0913;
    }
}
