package vh5;

/* loaded from: classes10.dex */
public final class j implements mg3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh5.k f518755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mg3.e f518756e;

    public j(vh5.k kVar, mg3.e eVar) {
        this.f518755d = kVar;
        this.f518756e = eVar;
    }

    @Override // mg3.e
    public void a(float f17, float f18) {
        mg3.e eVar;
        if (this.f518755d.f518760d || (eVar = this.f518756e) == null) {
            return;
        }
        eVar.a(f17, f18);
    }

    @Override // mg3.e
    public void d() {
        mg3.e eVar;
        if (this.f518755d.f518760d || (eVar = this.f518756e) == null) {
            return;
        }
        eVar.d();
    }

    @Override // mg3.e
    public boolean f(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        mg3.e eVar = this.f518756e;
        if (eVar != null) {
            return eVar.f(event);
        }
        return false;
    }

    @Override // mg3.e
    public boolean g(android.view.MotionEvent event) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        vh5.k kVar = this.f518755d;
        if (kVar.f518760d || (c21520x5bb48e5e = kVar.f518757a) == null) {
            return false;
        }
        return c21520x5bb48e5e.dispatchTouchEvent(event);
    }

    @Override // mg3.e
    public boolean i() {
        kg3.s sVar;
        vh5.s sVar2 = this.f518755d.f518759c;
        return (sVar2 == null || (sVar = sVar2.f518775d) == null || sVar.f389262i == 0) ? false : true;
    }
}
