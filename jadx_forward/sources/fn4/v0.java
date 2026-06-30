package fn4;

/* loaded from: classes15.dex */
public class v0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.z0 f346147d;

    public v0(fn4.z0 z0Var) {
        this.f346147d = z0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "onSceneEnd, errType: %s, errCode: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), m1Var);
        if (!m1Var.equals(this.f346147d.f346167d)) {
            if (m1Var.equals(this.f346147d.f346168e)) {
                gm0.j1.d().q(1943, this.f346147d.f346169f);
                this.f346147d.f346168e = null;
                sm4.h hVar = (sm4.h) m1Var;
                if (i17 == 0 && i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "onSceneEnd relevantVideoNetScene %s", ((r45.s97) hVar.f491477e.f152244b.f152233a).f467120f);
                    ((ku5.t0) ku5.t0.f394148d).h(new fn4.u0(this, hVar), "TopStory.DecodeRelevantResult");
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "requestRelVideo failed!, errType:%s, errCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    uu4.a.a(2);
                    return;
                }
            }
            return;
        }
        gm0.j1.d().q(1943, this.f346147d.f346169f);
        fn4.z0 z0Var = this.f346147d;
        z0Var.f346167d = null;
        sm4.k kVar = (sm4.k) m1Var;
        if (i17 == 0 && i18 == 0) {
            fn4.y0 y0Var = new fn4.y0(z0Var, null);
            y0Var.f346158d = ((r45.s97) kVar.f491490e.f152244b.f152233a).f467120f;
            y0Var.f346159e = kVar.f491491f.f469046s == 0;
            ((ku5.t0) ku5.t0.f394148d).h(y0Var, "TopStory.DecodeRecommendResultTask");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch page failed!, response json: %s", ((r45.s97) kVar.f491490e.f152244b.f152233a).f467120f);
        uu4.a.a(2);
        this.f346147d.f346164a.A4(-1, str);
        this.f346147d.f346165b = false;
    }
}
