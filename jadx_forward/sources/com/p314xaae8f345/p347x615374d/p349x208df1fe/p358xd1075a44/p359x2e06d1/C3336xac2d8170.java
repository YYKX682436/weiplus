package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKImage */
/* loaded from: classes9.dex */
public class C3336xac2d8170 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 {

    /* renamed from: PATTERN_FILE */
    private static final java.lang.String f13047x800854eb = "file://";

    /* renamed from: PATTERN_HTTP */
    private static final java.lang.String f13048x800967f7 = "http://";

    /* renamed from: PATTERN_HTTPS */
    private static final java.lang.String f13049x8123973c = "https://";

    /* renamed from: lightImage */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo f13051xf25841e5 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo();

    /* renamed from: darkImage */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo f13050x90620385 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo();

    /* renamed from: getImage */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo m26907x74984fa5() {
        return (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f13050x90620385.url)) ? this.f13051xf25841e5 : this.f13050x90620385;
    }

    /* renamed from: setIconColor */
    private void m26908x7541828(int i17) {
        m26907x74984fa5().m26938x7541828(i17);
    }

    /* renamed from: copy */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 m26909x2eaf75() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 c3336xac2d8170 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo imageInfo = this.f13051xf25841e5;
        if (imageInfo != null) {
            c3336xac2d8170.f13051xf25841e5 = imageInfo.m26931x2eaf75();
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo imageInfo2 = this.f13050x90620385;
        if (imageInfo2 != null) {
            c3336xac2d8170.f13050x90620385 = imageInfo2.m26931x2eaf75();
        }
        return c3336xac2d8170;
    }

    /* renamed from: drawableTint */
    public void m26910x2556c8b9(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        m26907x74984fa5().m26932x2556c8b9(c3392x2ae78284);
    }

    /* renamed from: getBitmap */
    public android.graphics.Bitmap m26911x12501425() {
        return m26907x74984fa5().m26933x12501425();
    }

    /* renamed from: getDarkUrl */
    public java.lang.String m26912x93badde3() {
        return this.f13050x90620385.url;
    }

    /* renamed from: getDrawable */
    public android.graphics.drawable.Drawable m26913x4a96be14() {
        return m26907x74984fa5().m26934x4a96be14();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: getHeight */
    public float mo26914x1c4fb41d() {
        return m26907x74984fa5().m26935x1c4fb41d();
    }

    /* renamed from: getInputHeight */
    public float m26915xb3fc9c5b() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo imageInfo = this.f13051xf25841e5;
        if (imageInfo == null) {
            return 0.0f;
        }
        return imageInfo.f13056xda265591;
    }

    /* renamed from: getInputWidth */
    public float m26916x4071ec12() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo imageInfo = this.f13051xf25841e5;
        if (imageInfo == null) {
            return 0.0f;
        }
        return imageInfo.f13057x5231341c;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: getSupportDynamicSize */
    public boolean mo26917x34575f87() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: getUrl */
    public java.lang.String mo26918xb5887639() {
        return m26907x74984fa5().url;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: getWidth */
    public float mo26919x755bd410() {
        return m26907x74984fa5().m26936x755bd410();
    }

    /* renamed from: isNeedGetNetworkImageImmediately */
    public boolean m26920xa0e457bb() {
        return m26907x74984fa5().f13062x761da3f1;
    }

    /* renamed from: isNetworkImage */
    public boolean m26921xd03c7e17() {
        return m26907x74984fa5().f13058xd03c7e17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: setDarkModeUrl */
    public void mo26922x4756beb4(java.lang.String str) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo imageInfo = this.f13050x90620385;
        imageInfo.url = str;
        imageInfo.m26937x6581ab3();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: setEmoticonContent */
    public void mo26923xb4183651(java.lang.String str, int i17, int i18, boolean z17) {
    }

    /* renamed from: setNeedGetNetworkImageImmediately */
    public void m26924x1cf594f3(boolean z17) {
        this.f13051xf25841e5.f13062x761da3f1 = z17;
        this.f13050x90620385.f13062x761da3f1 = z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: setSupportDynamicSize */
    public void mo26925xcb82e193(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: setSvgUrl */
    public void mo26926x23389b6d(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        m26907x74984fa5().m26939x23389b6d(str, c3392x2ae78284);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: setUrl */
    public void mo26928xca029dad(java.lang.String str) {
        if (str.equals("PaidDetail_WeChatPay.png")) {
            return;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo imageInfo = this.f13051xf25841e5;
        imageInfo.url = str;
        imageInfo.m26937x6581ab3();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: stretchImage */
    public void mo26929x70e36d56(float f17, float f18) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0
    /* renamed from: setSvgUrl */
    public void mo26927x23389b6d(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284, com.p314xaae8f345.p347x615374d.gen.C3525x44836ec c3525x44836ec) {
        m26907x74984fa5().m26940x23389b6d(str, c3392x2ae78284, c3525x44836ec);
    }

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKImage$ImageInfo */
    /* loaded from: classes9.dex */
    public static class ImageInfo {

        /* renamed from: _hellAccFlag_ */
        private byte f13052x7f11beae;

        /* renamed from: drawable */
        android.graphics.drawable.Drawable f13053xcebc809e;

        /* renamed from: imageBitmap */
        android.graphics.Bitmap f13055x640cd66a;

        /* renamed from: isSvgUrl */
        boolean f13059xf3193635;

        /* renamed from: localResId */
        int f13060x4cf73530;

        /* renamed from: mSvgColor */
        private int f13061xe4eb86ec;
        java.lang.String url;

        /* renamed from: width */
        float f13063x6be2dc6 = -1.0f;

        /* renamed from: height */
        float f13054xb7389127 = -1.0f;

        /* renamed from: isNetworkImage */
        boolean f13058xd03c7e17 = false;

        /* renamed from: needGetNetworkImageImmediately */
        boolean f13062x761da3f1 = false;

        /* renamed from: inputWidth */
        float f13057x5231341c = 0.0f;

        /* renamed from: inputHeight */
        float f13056xda265591 = 0.0f;

        /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
        /* renamed from: getImageFromNet */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private android.graphics.Bitmap m26930x612e562e(java.lang.String r6) {
            /*
                r5 = this;
                boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
                r1 = 0
                if (r0 != 0) goto L54
                java.lang.String r0 = "http://"
                boolean r0 = r6.startsWith(r0)
                java.lang.String r2 = "GET"
                r3 = 20000(0x4e20, float:2.8026E-41)
                r4 = 10000(0x2710, float:1.4013E-41)
                if (r0 == 0) goto L2f
                com.tencent.mm.network.h2 r6 = com.p314xaae8f345.mm.p971x6de15a2e.n.d(r6, r1)
                r6.g(r4)
                r6.k(r3)
                r6.c(r2)
                int r0 = r6.f()
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L4c
                java.io.InputStream r6 = r6.mo48349xc7995ab4()
                goto L4d
            L2f:
                java.lang.String r0 = "https://"
                boolean r0 = r6.startsWith(r0)
                if (r0 == 0) goto L4c
                com.tencent.mm.network.k2 r0 = new com.tencent.mm.network.k2
                r0.<init>(r6)
                javax.net.ssl.HttpsURLConnection r6 = r0.f153593a
                r6.setConnectTimeout(r4)
                r6.setReadTimeout(r3)
                r6.setRequestMethod(r2)
                java.io.InputStream r6 = r6.getInputStream()
                goto L4d
            L4c:
                r6 = r1
            L4d:
                if (r6 == 0) goto L54
                android.graphics.Bitmap r6 = com.p314xaae8f345.mm.p786x600aa8b.e.f(r6)
                return r6
            L54:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo.m26930x612e562e(java.lang.String):android.graphics.Bitmap");
        }

        /* renamed from: copy */
        public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo m26931x2eaf75() {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo imageInfo = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.ImageInfo();
            imageInfo.url = this.url;
            imageInfo.f13055x640cd66a = this.f13055x640cd66a;
            imageInfo.f13053xcebc809e = this.f13053xcebc809e;
            imageInfo.f13063x6be2dc6 = this.f13063x6be2dc6;
            imageInfo.f13054xb7389127 = this.f13054xb7389127;
            imageInfo.f13059xf3193635 = this.f13059xf3193635;
            imageInfo.f13061xe4eb86ec = this.f13061xe4eb86ec;
            imageInfo.f13058xd03c7e17 = this.f13058xd03c7e17;
            imageInfo.f13062x761da3f1 = this.f13062x761da3f1;
            imageInfo.f13057x5231341c = this.f13057x5231341c;
            imageInfo.f13056xda265591 = this.f13056xda265591;
            return imageInfo;
        }

        /* renamed from: drawableTint */
        public void m26932x2556c8b9(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
            android.graphics.drawable.Drawable drawable = this.f13053xcebc809e;
            if (drawable == null || c3392x2ae78284 == null) {
                return;
            }
            drawable.setColorFilter((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284), android.graphics.PorterDuff.Mode.SRC_ATOP);
            this.f13061xe4eb86ec = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284);
        }

        /* renamed from: getBitmap */
        public android.graphics.Bitmap m26933x12501425() {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.url) && this.f13055x640cd66a == null && !this.f13058xd03c7e17) {
                m26937x6581ab3();
            }
            return this.f13055x640cd66a;
        }

        /* renamed from: getDrawable */
        public android.graphics.drawable.Drawable m26934x4a96be14() {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.url) && ((this.f13055x640cd66a == null || this.f13053xcebc809e == null) && !this.f13058xd03c7e17)) {
                m26937x6581ab3();
            }
            if (this.f13055x640cd66a != null) {
                return new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), this.f13055x640cd66a);
            }
            if (this.f13053xcebc809e == null) {
                return null;
            }
            m26938x7541828(this.f13061xe4eb86ec);
            return this.f13053xcebc809e;
        }

        /* renamed from: getHeight */
        public float m26935x1c4fb41d() {
            if (this.f13055x640cd66a != null) {
                return r0.getHeight();
            }
            return 0.0f;
        }

        /* renamed from: getWidth */
        public float m26936x755bd410() {
            if (this.f13055x640cd66a != null) {
                return r0.getWidth();
            }
            return 0.0f;
        }

        /* renamed from: parse */
        public void m26937x6581ab3() {
            int m27370x7513c025;
            java.lang.String str = this.url;
            if (str == null) {
                return;
            }
            if (str.startsWith(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.f13047x800854eb)) {
                this.f13055x640cd66a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(this.url.replaceFirst(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.f13047x800854eb, ""));
            } else if (this.url.startsWith(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.f13048x800967f7) || this.url.startsWith(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170.f13049x8123973c)) {
                this.f13058xd03c7e17 = true;
                if (this.f13062x761da3f1) {
                    try {
                        this.f13055x640cd66a = m26930x612e562e(this.url);
                    } catch (java.lang.Exception unused) {
                        this.f13055x640cd66a = null;
                    }
                }
            } else {
                int m27366xffdf924f = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.m27366xffdf924f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.url);
                this.f13060x4cf73530 = m27366xffdf924f;
                if ((m27366xffdf924f == 0 || this.f13059xf3193635) && (m27370x7513c025 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.m27370x7513c025(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.url, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463)) != 0) {
                    this.f13060x4cf73530 = m27370x7513c025;
                }
                android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                int i17 = this.f13060x4cf73530;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(resources);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/MMKImage$ImageInfo", "parse", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.e(obj, decodeResource, "com/tencent/kinda/framework/widget/base/MMKImage$ImageInfo", "parse", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                this.f13055x640cd66a = decodeResource;
                if (decodeResource == null) {
                    try {
                        this.f13053xcebc809e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(this.f13060x4cf73530);
                    } catch (android.content.res.Resources.NotFoundException unused2) {
                        this.f13053xcebc809e = null;
                    }
                }
            }
            if (this.f13055x640cd66a != null) {
                this.f13063x6be2dc6 = r0.getWidth();
                this.f13054xb7389127 = this.f13055x640cd66a.getHeight();
            }
        }

        /* renamed from: setIconColor */
        public void m26938x7541828(int i17) {
            if (this.f13053xcebc809e != null) {
                int i18 = i17 != 0 ? (16777215 & i17) | (-16777216) : i17;
                int alpha = android.graphics.Color.alpha(i17);
                this.f13053xcebc809e.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP));
                if (i17 != 0) {
                    this.f13053xcebc809e.setAlpha(alpha);
                }
            }
        }

        /* renamed from: setSvgUrl */
        public void m26939x23389b6d(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
            this.f13059xf3193635 = true;
            this.url = str;
            m26937x6581ab3();
            if (this.f13053xcebc809e == null || c3392x2ae78284 == null) {
                return;
            }
            m26938x7541828((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284));
            this.f13061xe4eb86ec = (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284);
        }

        /* renamed from: setSvgUrl */
        public void m26940x23389b6d(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284, com.p314xaae8f345.p347x615374d.gen.C3525x44836ec c3525x44836ec) {
            this.f13057x5231341c = c3525x44836ec.m28149x755bd410();
            this.f13056xda265591 = c3525x44836ec.m28148x1c4fb41d();
            m26939x23389b6d(str, c3392x2ae78284);
        }
    }
}
