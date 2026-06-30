package xn2;

/* loaded from: classes2.dex */
public final class a1 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f537008a;

    public a1(xn2.f1 f1Var) {
        this.f537008a = f1Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        vn2.u0.f519920a.m("Finder.MegaVideoViewCallback", "onRefresh isAuto=" + z17);
        xn2.f1 f1Var = this.f537008a;
        xn2.p0 p0Var = (xn2.p0) f1Var.f537026e;
        p0Var.j().mo56155xd210094c();
        p0Var.f537085j++;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l lVar = new jz5.l("page_name", "TopStoryFinderLongVideoListPage");
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).yj("page_pull_up_refresh", null, kz5.c1.k(lVar, new jz5.l("page_id", 50030), new jz5.l("finder_context_id", ((xn2.p0) f1Var.f537026e).f537077b), new jz5.l("comment_scene", 281), new jz5.l("finder_username", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(f1Var.mo978x19263085()))), 1, true);
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        vn2.u0.f519920a.m("Finder.MegaVideoViewCallback", "onLoadMore");
        xn2.a.a(this.f537008a.f537026e, false, 1, null);
        return true;
    }
}
