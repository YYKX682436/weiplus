package j81;

@j95.b
/* loaded from: classes7.dex */
public final class a extends i95.w implements x71.m {

    /* renamed from: d, reason: collision with root package name */
    public int f379671d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f379672e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f379673f = new java.util.concurrent.ConcurrentHashMap();

    public void wi(java.lang.String appid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandXNetSessionMgr", "release appid:".concat(appid));
        java.util.Iterator it = this.f379673f.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getValue(), appid)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandXNetSessionMgr", "key is " + ((java.lang.Number) entry.getKey()).intValue() + ", value is " + ((java.lang.String) entry.getValue()));
                x71.o oVar = (x71.o) this.f379672e.get(entry.getKey());
                if (oVar != null) {
                    oVar.close();
                }
                it.remove();
            }
        }
    }
}
