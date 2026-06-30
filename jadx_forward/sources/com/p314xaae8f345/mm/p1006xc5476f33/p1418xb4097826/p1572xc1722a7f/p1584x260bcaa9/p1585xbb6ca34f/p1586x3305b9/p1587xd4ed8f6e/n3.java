package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.q3 f203360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203362f;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.q3 q3Var, in5.s0 s0Var, java.lang.String str) {
        this.f203360d = q3Var;
        this.f203361e = s0Var;
        this.f203362f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeSmallConvert$onBindViewHolder$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f203361e.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String name = this.f203362f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "$name");
        this.f203360d.getClass();
        android.content.Intent intent = new android.content.Intent();
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        intent.putExtra("key_click_tab_context_id", rq2.x.f480452f);
        intent.putExtra("finder_username", name);
        intent.putExtra("key_from_comment_scene", 0);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        ((c61.l7) b6Var).Cj(rq2.x.f480448b, intent);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareTabLifeCycleReport", "enterProfile");
        ip2.a.f375148d = "page_profile";
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeSmallConvert$onBindViewHolder$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
