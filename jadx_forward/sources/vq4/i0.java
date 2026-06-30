package vq4;

/* loaded from: classes14.dex */
public final class i0 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f520848d;

    public i0(vq4.m0 m0Var) {
        this.f520848d = m0Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", "onAudioFocusChange onPause");
        this.f520848d.k(true);
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", "onAudioFocusChange onResume " + j65.e.g() + j65.e.h());
        boolean h17 = j65.e.h();
        vq4.m0 m0Var = this.f520848d;
        if (h17) {
            m0Var.k(false);
        } else {
            m0Var.k(j65.e.g());
        }
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
    }
}
