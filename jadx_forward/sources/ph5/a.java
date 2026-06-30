package ph5;

/* loaded from: classes5.dex */
public class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f436020d;

    public static void a(final int i17, java.lang.String str, int i18, int i19, int i27) {
        if (f436020d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SamplingTraceDumpTask", "Already tracing.");
            return;
        }
        android.os.Debug.startMethodTracingSampling(str, i18, i19);
        f436020d = true;
        if (i27 >= 1000) {
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
            t0Var.getClass();
            t0Var.t(new java.lang.Runnable() { // from class: ph5.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    ph5.a.b(i17);
                }
            }, i27, null);
        }
    }

    public static void b(int i17) {
        if (i17 == android.os.Process.myPid()) {
            f436020d = false;
            android.os.Debug.stopMethodTracing();
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) sh.c.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)).iterator();
        while (it.hasNext()) {
            m3.d dVar = (m3.d) it.next();
            if (((java.lang.Integer) dVar.f404625a).intValue() == i17) {
                java.lang.String str = (java.lang.String) dVar.f404626b;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("stopTrace", true);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, ph5.a.class, new ph5.C29976x2ca3e1());
                return;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle.getBoolean("stopTrace", false)) {
            f436020d = false;
            android.os.Debug.stopMethodTracing();
        } else {
            a(android.os.Process.myPid(), bundle.getString("tracePath", null), bundle.getInt("bufferSize", 8388608), bundle.getInt("intervalUs", 10), bundle.getInt("durationMs", -1));
        }
        rVar.a(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d);
    }
}
