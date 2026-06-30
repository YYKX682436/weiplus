package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f254453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f254454e;

    public a(ot0.q qVar, android.content.Context context) {
        this.f254453d = qVar;
        this.f254454e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/AppBrandAuthorizationFiller$onFill$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ot0.q qVar = this.f254453d;
        if (qVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/AppBrandAuthorizationFiller$onFill$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = qVar.f430206j2;
        b1Var.f398565k = 1212;
        b1Var.f398551d = qVar.A2;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(this.f254454e, b1Var);
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/AppBrandAuthorizationFiller$onFill$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
