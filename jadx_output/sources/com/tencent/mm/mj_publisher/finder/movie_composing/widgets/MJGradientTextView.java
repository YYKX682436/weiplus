package com.tencent.mm.mj_publisher.finder.movie_composing.widgets;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJGradientTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MJGradientTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.LinearGradient f69378g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69379h;

    /* renamed from: i, reason: collision with root package name */
    public final int f69380i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MJGradientTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            if (this.f69378g == null) {
                this.f69378g = new android.graphics.LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), this.f69379h, this.f69380i, android.graphics.Shader.TileMode.CLAMP);
            }
            getPaint().setShader(this.f69378g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MJGradientTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ez0.l.f257818e, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f69379h = obtainStyledAttributes.getColor(1, 0);
        this.f69380i = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }
}
