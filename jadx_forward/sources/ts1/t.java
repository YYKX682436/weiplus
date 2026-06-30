package ts1;

/* loaded from: classes.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f503150d;

    public t(java.util.List list) {
        this.f503150d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        for (zq1.i0 i0Var : this.f503150d) {
            java.lang.String url = i0Var.f556516a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
            if (r26.i0.y(url, "http", false) && i0Var.f556526k != null) {
                java.lang.String a17 = ts1.u.a(i0Var.f556516a);
                java.lang.String b17 = ts1.u.b(a17, i0Var);
                if (a17.length() > 0) {
                    if (b17.length() > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherUrlQueryManager", "saveUrlQueryList key: " + a17 + ", encodeQueryList " + b17);
                        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ts1.u.f503151a.i()).D(a17, b17);
                    } else {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = ts1.u.f503151a;
                        if (v3Var.m(a17)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherUrlQueryManager", "saveUrlQueryList remove key: ".concat(a17));
                            v3Var.getClass();
                            int i18 = v3Var.f274419b;
                            if (i18 >= 0) {
                                while (true) {
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.o.h(v3Var, v3Var.e(i17), 0L, 2, null);
                                    if (o4Var != null) {
                                        o4Var.remove(a17);
                                    }
                                    i17 = i17 != i18 ? i17 + 1 : 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
