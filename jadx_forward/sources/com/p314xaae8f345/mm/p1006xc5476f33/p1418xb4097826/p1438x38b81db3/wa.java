package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class wa implements ym5.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186390b;

    public wa(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        this.f186389a = s0Var;
        this.f186390b = qeVar;
    }

    @Override // ym5.i1
    public void a(android.view.View view, android.view.MotionEvent motionEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "onSingleClickListener onMediaClick  " + this.f186389a.f374658i);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FEED_ENTER_CLICK_AREA", 4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f186390b;
        in5.s0 s0Var = this.f186389a;
        qeVar.s0(s0Var, view, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i).getFeedObject().getFeedObject(), motionEvent, intent);
    }
}
