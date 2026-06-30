package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f203382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp2.b f203383g;

    public o2(in5.s0 s0Var, java.lang.String str, java.lang.Object obj, wp2.b bVar) {
        this.f203380d = s0Var;
        this.f203381e = str;
        this.f203382f = obj;
        this.f203383g = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$bindLive$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        android.content.Context context = this.f203380d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
            str = "";
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        ml2.t1 t1Var = ml2.t1.f409475e;
        a4Var.b(str, b17, "square_card_friend_like_word", this.f203381e);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Aj(this.f203382f, this.f203383g.getFeedObject());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$bindLive$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
