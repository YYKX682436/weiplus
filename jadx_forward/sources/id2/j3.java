package id2;

/* loaded from: classes3.dex */
public final class j3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f372163e;

    public j3(id2.u3 u3Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f372162d = u3Var;
        this.f372163e = c19786x6a1e2862;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshCustomerServiceEntrance$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        id2.u3 u3Var = this.f372162d;
        android.app.Activity m80379x76847179 = u3Var.m80379x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m80379x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m80379x76847179 : null;
        if (abstractActivityC15087xee12defa == null || (str = java.lang.Integer.valueOf(abstractActivityC15087xee12defa.getD()).toString()) == null) {
            str = "";
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(str, b52.b.b(), "person_page_service_assistant", "");
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.app.Activity m80379x768471792 = u3Var.m80379x76847179();
        r45.ac4 ac4Var = new r45.ac4();
        ac4Var.set(1, this.f372163e);
        ((c61.p2) ybVar).Bi(m80379x768471792, ac4Var, null, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshCustomerServiceEntrance$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
    }
}
