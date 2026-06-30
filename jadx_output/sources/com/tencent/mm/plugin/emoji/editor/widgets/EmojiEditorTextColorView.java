package com.tencent.mm.plugin.emoji.editor.widgets;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextColorView;", "Landroid/view/View;", "", "value", "h", "I", "getColor", "()I", "setColor", "(I)V", "color", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EmojiEditorTextColorView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f97490d;

    /* renamed from: e, reason: collision with root package name */
    public final int f97491e;

    /* renamed from: f, reason: collision with root package name */
    public final int f97492f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f97493g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int color;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiEditorTextColorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int getColor() {
        return this.color;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        boolean isSelected = isSelected();
        int i17 = this.f97492f;
        if (isSelected) {
            canvas.save();
            float f17 = this.f97491e / i17;
            canvas.scale(f17, f17, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        android.graphics.Paint paint = this.f97493g;
        paint.setColor(-1);
        canvas.drawCircle(width, height, i17, paint);
        paint.setColor(this.color);
        canvas.drawCircle(width, height, i17 - this.f97490d, paint);
        if (isSelected()) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.f97492f * 2, 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void setColor(int i17) {
        this.color = i17;
        invalidate();
    }

    public /* synthetic */ EmojiEditorTextColorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEditorTextColorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f97490d = ym5.x.a(context, 2.0f);
        this.f97491e = ym5.x.a(context, 16.0f);
        this.f97492f = ym5.x.a(context, 12.0f);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f97493g = paint;
        this.color = -1;
    }
}
