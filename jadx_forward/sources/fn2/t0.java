package fn2;

/* loaded from: classes10.dex */
public final class t0 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f345932d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f345933e;

    /* renamed from: f, reason: collision with root package name */
    public final fn2.u1 f345934f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f345935g;

    public t0(android.content.Context context, java.util.List tabs, fn2.u1 sourceScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabs, "tabs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        this.f345932d = context;
        this.f345933e = tabs;
        this.f345934f = sourceScene;
        this.f345935g = new android.util.SparseArray();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object any) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        container.removeView((android.view.View) any);
        this.f345935g.remove(i17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f345933e.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        android.content.Context context = this.f345932d;
        if (i17 == 0) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573351mo3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (i17 == 1) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573349mo1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 != 2) {
            return "";
        }
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mnn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        return string3;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        android.content.Context context = container.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        fn2.h1 h1Var = new fn2.h1(context, null, 0, this.f345934f, 6, null);
        container.addView(h1Var);
        this.f345935g.put(i17, h1Var);
        return h1Var;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object any) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, any);
    }
}
