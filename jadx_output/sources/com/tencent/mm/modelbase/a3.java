package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class a3 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.c3 f70589d;

    public a3(com.tencent.mm.modelbase.c3 c3Var) {
        this.f70589d = c3Var;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.c3 c3Var = this.f70589d;
        if (c3Var.f70599g == 0) {
            c3Var.f70601i.d();
            c3Var.f70599g = 1;
            com.tencent.mm.modelbase.z2.a(c3Var.f70603n, c3Var.f70604o, i18, i19, str, c3Var.f70602m, c3Var.f70597e);
        } else {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c3Var.f70597e.hashCode());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c3Var.f70602m.f70713d);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.w("MicroMsg.RunCgi", "Has been callback by protect:%d func:%d time:%d [%d,%d,%s]", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c3Var.f70598f), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        }
        c3Var.f70596d.onSceneEnd(i18, i19, str, c3Var.f70597e);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c3Var.f70597e.hashCode());
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c3Var.f70602m.f70713d);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.RunCgi", "onGYNetEnd:%d func:%d time:%d [%d,%d,%s]", valueOf3, valueOf4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c3Var.f70598f), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
    }
}
