package yl;

/* loaded from: classes12.dex */
public final class f implements wu5.h, wu5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f544468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl.g f544469e;

    public f(yl.g gVar, yl.e eVar) {
        this.f544469e = gVar;
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        this.f544468d = future;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "SilkWriter_run";
    }

    @Override // java.lang.Runnable
    public void run() {
        yl.g gVar;
        boolean z17;
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkWriter", "Silk Thread start run");
        while (true) {
            synchronized (this.f544469e) {
                gVar = this.f544469e;
                z17 = gVar.f544472b;
            }
            ((java.util.concurrent.ArrayBlockingQueue) gVar.f544471a).size();
            if (z17 && this.f544469e.f544471a.isEmpty()) {
                return;
            }
            try {
                tl.h0 h0Var = (tl.h0) ((java.util.concurrent.ArrayBlockingQueue) this.f544469e.f544471a).poll(200L, java.util.concurrent.TimeUnit.MILLISECONDS);
                if (h0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkWriter", "poll byte null file:" + this.f544469e.f544473c);
                } else {
                    int size = ((java.util.concurrent.ArrayBlockingQueue) this.f544469e.f544471a).size();
                    if (size > 10 || z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SilkWriter", "speed up silkcodec queue:" + size + " stop:" + z17);
                        i17 = 0;
                    } else {
                        i17 = 1;
                    }
                    yl.a aVar = yl.g.f544470o;
                    this.f544469e.a(h0Var, (aVar.f544452a < 10 || aVar.f544453b <= 240) ? i17 : 0);
                }
            } catch (java.lang.InterruptedException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkWriter", "ThreadAmr poll null");
            }
        }
    }
}
