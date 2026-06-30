package lx;

/* loaded from: classes11.dex */
public final class s1 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f403473a;

    public s1(lx.y1 plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f403473a = new java.lang.ref.WeakReference(plugin);
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
        if (((lx.y1) this.f403473a.get()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "onAppBrandPreconditionError");
        }
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        if (((lx.y1) this.f403473a.get()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "onAppBrandUIEnter");
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
    }
}
