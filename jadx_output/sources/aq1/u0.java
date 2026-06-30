package aq1;

/* loaded from: classes12.dex */
public class u0 implements vg3.a4, vg3.u3 {
    public java.lang.String a(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String Q0 = f9Var.Q0();
        ((qv.o) u2Var).getClass();
        if (!r01.z.g(Q0)) {
            return c01.ia.f(f9Var);
        }
        java.lang.String str2 = s01.r.f401924a;
        if (str2 == null) {
            return null;
        }
        int indexOf = str2.indexOf("<climsgid>");
        if (indexOf < 0) {
            return str2;
        }
        int i17 = indexOf + 10;
        int indexOf2 = str2.indexOf("</climsgid>", i17 + 1);
        if (indexOf2 < 0) {
            return str2;
        }
        java.lang.String substring = str2.substring(i17, indexOf2);
        if (android.text.TextUtils.isEmpty(s01.r.f401925b) || !substring.contains(s01.r.f401925b)) {
            str = substring + s01.r.f401926c.incrementAndGet();
        } else {
            str = s01.r.c(s01.r.f401925b);
        }
        return str2.substring(0, i17) + str + str2.substring(indexOf2);
    }

    @Override // vg3.a4
    public void j(r45.ll4 ll4Var, com.tencent.mm.storage.f9 f9Var) {
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String Q0 = f9Var.Q0();
        ((qv.o) u2Var).getClass();
        if (!r01.z.g(Q0)) {
            ll4Var.f379577i = f9Var.G;
            return;
        }
        java.lang.String str = f9Var.G;
        ll4Var.f379577i = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ll4Var.f379577i = ((aq1.d1) po.a.f357279a).a(f9Var);
        }
    }
}
