package com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/subviews/WhenPickerView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "pickerView", "Ljz5/f0;", "setPickerView", "", "whereText", "setWhereText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WhenPickerView extends android.widget.FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WhenPickerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setPickerView(android.view.View pickerView) {
        kotlin.jvm.internal.o.g(pickerView, "pickerView");
        pickerView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        removeAllViews();
        addView(pickerView);
    }

    public final void setWhereText(java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qb8);
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    public /* synthetic */ WhenPickerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhenPickerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setBackground(new android.graphics.drawable.ColorDrawable(0));
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dgg, this);
    }
}
