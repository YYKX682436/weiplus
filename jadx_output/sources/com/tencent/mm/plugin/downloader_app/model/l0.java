package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes14.dex */
public class l0 extends com.tencent.mm.plugin.ball.service.d {
    public static final java.util.LinkedList D = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u1 f97300y;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f97289n = java.util.Arrays.asList("下载中", "下载暂停", "已下载", "更新中", "更新暂停", "已更新");

    /* renamed from: o, reason: collision with root package name */
    public int f97290o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f97291p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f97292q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f97293r = false;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.model.i0 f97294s = new com.tencent.mm.plugin.downloader_app.model.i0();

    /* renamed from: t, reason: collision with root package name */
    public h02.a f97295t = new h02.a();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f97296u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f97297v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f97298w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public boolean f97299x = false;

    /* renamed from: z, reason: collision with root package name */
    public final uh4.i0 f97301z = new com.tencent.mm.plugin.downloader_app.model.c0(this);
    public final com.tencent.mm.app.s2 A = new com.tencent.mm.plugin.downloader_app.model.d0(this);
    public boolean B = false;
    public final gp1.z C = new com.tencent.mm.plugin.downloader_app.model.h0(this);

    public l0(com.tencent.mm.plugin.downloader_app.model.c0 c0Var) {
        b(16, "GameDownloadFloatBall");
        Q(2);
        t().f93086f = 11;
        a0(true);
        g();
        com.tencent.mm.plugin.downloader_app.model.i0 i0Var = this.f97294s;
        i0Var.f97279a = "";
        i0Var.f97280b = 0L;
        i0Var.f97281c = 1;
        i0Var.f97282d = 0L;
        i0Var.f97283e = 0;
        dp1.q qVar = dp1.p.f242170a;
        ((java.util.HashMap) qVar.f242171a).put(16, new com.tencent.mm.plugin.downloader_app.model.f0(this));
    }

