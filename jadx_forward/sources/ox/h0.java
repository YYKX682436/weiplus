package ox;

@j95.b
/* loaded from: classes4.dex */
public final class h0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f431016d = new java.util.concurrent.ConcurrentHashMap();

    public final java.lang.Long Ai(java.lang.String poiId) {
        java.lang.Long l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiId, "poiId");
        if ((poiId.length() == 0) || (l17 = (java.lang.Long) this.f431016d.get(poiId)) == null) {
            return null;
        }
        return java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - l17.longValue());
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        wi();
    }

    public final void wi() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f431016d;
        if (!concurrentHashMap.isEmpty()) {
            int size = concurrentHashMap.size();
            concurrentHashMap.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishMonitor", "clearAll: cleared " + size + " monitoring records");
        }
    }
}
