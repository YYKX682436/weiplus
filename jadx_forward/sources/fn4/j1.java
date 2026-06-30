package fn4;

/* loaded from: classes15.dex */
public class j1 implements t21.i0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yn6 f346092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.l1 f346093e;

    public j1(fn4.l1 l1Var, fn4.d1 d1Var) {
        this.f346093e = l1Var;
    }

    @Override // t21.i0
    public void a(java.lang.String str, int i17, int i18) {
        r45.yn6 yn6Var = this.f346092d;
        if (yn6Var == null || i17 + i18 > yn6Var.f472777e) {
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().p(str, i17, i18, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0151  */
    @Override // t21.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn4.j1.b(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // t21.i0
    public void c(java.lang.String str) {
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().g(str, null);
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
    }

    @Override // t21.i0
    public boolean e(java.lang.String str, int i17, int i18) {
        fn4.b bVar;
        rm4.d dVar;
        r45.yn6 yn6Var = this.f346092d;
        boolean z17 = yn6Var != null && ((long) (i17 + i18)) <= yn6Var.f472777e;
        if (i17 == 0 && z17 && (bVar = this.f346093e.f346114j) != null && (dVar = bVar.o4().f346012f) != null && dVar.f479001q == 0) {
            dVar.f479001q = java.lang.System.currentTimeMillis() - dVar.f478985a;
            dVar.f479002r = i17;
            dVar.f479003s = i17 + i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "firstDataAvailable %d %d %d", java.lang.Long.valueOf(dVar.f478998n), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        if (z17) {
            return z17;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        return t21.o2.Di().o(str, i17, i18);
    }
}
