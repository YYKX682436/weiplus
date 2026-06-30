package bm5;

/* loaded from: classes12.dex */
public abstract class z {
    public static final java.lang.String a(bm5.y yVar, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(yVar, "<this>");
        long j17 = yVar.f22760c;
        if (j17 <= 0 || z18) {
            j17 = yVar.f22759b;
        }
        long j18 = j17;
        bm5.c0 c0Var = bm5.c0.f22550a;
        bm5.v vVar = yVar.f22763f;
        java.lang.String str = yVar.f22758a;
        if (str == null) {
            str = "";
        }
        return c0Var.e(vVar, str, j18, z17);
    }

    public static /* synthetic */ java.lang.String b(bm5.y yVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        return a(yVar, z17, z18);
    }

    public static final java.lang.String c(bm5.y yVar, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(yVar, "<this>");
        bm5.c0 c0Var = bm5.c0.f22550a;
        bm5.v vVar = yVar.f22763f;
        bm5.f0 f0Var = yVar.f22764g;
        java.lang.String str2 = yVar.f22758a;
        java.lang.String k17 = c0Var.k(vVar, f0Var, str2 == null ? "" : str2, false, yVar.f22760c, str, true, z17);
        if (com.tencent.mm.vfs.w6.j(k17)) {
            return k17;
        }
        long j17 = yVar.f22760c;
        if (j17 != 0) {
            return bm5.c0.m(c0Var, yVar.f22763f, yVar.f22764g, str2 == null ? "" : str2, false, j17, str, false, z17, 64, null);
        }
        return bm5.c0.m(c0Var, yVar.f22763f, yVar.f22764g, yVar.f22758a, true, yVar.f22759b, str, false, z17, 64, null);
    }

    public static /* synthetic */ java.lang.String d(bm5.y yVar, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = null;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return c(yVar, str, z17);
    }

    public static final java.lang.String e(bm5.y yVar) {
        kotlin.jvm.internal.o.g(yVar, "<this>");
        long j17 = yVar.f22760c;
        boolean z17 = j17 == 0;
        if (z17) {
            j17 = yVar.f22759b;
        }
        long j18 = j17;
        bm5.c0 c0Var = bm5.c0.f22550a;
        bm5.v vVar = yVar.f22763f;
        java.lang.String str = yVar.f22758a;
        if (str == null) {
            str = "";
        }
        return c0Var.o(vVar, str, j18, z17, false);
    }

    public static final java.lang.String f(bm5.y yVar) {
        kotlin.jvm.internal.o.g(yVar, "<this>");
        bm5.c0 c0Var = bm5.c0.f22550a;
        bm5.v vVar = yVar.f22763f;
        java.lang.String str = yVar.f22758a;
        if (str == null) {
            str = "";
        }
        return c0Var.o(vVar, str, yVar.f22759b, true, false);
    }

