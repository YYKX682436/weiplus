package gr1;

/* loaded from: classes11.dex */
public final class h implements rk.e {
    public void b(int i17) {
        java.lang.String c17;
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0 l0Var = com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0.f299291c;
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f501403d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        l0Var.a(c17, 4, gr1.a.f356253a);
    }

    public void c(java.lang.String openid, int i17) {
        java.lang.String c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openid, "openid");
        if (openid.length() == 0) {
            return;
        }
        r45.ij5 ij5Var = new r45.ij5();
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f501403d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        ij5Var.f458633d = c17;
        ij5Var.f458634e = i17 == 5 ? r26.n0.Z(openid, "@picfansmsg") : r26.n0.Z(openid, "@bizfansmsg");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 25841;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mp/readfansmsg";
        lVar.f152197a = ij5Var;
        lVar.f152198b = new r45.jj5();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), gr1.b.f356254a);
    }
}
