package a50;

/* loaded from: classes9.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw5.f f83054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83056f;

    public p(cw5.f fVar, a50.a0 a0Var, int i17) {
        this.f83054d = fVar;
        this.f83055e = a0Var;
        this.f83056f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int b17 = a50.j0.f83029a.b();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("officialaccounts");
        if (!((p17 == null || !p17.d2(64) || p17.d2(16)) ? false : true)) {
            b17 = 0;
        }
        cw5.f fVar = this.f83054d;
        fVar.f305888f = b17;
        fVar.f305889g[3] = true;
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c cVar = this.f83055e.f82984a;
        if (cVar != null) {
            cVar.L1(this.f83056f, fVar);
        }
    }
}
