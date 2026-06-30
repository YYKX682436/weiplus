package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class s implements com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f218711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 f218712b;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809, android.graphics.SurfaceTexture surfaceTexture) {
        this.f218712b = textureViewSurfaceTextureListenerC15532xe9ad4809;
        this.f218711a = surfaceTexture;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0
    public void a(java.lang.Boolean bool, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var) {
        if (!bool.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "open camera failed");
            vz2.c.k("openCamera", -1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = this.f218712b;
            textureViewSurfaceTextureListenerC15532xe9ad4809.f218611s.a7(textureViewSurfaceTextureListenerC15532xe9ad4809.d(90035, i65.a.r(textureViewSurfaceTextureListenerC15532xe9ad4809.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7m)));
            return;
        }
        vz2.c.j("openCamera");
        if (!this.f218712b.f218612t.b(d0Var.f218734d.f529185a, d0Var.f218745o)) {
            vz2.c.k("sdkCamera", -1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad48092 = this.f218712b;
            textureViewSurfaceTextureListenerC15532xe9ad48092.f218611s.a7(textureViewSurfaceTextureListenerC15532xe9ad48092.d(90013, i65.a.r(textureViewSurfaceTextureListenerC15532xe9ad48092.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7m)));
            return;
        }
        vz2.c.j("sdkCamera");
        int i17 = (int) (com.p314xaae8f345.mm.ui.bl.b(this.f218712b.getContext()).x * 0.27f * 2.0f);
        int b17 = (int) (i17 * d0Var.b());
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKPlatformContext m120766x76565f86 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120766x76565f86();
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad48093 = this.f218712b;
        m120766x76565f86.f61785x46d5cd9d = textureViewSurfaceTextureListenerC15532xe9ad48093;
        m120766x76565f86.f61794x2116f291 = textureViewSurfaceTextureListenerC15532xe9ad48093;
        if (!textureViewSurfaceTextureListenerC15532xe9ad48093.f218612t.a(textureViewSurfaceTextureListenerC15532xe9ad48093.f218616x, textureViewSurfaceTextureListenerC15532xe9ad48093)) {
            vz2.c.k("sdkFaceType", -1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad48094 = this.f218712b;
            textureViewSurfaceTextureListenerC15532xe9ad48094.f218611s.a7(textureViewSurfaceTextureListenerC15532xe9ad48094.d(90013, i65.a.r(textureViewSurfaceTextureListenerC15532xe9ad48094.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7q)));
            return;
        }
        vz2.c.j("sdkFaceType");
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.p(this, i17, b17));
        d0Var.f(this.f218711a, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.q(this));
        android.graphics.Point c17 = d0Var.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "set sdk preview size:%sx%s", java.lang.Integer.valueOf(c17.x), java.lang.Integer.valueOf(c17.y));
        int m120634x2df20051 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27891xef1e7bf0.m120634x2df20051(this.f218712b.getContext(), d0Var.f218745o, 1);
        int i18 = c17.x;
        int i19 = c17.y;
        if (m120634x2df20051 >= 5) {
            i19 = i18;
            i18 = i19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "setPreviewRect width:%d,height:%d，enableCopyData：%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(this.f218712b.F));
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120772x2344480a(new android.graphics.Rect(0, 0, i18, i19));
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120770xa86bf129(new android.graphics.Rect(0, 0, i18, i19));
        this.f218712b.f218615w.b(d0Var.f218734d.c());
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad48095 = this.f218712b;
        if (textureViewSurfaceTextureListenerC15532xe9ad48095.P) {
            android.content.Context context = textureViewSurfaceTextureListenerC15532xe9ad48095.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0.class);
            android.hardware.Camera.Parameters c18 = d0Var.f218734d.c();
            if (j0Var.f218682e) {
                j0Var.f218681d.d(c18);
            }
            android.content.Context context2 = this.f218712b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0 j0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0.class);
            if (j0Var2.f218682e) {
                j0Var2.f218681d.e();
            }
        }
        d0Var.e(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.r(this, c17));
    }
}
