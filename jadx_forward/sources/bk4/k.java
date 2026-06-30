package bk4;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final pj4.o1 f103029a;

    /* renamed from: b, reason: collision with root package name */
    public final bi4.d f103030b;

    /* renamed from: c, reason: collision with root package name */
    public final bi4.b f103031c;

    /* renamed from: d, reason: collision with root package name */
    public final mj4.h f103032d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f103033e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f103034f;

    public k(android.widget.ImageView iv6, pj4.o1 o1Var, bi4.d iconType, bi4.b iconColor, mj4.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iv6, "iv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconColor, "iconColor");
        this.f103029a = o1Var;
        this.f103030b = iconType;
        this.f103031c = iconColor;
        this.f103032d = hVar;
        this.f103033e = z17;
        this.f103034f = new java.lang.ref.WeakReference(iv6);
    }

    public final pj4.g0 a() {
        pj4.g0 h17;
        pj4.o1 o1Var = this.f103029a;
        if (o1Var != null && (h17 = bk4.g0.h(o1Var)) != null) {
            return h17;
        }
        mj4.h hVar = this.f103032d;
        pj4.o0 a17 = hVar != null ? xe0.j0.a(hVar, false, 1, null) : null;
        if (a17 == null) {
            return null;
        }
        if (this.f103033e) {
            pj4.x c17 = mj4.d.c(a17);
            if (c17 != null) {
                return bk4.g0.g(c17);
            }
            return null;
        }
        java.util.LinkedList linkedList = a17.f436752m;
        if (linkedList != null) {
            return bk4.g0.f(linkedList);
        }
        return null;
    }

    public final void b(java.lang.String str, boolean z17) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f103034f.get();
        if (imageView == null) {
            return;
        }
        if (str == null || r26.n0.N(str)) {
            return;
        }
        imageView.setTag(com.p314xaae8f345.mm.R.id.nwm, str);
        bk4.f0.f102998a.a0(str, new bk4.j(this, str, z17));
    }
}
