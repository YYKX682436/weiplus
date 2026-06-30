package jq1;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq1.e f382588d;

    public b(jq1.e eVar) {
        this.f382588d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jq1.e eVar = this.f382588d;
        if (eVar.f382595b.isDiscovering()) {
            eVar.f382595b.cancelDiscovery();
        }
    }
}
