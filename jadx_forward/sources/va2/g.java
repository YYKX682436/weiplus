package va2;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va2.h f515774d;

    public g(va2.h hVar) {
        this.f515774d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/topic/uic/FinderTopicPostUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        va2.h hVar = this.f515774d;
        boolean booleanExtra = hVar.m158359x1e885992().getBooleanExtra("KEY_FINDER_NEED_POST_TO_COMMENT", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        qs2.e eVar = new qs2.e(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E8).mo141623x754a37bb()).r()).intValue() == 1 ? 2 : 1, 49, 25);
        r45.r03 r03Var = (r45.r03) hVar.f534252d;
        java.lang.String m75945x2fec8307 = r03Var != null ? r03Var.m75945x2fec8307(0) : null;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        eVar.f447798g = m75945x2fec8307;
        eVar.f447795d = hVar.f515775g;
        eVar.f447796e = hVar.f515776h;
        eVar.f447808q = booleanExtra;
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        w40.e.Df((w40.e) c17, hVar.m158354x19263085(), eVar, null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/topic/uic/FinderTopicPostUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
