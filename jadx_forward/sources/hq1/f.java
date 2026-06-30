package hq1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.g f364639d;

    public f(hq1.g gVar) {
        this.f364639d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.g gVar = this.f364639d;
        if (gVar.f364640a.f364677j.isEmpty()) {
            return;
        }
        java.util.Iterator it = gVar.f364640a.f364677j.iterator();
        while (it.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", l17);
            hq1.h hVar = gVar.f364640a.f364668a;
            if (hVar != null) {
                hVar.a(l17.longValue(), false);
            }
        }
        gVar.f364640a.f364677j.clear();
    }
}
