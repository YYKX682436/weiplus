package wm4;

@j95.b
/* loaded from: classes.dex */
public class z extends i95.w implements pm4.v {
    public void Ai(android.content.Context context, int i17, android.os.Bundle bundle, java.lang.String str, nw4.a aVar) {
        boolean z17;
        boolean z18;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_LAST_ENTER_TAB_REC_INT, 110);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1);
        java.util.Map map = aVar.f422323a;
        boolean z19 = false;
        if (map != null) {
            try {
                z17 = java.lang.Boolean.parseBoolean(java.lang.String.valueOf(map.get("isJumpTabFindWhenBack")));
                try {
                    z18 = java.lang.Boolean.parseBoolean(java.lang.String.valueOf(map.get("isJumpTabHaoKan")));
                } catch (java.lang.Exception e17) {
                    e = e17;
                    z18 = false;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                z17 = false;
                z18 = false;
            }
            try {
                if (map.containsKey("category")) {
                    bundle.putInt("key_forceEnterTabCategory", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(java.lang.String.valueOf(map.get("category")), -1));
                }
                bundle.putBoolean("key_is_jump_tab_find_when_back", z17);
                bundle.putBoolean("key_is_jump_tab_haokan", z18);
            } catch (java.lang.Exception e19) {
                e = e19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryUIServiceImpl", e, "startTopStoryHomeUI throw Exception", new java.lang.Object[0]);
                z19 = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryUIServiceImpl", "doHandleHaoKanAction: jumpToWow isJumpTabFindWhenBack:%s isJumpTabHaoKan:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18));
                wm4.u.u(context, i17, bundle, str, map);
            }
            z19 = z17;
        } else {
            map = new java.util.HashMap();
            z18 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryUIServiceImpl", "doHandleHaoKanAction: jumpToWow isJumpTabFindWhenBack:%s isJumpTabHaoKan:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18));
        wm4.u.u(context, i17, bundle, str, map);
    }

    public boolean wi() {
        return (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null)) || (((c01.z1.j() & 67108864) > 0L ? 1 : ((c01.z1.j() & 67108864) == 0L ? 0 : -1)) > 0)) ? false : true;
    }
}
