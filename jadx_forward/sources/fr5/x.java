package fr5;

/* loaded from: classes15.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er5.g f347563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f347564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(er5.g gVar, fr5.f0 f0Var) {
        super(1);
        this.f347563d = gVar;
        this.f347564e = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        er5.g gVar = this.f347563d;
        if (gVar.b(8)) {
            fr5.f0 f0Var = this.f347564e;
            if (!f0Var.f347473e && !f0Var.f347470b) {
                f0Var.f347471c = true;
                p3325xe03a0797.p3326xc267989b.l.d(f0Var.f347476h, null, null, new fr5.w(gVar, gVar.f337775c.i(zq5.m.a(e17.getX(), e17.getY())), null), 3, null);
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
