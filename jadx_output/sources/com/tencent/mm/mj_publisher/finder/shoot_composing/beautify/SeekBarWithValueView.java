package com.tencent.mm.mj_publisher.finder.shoot_composing.beautify;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/beautify/SeekBarWithValueView;", "Landroid/widget/LinearLayout;", "", "progress", "Ljz5/f0;", "setValueChangeWithProgress", "Lnx0/p3;", "onSeekBarChangeListener", "setOnSeekBarChangeListener", "Landroid/view/View;", "d", "Ljz5/g;", "getBarWithValue", "()Landroid/view/View;", "barWithValue", "Landroid/widget/TextView;", "e", "getBarText", "()Landroid/widget/TextView;", "barText", "Landroid/widget/SeekBar;", "f", "getBar", "()Landroid/widget/SeekBar;", "bar", "value", "getProgress", "()I", "setProgress", "(I)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SeekBarWithValueView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g barWithValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g barText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g bar;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeekBarWithValueView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.SeekBar getBar() {
        java.lang.Object value = this.bar.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.SeekBar) value;
    }

    private final android.widget.TextView getBarText() {
        java.lang.Object value = this.barText.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    private final android.view.View getBarWithValue() {
        java.lang.Object value = this.barWithValue.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValueChangeWithProgress(int i17) {
        getBarText().setText(java.lang.String.valueOf(i17));
        getBarText().measure(0, 0);
        kotlin.jvm.internal.o.e(getBar().getLayoutParams(), "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        float width = (((((getBar().getWidth() - getBar().getPaddingStart()) - getBar().getPaddingEnd()) * (i17 / getBar().getMax())) + getBar().getPaddingStart()) + ((android.view.ViewGroup.MarginLayoutParams) r1).getMarginStart()) - (getBarText().getMeasuredWidth() / 2);
        android.view.ViewGroup.LayoutParams layoutParams = getBarText().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart((int) width);
        getBarText().setLayoutParams(layoutParams2);
    }

    public final int getProgress() {
        return getBar().getProgress();
    }

    public final void setOnSeekBarChangeListener(nx0.p3 onSeekBarChangeListener) {
        kotlin.jvm.internal.o.g(onSeekBarChangeListener, "onSeekBarChangeListener");
        getBar().setOnSeekBarChangeListener(new nx0.t3(this, onSeekBarChangeListener));
    }

    public final void setProgress(int i17) {
        getBar().setProgress(i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarWithValueView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.i iVar = jz5.i.f302831f;
        this.barWithValue = jz5.h.a(iVar, new nx0.s3(this));
        this.barText = jz5.h.a(iVar, new nx0.r3(this));
        this.bar = jz5.h.a(iVar, new nx0.q3(this));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dde, (android.view.ViewGroup) this, true);
        setOnSeekBarChangeListener(new nx0.n3());
        setValueChangeWithProgress(getProgress());
        getBarWithValue().setOnTouchListener(new nx0.o3(this));
    }
}
