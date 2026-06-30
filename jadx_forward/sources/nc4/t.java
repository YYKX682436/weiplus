package nc4;

/* loaded from: classes4.dex */
public final class t implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc4.d0 f417708d;

    public t(nc4.d0 d0Var) {
        this.f417708d = d0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$1");
        g4Var.clear();
        for (java.util.Map.Entry entry : nc4.d0.P6(this.f417708d).entrySet()) {
            if (((nc4.c) entry.getValue()).mo149390x35dafd()) {
                g4Var.v(((nc4.c) entry.getValue()).a());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$1");
    }
}
