package ji;

/* loaded from: classes12.dex */
public final class n implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ji.o f381426d;

    public n(ji.o oVar) {
        this.f381426d = oVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        ji.o oVar = this.f381426d;
        oVar.f381427a.removeCallbacks(oVar.f381428b);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        ji.o oVar = this.f381426d;
        oVar.f381427a.postDelayed(oVar.f381428b, oVar.f381429c.f381436g);
    }
}
