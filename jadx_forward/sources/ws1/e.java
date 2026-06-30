package ws1;

/* loaded from: classes7.dex */
public final class e implements hw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f530521a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xs1.d f530522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xs1.b f530523c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f530525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530527g;

    public e(xs1.d dVar, xs1.b bVar, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3) {
        this.f530522b = dVar;
        this.f530523c = bVar;
        this.f530524d = str;
        this.f530525e = j17;
        this.f530526f = str2;
        this.f530527g = str3;
    }

    @Override // hw4.a
    public int a(com.p314xaae8f345.mm.p971x6de15a2e.j2 connection, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl onCronetReceiveHeader statusCode: " + i17 + ", session: " + this.f530525e);
        java.util.HashMap hashMap = this.f530521a;
        if ((i17 == 200 || i17 == 304 || i17 == 301 || i17 == 302) && hashMap.isEmpty()) {
            e(connection, i17, hashMap);
        }
        xs1.b bVar = this.f530523c;
        if (bVar.a(connection, i17, hashMap)) {
            return 0;
        }
        bVar.b(connection, new xs1.e(this.f530527g, false, hashMap));
        return -99;
    }

    @Override // hw4.a
    public void b(com.p314xaae8f345.mm.p971x6de15a2e.j2 connection, java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
    }

    @Override // hw4.a
    public void c(com.p314xaae8f345.mm.p971x6de15a2e.j2 connection, java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadUrl onCronetTaskCompleted statusCode: %s, session: %s, fileSize:");
        java.lang.String str3 = this.f530524d;
        sb6.append(com.p314xaae8f345.mm.vfs.w6.k(str3));
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = cronetTaskResult != null ? java.lang.Integer.valueOf(cronetTaskResult.f18207xec0a8ff) : null;
        objArr[1] = java.lang.Long.valueOf(this.f530525e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherHttpDownloader", sb7, objArr);
        xs1.b bVar = this.f530523c;
        java.lang.String str4 = this.f530527g;
        java.lang.String str5 = this.f530526f;
        java.util.HashMap hashMap = this.f530521a;
        if (cronetTaskResult != null) {
            int i17 = cronetTaskResult.f18207xec0a8ff;
            if (i17 != 200) {
                if (i17 == 301 || i17 == 302) {
                    if (hashMap.isEmpty()) {
                        e(connection, cronetTaskResult.f18207xec0a8ff, hashMap);
                    }
                    bVar.a(connection, cronetTaskResult.f18207xec0a8ff, hashMap);
                }
            } else if (com.p314xaae8f345.mm.vfs.w6.x(str3, str5, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl save file success:" + str4 + " to " + str5 + " fileSize:" + com.p314xaae8f345.mm.vfs.w6.k(str5));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl save file failed:" + str4 + " to " + str3);
            }
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str3);
        if (r6Var.m()) {
            r6Var.l();
        }
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str5);
        xs1.e eVar = new xs1.e(str4, j17, hashMap);
        if (j17) {
            if (!(str5 == null || str5.length() == 0)) {
                eVar.f537836c = new com.p314xaae8f345.mm.vfs.r6(str5);
            }
        }
        bVar.b(connection, eVar);
    }

    @Override // hw4.a
    public void d(com.p314xaae8f345.mm.p971x6de15a2e.j2 connection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        xs1.d dVar = this.f530522b;
        if (dVar.f537830b.m()) {
            if (!r26.n0.N(dVar.f537833e)) {
                connection.h("x-wx-if-none-match", dVar.f537833e);
            }
            if (!r26.n0.N(dVar.f537832d)) {
                connection.h("if-none-match", dVar.f537832d);
            }
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String a17 = hy4.w.f367733f.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a;
        connection.h("User-Agent", ik1.l0.a(context, a17, (hy4.w) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175982e).mo141623x754a37bb()));
        connection.f153573f = 10000;
        connection.f153572e = 3000;
        this.f530523c.c(connection);
    }

    public final void e(com.p314xaae8f345.mm.p971x6de15a2e.j2 j2Var, int i17, java.util.HashMap hashMap) {
        synchronized (j2Var) {
            java.util.Map map = j2Var.f153585r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "getHeaderFields(...)");
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.util.List list = (java.util.List) entry.getValue();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "status")) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    java.util.Locale locale = java.util.Locale.getDefault();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                    java.lang.String lowerCase = str.toLowerCase(locale);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                    hashMap.put(lowerCase, list);
                }
            }
            if (i17 == 304) {
                hashMap.put("status", kz5.b0.c("200"));
            } else {
                hashMap.put("status", kz5.b0.c(java.lang.String.valueOf(i17)));
            }
        }
    }
}
