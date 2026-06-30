package ll;

/* loaded from: classes13.dex */
public class c extends ll.n {

    /* renamed from: g, reason: collision with root package name */
    public final ll.o f400610g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f400611h;

    /* renamed from: i, reason: collision with root package name */
    public ll.p f400612i;

    public c(ll.o oVar, java.lang.String str, int i17) {
        super(str, i17);
        this.f400611h = false;
        this.f400610g = oVar;
    }

    @Override // ll.n
    public void h() {
        this.f400611h = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.lang.Object[] objArr = {this.f400650d};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeTask", "run task %s", objArr);
        if (this.f400611h) {
            return;
        }
        android.os.Process.setThreadPriority(-16);
        ll.o oVar = this.f400610g;
        ll.p pVar = this.f400612i;
        ll.a aVar = (ll.a) oVar;
        aVar.getClass();
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecodeMgr", "process decoder is null", null);
        } else {
            ll.d dVar = (ll.d) pVar;
            n01.b g17 = dVar.g();
            if (dVar.f400613a.f427636l != null) {
                ol.k kVar = dVar.f400613a.f427636l;
                int i18 = dVar.g().f415377i;
                if (((dl3.q) kVar).f316875a.f316861u != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c344.m40330x4c144dd(na1.e.f72905x366c91de);
                    c4582x424c344.m40331x936762bd(90);
                    c4582x424c344.m40332x57b2b64f(1L);
                    arrayList.add(c4582x424c344);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
                }
            }
            dVar.f400618f = dVar.g().f415371c;
            if (android.text.TextUtils.isEmpty(dVar.f400618f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecoderBase", "source path is null", null);
                dVar.m(712);
            } else {
                n01.b g18 = dVar.g();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "decode sourcePath :%s, loop:%b", dVar.f400618f, java.lang.Boolean.valueOf(g18.f415376h));
                if (dVar.f400620h.get()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "do preload audio", null);
                    if (g18.A) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "preload begin", null);
                        if (il.j.a().d(dVar.f400618f)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "audio is loaded complete!", null);
                        } else {
                            dVar.l();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "preload end", null);
                        dVar.p(15);
                    } else {
                        if (!(dVar.f400621i.get() == 4)) {
                            dVar.p(3);
                        }
                        if (il.j.a().d(dVar.f400618f)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "audio is loaded complete!", null);
                        } else {
                            dVar.l();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "preload audio end", null);
                        dVar.f400620h.set(false);
                        hl.d f17 = dVar.f();
                        if (dVar.i()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "stopped, not to play", null);
                            if (f17.f363552b) {
                                dVar.p(2);
                            }
                        } else {
                            if (dVar.f400621i.get() == 9) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "occurs error, not to play", null);
                            } else {
                                if ((dVar.f400621i.get() == 4) || g18.f415375g) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "to play", null);
                                    dVar.p(2);
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "not to play", null);
                                    dVar.p(2);
                                }
                            }
                        }
                    }
                }
                dVar.p(4);
                do {
                    if (il.j.a().d(dVar.f400618f)) {
                        dVar.u();
                    } else {
                        dVar.l();
                    }
                    z17 = g18.f415376h && !dVar.i();
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "loop again for audioId:%s", dVar.e());
                        try {
                            java.lang.Thread.sleep(20L);
                        } catch (java.lang.Exception unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDecoderBase", "sleep exception", null);
                        }
                        dVar.f400629q = 0;
                    }
                } while (z17);
                if (!dVar.i()) {
                    if (!(dVar.f400621i.get() == 9)) {
                        if (dVar.f400613a.f427633i.c(dVar.e())) {
                            dVar.p(7);
                            dVar.f400613a.f427633i.j(dVar.e());
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "not mix end, not set to play complete!", null);
                            nl.b bVar = dVar.f400613a.f427633i;
                            java.lang.String e17 = dVar.e();
                            synchronized (bVar.f419658n) {
                                bVar.f419660p.put(e17, java.lang.Boolean.TRUE);
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "task end", null);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "is stop or error, not set to play complete!", null);
                if (dVar.f400614b.equals(dVar.g().f415371c)) {
                    dVar.f400613a.f427633i.j(dVar.e());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "removeAudio", null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "change src only, don't removeAudio", null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "task end", null);
            }
            dVar.f();
            int i19 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "release", null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "duration:%d", java.lang.Long.valueOf(dVar.f().f363554d));
            dVar.o();
            dVar.b();
            if (dVar.f400614b != null) {
                dVar.f400614b.b().f415372d = 0;
                dVar.f400614b.mo124757x1f9d589c();
            }
            dVar.f400620h.set(false);
            dVar.f400623k.set(true);
            dVar.f400622j.set(false);
            dVar.f400624l.set(false);
            dVar.f400613a = null;
            synchronized (aVar.f400603a.f400609f) {
                if (g17 != null) {
                    if (((java.util.ArrayList) aVar.f400603a.f400607d).contains(g17.f415371c)) {
                        ((java.util.ArrayList) aVar.f400603a.f400607d).remove(g17.f415371c);
                    }
                }
            }
        }
        ((ll.a) this.f400610g).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeMgr", "decode process end", null);
        ll.m.c(this);
        this.f400611h = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecodeTask", "run task %s end", this.f400650d);
    }
}
