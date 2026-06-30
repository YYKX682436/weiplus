package com.tencent.mm.feature.ecs.kfproductcard.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/feature/ecs/kfproductcard/view/EcsKfProductCardTitleView;", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b10/e", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EcsKfProductCardTitleView extends com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsKfProductCardTitleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f17, float f18) {
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        if (charSequence == null || charSequence.length() == 0) {
            super.setText(charSequence, bufferType);
            return;
        }
        int textSize = (int) (getTextSize() * 1.4f);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new b10.e(textSize), 0, spannableStringBuilder.length(), 17);
        super.setText(spannableStringBuilder, bufferType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsKfProductCardTitleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
