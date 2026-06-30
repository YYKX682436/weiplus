package com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\u0017¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010#\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/timeline/CaptionTimelineView;", "Lcom/tencent/mm/mj_publisher/finder/widgets/timelineview/BaseTimelineView;", "", "y", "Z", "getEnableTapSelectSegment", "()Z", "enableTapSelectSegment", "z", "getEnableLongPressSelectSegment", "enableLongPressSelectSegment", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getEnableScale", "enableScale", "B", "getProhibitSelectStorylineSegment", "prohibitSelectStorylineSegment", "Lbx0/i;", "C", "Lbx0/i;", "getTimelineLayoutType", "()Lbx0/i;", "timelineLayoutType", "", "D", "Ljz5/g;", "getGapWidth", "()I", "gapWidth", "Lyv0/h;", "value", "getAdapter", "()Lyv0/h;", "setAdapter", "(Lyv0/h;)V", "adapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CaptionTimelineView extends com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView {
    public static final /* synthetic */ int E = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public final boolean enableScale;

    /* renamed from: B, reason: from kotlin metadata */
    public final boolean prohibitSelectStorylineSegment;

    /* renamed from: C, reason: from kotlin metadata */
    public final bx0.i timelineLayoutType;

    /* renamed from: D, reason: from kotlin metadata */
    public final jz5.g gapWidth;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final boolean enableTapSelectSegment;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final boolean enableLongPressSelectSegment;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionTimelineView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final yv0.h getAdapter() {
        androidx.recyclerview.widget.f2 adapter = getRecyclerView().getAdapter();
        if (adapter instanceof yv0.h) {
            return (yv0.h) adapter;
        }
        return null;
    }

    private final void setAdapter(yv0.h hVar) {
        getRecyclerView().setAdapter(hVar);
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public void a() {
        bx0.h timelineLayoutCalc = getTimelineLayoutCalc();
        if (timelineLayoutCalc != null) {
            timelineLayoutCalc.a();
        }
        yv0.h adapter = getAdapter();
        if (adapter != null) {
            adapter.x(null);
        }
        getRecyclerView().invalidate();
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public boolean c(ex0.a0 timelineVM, kotlinx.coroutines.y0 mainScope) {
        kotlin.jvm.internal.o.g(timelineVM, "timelineVM");
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        bx0.h timelineLayoutCalc = getTimelineLayoutCalc();
        if (timelineLayoutCalc == null) {
            return false;
        }
        setAdapter(new yv0.h(timelineVM, timelineLayoutCalc, getThumbnailProviderManager(), getGapWidth(), false, mainScope, 16, null));
        yv0.h adapter = getAdapter();
        if (adapter != null) {
            adapter.f465972n = new ww0.c(this);
        }
        return getAdapter() != null;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public void d() {
        gy0.q mainItemDecoration = getMainItemDecoration();
        if (mainItemDecoration != null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            mainItemDecoration.l(kz5.c0.i(new hy0.x(context), new hy0.x2(context2)));
        }
        gy0.q mainItemDecoration2 = getMainItemDecoration();
        if (mainItemDecoration2 != null) {
            mainItemDecoration2.S = true;
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
            yv0.f fVar = p07 instanceof yv0.f ? (yv0.f) p07 : null;
            if (fVar != null && kotlin.jvm.internal.o.b(fVar.f465962e, segmentID)) {
                fVar.j(getScrolledX());
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
            yv0.f fVar = p07 instanceof yv0.f ? (yv0.f) p07 : null;
            if (fVar != null && kotlin.jvm.internal.o.b(fVar.f465962e, segmentID)) {
                fVar.k(getScrolledX(), offsetRange);
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public boolean getEnableLongPressSelectSegment() {
        return this.enableLongPressSelectSegment;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public boolean getEnableScale() {
        return this.enableScale;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public boolean getEnableTapSelectSegment() {
        return this.enableTapSelectSegment;
    }

    public final int getGapWidth() {
        return ((java.lang.Number) ((jz5.n) this.gapWidth).getValue()).intValue();
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public boolean getProhibitSelectStorylineSegment() {
        return this.prohibitSelectStorylineSegment;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public bx0.i getTimelineLayoutType() {
        return this.timelineLayoutType;
    }

    @Override // com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView
    public void j() {
        com.tencent.maas.base.MJID mjid;
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
            yv0.f fVar = p07 instanceof yv0.f ? (yv0.f) p07 : null;
            if (fVar != null && (mjid = fVar.f465962e) != null) {
                if (getGestureDetector().f267195c == fy0.l.f267189d) {
                    getThumbnailProviderManager().e(mjid, b17);
                }
                fVar.j(getScrolledX());
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(cx0.c r11) {
        /*
            r10 = this;
            java.lang.String r0 = "mutationInfo"
            kotlin.jvm.internal.o.g(r11, r0)
            cx0.d r0 = cx0.d.f224510f
            java.util.EnumSet r1 = r11.f224503d
            boolean r2 = r1.contains(r0)
            if (r2 == 0) goto L21
            bx0.h r2 = r10.getTimelineLayoutCalc()
            if (r2 == 0) goto L18
            r2.a()
        L18:
            yv0.h r2 = r10.getAdapter()
            if (r2 == 0) goto L21
            r2.x(r11)
        L21:
            bx0.h r2 = r10.getTimelineLayoutCalc()
            if (r2 != 0) goto L28
            return
        L28:
            ex0.a0 r3 = r10.getTimelineVM()
            if (r3 == 0) goto Ld7
            ex0.r r3 = r3.n()
            if (r3 != 0) goto L36
            goto Ld7
        L36:
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3e
            goto Ld0
        L3e:
            bx0.h r0 = r10.getTimelineLayoutCalc()
            if (r0 == 0) goto L47
            r0.a()
        L47:
            yv0.h r0 = r10.getAdapter()
            if (r0 == 0) goto L50
            r0.x(r11)
        L50:
            cx0.e r11 = r11.f224504e
            if (r11 != 0) goto L56
            r11 = -1
            goto L5e
        L56:
            int[] r0 = ww0.a.f450074a
            int r11 = r11.ordinal()
            r11 = r0[r11]
        L5e:
            ug.m r0 = ug.m.Caption
            ug.m r1 = r3.f257169c
            com.tencent.maas.base.MJID r4 = r3.f257168b
            r5 = 0
            r7 = 0
            r8 = 2
            r9 = 1
            if (r11 == r9) goto L90
            if (r11 == r8) goto L73
            if (r1 != r0) goto Ld0
            r2.g(r4)
            goto Ld0
        L73:
            if (r1 == r0) goto L76
            goto L8c
        L76:
            android.graphics.Rect r11 = r2.b(r4, r7)
            int r11 = r11.left
            int r0 = r2.f36287n
            int r11 = r11 - r0
            double r0 = r2.f36279f
            double r7 = (double) r11
            double r0 = r0 + r7
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 >= 0) goto L88
            goto L89
        L88:
            r5 = r0
        L89:
            r10.m(r5)
        L8c:
            r2.g(r4)
            goto Ld0
        L90:
            boolean r11 = r3 instanceof ex0.f
            if (r11 != 0) goto L95
            goto Lcd
        L95:
            if (r1 == r0) goto L98
            goto Lcd
        L98:
            android.graphics.Rect r11 = r2.b(r4, r7)
            ex0.f r3 = (ex0.f) r3
            ax0.a r0 = r3.f257134j
            int r0 = r0.ordinal()
            if (r0 == r9) goto Lb0
            if (r0 == r8) goto La9
            goto Lb8
        La9:
            int r0 = r11.width()
            int r1 = r2.f36286m
            goto Lb6
        Lb0:
            int r0 = r2.f36286m
            int r1 = r11.width()
        Lb6:
            int r7 = r0 - r1
        Lb8:
            ax0.a r0 = r3.f257134j
            java.util.Objects.toString(r0)
            r11.width()
            double r0 = r2.f36279f
            double r7 = (double) r7
            double r0 = r0 + r7
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 >= 0) goto Lc9
            goto Lca
        Lc9:
            r5 = r0
        Lca:
            r10.m(r5)
        Lcd:
            r2.g(r4)
        Ld0:
            androidx.recyclerview.widget.RecyclerView r11 = r10.getRecyclerView()
            r11.invalidate()
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView.n(cx0.c):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionTimelineView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.enableTapSelectSegment = true;
        this.enableLongPressSelectSegment = true;
        this.enableScale = true;
        this.prohibitSelectStorylineSegment = true;
        this.timelineLayoutType = bx0.i.f36292h;
        this.gapWidth = jz5.h.b(new ww0.b(context));
    }
}