    public static void e0(com.tencent.mm.plugin.downloader_app.model.l0 l0Var, boolean z17) {
        l0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_scene", 2);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(com.tencent.mm.sdk.platformtools.x2.f193071a, intent, null);
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 34, 3403, 1, 6, 0, l0Var.f0());
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void J() {
        gp1.v vVar = this.f93136h;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onReceivedIsNoFloatBallPageChangedEvent %b", java.lang.Boolean.valueOf(vVar.z0()));
        if (this.f97299x || vVar.z0()) {
            return;
        }
        super.W(this.f97293r);
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void W(boolean z17) {
        this.f97293r = z17;
        super.W(z17 || this.f93136h.z0());
    }

    public final java.lang.String f0() {
        boolean h07 = h0();
        java.util.LinkedList linkedList = this.f97298w;
        if (!h07 && linkedList.isEmpty()) {
            return "";
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.LinkedList linkedList2 = this.f97296u;
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader_app.model.i0 i0Var = (com.tencent.mm.plugin.downloader_app.model.i0) it.next();
            if (i0Var.f97281c == 1) {
                sb6.append(i0Var.f97279a);
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
            sb6.append(((com.tencent.mm.plugin.downloader_app.model.i0) it6.next()).f97279a);
            sb6.append("_");
        }
        if (sb6.length() > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        java.lang.String sb7 = linkedList.isEmpty() ? "" : sb6.toString();
        hashMap.put("completed", sb7);
        java.lang.String str = linkedList2.isEmpty() ? "" : ((com.tencent.mm.plugin.downloader_app.model.i0) linkedList2.get(linkedList2.size() - 1)).f97279a;
        if (!this.f97291p) {
            sb7 = str;
        }
        hashMap.put("exhibit", sb7);
        return nj0.a.c(hashMap);
    }

    public final void g0() {
        java.util.Iterator it = this.f97296u.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.downloader_app.model.i0) it.next()).f97281c == 5) {
                T("hasWvaTask", true);
                return;
            }
        }
        T("hasWvaTask", false);
    }

    public final boolean h0() {
        java.util.Iterator it = this.f97296u.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.downloader_app.model.i0) it.next()).f97281c == 1) {
                return true;
            }
        }
        return false;
    }

    public final void i0(com.tencent.mm.plugin.downloader_app.model.i0 i0Var, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onTaskFinished, appId:%s, isInDownloadMainUI:%s downloadFailed:%b isCanceled:%b", i0Var.f97279a, java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        java.util.LinkedList linkedList = this.f97298w;
        java.util.LinkedList linkedList2 = this.f97296u;
        if (z18 || z17) {
            linkedList2.remove(i0Var);
            java.util.LinkedList linkedList3 = this.f97297v;
            linkedList3.remove(i0Var);
            linkedList.remove(i0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "mTaskList.size:%d mBookDownloadTaskList.size:%d mReadyToInstallTaskList.size:%d", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(linkedList3.size()), java.lang.Integer.valueOf(linkedList.size()));
            if (linkedList2.isEmpty() && linkedList.isEmpty()) {
                this.f97299x = true;
                d();
                if (z17) {
                    m0(true);
                    return;
                }
                return;
            }
        } else {
            linkedList2.remove(i0Var);
            if (i0Var.f97281c == 1) {
                linkedList.add(i0Var);
            } else {
                linkedList2.add(i0Var);
                if (i0Var.f97281c == 5) {
                    j0(i0Var, 0L, 1);
                    ((ft.e) i95.n0.c(ft.e.class)).g5(i0Var.f97279a);
                }
            }
        }
        g0();
        if (i0Var.f97281c == 1) {
            k0();
        }
        boolean n07 = n0();
        W(!n07);
        if (n07) {
            p0();
            o0();
        }
    }

    public final void j0(com.tencent.mm.plugin.downloader_app.model.i0 i0Var, long j17, int i17) {
        if (qp1.q.b()) {
            try {
                java.lang.String jSONObject = new org.json.JSONObject().put("appId", i0Var.f97279a).toString();
                int i18 = i0Var.f97283e;
                int i19 = 2;
                if (i18 != 2) {
                    i19 = 3;
                    if (i18 != 3) {
                        i19 = 1;
                    }
                }
                ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(jSONObject, 11311001L, j17, i17, "{\"status\":" + i19 + "}");
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameDownloadFloatBallHelper", e17, "build appIdJson failed", new java.lang.Object[0]);
            }
        }
    }

    public final void k0() {
        if (this.f97292q) {
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 34, 3403, 1, 1, 0, f0());
        } else {
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 34, 3402, 1, 1, 0, f0());
        }
    }

    public void l0(boolean z17) {
        this.B = z17;
        if (this.f97296u.isEmpty()) {
            return;
        }
        boolean n07 = n0();
        W(!n07);
        if (!n07) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "setInDownloadMainUI updateCurrentTask fail, isInDownloadMainUI: %s", java.lang.Boolean.valueOf(this.B));
            return;
        }
        p0();
        o0();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "setInDownloadMainUI updateCurrentTask success, isInDownloadMainUI: %s", java.lang.Boolean.valueOf(this.B));
    }

    public void m0(boolean z17) {
        if (h0()) {
            com.tencent.mm.sdk.platformtools.o4.M("download_app").putBoolean("show_red_dot", z17);
            com.tencent.mm.sdk.platformtools.o4.M("download_app").putLong("red_dot_create_time", java.lang.System.currentTimeMillis());
            java.util.Iterator it = D.iterator();
            while (it.hasNext()) {
                ((m02.u) it.next()).a(z17);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("show", z17);
            com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle, com.tencent.mm.plugin.downloader_app.model.k0.class, null);
        }
    }

    public final boolean n0() {
        com.tencent.mm.plugin.downloader_app.model.i0 i0Var;
        boolean z17 = this.B;
        java.util.LinkedList linkedList = this.f97296u;
        if (z17) {
            for (int size = linkedList.size() - 1; size >= 0; size--) {
                com.tencent.mm.plugin.downloader_app.model.i0 i0Var2 = (com.tencent.mm.plugin.downloader_app.model.i0) linkedList.get(size);
                if (i0Var2.f97281c == 5) {
                    h02.a e17 = com.tencent.mm.plugin.downloader.model.m0.e(i0Var2.f97280b);
                    this.f97295t = e17;
                    if (e17 != null) {
                        this.f97294s = i0Var2;
                        this.f97290o = i0Var2.f97283e;
                        return true;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameDownloadFloatBallHelper", "updateCurrentTask: mCurrentChangedDownloadInfo is null, downloadId = %d, mTaskList.size = %d", java.lang.Long.valueOf(i0Var2.f97280b), java.lang.Integer.valueOf(linkedList.size()));
                    linkedList.remove(i0Var2);
                    g0();
                }
            }
            return false;
        }
        while (true) {
            boolean isEmpty = linkedList.isEmpty();
            java.util.LinkedList linkedList2 = this.f97298w;
            if (isEmpty && linkedList2.isEmpty()) {
                return false;
            }
            if (linkedList.isEmpty()) {
                i0Var = (com.tencent.mm.plugin.downloader_app.model.i0) linkedList2.getLast();
            } else if (linkedList2.isEmpty()) {
                i0Var = (com.tencent.mm.plugin.downloader_app.model.i0) linkedList.getLast();
            } else {
                i0Var = (com.tencent.mm.plugin.downloader_app.model.i0) (((com.tencent.mm.plugin.downloader_app.model.i0) linkedList.getLast()).f97282d >= ((com.tencent.mm.plugin.downloader_app.model.i0) linkedList2.getLast()).f97282d ? linkedList.getLast() : linkedList2.getLast());
            }
            h02.a e18 = com.tencent.mm.plugin.downloader.model.m0.e(i0Var.f97280b);
            this.f97295t = e18;
            if (e18 != null) {
                this.f97294s = i0Var;
                this.f97290o = i0Var.f97283e;
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDownloadFloatBallHelper", "updateCurrentTask: mCurrentChangedDownloadInfo is null, downloadId = %d, mTaskList.size = %d, mReadyToInstallTaskList.size = %d", java.lang.Long.valueOf(i0Var.f97280b), java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(linkedList2.size()));
            linkedList.remove(i0Var);
            linkedList2.remove(i0Var);
            g0();
        }
    }

    public final void o0() {
        if (java.util.Objects.equals(java.lang.Long.valueOf(this.f97295t.field_downloadId), java.lang.Long.valueOf(this.f97294s.f97280b))) {
            h02.a aVar = this.f97295t;
            long j17 = aVar.field_totalSize;
            if (j17 <= 0) {
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
                if (ballInfo == null || ballInfo.A == 0) {
                    return;
                }
                ballInfo.A = 0L;
                g();
                return;
            }
            long j18 = (aVar.field_downloadedSize * 100) / j17;
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.f93132d;
            if (ballInfo2 == null || ballInfo2.A == j18) {
                return;
            }
            ballInfo2.A = j18;
            g();
        }
    }

    public final void p0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "updateTitle mLastEvent:%d", java.lang.Integer.valueOf(this.f97290o));
        if (this.B && this.f97295t.field_fromDownloadApp) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "updateTitle, isInDownloadMainUI && field_fromDownloadApp, skip");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f97290o;
        if (i17 == 1 || i17 == 7 || i17 == 6) {
            r0(sb6);
        } else if (i17 == 2) {
            if (this.f97297v.contains(this.f97294s)) {
                sb6.append(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.aoh));
            }
            sb6.append(this.f97295t.field_fileName);
            if (this.f97294s.f97281c == 5) {
                sb6.append(" 更新暂停");
            } else {
                sb6.append(" 下载暂停");
            }
            this.f97291p = false;
        } else if (i17 == 3) {
            q0(sb6);
        } else if (i17 == 9 || i17 == 4 || i17 == 5) {
            if (this.f97298w.isEmpty()) {
                r0(sb6);
            } else {
                q0(sb6);
            }
        }
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "updateTitle, name = %s, length : %d", sb7, java.lang.Integer.valueOf(sb7.length()));
        Z(sb7);
    }

    public final void q0(java.lang.StringBuilder sb6) {
        if (this.f97294s.f97281c == 5) {
            sb6.append(this.f97295t.field_fileName);
            sb6.append(" ");
            sb6.append("已更新");
            this.f97291p = false;
            return;
        }
        int size = this.f97298w.size();
        if (size > 0) {
            for (int i17 = size - 1; i17 > 0; i17--) {
                h02.a e17 = com.tencent.mm.plugin.downloader.model.m0.e(((com.tencent.mm.plugin.downloader_app.model.i0) this.f97298w.get(i17)).f97280b);
                if (e17 != null) {
                    if (this.f97297v.contains(this.f97298w.get(i17))) {
                        sb6.append(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.aoh));
                    }
                    sb6.append(e17.field_fileName);
                    sb6.append("、");
                }
            }
            h02.a e18 = com.tencent.mm.plugin.downloader.model.m0.e(((com.tencent.mm.plugin.downloader_app.model.i0) this.f97298w.get(0)).f97280b);
            if (e18 != null) {
                if (this.f97297v.contains(this.f97298w.get(0))) {
                    sb6.append(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.aoh));
                }
                sb6.append(e18.field_fileName);
            }
            sb6.append(" ");
            sb6.append("已下载");
            this.f97291p = true;
        }
    }

    public final void r0(java.lang.StringBuilder sb6) {
        if (this.f97297v.contains(this.f97294s)) {
            sb6.append(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.aoh));
        }
        sb6.append(this.f97295t.field_fileName);
        if (this.f97294s.f97281c == 5) {
            sb6.append(" ");
            sb6.append("更新中");
        } else {
            sb6.append(" ");
            sb6.append("下载中");
        }
        this.f97291p = false;
    }
}
