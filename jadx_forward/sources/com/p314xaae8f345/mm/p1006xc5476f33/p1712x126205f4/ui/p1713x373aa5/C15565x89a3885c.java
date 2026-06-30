package com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/view/KeyEventFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnKeyListener;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setOnKeyListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.view.KeyEventFrameLayout */
/* loaded from: classes5.dex */
public final class C15565x89a3885c extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnKeyListener f218886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15565x89a3885c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.View.OnKeyListener onKeyListener;
        if (keyEvent != null && (onKeyListener = this.f218886d) != null) {
            onKeyListener.onKey(this, keyEvent.getKeyCode(), keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void setOnKeyListener(android.view.View.OnKeyListener onKeyListener) {
        this.f218886d = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15565x89a3885c(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
