package com.tencent.mm.plugin.ball.audio_panel.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/ball/audio_panel/view/FloatBallAudioPanelViewNew;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnCoverClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FloatBallAudioPanelViewNew extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f93043d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f93044e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallAudioPanelViewNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setOnCoverClickListener(android.view.View.OnClickListener onClickListener) {
        this.f93044e = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallAudioPanelViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        android.widget.ImageView imageView = (android.widget.ImageView) com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489202bo2, this).findViewById(com.tencent.mm.R.id.g8k);
        this.f93043d = imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f93043d;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new kp1.k1(this));
        }
        int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr));
        android.widget.ImageView imageView3 = this.f93043d;
        if (imageView3 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = a17;
                layoutParams.height = a17;
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    com.tencent.mm.ui.kk.d(this, qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479705d0)));
                }
            } else {
                layoutParams = null;
            }
            imageView3.setLayoutParams(layoutParams);
        }
        android.widget.ImageView imageView4 = this.f93043d;
        if (imageView4 != null) {
            if (!il4.l.g(0)) {
                i18 = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Vi();
            } else {
                i18 = !com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.drawable.co7 : com.tencent.mm.R.drawable.co6;
            }
            imageView4.setImageResource(i18);
        }
    }
}
