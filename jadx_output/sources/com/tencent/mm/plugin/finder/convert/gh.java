package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.kh f103484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.f1 f103485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103487g;

    public gh(com.tencent.mm.plugin.finder.convert.kh khVar, so2.f1 f1Var, in5.s0 s0Var, int i17) {
        this.f103484d = khVar;
        this.f103485e = f1Var;
        this.f103486f = s0Var;
        this.f103487g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.kh khVar = this.f103484d;
        khVar.f103836h.invoke(java.lang.Boolean.FALSE);
        khVar.o(this.f103485e, this.f103486f, this.f103487g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
