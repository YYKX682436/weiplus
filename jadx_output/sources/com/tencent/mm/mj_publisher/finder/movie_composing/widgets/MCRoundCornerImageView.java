package com.tencent.mm.mj_publisher.finder.movie_composing.widgets;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/MCRoundCornerImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "jx0/c", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MCRoundCornerImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public int f69376f;

    /* renamed from: g, reason: collision with root package name */
    public final al5.p2 f69377g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCRoundCornerImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69377g = new al5.p2(this);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ez0.l.f257817d);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f69376f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        setClipToOutline(true);
        setOutlineProvider(new jx0.c(this.f69376f));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f69377g.a();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f69377g.getClass();
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable runnable) {
        this.f69377g.getClass();
        return super.post(runnable);
    }

    public final void setRadius(int i17) {
        this.f69376f = i17;
        setClipToOutline(true);
        setOutlineProvider(new jx0.c(i17));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MCRoundCornerImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
