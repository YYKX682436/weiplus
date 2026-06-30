package df;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static int f311053d;

    /* renamed from: a, reason: collision with root package name */
    public static final df.n f311050a = new df.n();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f311051b = new java.util.concurrent.atomic.AtomicInteger(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7.f10219x6e770e02);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f311052c = k91.d3.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, k91.n0.a());

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f311054e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f311055f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f311056g = new java.lang.Object();

    public final void a(int i17, java.lang.String url, java.util.HashMap requestHeader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestHeader, "requestHeader");
        synchronized (f311056g) {
            int i18 = f311053d;
            if (i18 > 10) {
                f311054e.addLast(new df.k(i17, url, requestHeader));
                return;
            }
            f311053d = i18 + 1;
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
            cronetRequestParams.url = url;
            java.lang.String valueOf = java.lang.String.valueOf(f311051b.incrementAndGet());
            cronetRequestParams.f18180xcb7ef180 = valueOf;
            f311055f.add(valueOf);
            cronetRequestParams.f18166x25da56ad = true;
            cronetRequestParams.f18174xbfc5d0e1 = "GET";
            cronetRequestParams.f18183xeddcaf63 = true;
            cronetRequestParams.f18185xf72c4065 = true;
            cronetRequestParams.f18184x1eb6f2fa = false;
            requestHeader.put("Accept-Encoding", "gzip,compress,br,deflate");
            requestHeader.put("User-Agent", f311052c);
            cronetRequestParams.m37968xeb7416ae(requestHeader);
            cronetRequestParams.f18181xe78dee5f = 1;
            df.l lVar = new df.l(cronetRequestParams);
            java.lang.String taskId = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, new df.m(lVar, i17, cronetRequestParams)).f18158xcb7ef180;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(taskId, "taskId");
            lVar.f311039e = taskId;
            ((ku5.t0) ku5.t0.f394148d).k(lVar, 30000L);
        }
    }
}
