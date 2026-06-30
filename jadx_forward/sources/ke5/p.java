package ke5;

/* loaded from: classes9.dex */
public final class p extends ke5.a {
    @Override // ke5.a, hd5.k
    public void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, hd5.q qVar) {
        super.c(c21897x17252689, qVar);
        c21897x17252689.m79088x648e109b(true);
        c21897x17252689.m79085xcc8bf2ed(true);
    }

    @Override // ke5.a
    public he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar) {
        java.util.Objects.toString(nVar);
        ld5.b bVar = (ld5.b) ((jz5.n) this.f388574b.f542246h.f542271b).mo141623x754a37bb();
        pt0.e0 e0Var = pt0.f0.f439742b1;
        java.lang.String m75945x2fec8307 = bVar.m75945x2fec8307(bVar.f125235d + 1);
        java.util.List k17 = bVar.k();
        if (k17 == null) {
            k17 = kz5.p0.f395529d;
        }
        e0Var.getClass();
        pt0.f0 f0Var = (pt0.f0) i95.n0.c(pt0.f0.class);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ez.k1 k1Var = (ez.k1) f0Var;
        k1Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Long l17 = (java.lang.Long) kz5.n0.Z(k17);
        if (l17 != null) {
            long longValue = l17.longValue();
            l75.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().f275522r;
            java.lang.String P8 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().P8(longValue, m75945x2fec8307);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            for (java.lang.Object obj : k17) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                long longValue2 = ((java.lang.Number) obj).longValue();
                if (i17 > 0) {
                    sb6.append(",");
                }
                sb6.append(longValue2);
                i17 = i18;
            }
            android.database.Cursor f17 = k0Var.f("select * from " + P8 + " where msgId IN (" + ((java.lang.Object) sb6) + ") order by createTime ASC", null, 2);
            while (f17.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(f17);
                arrayList.add(f9Var);
            }
            f17.close();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.Z(arrayList);
        if (f9Var2 != null) {
            long m124847x74d37ac6 = f9Var2.m124847x74d37ac6();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
                pt0.e0 e0Var2 = pt0.f0.f439742b1;
                if (e0Var2.d() && f9Var2.m124847x74d37ac6() > 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f9Var2.Q0(), m75945x2fec8307) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, "talker-ignore")) {
                    java.lang.String p17 = e0Var2.p(new java.lang.Throwable());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFeatureService", "found different msgId:" + m124847x74d37ac6 + ", createTime:" + f9Var2.mo78012x3fdd41df() + " talker[" + f9Var2.Q0() + " -> " + m75945x2fec8307 + "], stack: " + p17);
                    ((ku5.t0) ku5.t0.f394148d).h(new ez.j1(f9Var2, p17, k1Var, m75945x2fec8307), "msg_talker_error_report");
                }
            }
        }
        long c17 = c01.id.c();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var3.A0() == 0) {
                f9Var3.d1(f9Var3.U1());
            }
            f9Var3.j1(1);
            f9Var3.e1(c17);
            c17++;
        }
        return new ke5.q(bVar, arrayList);
    }
}
