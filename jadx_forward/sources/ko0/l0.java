package ko0;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f391415e;

    /* renamed from: f, reason: collision with root package name */
    public static lo0.p0 f391416f;

    /* renamed from: g, reason: collision with root package name */
    public static lo0.p0 f391417g;

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.l0 f391411a = new ko0.l0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f391412b = lp0.b.h() + "live/makeup";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f391413c = lp0.b.h() + "live/makeup_v_001";

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f391414d = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f391418h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f391419i = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:23:0x00ad, B:26:0x00b2), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v0, types: [ko0.e0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v32, types: [lo0.p0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ko0.e0 r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko0.l0.a(ko0.e0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final lo0.p0 b() {
        lo0.p0 p0Var = f391417g;
        if (p0Var != null) {
            return p0Var;
        }
        lo0.p0 p0Var2 = lo0.p0.f401590e;
        return lo0.p0.f401590e;
    }

    public final void c(boolean z17) {
        lo0.p0 p0Var;
        if (z17) {
            p0Var = f391416f;
            if (p0Var == null) {
                lo0.p0 p0Var2 = lo0.p0.f401590e;
                p0Var = lo0.p0.f401590e;
            }
        } else {
            lo0.p0 p0Var3 = lo0.p0.f401590e;
            p0Var = lo0.p0.f401590e;
        }
        p0Var.getClass();
        f391417g = new lo0.p0(p0Var);
    }

    public final void d(java.lang.String resUrl, java.lang.String resMd5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resUrl, "resUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resMd5, "resMd5");
        f391418h = resUrl;
        f391419i = resMd5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMakeupUtil", "#updateResUrl resUrl=" + resUrl + " resMd5=" + resMd5);
    }
}
