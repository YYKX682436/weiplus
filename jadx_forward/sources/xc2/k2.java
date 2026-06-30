package xc2;

/* loaded from: classes2.dex */
public final class k2 implements com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f534726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai f534727e;

    public k2(com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai aiVar) {
        this.f534726d = c22584xf7d97e83;
        this.f534727e = aiVar;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.JumperUtils", "onDrawerDetach");
        this.f534727e.S6(this);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        wm3.j jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.JumperUtils", "onDrawerOpen open: " + z17 + ", begin:" + z18);
        if (!z17 || z18 || (abstractActivityC22579xbed01a37 = this.f534726d.f292654p) == null || (jVar = (wm3.j) pf5.z.f435481a.a(abstractActivityC22579xbed01a37).e(wm3.j.class)) == null) {
            return;
        }
        jVar.U6();
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.JumperUtils", "onDrawerPeek");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void f() {
        xc2.y2.d(xc2.y2.f534876a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.JumperUtils", "onDrawerExpand");
    }
}
