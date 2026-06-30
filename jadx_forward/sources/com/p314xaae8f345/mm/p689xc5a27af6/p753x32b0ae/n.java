package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes8.dex */
public class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f148755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f148756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148757f;

    public n(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, q80.f0 f0Var, q80.d0 d0Var, android.content.Context context) {
        this.f148755d = f0Var;
        this.f148756e = d0Var;
        this.f148757f = context;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898 c10755xa1fef898 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) obj;
        q80.f0 f0Var = this.f148755d;
        if (c10755xa1fef898 != null) {
            long j17 = c10755xa1fef898.f149938d;
            if (j17 >= 0) {
                q80.d0 d0Var = this.f148756e;
                if (j17 > 0) {
                    d0Var.f442196o = j17;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(this.f148757f, d0Var, f0Var);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppFeatureService", "Open LiteApp fail");
        f0Var.mo555x2fd71e();
    }
}
