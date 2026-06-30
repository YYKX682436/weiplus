package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/ball/audio_panel/view/FloatBallAudioPanelView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setOnCoverClickListener", "setOnCloseButtonClickListener", "", "d", "Ljz5/g;", "getBlurImageSize", "()I", "blurImageSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.audio_panel.view.FloatBallAudioPanelView */
/* loaded from: classes3.dex */
public final class C12884x3f39cace extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g blurImageSize;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f174573e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f174574f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f174575g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12884x3f39cace(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getBlurImageSize */
    private final int m54049x62ce079f() {
        return ((java.lang.Number) ((jz5.n) this.blurImageSize).mo141623x754a37bb()).intValue();
    }

    /* renamed from: setOnCloseButtonClickListener */
    public final void m54050xaf062e33(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.f174574f;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: setOnCoverClickListener */
    public final void m54051xe6095fa6(android.view.View.OnClickListener onClickListener) {
        this.f174575g = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12884x3f39cace(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.blurImageSize = jz5.h.b(new kp1.i1(this));
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570734bo1, this);
        this.f174573e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g8k);
        this.f174574f = inflate.findViewById(com.p314xaae8f345.mm.R.id.g8i);
        android.widget.ImageView imageView = this.f174573e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f174573e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new kp1.j1(this));
        }
        android.widget.ImageView imageView3 = this.f174573e;
        if (imageView3 != null) {
            imageView3.setImportantForAccessibility(2);
        }
        android.widget.ImageView imageView4 = this.f174573e;
        if (imageView4 != null) {
            imageView4.setImageResource(((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Vi());
        }
    }
}
