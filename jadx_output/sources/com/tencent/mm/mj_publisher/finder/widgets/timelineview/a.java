package com.tencent.mm.mj_publisher.finder.widgets.timelineview;

/* loaded from: classes5.dex */
public final class a implements fy0.m {

    /* renamed from: a, reason: collision with root package name */
    public float f69738a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f69739b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f69740c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView f69741d;

    public a(com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView) {
        this.f69741d = baseTimelineView;
    }

    public void a(fy0.n detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView = this.f69741d;
        if (baseTimelineView.getEnableScale()) {
            baseTimelineView.getThumbnailProviderManager().f244464h = false;
            com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.a aVar = baseTimelineView.f69730q;
            if (aVar != null) {
                aVar.a();
            }
            pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
            yy0.m7 m7Var = (yy0.m7) l0Var;
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.y3(m7Var, baseTimelineView.getTimelineScale(), null), 3, null);
        }
    }
}
