package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.i0 f203519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.b4 f203521f;

    public v3(vp2.i0 i0Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.b4 b4Var) {
        this.f203519d = i0Var;
        this.f203520e = s0Var;
        this.f203521f = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/PlayTogetherLivingConvert$bindAvatarLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        in5.s0 s0Var = this.f203520e;
        long m8183xf806b362 = s0Var.m8183xf806b362();
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        java.lang.String valueOf = java.lang.String.valueOf(nyVar != null ? nyVar.f216913n : 0);
        vp2.i0 i0Var = this.f203519d;
        ((ml2.j0) zbVar).tj(i0Var, m8183xf806b362, valueOf);
        this.f203521f.f203127g.mo149xb9724478(i0Var.getFeedObject(), i0Var.getFeedObject().m59299x6bf53a6c());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/PlayTogetherLivingConvert$bindAvatarLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
