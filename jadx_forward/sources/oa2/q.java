package oa2;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oa2.w f425365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f425366f;

    public q(java.lang.String str, oa2.w wVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa) {
        this.f425364d = str;
        this.f425365e = wVar;
        this.f425366f = c19782x23db1cfa;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$initDesigner$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean h17 = ya2.g.h(ya2.h.f542017a, this.f425364d, null, false, false, 14, null);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa contact = this.f425366f;
        oa2.w wVar = this.f425365e;
        if (h17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contact, "$contact");
            if (wVar.f425377i == null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) wVar.m80379x76847179(), 1, true);
                k0Var.q(wVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572822cn3), 17);
                k0Var.f293405n = new oa2.k(wVar);
                k0Var.f293414s = new oa2.l(wVar, contact);
                k0Var.f293387d = new oa2.m(wVar);
                wVar.f425377i = k0Var;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = wVar.f425377i;
            if (k0Var2 != null && !k0Var2.i()) {
                k0Var2.v();
            }
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contact, "$contact");
            wVar.X6(contact, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$initDesigner$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
