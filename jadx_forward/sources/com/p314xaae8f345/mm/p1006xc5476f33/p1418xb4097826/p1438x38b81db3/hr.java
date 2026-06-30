package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class hr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f185141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kr f185142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f185143g;

    public hr(in5.s0 s0Var, so2.u1 u1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kr krVar, int i17) {
        this.f185140d = s0Var;
        this.f185141e = u1Var;
        this.f185142f = krVar;
        this.f185143g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert$setSeeLaterLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vn2.u0 u0Var = vn2.u0.f519920a;
        android.content.Context context = this.f185140d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        so2.u1 u1Var = this.f185141e;
        u0Var.e(context, u1Var.mo2128x1ed62e84(), u1Var.g0(), (r19 & 8) != 0 ? false : false, (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fr(this.f185141e, this.f185142f, this.f185143g, this.f185140d, null), (r19 & 64) != 0 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gr(null));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert$setSeeLaterLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
