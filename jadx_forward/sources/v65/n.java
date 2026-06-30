package v65;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f515114a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f515115b;

    public n(p3325xe03a0797.p3326xc267989b.q cont) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cont, "cont");
        this.f515114a = cont;
    }

    public final synchronized void a(java.lang.Object obj) {
        if (!this.f515115b) {
            this.f515115b = true;
            try {
                this.f515114a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(obj));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SafeResume", e17, "resume", new java.lang.Object[0]);
            }
        }
    }
}
