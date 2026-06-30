package il0;

/* loaded from: classes13.dex */
public class a extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ il0.e f373539a;

    public a(il0.e eVar) {
        this.f373539a = eVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        boolean z17;
        synchronized (this.f373539a) {
            il0.e eVar = il0.e.f373542f;
            synchronized (eVar) {
                z17 = eVar.f373546d;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.DiscoveryReddotEnv", "clear init");
                eVar.f();
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
    }
}
