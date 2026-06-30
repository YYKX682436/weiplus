package kr5;

/* loaded from: classes13.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393102d;

    public o(java.lang.String str) {
        this.f393102d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String b17 = kr5.c.c().b();
        tr5.e0 e0Var = new tr5.e0();
        e0Var.c(kr5.p.f393103a);
        e0Var.e(this.f393102d);
        e0Var.g(kr5.p.f393104b.f393082d);
        e0Var.d(b17);
        e0Var.f(kr5.p.f393104b.f393081c);
        e0Var.b(kr5.p.f393104b.f393087i);
        e0Var.f502998g = false;
        e0Var.f502999h = kr5.p.f393104b.f393089k;
        e0Var.f503001j = true;
        e0Var.f503003l = true;
        tr5.g0 f17 = tr5.l.f(e0Var.a());
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(16);
        fs5.c cVar = (fs5.c) f17.f503026e;
        if (cVar.f347891m.f105562i == 2) {
            gs5.f.a("HDNSPreLookupRetry", f17);
        } else {
            gs5.f.a("HDNSPreLookup", f17);
        }
        arrayMap.put("channel", gs5.f.f356701a.f393087i);
        arrayMap.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, cVar.f347885d);
        arrayMap.put("domain", cVar.f347886e);
        arrayMap.put("net_stack", java.lang.String.valueOf(cVar.f347889h));
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
        gs5.f.c("HDNSPreLookup", arrayMap);
    }
}
