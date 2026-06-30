package go;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static int f355232d;

    /* renamed from: i, reason: collision with root package name */
    public static long f355237i;

    /* renamed from: a, reason: collision with root package name */
    public static final go.d f355229a = new go.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f355230b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f355231c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f355233e = "";

    /* renamed from: f, reason: collision with root package name */
    public static yz5.l f355234f = go.a.f355226d;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f355235g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f355236h = jz5.h.b(go.b.f355227d);

    public final int a(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        int c17 = c(f355233e);
        if (c17 != 1) {
            if (c17 != 2) {
                return c17;
            }
            f355232d = 0;
            e().A(f355233e, 0);
            return 0;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293312f = false;
        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.nfg);
        e4Var.c();
        f355237i = msgInfo.m124847x74d37ac6();
        f(msgInfo);
        e().A(f355233e, 2);
        int o17 = e().o("enable_times", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoTranslationCache", "buttonClick() auto translation enable times: " + o17);
        if (o17 == 0 || o17 == 1) {
            e().A("enable_times", o17 + 1);
        } else if (o17 == 2) {
            e().A("enable_times", o17 + 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoTranslationCache", "buttonClick() auto translation insert system tips after: [" + msgInfo.j() + "](" + msgInfo.m124847x74d37ac6() + ')');
            java.lang.String Q0 = msgInfo.Q0();
            long m124847x74d37ac6 = msgInfo.m124847x74d37ac6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoTranslationSysTipHelper", "insertSysTip talkerMap:" + Q0 + ", msgId:" + m124847x74d37ac6);
            pm0.v.K(null, new go.f(new com.p314xaae8f345.mm.p2621x8fb0427b.f9(), Q0, m124847x74d37ac6));
        }
        return 2;
    }

    public final void b(boolean z17, long j17) {
        if (z17) {
            return;
        }
        if (!(f355233e.length() == 0) && c(f355233e) == 0) {
            int i17 = f355232d + 1;
            if (i17 <= 3) {
                f355235g.add(java.lang.Long.valueOf(j17));
            }
            if (i17 >= 3) {
                e().A(f355233e, 1);
            }
            f355232d = i17;
        }
    }

    public final int c(java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        if (e().i("enable_globally", false)) {
            return 2;
        }
        return e().o(talker, 0);
    }

    public final int d(java.lang.String talker, long j17) {
        java.lang.Long l17;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        if (!e().i("enable_globally", false) && (l17 = (java.lang.Long) f355230b.get(talker)) != null && l17.longValue() == j17) {
            java.util.Iterator it = f355235g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (((java.lang.Number) it.next()).longValue() == j17) {
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                return c(talker);
            }
        }
        return 0;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f355236h).mo141623x754a37bb();
    }

    public final void f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        f355234f.mo146xb9724478(msgInfo);
        f355231c.put(java.lang.Long.valueOf(msgInfo.m124847x74d37ac6()), java.lang.Boolean.TRUE);
        java.lang.String talker = f355233e;
        long mo78012x3fdd41df = msgInfo.mo78012x3fdd41df();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        if (mo78012x3fdd41df > e().q(talker.concat("@last_translation"), 0L)) {
            e().B(f355233e + "@last_translation", mo78012x3fdd41df);
        }
    }
}
