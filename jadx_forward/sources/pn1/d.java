package pn1;

/* loaded from: classes12.dex */
public class d implements on1.i {
    @Override // on1.i
    public boolean a(r45.ed edVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // on1.i
    public int b(java.lang.String str, r45.ed edVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, on1.a aVar) {
        f9Var.d1(edVar.f454816h.f454289d);
        java.lang.String str2 = edVar.f454814f.f454289d;
        java.lang.String str3 = edVar.f454815g.f454289d;
        if (((java.lang.String) tn1.f.f().e().b().l(2, null)).equals(str2)) {
            str2 = str3;
        }
        java.lang.String str4 = edVar.f454816h.f454289d;
        java.util.Map<java.lang.String, java.lang.String> d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str4, "msg", null);
        com.p314xaae8f345.mm.p2621x8fb0427b.g5 O = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).O(str4, str2);
        if (O == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupItemEmoji", "EmojiMsgInfo is null");
            return -1;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(O.f275487d);
        if (N == null) {
            N = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            n22.m.b(O, N);
            N.f68653x95b20dd4 = 65;
            aVar.f428330h = N;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = N;
        if (d17.get(".msg.emoji.$androidmd5") == null) {
            java.lang.String a17 = kn1.j.a(O.f275487d);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                O.f275487d = a17;
            }
        }
        java.lang.String str5 = O.f275490g;
        f9Var.m124850x7650bebc(47);
        if (!pt0.f0.f439742b1.e()) {
            f9Var.i1(O.f275487d);
        }
        r15.b bVar = new r15.b();
        try {
            bVar.m126733x88c2ee0f(d17, "msg");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupItemEmoji", th6, "recover parse extCommonInfo err", new java.lang.Object[0]);
        }
        f9Var.d1(com.p314xaae8f345.mm.p2621x8fb0427b.y4.e(O.f275485b, 0L, (c21053xdbf1e5f4.k() || c21053xdbf1e5f4.B1()) ? false : true, O.f275487d, false, bVar.n() != null ? bVar.m126747x696739c() : ""));
        if (!c21053xdbf1e5f4.E0()) {
            tn1.d e17 = tn1.f.f().e();
            if (e17.f502345o == 0) {
                throw new c01.c();
            }
            java.lang.String str6 = e17.f502346p + "emoji/";
            if (android.text.TextUtils.isEmpty(str5)) {
                kn1.k.F(edVar, 4, str6 + O.f275487d + "_thumb");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str6);
                sb6.append(O.f275487d);
                kn1.k.F(edVar, 5, sb6.toString());
            } else {
                com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str6 + str5);
                java.lang.String str7 = a18.f294812f;
                if (str7 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str7, false, false);
                    if (!str7.equals(l17)) {
                        a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
                    com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, m17);
                    if (m18.a()) {
                        m18.f294799a.r(m18.f294800b);
                    }
                }
                kn1.k.F(edVar, 4, str6 + str5 + "/" + O.f275487d + "_cover");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str6);
                sb7.append(str5);
                sb7.append("/");
                sb7.append(O.f275487d);
                kn1.k.F(edVar, 5, sb7.toString());
            }
        }
        return 1;
    }

    @Override // on1.i
    public int c(r45.ed edVar, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.util.LinkedList linkedList, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupItemEmoji", "msg:" + f9Var.j() + ", msgId:" + f9Var.m124847x74d37ac6() + ", svrId:" + f9Var.I0() + ", talker:" + f9Var.Q0());
        int length = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j()) ? 0 : f9Var.j().getBytes().length;
        java.lang.String trim = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j()).f277890e.trim();
        if (!kn1.k.g(trim)) {
            trim = com.p314xaae8f345.mm.p2621x8fb0427b.y4.c(f9Var.j());
            if (!kn1.k.g(trim)) {
                java.lang.String y07 = f9Var.y0();
                if (tn1.e.h(f9Var.Q0())) {
                    int indexOf = f9Var.j().indexOf(58);
                    if (f9Var.A0() != 1 && indexOf != -1) {
                        y07 = f9Var.j().substring(0, indexOf).trim();
                    }
                }
                f9Var.T0();
                java.lang.String b17 = kn1.j.b(f9Var, y07, tn1.e.h(f9Var.Q0()) ? f9Var.A0() != 1 ? f9Var.y0() : f9Var.T0() : f9Var.T0(), edVar);
                if (f9Var.A0() == 1 || !tn1.e.h(f9Var.Q0())) {
                    trim = b17;
                } else {
                    trim = y07 + " :\n " + b17;
                }
            }
        }
        if (trim == null || !kn1.k.f(trim)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(trim);
            return -1;
        }
        r45.du5 du5Var = new r45.du5();
        du5Var.c(trim);
        edVar.f454816h = du5Var;
        return length;
    }
}
