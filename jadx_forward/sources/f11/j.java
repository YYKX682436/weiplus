package f11;

/* loaded from: classes.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f340092b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f340093c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f340094d;

    /* renamed from: e, reason: collision with root package name */
    public static f11.j f340095e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f340096a = false;

    static {
        java.lang.String str = lp0.b.h() + "fonts/";
        f340092b = str + "temp/";
        f340093c = str + "WXkatonglemiao.ttf";
        f340094d = str + "WXxiari.ttf";
    }

    public static f11.j b() {
        synchronized (f11.j.class) {
            if (f340095e == null) {
                f11.j jVar = new f11.j();
                f340095e = jVar;
                jVar.c();
            }
        }
        return f340095e;
    }

    public boolean a() {
        if (com.p314xaae8f345.mm.vfs.w6.j(f340093c) && com.p314xaae8f345.mm.vfs.w6.j(f340094d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontResLogic", "font file exist");
            this.f340096a = true;
        } else {
            this.f340096a = false;
        }
        return this.f340096a;
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontResLogic", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        if (a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(933L, 4L);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.B(933L, 5L);
        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(57, 1);
        if (com.p314xaae8f345.mm.vfs.w6.j(Bi)) {
            g0Var.B(933L, 6L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontResLogic", "cache file exist %s", Bi);
            d(Bi, 57, 1, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1 A[Catch: all -> 0x0131, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0012, B:18:0x008b, B:25:0x00a8, B:33:0x00d1, B:34:0x00f6, B:35:0x00db, B:41:0x0120, B:42:0x012e, B:39:0x0111, B:10:0x0030, B:12:0x0047, B:15:0x007c, B:17:0x0084, B:22:0x0099, B:24:0x00a1, B:28:0x00b6, B:30:0x00c3, B:38:0x00fb), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db A[Catch: all -> 0x0131, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0012, B:18:0x008b, B:25:0x00a8, B:33:0x00d1, B:34:0x00f6, B:35:0x00db, B:41:0x0120, B:42:0x012e, B:39:0x0111, B:10:0x0030, B:12:0x0047, B:15:0x007c, B:17:0x0084, B:22:0x0099, B:24:0x00a1, B:28:0x00b6, B:30:0x00c3, B:38:0x00fb), top: B:2:0x0001, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void d(java.lang.String r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f11.j.d(java.lang.String, int, int, int):void");
    }

    public final boolean e(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        java.lang.String optString2 = jSONObject.optString("md5");
        java.lang.String str2 = f340092b + optString;
        java.lang.String b17 = uk.k.b(str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) || !b17.equalsIgnoreCase(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FontResLogic", "download %s not match! %s %s", optString, b17, optString2);
            return false;
        }
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        com.p314xaae8f345.mm.vfs.w6.w(str2, str);
        return true;
    }
}
