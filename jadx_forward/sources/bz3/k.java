package bz3;

/* loaded from: classes4.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f118333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bz3.i f118334e;

    public k(int i17, bz3.i iVar) {
        this.f118333d = i17;
        this.f118334e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = bz3.l.f118336e;
        int i17 = this.f118333d;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(java.lang.Integer.valueOf(i17));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            hashMap.put(java.lang.Integer.valueOf(i17), arrayList);
        }
        bz3.i iVar = this.f118334e;
        if (iVar != null) {
            arrayList.add(iVar);
        }
        java.util.HashMap hashMap2 = bz3.l.f118337f;
        if (hashMap2.containsKey(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanServerConfigManager", "syncScanConfig netScene is running and ignore");
            return;
        }
        gm0.j1.d().a(1812, bz3.l.f118335d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g0(i17);
        gm0.j1.d().g(g0Var);
        hashMap2.put(java.lang.Integer.valueOf(i17), g0Var);
    }
}
