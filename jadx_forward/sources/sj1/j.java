package sj1;

/* loaded from: classes7.dex */
public final class j implements sj1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final sj1.j f489903a = new sj1.j();

    static {
        java.lang.Object m143895xf1229813;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!sj1.f.f489897a.compareAndSet(false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageSystrace", "enable, hasTryEnable");
            return;
        }
        if ((context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageSystrace", "enable, isDebuggable");
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(android.os.Trace.class.getDeclaredMethod("setAppTracingAllowed", java.lang.Boolean.TYPE).invoke(null, java.lang.Boolean.TRUE));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuggageSystrace", m143898xd4a2fc34, "enable, reflect setAppTracingAllowed failure", new java.lang.Object[0]);
    }

    @Override // pb.b
    public void a(long j17, long j18, double d17) {
    }

    @Override // pb.b
    public void b(java.lang.String data, double d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // pb.b
    public void c(java.lang.String category, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sj1.f.f489897a;
        java.lang.String E0 = r26.p0.E0(name, 127);
        java.lang.reflect.Method method = j3.v.f378876b;
        j3.t.a(E0);
    }

    @Override // pb.b
    public void d(long j17, long j18) {
    }

    @Override // pb.b
    public void e(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
    }

    @Override // pb.b
    public void f(java.lang.String category, java.lang.String name, double d17, double d18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    @Override // sj1.b
    /* renamed from: flush */
    public void mo52347x5d03b04() {
    }

    @Override // pb.b
    public void g() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sj1.f.f489897a;
        java.lang.reflect.Method method = j3.v.f378876b;
        j3.t.b();
    }

    @Override // pb.b
    public com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 h() {
        return null;
    }

    @Override // pb.b
    public void i() {
    }

    @Override // pb.b
    /* renamed from: init */
    public void mo21138x316510() {
    }

    @Override // pb.b
    /* renamed from: isTracing */
    public boolean getF127349a() {
        return false;
    }

    @Override // pb.b
    public void j(int i17) {
    }

    @Override // pb.b
    public int k(java.lang.String category, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return -1;
    }

    @Override // pb.b
    /* renamed from: release */
    public void mo21140x41012807() {
    }
}
