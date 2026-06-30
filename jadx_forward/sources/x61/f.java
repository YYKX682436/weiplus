package x61;

/* loaded from: classes.dex */
public class f extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public f() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0);
        int i17 = sharedPreferences.getInt("new_launch_image_sub_type", 0);
        am.r2 r2Var = c5255x5f3208fd.f135586g;
        if (r2Var.f89292a == 43 && i17 > 0 && i17 == r2Var.f89293b) {
            java.lang.String str = r2Var.f89294c;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(723L, 6L, 1L, false);
            sharedPreferences.edit().putInt("new_launch_image_res_version", c5255x5f3208fd.f135586g.f89295d).commit();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckResUpdateListener", "filePath: %s", str);
            x61.a.b(str);
        }
        return false;
    }
}
