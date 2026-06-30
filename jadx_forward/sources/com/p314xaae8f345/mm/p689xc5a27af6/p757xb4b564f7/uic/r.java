package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v f148899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f148900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f148901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f148902g;

    public r(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v vVar, int i17, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, java.util.ArrayList arrayList) {
        this.f148899d = vVar;
        this.f148900e = i17;
        this.f148901f = c22848x6ddd90cf;
        this.f148902g = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/uic/OpenMsgByAppBrandUIC$onCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v vVar = this.f148899d;
        vVar.U6().a().setVisibility(8);
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v.T6(vVar, this.f148900e);
        java.util.ArrayList arrayList2 = this.f148902g;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f148901f;
        c22848x6ddd90cf.E0(arrayList2);
        c22848x6ddd90cf.m8146xced61ae5();
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/uic/OpenMsgByAppBrandUIC$onCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
