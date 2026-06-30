package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class r8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f169292b;

    public r8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b7 b7Var) {
        this.f169292b = o6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public java.lang.String b() {
        return "MainPrepareProcess";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public void c() {
        java.util.List list;
        if (this.f169292b.L0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeWC", "main prepare process ignore, return");
            return;
        }
        m91.f.c(this.f169292b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6 = this.f169292b;
        m91.j jVar = m91.j.f406488a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        m91.j jVar2 = m91.j.f406488a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(365, 28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        this.f169292b.q3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.E2(this.f169292b);
        this.f169292b.d3();
        if (this.f169292b.q2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i P2 = this.f169292b.P2();
            if (P2 != null && (list = this.f169292b.u0().f158844x2) != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (!arrayList.isEmpty()) {
                    P2.f159750g.addAll(list);
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        uh1.x0 x0Var = P2.f159745b;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f509331b;
                        uh1.h.f509328a.getClass();
                        sb6.append(uh1.i.f509331b.incrementAndGet());
                        sb6.append("");
                        java.lang.String sb7 = sb6.toString();
                        x0Var.getClass();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreloadNetworkDownload", "doDownloadFileNoCheck taskId:%s url:%s", sb7, str);
                        try {
                            jSONObject.put("url", str);
                        } catch (org.json.JSONException unused) {
                        }
                        x0Var.b(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8, new java.util.HashMap(), null, 50, new uh1.u0(x0Var, str), sb7, "test");
                    }
                }
            }
            if (k91.d1.a(this.f169292b.f156336n) || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b || this.f169292b.s2()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.d();
            }
        } else if (k91.d1.a(this.f169292b.f156336n)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f169292b.f156336n, true);
        if (b17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.f169906a.g(this.f169292b.f156336n, b17.f169667d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f169292b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.e(o6Var, false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t.b(o6Var.u0().f158828h2));
        }
        fe.g a17 = fe.g.a(this.f169292b.f156336n);
        java.lang.String str2 = this.f169292b.f156336n;
        boolean q27 = this.f169292b.q2();
        a17.f342889d = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBNiReporter", "hy: appId:%s,isGame:%s", str2, java.lang.Boolean.valueOf(q27));
        if (q27) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(str2, a17.f342896k);
        }
        new java.util.ArrayList();
        qp3.a.a("onCreate", this.f169292b.f156336n, this.f169292b.u0().V);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt7 = this.f169292b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt7, "rt");
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11536xfb63f0bd(rt7, com.p314xaae8f345.mm.app.a0.f134821d).mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d2.a(this.f169292b, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p8(this));
        this.f169292b.f3();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.h.f167342a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.E(this.f169292b.f156336n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = this.f169292b;
        java.lang.String str3 = o6Var2.f156336n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.B(str3, aVar);
        o6Var2.N.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.b(aVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.r0.x(this.f169292b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.g(this.f169292b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var3 = this.f169292b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158525a;
        if (o6Var3 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "startRuntimeStateMonitor");
            java.util.HashSet hashSet = (java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158528d;
            if (hashSet.add(o6Var3.f156336n)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "startListeningOperationReceivedIfNeed");
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158526b == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158526b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p();
                    if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t0 t0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158526b;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var;
                        if (t0Var == null) {
                            kVar.getClass();
                        } else {
                            synchronized (kVar.f158510e) {
                                kVar.f158510e.add(t0Var);
                            }
                        }
                    }
                }
                java.lang.String str4 = o6Var3.f156336n;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "startListeningOperationEvent, appId:%s", str4);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158525a == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158525a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.q();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.B(str4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158525a);
                if (1 == hashSet.size()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "startRuntimeStateMonitor, first start, alive listener");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158527c.mo48813x58998cd();
                }
                o6Var3.N.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.o());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "startRuntimeStateMonitor, already start, return");
            }
        }
        this.f169292b.f167711l2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.l0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.l0 l0Var2 = this.f169292b.f167711l2;
        l0Var2.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        l0Var2.f169580a = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var4 = this.f169292b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.t0 t0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.t0();
        o6Var4.M2 = t0Var2;
        if (b17 != null) {
            java.lang.String instanceId = b17.f169667d;
            java.lang.String appId = o6Var4.f156336n;
            long j17 = this.f169292b.u0().f128817z + 1000;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            t0Var2.f169645d = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            t0Var2.f169644c = instanceId;
            t0Var2.f169643b = appId;
            t0Var2.f169642a = java.lang.Long.valueOf(j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.k0.a(this.f169292b.f156336n, this.f169292b.t0(), this.f169292b.l2());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var5 = this.f169292b;
        o6Var5.f167718q2 = o6Var5.l2().f169323f == 1099;
        if (this.f169292b.e3()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var6 = this.f169292b;
            ((java.util.LinkedList) o6Var6.f167719r2).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.cc(o6Var6.u0()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var7 = this.f169292b;
        ((java.util.LinkedList) o6Var7.f167719r2).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.cd(o6Var7.u0(), this.f169292b));
        this.f169292b.N.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q8(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var8 = this.f169292b;
        if (o6Var8.f156329e != null) {
            o6Var8.b3();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeWC", "onCreate appId:%s, skip initFloatBallHelper(), maybe under preRender mode", o6Var8.f156336n);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var9 = this.f169292b;
        if (o6Var9.f156329e != null) {
            o6Var9.c3();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeWC", "onCreate appId:%s, skip initMultiTaskHelper(), maybe under preRender mode", o6Var9.f156336n);
        }
        if (b17 != null) {
            b17.f169673m = java.lang.System.currentTimeMillis();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(this.f169292b.f156338p.f158814g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "invoke appId:%s", this.f169292b.f156336n);
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        if (!this.f169292b.e3()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.c.a(this.f169292b.f156336n);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("" + this.f169292b.f156336n + "_wxa_voip").putBoolean("isCameraStart", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "reset appId:%s isCameraStart false", this.f169292b.f156336n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var10 = this.f169292b;
        o6Var10.R2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.h1(o6Var10);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var11 = this.f169292b;
        o6Var11.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262.e(o6Var11));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var12 = this.f169292b;
        o6Var12.X2 = o6Var12.u0().V1;
        d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public boolean e() {
        return false;
    }
}
