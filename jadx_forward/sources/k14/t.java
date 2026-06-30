package k14;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final k14.t f384910a = new k14.t();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f384911b = jz5.h.b(k14.s.f384905d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f384912c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f384913d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.r2 f384914e;

    public final void a(p3325xe03a0797.p3326xc267989b.y0 lifecycleScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HearingAidDownloadResource", "downloadResource!");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = f384914e;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        f384914e = p3325xe03a0797.p3326xc267989b.l.d(lifecycleScope, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new k14.p(null), 2, null);
    }

    public final boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIsDownloaded! downloaded state is ");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f384912c;
        sb6.append(atomicBoolean);
        sb6.append(",downloading state is ");
        sb6.append(f384913d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HearingAidDownloadResource", sb6.toString());
        return atomicBoolean.get();
    }

    public final boolean c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIsDownloading! downloaded state is ");
        sb6.append(f384912c);
        sb6.append(",downloading state is ");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f384913d;
        sb6.append(atomicBoolean);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HearingAidDownloadResource", sb6.toString());
        return atomicBoolean.get();
    }

    public final u14.z d() {
        return (u14.z) ((jz5.n) f384911b).mo141623x754a37bb();
    }

    public final void e() {
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        d().getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_902ac54f", "hearing_aid_audio_zip");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f384913d;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = f384912c;
        if (Ui != null) {
            atomicBoolean2.set(true);
        } else if (!atomicBoolean.get()) {
            atomicBoolean2.set(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HearingAidDownloadResource", "updateDownloaded! downloaded state is " + atomicBoolean2 + ",downloading state is " + atomicBoolean);
    }
}
