package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i f180967d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i iVar) {
        this.f180967d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i iVar = this.f180967d;
        if (iVar.f181032a.f180704o && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
            iVar.f181032a.T6(4);
        } else {
            iVar.f181032a.T6(3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Start scan...");
        }
    }
}
