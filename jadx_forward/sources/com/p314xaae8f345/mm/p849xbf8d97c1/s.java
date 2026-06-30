package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public class s implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.o f150376d;

    public s(com.p314xaae8f345.mm.p849xbf8d97c1.o oVar) {
        this.f150376d = oVar;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MatrixDelegate-startDenseMsgTracerWatchdog";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            gj.k kVar = gj.k.f353887q;
            kVar.getClass();
            long j17 = kVar.f353892g;
            java.util.Queue queue = kVar.f353890e;
            com.p314xaae8f345.mm.p849xbf8d97c1.o oVar = this.f150376d;
            if (j17 > 4000) {
                try {
                    oVar.l(queue);
                    java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedQueue) queue).iterator();
                    gj.j jVar = null;
                    long j18 = 0;
                    while (it.hasNext()) {
                        gj.j jVar2 = (gj.j) it.next();
                        long j19 = jVar2.f353885b;
                        if (j19 > j18) {
                            jVar = jVar2;
                            j18 = j19;
                        }
                    }
                    java.lang.String str = "";
                    java.lang.String m131663x9616526c = jVar == null ? "" : jVar.m131663x9616526c();
                    if (jVar != null) {
                        str = oVar.r(jVar);
                    }
                    long j27 = jVar == null ? 0L : jVar.f353885b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "happens Dense Message Lag, duration exceeds, count=%d, duration=%d, keyMessage = %s", 0L, java.lang.Long.valueOf(j17), m131663x9616526c);
                    jx3.f.INSTANCE.d(24354, com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41265x521f41b0(), lj.f.a(), 0, bm5.f1.a(), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, java.lang.Long.valueOf(j17), 0L, m131663x9616526c, java.lang.Long.valueOf(j27), str);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MatrixDelegate", "denseMsgTracerTask, error : " + th.getMessage());
                    } finally {
                        gj.k.f353887q.a();
                    }
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
