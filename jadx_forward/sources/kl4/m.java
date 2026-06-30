package kl4;

/* loaded from: classes11.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ll4.d f390485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f390486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f390487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f390488g;

    public m(ll4.d dVar, kl4.a0 a0Var, long j17, long j18) {
        this.f390485d = dVar;
        this.f390486e = a0Var;
        this.f390487f = j17;
        this.f390488g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.a0 a0Var = this.f390486e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390485d, a0Var.f390401e) || a0Var.f390402f || a0Var.f390404h) {
            return;
        }
        if (a0Var.f390407n == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(a0Var.f390413t, "onEventChanged contextBytes is null, can not call onPlayEvent");
            return;
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = a0Var.f390400d;
        long j17 = this.f390487f;
        long j18 = this.f390488g;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            jm4.u3 u3Var = (jm4.u3) ((com.p314xaae8f345.p3118xeeebfacc.C26845xac206036) it.next()).m106052x32c52b();
            if (u3Var != null) {
                u3Var.x(j17, j17, j18);
            }
        }
    }
}
