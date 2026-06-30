package wz1;

/* loaded from: classes4.dex */
public final class e implements s85.b {

    /* renamed from: d, reason: collision with root package name */
    public static final wz1.e f532234d = new wz1.e();

    @Override // s85.b
    public void a(s85.c cVar, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (gm0.j1.a()) {
            wz1.b bVar = wz1.b.f532227d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
            boolean booleanValue = bool.booleanValue();
            synchronized (bVar) {
                if (booleanValue) {
                    try {
                        if (wz1.b.f532229f == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBLeafBackup", "Enqueue DB leaf backup.");
                            wz1.b.f532228e = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
                            ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
                            t0Var.getClass();
                            wz1.b.f532229f = t0Var.w(bVar, 300000L, null);
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
                if (!booleanValue && wz1.b.f532229f != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBLeafBackup", "Cancel DB leaf backup.");
                    com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = wz1.b.f532228e;
                    if (c26987xeef691ab != null) {
                        c26987xeef691ab.m108007xae7a2e7a();
                    }
                    if (wz1.b.f532230g) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBLeafBackup", "Test cancel, cancellation delayed.");
                    } else {
                        java.util.concurrent.Future future = wz1.b.f532229f;
                        if (future != null) {
                            future.cancel(false);
                        }
                        wz1.b.f532228e = null;
                        wz1.b.f532229f = null;
                    }
                }
            }
        }
    }
}
