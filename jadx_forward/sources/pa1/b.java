package pa1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa1.e f434485d;

    public b(pa1.e eVar) {
        this.f434485d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        na1.a aVar = new na1.a();
        pa1.e eVar = this.f434485d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) eVar.f434490b.get()).C0();
        java.lang.String str = eVar.f434489a.f469672e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnCanvasReportEventSampleConfigReceivedEvent", "hy: sending config; %s", str);
        aVar.u(C0);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("keyEventSampleConfig", str);
        aVar.t(hashMap);
        aVar.m();
    }
}
