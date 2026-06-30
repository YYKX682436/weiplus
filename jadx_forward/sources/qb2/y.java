package qb2;

/* loaded from: classes10.dex */
public final class y implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wn.j f442843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.b0 f442844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f442845f;

    public y(wn.j jVar, qb2.b0 b0Var, android.view.View view) {
        this.f442843d = jVar;
        this.f442844e = b0Var;
        this.f442845f = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/conv/FinderConversationAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        wn.j jVar = this.f442843d;
        qb2.t tVar = (qb2.t) jVar.f374658i;
        qb2.v vVar = this.f442844e.f442710s;
        if (vVar != null) {
            int m8183xf806b362 = jVar.m8183xf806b362();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
            qb2.l0 l0Var = (qb2.l0) vVar;
            android.view.View view2 = this.f442845f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
            l0Var.f442767e = tVar;
            rl5.r rVar = new rl5.r(view2.getContext());
            rVar.L = l0Var;
            rVar.g(view2, m8183xf806b362, 0L, l0Var, l0Var, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            rVar.m();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/conv/FinderConversationAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
