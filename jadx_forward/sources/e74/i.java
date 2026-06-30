package e74;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static volatile e74.i f331498b;

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseLongArray f331499c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f331500a = new android.util.ArrayMap();

    static {
        android.util.SparseLongArray sparseLongArray = new android.util.SparseLongArray();
        f331499c = sparseLongArray;
        sparseLongArray.append(1, 1800000L);
        sparseLongArray.append(2, 300000L);
        sparseLongArray.append(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d, 5000L);
        sparseLongArray.append(1000003, 60000L);
        sparseLongArray.append(3, 3600000L);
        sparseLongArray.append(10, 60000L);
        sparseLongArray.append(13, 60000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(e74.i r12, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e74.i.a(e74.i, com.tencent.mm.plugin.sns.storage.SnsInfo, int, boolean):void");
    }

    public static void b(e74.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, boolean z17) {
        r45.a3[] a3VarArr;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        iVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doUpdateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
        if (i17 == 2) {
            m70346x10413e67 = c17933xe8d1b226.m70356x450e1efa();
        }
        java.lang.String str = m70346x10413e67 != null ? m70346x10413e67.f38104xce64ddf1 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeAdDynamicFeedUpdateInfoRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
        if (c17933xe8d1b226.m70435x4b407f77()) {
            s34.l lVar = c17933xe8d1b226.m70354x74235b3e().f38168x6891f311;
            lVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
            java.lang.String str2 = lVar.f484231a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
            r45.a3[] a3VarArr2 = new r45.a3[1];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDynamicUpdateItemHelper", "makeAdDynamicFeedUpdateInfoRequestParams, snsId=" + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e) + ", numberRequestParams=" + str2);
            try {
                r45.a3 a3Var = new r45.a3();
                a3Var.f451223d = 13;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.putOpt("numberRequestParams", str2);
                a3Var.f451224e = jSONObject.toString();
                a3VarArr2[0] = a3Var;
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeAdDynamicFeedUpdateInfoRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
            a3VarArr = a3VarArr2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeAdDynamicFeedUpdateInfoRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
            a3VarArr = null;
        }
        r45.a3[] e17 = iVar.e(T, a3VarArr, z17);
        if (a84.b0.d(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "doUpdateDynamicFeedInfo, skip");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUpdateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "doUpdateDynamicFeedInfo, snsId=" + T);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1837, 10);
            new k64.r(T, str, e17).K(new e74.e(iVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUpdateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    public static e74.i f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (f331498b == null) {
            synchronized (e74.i.class) {
                try {
                    if (f331498b == null) {
                        f331498b = new e74.i();
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    throw th6;
                }
            }
        }
        e74.i iVar = f331498b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        return iVar;
    }

    public void c(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doForceLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        try {
            h(i17, c17933xe8d1b226, false);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doForceLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    public void d(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        try {
            h(i17, c17933xe8d1b226, true);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    public final r45.a3[] e(java.lang.String str, r45.a3[] a3VarArr, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("filterRequestParams", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (a3VarArr == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterRequestParams", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (r45.a3 a3Var : a3VarArr) {
            if (a3Var != null) {
                int i17 = a3Var.f451223d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                boolean g17 = g(str, i17, null, z17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                if (g17) {
                    linkedList.add(a3Var);
                }
            }
        }
        r45.a3[] a3VarArr2 = (r45.a3[]) linkedList.toArray(new r45.a3[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterRequestParams", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        return a3VarArr2;
    }

    public final boolean g(java.lang.String str, int i17, s34.n nVar, boolean z17) {
        e74.k kVar;
        long j17;
        long j18;
        android.util.SparseArray sparseArray;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        java.util.Map map = this.f331500a;
        android.util.SparseArray sparseArray2 = (android.util.SparseArray) ((android.util.ArrayMap) map).get(str);
        if (sparseArray2 == null) {
            sparseArray2 = new android.util.SparseArray();
            ((android.util.ArrayMap) map).put(str, sparseArray2);
        }
        android.util.SparseArray sparseArray3 = sparseArray2;
        s34.m mVar = null;
        boolean z18 = true;
        if (z17) {
            kVar = (e74.k) sparseArray3.get(i17);
            if (kVar != null) {
                if (a84.f0.b() - kVar.f331501a < kVar.f331502b) {
                    z18 = false;
                }
            }
        } else {
            kVar = null;
        }
        boolean z19 = z18;
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("keepRequestTime", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            if (nVar != null && (sparseArray = nVar.f484250a) != null) {
                mVar = (s34.m) sparseArray.get(i17);
            }
            long b17 = a84.f0.b();
            if (kVar == null) {
                long j19 = f331499c.get(i17, 5000L);
                if (mVar != null) {
                    j17 = j19;
                    long j27 = mVar.f484240b;
                    if (j27 > 5000) {
                        j18 = j27;
                        kVar = new e74.k(b17, j18, i17);
                    }
                } else {
                    j17 = j19;
                }
                j18 = j17;
                kVar = new e74.k(b17, j18, i17);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLastRequestTime", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.RequestTime");
                kVar.f331501a = b17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLastRequestTime", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.RequestTime");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("keepRequestTime", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            sparseArray3.put(i17, kVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        return z19;
    }

    public final void h(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("livingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("livingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            return;
        }
        if (c17933xe8d1b226.m70354x74235b3e().f38190xd2e4d0fd != null) {
            int i18 = c17933xe8d1b226.m70354x74235b3e().f38190xd2e4d0fd.f484278a;
            r45.a3[] a3VarArr = null;
            if (i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWeAppLivingRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                java.lang.String T = ca4.z0.T(c17933xe8d1b226);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
                if (i17 == 2) {
                    m70346x10413e67 = c17933xe8d1b226.m70356x450e1efa();
                }
                java.lang.String str = m70346x10413e67 != null ? m70346x10413e67.f38104xce64ddf1 : "";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeWeAppLivingRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
                if (c17933xe8d1b226.m70354x74235b3e() == null || c17933xe8d1b226.m70354x74235b3e().f38190xd2e4d0fd == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeWeAppLivingRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
                } else {
                    s34.r0 r0Var = c17933xe8d1b226.m70354x74235b3e().f38190xd2e4d0fd;
                    if (r0Var.f484278a == 0) {
                        a3VarArr = new r45.a3[1];
                        try {
                            r45.a3 a3Var = new r45.a3();
                            a3Var.f451223d = 2;
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.putOpt("liveParams", r0Var.f484279b);
                            a3Var.f451224e = jSONObject.toString();
                            a3VarArr[0] = a3Var;
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeWeAppLivingRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
                }
                r45.a3[] e17 = e(T, a3VarArr, z17);
                if (a84.b0.g(e17)) {
                    new k64.r(T, str, e17).K(new e74.a(this));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWeAppLivingRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            } else if (i18 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestFinderLivingNoticeState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = c17933xe8d1b226.m70354x74235b3e().f38157x18416701 != null ? c17933xe8d1b226.m70354x74235b3e().f38157x18416701.f38287xf7a0a3ac : null;
                if (c17702x544f64e9 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestFinderLivingNoticeState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                } else {
                    java.lang.String T2 = ca4.z0.T(c17933xe8d1b226);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    boolean g17 = g(T2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d, null, z17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    if (g17) {
                        d44.h.c(T2, c17702x544f64e9.f38004xa53ddf1c, c17702x544f64e9.X, new e74.f(this));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestFinderLivingNoticeState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "requestFinderLivingNoticeState: is the time not expired??");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestFinderLivingNoticeState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    }
                }
            } else if (i18 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestFinderLivingState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                s34.r0 r0Var2 = c17933xe8d1b226.m70354x74235b3e().f38190xd2e4d0fd;
                i(ca4.z0.T(c17933xe8d1b226), r0Var2.f484280c, r0Var2.f484281d, z17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestFinderLivingState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            }
        } else if (c17933xe8d1b226.m70354x74235b3e().f38184xf14dcffa != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestFinderLivingStateByAdHeadLivingInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            s34.n0 n0Var = c17933xe8d1b226.m70354x74235b3e().f38184xf14dcffa;
            java.lang.String T3 = ca4.z0.T(c17933xe8d1b226);
            n0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
            i(T3, n0Var.f484251a, n0Var.f484252b, z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestFinderLivingStateByAdHeadLivingInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("livingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    public final void i(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestFinderLivingState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        boolean g17 = g(str, 1000003, null, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (g17) {
            d44.h.d(str, str2, str3, new e74.g(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestFinderLivingState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "requestFinderLivingState: is the time not expired??");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestFinderLivingState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        }
    }

    public void j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (c17933xe8d1b226 == null || !c17933xe8d1b226.m70435x4b407f77()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            return;
        }
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "--updateDynamicFeedInfo, snsId=" + T + ", src=" + i17);
        ((ku5.t0) ku5.t0.f394148d).g(new e74.d(this, c17933xe8d1b226, i17, z17, T));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    public void k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFinderLivingProduct", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (!i64.y.i(c17933xe8d1b226)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderLivingProduct", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            return;
        }
        boolean z18 = ca4.m0.u0(e42.c0.clicfg_ad_enable_update_living_product, 1) > 0;
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "--updateAdFinderLivingProduct, snsId=" + T + ", src=" + i17 + ", careTime=" + z17 + ", isEnableUpdate=" + z18);
        if (!z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderLivingProduct", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new e74.b(this, c17933xe8d1b226, i17, z17, T));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderLivingProduct", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        }
    }
}
