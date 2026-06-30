package du0;

/* loaded from: classes5.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f324914d;

    public l1(du0.p1 p1Var) {
        this.f324914d = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC$initListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ai();
        Ai.put("view_id", "mjpublisher_disable_bgm");
        ((cy1.a) rVar).yj("mjpublisher_disable_bgm", null, Ai, 6, false);
        ev0.c cVar = this.f324914d.f324947q;
        boolean z17 = !(cVar != null && cVar.f303887d);
        du0.p1 p1Var = this.f324914d;
        p1Var.s7();
        ev0.c cVar2 = p1Var.f324947q;
        if (cVar2 != null && (e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0) cVar2.g().e().b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0.class)) != null) {
            e0Var.o();
        }
        p1Var.Y6(z17);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC$initListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
