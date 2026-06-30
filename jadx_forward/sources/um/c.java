package um;

/* loaded from: classes10.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f510204a = new java.util.HashMap();

    public c(com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2 c10322x22f91ed2) {
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistCacheManager", "clearAll: ");
        java.util.Iterator it = this.f510204a.entrySet().iterator();
        while (it.hasNext()) {
            ((um.m) ((java.util.Map.Entry) it.next()).getValue()).mo168220xac79a11b();
        }
    }

    public um.m b(dl.a aVar) {
        java.util.HashMap hashMap = this.f510204a;
        if (!hashMap.containsKey(aVar)) {
            int ordinal = aVar.ordinal();
            um.m tVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 6 ? ordinal != 7 ? null : new um.t() : new um.l() : new um.d() : new um.g() : new um.s() : new um.e();
            if (tVar != null) {
                tVar.mo168219x3e5a77bb();
            }
            if (tVar != null && !hashMap.containsKey(aVar)) {
                hashMap.put(aVar, tVar);
            }
        }
        return (um.m) hashMap.get(aVar);
    }
}
