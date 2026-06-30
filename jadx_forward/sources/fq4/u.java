package fq4;

/* loaded from: classes.dex */
public abstract class u {
    public static java.lang.String a(java.lang.String str, boolean z17) {
        java.lang.String str2;
        java.lang.String str3 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintLogic", "dbCachePath " + str3);
        if (str3.endsWith("/")) {
            str2 = str3 + str;
        } else {
            str2 = str3 + "/" + str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintLogic", "genpath " + str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        if (z17) {
            return str2;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            m17.f294799a.F(m17.f294800b);
        }
        return str2;
    }
}
