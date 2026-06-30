package com.tencent.mm.mj_publisher.finder.shoot_composing;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/FlashMaskView;", "Landroid/view/View;", "", "d", "Ljz5/g;", "getBackgroundColor", "()I", "backgroundColor", "Landroid/graphics/Path;", "e", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FlashMaskView extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g backgroundColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.Path path;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlashMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getBackgroundColor() {
        return ((java.lang.Number) ((jz5.n) this.backgroundColor).getValue()).intValue();
    }

    public final android.graphics.Path getPath() {
        return this.path;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int width2 = getWidth();
        int height2 = getHeight();
        if (width2 > height2) {
            width2 = height2;
        }
        android.graphics.Path path = this.path;
        path.reset();
        path.addCircle(width, height, width2 / 2.0f, android.graphics.Path.Direction.CW);
        path.setFillType(android.graphics.Path.FillType.INVERSE_EVEN_ODD);
        canvas.clipPath(path);
        canvas.drawColor(getBackgroundColor());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashMaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.backgroundColor = jz5.h.b(new mx0.v(context));
        this.path = new android.graphics.Path();
    }
}
