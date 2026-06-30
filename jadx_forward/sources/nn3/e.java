package nn3;

/* loaded from: classes2.dex */
public class e implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f420211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nn3.f f420212b;

    public e(nn3.f fVar, java.util.Map map) {
        this.f420212b = fVar;
        this.f420211a = map;
    }

    @Override // gy1.b
    public void a(long j17, java.lang.String str, java.util.Map map) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str2 = "newlife_" + str;
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean equals = "session_in".equals(str);
        java.util.Map map2 = this.f420211a;
        nn3.f fVar = this.f420212b;
        if (equals) {
            fVar.f420218h = java.lang.Long.valueOf(j17);
            if (nn3.f.wi(fVar, str, map).booleanValue()) {
                return;
            }
            for (java.lang.String str3 : map2.keySet()) {
                if (!u46.l.e(str3) && (obj2 = map2.get(str3)) != null) {
                    hashMap.put(str3, obj2);
                }
            }
            java.lang.String Ai = nn3.f.Ai(fVar, map);
            if (Ai != null) {
                hashMap.put("newlife_sdk_sessionId", Ai);
            }
            hashMap.put("in_time", java.lang.Long.valueOf(j17));
            fVar.Ni(str2, null, hashMap, false);
            return;
        }
        if ("session_out".equals(str)) {
            java.lang.Long l17 = fVar.f420218h;
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            fVar.getClass();
            if (l17.longValue() > 0 && valueOf.longValue() > 0 && valueOf.longValue() >= l17.longValue()) {
                fVar.f420219i = java.lang.Long.valueOf(fVar.f420219i.longValue() + (valueOf.longValue() - l17.longValue()));
            }
            if (nn3.f.wi(fVar, str, map).booleanValue()) {
                return;
            }
            for (java.lang.String str4 : map2.keySet()) {
                if (!u46.l.e(str4) && (obj = map2.get(str4)) != null) {
                    hashMap.put(str4, obj);
                }
            }
            java.lang.String Ai2 = nn3.f.Ai(fVar, map);
            if (Ai2 != null) {
                hashMap.put("newlife_sdk_sessionId", Ai2);
            }
            hashMap.put("stay_time_ms", fVar.f420219i);
            hashMap.put("out_time", java.lang.Long.valueOf(j17));
            fVar.f420218h = 0L;
            fVar.f420219i = 0L;
            fVar.Ni(str2, null, hashMap, false);
        }
    }
}
