package wf;

/* loaded from: classes7.dex */
public class c implements tf.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f526993a;

    public c(wf.b bVar) {
        this.f526993a = bVar;
    }

    @Override // tf.u
    public void h() {
        wf.b bVar = this.f526993a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "playVideo, JustPlayAudio getAndSet: false");
        bVar.V.set(false);
        bVar.L(new java.lang.Runnable() { // from class: wf.c$$a
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar2 = wf.c.this.f526993a;
                if (bVar2.V.get()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar2.w(), "ignore playVideo in liveThread");
                    return;
                }
                wf.a aVar = bVar2.f526951i;
                if (aVar != null) {
                    aVar.mo173672x42c875eb(bVar2.f526949g);
                    if (bVar2.f526951i.mo173671xc00617a4()) {
                        return;
                    }
                    bVar2.f526951i.n(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, null);
                }
            }
        });
    }

    @Override // tf.u
    public void j() {
        wf.b bVar = this.f526993a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "playAudio, JustPlayAudio getAndSet: true");
        if (bVar.V.getAndSet(true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "ignore playAudio");
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: wf.c$$b
            @Override // java.lang.Runnable
            public final void run() {
                final wf.c cVar = wf.c.this;
                cVar.getClass();
                cVar.f526993a.L(new java.lang.Runnable() { // from class: wf.c$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        wf.a aVar;
                        wf.b bVar2 = wf.c.this.f526993a;
                        if (bVar2.V.get() && (aVar = bVar2.f526951i) != null) {
                            aVar.mo173672x42c875eb(null);
                            if (bVar2.f526951i.mo173671xc00617a4()) {
                                return;
                            }
                            bVar2.f526951i.n(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, null);
                        }
                    }
                });
            }
        };
        bVar.getClass();
        bVar.x(new wf.g(bVar, runnable));
    }
}
