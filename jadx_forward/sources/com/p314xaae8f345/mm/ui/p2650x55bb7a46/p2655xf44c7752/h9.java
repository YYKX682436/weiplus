package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class h9 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk4.d f282525d;

    public h9(pk4.d dVar) {
        this.f282525d = dVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onPause: loss focus canDuck " + z17);
        this.f282525d.m158658x764d819b(true);
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onResume: gain focus");
        this.f282525d.m158658x764d819b(false);
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onStop: loss focus");
    }
}
