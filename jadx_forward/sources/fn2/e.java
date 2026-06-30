package fn2;

/* loaded from: classes5.dex */
public final class e extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f345779d;

    /* renamed from: e, reason: collision with root package name */
    public final int f345780e;

    /* renamed from: f, reason: collision with root package name */
    public final fn2.u1 f345781f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f345782g;

    public e(java.util.List tabs, int i17, fn2.u1 sourceScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabs, "tabs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        this.f345779d = tabs;
        this.f345780e = i17;
        this.f345781f = sourceScene;
        this.f345782g = new android.util.SparseArray();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object any) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        container.removeView((android.view.View) any);
        this.f345782g.remove(i17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f345779d.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        r45.in inVar = (r45.in) kz5.n0.a0(this.f345779d, i17);
        java.lang.String str = inVar != null ? inVar.f458690e : null;
        return str == null ? "" : str;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        r45.in inVar = (r45.in) this.f345779d.get(i17);
        android.content.Context context = container.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        fn2.s0 s0Var = new fn2.s0(context, null, 0, inVar, this.f345780e, this.f345781f, 6, null);
        container.addView(s0Var);
        this.f345782g.put(i17, s0Var);
        return s0Var;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object any) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, any);
    }
}
