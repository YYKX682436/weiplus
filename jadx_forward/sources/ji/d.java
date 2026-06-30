package ji;

/* loaded from: classes12.dex */
public final class d extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ji.e f381406b;

    public d(ji.e eVar) {
        this.f381406b = eVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        ji.e eVar = this.f381406b;
        eVar.f381408b.postDelayed(eVar.f381407a, eVar.f381409c);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        ji.e eVar = this.f381406b;
        eVar.f381408b.removeCallbacks(eVar.f381407a);
    }
}
