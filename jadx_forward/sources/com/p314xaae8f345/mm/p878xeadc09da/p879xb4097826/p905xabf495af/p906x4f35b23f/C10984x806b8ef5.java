package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/beautify/SeekBarWithValueView;", "Landroid/widget/LinearLayout;", "", "progress", "Ljz5/f0;", "setValueChangeWithProgress", "Lnx0/p3;", "onSeekBarChangeListener", "setOnSeekBarChangeListener", "Landroid/view/View;", "d", "Ljz5/g;", "getBarWithValue", "()Landroid/view/View;", "barWithValue", "Landroid/widget/TextView;", "e", "getBarText", "()Landroid/widget/TextView;", "barText", "Landroid/widget/SeekBar;", "f", "getBar", "()Landroid/widget/SeekBar;", "bar", "value", "getProgress", "()I", "setProgress", "(I)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView */
/* loaded from: classes5.dex */
public final class C10984x806b8ef5 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g barWithValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g barText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g bar;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10984x806b8ef5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBar */
    public final android.widget.SeekBar m47372xb5882cdd() {
        java.lang.Object mo141623x754a37bb = this.bar.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.SeekBar) mo141623x754a37bb;
    }

    /* renamed from: getBarText */
    private final android.widget.TextView m47373x29e42faa() {
        java.lang.Object mo141623x754a37bb = this.barText.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    /* renamed from: getBarWithValue */
    private final android.view.View m47374x33a197ee() {
        java.lang.Object mo141623x754a37bb = this.barWithValue.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setValueChangeWithProgress */
    public final void m47375xd8a9172(int i17) {
        m47373x29e42faa().setText(java.lang.String.valueOf(i17));
        m47373x29e42faa().measure(0, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m47372xb5882cdd().getLayoutParams(), "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        float width = (((((m47372xb5882cdd().getWidth() - m47372xb5882cdd().getPaddingStart()) - m47372xb5882cdd().getPaddingEnd()) * (i17 / m47372xb5882cdd().getMax())) + m47372xb5882cdd().getPaddingStart()) + ((android.view.ViewGroup.MarginLayoutParams) r1).getMarginStart()) - (m47373x29e42faa().getMeasuredWidth() / 2);
        android.view.ViewGroup.LayoutParams layoutParams = m47373x29e42faa().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart((int) width);
        m47373x29e42faa().setLayoutParams(layoutParams2);
    }

    /* renamed from: getProgress */
    public final int m47376x402effa3() {
        return m47372xb5882cdd().getProgress();
    }

    /* renamed from: setOnSeekBarChangeListener */
    public final void m47377xf00f287e(nx0.p3 onSeekBarChangeListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSeekBarChangeListener, "onSeekBarChangeListener");
        m47372xb5882cdd().setOnSeekBarChangeListener(new nx0.t3(this, onSeekBarChangeListener));
    }

    /* renamed from: setProgress */
    public final void m47378x3ae760af(int i17) {
        m47372xb5882cdd().setProgress(i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10984x806b8ef5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        jz5.i iVar = jz5.i.f384364f;
        this.barWithValue = jz5.h.a(iVar, new nx0.s3(this));
        this.barText = jz5.h.a(iVar, new nx0.r3(this));
        this.bar = jz5.h.a(iVar, new nx0.q3(this));
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dde, (android.view.ViewGroup) this, true);
        m47377xf00f287e(new nx0.n3());
        m47375xd8a9172(m47376x402effa3());
        m47374x33a197ee().setOnTouchListener(new nx0.o3(this));
    }
}
