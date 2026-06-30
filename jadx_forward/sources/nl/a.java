package nl;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl.b f419644d;

    public a(nl.b bVar) {
        this.f419644d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Process.setThreadPriority(-19);
        if (this.f419644d.e()) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixController", "stop and exit", null);
            return;
        }
        while (!this.f419644d.e()) {
            nl.b bVar = this.f419644d;
            synchronized (bVar.f419651g) {
                while (!bVar.e() && bVar.f419648d.get()) {
                    try {
                        int i18 = rl.b.f478676a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixController", "waitMix", null);
                        bVar.f419651g.wait();
                    } catch (java.lang.Exception e17) {
                        int i19 = rl.b.f478676a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioMixController", e17, "waitMix", new java.lang.Object[0]);
                    } finally {
                    }
                }
            }
            if (this.f419644d.e()) {
                return;
            }
            java.lang.System.nanoTime();
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f419644d.h();
            if (arrayList.size() > 0) {
                long nanoTime = java.lang.System.nanoTime();
                hl.b a17 = ((nl.c) this.f419644d.f419645a).a(arrayList);
                long nanoTime2 = java.lang.System.nanoTime();
                nl.b bVar2 = this.f419644d;
                bVar2.f419666v++;
                bVar2.f419667w += nanoTime2 - nanoTime;
                if (a17 != null) {
                    a17.f363550d.addAll(bVar2.f419664t);
                    bVar2.f419664t.clear();
                    ol.h hVar = bVar2.f419646b;
                    if (hVar.f427628d.get()) {
                        int i27 = rl.b.f478676a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "exit, not to add MixBuff queue", null);
                    } else {
                        synchronized (hVar.f427630f) {
                            while (((java.util.ArrayDeque) hVar.f427629e).size() >= 2 && !hVar.f427628d.get()) {
                                try {
                                    hVar.f427630f.wait();
                                } catch (java.lang.InterruptedException e18) {
                                    int i28 = rl.b.f478676a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioMixPlayerImpl", e18, "enqueueMixBuffer", new java.lang.Object[0]);
                                }
                            }
                            ((java.util.ArrayDeque) hVar.f427629e).add(a17);
                            hVar.f427630f.notifyAll();
                        }
                    }
                }
                this.f419644d.i(arrayList);
                arrayList.clear();
            }
        }
        int i29 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixController", "mix thread stop and exit", null);
    }
}
