package eu1;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f338280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eu1.d f338281e;

    public c(eu1.d dVar, java.util.ArrayList arrayList) {
        this.f338281e = dVar;
        this.f338280d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = (java.util.Map) xt1.t0.Di().a("key_share_user_info_map");
        if (map == null) {
            map = new java.util.HashMap();
        }
        map.put(this.f338281e.f338282d, this.f338280d);
        xt1.t0.Di().b("key_share_user_info_map", map);
    }
}
