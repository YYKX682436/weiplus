package gk3;

/* loaded from: classes8.dex */
public final class l implements ak3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk3.m f354056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk3.e f354057b;

    public l(gk3.m mVar, jk3.e eVar) {
        this.f354056a = mVar;
        this.f354057b = eVar;
    }

    @Override // ak3.a
    public void a(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        ek3.d dVar = this.f354056a.f354060c;
        if (dVar != null) {
            dVar.j(event);
        }
    }

    @Override // ak3.a
    public void c(int i17, int i18) {
    }

    @Override // ak3.a
    public boolean d(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        ek3.d dVar = this.f354056a.f354060c;
        if (dVar != null) {
            return dVar.p(ev6);
        }
        return false;
    }

    @Override // ak3.a
    public int e() {
        ek3.d dVar = this.f354056a.f354060c;
        if (dVar != null) {
            return dVar.f335119a;
        }
        return 0;
    }

    @Override // ak3.a
    /* renamed from: enableSwipeBack */
    public boolean mo2155xd71108fe() {
        gk3.m mVar = this.f354056a;
        if (mVar.f354064g == -1) {
            mVar.f354065h = ((jk3.b) this.f354057b).s();
            mVar.f354064g = 0L;
        }
        return mVar.f354065h;
    }

    @Override // ak3.a
    public void f(float f17) {
    }

    @Override // ak3.a
    public boolean g() {
        return this.f354057b.d();
    }

    @Override // ak3.a
    public int h(boolean z17) {
        return 0;
    }
}
