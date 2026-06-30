package g45;

/* loaded from: classes9.dex */
public abstract class c {
    public static final boolean a(oi3.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<this>");
        int m75939xb282bd08 = gVar.m75939xb282bd08(gVar.f427150d + 4);
        return m75939xb282bd08 == 3 || m75939xb282bd08 == 13 || m75939xb282bd08 == 23 || m75939xb282bd08 == 33 || m75939xb282bd08 == 39;
    }

    public static final j15.a b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        if (f9Var.H > 0 && f9Var.I > 0) {
            j15.a aVar = new j15.a();
            aVar.Y(f9Var.H);
            aVar.U(f9Var.I);
            return aVar;
        }
        j15.d dVar = new j15.d();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            j17 = "";
        }
        dVar.m126728xdc93280d(j17);
        if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.o().y())) && dVar.o().q() == 0 && dVar.o().n() == 0) {
            dVar.o().Y(dVar.o().I());
            dVar.o().U(dVar.o().F());
        }
        return dVar.o();
    }
}
