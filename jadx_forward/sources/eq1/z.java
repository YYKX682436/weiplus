package eq1;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final eq1.z f337409a = new eq1.z();

    public final com.p314xaae8f345.mm.p2621x8fb0427b.c1 a(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.c1 c1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.c1();
        if (str == null || r26.n0.N(str)) {
            return c1Var;
        }
        int L = r26.n0.L(str, "<sysmsg", 0, false, 6, null);
        java.util.Map map = null;
        if (L != -1) {
            java.lang.String substring = str.substring(L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            map = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(substring, "sysmsg", null);
        }
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPayAlbumLogic", "XmlParser values is null, msgContent %s", str);
            return c1Var;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.BizNotification.BizAccount.UserName");
        if (str2 == null) {
            str2 = "";
        }
        c1Var.f275330a = str2;
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.BizNotification.BizAccount.NickName");
        if (str3 == null) {
            str3 = "";
        }
        c1Var.f275331b = str3;
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.BizNotification.plain");
        if (str4 == null) {
            str4 = "";
        }
        c1Var.f275332c = str4;
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.BizNotification.BizAccount.HeadImgUrl");
        if (str5 == null) {
            str5 = "";
        }
        c1Var.f275333d = str5;
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.BizNotification.AppMsg.Title");
        if (str6 == null) {
            str6 = "";
        }
        c1Var.f275334e = str6;
        java.lang.String str7 = (java.lang.String) map.get(".sysmsg.BizNotification.AppMsg.WebUrl");
        c1Var.f275335f = str7 != null ? str7 : "";
        return c1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.Map r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.z.b(java.util.Map, java.lang.String):void");
    }
}
