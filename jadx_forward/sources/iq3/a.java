package iq3;

/* loaded from: classes12.dex */
public abstract class a {
    public static final boolean a() {
        return (d11.b.c() ^ true) && b();
    }

    public static final boolean b() {
        boolean m40092xb9aa8b5f;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatImgAutoDownload"), 1);
        if (P == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "settings is not auto download C2C image. ChatImgAutoDownload : " + P);
            return false;
        }
        if ((P == 2 && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) || P != 1) {
            return false;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474792f) {
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
        } else if (r75.d.f474790d == -100) {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
            r75.d.f474790d = m40067xab9ed241;
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(r75.d.f474790d);
        }
        if (m40092xb9aa8b5f) {
            return true;
        }
        long P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatImgAutoDownloadMax"), 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG;
        long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c17.m(u3Var, null), 0L);
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) android.text.format.DateFormat.format("M", java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_DATE_LONG;
        if (E1 != com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c18.m(u3Var2, null), 0L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "update month %d ", java.lang.Long.valueOf(E1));
            gm0.j1.u().c().x(u3Var, 0L);
            gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(E1));
            k17 = 0;
        }
        if (k17 <= P2 || P2 <= 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "this month had auto download " + k17 + " C2C image, can not auto download.");
        return false;
    }

    public static final boolean c(java.lang.String str) {
        return (c01.e2.J(str) && c01.e2.Q(str)) || (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) && !c01.e2.I(str));
    }
}
