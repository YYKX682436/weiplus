package j55;

/* loaded from: classes8.dex */
public class e implements j45.k {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f379366d = java.util.Arrays.asList("FinderHomeAffinityUI", "FinderLiveSquareNewEntranceUI", "TingFlutterActivity", "TopStoryHomeUI", "NearbyUI", "LiteAppGameTabUI");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f379367e;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f379367e = hashMap;
        hashMap.put("find_friends_by_qrcode", "scan");
        hashMap.put("find_friends_by_shake", "shake");
        hashMap.put("find_friends_by_look", "topstories");
        hashMap.put("find_friends_by_search", ya.a.f77450x918d59a8);
        hashMap.put("find_friends_by_near", "peoplenearby");
        hashMap.put("jd_market_entrance", "shopping");
        hashMap.put("more_tab_game_recommend", "game");
        hashMap.put("app_brand_entrance", "weapp");
        hashMap.put("find_friends_by_finder", "finder");
        hashMap.put("find_friends_by_finder_live_above_look", "finder_live");
        hashMap.put("find_friends_by_finder_live", "finder_live");
        hashMap.put("ip_call_entrance", "wechat_out");
        hashMap.put("find_friends_by_ting", "ting");
        hashMap.put("find_friends_by_ting_play_state", "ting");
    }

    public static void c(java.lang.String str) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            str2 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20311x7de213f7());
        } catch (c01.c unused) {
            str2 = "https://weixin110.qq.com/security/acct/newreadtemplate?t=literegverify/index";
        }
        sb6.append(str2);
        sb6.append("&scene=%s");
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        objArr[0] = str;
        java.lang.String format = java.lang.String.format(sb7, objArr);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.p314xaae8f345.mm.ui.x7 x7Var) {
        boolean z17;
        java.util.Iterator it = f379366d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (str.contains((java.lang.String) it.next())) {
                z17 = true;
                break;
            }
        }
        if (!z17 || !c01.z1.B()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegisterPostVerifyInterceptor", "intercept!");
        c(null);
        return true;
    }
}
