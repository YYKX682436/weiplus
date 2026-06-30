package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e f210453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f210455f;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e eVar, android.view.View view, int i17) {
        this.f210453d = eVar;
        this.f210454e = view;
        this.f210455f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f210453d.f210618h;
        if (pVar != null) {
            android.view.View clickArea = this.f210454e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clickArea, "$clickArea");
            pVar.mo149xb9724478(clickArea, java.lang.Integer.valueOf(this.f210455f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FansListAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
