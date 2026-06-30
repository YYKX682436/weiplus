package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f103608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.kr f103609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103610g;

    public hr(in5.s0 s0Var, so2.u1 u1Var, com.tencent.mm.plugin.finder.convert.kr krVar, int i17) {
        this.f103607d = s0Var;
        this.f103608e = u1Var;
        this.f103609f = krVar;
        this.f103610g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert$setSeeLaterLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vn2.u0 u0Var = vn2.u0.f438387a;
        android.content.Context context = this.f103607d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        so2.u1 u1Var = this.f103608e;
        u0Var.e(context, u1Var.getItemId(), u1Var.g0(), (r19 & 8) != 0 ? false : false, (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : new com.tencent.mm.plugin.finder.convert.fr(this.f103608e, this.f103609f, this.f103610g, this.f103607d, null), (r19 & 64) != 0 ? null : new com.tencent.mm.plugin.finder.convert.gr(null));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert$setSeeLaterLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
