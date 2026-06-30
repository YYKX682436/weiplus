package com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/timeline/TimelineAdapterInnerContainer;", "Landroid/view/View;", "Landroid/graphics/Path;", "cropPath", "Ljz5/f0;", "setCropRect", "", "gapWidth", "setGapWidth", "", "d", "Ljz5/g;", "getCornerRadius", "()F", "cornerRadius", "s", "getScreenWidth", "()I", "screenWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TimelineAdapterInnerContainer extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cornerRadius;

    /* renamed from: e, reason: collision with root package name */
    public boolean f69289e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f69290f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Path f69291g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f69292h;

    /* renamed from: i, reason: collision with root package name */
    public dx0.n f69293i;

    /* renamed from: m, reason: collision with root package name */
    public ex0.a0 f69294m;

    /* renamed from: n, reason: collision with root package name */
    public bx0.h f69295n;

    /* renamed from: o, reason: collision with root package name */
    public android.util.Size f69296o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.maas.base.MJID f69297p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f69298q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f69299r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final jz5.g screenWidth;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Paint f69301t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f69302u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.Rect f69303v;

    /* renamed from: w, reason: collision with root package name */
    public int f69304w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineAdapterInnerContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final float getCornerRadius() {
        return ((java.lang.Number) ((jz5.n) this.cornerRadius).getValue()).floatValue();
    }

    private final int getScreenWidth() {
        return ((java.lang.Number) ((jz5.n) this.screenWidth).getValue()).intValue();
    }

    private final void setCropRect(android.graphics.Path path) {
        ex0.a0 a0Var = this.f69294m;
        if (a0Var == null) {
            kotlin.jvm.internal.o.o("timelineVM");
            throw null;
        }
        com.tencent.maas.base.MJID mjid = this.f69297p;
        if (mjid == null) {
            kotlin.jvm.internal.o.o("currentSegmentID");
            throw null;
        }
        float left = !a0Var.D(mjid) ? getLeft() + (this.f69304w / 2) : getLeft();
        float top = getTop();
        ex0.a0 a0Var2 = this.f69294m;
        if (a0Var2 == null) {
            kotlin.jvm.internal.o.o("timelineVM");
            throw null;
        }
        com.tencent.maas.base.MJID mjid2 = this.f69297p;
        if (mjid2 == null) {
            kotlin.jvm.internal.o.o("currentSegmentID");
            throw null;
        }
        float right = !a0Var2.E(mjid2) ? getRight() - (this.f69304w / 2) : getRight();
        float bottom = getBottom();
        if (this.f69289e) {
            path.moveTo(getCornerRadius() + left, top);
        } else {
            path.moveTo(left, top);
        }
        if (this.f69290f) {
            path.lineTo(right - getCornerRadius(), top);
            path.quadTo(right, top, right, getCornerRadius() + top);
            path.lineTo(right, bottom - getCornerRadius());
            path.quadTo(right, bottom, right - getCornerRadius(), bottom);
        } else {
            path.lineTo(right, top);
            path.lineTo(right, bottom);
        }
        if (this.f69289e) {
            path.lineTo(getCornerRadius() + left, bottom);
            path.quadTo(left, bottom, left, bottom - getCornerRadius());
            path.lineTo(left, getCornerRadius() + top);
            path.quadTo(left, top, getCornerRadius() + left, top);
        } else {
            path.lineTo(left, bottom);
            path.lineTo(left, top);
        }
        path.close();
    }

    public final void a(dx0.n thumbnailProvider, com.tencent.maas.base.MJID segmentID, ex0.a0 timelineVM, bx0.h timelineLayoutCalculator, android.util.Size thumbnailSize, boolean z17) {
        kotlin.jvm.internal.o.g(thumbnailProvider, "thumbnailProvider");
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(timelineVM, "timelineVM");
        kotlin.jvm.internal.o.g(timelineLayoutCalculator, "timelineLayoutCalculator");
        kotlin.jvm.internal.o.g(thumbnailSize, "thumbnailSize");
        java.util.Objects.toString(this.f69298q);
        thumbnailSize.toString();
        this.f69293i = thumbnailProvider;
        this.f69294m = timelineVM;
        this.f69295n = timelineLayoutCalculator;
        this.f69296o = thumbnailSize;
        this.f69297p = segmentID;
        this.f69292h = true;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer.onDraw(android.graphics.Canvas):void");
    }

    public final void setGapWidth(int i17) {
        this.f69304w = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineAdapterInnerContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.cornerRadius = jz5.h.b(new yv0.q(context));
        this.f69289e = true;
        this.f69290f = true;
        this.f69291g = new android.graphics.Path();
        this.f69298q = new android.graphics.Rect();
        this.f69299r = new android.graphics.Rect();
        this.screenWidth = jz5.h.b(new yv0.r(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        this.f69301t = paint;
        this.f69302u = new android.graphics.Rect();
        this.f69303v = new android.graphics.Rect();
    }
}
