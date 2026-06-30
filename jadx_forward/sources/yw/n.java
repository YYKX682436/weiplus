package yw;

/* loaded from: classes9.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dw5.i f547935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yw.y f547936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f547937f;

    public n(dw5.i iVar, yw.y yVar, int i17) {
        this.f547935d = iVar;
        this.f547936e = yVar;
        this.f547937f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int c17 = yw.q0.f547962a.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("officialaccounts");
        if (!((p17 == null || !p17.d2(64) || p17.d2(16)) ? false : true)) {
            c17 = 0;
        }
        dw5.i iVar = this.f547935d;
        iVar.f325901f = c17;
        iVar.f325902g[3] = true;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar = this.f547936e.f548042a;
        if (cVar != null) {
            cVar.b1(this.f547937f, iVar);
        }
    }
}
