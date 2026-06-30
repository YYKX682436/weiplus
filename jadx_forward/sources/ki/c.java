package ki;

/* loaded from: classes12.dex */
public final class c extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ki.d f389619b;

    public c(ki.d dVar) {
        this.f389619b = dVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        this.f389619b.f389621e = 0;
        ki.d dVar = this.f389619b;
        java.lang.Object obj = dVar.f389625i.f389618b.get(dVar.f389621e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "config.delayMillis[delayIndex]");
        long longValue = ((java.lang.Number) obj).longValue();
        this.f389619b.f389620d.removeCallbacksAndMessages(null);
        ki.d dVar2 = this.f389619b;
        if (dVar2.f389626m) {
            ki.i.f389634c.d(dVar2.f389624h);
            oj.j.c("Matrix.TrimMemoryNotifier", "[" + this.f389619b.f389622f + "] trim immediately", new java.lang.Object[0]);
        }
        ki.d dVar3 = this.f389619b;
        dVar3.f389620d.postDelayed(dVar3, longValue);
        oj.j.c("Matrix.TrimMemoryNotifier", "...[" + this.f389619b.f389622f + "] trim delay[" + (this.f389619b.f389621e + 1) + '/' + this.f389619b.f389625i.f389618b.size() + "] " + longValue, new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        ki.d dVar = this.f389619b;
        dVar.f389620d.removeCallbacks(dVar);
        this.f389619b.f389621e = 0;
    }
}
