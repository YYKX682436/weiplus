package jr1;

/* loaded from: classes11.dex */
public abstract class j {
    public static final java.lang.String a(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return !r26.i0.n(str, "@bizfansmsg", false) ? str.concat("@bizfansmsg") : str;
    }

    public static final java.lang.String b(java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return (i17 != 5 || r26.i0.n(str, "@picfansmsg", false)) ? (i17 != 0 || r26.i0.n(str, "@bizfansmsg", false)) ? str : str.concat("@bizfansmsg") : str.concat("@picfansmsg");
    }

    public static final java.lang.String c(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return !r26.i0.n(str, "@picfansmsg", false) ? str.concat("@picfansmsg") : str;
    }

    public static final java.lang.String d(java.lang.String str) {
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572270n55);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
        return g17;
    }

    public static final java.lang.String e(java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return (i17 == 5 && r26.i0.n(str, "@picfansmsg", false)) ? r26.n0.Z(str, "@picfansmsg") : (i17 == 0 && r26.i0.n(str, "@bizfansmsg", false)) ? r26.n0.Z(str, "@bizfansmsg") : str;
    }

    public static final void f(hr1.e eVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            eVar.f66325xea7a0fe2 = c(((ox.r) d0Var).Bi(2).c());
            eVar.f66326xbed8694c = "bizphotofansnofiticationholder@picfansmsg";
            eVar.f66328x114ef53e = "bizphotofansnofiticationholder@picfansmsg";
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f501403d;
            eVar.f66325xea7a0fe2 = a(((ox.r) d0Var2).Bi(1).c());
            eVar.f66326xbed8694c = "bizfansnofiticationholder@bizfansmsg";
            eVar.f66328x114ef53e = "bizfansnofiticationholder@bizfansmsg";
        }
        eVar.f66329x2262335f = 1;
        eVar.f66323xa97e89ae = 100L;
    }
}
