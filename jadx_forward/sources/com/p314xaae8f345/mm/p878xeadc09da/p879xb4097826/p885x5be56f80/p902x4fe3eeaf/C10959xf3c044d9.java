package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/MCRoundCornerAnimateView;", "Lcom/tencent/mm/plugin/gif/MMAnimateView;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "jx0/b", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MCRoundCornerAnimateView */
/* loaded from: classes3.dex */
public final class C10959xf3c044d9 extends com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 {

    /* renamed from: n, reason: collision with root package name */
    public int f150908n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10959xf3c044d9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ez0.l.f339349c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f150908n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        setClipToOutline(true);
        setOutlineProvider(new jx0.b(this.f150908n));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        y();
        super.onDetachedFromWindow();
    }

    /* renamed from: setRadius */
    public final void m47186x205ac394(int i17) {
        this.f150908n = i17;
        setClipToOutline(true);
        setOutlineProvider(new jx0.b(i17));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10959xf3c044d9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
