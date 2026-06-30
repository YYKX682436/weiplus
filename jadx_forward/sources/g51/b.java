package g51;

/* loaded from: classes11.dex */
public final class b implements g51.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f350421a;

    public b(android.view.ViewGroup viewGroup) {
        this.f350421a = viewGroup;
    }

    @Override // g51.a
    public void a(android.view.View confettiView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confettiView, "confettiView");
        confettiView.invalidate();
    }

    @Override // g51.a
    public void b(com.p314xaae8f345.mm.p997x94b162ad.ViewOnLayoutChangeListenerC11317x5d86a76d confettiView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confettiView, "confettiView");
        if (confettiView.f153897e) {
            return;
        }
        confettiView.f153897e = true;
        android.view.ViewParent parent = confettiView.getParent();
        if (parent != null) {
            parent.requestLayout();
        }
    }

    @Override // g51.a
    public void c(android.view.View confettiView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confettiView, "confettiView");
        android.view.ViewParent parent = confettiView.getParent();
        android.view.ViewGroup viewGroup = this.f350421a;
        if (parent != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parent, viewGroup)) {
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(confettiView);
            }
        }
        if (viewGroup != null) {
            viewGroup.addView(confettiView);
        }
    }

    @Override // g51.a
    /* renamed from: getHeight */
    public int mo130911x1c4fb41d() {
        android.view.ViewGroup viewGroup = this.f350421a;
        if (viewGroup != null) {
            return viewGroup.getHeight();
        }
        return 0;
    }

    @Override // g51.a
    /* renamed from: getWidth */
    public int mo130912x755bd410() {
        android.view.ViewGroup viewGroup = this.f350421a;
        if (viewGroup != null) {
            return viewGroup.getWidth();
        }
        return 0;
    }
}
