package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class x5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5 f166943a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f166944b = new java.util.concurrent.ConcurrentHashMap();

    public static final r45.le3 c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var, java.lang.String str) {
        int i17;
        r45.le3 le3Var = new r45.le3();
        le3Var.f460900d = f166943a.d(z6Var);
        le3Var.f460902f = z6Var.f167000m;
        boolean z17 = true;
        if (z6Var.f167002o) {
            le3Var.f460904h = true;
            le3Var.f460903g = z6Var.f166998h;
        } else {
            le3Var.f460903g = z6Var.f166998h;
        }
        java.lang.String str2 = z6Var.f166999i;
        if (!(str2 == null || str2.length() == 0)) {
            le3Var.f460907n = z6Var.f166999i;
        }
        java.lang.String str3 = z6Var.f167003p;
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            le3Var.f460909p = z6Var.f167003p;
            le3Var.f460904h = false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(le3Var.f460900d.f459607h)) {
            try {
                if (le3Var.f460900d.f459606g == 6) {
                    i17 = new kk.v(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ya) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ya.class)).z0(le3Var.f460900d.f459603d, le3Var.f460907n)).f390011d;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5 a5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5.class);
                    r45.jr5 jr5Var = le3Var.f460900d;
                    java.lang.String y07 = a5Var.y0(jr5Var.f459603d, jr5Var.f459607h);
                    if (y07 == null) {
                        y07 = "";
                    }
                    i17 = new kk.v(new org.json.JSONObject(y07).optLong("dev_key")).f390011d;
                }
                le3Var.f460906m = i17;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CommonPkgFetcherUtils", "GetDownloadUrlReqItem.fillDevUin(" + le3Var.f460900d.f459603d + ", " + le3Var.f460900d.f459607h + "), throwable=" + th6);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createNewProtocolReqItemList$buildBasicItem(");
        sb6.append(str);
        sb6.append(")appId:");
        sb6.append(le3Var.f460900d.f459603d);
        sb6.append(", packageType:");
        sb6.append(le3Var.f460900d.f459606g);
        sb6.append(", module:");
        java.lang.String str4 = le3Var.f460900d.f459605f;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(", version_desc:");
        java.lang.String str5 = le3Var.f460907n;
        if (str5 == null) {
            str5 = "";
        }
        sb6.append(str5);
        sb6.append(", dev_uin:");
        sb6.append(kk.v.a(le3Var.f460906m));
        sb6.append(", need_latest_version:");
        sb6.append(le3Var.f460904h);
        sb6.append(", semver:");
        java.lang.String str6 = le3Var.f460909p;
        sb6.append(str6 != null ? str6 : "");
        sb6.append(", versionType:");
        sb6.append(le3Var.f460900d.f459607h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb6.toString());
        return le3Var;
    }

    public static final java.lang.String f(r45.os3 os3Var) {
        return "GetWxaAppCDNDownloadUrlRequest(appId:" + os3Var.f464014e + " version:" + os3Var.f464015f + " moduleName:" + os3Var.f464019m + " pacakgeType:" + os3Var.f464017h + " scene:" + os3Var.f464027u + ')';
    }

    public static final r45.le3 g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u uVar) {
        r45.le3 le3Var = new r45.le3();
        r45.jr5 jr5Var = new r45.jr5();
        le3Var.f460900d = jr5Var;
        jr5Var.f459603d = uVar.D().f464014e;
        le3Var.f460903g = uVar.D().f464015f;
        le3Var.f460900d.f459606g = uVar.D().f464017h;
        le3Var.f460900d.f459605f = uVar.D().f464019m;
        le3Var.f460902f = 0;
        return le3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 request, yz5.l onSuccess, yz5.q onError, int i17, r45.y50 cgiCommRequestSource, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuccess, "onSuccess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onError, "onError");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        r45.me3[] me3VarArr = (r45.me3[]) f166944b.remove(request);
        if (me3VarArr != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForDownloadUrl, intercepted by PreGet with " + request);
            if (kz5.z.U(me3VarArr, 0) != null) {
                onSuccess.mo146xb9724478(me3VarArr);
                return;
            }
        }
        if (!request.f167002o && kz5.z.F(qq5.a.f447529c, request.f166996f)) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s5.f166673a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r5 r5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r5.f166636b;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "goNewCgi: %b,appId: %s", true, request.f166994d);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v5(str, onError, request, i17, cgiCommRequestSource, onSuccess, null), 2, null);
    }

    public final java.util.List b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(z6Var, "<this>");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.le3 c17 = c(z6Var, "gzip");
        c17.f460901e = null;
        c17.f460905i = false;
        linkedList.add(c17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(z6Var.f166997g)) {
            return linkedList;
        }
        r45.le3 c18 = c(z6Var, "zstd");
        c18.f460901e = null;
        c18.f460905i = true;
        linkedList.add(c18);
        if (z6Var.f167001n > 0) {
            r45.le3 c19 = c(z6Var, "patch");
            r45.jc4 jc4Var = new r45.jc4();
            c19.f460901e = jc4Var;
            jc4Var.f459231d = z6Var.f167001n;
            jc4Var.f459232e = 0;
            c19.f460905i = false;
            linkedList.add(c19);
        }
        return linkedList;
    }

    public final r45.jr5 d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var) {
        r45.jr5 jr5Var = new r45.jr5();
        jr5Var.f459603d = z6Var.f166994d;
        int i17 = z6Var.f166996f;
        if (kz5.z.F(qq5.a.f447531e, i17)) {
            jr5Var.f459605f = null;
        } else if (kz5.z.F(qq5.a.f447530d, i17)) {
            jr5Var.f459605f = null;
        } else {
            jr5Var.f459605f = z6Var.f166995e;
        }
        jr5Var.f459606g = z6Var.f166996f;
        jr5Var.f459607h = z6Var.f166997g;
        return jr5Var;
    }

    public final void e(java.util.List inRequestList, yz5.l onSuccess, yz5.q onError, int i17, r45.y50 cgiCommRequestSource, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inRequestList, "inRequestList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuccess, "onSuccess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onError, "onError");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        if (inRequestList.size() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForBatchGetDownloadUrl, use single routine instead, with " + kz5.n0.X(inRequestList));
            a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6) inRequestList.get(0), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t5(onSuccess), onError, i17, cgiCommRequestSource, str);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList(inRequestList);
        java.util.Iterator it = linkedList2.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6) next;
            r45.me3[] me3VarArr = (r45.me3[]) f166944b.remove(z6Var);
            if (me3VarArr != null && kz5.z.U(me3VarArr, 0) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForBatchGetDownloadUrl, intercepted by PreGet with " + z6Var);
                it.remove();
                for (r45.me3 me3Var : me3VarArr) {
                    if (me3Var != null) {
                        linkedList.add(me3Var);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForBatchGetDownloadUrl, inRequestList.size=" + inRequestList.size() + ", realRequestList.size=" + linkedList2.size() + ", preGetRespItemList.size=" + linkedList.size());
        if (linkedList2.size() > 0) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u5(str, onSuccess, onError, linkedList2, i17, cgiCommRequestSource, linkedList, null), 2, null);
            return;
        }
        r45.kf kfVar = new r45.kf();
        kfVar.f460177d.addAll(linkedList);
        onSuccess.mo146xb9724478(kfVar);
    }
}
