package com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR(\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipStorylineSegmentTimelineView;", "Lcom/tencent/mm/mj_publisher/finder/widgets/timelineview/BaseTimelineView;", "", "ignoreStartTimeInMedia", "Ljz5/f0;", "setIgnoreStartTimeInMedia", "Lbx0/i;", "y", "Lbx0/i;", "getTimelineLayoutType", "()Lbx0/i;", "timelineLayoutType", "Lrv0/k5;", "value", "getAdapter", "()Lrv0/k5;", "setAdapter", "(Lrv0/k5;)V", "adapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ClipStorylineSegmentTimelineView extends com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f69281z = 0;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final bx0.i timelineLayoutType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipStorylineSegmentTimelineView(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        if (adapter != null) {
            adapter.f400093o = new rv0.l5(this);
        }
        return getAdapter() != null;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public void d() {
        gy0.q mainItemDecoration = getMainItemDecoration();
        if (mainItemDecoration != null) {
            mainItemDecoration.f277530p.clear();
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
    public bx0.i getTimelineLayoutType() {
        return this.timelineLayoutType;
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

    public final void n(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        rv0.k5 adapter = getAdapter();
        if (adapter != null) {
            adapter.x(segmentID, null);
        }
        j();
    }

    public final void setIgnoreStartTimeInMedia(boolean z17) {
        getThumbnailProviderManager().f244463g = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipStorylineSegmentTimelineView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.timelineLayoutType = bx0.i.f36289e;
        getThumbnailProviderManager().f244466j = true;
    }
}
