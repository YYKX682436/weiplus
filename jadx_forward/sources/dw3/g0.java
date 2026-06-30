package dw3;

/* loaded from: classes5.dex */
public final class g0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f325743d = new java.util.HashMap();

    public final long a(java.lang.String tag, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.util.HashMap hashMap = this.f325743d;
        if (hashMap.get(tag) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordTimeCalculatePlugin", tag.concat(" miss start mark!!!"));
            return -1L;
        }
        java.lang.Long l17 = (java.lang.Long) hashMap.get(tag);
        if (l17 == null) {
            return -1L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (str != null) {
            tag = str;
        }
        sb6.append(tag);
        sb6.append(" cost time:");
        sb6.append(currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordTimeCalculatePlugin", sb6.toString());
        return currentTimeMillis;
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        this.f325743d.clear();
    }
}
