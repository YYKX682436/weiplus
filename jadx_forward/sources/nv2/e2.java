package nv2;

/* loaded from: classes10.dex */
public final class e2 {

    /* renamed from: d, reason: collision with root package name */
    public static final nv2.e2 f422014d = new nv2.e2();

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f422015a = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "finder_action_follow_post_quene"));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f422016b = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f422017c = new nv2.d2(this);

    public final void a(long j17, java.lang.String finderUsername, java.lang.String wxUsername, int i17, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUsername, "wxUsername");
        nv2.b2 b2Var = new nv2.b2(finderUsername, wxUsername, i17, 2, 2, qt2Var, null, 64, null);
        b2Var.f421998l = java.lang.Long.valueOf(j17);
        b(b2Var);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 d17 = b2Var.d(true);
        if (d17 != null) {
            d17.e();
        }
    }

    public final void b(nv2.r rVar) {
        this.f422015a.b(new nv2.g2(rVar), new nv2.c2(this));
    }

    public final void c() {
        nv2.r rVar;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f422016b;
        if (concurrentLinkedQueue.size() > 0 && (rVar = (nv2.r) concurrentLinkedQueue.poll()) != null) {
            boolean b17 = rVar.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ThankActionMgr", "tryNext isValid:" + b17 + " action:" + rVar + " size:" + concurrentLinkedQueue.size());
            if (b17) {
                b(rVar);
            } else {
                c();
            }
        }
    }
}
