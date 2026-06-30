package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/ball/audio_panel/view/FloatBallAudioPanelViewNew;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setOnCoverClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.audio_panel.view.FloatBallAudioPanelViewNew */
/* loaded from: classes3.dex */
public final class C12885xa658cbf2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f174576d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f174577e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12885xa658cbf2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setOnCoverClickListener */
    public final void m54052xe6095fa6(android.view.View.OnClickListener onClickListener) {
        this.f174577e = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12885xa658cbf2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.widget.ImageView imageView = (android.widget.ImageView) com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570735bo2, this).findViewById(com.p314xaae8f345.mm.R.id.g8k);
        this.f174576d = imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f174576d;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new kp1.k1(this));
        }
        int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr));
        android.widget.ImageView imageView3 = this.f174576d;
        if (imageView3 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = a17;
                layoutParams.height = a17;
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    com.p314xaae8f345.mm.ui.kk.d(this, qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561238d0)));
                }
            } else {
                layoutParams = null;
            }
            imageView3.setLayoutParams(layoutParams);
        }
        android.widget.ImageView imageView4 = this.f174576d;
        if (imageView4 != null) {
            if (!il4.l.g(0)) {
                i18 = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Vi();
            } else {
                i18 = !com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30861xcebc809e.co7 : com.p314xaae8f345.mm.R.C30861xcebc809e.co6;
            }
            imageView4.setImageResource(i18);
        }
    }
}
