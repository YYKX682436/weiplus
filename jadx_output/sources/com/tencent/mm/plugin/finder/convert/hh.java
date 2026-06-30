package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.kh f103587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.f1 f103588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103590g;

    public hh(com.tencent.mm.plugin.finder.convert.kh khVar, so2.f1 f1Var, in5.s0 s0Var, int i17) {
        this.f103587d = khVar;
        this.f103588e = f1Var;
        this.f103589f = s0Var;
        this.f103590g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.kh khVar = this.f103587d;
        khVar.f103836h.invoke(java.lang.Boolean.TRUE);
        khVar.o(this.f103588e, this.f103589f, this.f103590g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLikeConvert$refresh$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
