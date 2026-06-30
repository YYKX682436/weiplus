package p1;

/* loaded from: classes14.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.g0 f432338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p1.g0 g0Var) {
        super(1);
        this.f432338d = g0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(motionEvent, "motionEvent");
        yz5.l lVar = this.f432338d.f432353d;
        if (lVar != null) {
            lVar.mo146xb9724478(motionEvent);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onTouchEvent");
        throw null;
    }
}
