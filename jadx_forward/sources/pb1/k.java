package pb1;

/* loaded from: classes7.dex */
public class k extends android.bluetooth.le.ScanCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f434689a;

    public k(pb1.x xVar) {
        this.f434689a = new java.lang.ref.WeakReference(xVar);
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onBatchScanResults(java.util.List list) {
        if (((pb1.x) this.f434689a.get()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c((android.bluetooth.le.ScanResult) it.next()));
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i17) {
        pb1.x xVar = (pb1.x) this.f434689a.get();
        if (xVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(((pb1.e) xVar).f434667a.f434673a, "[onScanResult]onScanFailed, errorCode:%d", java.lang.Integer.valueOf(i17));
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i17, android.bluetooth.le.ScanResult scanResult) {
        pb1.x xVar = (pb1.x) this.f434689a.get();
        if (xVar != null) {
            xVar.a(i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c(scanResult));
        }
    }
}
