package lr;

/* loaded from: classes13.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.j1 f402056d;

    public g1(lr.j1 j1Var) {
        this.f402056d = j1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lr.j1 j1Var = this.f402056d;
        lr.k0 k0Var = j1Var.f402113d;
        if (k0Var != null) {
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            k0Var.b(view, context, j1Var.m8183xf806b362(), j1Var.f402114e);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5 s5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class);
        r45.v75 v75Var = j1Var.f402081s;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) s5Var).Vi(v75Var != null ? v75Var.f469497d : 0);
        yj0.a.h(this, "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
