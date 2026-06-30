package ln3;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f401433a = jz5.h.b(ln3.g.f401432d);

    public final java.lang.String a(r45.vs2 vs2Var, r45.f03 f03Var) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "createBase64CoverRedDotInfo() called with: ctrlInfo = " + vs2Var + ", showInfo = " + f03Var);
            kn3.a aVar = new kn3.a();
            java.lang.String str = vs2Var != null ? vs2Var.f470023h : null;
            if (str == null) {
                str = "";
            }
            aVar.s(str);
            aVar.k(vs2Var != null ? vs2Var.f470020e : 0);
            aVar.n(f03Var.f455421e);
            if (vs2Var != null) {
                r45.xs2 xs2Var = new r45.xs2();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = vs2Var.f470021f;
                xs2Var.mo11468x92b714fd(gVar != null ? gVar.f273689a : null);
                aVar.o(pm0.v.u(xs2Var.m75942xfb822ef2(3)));
            }
            java.lang.String str2 = vs2Var != null ? vs2Var.f470032t : null;
            if (str2 == null) {
                str2 = "";
            }
            aVar.l(str2);
            java.lang.String str3 = f03Var.f455426m;
            if (str3 == null) {
                str3 = "";
            }
            aVar.p(str3);
            java.lang.String str4 = f03Var.f455425i;
            if (str4 == null) {
                str4 = "";
            }
            aVar.q(str4);
            aVar.r(f03Var.f455420d);
            aVar.j(vs2Var != null ? vs2Var.f470038z : 0);
            java.lang.String jSONObject = aVar.mo126745xcc31ba03().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "createBase64CoverRedDotInfo: ".concat(jSONObject));
            byte[] bytes = jSONObject.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
            return encodeToString;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewLife.NewLifeSyncHandler", e17, "createBase64CoverRedDotInfo exception", new java.lang.Object[0]);
            return "";
        }
    }
}
