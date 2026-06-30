package uu3;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public float f512809a;

    /* renamed from: b, reason: collision with root package name */
    public vu3.c f512810b;

    /* renamed from: c, reason: collision with root package name */
    public vu3.c f512811c;

    /* renamed from: d, reason: collision with root package name */
    public vu3.c f512812d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f512813e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout.LayoutParams f512814f = new android.widget.FrameLayout.LayoutParams(-1, -1);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f512815g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final int f512816h = 2;

    public final uu3.f a(vu3.i callbackComponent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackComponent, "callbackComponent");
        ((java.util.HashSet) this.f512813e).add(callbackComponent);
        return this;
    }

    public final uu3.u b(android.view.ViewGroup root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (this.f512809a == 0.0f) {
            throw new java.lang.IllegalStateException("expandHeight should not be zero");
        }
        uu3.u uVar = new uu3.u(context, this);
        root.removeView(uVar);
        root.addView(uVar);
        return uVar;
    }
}
