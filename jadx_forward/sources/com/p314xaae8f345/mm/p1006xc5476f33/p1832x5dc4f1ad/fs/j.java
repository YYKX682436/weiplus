package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public abstract class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f229503g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f229504h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f229505i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f229506m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f229507n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f229508o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f229509p;

    /* renamed from: q, reason: collision with root package name */
    public long f229510q;

    /* renamed from: r, reason: collision with root package name */
    public long f229511r;

    public j(java.lang.String instanceName) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        this.f229505i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.h(instanceName));
        this.f229506m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.f(instanceName));
        this.f229507n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.i(instanceName));
        this.f229508o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.g(instanceName));
        this.f229509p = new java.util.HashMap();
        java.lang.String a17 = fe3.l.a();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) && com.p314xaae8f345.mm.vfs.w6.u(a17)) {
            com.p314xaae8f345.mm.vfs.w6.t(a17);
        }
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        java.util.Iterator it = ((java.util.ArrayList) jc3.u0.f380533e).iterator();
        while (true) {
            if (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (s07.equalsIgnoreCase(str2.toLowerCase())) {
                    str = str2.toLowerCase();
                    break;
                }
            } else if (jc3.u0.f380529a.a(s07)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystemRegistry", "findBizName: dynamic biz found: ".concat(s07));
                str = s07.toLowerCase();
            } else {
                str = null;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushFileSystemBizRegistry", "file system invalid instanceName:" + instanceName + ",not register");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushFileSystemBizRegistry", "file system vfs init failed instanceName:".concat(instanceName));
            return;
        }
        this.f229503g = str;
        this.f229504h = new com.p314xaae8f345.mm.vfs.r6(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystemBizRegistry", "file system established instanceName:".concat(instanceName));
    }

    private final boolean h(long j17) {
        boolean z17 = this.f229510q + j17 > g();
        if (z17) {
            i95.m c17 = i95.n0.c(je3.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            je3.i.x2((je3.i) c17, "MagicTempFileSizeExceedLimit", 1, null, 1.0f, 4, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushFileSystemBizRegistry", "temp file size exceed limit! %d limit:%d", java.lang.Long.valueOf(this.f229510q + j17), java.lang.Long.valueOf(g()));
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: allocTempFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5(java.lang.String str) {
        if (h(0L)) {
            return null;
        }
        return super.mo49614x6665a5c5(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: createTempFileFrom */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        if (h(r6Var != null ? r6Var.C() : 0L)) {
            if (b0Var != null) {
                b0Var.f373357a = null;
            }
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        this.f229510q += r6Var != null ? r6Var.C() : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = super.mo49619x6aa75256(r6Var, str, z17, b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49619x6aa75256, "createTempFileFrom(...)");
        return mo49619x6aa75256;
    }

    public final long g() {
        return ((java.lang.Number) ((jz5.n) this.f229506m).mo141623x754a37bb()).longValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getTempDirectory */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49624x5d68c543(ik1.b0 b0Var) {
        if (h(0L)) {
            if (b0Var != null) {
                b0Var.f373357a = null;
            }
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49624x5d68c543 = super.mo49624x5d68c543(b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49624x5d68c543, "getTempDirectory(...)");
        return mo49624x5d68c543;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: initialize */
    public void mo49302x33ebcb90() {
        java.lang.String str;
        super.mo49302x33ebcb90();
        java.util.HashMap hashMap = this.f229509p;
        hashMap.clear();
        java.util.concurrent.CopyOnWriteArrayList e17 = e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getOrderedFileSystemList(...)");
        java.util.Iterator it = e17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            boolean z17 = true;
            str = this.f229503g;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next();
            if (u1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) u1Var;
                java.lang.String str2 = n1Var.f157809e;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushFileSystemBizRegistry", "fs root path is null, skip");
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n1Var.f157810f, "wxfile://")) {
                    java.lang.String str3 = n1Var.f157809e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getRootPath(...)");
                    hashMap.put(str + "-temp", str3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getRootPath(...)");
                    hashMap.put(str + "-saved_temp", str3);
                }
            } else if (u1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) u1Var;
                java.lang.String str4 = j3Var.f157758d;
                if (str4 != null && str4.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushFileSystemBizRegistry", "fs root path is null, skip");
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j3Var.f157759e, "wxfile://usr")) {
                    java.lang.String str5 = j3Var.f157758d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getRootPath(...)");
                    hashMap.put(str + "-normal_none_flatten", str5);
                }
            }
        }
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.x.f229534a;
            this.f229510q = xVar.c(str, "temp");
            this.f229511r = xVar.c(str, "normal_none_flatten");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystemBizRegistry", str + " currentTempSize " + this.f229510q + " currentUsrSize " + this.f229511r);
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicStorageFsInitialize", 1, "{\"bizName\":\"" + r26.n0.s0(str, "-", str) + "\",\"currentTempSize\":" + this.f229510q + ",\"currentUsrSize\":" + this.f229511r + '}', com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa.f37608xae5929.getValue());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: release */
    public void mo49309x41012807() {
        java.lang.String str = this.f229503g;
        if (str != null) {
            long longValue = ((java.lang.Number) ((jz5.n) this.f229507n).mo141623x754a37bb()).longValue();
            long g17 = g();
            long longValue2 = ((java.lang.Number) ((jz5.n) this.f229508o).mo141623x754a37bb()).longValue();
            java.util.HashMap storageKey2Path = this.f229509p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageKey2Path, "storageKey2Path");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "start check: bizName[" + str + "] minTemp[" + longValue + "] maxTemp[" + g17 + "] maxTotal[" + longValue2 + ']');
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.C16435xf11ff843(str, longValue, g17, longValue2, storageKey2Path), com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.w.class, null);
        }
        super.mo49309x41012807();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: saveFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49631x84702499(com.p314xaae8f345.mm.vfs.r6 srcFile, java.lang.String specifiedPath, ik1.b0 b0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcFile, "srcFile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specifiedPath, "specifiedPath");
        this.f229510q -= srcFile.C();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49631x84702499 = super.mo49631x84702499(srcFile, specifiedPath, b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49631x84702499, "saveFile(...)");
        return mo49631x84702499;
    }
}
