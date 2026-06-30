package or2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    public static final or2.a f429140a = new or2.a();

    /* renamed from: b */
    public static int f429141b = 0;

    /* renamed from: c */
    public static long f429142c = 0;

    /* renamed from: d */
    public static long f429143d = 0;

    /* renamed from: e */
    public static java.lang.String f429144e = "";

    /* renamed from: f */
    public static int f429145f;

    /* renamed from: g */
    public static int f429146g;

    /* renamed from: h */
    public static boolean f429147h;

    /* renamed from: i */
    public static boolean f429148i;

    public static /* synthetic */ void d(or2.a aVar, boolean z17, boolean z18, long j17, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            z19 = false;
        }
        aVar.c(z17, z18, j17, z19);
    }

    public final boolean a() {
        int i17 = f429146g - 1;
        f429146g = i17;
        if (i17 > 0) {
            return false;
        }
        f429146g = 0;
        if ((f429141b & 1) != 0) {
            d(this, true, true, f429143d, false, 8, null);
        } else {
            d(this, false, false, 0L, false, 8, null);
        }
        return true;
    }

    public final void b(boolean z17, boolean z18) {
        int i17 = f429141b;
        int i18 = z17 ? i17 | 4 : i17 & (-5);
        f429141b = i18;
        long j17 = f429142c;
        if (!z17) {
            f429142c = 0L;
        }
        if (i17 == i18 && j17 == f429142c && !z18) {
            return;
        }
        e();
    }

    public final void c(boolean z17, boolean z18, long j17, boolean z19) {
        long j18 = f429143d;
        int i17 = f429141b;
        if (z17) {
            f429143d = j17;
            int i18 = z18 ? i17 | 1 : i17 | 2;
            f429141b = i18;
            if (z18 && f429146g <= 0) {
                f429141b = i18 & (-3);
            }
        } else {
            f429143d = 0L;
            f429141b = (i17 & 4) != 0 ? 4 : 0;
        }
        if (i17 == f429141b && j18 == f429143d && !z19) {
            return;
        }
        e();
    }

    public final void e() {
        java.lang.String str;
        if (f429141b > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("\"userType\":" + f429141b);
            if (f429142c != 0) {
                arrayList.add("\"feedID\":" + ((java.lang.Object) jz5.x.a(f429142c)));
            }
            if (f429143d != 0) {
                arrayList.add("\"liveID\":" + ((java.lang.Object) jz5.x.a(f429143d)));
            }
            if (f429147h) {
                arrayList.add("\"isFloat\":4");
            } else if (f429148i) {
                arrayList.add("\"isFloat\":2");
            }
            str = "{" + kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null) + '}';
        } else {
            str = "";
        }
        f429144e = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCrash", "json=" + f429144e);
        com.p314xaae8f345.mm.app.C5000x71a2fa35.Z.e(f429144e);
        com.p314xaae8f345.mm.app.C4999x403c3a42.f134763k.f135260q.e(f429144e);
        r26.i0.u(f429144e, ',', ';', false, 4, null);
    }
}
