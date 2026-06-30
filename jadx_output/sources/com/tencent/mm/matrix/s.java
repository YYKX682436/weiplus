package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public class s implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.o f68843d;

    public s(com.tencent.mm.matrix.o oVar) {
        this.f68843d = oVar;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "MatrixDelegate-startDenseMsgTracerWatchdog";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            gj.k kVar = gj.k.f272354q;
            kVar.getClass();
            long j17 = kVar.f272359g;
            java.util.Queue queue = kVar.f272357e;
            com.tencent.mm.matrix.o oVar = this.f68843d;
            if (j17 > 4000) {
                try {
                    oVar.l(queue);
                    java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedQueue) queue).iterator();
                    gj.j jVar = null;
                    long j18 = 0;
                    while (it.hasNext()) {
                        gj.j jVar2 = (gj.j) it.next();
                        long j19 = jVar2.f272352b;
                        if (j19 > j18) {
                            jVar = jVar2;
                            j18 = j19;
                        }
                    }
                    java.lang.String str = "";
                    java.lang.String jVar3 = jVar == null ? "" : jVar.toString();
                    if (jVar != null) {
                        str = oVar.r(jVar);
                    }
                    long j27 = jVar == null ? 0L : jVar.f272352b;
                    com.tencent.mars.xlog.Log.i("MatrixDelegate", "happens Dense Message Lag, duration exceeds, count=%d, duration=%d, keyMessage = %s", 0L, java.lang.Long.valueOf(j17), jVar3);
                    jx3.f.INSTANCE.d(24354, com.tencent.matrix.trace.core.AppMethodBeat.getVisibleScene(), lj.f.a(), 0, bm5.f1.a(), com.tencent.mm.sdk.platformtools.z.f193109e, java.lang.Long.valueOf(j17), 0L, jVar3, java.lang.Long.valueOf(j27), str);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    try {
                        com.tencent.mars.xlog.Log.e("MatrixDelegate", "denseMsgTracerTask, error : " + th.getMessage());
                    } finally {
                        gj.k.f272354q.a();
                    }
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
