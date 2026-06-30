package rk3;

/* loaded from: classes3.dex */
public final class f extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f478049d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f478050e;

    public f(rk3.i iVar, android.view.View multiTaskView, android.view.View launcherView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskView, "multiTaskView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launcherView, "launcherView");
        this.f478049d = multiTaskView;
        this.f478050e = launcherView;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        container.removeView((android.view.View) object);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return 2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        android.view.View view = i17 == 0 ? this.f478049d : this.f478050e;
        container.removeView(view);
        container.addView(view);
        return view;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, obj);
    }
}
