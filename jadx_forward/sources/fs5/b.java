package fs5;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr5.g0 f347884d;

    public b(fs5.c cVar, tr5.g0 g0Var) {
        this.f347884d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        tr5.g0 g0Var = this.f347884d;
        if (g0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupResult".concat(" can not be null"));
        }
        tr5.q qVar = g0Var.f503026e;
        if (!(qVar instanceof fs5.c)) {
            or5.b.e("lookupResult.stat is not instanceof StatisticsMerge", new java.lang.Object[0]);
            return;
        }
        fs5.c cVar = (fs5.c) qVar;
        bs5.g gVar = cVar.f347891m;
        if (gVar.f105569s) {
            gs5.c.a(g0Var);
        } else if (gs5.f.f356701a.f393093o) {
            if (gVar.f105562i == 2) {
                gs5.f.a("HDNSLookupExpiredAsyncRetry", g0Var);
            } else {
                gs5.f.a("HDNSLookupExpiredAsync", g0Var);
            }
        } else {
            if (gVar.f347882f <= 0 || cVar.f347890i.f347882f <= 0) {
                return;
            }
            if (gVar.f105562i == 2) {
                gs5.f.a("HDNSGetHostByNameRetry", g0Var);
            } else {
                gs5.f.a("HDNSGetHostByName", g0Var);
            }
        }
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(20);
        arrayMap.put("channel", cVar.f347888g);
        arrayMap.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, cVar.f347885d);
        arrayMap.put("domain", cVar.f347886e);
        if (!cVar.f347887f.equals(cVar.f347886e)) {
            arrayMap.put("request_domain", cVar.f347887f);
        }
        arrayMap.put("net_stack", java.lang.String.valueOf(cVar.f347889h));
        arrayMap.put("ldns_ip", sr5.a.f(cVar.f347890i.f347880d, ","));
        arrayMap.put("ldns_time", java.lang.String.valueOf(cVar.f347890i.f347882f));
        arrayMap.put("isCache", java.lang.String.valueOf(cVar.f347891m.f105569s));
        arrayMap.put("hdns_err_code", java.lang.String.valueOf(cVar.f347891m.f105562i));
        arrayMap.put("hdns_err_msg", cVar.f347891m.f105563m);
        arrayMap.put("hdns_ip", sr5.a.f(cVar.f347891m.f347880d, ","));
        arrayMap.put("ttl", java.lang.String.valueOf(cVar.f347891m.f105565o));
        arrayMap.put("clientIP", cVar.f347891m.f105564n);
        arrayMap.put("hdns_time", java.lang.String.valueOf(cVar.f347891m.f347882f));
        arrayMap.put("hdns_retry", java.lang.String.valueOf(cVar.f347891m.f105568r));
        arrayMap.put("status_code", java.lang.String.valueOf(cVar.f347891m.f105572v));
        arrayMap.put("sdk_Version", "4.11.0a");
        arrayMap.put("appID", gs5.f.f356701a.f393080b);
        arrayMap.put(dm.i4.f66865x76d1ec5a, gs5.f.f356701a.f393081c.f105589b);
        gs5.f.c("HDNSGetHostByName", arrayMap);
    }
}
