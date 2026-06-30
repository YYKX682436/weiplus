package sn0;

/* loaded from: classes3.dex */
public final class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn0.b f491496d;

    public a(sn0.b bVar) {
        this.f491496d = bVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        sn0.b bVar = this.f491496d;
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 T = bVar.T();
        bVar.getClass();
        cl0.d dVar = new cl0.d();
        dVar.e("userId", bVar.D.f391119f);
        r45.rm1 rm1Var = bVar.M;
        dVar.e("songId", java.lang.Integer.valueOf(rm1Var != null ? rm1Var.m75939xb282bd08(0) : 0));
        r45.rm1 rm1Var2 = bVar.M;
        dVar.e("songType", java.lang.Integer.valueOf(rm1Var2 != null ? rm1Var2.m75939xb282bd08(2) : 0));
        r45.rm1 rm1Var3 = bVar.M;
        java.lang.Object m75945x2fec8307 = rm1Var3 != null ? rm1Var3.m75945x2fec8307(1) : null;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        dVar.e("listenId", m75945x2fec8307);
        dVar.e("playStatus", java.lang.Integer.valueOf(bVar.N ? 1 : 0));
        dVar.e("st", java.lang.Long.valueOf(c01.id.c()));
        cl0.g gVar = new cl0.g();
        try {
            hn0.u uVar = hn0.u.f363970e;
            gVar.s("wxT", 16);
            gVar.s("d", dVar.m15085x9616526c());
        } catch (cl0.f | java.io.IOException unused) {
        }
        gVar.toString();
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        byte[] bytes = gVar2.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        T.mo30315x1a3ef952(bytes, 1);
        return true;
    }
}
