package cr0;

/* loaded from: classes12.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f303290a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f303291b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f303292c;

    public u0() {
        jz5.i iVar = jz5.i.f384362d;
        this.f303291b = jz5.h.a(iVar, cr0.l0.f303207d);
        this.f303292c = jz5.h.a(iVar, cr0.t0.f303283d);
    }

    public static final void a(cr0.u0 u0Var, cr0.d1 d1Var) {
        cr0.d1 d1Var2;
        java.util.Map map = (java.util.Map) ((java.lang.ThreadLocal) u0Var.f303292c.mo141623x754a37bb()).get();
        if (map == null || (d1Var2 = (cr0.d1) map.remove(java.lang.Integer.valueOf(d1Var.f303144d))) == null) {
            return;
        }
        java.lang.String str = d1Var2.f303141a;
        java.lang.String str2 = d1Var2.f303142b;
        long j17 = d1Var2.f303143c;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        jz5.g gVar = cr0.d1.f303139e;
        pj.g gVar2 = (pj.g) cr0.d1.f303140f.mo141623x754a37bb();
        yz5.l lVar = gVar2.f436440c;
        if (lVar != null) {
            lVar.mo146xb9724478(d1Var2);
        }
        synchronized (gVar2.a()) {
            if (gVar2.a().size() < gVar2.f436438a) {
                gVar2.a().add(d1Var2);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).g(new cr0.s0(u0Var, str, str2, uptimeMillis, j17));
    }

    public static final cr0.d1 b(cr0.u0 u0Var, java.lang.String binderName, java.lang.String code) {
        u0Var.getClass();
        jz5.g gVar = cr0.d1.f303139e;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binderName, "binderName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(code, "code");
        cr0.d1 d1Var = (cr0.d1) ((pj.g) cr0.d1.f303140f.mo141623x754a37bb()).b();
        d1Var.f303144d = ((java.util.concurrent.atomic.AtomicInteger) cr0.d1.f303139e.mo141623x754a37bb()).getAndIncrement();
        d1Var.f303141a = binderName;
        d1Var.f303142b = code;
        d1Var.f303143c = uptimeMillis;
        java.lang.ThreadLocal threadLocal = (java.lang.ThreadLocal) u0Var.f303292c.mo141623x754a37bb();
        java.lang.Object obj = threadLocal.get();
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            threadLocal.set(obj);
        }
        ((java.util.Map) obj).put(java.lang.Integer.valueOf(d1Var.f303144d), d1Var);
        return d1Var;
    }

    public final com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795 c() {
        return (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795) this.f303291b.mo141623x754a37bb();
    }
}
