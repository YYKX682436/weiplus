package js0;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ js0.c f382990d;

    public a(js0.c cVar) {
        this.f382990d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (this.f382990d.f383001j) {
            try {
                js0.c cVar = this.f382990d;
                synchronized (cVar.f383004m) {
                    cVar.f383004m.wait();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f382990d.f383003l, "mixBackground:" + this.f382990d.f382992a + ", mixMusic:" + this.f382990d.f382993b + ", music:" + this.f382990d.f382998g.size() + ", background:" + this.f382990d.f382997f.size());
                js0.c cVar2 = this.f382990d;
                synchronized (cVar2.f383005n) {
                    do {
                        try {
                            if (cVar2.f382997f.size() < 1 && cVar2.f382998g.size() < 1) {
                                break;
                            }
                            boolean z17 = cVar2.f382992a;
                            if (!z17 || !cVar2.f382993b) {
                                if (z17 || cVar2.f382993b) {
                                    cVar2.f382994c.mo152xb9724478();
                                    js0.c.a(cVar2);
                                    js0.c.b(cVar2);
                                    if (cVar2.f382993b) {
                                        if (cVar2.f382998g.size() < 1) {
                                            break;
                                        }
                                    }
                                    if (cVar2.f382992a && cVar2.f382997f.size() < 1) {
                                        break;
                                    }
                                }
                            } else {
                                if (cVar2.f382997f.size() < 1 || cVar2.f382998g.size() < 1) {
                                    break;
                                }
                                cVar2.f382994c.mo152xb9724478();
                                js0.c.a(cVar2);
                                js0.c.b(cVar2);
                            }
                        } finally {
                        }
                    } while (cVar2.f383002k);
                    if (cVar2.f383002k) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar2.f383003l, "flush data finish");
                        cVar2.f383001j = false;
                        cVar2.f383000i = true;
                        cVar2.f383005n.notifyAll();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f382990d.f383003l, e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxPcmFrameMixFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 24L, 1L);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f382990d.f383003l, "finish mix");
    }
}
