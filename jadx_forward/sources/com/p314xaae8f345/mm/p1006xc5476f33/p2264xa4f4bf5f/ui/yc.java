package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class yc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.zc f255989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f255990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.w f255991f;

    public yc(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.zc zcVar, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, in5.w wVar) {
        this.f255989d = zcVar;
        this.f255990e = c22848x6ddd90cf;
        this.f255991f = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$NotificationMsgLoader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.zc zcVar = this.f255989d;
        java.util.ArrayList arrayList2 = zcVar.f256017c;
        int size = arrayList2.size();
        java.util.ArrayList arrayList3 = zcVar.f256018d;
        int size2 = arrayList3.size();
        arrayList2.clear();
        ai4.m0 m0Var = ai4.m0.f86706a;
        arrayList2.addAll(m0Var.k());
        arrayList3.clear();
        arrayList3.addAll(m0Var.l());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "reInit: old=[" + size + ',' + size2 + "], new=[" + arrayList2.size() + ',' + arrayList3.size() + ']');
        zcVar.f256019e = size;
        zcVar.f256020f = size2;
        zcVar.f256021g = null;
        zcVar.f256022h = null;
        in5.n0.h0(this.f255990e, this.f255991f.mo2128x1ed62e84(), false, 2, null);
        zcVar.b();
        qj4.s sVar = qj4.s.f445491a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004.f255175y;
        mj4.h E = m0Var.E();
        qj4.s.l(sVar, 11L, null, null, 0L, E != null ? ((mj4.k) E).l() : "", 0L, 46, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$NotificationMsgLoader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
