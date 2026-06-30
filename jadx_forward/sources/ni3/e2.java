package ni3;

/* loaded from: classes12.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f419106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f419107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ni3.c1 f419108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f419109g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ni3.f1 f419110h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f419111i;

    public e2(ni3.g2 g2Var, java.util.Map map, ni3.c1 c1Var, com.p314xaae8f345.mm.vfs.r6 r6Var, ni3.f1 f1Var) {
        this.f419111i = g2Var;
        this.f419107e = map;
        this.f419108f = c1Var;
        this.f419109g = r6Var;
        this.f419110h = f1Var;
        this.f419106d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f419107e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(map.size());
        ni3.c1 c1Var = this.f419108f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv true scan start fileScanResult[%s], subDirMap[%d]", c1Var, valueOf);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f419111i.aj(this.f419109g, this.f419108f, null, null, this.f419106d, true, 0);
        if (map.size() > 0) {
            java.util.Iterator it = map.entrySet().iterator();
            while (it != null && it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                c1Var.f419084h.add(new ni3.d1((java.lang.String) entry.getKey(), ((java.lang.Integer) entry.getValue()).intValue()));
            }
        }
        c1Var.f419082f = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv true scan end takes[%d], emptySubDir[%d], fileScanResult[%s], tid[%d]", java.lang.Long.valueOf(c1Var.f419082f), java.lang.Integer.valueOf(map.values().size()), c1Var, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        ((ni3.b2) this.f419110h).a(0, c1Var);
    }
}
