package bn0;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f22773a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f22774b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.tencent.mm.sdk.platformtools.o4 f22775c;

    public c(java.lang.String suffix) {
        kotlin.jvm.internal.o.g(suffix, "suffix");
        this.f22773a = suffix;
        this.f22774b = "LightPushKV.InnerKV";
    }

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        int i17;
        if (this.f22775c == null) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                i17 = gm0.j1.b().h();
            } else if (com.tencent.mm.sdk.platformtools.x2.p()) {
                i17 = com.tencent.mm.network.x2.c().f71993n.f71902o;
            } else {
                com.tencent.mars.xlog.Log.w(this.f22774b, "Should call this in main process or push process.");
                i17 = 0;
            }
            synchronized (this) {
                if (this.f22775c == null && i17 != 0) {
                    java.util.HashMap hashMap = gm0.b0.f273147t;
                    java.lang.String str = gm0.b0.i(i17) + "/mmkv_private/";
                    com.tencent.mars.xlog.Log.i(this.f22774b, "mmkvPrivatePath " + str);
                    java.lang.String str2 = "LightPushMMKV_" + this.f22773a;
                    this.f22775c = new com.tencent.mm.sdk.platformtools.o4(str2, str, 2, com.tencent.mmkv.MMKV.mmkvWithID(str2, 2, (java.lang.String) null, str));
                }
            }
        }
        if (this.f22775c == null) {
            com.tencent.mars.xlog.Log.w(this.f22774b, "_Kv of '" + this.f22773a + "' is null");
        }
        return this.f22775c;
    }
}
