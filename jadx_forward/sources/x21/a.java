package x21;

/* loaded from: classes12.dex */
public final class a implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x21.c f533043d;

    public a(x21.c cVar) {
        this.f533043d = cVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "onPause: canDuck " + z17);
        if (z17) {
            return;
        }
        this.f533043d.f533045a.mo152xb9724478();
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "onResume: ");
        this.f533043d.a(false);
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "onStop: ");
        this.f533043d.f533045a.mo152xb9724478();
    }
}
