package co5;

/* loaded from: classes14.dex */
public final class u extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co5.v f125419d;

    public u(co5.v vVar) {
        this.f125419d = vVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "onAppBackground ...");
        this.f125419d.f125422b = true;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "onAppForeground ...");
        co5.v vVar = this.f125419d;
        if (vVar.f125422b) {
            vVar.f125422b = false;
        }
    }
}
