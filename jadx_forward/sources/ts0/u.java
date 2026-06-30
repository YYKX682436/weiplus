package ts0;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f503104a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f503105b;

    /* renamed from: c, reason: collision with root package name */
    public wo.h f503106c;

    public final wo.h a(android.content.Context context, int i17, android.os.Looper looper) {
        java.lang.Object obj;
        if (context == null) {
            return null;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long id6 = java.lang.Thread.currentThread().getId();
        java.lang.Object obj2 = this.f503104a;
        synchronized (obj2) {
            try {
                this.f503105b = false;
                this.f503106c = null;
                obj = obj2;
                try {
                    s75.d.b(new ts0.t(this, id6, currentTimeMillis, context, i17, looper), "SightCamera_openCamera");
                    try {
                        this.f503104a.wait(30000L);
                    } catch (java.lang.InterruptedException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCamera.OpenCameraThread", "Lock wait failed e:%s", e17.getMessage());
                    }
                    wo.h hVar = this.f503106c;
                    if (hVar != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
                        if (hVar.f529246a != null) {
                            wo.h hVar2 = this.f503106c;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Succ thread:%d Time:%d camera:%s", java.lang.Long.valueOf(id6), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), hVar2.f529246a);
                            wo.h hVar3 = this.f503106c;
                            return hVar3;
                        }
                    }
                    this.f503105b = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Timeout:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    return null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                obj = obj2;
            }
        }
    }
}
