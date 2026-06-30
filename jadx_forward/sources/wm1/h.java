package wm1;

/* loaded from: classes11.dex */
public final class h {
    public final java.lang.String a(bw5.o50 o50Var) {
        java.lang.String m12487x8010e5e4;
        bw5.mc0 b17 = o50Var.b();
        if (b17 == null || (m12487x8010e5e4 = b17.m12487x8010e5e4()) == null) {
            return o50Var.L1[7] ? o50Var.f112496m : "";
        }
        return m12487x8010e5e4;
    }

    public final java.lang.String b(bw5.o50 o50Var) {
        o50Var.m12637xfb82e301();
        a(o50Var);
        o50Var.d();
        ot0.q qVar = new ot0.q();
        qVar.f430199i = 93;
        qVar.f430187f = o50Var.m12637xfb82e301();
        java.lang.String k17 = il4.d.k(o50Var);
        if (k17 == null) {
            k17 = "";
        }
        qVar.f430267z = k17;
        qVar.f430191g = a(o50Var);
        rk4.j jVar = rk4.m.f478367a;
        qVar.f430207k = rk4.m.f478368b;
        il4.a aVar = new il4.a();
        aVar.f373625b = o50Var.f112497n;
        aVar.f373626c = il4.d.e(o50Var);
        qVar.f(aVar);
        return ot0.q.u(qVar, null, null);
    }

    public final r45.xs4 c(bw5.lp0 lp0Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String m13170xcc16feb8;
        bw5.z90 j17;
        bw5.z90 j18;
        bw5.z90 j19;
        bw5.z90 j27;
        bw5.z90 j28;
        bw5.z90 j29;
        r45.xs4 xs4Var = new r45.xs4();
        xs4Var.set(4, rk4.j5.c(lp0Var));
        bw5.v70 d17 = lp0Var.d();
        java.lang.String str8 = "";
        if (d17 == null || (j29 = d17.j()) == null || (str = j29.o()) == null) {
            str = "";
        }
        xs4Var.set(14, str);
        bw5.v70 d18 = lp0Var.d();
        if (d18 == null || (j28 = d18.j()) == null || (str2 = j28.b()) == null) {
            str2 = "";
        }
        xs4Var.set(5, str2);
        bw5.v70 d19 = lp0Var.d();
        if (d19 == null || (j27 = d19.j()) == null || (str3 = j27.e()) == null) {
            str3 = "";
        }
        xs4Var.set(7, str3);
        bw5.z90 j37 = lp0Var.d().j();
        if (j37 == null || (str4 = j37.f()) == null) {
            str4 = "";
        }
        xs4Var.set(9, str4);
        bw5.z90 j38 = lp0Var.d().j();
        xs4Var.set(8, java.lang.Long.valueOf(j38 != null ? j38.f117428r : 0L));
        xs4Var.set(10, java.lang.Integer.valueOf(rk4.j5.e(lp0Var)));
        bw5.v70 d27 = lp0Var.d();
        if (d27 == null || (j19 = d27.j()) == null || (str5 = j19.j()) == null) {
            str5 = "";
        }
        xs4Var.set(11, str5);
        xs4Var.set(13, ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ni(rk4.j5.d(lp0Var)));
        bw5.v70 d28 = lp0Var.d();
        if (d28 == null || (j18 = d28.j()) == null || (str6 = j18.g()) == null) {
            str6 = "";
        }
        xs4Var.set(15, str6);
        xs4Var.set(16, rk4.j5.d(lp0Var));
        bw5.v70 d29 = lp0Var.d();
        if (d29 == null || (j17 = d29.j()) == null || (str7 = j17.d()) == null) {
            str7 = "";
        }
        xs4Var.set(6, str7);
        bw5.v70 d37 = lp0Var.d();
        xs4Var.set(18, java.lang.Integer.valueOf(d37 != null ? d37.f115722e : 0));
        xs4Var.set(19, rk4.l5.a(lp0Var));
        bw5.v70 d38 = lp0Var.d();
        if (d38 != null && (m13170xcc16feb8 = d38.m13170xcc16feb8()) != null) {
            str8 = m13170xcc16feb8;
        }
        xs4Var.set(20, str8);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMusicShareObject listenType: ");
        sb6.append(xs4Var.m75939xb282bd08(18));
        sb6.append(", listenId: ");
        bw5.v70 d39 = lp0Var.d();
        sb6.append(d39 != null ? d39.m13170xcc16feb8() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioShareHelper", sb6.toString());
        return xs4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r2 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(bw5.lp0 r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm1.h.d(bw5.lp0):java.lang.String");
    }
}
