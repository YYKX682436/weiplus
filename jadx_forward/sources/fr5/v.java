package fr5;

/* loaded from: classes15.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f347559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fr5.f0 f0Var) {
        super(1);
        this.f347559d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        this.f347559d.f347472d = new zq5.l(zq5.m.a(e17.getX(), e17.getY()));
        return java.lang.Boolean.TRUE;
    }
}
