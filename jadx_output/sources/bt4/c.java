package bt4;

/* loaded from: classes3.dex */
public abstract class c {
    public static boolean a(java.lang.String str) {
        java.lang.String[] split;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MALL_THIRD_PARTY_DISCLAIMER_STRING, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || (split = str2.split(",")) == null || split.length == 0) {
            return false;
        }
        for (java.lang.String str3 : split) {
            if (str3.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void b(java.lang.String str) {
        java.lang.String[] split;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MALL_THIRD_PARTY_DISCLAIMER_STRING, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (split = str2.split(",")) != null && split.length != 0) {
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= split.length) {
                    break;
                }
                if (split[i17].equals(str)) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (z17) {
                str = str2;
            } else {
                str = str2 + "," + str;
            }
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MALL_THIRD_PARTY_DISCLAIMER_STRING, str);
    }
}
