package if3;

/* loaded from: classes8.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.LinkedList f372689a;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: if3.a0.a():void");
    }

    public final java.lang.String b() {
        return gm0.j1.a() ? java.lang.String.format("%s/masssend_%s.ini", gm0.j1.u().h(), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()) : "";
    }

    public int c() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_mass_send_max_num, 500);
    }

    public void d(java.lang.String str) {
        java.util.Map d17;
        java.util.LinkedList linkedList;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "Festivals", null)) == null) {
            return;
        }
        if3.c0 c0Var = new if3.c0();
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".Festivals.Festival");
            sb6.append(i17 == 0 ? "" : java.lang.String.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            boolean containsKey = d17.containsKey(sb7);
            linkedList = c0Var.f372694e;
            if (!containsKey) {
                break;
            }
            if3.b0 b0Var = new if3.b0();
            b0Var.f372691d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.a0((java.lang.String) d17.get(sb7 + ".StartTime"), 0);
            b0Var.f372692e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.a0((java.lang.String) d17.get(sb7 + ".EndTime"), 0) + com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c;
            linkedList.add(b0Var);
            i17++;
        }
        c0Var.f372693d = linkedList.size();
        this.f372689a = linkedList;
        try {
            byte[] mo14344x5f01b1f6 = c0Var.mo14344x5f01b1f6();
            java.lang.String b17 = b();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MassSendService", "mass send config file path is null, return");
                return;
            }
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(b17);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                c01.d9.b().p().w(102408, java.lang.Boolean.FALSE);
            } else if (!com.p314xaae8f345.mm.vfs.w6.p(a17.m82499x9616526c()).equals(kk.k.g(mo14344x5f01b1f6))) {
                c01.d9.b().p().w(102408, java.lang.Boolean.FALSE);
            }
            com.p314xaae8f345.mm.vfs.w6.S(b17, mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MassSendService", e17, "", new java.lang.Object[0]);
        }
    }
}
