package f65;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.o f341445a = new f65.o();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f341446b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f341447c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f341448d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f341449e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f341450f = "";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f341451g = "";

    /* renamed from: h, reason: collision with root package name */
    public static int f341452h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f341453i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f341454j = "";

    /* renamed from: k, reason: collision with root package name */
    public static int f341455k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f341456l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f341457m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static long f341458n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static int f341459o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static int f341460p;

    /* renamed from: q, reason: collision with root package name */
    public static int f341461q;

    /* renamed from: r, reason: collision with root package name */
    public static int f341462r;

    /* renamed from: s, reason: collision with root package name */
    public static long f341463s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f341464t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f341465u;

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReporter", "clear search >> " + f341450f);
        f341450f = "";
        f341456l = 0;
        f341451g = "";
        f341455k = 0;
        f341463s = 0L;
        f341457m = 0;
        f341454j = "";
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6659x3e773f99 c6659x3e773f99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6659x3e773f99();
        c6659x3e773f99.f140058s = c6659x3e773f99.b("Username", f341446b, true);
        c6659x3e773f99.f140043d = c6659x3e773f99.b("sessionid", f341447c, true);
        c6659x3e773f99.f140045f = i17;
        if (i17 == 1) {
            c6659x3e773f99.f140046g = f341448d;
            c6659x3e773f99.f140049j = c6659x3e773f99.b("ExpoQuery", f341449e, true);
            c6659x3e773f99.f140059t = f341452h;
        } else if (i17 == 2) {
            c6659x3e773f99.f140062w = f341462r;
        } else if (i17 == 4) {
            c6659x3e773f99.p(f341451g);
            c6659x3e773f99.f140057r = f341453i;
            c6659x3e773f99.f140061v = f341461q;
            c6659x3e773f99.f140051l = 3L;
            f341455k = 3;
            c(52);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReporter", "externalReport >> action: " + c6659x3e773f99.f140045f);
        c6659x3e773f99.k();
    }

    public final void c(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6659x3e773f99 c6659x3e773f99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6659x3e773f99();
        c6659x3e773f99.f140058s = c6659x3e773f99.b("Username", f341446b, true);
        c6659x3e773f99.f140043d = c6659x3e773f99.b("sessionid", f341447c, true);
        if ((f341450f.length() == 0) && i17 != 51) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReporter", "action: " + i17 + ", searchSessionId is empty, no report");
            return;
        }
        c6659x3e773f99.f140044e = c6659x3e773f99.b("searchsessionid", f341450f, true);
        c6659x3e773f99.f140057r = f341453i;
        c6659x3e773f99.f140061v = f341461q;
        c6659x3e773f99.f140045f = i17;
        if (i17 != 5) {
            switch (i17) {
                case 51:
                    if (!f341464t) {
                        f341464t = true;
                        break;
                    } else {
                        return;
                    }
                case 52:
                    c6659x3e773f99.p(f341451g);
                    c6659x3e773f99.f140047h = c6659x3e773f99.b("PrintQuery", f341454j, true);
                    c6659x3e773f99.f140051l = f341455k;
                    break;
                case 53:
                    c6659x3e773f99.p(f341451g);
                    break;
                case 54:
                    c6659x3e773f99.p(f341451g);
                    c6659x3e773f99.f140055p = f341459o;
                    break;
                case 55:
                    c6659x3e773f99.p(f341451g);
                    c6659x3e773f99.f140053n = f341457m;
                    break;
                case 56:
                    if (f341456l != 0) {
                        c6659x3e773f99.p(f341451g);
                        c6659x3e773f99.f140052m = f341456l;
                        c6659x3e773f99.f140053n = f341457m;
                        c6659x3e773f99.f140056q = java.lang.System.currentTimeMillis() - f341463s;
                        a();
                        break;
                    } else {
                        return;
                    }
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                    if (f341456l <= 0) {
                        c6659x3e773f99.p(f341451g);
                        c6659x3e773f99.f140052m = f341456l;
                        c6659x3e773f99.f140056q = java.lang.System.currentTimeMillis() - f341463s;
                        a();
                        break;
                    } else {
                        return;
                    }
            }
        } else {
            c6659x3e773f99.f140054o = f341458n;
            c6659x3e773f99.f140055p = f341459o;
            c6659x3e773f99.p(f341451g);
            c6659x3e773f99.f140060u = f341460p;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReporter", "internalReport >> action: " + c6659x3e773f99.f140045f);
        c6659x3e773f99.k();
    }

    public final void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReporter", "setSearchPeopleImageCnt >> " + i17 + ' ' + f341450f);
        if (f341450f.length() == 0) {
            return;
        }
        f341457m = i17;
    }

    public final void e(java.lang.String queryText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queryText, "queryText");
        f341451g = r26.i0.t(queryText, ",", " ", false);
    }

    public final void f() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f341463s = currentTimeMillis;
        f341457m = 0;
        f341456l = 0;
        f341465u = false;
        f341450f = java.lang.String.valueOf(currentTimeMillis);
        f341455k = 0;
    }
}
