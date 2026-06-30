package bz3;

/* loaded from: classes4.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bz3.i f36801e;

    public k(int i17, bz3.i iVar) {
        this.f36800d = i17;
        this.f36801e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = bz3.l.f36803e;
        int i17 = this.f36800d;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(java.lang.Integer.valueOf(i17));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            hashMap.put(java.lang.Integer.valueOf(i17), arrayList);
        }
        bz3.i iVar = this.f36801e;
        if (iVar != null) {
            arrayList.add(iVar);
        }
        java.util.HashMap hashMap2 = bz3.l.f36804f;
        if (hashMap2.containsKey(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanServerConfigManager", "syncScanConfig netScene is running and ignore");
            return;
        }
        gm0.j1.d().a(1812, bz3.l.f36802d);
        com.tencent.mm.plugin.scanner.model.g0 g0Var = new com.tencent.mm.plugin.scanner.model.g0(i17);
        gm0.j1.d().g(g0Var);
        hashMap2.put(java.lang.Integer.valueOf(i17), g0Var);
    }
}
