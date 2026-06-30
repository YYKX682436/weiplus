package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*B#\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b)\u0010-R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006."}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallAudioWaveRootView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "e", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "Landroid/view/View;", "f", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "Lcom/tencent/mm/plugin/ball/view/FloatBallAudioWaveView;", "g", "Lcom/tencent/mm/plugin/ball/view/FloatBallAudioWaveView;", "getLeftWave", "()Lcom/tencent/mm/plugin/ball/view/FloatBallAudioWaveView;", "setLeftWave", "(Lcom/tencent/mm/plugin/ball/view/FloatBallAudioWaveView;)V", "leftWave", "h", "getRightWave", "setRightWave", "rightWave", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "setTitleTxt", "(Landroid/widget/TextView;)V", "titleTxt", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FloatBallAudioWaveRootView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f93442d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.content.Context mContext;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.view.View root;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView leftWave;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView rightWave;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView titleTxt;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallAudioWaveRootView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView getLeftWave() {
        return this.leftWave;
    }

    public final android.content.Context getMContext() {
        return this.mContext;
    }

    public final com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView getRightWave() {
        return this.rightWave;
    }

    public final android.view.View getRoot() {
        return this.root;
    }

    public final android.widget.TextView getTitleTxt() {
        return this.titleTxt;
    }

    public final void setLeftWave(com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView floatBallAudioWaveView) {
        kotlin.jvm.internal.o.g(floatBallAudioWaveView, "<set-?>");
        this.leftWave = floatBallAudioWaveView;
    }

    public final void setMContext(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<set-?>");
        this.mContext = context;
    }

    public final void setRightWave(com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView floatBallAudioWaveView) {
        kotlin.jvm.internal.o.g(floatBallAudioWaveView, "<set-?>");
        this.rightWave = floatBallAudioWaveView;
    }

    public final void setRoot(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.root = view;
    }

    public final void setTitleTxt(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.titleTxt = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallAudioWaveRootView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f93442d = "MicroMsg.FloatBallAudioWaveRootView";
        this.mContext = context;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.eew, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.root = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f487688pg4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.leftWave = (com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView) findViewById;
        android.view.View findViewById2 = this.root.findViewById(com.tencent.mm.R.id.f487689pg5);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.rightWave = (com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView) findViewById2;
        android.view.View findViewById3 = this.root.findViewById(com.tencent.mm.R.id.pg6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.titleTxt = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
    }
}
