package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b f165517d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b bVar) {
        this.f165517d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        synchronized (this.f165517d) {
            arrayList = new java.util.ArrayList(this.f165517d.f165504i);
            arrayList.addAll(this.f165517d.f165505m);
            this.f165517d.f165504i.clear();
            this.f165517d.f165505m.clear();
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x) arrayList.get(i17);
            if (xVar != null) {
                xVar.mo32099xac79a11b();
            }
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }
}
