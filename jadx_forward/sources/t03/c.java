package t03;

/* loaded from: classes11.dex */
public final class c implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.e f495965d;

    public c(t03.e eVar) {
        this.f495965d = eVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lossAudioFocus ");
        t03.e eVar = this.f495965d;
        sb6.append(eVar.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPlayerAudioFocusController", sb6.toString());
        t03.a aVar = (t03.a) eVar.f495973a.get();
        if (aVar != null) {
            ((t03.k0) aVar).f(true, true);
        }
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gainAudioFocus ");
        t03.e eVar = this.f495965d;
        sb6.append(eVar.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPlayerAudioFocusController", sb6.toString());
        t03.a aVar = (t03.a) eVar.f495973a.get();
        if (aVar != null) {
            ((t03.k0) aVar).f(false, true);
        }
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStop ");
        t03.e eVar = this.f495965d;
        sb6.append(eVar.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPlayerAudioFocusController", sb6.toString());
        t03.a aVar = (t03.a) eVar.f495973a.get();
        if (aVar != null) {
            t03.k0 k0Var = (t03.k0) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "pause");
            k0Var.f496005q = false;
            t03.r0 r0Var = k0Var.f496001m;
            if (r0Var != null) {
                kk4.b.i(r0Var, false, false, 1, null);
            }
        }
    }
}
