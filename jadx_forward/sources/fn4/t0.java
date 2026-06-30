package fn4;

/* loaded from: classes4.dex */
public class t0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm4.e f346142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.z0 f346143e;

    public t0(fn4.z0 z0Var, sm4.e eVar) {
        this.f346143e = z0Var;
        this.f346142d = eVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if ((m1Var instanceof sm4.e) && m1Var.equals(this.f346142d)) {
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            this.f346142d.getClass();
            d17.q(2579, this);
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch videourl failed!, errType %s, errCode %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                return;
            }
            r45.bl5 bl5Var = (r45.bl5) ((sm4.e) m1Var).f491469e.f152244b.f152233a;
            ((ku5.t0) ku5.t0.f394148d).g(new fn4.s0(this, bl5Var));
        }
    }
}
