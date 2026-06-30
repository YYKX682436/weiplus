package com.tencent.mm.modelavatar;

/* loaded from: classes12.dex */
public class u0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f70545d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f70546e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f70547f;

    /* renamed from: g, reason: collision with root package name */
    public final int f70548g;

    /* renamed from: h, reason: collision with root package name */
    public final int f70549h;

    /* renamed from: i, reason: collision with root package name */
    public java.io.OutputStream f70550i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f70551m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f70552n;

    public u0(java.lang.String str) {
        this.f70546e = str;
        if (com.tencent.mm.storage.z3.H3(str)) {
            this.f70546e = com.tencent.mm.storage.z3.Y4(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetHDHeadImg", "init Headimage in_username:" + str + " out_username" + this.f70546e);
        this.f70548g = kv.f0.c();
        this.f70549h = kv.f0.c();
        this.f70547f = "jpg";
    }

    public static void I(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelavatar.z Ai = com.tencent.mm.modelavatar.d1.Ai();
        Ai.getClass();
        try {
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
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
            Ai.u(str2, com.tencent.mm.sdk.platformtools.x.J(str, options), 156, 156, 1);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public final void H() {
        try {
            java.io.OutputStream outputStream = this.f70550i;
            if (outputStream != null) {
                outputStream.flush();
                this.f70550i.close();
                this.f70550i = null;
            }
        } catch (java.io.IOException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetHDHeadImg", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        super.cancel();
        H();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r17, com.tencent.mm.modelbase.u0 r18) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelavatar.u0.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 158;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r9, int r10, int r11, java.lang.String r12, com.tencent.mm.network.v0 r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelavatar.u0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 10;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        java.lang.String str = this.f70546e;
        return (str == null || str.length() == 0) ? com.tencent.mm.modelbase.o1.EFailed : com.tencent.mm.modelbase.o1.EOk;
    }
}
