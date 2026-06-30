package w65;

/* loaded from: classes12.dex */
public abstract class g implements w65.m {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f524887g = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f524888d = "WeTask-" + f524887g.incrementAndGet();

    /* renamed from: e, reason: collision with root package name */
    public w65.q f524889e = w65.q.f524899d;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f524890f;

    @Override // w65.m
    public java.lang.String Z0() {
        return "";
    }

    /* renamed from: equals */
    public boolean m173283xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof w65.g) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(id(), ((w65.g) obj).id());
        }
        return false;
    }

    @Override // w65.m
    public void f1() {
        w65.p event = f0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseWeTask", "submitTaskEvent " + event);
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) ((lm.r) ((w65.n) i95.n0.c(w65.n.class))).f400862m).mo141623x754a37bb(), null, new w65.f(this, event, null), 1, null);
        lm.r rVar = (lm.r) ((w65.n) i95.n0.c(w65.n.class));
        rVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) rVar.f400862m).mo141623x754a37bb(), null, new lm.g(event, rVar, null), 1, null);
    }

    public java.lang.Integer h() {
        w65.q qVar = this.f524889e;
        if (qVar == w65.q.f524904i) {
            return -600001;
        }
        return qVar == w65.q.f524905m ? -600002 : null;
    }

    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseWeTask", id() + " after run");
        this.f524889e = w65.q.f524902g;
    }

    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseWeTask", id() + " before run");
        this.f524889e = w65.q.f524900e;
    }

    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseWeTask", id() + " duplicated");
        this.f524889e = w65.q.f524906n;
    }

    public void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseWeTask", id() + " finish");
        this.f524889e = w65.q.f524903h;
        z();
    }

    public void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseWeTask", id() + " run");
        this.f524889e = w65.q.f524901f;
    }

    @Override // w65.m
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseWeTask", id() + " cancel");
        this.f524889e = w65.q.f524904i;
    }
}
