package gf0;

/* loaded from: classes15.dex */
public final class h implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf0.i f352736d;

    public h(gf0.i iVar) {
        this.f352736d = iVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        qk.c8 c8Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId: ");
        gf0.i iVar = this.f352736d;
        sb6.append(iVar.f352742f);
        sb6.append(", onPause, loss audio focus");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioRecorder", sb6.toString());
        gf0.e eVar = iVar.f352741e;
        if (eVar != null && (c8Var = ((gf0.l) eVar).f352754a.f352771n) != null) {
            c8Var.a();
        }
        iVar.a();
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioRecorder", "appId: " + this.f352736d.f352742f + ", onResume, gain audio focus");
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        qk.c8 c8Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId: ");
        gf0.i iVar = this.f352736d;
        sb6.append(iVar.f352742f);
        sb6.append(", onStop, loss audio focus");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioRecorder", sb6.toString());
        gf0.e eVar = iVar.f352741e;
        if (eVar != null && (c8Var = ((gf0.l) eVar).f352754a.f352771n) != null) {
            c8Var.a();
        }
        iVar.a();
    }
}
