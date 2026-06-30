package k14;

/* loaded from: classes4.dex */
public class w0 implements wu5.h, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hq f384928d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f384929e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f384930f;

    /* renamed from: g, reason: collision with root package name */
    public long f384931g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k14.x0 f384932h;

    public w0(k14.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hq hqVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f384932h = x0Var;
        this.f384928d = hqVar;
        this.f384929e = countDownLatch;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "load_unfamiliar_contact";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnfamiliarContactEngine", "[onSceneEnd] errType:%s errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            this.f384929e.countDown();
        } else if (m1Var.mo808xfb85f7b0() == 292) {
            this.f384930f = m1Var;
            ((ku5.t0) ku5.t0.f394148d).g(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6207x9eca7391 c6207x9eca7391 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6207x9eca7391();
        c6207x9eca7391.f136458g.f88048a = this.f384930f;
        c6207x9eca7391.e();
        am.f00 f00Var = c6207x9eca7391.f136459h;
        int i17 = f00Var.f88156a;
        java.util.List list = f00Var.f88157b;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(list == null);
        objArr[2] = java.lang.Integer.valueOf(list != null ? ((java.util.LinkedList) list).size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "[callback] state:%s,tagList is null?%s,tagList size:%s", objArr);
        k14.x0 x0Var = this.f384932h;
        if (i17 == 1) {
            if (this.f384928d != null) {
                x0Var.f384939e.mo77785xc570fb34(new k14.u0(this));
            }
            x0Var.f384939e.mo50297x7c4d7ca2(new k14.v0(this), 30000L);
        } else {
            if (list != null) {
                x0Var.f384944j.addAll(list);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "[AsyncGetSnsTagInfo] %sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f384931g));
            this.f384929e.countDown();
        }
    }
}
