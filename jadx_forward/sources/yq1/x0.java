package yq1;

/* loaded from: classes7.dex */
public final class x0 implements zq1.m0 {
    public void a(java.lang.String str, java.lang.String str2, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (str2 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherCacheManager", "clearPrefetchContent webId: " + str + ", bizId: " + str2);
        com.p314xaae8f345.mm.vfs.r6 Q = nu4.b0.P.Q(str2);
        if (Q.m()) {
            Q.l();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175980c.d(str2);
        if (o4Var != null) {
            o4Var.remove(str2);
        }
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ts1.p.f503146b.d(str);
        if (o4Var2 != null) {
            o4Var2.W(str);
        }
    }

    public zq1.j0 b(java.lang.String url, java.lang.String str) {
        zq1.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        ts1.q qVar = ts1.q.f503147a;
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(url, false);
        nu4.b bVar = nu4.b0.P;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175980c;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean z17 = false;
        zq1.j0 r17 = new ts1.o(url, i17, bVar, v3Var, null, null, bool, null, false, null, null, 1968, null).r();
        if (r17 != null) {
            return r17;
        }
        java.lang.String b17 = str == null || str.length() == 0 ? qVar.b(url, null, true) : str;
        if (b17.length() == 0) {
            j0Var = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherCacheManager", "getPrefetchContentResp id: %s, prefetchInfoId: %s", i17, b17);
            ts1.p pVar = ts1.p.f503145a;
            java.lang.String s17 = ts1.p.f503146b.s(b17, "");
            java.lang.String str2 = s17 == null ? "" : s17;
            if (str2.length() > 0) {
                z17 = true;
            }
            if (!z17) {
                return r17;
            }
            j0Var = null;
            zq1.j0 r18 = new ts1.o(url, str2, bVar, v3Var, null, null, bool, null, false, null, null, 1968, null).r();
            if (r18 != null) {
                r18.f556540m = true;
                r18.f556528a = url;
                return r18;
            }
        }
        return j0Var;
    }

    public int c(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = at1.a.f95164a;
        if (str == null) {
            return 0;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(str, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) at1.a.f95164a.d(i17);
        if (o4Var != null) {
            return o4Var.getInt(i17, 0);
        }
        return 0;
    }

    public boolean d(int i17, java.lang.String str) {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
        boolean z17 = true;
        boolean z18 = (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_webview_async_entrance2, 58) & i17) > 0;
        if (!z18 && i17 == 4) {
            if (!(str == null || r26.n0.N(str))) {
                try {
                    z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.net.Uri.parse(str).getHost(), "wzq.tenpay.com");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPrefetchServiceImpl", "isEntranceOpen ex=" + e17.getMessage());
                }
            }
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17 || !hy4.i.i(str) || i17 == 2) {
            return z18;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.String r15, int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yq1.x0.e(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (r26.i0.y(r1, "http", false) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.util.List r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "auths"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.lang.Class<l30.h> r0 = l30.h.class
            i95.m r0 = i95.n0.c(r0)
            l30.h r0 = (l30.h) r0
            java.lang.String r1 = "appbrand"
            k30.a r0 = (k30.a) r0
            r0.Ai(r1)
            r0 = 0
            boolean r8 = r6.d(r8, r0)
            if (r8 != 0) goto L1c
            return
        L1c:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L25:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r7.next()
            r1 = r0
            zq1.i0 r1 = (zq1.i0) r1
            java.lang.String r2 = r1.f556516a
            java.lang.String r3 = "url"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            boolean r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.h(r2)
            if (r2 == 0) goto L5b
            java.lang.String r2 = r1.f556516a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            java.lang.String r4 = ":"
            r5 = 0
            boolean r2 = r26.n0.B(r2, r4, r5)
            if (r2 == 0) goto L5c
            java.lang.String r1 = r1.f556516a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            java.lang.String r2 = "http"
            boolean r1 = r26.i0.y(r1, r2, r5)
            if (r1 != 0) goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 != 0) goto L25
            r8.add(r0)
            goto L25
        L62:
            r0 = -1
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.k(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yq1.x0.f(java.util.List, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0052. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0013 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(long r17, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yq1.x0.g(long, java.util.List):void");
    }

    public void h(java.util.List preAuthInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preAuthInfoList, "preAuthInfoList");
        g(-1L, preAuthInfoList);
    }

    public void i(java.util.List preAuthInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preAuthInfoList, "preAuthInfoList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetchServiceImpl", "preloadVideo:" + java.lang.Integer.valueOf(preAuthInfoList.size()));
        if (preAuthInfoList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPrefetchServiceImpl", "preloadVideo preAuthInfoList is null or empty");
            return;
        }
        java.util.Iterator it = preAuthInfoList.iterator();
        while (it.hasNext()) {
            zq1.i0 i0Var = (zq1.i0) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175984a.f(i0Var.f556516a, -1, i0Var.f556524i);
        }
    }
}
