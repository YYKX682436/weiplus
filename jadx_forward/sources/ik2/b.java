package ik2;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static long f373386b;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f373390f;

    /* renamed from: a, reason: collision with root package name */
    public static final ik2.b f373385a = new ik2.b();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f373387c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f373388d = jz5.h.b(ik2.a.f373384d);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f373389e = "FinderMagicLiveCardTestConfigKey";

    public final java.lang.String a() {
        java.lang.String str;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_live_game_dynamic_frame_set_data, "", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFrameSetDataLoader", "exptGameFrameSetData:%s", Zi);
        if (android.text.TextUtils.isEmpty(Zi)) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt(dm.i4.f66865x76d1ec5a, "portrait_game_ai_interpreter");
            jSONObject.putOpt("parentId", "game_player_frame_set_container");
            jSONObject.putOpt("portrait", 1);
            jSONObject.putOpt("bit", 0);
            jSONObject.putOpt("marginRight", 12);
            jSONObject.putOpt("marginBottom", 4);
            jSONObject.putOpt("width", 84);
            jSONObject.putOpt("height", 20);
            jSONObject.putOpt("alignParentRight", 1);
            jSONObject.putOpt("alignParentBottom", 1);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            str = "";
            jSONObject2.putOpt(dm.i4.f66865x76d1ec5a, "landscape_game_bottom_right");
            jSONObject2.putOpt("parentId", "game_player_frame_set_container");
            jSONObject2.putOpt("landscape", 1);
            jSONObject2.putOpt("clearScreen", 1);
            jSONObject2.putOpt("bit", 3);
            jSONObject2.putOpt("marginRight", 24);
            jSONObject2.putOpt("marginBottom", 90);
            jSONObject2.putOpt("width", 136);
            jSONObject2.putOpt("height", 115);
            jSONObject2.putOpt("alignParentRight", 1);
            jSONObject2.putOpt("alignParentBottom", 1);
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFrameSetDataLoader", "loadDefaultConfig:%s", jSONArray.toString());
            Zi = jSONArray.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "toString(...)");
        } else {
            str = "";
        }
        if (zl2.q4.f555466a.E()) {
            java.lang.String u17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f373388d).mo141623x754a37bb()).u(f373389e, str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
            if (u17.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFrameSetDataLoader", "debugMode exptGameFrameSetData null");
            } else {
                f373390f = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFrameSetDataLoader", "debugMode exptGameFrameSetData not null:".concat(u17));
                Zi = u17;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
        return Zi;
    }
}
