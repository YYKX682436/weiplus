package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class wa implements ym5.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104857b;

    public wa(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f104856a = s0Var;
        this.f104857b = qeVar;
    }

    @Override // ym5.i1
    public void a(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "onSingleClickListener onMediaClick  " + this.f104856a.f293125i);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FEED_ENTER_CLICK_AREA", 4);
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f104857b;
        in5.s0 s0Var = this.f104856a;
        qeVar.s0(s0Var, view, ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i).getFeedObject().getFeedObject(), motionEvent, intent);
    }
}
