package p1;

/* loaded from: classes14.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.f0 f432341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.g0 f432342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p1.f0 f0Var, p1.g0 g0Var) {
        super(1);
        this.f432341d = f0Var;
        this.f432342e = g0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(motionEvent, "motionEvent");
        int actionMasked = motionEvent.getActionMasked();
        p1.g0 g0Var = this.f432342e;
        if (actionMasked == 0) {
            yz5.l lVar = g0Var.f432353d;
            if (lVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onTouchEvent");
                throw null;
            }
            this.f432341d.f432348f = ((java.lang.Boolean) lVar.mo146xb9724478(motionEvent)).booleanValue() ? p1.b0.Dispatching : p1.b0.NotDispatching;
        } else {
            yz5.l lVar2 = g0Var.f432353d;
            if (lVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onTouchEvent");
                throw null;
            }
            lVar2.mo146xb9724478(motionEvent);
        }
        return jz5.f0.f384359a;
    }
}
