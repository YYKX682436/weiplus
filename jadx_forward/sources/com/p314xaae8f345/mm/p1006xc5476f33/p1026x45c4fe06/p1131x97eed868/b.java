package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868;

/* loaded from: classes13.dex */
public class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.d f165616b;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.d dVar, java.lang.String str) {
        this.f165616b = dVar;
        this.f165615a = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "onProcessDied %s", this.f165615a);
        synchronized (this.f165616b) {
            this.f165616b.f165618a = 0;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unbindService(this.f165616b.f165620c);
        } catch (java.lang.Exception unused) {
        }
    }
}
