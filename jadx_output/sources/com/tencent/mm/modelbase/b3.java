package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class b3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.c3 f70593d;

    public b3(com.tencent.mm.modelbase.c3 c3Var) {
        this.f70593d = c3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.modelbase.c3 c3Var = this.f70593d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c3Var.f70597e.isCanceled());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c3Var.f70597e.hashCode());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c3Var.f70602m.f70713d);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.RunCgi", "Warning: Never should go here. usr canceled:%b Or NetsceneQueue Not call onGYNetEnd! %d func:%d time:%d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c3Var.f70598f));
        if (c3Var.f70597e.isCanceled() || c3Var.f70599g == 1) {
            return false;
        }
        c3Var.f70599g = 2;
        com.tencent.mm.modelbase.z2.a(c3Var.f70603n, c3Var.f70604o, 3, -1, "", c3Var.f70602m, c3Var.f70597e);
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|protectNotCallback";
    }
}
