package bn0;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f104306a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f104307b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f104308c;

    public c(java.lang.String suffix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        this.f104306a = suffix;
        this.f104307b = "LightPushKV.InnerKV";
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        int i17;
        if (this.f104308c == null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                i17 = gm0.j1.b().h();
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
                i17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f104307b, "Should call this in main process or push process.");
                i17 = 0;
            }
            synchronized (this) {
                if (this.f104308c == null && i17 != 0) {
                    java.util.HashMap hashMap = gm0.b0.f354680t;
                    java.lang.String str = gm0.b0.i(i17) + "/mmkv_private/";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f104307b, "mmkvPrivatePath " + str);
                    java.lang.String str2 = "LightPushMMKV_" + this.f104306a;
                    this.f104308c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.o4(str2, str, 2, com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m83999x8c190b4c(str2, 2, (java.lang.String) null, str));
                }
            }
        }
        if (this.f104308c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f104307b, "_Kv of '" + this.f104306a + "' is null");
        }
        return this.f104308c;
    }
}
