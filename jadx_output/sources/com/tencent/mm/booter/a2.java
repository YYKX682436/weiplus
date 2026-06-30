package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class a2 implements w11.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.b2 f63302d;

    public a2(com.tencent.mm.booter.b2 b2Var) {
        this.f63302d = b2Var;
    }

    @Override // w11.f0
    public void onCanceled(java.lang.String str) {
        ((com.tencent.mm.booter.j) this.f63302d).a(null);
    }

    @Override // w11.f0
    public void onFinished() {
        ((com.tencent.mm.booter.j) this.f63302d).b();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifySyncMgr", "onGYNetEnd: %d [%d,%d,%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            return;
        }
        onCanceled(null);
    }
}