    public static java.lang.String g(bm5.y yVar, bm5.f0 f0Var, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        bm5.f0 f0Var2 = (i17 & 1) != 0 ? null : f0Var;
        java.lang.String str3 = (i17 & 2) != 0 ? null : str;
        java.lang.Boolean bool2 = (i17 & 4) != 0 ? java.lang.Boolean.TRUE : bool;
        java.lang.String str4 = (i17 & 8) == 0 ? str2 : null;
        boolean z18 = (i17 & 16) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(yVar, "<this>");
        bm5.x xVar = bm5.y.f22756i;
        java.lang.String str5 = yVar.f22758a;
        long j17 = yVar.f22759b;
        long j18 = yVar.f22760c;
        long j19 = yVar.f22761d;
        java.lang.String str6 = str3 == null ? yVar.f22762e : str3;
        bm5.v vVar = yVar.f22763f;
        if (f0Var2 == null) {
            f0Var2 = yVar.f22764g;
        }
        bm5.y c17 = xVar.c(str5, j17, j18, j19, str6, vVar, f0Var2);
        java.lang.String i18 = i(c17, null, bool2, false, 5, null);
        if (com.tencent.mm.vfs.w6.j(i18)) {
            return i18;
        }
        bm5.v vVar2 = bm5.v.f22743f;
        bm5.v vVar3 = yVar.f22763f;
        return vVar2 == vVar3 ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Vi(c17, null, null, z18, z18) : bm5.v.f22744g == vVar3 ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).qj(c17, z18) : bm5.v.f22745h == vVar3 ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Ui(c17, str4, z18) : bm5.v.f22746i != vVar3 ? bm5.v.f22747m == vVar3 ? i(c17, str4, null, false, 6, null) : bm5.v.f22748n == vVar3 ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Ri(c17) : bm5.v.f22749o == vVar3 ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).wj(c17, str3, true, z18) : i18 : i18;
    }

    public static java.lang.String h(bm5.y yVar, java.lang.Boolean bool, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        java.lang.Boolean bool2 = bool;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        kotlin.jvm.internal.o.g(yVar, "<this>");
        java.lang.String i18 = i(yVar, null, bool2, false, 5, null);
        if (com.tencent.mm.vfs.w6.j(i18)) {
            return i18;
        }
        bm5.v vVar = bm5.v.f22743f;
        bm5.v vVar2 = yVar.f22763f;
        if (vVar == vVar2 || bm5.v.f22746i == vVar2) {
            return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Vi(yVar, null, null, z18, z18);
        }
        if (bm5.v.f22744g == vVar2) {
            return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).qj(yVar, z18);
        }
        if (bm5.v.f22745h != vVar2) {
            return bm5.v.f22747m == vVar2 ? i(yVar, null, null, false, 7, null) : bm5.v.f22748n == vVar2 ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Ri(yVar) : bm5.v.f22749o == vVar2 ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).wj(yVar, yVar.f22762e, true, z18) : i18;
        }
        i95.m c17 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return tg3.u0.I5((tg3.u0) c17, yVar, null, z18, 2, null);
    }

    public static java.lang.String i(bm5.y yVar, java.lang.String str, java.lang.Boolean bool, boolean z17, int i17, java.lang.Object obj) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = (i17 & 1) != 0 ? null : str;
        java.lang.Boolean bool2 = (i17 & 2) != 0 ? java.lang.Boolean.FALSE : bool;
        boolean z18 = (i17 & 4) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(yVar, "<this>");
        long j17 = yVar.f22760c;
        java.lang.String str5 = yVar.f22758a;
        if (j17 != 0) {
            str2 = str5;
            str3 = bm5.c0.m(bm5.c0.f22550a, yVar.f22763f, yVar.f22764g, str5 == null ? "" : str5, false, j17, str4, z18, false, 128, null);
        } else {
            str2 = str5;
            str3 = "";
        }
        if (com.tencent.mm.vfs.w6.j(str3)) {
            return str3;
        }
        if (kotlin.jvm.internal.o.b(bool2, java.lang.Boolean.TRUE)) {
            long j18 = yVar.f22760c;
            if (j18 != 0) {
                java.lang.String k17 = bm5.c0.f22550a.k(yVar.f22763f, yVar.f22764g, str2 == null ? "" : str2, false, j18, str4, true, z18);
                if (com.tencent.mm.vfs.w6.j(k17)) {
                    return k17;
                }
            }
        }
        return bm5.c0.m(bm5.c0.f22550a, yVar.f22763f, yVar.f22764g, yVar.f22758a, true, yVar.f22759b, str4, false, z18, 64, null);
    }

    public static final java.lang.String j(bm5.y yVar) {
        kotlin.jvm.internal.o.g(yVar, "<this>");
        return "c2c://" + yVar.f22763f.f22753d + '&' + yVar.f22764g.f22578d + '&' + yVar.f22758a + '&' + yVar.f22759b + '&' + yVar.f22760c + '&' + yVar.f22761d + '&' + yVar.f22762e;
    }
}
