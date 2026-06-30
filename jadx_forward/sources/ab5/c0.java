package ab5;

/* loaded from: classes9.dex */
public abstract class c0 {
    public static java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(str);
        if (Bi != null && Bi.u0() != null) {
            return Bi.f68904x28d45f97;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        return null;
    }

    public static java.lang.String b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(str);
        if (Bi != null && Bi.u0() != null) {
            return Bi.u0().f387171m;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        return null;
    }

    public static java.lang.String c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(str);
        if (Bi != null) {
            return Bi.f68913x21f9b213;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        return null;
    }

    public static void d(android.content.Context context, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433 c6210x3f282433 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433();
        am.g00 g00Var = c6210x3f282433.f136460g;
        g00Var.f88257a = str;
        g00Var.f88258b = z17 ? 2 : 1;
        g00Var.f88259c = 2;
        c6210x3f282433.e();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.vi6 vi6Var = new r45.vi6();
        vi6Var.f469829f = str;
        vi6Var.f469828e = z17 ? 1 : 0;
        vi6Var.f469827d = 3;
        linkedList.add(vi6Var);
        c01.d9.e().a(1176, new ab5.a0(context, str, z17));
        ((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).getClass();
        c01.d9.e().g(new k01.z0(linkedList));
    }
}
