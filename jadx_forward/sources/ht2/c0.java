package ht2;

/* loaded from: classes2.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f366347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.widget.TextView textView) {
        super(1);
        this.f366347d = textView;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.animation.Animator it = (android.animation.Animator) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.TextView textView = this.f366347d;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null && (animate = textView.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
            alpha.start();
        }
        return jz5.f0.f384359a;
    }
}
