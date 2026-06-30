package yv;

/* loaded from: classes11.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (!gm0.j1.a()) {
            return false;
        }
        if (!(abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5250x27a85c01)) {
            if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80) {
                ((y73.a0) i95.n0.c(y73.a0.class)).getClass();
                b83.s.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                fy5.a.d().b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).getInt("check_tinker_update_interval", 12));
                return false;
            }
            if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5260x2f017aaa) {
                ((y73.a0) i95.n0.c(y73.a0.class)).getClass();
                ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5260x2f017aaa) abstractC20979x809547d1).f135589g.getClass();
                gm0.j1.d().g(new z73.g("", "", null, false));
            }
            return false;
        }
        y73.a0 a0Var = (y73.a0) i95.n0.c(y73.a0.class);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5250x27a85c01 c5250x27a85c01 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5250x27a85c01) abstractC20979x809547d1;
        if (a0Var.f541232d) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_patch_msg_key", "");
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_patch_version_key", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SubCoreHotpatch", "v1:%s, v2:%s, wording:%s", java.lang.String.format("0x%08X", java.lang.Integer.valueOf(o45.wf.f424562g)), string2, string);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && java.lang.String.format("0x%08X", java.lang.Integer.valueOf(o45.wf.f424562g)).equalsIgnoreCase(string2)) {
                am.o2 o2Var = c5250x27a85c01.f135583g;
                o2Var.f89039a = true;
                o2Var.f89040b = string;
                y73.a.b(2);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_version_key", "").apply();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_msg_key", "").apply();
            }
            a0Var.f541232d = false;
        }
        return false;
    }
}
