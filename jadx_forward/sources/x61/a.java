package x61;

/* loaded from: classes.dex */
public class a implements vg3.r4 {
    public static void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChangeLaunchImageNewXmlListener", "filePath: %s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return;
        }
        java.lang.String str2 = lp0.b.e() + "splashWelcomeImg";
        if (com.p314xaae8f345.mm.vfs.w6.h(str2)) {
            com.p314xaae8f345.mm.vfs.w6.c(str, str2);
        }
    }

    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!str.equals("ChangeLaunchImage") || map == null) {
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.ChangeLaunchImage.BeginTime");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.ChangeLaunchImage.EndTime");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.ChangeLaunchImage.ResId.SubType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChangeLaunchImageNewXmlListener", "beginTime:%s,endTime:%s,subtype:%s", str2, str3, str4);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str2, str3, str4)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(723L, 5L, 1L, false);
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str4, 0);
        if (D1 > 0) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0);
            sharedPreferences.edit().putLong("new_launch_image_begin_time", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str2)).apply();
            sharedPreferences.edit().putInt("new_launch_image_sub_type", D1).apply();
            sharedPreferences.edit().putLong("new_launch_image_end_time", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str3)).commit();
            b(((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(43, D1));
        }
    }
}
