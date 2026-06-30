package in0;

/* loaded from: classes3.dex */
public final class b implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in0.q f374275d;

    public b(in0.q qVar) {
        this.f374275d = qVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        in0.q qVar = this.f374275d;
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 T = qVar.T();
        cl0.g X0 = qVar.X0();
        qVar.Y0(X0, qVar.U().f555852w);
        java.lang.String gVar = X0.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        byte[] bytes = gVar.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        T.mo30315x1a3ef952(bytes, 1);
        return true;
    }
}
