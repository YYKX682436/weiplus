package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class sc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f186070g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186071h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.im2 f186072i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f186073m;

    public sc(in5.s0 s0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, r45.im2 im2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2) {
        this.f186067d = s0Var;
        this.f186068e = str;
        this.f186069f = abstractC14490x69736cb5;
        this.f186070g = gVar;
        this.f186071h = qeVar;
        this.f186072i = im2Var;
        this.f186073m = gVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshHotSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_search_query", this.f186068e);
        intent.putExtra("key_search_is_from_feed_list", true);
        intent.putExtra("key_search_feed_id", this.f186069f.getFeedObject().m59251x5db1b11());
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f186070g;
        if (gVar != null) {
            intent.putExtra("key_search_session_buffer", gVar.g());
        }
        this.f186071h.getClass();
        r45.im2 im2Var = this.f186072i;
        java.util.LinkedList m75941xfb821914 = im2Var.m75941xfb821914(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14955x327ee410 a17 = !(m75941xfb821914 != null && m75941xfb821914.size() == 0) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14955x327ee410.f36128x681a0c0c.a((r45.lu2) im2Var.m75936x14adae67(0), 0, im2Var.m75941xfb821914(1)) : null;
        if (a17 != null) {
            intent.putExtra("key_search_hot_word_info", a17);
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f186073m;
        if (gVar2 != null) {
            intent.putExtra("key_search_hot_word_buffer", gVar2.g());
        }
        intent.putExtra("key_entrance_type", 8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context = this.f186067d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        i0Var.wj(context, null, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshHotSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
