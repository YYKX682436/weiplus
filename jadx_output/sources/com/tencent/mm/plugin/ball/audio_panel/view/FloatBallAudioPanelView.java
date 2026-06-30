package com.tencent.mm.plugin.ball.audio_panel.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/ball/audio_panel/view/FloatBallAudioPanelView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnCoverClickListener", "setOnCloseButtonClickListener", "", "d", "Ljz5/g;", "getBlurImageSize", "()I", "blurImageSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FloatBallAudioPanelView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g blurImageSize;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f93040e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f93041f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f93042g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallAudioPanelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getBlurImageSize() {
        return ((java.lang.Number) ((jz5.n) this.blurImageSize).getValue()).intValue();
    }

    public final void setOnCloseButtonClickListener(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.f93041f;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void setOnCoverClickListener(android.view.View.OnClickListener onClickListener) {
        this.f93042g = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallAudioPanelView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.blurImageSize = jz5.h.b(new kp1.i1(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489201bo1, this);
        this.f93040e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.g8k);
        this.f93041f = inflate.findViewById(com.tencent.mm.R.id.g8i);
        android.widget.ImageView imageView = this.f93040e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f93040e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new kp1.j1(this));
        }
        android.widget.ImageView imageView3 = this.f93040e;
        if (imageView3 != null) {
            imageView3.setImportantForAccessibility(2);
        }
        android.widget.ImageView imageView4 = this.f93040e;
        if (imageView4 != null) {
            imageView4.setImageResource(((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Vi());
        }
    }
}
