package i91;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f371234a = new java.util.HashMap();

    public void a(i91.b bVar) {
        if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f371224a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandMediaCdnItemManager", "item is null or local id is null, ignore this add");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppbrandMediaCdnItemManager", "add cdn item, local id : %s, file path : %s", bVar.f371224a, bVar.f371225b);
            this.f371234a.put(bVar.f371224a, bVar);
        }
    }
}
