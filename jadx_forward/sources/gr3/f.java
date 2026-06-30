package gr3;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final gr3.f f356390a = new gr3.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f356391b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static volatile java.lang.String f356392c = "";

    public final void a(java.lang.String pageId, java.lang.String key, java.lang.String eventAttributeKey, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageId, "pageId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventAttributeKey, "eventAttributeKey");
        a51.a aVar = (a51.a) f356391b.get(pageId);
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProfileTracerMgr", "addEvent: span not found for pageId=" + pageId + ", key=" + key);
            return;
        }
        if (!(eventAttributeKey.length() > 0)) {
            a51.a.a(aVar, key, 0L, null, 6, null);
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.b bVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.b();
        bVar.f298946d = eventAttributeKey;
        boolean[] zArr = bVar.f298951i;
        zArr[1] = true;
        bVar.f298948f = j17;
        zArr[3] = true;
        a51.a.a(aVar, key, 0L, kz5.b0.c(bVar), 2, null);
    }

    public final void b(java.lang.String pageId, java.lang.String externalParent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageId, "pageId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(externalParent, "externalParent");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createProfileSpan pageId=");
        sb6.append(pageId);
        sb6.append(", externalParent=");
        sb6.append(externalParent);
        sb6.append(", spanMapSize=");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f356391b;
        sb6.append(concurrentHashMap.size());
        sb6.append(", parentSpanId=");
        sb6.append(f356392c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileTracerMgr", sb6.toString());
        if (concurrentHashMap.isEmpty()) {
            if (externalParent.length() > 0) {
                f356392c = externalParent;
            }
            a51.a a17 = a51.c.a(a51.c.f83103a, "biz", "biz.profile.behavior", f356392c.length() > 0 ? f356392c : "", false, 8, null);
            concurrentHashMap.put(pageId, a17);
            if (f356392c.length() == 0) {
                f356392c = a17.f83098b;
            }
        } else if (externalParent.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileTracerMgr", "createProfileSpan reset chain, new externalParent=".concat(externalParent));
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                try {
                    ((a51.a) entry.getValue()).b();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizProfileTracerMgr", "clearAll error ending span " + str + ": " + e17.getMessage());
                }
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f356391b;
            concurrentHashMap2.clear();
            f356392c = "";
            f356392c = externalParent;
            concurrentHashMap2.put(pageId, a51.c.a(a51.c.f83103a, "biz", "biz.profile.behavior", f356392c, false, 8, null));
        } else {
            concurrentHashMap.put(pageId, a51.c.a(a51.c.f83103a, "biz", "biz.profile.behavior", f356392c, false, 8, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileTracerMgr", "createProfileSpan done, spanMapSize=" + f356391b.size() + ", parentSpanId=" + f356392c);
    }
}
