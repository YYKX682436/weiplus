package gx2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f358869b;

    /* renamed from: c, reason: collision with root package name */
    public float f358870c;

    /* renamed from: d, reason: collision with root package name */
    public hx2.i f358871d;

    /* renamed from: e, reason: collision with root package name */
    public hx2.i f358872e;

    /* renamed from: f, reason: collision with root package name */
    public hx2.i f358873f;

    /* renamed from: k, reason: collision with root package name */
    public int f358878k;

    /* renamed from: a, reason: collision with root package name */
    public float f358868a = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f358874g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout.LayoutParams f358875h = new android.widget.FrameLayout.LayoutParams(-1, -1);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f358876i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final int f358877j = 2;

    public final gx2.a a(hx2.h callbackComponent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackComponent, "callbackComponent");
        ((java.util.HashSet) this.f358874g).add(callbackComponent);
        return this;
    }

    public final gx2.q b(android.view.ViewGroup root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (this.f358870c == 0.0f) {
            throw new java.lang.IllegalStateException("expandHeight should not be zero");
        }
        gx2.q qVar = new gx2.q(context, this);
        root.removeView(qVar);
        root.addView(qVar);
        return qVar;
    }
}
