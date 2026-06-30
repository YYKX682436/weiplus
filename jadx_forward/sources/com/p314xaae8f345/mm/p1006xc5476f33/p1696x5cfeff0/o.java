package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener f218765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTBaseFunctionListener f218766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode f218767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener f218768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f218769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 f218770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p f218771g;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p pVar, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener iYTReflectListener, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTBaseFunctionListener iYTBaseFunctionListener, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener, android.graphics.SurfaceTexture surfaceTexture, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 b0Var) {
        this.f218771g = pVar;
        this.f218765a = iYTReflectListener;
        this.f218766b = iYTBaseFunctionListener;
        this.f218767c = ytSDKKitFrameworkWorkMode;
        this.f218768d = iYtSDKKitFrameworkEventListener;
        this.f218769e = surfaceTexture;
        this.f218770f = b0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0
    public void a(java.lang.Boolean bool, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var) {
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p pVar = this.f218771g;
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerError", "open camera failed");
            vz2.c.k("openCamera", -1);
            vz2.c.b().B = 1;
            pVar.f218775c.W6(90035, "open camera failed");
            return;
        }
        vz2.c.j("openCamera");
        if (!pVar.f218773a.b(d0Var.f218734d.f529185a, d0Var.f218745o)) {
            vz2.c.k("sdkCamera", -1);
            vz2.c.b().B = 2;
            pVar.f218775c.W6(90013, "init yt camera failed");
            return;
        }
        vz2.c.j("sdkCamera");
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKPlatformContext m120766x76565f86 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120766x76565f86();
        m120766x76565f86.f61794x2116f291 = this.f218765a;
        m120766x76565f86.f61785x46d5cd9d = this.f218766b;
        if (!pVar.f218773a.a(this.f218767c, this.f218768d)) {
            vz2.c.k("sdkFaceType", -1);
            vz2.c.b().B = 2;
            pVar.f218775c.W6(90013, "init yt framework failed");
            return;
        }
        vz2.c.j("sdkFaceType");
        d0Var.f(this.f218769e, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0() { // from class: com.tencent.mm.plugin.flash.o$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0
            public final void a(java.lang.Boolean bool2, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.o.this;
                oVar.getClass();
                if (bool2.booleanValue()) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerError", "camera start preview failed");
                vz2.c.k("openCamera", -1);
                vz2.c.b().B = 1;
                oVar.f218771g.f218775c.W6(90038, "open camera failed");
            }
        });
        android.graphics.Point c17 = d0Var.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "set sdk preview size:%sx%s", java.lang.Integer.valueOf(c17.x), java.lang.Integer.valueOf(c17.y));
        int m120634x2df20051 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27891xef1e7bf0.m120634x2df20051(pVar.f218775c, d0Var.f218745o, 1);
        int i17 = c17.x;
        int i18 = c17.y;
        if (m120634x2df20051 >= 5) {
            i17 = i18;
            i18 = i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "setPreviewRect width:%d,height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        vz2.c.k("detect", i17 + "x" + i18);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120772x2344480a(new android.graphics.Rect(0, 0, i17, i18));
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120770xa86bf129(new android.graphics.Rect(0, 0, i17, i18));
        this.f218770f.a(java.lang.Boolean.TRUE, d0Var);
        vz2.c.m(11);
    }
}
