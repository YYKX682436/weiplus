package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes14.dex */
public class l0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d {
    public static final java.util.LinkedList D = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f178833y;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f178822n = java.util.Arrays.asList("下载中", "下载暂停", "已下载", "更新中", "更新暂停", "已更新");

    /* renamed from: o, reason: collision with root package name */
    public int f178823o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f178824p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f178825q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f178826r = false;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0 f178827s = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0();

    /* renamed from: t, reason: collision with root package name */
    public h02.a f178828t = new h02.a();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f178829u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f178830v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f178831w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public boolean f178832x = false;

    /* renamed from: z, reason: collision with root package name */
    public final uh4.i0 f178834z = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.c0(this);
    public final com.p314xaae8f345.mm.app.s2 A = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.d0(this);
    public boolean B = false;
    public final gp1.z C = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.h0(this);

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.c0 c0Var) {
        b(16, "GameDownloadFloatBall");
        Q(2);
        t().f174619f = 11;
        a0(true);
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0 i0Var = this.f178827s;
        i0Var.f178812a = "";
        i0Var.f178813b = 0L;
        i0Var.f178814c = 1;
        i0Var.f178815d = 0L;
        i0Var.f178816e = 0;
        dp1.q qVar = dp1.p.f323703a;
        ((java.util.HashMap) qVar.f323704a).put(16, new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.f0(this));
    }

    public static void e0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 l0Var, boolean z17) {
        l0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_scene", 2);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent, null);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 34, 3403, 1, 6, 0, l0Var.f0());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void J() {
        gp1.v vVar = this.f174669h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onReceivedIsNoFloatBallPageChangedEvent %b", java.lang.Boolean.valueOf(vVar.z0()));
        if (this.f178832x || vVar.z0()) {
            return;
        }
        super.W(this.f178826r);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void W(boolean z17) {
        this.f178826r = z17;
        super.W(z17 || this.f174669h.z0());
    }

    public final java.lang.String f0() {
        boolean h07 = h0();
        java.util.LinkedList linkedList = this.f178831w;
        if (!h07 && linkedList.isEmpty()) {
            return "";
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.LinkedList linkedList2 = this.f178829u;
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) it.next();
            if (i0Var.f178814c == 1) {
                sb6.append(i0Var.f178812a);
                sb6.append("_");
            }
        }
        if (sb6.length() > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        hashMap.put("downloading", linkedList2.isEmpty() ? "" : sb6.toString());
        sb6.setLength(0);
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) it6.next()).f178812a);
            sb6.append("_");
        }
        if (sb6.length() > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        java.lang.String sb7 = linkedList.isEmpty() ? "" : sb6.toString();
        hashMap.put("completed", sb7);
        java.lang.String str = linkedList2.isEmpty() ? "" : ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) linkedList2.get(linkedList2.size() - 1)).f178812a;
        if (!this.f178824p) {
            sb7 = str;
        }
        hashMap.put("exhibit", sb7);
        return nj0.a.c(hashMap);
    }

    public final void g0() {
        java.util.Iterator it = this.f178829u.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) it.next()).f178814c == 5) {
                T("hasWvaTask", true);
                return;
            }
        }
        T("hasWvaTask", false);
    }

    public final boolean h0() {
        java.util.Iterator it = this.f178829u.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) it.next()).f178814c == 1) {
                return true;
            }
        }
        return false;
    }

    public final void i0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0 i0Var, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onTaskFinished, appId:%s, isInDownloadMainUI:%s downloadFailed:%b isCanceled:%b", i0Var.f178812a, java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        java.util.LinkedList linkedList = this.f178831w;
        java.util.LinkedList linkedList2 = this.f178829u;
        if (z18 || z17) {
            linkedList2.remove(i0Var);
            java.util.LinkedList linkedList3 = this.f178830v;
            linkedList3.remove(i0Var);
            linkedList.remove(i0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "mTaskList.size:%d mBookDownloadTaskList.size:%d mReadyToInstallTaskList.size:%d", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(linkedList3.size()), java.lang.Integer.valueOf(linkedList.size()));
            if (linkedList2.isEmpty() && linkedList.isEmpty()) {
                this.f178832x = true;
                d();
                if (z17) {
                    m0(true);
                    return;
                }
                return;
            }
        } else {
            linkedList2.remove(i0Var);
            if (i0Var.f178814c == 1) {
                linkedList.add(i0Var);
            } else {
                linkedList2.add(i0Var);
                if (i0Var.f178814c == 5) {
                    j0(i0Var, 0L, 1);
                    ((ft.e) i95.n0.c(ft.e.class)).g5(i0Var.f178812a);
                }
            }
        }
        g0();
        if (i0Var.f178814c == 1) {
            k0();
        }
        boolean n07 = n0();
        W(!n07);
        if (n07) {
            p0();
            o0();
        }
    }

    public final void j0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0 i0Var, long j17, int i17) {
        if (qp1.q.b()) {
            try {
                java.lang.String jSONObject = new org.json.JSONObject().put("appId", i0Var.f178812a).toString();
                int i18 = i0Var.f178816e;
                int i19 = 2;
                if (i18 != 2) {
                    i19 = 3;
                    if (i18 != 3) {
                        i19 = 1;
                    }
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(jSONObject, 11311001L, j17, i17, "{\"status\":" + i19 + "}");
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameDownloadFloatBallHelper", e17, "build appIdJson failed", new java.lang.Object[0]);
            }
        }
    }

    public final void k0() {
        if (this.f178825q) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 34, 3403, 1, 1, 0, f0());
        } else {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 34, 3402, 1, 1, 0, f0());
        }
    }

    public void l0(boolean z17) {
        this.B = z17;
        if (this.f178829u.isEmpty()) {
            return;
        }
        boolean n07 = n0();
        W(!n07);
        if (!n07) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "setInDownloadMainUI updateCurrentTask fail, isInDownloadMainUI: %s", java.lang.Boolean.valueOf(this.B));
            return;
        }
        p0();
        o0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "setInDownloadMainUI updateCurrentTask success, isInDownloadMainUI: %s", java.lang.Boolean.valueOf(this.B));
    }

    public void m0(boolean z17) {
        if (h0()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("download_app").putBoolean("show_red_dot", z17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("download_app").putLong("red_dot_create_time", java.lang.System.currentTimeMillis());
            java.util.Iterator it = D.iterator();
            while (it.hasNext()) {
                ((m02.u) it.next()).a(z17);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("show", z17);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.k0.class, null);
        }
    }

    public final boolean n0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0 i0Var;
        boolean z17 = this.B;
        java.util.LinkedList linkedList = this.f178829u;
        if (z17) {
            for (int size = linkedList.size() - 1; size >= 0; size--) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0 i0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) linkedList.get(size);
                if (i0Var2.f178814c == 5) {
                    h02.a e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.e(i0Var2.f178813b);
                    this.f178828t = e17;
                    if (e17 != null) {
                        this.f178827s = i0Var2;
                        this.f178823o = i0Var2.f178816e;
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameDownloadFloatBallHelper", "updateCurrentTask: mCurrentChangedDownloadInfo is null, downloadId = %d, mTaskList.size = %d", java.lang.Long.valueOf(i0Var2.f178813b), java.lang.Integer.valueOf(linkedList.size()));
                    linkedList.remove(i0Var2);
                    g0();
                }
            }
            return false;
        }
        while (true) {
            boolean isEmpty = linkedList.isEmpty();
            java.util.LinkedList linkedList2 = this.f178831w;
            if (isEmpty && linkedList2.isEmpty()) {
                return false;
            }
            if (linkedList.isEmpty()) {
                i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) linkedList2.getLast();
            } else if (linkedList2.isEmpty()) {
                i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) linkedList.getLast();
            } else {
                i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) (((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) linkedList.getLast()).f178815d >= ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) linkedList2.getLast()).f178815d ? linkedList.getLast() : linkedList2.getLast());
            }
            h02.a e18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.e(i0Var.f178813b);
            this.f178828t = e18;
            if (e18 != null) {
                this.f178827s = i0Var;
                this.f178823o = i0Var.f178816e;
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameDownloadFloatBallHelper", "updateCurrentTask: mCurrentChangedDownloadInfo is null, downloadId = %d, mTaskList.size = %d, mReadyToInstallTaskList.size = %d", java.lang.Long.valueOf(i0Var.f178813b), java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(linkedList2.size()));
            linkedList.remove(i0Var);
            linkedList2.remove(i0Var);
            g0();
        }
    }

    public final void o0() {
        if (java.util.Objects.equals(java.lang.Long.valueOf(this.f178828t.f68408x32b20428), java.lang.Long.valueOf(this.f178827s.f178813b))) {
            h02.a aVar = this.f178828t;
            long j17 = aVar.f68443x78351860;
            if (j17 <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
                if (c12886x91aa2b6d == null || c12886x91aa2b6d.A == 0) {
                    return;
                }
                c12886x91aa2b6d.A = 0L;
                g();
                return;
            }
            long j18 = (aVar.f68413xf432b5ad * 100) / j17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.f174665d;
            if (c12886x91aa2b6d2 == null || c12886x91aa2b6d2.A == j18) {
                return;
            }
            c12886x91aa2b6d2.A = j18;
            g();
        }
    }

    public final void p0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "updateTitle mLastEvent:%d", java.lang.Integer.valueOf(this.f178823o));
        if (this.B && this.f178828t.f68423x7e6ed12a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "updateTitle, isInDownloadMainUI && field_fromDownloadApp, skip");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f178823o;
        if (i17 == 1 || i17 == 7 || i17 == 6) {
            r0(sb6);
        } else if (i17 == 2) {
            if (this.f178830v.contains(this.f178827s)) {
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aoh));
            }
            sb6.append(this.f178828t.f68418xf1e8cfcc);
            if (this.f178827s.f178814c == 5) {
                sb6.append(" 更新暂停");
            } else {
                sb6.append(" 下载暂停");
            }
            this.f178824p = false;
        } else if (i17 == 3) {
            q0(sb6);
        } else if (i17 == 9 || i17 == 4 || i17 == 5) {
            if (this.f178831w.isEmpty()) {
                r0(sb6);
            } else {
                q0(sb6);
            }
        }
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "updateTitle, name = %s, length : %d", sb7, java.lang.Integer.valueOf(sb7.length()));
        Z(sb7);
    }

    public final void q0(java.lang.StringBuilder sb6) {
        if (this.f178827s.f178814c == 5) {
            sb6.append(this.f178828t.f68418xf1e8cfcc);
            sb6.append(" ");
            sb6.append("已更新");
            this.f178824p = false;
            return;
        }
        int size = this.f178831w.size();
        if (size > 0) {
            for (int i17 = size - 1; i17 > 0; i17--) {
                h02.a e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) this.f178831w.get(i17)).f178813b);
                if (e17 != null) {
                    if (this.f178830v.contains(this.f178831w.get(i17))) {
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aoh));
                    }
                    sb6.append(e17.f68418xf1e8cfcc);
                    sb6.append("、");
                }
            }
            h02.a e18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) this.f178831w.get(0)).f178813b);
            if (e18 != null) {
                if (this.f178830v.contains(this.f178831w.get(0))) {
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aoh));
                }
                sb6.append(e18.f68418xf1e8cfcc);
            }
            sb6.append(" ");
            sb6.append("已下载");
            this.f178824p = true;
        }
    }

    public final void r0(java.lang.StringBuilder sb6) {
        if (this.f178830v.contains(this.f178827s)) {
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aoh));
        }
        sb6.append(this.f178828t.f68418xf1e8cfcc);
        if (this.f178827s.f178814c == 5) {
            sb6.append(" ");
            sb6.append("更新中");
        } else {
            sb6.append(" ");
            sb6.append("下载中");
        }
        this.f178824p = false;
    }
}
