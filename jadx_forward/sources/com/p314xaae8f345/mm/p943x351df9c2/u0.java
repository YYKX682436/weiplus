package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes12.dex */
public class u0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152078d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f152079e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f152080f;

    /* renamed from: g, reason: collision with root package name */
    public final int f152081g;

    /* renamed from: h, reason: collision with root package name */
    public final int f152082h;

    /* renamed from: i, reason: collision with root package name */
    public java.io.OutputStream f152083i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f152084m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f152085n;

    public u0(java.lang.String str) {
        this.f152079e = str;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(str)) {
            this.f152079e = com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetHDHeadImg", "init Headimage in_username:" + str + " out_username" + this.f152079e);
        this.f152081g = kv.f0.c();
        this.f152082h = kv.f0.c();
        this.f152080f = "jpg";
    }

    public static void I(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p943x351df9c2.z Ai = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai();
        Ai.getClass();
        try {
            android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
            int i17 = n07.outWidth;
            int i18 = n07.outHeight;
            if (i18 < i17) {
                int i19 = (i17 * 156) / i18;
            } else {
                int i27 = (i18 * 156) / i17;
            }
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
            options.inSampleSize = 1;
            Ai.u(str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options), 156, 156, 1);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarStorage", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public final void H() {
        try {
            java.io.OutputStream outputStream = this.f152083i;
            if (outputStream != null) {
                outputStream.flush();
                this.f152083i.close();
                this.f152083i = null;
            }
        } catch (java.io.IOException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetHDHeadImg", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        super.mo9408xae7a2e7a();
        H();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s r17, com.p314xaae8f345.mm.p944x882e457a.u0 r18) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p943x351df9c2.u0.mo807x6c193ac1(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 158;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r9, int r10, int r11, java.lang.String r12, com.p314xaae8f345.mm.p971x6de15a2e.v0 r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p943x351df9c2.u0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        java.lang.String str = this.f152079e;
        return (str == null || str.length() == 0) ? com.p314xaae8f345.mm.p944x882e457a.o1.EFailed : com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
