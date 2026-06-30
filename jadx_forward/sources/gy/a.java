package gy;

/* loaded from: classes14.dex */
public final class a implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy.c f358995d;

    public a(gy.c cVar) {
        this.f358995d = cVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i17) {
        if (i17 == -3 || i17 == -2) {
            gy.c cVar = this.f358995d;
            synchronized (cVar.f359000d) {
                if (cVar.f359004h) {
                    cVar.f358998b.pause();
                    wu5.c cVar2 = cVar.f359001e;
                    if (cVar2 != null && !cVar2.isCancelled()) {
                        wu5.c cVar3 = cVar.f359001e;
                        if (cVar3 != null) {
                            cVar3.cancel(true);
                        }
                        cVar.f359001e = null;
                    }
                }
            }
            this.f358995d.f359005i = true;
            return;
        }
        if (i17 == -1) {
            this.f358995d.f();
            return;
        }
        if (i17 != 1) {
            return;
        }
        gy.c cVar4 = this.f358995d;
        if (cVar4.f359005i) {
            synchronized (cVar4.f359000d) {
                if (cVar4.f359004h && cVar4.f358998b.getPlayState() != 3) {
                    cVar4.a();
                    cVar4.d();
                    if (cVar4.f358998b.getState() != 1) {
                        cVar4.b();
                        if (cVar4.f358998b.getState() != 1) {
                        }
                    }
                    cVar4.f358998b.play();
                    cVar4.f359006j = android.os.SystemClock.elapsedRealtime() - cVar4.f359007k;
                    cVar4.c();
                }
            }
            this.f358995d.f359005i = false;
        }
    }
}
