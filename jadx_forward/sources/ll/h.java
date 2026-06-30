package ll;

/* loaded from: classes13.dex */
public class h extends ll.g {

    /* renamed from: J, reason: collision with root package name */
    public pl.a f400640J;
    public final java.lang.Object K;

    public h(ol.h hVar, ql.c cVar) {
        super(hVar, cVar);
        this.K = new java.lang.Object();
    }

    @Override // ll.g
    public void C(hl.d dVar) {
        kl.k kVar = this.f400617e;
        if (kVar != null) {
            kVar.d();
        }
        B(dVar);
        dVar.a();
    }

    @Override // ll.g
    public void D(hl.d dVar, java.nio.ByteBuffer byteBuffer, int i17) {
        E(dVar, byteBuffer, i17);
    }

    @Override // ll.d, ll.p
    public void a(int i17) {
        super.a(i17);
        synchronized (this.K) {
            pl.a aVar = this.f400640J;
            if (aVar != null) {
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(aVar.f438097j)};
                int i18 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmBasePlayComponent", "seek startPos:%d", objArr);
                aVar.f438097j = i17;
            }
        }
    }

    @Override // ll.g, ll.p
    public void b() {
        super.b();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "releasePlayComponent", null);
        synchronized (this.K) {
            pl.a aVar = this.f400640J;
            if (aVar != null) {
                aVar.e();
                aVar.f438096i = null;
                aVar.f438095h = null;
                aVar.f438089b = null;
                aVar.f438090c = 0;
                aVar.f438091d = 0;
                this.f400640J = null;
            }
        }
    }

    @Override // ll.d, ll.p
    public void c(float f17, float f18) {
        synchronized (this.K) {
            pl.a aVar = this.f400640J;
            if (aVar != null) {
                aVar.i(f17, f18);
            }
        }
    }

    @Override // ll.d, ll.p
    public void d() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "pauseOnBackground", null);
        p(5);
        this.f400623k.set(true);
        this.f400625m.set(false);
        k();
    }

    @Override // ll.d, ll.p
    /* renamed from: getCurrentPosition */
    public long mo145881x9746038c() {
        synchronized (this.K) {
            pl.a aVar = this.f400640J;
            if (aVar == null) {
                return -1L;
            }
            return aVar.a();
        }
    }

    @Override // ll.d
    public void o() {
    }

    @Override // ll.d, ll.p
    /* renamed from: pause */
    public void mo145882x65825f6() {
        super.mo145882x65825f6();
        synchronized (this.K) {
            pl.a aVar = this.f400640J;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    @Override // ll.d
    public void r() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "playAfter", null);
        pl.a aVar = this.f400640J;
        if (aVar != null) {
            aVar.d();
            if (!(this.f400640J instanceof pl.b)) {
                return;
            }
            do {
                atomicBoolean = this.f400622j;
                boolean z17 = atomicBoolean.get();
                y();
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = this.f400623k;
                if (atomicBoolean2.get()) {
                    return;
                }
                if (z17) {
                    int i18 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "need resume if not stop", null);
                    this.f400640J.g();
                }
                if (atomicBoolean2.get()) {
                    return;
                }
            } while (atomicBoolean.get());
        }
    }

    @Override // ll.d
    public void s() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "playBefore", null);
        synchronized (this.K) {
            pl.a aVar = this.f400640J;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    @Override // ll.d
    public void t(hl.e eVar) {
        if (f().f363555e) {
            this.f400627o = 44100;
            this.f400628p = 2;
        } else {
            this.f400627o = eVar.f363567b;
            this.f400628p = eVar.f363568c;
        }
        byte[] bArr = eVar.f363571f;
        if (!this.f400620h.get()) {
            if (this.f400640J == null) {
                hl.d f17 = f();
                if (!f17.f363552b || f17.f363554d > 2000) {
                    this.f400640J = new pl.c(this.f400627o, this.f400628p, f17, this);
                } else {
                    this.f400640J = new pl.b(this.f400627o, this.f400628p, f17, this);
                }
                this.f400640J.f438094g = this.f400615c.f415381m;
                this.f400640J.i((float) this.f400615c.f415380l, (float) this.f400615c.f415380l);
            }
            pl.a aVar = this.f400640J;
            if (aVar != null) {
                aVar.c(bArr);
            }
        }
        if (eVar.f363572g) {
            il.h.a().c(eVar);
        }
    }
}
