package com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\f¨\u0006#"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/crop/CropMaterialTimelineView;", "Lcom/tencent/mm/mj_publisher/finder/widgets/timelineview/BaseTimelineView;", "Lcom/tencent/maas/moviecomposing/segments/ClipSegment;", "clipSegment", "Ljz5/f0;", "setTargetSegment$plugin_mj_template_release", "(Lcom/tencent/maas/moviecomposing/segments/ClipSegment;)V", "setTargetSegment", "", "y", "Z", "getProhibitSelectStorylineSegment", "()Z", "prohibitSelectStorylineSegment", "Lrv0/k5;", "value", "getAdapter", "()Lrv0/k5;", "setAdapter", "(Lrv0/k5;)V", "adapter", "Lbx0/i;", "getTimelineLayoutType", "()Lbx0/i;", "timelineLayoutType", "enableTrim", "getEnableTrim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CropMaterialTimelineView extends com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView {
    public static final /* synthetic */ int A = 0;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final boolean prohibitSelectStorylineSegment;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.segments.ClipSegment f69284z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropMaterialTimelineView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final rv0.k5 getAdapter() {
        androidx.recyclerview.widget.f2 adapter = getRecyclerView().getAdapter();
        if (adapter instanceof rv0.k5) {
            return (rv0.k5) adapter;
        }
        return null;
    }

    private final void setAdapter(rv0.k5 k5Var) {
        getRecyclerView().setAdapter(k5Var);
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public boolean c(ex0.a0 timelineVM, kotlinx.coroutines.y0 mainScope) {
        kotlin.jvm.internal.o.g(timelineVM, "timelineVM");
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        bx0.h timelineLayoutCalc = getTimelineLayoutCalc();
        if (timelineLayoutCalc == null) {
            return false;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        setAdapter(new rv0.k5(context, timelineVM, timelineLayoutCalc, getThumbnailProviderManager()));
        rv0.k5 adapter = getAdapter();
        if (adapter == null) {
            return true;
        }
        adapter.f400093o = new tv0.l0(this);
        return true;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public void d() {
        gy0.q mainItemDecoration = getMainItemDecoration();
        if (mainItemDecoration != null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            mainItemDecoration.l(kz5.b0.c(new hy0.y(context)));
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public void e(com.tencent.maas.base.MJID segmentID) {
        int w17;
        int y17;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (w17 = linearLayoutManager.w()) > (y17 = linearLayoutManager.y())) {
            return;
        }
        while (true) {
            androidx.recyclerview.widget.k3 p07 = getRecyclerView().p0(w17);
            rv0.f5 f5Var = p07 instanceof rv0.f5 ? (rv0.f5) p07 : null;
            if (f5Var != null && kotlin.jvm.internal.o.b(f5Var.f400003f, segmentID)) {
                f5Var.f400002e.post(new rv0.d5(f5Var, getScrolledX()));
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public void f(com.tencent.maas.base.MJID segmentID, com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange) {
        int w17;
        int y17;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(offsetRange, "offsetRange");
        super.f(segmentID, offsetRange);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (w17 = linearLayoutManager.w()) > (y17 = linearLayoutManager.y())) {
            return;
        }
        while (true) {
            androidx.recyclerview.widget.k3 p07 = getRecyclerView().p0(w17);
            rv0.f5 f5Var = p07 instanceof rv0.f5 ? (rv0.f5) p07 : null;
            if (f5Var != null && kotlin.jvm.internal.o.b(f5Var.f400003f, segmentID)) {
                f5Var.f400002e.post(new rv0.e5(f5Var, getScrolledX(), offsetRange));
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public boolean getEnableTrim() {
        return false;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public boolean getProhibitSelectStorylineSegment() {
        return this.prohibitSelectStorylineSegment;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public bx0.i getTimelineLayoutType() {
        return bx0.i.f36293i;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public void j() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int w17 = linearLayoutManager.w();
        int y17 = linearLayoutManager.y();
        android.graphics.Rect b17 = bx0.b.b((int) getScrolledX(), 0, getScreenWidth(), getHeight());
        if (w17 > y17) {
            return;
        }
        while (true) {
            androidx.recyclerview.widget.k3 p07 = getRecyclerView().p0(w17);
            rv0.f5 f5Var = p07 instanceof rv0.f5 ? (rv0.f5) p07 : null;
            if (f5Var != null) {
                f5Var.f400002e.post(new rv0.d5(f5Var, getScrolledX()));
                com.tencent.maas.base.MJID mjid = f5Var.f400003f;
                if (mjid != null) {
                    getThumbnailProviderManager().e(mjid, b17);
                }
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }

    public final void n(com.tencent.maas.base.MJID segmentID, com.tencent.maas.model.time.MJTime timeInTimeline) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(timeInTimeline, "timeInTimeline");
        rv0.k5 adapter = getAdapter();
        if (adapter != null) {
            adapter.x(segmentID, timeInTimeline);
        }
        j();
    }

    public final void setTargetSegment$plugin_mj_template_release(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment) {
        kotlin.jvm.internal.o.g(clipSegment, "clipSegment");
        this.f69284z = clipSegment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropMaterialTimelineView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.prohibitSelectStorylineSegment = true;
    }
}
