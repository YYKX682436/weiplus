package bm5;

/* loaded from: classes12.dex */
public final class a0 {
    public a0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final bm5.b0 a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2) {
        bm5.b0 b0Var = new bm5.b0();
        b0Var.f104065a = bm5.y.f104289i.a(f9Var, null);
        java.lang.String z07 = f9Var != null ? f9Var.z0() : null;
        if (z07 == null) {
            z07 = "";
        }
        b0Var.f104066b = z07;
        if (str == null) {
            str = "";
        }
        b0Var.f104067c = str;
        boolean A = r26.i0.A(str, "SERVERID://", false, 2, null);
        bm5.a0 a0Var = bm5.b0.f104064e;
        if (A) {
            b0Var.f104067c = a0Var.b(b0Var.f104067c, false);
        }
        if (str2 == null) {
            str2 = "";
        }
        b0Var.f104068d = str2;
        if (r26.i0.A(str2, "SERVERID://", false, 2, null)) {
            b0Var.f104068d = a0Var.b(b0Var.f104068d, true);
        }
        return b0Var;
    }

    public final java.lang.String b(java.lang.String svrIdName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(svrIdName, "svrIdName");
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            byte[] bytes = svrIdName.concat("_hd").getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            sb6.append(kk.k.g(bytes));
            sb6.append(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        byte[] bytes2 = svrIdName.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        sb7.append(kk.k.g(bytes2));
        sb7.append(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        return sb7.toString();
    }
}
