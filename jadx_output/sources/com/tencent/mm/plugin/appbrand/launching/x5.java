package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class x5 implements com.tencent.mm.plugin.appbrand.launching.a7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.x5 f85410a = new com.tencent.mm.plugin.appbrand.launching.x5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f85411b = new java.util.concurrent.ConcurrentHashMap();

    public static final r45.le3 c(com.tencent.mm.plugin.appbrand.launching.z6 z6Var, java.lang.String str) {
        int i17;
        r45.le3 le3Var = new r45.le3();
        le3Var.f379367d = f85410a.d(z6Var);
        le3Var.f379369f = z6Var.f85467m;
        boolean z17 = true;
        if (z6Var.f85469o) {
            le3Var.f379371h = true;
            le3Var.f379370g = z6Var.f85465h;
        } else {
            le3Var.f379370g = z6Var.f85465h;
        }
        java.lang.String str2 = z6Var.f85466i;
        if (!(str2 == null || str2.length() == 0)) {
            le3Var.f379374n = z6Var.f85466i;
        }
        java.lang.String str3 = z6Var.f85470p;
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            le3Var.f379376p = z6Var.f85470p;
            le3Var.f379371h = false;
        }
        if (com.tencent.mm.plugin.appbrand.appcache.g0.a(le3Var.f379367d.f378074h)) {
            try {
                if (le3Var.f379367d.f378073g == 6) {
                    i17 = new kk.v(((com.tencent.mm.plugin.appbrand.launching.ya) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.ya.class)).z0(le3Var.f379367d.f378070d, le3Var.f379374n)).f308478d;
                } else {
                    com.tencent.mm.plugin.appbrand.launching.a5 a5Var = (com.tencent.mm.plugin.appbrand.launching.a5) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.a5.class);
                    r45.jr5 jr5Var = le3Var.f379367d;
                    java.lang.String y07 = a5Var.y0(jr5Var.f378070d, jr5Var.f378074h);
                    if (y07 == null) {
                        y07 = "";
                    }
                    i17 = new kk.v(new org.json.JSONObject(y07).optLong("dev_key")).f308478d;
                }
                le3Var.f379373m = i17;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CommonPkgFetcherUtils", "GetDownloadUrlReqItem.fillDevUin(" + le3Var.f379367d.f378070d + ", " + le3Var.f379367d.f378074h + "), throwable=" + th6);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createNewProtocolReqItemList$buildBasicItem(");
        sb6.append(str);
        sb6.append(")appId:");
        sb6.append(le3Var.f379367d.f378070d);
        sb6.append(", packageType:");
        sb6.append(le3Var.f379367d.f378073g);
        sb6.append(", module:");
        java.lang.String str4 = le3Var.f379367d.f378072f;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(", version_desc:");
        java.lang.String str5 = le3Var.f379374n;
        if (str5 == null) {
            str5 = "";
        }
        sb6.append(str5);
        sb6.append(", dev_uin:");
        sb6.append(kk.v.a(le3Var.f379373m));
        sb6.append(", need_latest_version:");
        sb6.append(le3Var.f379371h);
        sb6.append(", semver:");
        java.lang.String str6 = le3Var.f379376p;
        sb6.append(str6 != null ? str6 : "");
        sb6.append(", versionType:");
        sb6.append(le3Var.f379367d.f378074h);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb6.toString());
        return le3Var;
    }

    public static final java.lang.String f(r45.os3 os3Var) {
        return "GetWxaAppCDNDownloadUrlRequest(appId:" + os3Var.f382481e + " version:" + os3Var.f382482f + " moduleName:" + os3Var.f382486m + " pacakgeType:" + os3Var.f382484h + " scene:" + os3Var.f382494u + ')';
    }

    public static final r45.le3 g(com.tencent.mm.plugin.appbrand.appcache.u uVar) {
        r45.le3 le3Var = new r45.le3();
        r45.jr5 jr5Var = new r45.jr5();
        le3Var.f379367d = jr5Var;
        jr5Var.f378070d = uVar.D().f382481e;
        le3Var.f379370g = uVar.D().f382482f;
        le3Var.f379367d.f378073g = uVar.D().f382484h;
        le3Var.f379367d.f378072f = uVar.D().f382486m;
        le3Var.f379369f = 0;
        return le3Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.a7
    public void a(com.tencent.mm.plugin.appbrand.launching.z6 request, yz5.l onSuccess, yz5.q onError, int i17, r45.y50 cgiCommRequestSource, java.lang.String str) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onError, "onError");
        kotlin.jvm.internal.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        r45.me3[] me3VarArr = (r45.me3[]) f85411b.remove(request);
        if (me3VarArr != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForDownloadUrl, intercepted by PreGet with " + request);
            if (kz5.z.U(me3VarArr, 0) != null) {
                onSuccess.invoke(me3VarArr);
                return;
            }
        }
        if (!request.f85469o && kz5.z.F(qq5.a.f365996c, request.f85463f)) {
            int i18 = com.tencent.mm.plugin.appbrand.launching.s5.f85140a;
            com.tencent.mm.plugin.appbrand.launching.r5 r5Var = com.tencent.mm.plugin.appbrand.launching.r5.f85103b;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "goNewCgi: %b,appId: %s", true, request.f85461d);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.appbrand.launching.v5(str, onError, request, i17, cgiCommRequestSource, onSuccess, null), 2, null);
    }

    public final java.util.List b(com.tencent.mm.plugin.appbrand.launching.z6 z6Var) {
        kotlin.jvm.internal.o.g(z6Var, "<this>");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.le3 c17 = c(z6Var, "gzip");
        c17.f379368e = null;
        c17.f379372i = false;
        linkedList.add(c17);
        if (com.tencent.mm.plugin.appbrand.appcache.g0.a(z6Var.f85464g)) {
            return linkedList;
        }
        r45.le3 c18 = c(z6Var, "zstd");
        c18.f379368e = null;
        c18.f379372i = true;
        linkedList.add(c18);
        if (z6Var.f85468n > 0) {
            r45.le3 c19 = c(z6Var, "patch");
            r45.jc4 jc4Var = new r45.jc4();
            c19.f379368e = jc4Var;
            jc4Var.f377698d = z6Var.f85468n;
            jc4Var.f377699e = 0;
            c19.f379372i = false;
            linkedList.add(c19);
        }
        return linkedList;
    }

    public final r45.jr5 d(com.tencent.mm.plugin.appbrand.launching.z6 z6Var) {
        r45.jr5 jr5Var = new r45.jr5();
        jr5Var.f378070d = z6Var.f85461d;
        int i17 = z6Var.f85463f;
        if (kz5.z.F(qq5.a.f365998e, i17)) {
            jr5Var.f378072f = null;
        } else if (kz5.z.F(qq5.a.f365997d, i17)) {
            jr5Var.f378072f = null;
        } else {
            jr5Var.f378072f = z6Var.f85462e;
        }
        jr5Var.f378073g = z6Var.f85463f;
        jr5Var.f378074h = z6Var.f85464g;
        return jr5Var;
    }

    public final void e(java.util.List inRequestList, yz5.l onSuccess, yz5.q onError, int i17, r45.y50 cgiCommRequestSource, java.lang.String str) {
        kotlin.jvm.internal.o.g(inRequestList, "inRequestList");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onError, "onError");
        kotlin.jvm.internal.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        if (inRequestList.size() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForBatchGetDownloadUrl, use single routine instead, with " + kz5.n0.X(inRequestList));
            a((com.tencent.mm.plugin.appbrand.launching.z6) inRequestList.get(0), new com.tencent.mm.plugin.appbrand.launching.t5(onSuccess), onError, i17, cgiCommRequestSource, str);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList(inRequestList);
        java.util.Iterator it = linkedList2.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            com.tencent.mm.plugin.appbrand.launching.z6 z6Var = (com.tencent.mm.plugin.appbrand.launching.z6) next;
            r45.me3[] me3VarArr = (r45.me3[]) f85411b.remove(z6Var);
            if (me3VarArr != null && kz5.z.U(me3VarArr, 0) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForBatchGetDownloadUrl, intercepted by PreGet with " + z6Var);
                it.remove();
                for (r45.me3 me3Var : me3VarArr) {
                    if (me3Var != null) {
                        linkedList.add(me3Var);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForBatchGetDownloadUrl, inRequestList.size=" + inRequestList.size() + ", realRequestList.size=" + linkedList2.size() + ", preGetRespItemList.size=" + linkedList.size());
        if (linkedList2.size() > 0) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.appbrand.launching.u5(str, onSuccess, onError, linkedList2, i17, cgiCommRequestSource, linkedList, null), 2, null);
            return;
        }
        r45.kf kfVar = new r45.kf();
        kfVar.f378644d.addAll(linkedList);
        onSuccess.invoke(kfVar);
    }
}
