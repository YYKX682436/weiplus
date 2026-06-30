package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class u2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f221281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f221282e;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.z2 z2Var, sd.b bVar, q80.d0 d0Var) {
        this.f221281d = bVar;
        this.f221282e = d0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898 c10755xa1fef898 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) obj;
        sd.b bVar = this.f221281d;
        if (c10755xa1fef898 != null) {
            long j17 = c10755xa1fef898.f149938d;
            if (j17 >= 0) {
                q80.d0 d0Var = this.f221282e;
                if (j17 > 0) {
                    d0Var.f442196o = j17;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).f488143d, d0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.t2(this));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiOpenLiteApp", "Open LiteApp fail");
        bVar.c("fail", null);
    }
}
