package nm3;

@j95.b
/* loaded from: classes11.dex */
public final class e extends i95.w implements qk.z8 {
    public java.lang.String wi(bw5.lp0 tingItem) {
        bw5.e70 g17;
        bw5.e70 g18;
        bw5.e70 g19;
        java.lang.String m11811xb5887159;
        bw5.z90 j17;
        bw5.z90 j18;
        bw5.z90 j19;
        bw5.z90 j27;
        bw5.z90 j28;
        bw5.z90 j29;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItem, "tingItem");
        r45.hf2 hf2Var = new r45.hf2();
        hf2Var.set(0, tingItem.d().m13171x7531c8a2());
        hf2Var.set(1, tingItem.d().c());
        hf2Var.set(2, rk4.j5.k(tingItem));
        hf2Var.set(4, rk4.j5.l(tingItem));
        hf2Var.set(3, rk4.j5.a(tingItem));
        hf2Var.set(5, tingItem.d().m13170xcc16feb8());
        bw5.v70 d17 = tingItem.d();
        java.lang.String str = null;
        hf2Var.set(6, (d17 == null || (j29 = d17.j()) == null) ? null : j29.g());
        bw5.v70 d18 = tingItem.d();
        hf2Var.set(7, (d18 == null || (j28 = d18.j()) == null) ? null : j28.b());
        hf2Var.set(8, tingItem.d().f());
        bw5.v70 d19 = tingItem.d();
        hf2Var.set(9, (d19 == null || (j27 = d19.j()) == null) ? null : j27.e());
        bw5.v70 d27 = tingItem.d();
        hf2Var.set(13, (d27 == null || (j19 = d27.j()) == null) ? null : j19.f());
        bw5.v70 d28 = tingItem.d();
        hf2Var.set(12, (d28 == null || (j18 = d28.j()) == null) ? null : j18.d());
        hf2Var.set(14, java.lang.Integer.valueOf(rk4.j5.e(tingItem)));
        bw5.v70 d29 = tingItem.d();
        hf2Var.set(18, (d29 == null || (j17 = d29.j()) == null) ? null : j17.j());
        fm3.u uVar = new fm3.u();
        uVar.f345669p = 1;
        uVar.f345658e = tingItem.d().f();
        try {
            bw5.v70 d37 = tingItem.d();
            uVar.f345656c = (d37 == null || (g19 = d37.g()) == null || (m11811xb5887159 = g19.m11811xb5887159()) == null) ? null : java.lang.Long.valueOf(r26.q0.c(m11811xb5887159));
        } catch (java.lang.NumberFormatException unused) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parse failed:");
            bw5.v70 d38 = tingItem.d();
            sb6.append((d38 == null || (g17 = d38.g()) == null) ? null : g17.m11811xb5887159());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMvServicesImpl", sb6.toString());
        }
        bw5.v70 d39 = tingItem.d();
        if (d39 != null && (g18 = d39.g()) != null) {
            str = g18.b();
        }
        uVar.f345657d = str;
        return lm3.c0.a(hf2Var, uVar);
    }
}
