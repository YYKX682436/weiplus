package fr2;

/* loaded from: classes2.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.p f347268d;

    public o(fr2.p pVar) {
        this.f347268d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC$showBottomBar$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fr2.p pVar = this.f347268d;
        fr2.p.P6(pVar, 2);
        dk2.of ofVar = pVar.f347272g;
        boolean z17 = false;
        if (ofVar != null && ofVar.f315401h == 2) {
            z17 = true;
        }
        if (z17) {
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            ml2.y3 y3Var = ml2.y3.f409810o;
            y4Var.getClass();
            y4Var.f409824c0 = y3Var;
        }
        pVar.getClass();
        pf5.e.m158344xbe96bc24(pVar, null, null, new fr2.f(pVar, null), 3, null);
        android.app.Activity context = pVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a.b(java.lang.String.valueOf(V6.m75939xb282bd08(5)), V6.m75945x2fec8307(1), "chatroom_page_start_live", "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC$showBottomBar$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
