package nv3;

/* loaded from: classes5.dex */
public final class r implements p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a f422228d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f422229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nv3.t f422230f;

    public r(nv3.t tVar) {
        this.f422230f = tVar;
        if (!p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a.class.getClassLoader(), new java.lang.Class[]{p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener");
        }
        this.f422228d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a) newProxyInstance;
        this.f422229e = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (this.f422229e) {
            this.f422229e = false;
            nv3.t tVar = this.f422230f;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = tVar.f422238c;
            if (c22849x81a93d25 != null) {
                c22849x81a93d25.post(new nv3.q(tVar));
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void p3(android.view.View p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f422228d.p3(p07);
    }
}
