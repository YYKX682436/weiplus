package wn4;

/* loaded from: classes11.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb f529071d;

    /* renamed from: e, reason: collision with root package name */
    public final long f529072e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f529073f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f529074g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f529075h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f529076i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f529077m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f529078n;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb response, long j17, java.util.HashMap patchDownLoadProgress, java.util.HashMap isDelatMakeFinish, java.util.HashMap patchId2FileNameProgress) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(patchDownLoadProgress, "patchDownLoadProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isDelatMakeFinish, "isDelatMakeFinish");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(patchId2FileNameProgress, "patchId2FileNameProgress");
        this.f529071d = response;
        this.f529072e = j17;
        this.f529073f = patchDownLoadProgress;
        this.f529074g = isDelatMakeFinish;
        this.f529075h = patchId2FileNameProgress;
        this.f529076i = "MicroMsg.Updater.DownloadCallbackListener";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529076i, "onTaskFailed cdnUrl:" + this.f529071d.f223945h + " downloadId:" + this.f529072e + " id:" + j17 + " errCode:" + i17 + " hasChangeUrl:" + z17);
        if (this.f529072e == j17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 13L, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().s(this);
            ((ku5.t0) ku5.t0.f394148d).B(new wn4.a(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        java.lang.Integer num;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529076i, "onTaskFinished cdnUrl:" + this.f529071d.f223945h + " downloadId:" + this.f529072e + " id:" + j17 + " hasChangeUrl:" + z17 + " savedFilePath:" + str);
        if (this.f529072e == j17) {
            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = this.f529071d;
            if (c16114x800e8cdb != null && (num = c16114x800e8cdb.f223943f) != null && num.intValue() == 4 && str != null) {
                r45.bw3 k17 = c83.e.k();
                if (k17 == null) {
                    k17 = new r45.bw3();
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f529071d.f223945h) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17.f452627e) && this.f529071d.f223945h.equals(k17.f452627e)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529076i, "HdiffApk onDownloadFinish, funck is equals, response.cdnUrl: " + this.f529071d.f223945h + ", status.cdnUrl = " + k17.f452627e);
                }
                k17.f452629g = "3";
                k17.f452631i = java.lang.System.currentTimeMillis();
                c83.e.s(k17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().s(this);
            ((ku5.t0) ku5.t0.f394148d).B(wn4.b.f529063d);
            if (str != null) {
                wn4.x xVar = wn4.x.f529104a;
                com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb response = this.f529071d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "onDownloadFinish savePath:".concat(str));
                java.lang.Integer num2 = response.f223943f;
                if (num2 != null && num2.intValue() == 3) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 8L, 1L, false);
                    ((ku5.t0) ku5.t0.f394148d).h(new wn4.m(response, str), "Updater");
                    return;
                }
                java.lang.Integer num3 = response.f223943f;
                if (num3 != null && num3.intValue() == 4) {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
                    wn4.f fVar = wn4.x.f529108e;
                    if (fVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("downloadCallbackListener");
                        throw null;
                    }
                    if (fVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("downloadCallbackListener");
                        throw null;
                    }
                    fVar.f529078n = true;
                    xVar.d(r6Var, j17, response);
                    return;
                }
                java.lang.Integer num4 = response.f223943f;
                if (num4 != null && num4.intValue() == 2) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 9L, 1L, false);
                    b83.e eVar = new b83.e(lp0.a.f401782c, response.f223952r);
                    android.content.SharedPreferences b17 = eVar.b();
                    java.lang.String a17 = eVar.a(5);
                    if (b17.contains(a17)) {
                        eVar.c(5, java.lang.System.currentTimeMillis() - b17.getLong(a17, 0L));
                        b17.edit().remove(a17).commit();
                    }
                    if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater.ManualUpdaterProcessor", "HOT PATCH !fileExists ");
                        return;
                    }
                    java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(new java.io.File(str)));
                    try {
                        long readLong = dataInputStream.readLong();
                        vz5.b.a(dataInputStream, null);
                        if (!(readLong == 96093072812398L)) {
                            xVar.a(str, response);
                            return;
                        }
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Bi();
                        java.lang.String i17 = c83.e.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
                        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("TPCFile");
                        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
                        java.lang.String str2 = a18.f294812f;
                        if (str2 != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                            if (!a18.f294812f.equals(l17)) {
                                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                            }
                        }
                        java.lang.String str3 = a18.f294812f;
                        int lastIndexOf = str3.lastIndexOf("/");
                        if (lastIndexOf >= 0) {
                            str3 = str3.substring(lastIndexOf + 1);
                        }
                        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(h07, str3);
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
                        java.lang.String o17 = r6Var2.o();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                        ((ku5.t0) ku5.t0.f394148d).q(new wn4.v(i17, str, o17, new wn4.n(response, currentTimeMillis, r6Var2)));
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            vz5.b.a(dataInputStream, th6);
                            throw th7;
                        }
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529076i, "onTaskMd5Checking cdnUrl:" + this.f529071d.f223945h + " downloadId:" + this.f529072e + " id:" + j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String url, long j18, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529076i, "onTaskProgressChanged cdnUrl:" + this.f529071d.f223945h + " downloadId:" + this.f529072e + " id:" + j17 + " revcLeng:" + j18 + " totalLen:" + j19);
        if (this.f529072e == j17) {
            ((ku5.t0) ku5.t0.f394148d).B(new wn4.c(j18, j19));
        }
        if (this.f529071d.e() == 4) {
            this.f529073f.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            java.lang.String str = (java.lang.String) this.f529075h.get(java.lang.Long.valueOf(j17));
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
                java.lang.String str2 = this.f529076i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTaskProgressChanged = filePath = ");
                sb6.append(str);
                sb6.append("， is file exist = ");
                sb6.append(r6Var.m());
                sb6.append("， 长度 ");
                sb6.append(r6Var.C());
                sb6.append(", recvLen = ");
                long j27 = 1024;
                sb6.append((j18 / j27) / j27);
                sb6.append("MB");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                long j28 = 2;
                if (j19 > w73.a.f525024a * j28) {
                    w73.a.f525024a = j19 / j28;
                }
                if (this.f529077m || j18 <= w73.a.f525024a || !r6Var.m()) {
                    return;
                }
                this.f529077m = true;
                this.f529074g.put(str, java.lang.Boolean.FALSE);
                w73.a.a(r6Var.o(), new wn4.d(this, str, r6Var, j17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529076i, "onTaskProgressChanged = filePath = " + str + "， is file exist = " + e17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529076i, "onTaskResumed cdnUrl:" + this.f529071d.f223945h + " downloadId:" + this.f529072e + " id:" + j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529076i, "onTaskPaused cdnUrl:" + this.f529071d.f223945h + " downloadId:" + this.f529072e + " id:" + j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
        java.lang.String str2 = this.f529076i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTaskStarted cdnUrl:");
        sb6.append(this.f529071d.f223945h);
        sb6.append(" downloadId:");
        sb6.append(this.f529072e);
        sb6.append(" id:");
        sb6.append(j17);
        sb6.append(" savedFilePath:");
        sb6.append(str == null ? "" : str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        if (this.f529072e == j17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 12L, 1L, false);
            ((ku5.t0) ku5.t0.f394148d).B(wn4.e.f529070d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529076i, "HdiffApk, onTaskStarted taskId: savedFilePath = " + str);
        if (this.f529071d.e() != 4 || str == null) {
            return;
        }
        this.f529075h.put(java.lang.Long.valueOf(j17), str);
        this.f529073f.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.Long.parseLong("0")));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTaskRemoved cdnUrl:");
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = this.f529071d;
        sb6.append(c16114x800e8cdb.f223945h);
        sb6.append(" downloadId:");
        long j18 = this.f529072e;
        sb6.append(j18);
        sb6.append(" id:");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529076i, sb6.toString());
        if (j18 == j17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().s(this);
            java.lang.Integer packageType = c16114x800e8cdb.f223943f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageType, "packageType");
            w73.f.i(10, packageType.intValue(), 102);
        }
    }
}
