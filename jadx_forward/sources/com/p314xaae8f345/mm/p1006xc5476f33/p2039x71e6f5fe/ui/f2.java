package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes12.dex */
public class f2 implements e04.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f241080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 f241081b;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6, java.lang.String str) {
        this.f241081b = textureViewSurfaceTextureListenerC17306x32f4bae6;
        this.f241080a = str;
    }

    @Override // e04.q2
    public void a(java.lang.String str, e04.r2 r2Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6 = this.f241081b;
        if (str.equals(textureViewSurfaceTextureListenerC17306x32f4bae6.f240901y)) {
            long currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - textureViewSurfaceTextureListenerC17306x32f4bae6.P[1]);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 c6797x4bb2039 = textureViewSurfaceTextureListenerC17306x32f4bae6.N;
            c6797x4bb2039.f141281g = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "upload img cost %d", java.lang.Long.valueOf(c6797x4bb2039.f141281g));
            c6797x4bb2039.f141287m = c6797x4bb2039.b("FileID", r2Var.f327613b, true);
            c6797x4bb2039.f141288n = c6797x4bb2039.b("AesKey", r2Var.f327614c, true);
            int i17 = r2Var.f327612a;
            java.lang.String str2 = this.f241080a;
            if (i17 == -21009 || i17 == -21000) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.c2(this));
                c6797x4bb2039.f141280f = 3L;
            } else if (i17 != 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.e2(this));
                c6797x4bb2039.f141280f = 3L;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(r2Var.f327613b, r2Var.f327614c)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.a2(this));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "fileId %s", r2Var.f327613b);
                gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e0(textureViewSurfaceTextureListenerC17306x32f4bae6.G, (int) com.p314xaae8f345.mm.vfs.w6.k(str2), r2Var.f327613b, r2Var.f327614c, 1, 2));
            }
            if (textureViewSurfaceTextureListenerC17306x32f4bae6.H != 1 || textureViewSurfaceTextureListenerC17306x32f4bae6.M == 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("delete tmp path %s", str2);
            com.p314xaae8f345.mm.vfs.w6.h(str2);
        }
    }
}
