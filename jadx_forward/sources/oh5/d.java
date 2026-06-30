package oh5;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.ref.WeakReference f427022c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f427023a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f427024b = new java.util.concurrent.ConcurrentLinkedQueue();

    public d() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(new oh5.b(this));
    }

    public void a(android.content.Intent intent) {
        java.lang.String str;
        jz5.f0 f0Var;
        android.app.Activity activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        try {
            str = c();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseHalfScreenWarningHelper", th6, "", new java.lang.Object[0]);
            str = null;
        }
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseHalfScreenWarningHelper", "disabled for release");
            return;
        }
        try {
            java.lang.Class.forName(str);
            java.lang.ref.WeakReference weakReference = f427022c;
            if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
                f0Var = null;
            } else {
                bh5.c cVar = new bh5.c();
                cVar.f102455a.f102457a = activity;
                cVar.d(intent);
                cVar.a(str);
                cVar.g();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseHalfScreenWarningHelper", "start half screen warning activity: ".concat(str));
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("no valid src Activity, weak = ");
                sb6.append(f427022c);
                sb6.append(" -> ");
                java.lang.ref.WeakReference weakReference2 = f427022c;
                sb6.append(weakReference2 != null ? (android.app.Activity) weakReference2.get() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseHalfScreenWarningHelper", sb6.toString());
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseHalfScreenWarningHelper", e17, "Target NOT exist, ignore", new java.lang.Object[0]);
        }
    }

    public final void b(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (this.f427023a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseHalfScreenWarningHelper", "muted");
        } else if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d()) {
            a(intent);
        } else {
            this.f427024b.offer(intent);
        }
    }

    public abstract java.lang.String c();
}
