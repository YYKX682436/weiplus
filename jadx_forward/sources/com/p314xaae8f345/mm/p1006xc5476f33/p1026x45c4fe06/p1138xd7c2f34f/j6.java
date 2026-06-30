package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6 f166225a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f166226b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final ik1.x f166227c = new ik1.x();

    /* renamed from: d, reason: collision with root package name */
    public static final ik1.x f166228d = new ik1.x();

    /* renamed from: e, reason: collision with root package name */
    public static final ik1.x f166229e = new ik1.x();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f166230f = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b6 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6 j6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, yz5.l onSuccess, yz5.p onError, yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7 a7Var, r45.y50 cgiCommRequestSource, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 l6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6 k6Var, java.util.concurrent.Executor executor, java.lang.String str, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var2;
        yz5.l onProgress = (i17 & 8) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f6.f166143d : lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7 cgiExecutor = (i17 & 16) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166943a : a7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 l6Var2 = (i17 & 64) != 0 ? null : l6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6 k6Var2 = (i17 & 128) != 0 ? null : k6Var;
        java.util.concurrent.Executor executor2 = (i17 & 256) != 0 ? null : executor;
        java.lang.String str2 = (i17 & 512) != 0 ? null : str;
        j6Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuccess, "onSuccess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onError, "onError");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiExecutor, "cgiExecutor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        java.util.concurrent.Executor executor3 = executor2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i6 i6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i6(request, onSuccess, onError, onProgress, cgiExecutor, cgiCommRequestSource, k6Var2, str2, c0Var);
        java.util.Map map = f166226b;
        if (map instanceof java.util.concurrent.ConcurrentHashMap) {
            java.lang.Object computeIfAbsent = ((java.util.concurrent.ConcurrentHashMap) map).computeIfAbsent(request, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g6(i6Var));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(computeIfAbsent, "computeIfAbsent(...)");
            q4Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4) computeIfAbsent;
        } else {
            synchronized (map) {
                q4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4) ((java.util.concurrent.ConcurrentHashMap) map).get(request);
                if (q4Var == null) {
                    java.lang.Object mo152xb9724478 = i6Var.mo152xb9724478();
                    ((java.util.concurrent.ConcurrentHashMap) map).put(request, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4) mo152xb9724478);
                    q4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4) mo152xb9724478;
                }
            }
            q4Var2 = q4Var;
        }
        if (l6Var2 != null) {
            q4Var2.f166602l.add(l6Var2);
            q4Var2.f166606p = true;
        }
        if (c0Var.f391645d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ICommonPkgFetcher", "waitForPkg enqueue request(" + request + ')');
            (executor3 == null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c6.f166077d : executor3).execute(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h6(q4Var2), (java.lang.String) ((jz5.n) request.f166391n).mo141623x754a37bb()));
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b6.f166052e;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ICommonPkgFetcher", "waitForPkg already executing, add pending callbacks, request(" + request + ')');
        f166227c.e(request, onSuccess);
        f166228d.e(request, onError);
        f166229e.e(request, onProgress);
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b6.f166051d;
    }
}
