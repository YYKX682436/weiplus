package ko0;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f391405c;

    /* renamed from: d, reason: collision with root package name */
    public static lo0.t f391406d;

    /* renamed from: e, reason: collision with root package name */
    public static lo0.t f391407e;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f391409g;

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.l f391403a = new ko0.l();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f391404b = jz5.h.b(ko0.j.f391398d);

    /* renamed from: f, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f391408f = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f391410h = jz5.h.b(ko0.k.f391401d);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9 A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #0 {all -> 0x00fe, blocks: (B:12:0x002c, B:23:0x00d4, B:26:0x00d9), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ko0.d] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ko0.d r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko0.l.a(ko0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final lo0.t b() {
        lo0.t tVar = f391407e;
        if (tVar != null) {
            return tVar;
        }
        lo0.t tVar2 = lo0.t.f401607i;
        return lo0.t.f401607i;
    }

    public final boolean c() {
        return b().f401611c;
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBeautyUtil", "#lockDataBucketInstance");
        if (f391407e != null) {
            return;
        }
        java.lang.String str = f391405c;
        if (f391406d == null) {
            if (str != null) {
                try {
                    f391406d = new lo0.t(str);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveBeautyUtil", "Beauty package parsing failed. " + e17);
                }
            }
        }
        lo0.t tVar = f391406d;
        if (tVar == null) {
            lo0.t tVar2 = lo0.t.f401607i;
            tVar = lo0.t.f401607i;
        }
        tVar.getClass();
        f391407e = new lo0.t(tVar);
    }

    public final void e(java.lang.String resUrl, java.lang.String resMd5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resUrl, "resUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resMd5, "resMd5");
        jz5.g gVar = f391410h;
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).putString("res_url", resUrl);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).putString("res_md5", resMd5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBeautyUtil", "#updateResUrl resUrl=" + resUrl + " resMd5=" + resMd5);
    }
}
