package fk3;

/* loaded from: classes8.dex */
public final class n implements ak3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fk3.o f345116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk3.e f345117b;

    public n(fk3.o oVar, jk3.e eVar) {
        this.f345116a = oVar;
        this.f345117b = eVar;
    }

    @Override // ak3.a
    public void a(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        ek3.d dVar = this.f345116a.f345120c;
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
        ek3.d dVar = this.f345116a.f345120c;
        if (dVar != null) {
            return dVar.p(ev6);
        }
        return false;
    }

    @Override // ak3.a
    public int e() {
        ek3.d dVar = this.f345116a.f345120c;
        if (dVar != null) {
            return dVar.f335119a;
        }
        return 0;
    }

    @Override // ak3.a
    /* renamed from: enableSwipeBack */
    public boolean mo2155xd71108fe() {
        fk3.o oVar = this.f345116a;
        if (oVar.f345123f == -1) {
            oVar.f345124g = ((jk3.b) this.f345117b).s();
            oVar.f345123f = 0L;
        }
        return oVar.f345124g && g();
    }

    @Override // ak3.a
    public void f(float f17) {
    }

    @Override // ak3.a
    public boolean g() {
        return this.f345117b.d();
    }

    @Override // ak3.a
    public int h(boolean z17) {
        return 0;
    }
}
