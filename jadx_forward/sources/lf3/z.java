package lf3;

/* loaded from: classes10.dex */
public final class z implements mg3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mg3.e f399879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf3.c0 f399880e;

    public z(mg3.e eVar, lf3.c0 c0Var) {
        this.f399879d = eVar;
        this.f399880e = c0Var;
    }

    @Override // mg3.e
    public void a(float f17, float f18) {
        mg3.e eVar = this.f399879d;
        if (eVar != null) {
            eVar.a(f17, f18);
        }
    }

    @Override // mg3.e
    public void d() {
        mg3.e eVar = this.f399879d;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // mg3.e
    public boolean f(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        mg3.e eVar = this.f399879d;
        if (eVar != null) {
            return eVar.f(event);
        }
        return false;
    }

    @Override // mg3.e
    public boolean g(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399880e.f399843d;
        if (c22956x1a4bbf4 != null) {
            return c22956x1a4bbf4.dispatchTouchEvent(event);
        }
        return false;
    }

    @Override // mg3.e
    public boolean i() {
        return this.f399880e.f399846g.f389262i != 0;
    }
}
