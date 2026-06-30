package pg0;

@j95.b(m140513x1e06fd29 = {pg0.j2.class})
/* loaded from: classes9.dex */
public class s3 extends i95.w implements qg0.h0 {
    public java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str2)) {
            return str;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fj6) ? str : fj6;
    }

    public java.lang.String Bi(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str2)) {
            return str;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fj6)) {
            str3 = "";
        } else {
            str3 = "@" + fj6;
        }
        return str + str3;
    }

    public int Di(java.lang.String str, java.lang.String str2) {
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        if (com.p314xaae8f345.mm.ui.bk.C() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str = str2;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return -1;
        }
        if (str.contains("#")) {
            return android.graphics.Color.parseColor(str);
        }
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, -1L);
        if (V >= 0) {
            return android.graphics.Color.parseColor(java.lang.String.format("#%08x", java.lang.Long.valueOf(V)));
        }
        return -1;
    }

    public int Ni() {
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("OpenIMC2BPayTransferMeueGrayscaleStatus", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBaseUtil ", "getUnionTransferGrayscaleStatus:%d", java.lang.Integer.valueOf(b17));
        return b17;
    }

    public void Ri(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18) {
        gb3.m.f351553a = str;
        gb3.m.f351554b = str3;
        gb3.m.f351555c = str4;
        gb3.m.f351556d = i17;
        gb3.m.f351557e = i18;
        gb3.m.f351558f = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeExposureReport", "setData：openId %s, coverId: %s bizName:%s", str, str4, str2);
    }

    public boolean Ui(java.lang.String str) {
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        long z07 = ((u41.j) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).wi()).z0(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBaseUtil ", "showUnionTransferSessionEntry:%d", java.lang.Long.valueOf(z07));
        return (z07 & 8) > 0;
    }

    public void wi(java.lang.String str, java.lang.Long l17) {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.class) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a.put(str, l17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyUtil", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
