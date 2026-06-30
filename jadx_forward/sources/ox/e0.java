package ox;

@j95.b
/* loaded from: classes4.dex */
public final class e0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f430996d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f430997e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f430998f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f430999g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f431000h = com.p314xaae8f345.mm.vfs.q7.c("bizcache") + "/sns_publish_tmp/";

    public final java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        return str + '_' + str2;
    }

    public final tk.y Bi(java.lang.String localSnsId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localSnsId, "localSnsId");
        if (localSnsId.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizSnsPublishHelper", "getSnsPublishedInfo, localSnsId is empty");
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f430997e;
        if (concurrentHashMap.containsKey(localSnsId)) {
            return (tk.y) concurrentHashMap.get(localSnsId);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizSnsPublishHelper", "getSnsPublishedInfo, localSnsId " + localSnsId + " not found in cache");
        return null;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        wi();
    }

    public final void wi() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f430996d;
        if (!concurrentHashMap.isEmpty()) {
            int size = concurrentHashMap.size();
            concurrentHashMap.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishHelper", "clearAllMomentPoiInfoCache, cleared " + size + " items");
        }
        ((ox.h0) i95.n0.c(ox.h0.class)).wi();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f430997e;
        if (!concurrentHashMap2.isEmpty()) {
            int size2 = concurrentHashMap2.size();
            concurrentHashMap2.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishHelper", "clearAllMomentPicInfoCache, cleared " + size2 + " items");
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = this.f430998f;
        if (!concurrentHashMap3.isEmpty()) {
            int size3 = concurrentHashMap3.size();
            concurrentHashMap3.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishHelper", "clearAllPhotoPathCache, cleared " + size3 + " items");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishHelper", "clearAllSnsPublishedInfo, cleared all cache");
    }
}
