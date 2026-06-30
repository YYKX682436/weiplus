package ko0;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f391362e;

    /* renamed from: f, reason: collision with root package name */
    public static lo0.g0 f391363f;

    /* renamed from: g, reason: collision with root package name */
    public static lo0.g0 f391364g;

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.c0 f391358a = new ko0.c0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f391359b = lp0.b.h() + "live/filters";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f391360c = lp0.b.h() + "live/filters_v000";

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f391361d = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f391365h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f391366i = "";

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f391367j = jz5.h.b(ko0.b0.f391353d);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:23:0x00ad, B:26:0x00b2), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v0, types: [ko0.u] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v32, types: [lo0.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ko0.u r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko0.c0.a(ko0.u, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final lo0.g0 b() {
        lo0.g0 g0Var = f391364g;
        if (g0Var != null) {
            return g0Var;
        }
        lo0.g0 g0Var2 = lo0.g0.f401523f;
        return lo0.g0.f401523f;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f391367j).mo141623x754a37bb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    public final void d(boolean z17) {
        lo0.g0 g0Var;
        java.lang.Object obj;
        lo0.b0 b0Var;
        if (z17) {
            g0Var = f391363f;
            if (g0Var == null) {
                g0Var = lo0.g0.f401523f;
            }
        } else {
            g0Var = lo0.g0.f401523f;
        }
        g0Var.getClass();
        lo0.g0 g0Var2 = new lo0.g0(g0Var);
        if (g0Var2.f401525a) {
            java.lang.String string = c().getString(gm0.j1.b().h() + "_select_which", null);
            java.util.List<lo0.b0> list = g0Var2.f401526b;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (r26.i0.p(((lo0.b0) obj).f401500a, string, false)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            lo0.b0 b0Var2 = (lo0.b0) obj;
            if (b0Var2 == null) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        b0Var = it6.next();
                        if (!((lo0.b0) b0Var).f401501b) {
                            break;
                        }
                    } else {
                        b0Var = 0;
                        break;
                    }
                }
                b0Var2 = b0Var;
                if (b0Var2 == null) {
                    b0Var2 = (lo0.b0) kz5.n0.X(list);
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b0Var2, "<set-?>");
            g0Var2.f401529e = b0Var2;
            for (lo0.b0 b0Var3 : list) {
                ko0.c0 c0Var = f391358a;
                java.lang.String str = b0Var3.f401500a;
                int i17 = c0Var.c().getInt(gm0.j1.b().h() + "_filter_value_" + str, Integer.MIN_VALUE);
                b0Var3.f401507h = i17 != Integer.MIN_VALUE ? i17 / 100.0d : b0Var3.f401504e;
                lo0.b bVar = b0Var3.f401506g;
                if (bVar != null && bVar.f401497e == null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c17 = c0Var.c();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_LIVE_BEAUTY_BADGE_VERSION_FILTER_");
                    sb6.append(gm0.j1.b().h());
                    sb6.append('_');
                    java.lang.String str2 = bVar.f401493a;
                    sb6.append(str2);
                    int i18 = c17.getInt(sb6.toString(), -1);
                    if (i18 < 0) {
                        bVar.f401497e = java.lang.Integer.valueOf(bVar.f401495c);
                        java.lang.String str3 = bVar.f401496d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                        bVar.f401498f = str3;
                        c0Var.e(bVar);
                    } else {
                        bVar.f401497e = java.lang.Integer.valueOf(i18);
                        java.lang.String string2 = c0Var.c().getString("MMKV_LIVE_BEAUTY_BADGE_GROUP_FILTER_" + gm0.j1.b().h() + '_' + str2, null);
                        if (string2 == null) {
                            string2 = "";
                        }
                        bVar.f401498f = string2;
                    }
                }
            }
            g0Var2.f401528d.b();
        }
        f391364g = g0Var2;
    }

    public final void e(lo0.b badge) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badge, "badge");
        java.lang.Integer num = badge.f401497e;
        if (num != null) {
            int intValue = num.intValue();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c17 = c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_LIVE_BEAUTY_BADGE_VERSION_FILTER_");
            sb6.append(gm0.j1.b().h());
            sb6.append('_');
            java.lang.String str = badge.f401493a;
            sb6.append(str);
            c17.putInt(sb6.toString(), intValue);
            c().putString("MMKV_LIVE_BEAUTY_BADGE_GROUP_FILTER_" + gm0.j1.b().h() + '_' + str, badge.f401498f);
        }
    }

    public final void f(java.lang.String str) {
        c().putString(gm0.j1.b().h() + "_select_which", str);
    }

    public final void g(java.lang.String str, double d17) {
        c().putInt(gm0.j1.b().h() + "_filter_value_" + str, a06.d.a(d17 * 100.0d));
    }

    public final void h(lo0.g0 filterPackage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterPackage, "filterPackage");
        if (filterPackage.f401525a) {
            f(filterPackage.f401529e.f401500a);
            for (lo0.b0 b0Var : filterPackage.f401526b) {
                f391358a.g(b0Var.f401500a, b0Var.f401507h);
            }
        }
    }

    public final void i(java.lang.String resUrl, java.lang.String resMd5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resUrl, "resUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resMd5, "resMd5");
        f391365h = resUrl;
        f391366i = resMd5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCore.LiveFilterUtil", "#updateResUrl resUrl=" + resUrl + " resMd5=" + resMd5);
    }
}
