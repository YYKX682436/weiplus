package sp2;

/* loaded from: classes2.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.b0 f492795d;

    public x(sp2.b0 b0Var) {
        this.f492795d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$onViewCreated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToLivePersonalPage preloadPrepareStamp: ");
        sp2.b0 b0Var = this.f492795d;
        sb6.append(b0Var.f492514g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveEntranceFragmentUICMoreIcon", sb6.toString());
        b0Var.O6(ll2.a.f400658f);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("LiveMentionEntrance");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("LivePersonalCenter");
        uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
        android.app.Activity context = b0Var.m80379x76847179();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_ENTER_LIVE_SCENE_STAMP", b0Var.f492514g);
        ((v40.s) nVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Zi(context) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di(context)) {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14020x5e822ca9.class);
        } else {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14019x2227b67b.class);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterLivePersonalCenterPageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterLivePersonalCenterPageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        b0Var.S6("main_page_person_button", false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$onViewCreated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
