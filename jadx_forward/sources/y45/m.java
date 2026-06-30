package y45;

/* loaded from: classes11.dex */
public abstract class m {
    public static void a(final android.content.Context context, final r45.f35 f35Var, final m3.a aVar, final boolean z17, final boolean z18, boolean z19) {
        d55.u.b("MicroMsg.recovery.operator", "doFetchTinkerPatch() called. apply_path: %s, force_using_https_channel: %s, peak_shaving: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: y45.m$$b
            @Override // java.lang.Runnable
            public final void run() {
                boolean z27 = z18;
                d55.u.b("MicroMsg.recovery.operator", "doFetchTinkerPatch: actually do fetch task, use_https_channel: %s", java.lang.Boolean.valueOf(z27));
                r45.f35 f35Var2 = f35Var;
                android.content.Context context2 = context;
                m3.a aVar2 = aVar;
                boolean z28 = z17;
                if (z27) {
                    z45.a.b(f35Var2, new y45.p(context2, 2, aVar2, z28));
                    return;
                }
                final b55.c cVar = new b55.c(f35Var2, new y45.p(context2, 1, aVar2, z28));
                r45.lk0 lk0Var = new r45.lk0();
                final com.p314xaae8f345.mm.p944x882e457a.o oVar = cVar.f99636d;
                lk0Var.f76494x2de60e5e = o45.bh.a(oVar.mo47979x2d63726f());
                lk0Var.f461074d = cVar.f99638f;
                r45.nk0 nk0Var = new r45.nk0();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
                nk0Var.f462990d = cu5Var;
                r45.mk0 mk0Var = (r45.mk0) oVar.f152243a.f152217a;
                mk0Var.f462134e = lk0Var;
                mk0Var.f462133d = nk0Var;
                oVar.m48033x97bfc4c(o45.pi.d());
                final com.p314xaae8f345.mm.p944x882e457a.v2 v2Var = new com.p314xaae8f345.mm.p944x882e457a.v2(oVar, android.os.Looper.myLooper() == null ? new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()) : new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(), null);
                final b55.d dVar = new b55.d(oVar, cVar);
                y45.u.a().post(new java.lang.Runnable() { // from class: b55.c$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        a55.e eVar;
                        b55.c cVar2 = b55.c.this;
                        com.p314xaae8f345.mm.p944x882e457a.v2 v2Var2 = v2Var;
                        b55.d dVar2 = dVar;
                        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = oVar;
                        cVar2.getClass();
                        d55.u.b("MicroMsg.NetSceneNotLoginTinkerCheck", "Before startTask.", new java.lang.Object[0]);
                        a55.g gVar = a55.g.f83147b;
                        b55.a aVar3 = new b55.a();
                        gVar.getClass();
                        if (v2Var2 == null) {
                            d55.u.d("MicroMsg.MarsNetTasks", "startTask  rr is null", new java.lang.Object[0]);
                            eVar = a55.g.f83148c;
                        } else {
                            com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task task = new com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179());
                            try {
                                task.f19634x5a623d5 = ((com.p314xaae8f345.mm.p944x882e457a.r2) v2Var2.f152362f).f152325g.mo13850x7443ca3f();
                                task.cgi = v2Var2.mo48053xb5887636();
                                if (v2Var2.f152360d.mo47982x962be848()) {
                                    d55.u.b("MicroMsg.MarsNetTasks", "keep-alive for cgi=" + task.cgi, new java.lang.Object[0]);
                                    task.f19636x2f676f86.put("Connection", "Keep-Alive");
                                }
                                int mo48052xfb85f7b0 = v2Var2.mo48052xfb85f7b0();
                                task.f19641x91e64c7d = (v2Var2.f152360d.mo14486xf353c268() & 1) != 1;
                                task.f19637x67f26b89 = true;
                                task.f19632x8675d196 = 0;
                                task.f19648x4a585f54 = false;
                                if (((com.p314xaae8f345.mm.p944x882e457a.r2) v2Var2.f152362f).f152325g.mo150590x4bad6229() && v2Var2.mo48053xb5887636() != null && v2Var2.mo48053xb5887636().length() > 0) {
                                    task.f19631x54d08fdf |= 1;
                                }
                                if (task.f19634x5a623d5 != 0) {
                                    task.f19631x54d08fdf |= 2;
                                }
                                task.f19630x5a37c60 = mo48052xfb85f7b0;
                                task.f19647xbaa1a747 = 0;
                                task.f19635xf0e1e4de = new java.util.HashMap();
                                d55.u.b("MicroMsg.MarsNetTasks", "mmcgi startTask inQueue hash[%d,%d] net:%d cgi:%s needAuthed:%b", java.lang.Integer.valueOf(task.f19651xcb7ef160), java.lang.Integer.valueOf(v2Var2.o2()), java.lang.Integer.valueOf(task.f19631x54d08fdf), task.cgi, java.lang.Boolean.valueOf(task.f19641x91e64c7d));
                            } catch (android.os.RemoteException e17) {
                                boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                d55.u.d("MicroMsg.MarsNetTasks", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                            }
                            a55.f fVar = new a55.f(null);
                            fVar.f83142a = v2Var2;
                            fVar.f83143b = dVar2;
                            fVar.f83144c = aVar3;
                            boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            fVar.f83145d = java.lang.System.currentTimeMillis();
                            fVar.f83146e = task.f19651xcb7ef160;
                            synchronized (gVar.f83149a) {
                                gVar.f83149a.put(task.f19651xcb7ef160, fVar);
                            }
                            ((com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.class)).m40474x81156d07(task);
                            eVar = new a55.e(fVar.f83146e, 0);
                        }
                        a55.e eVar2 = eVar;
                        if (eVar2.f83141b < 0) {
                            cVar2.mo804x5f9cdc6f(-1, 3, -1, "send to network failed", v0Var, null);
                            d55.u.b("MicroMsg.NetSceneNotLoginTinkerCheck", "Send, %s, ThreadID:%s, getType:%s", java.lang.Integer.valueOf(eVar2.f83140a), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Integer.valueOf(v0Var.mo13822xfb85f7b0()));
                        }
                    }
                });
            }
        };
        if (!z19) {
            runnable.run();
            return;
        }
        long nextInt = new java.util.Random().nextInt(3600) * 1000;
        d55.u.b("MicroMsg.recovery.operator", "doFetchTinkerPatch: delay %sms to do patch fetching logic for peak shaving.", java.lang.Long.valueOf(nextInt));
        y45.u.a().postDelayed(runnable, nextInt);
    }

    public static void b(android.content.Context context, java.lang.String str, long j17, java.lang.String str2, m3.a aVar, boolean z17) {
        d55.u.b("MicroMsg.recovery.operator", "#downloadTinkerPatch, file size = " + j17 + ", url = " + str, new java.lang.Object[0]);
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        w95.d dVar = new w95.d(str);
        java.io.File file = new java.io.File(context.getCacheDir(), "recovery/tinker_path_file_" + java.lang.System.currentTimeMillis());
        dVar.f525616g = file;
        dVar.f525615f = new java.io.File(file.getAbsolutePath() + ".tmp");
        dVar.f525624r = new y45.o(z17, context, atomicInteger, aVar);
        if (j17 > 0) {
            dVar.f525620n = j17;
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            dVar.f525622p = new w95.g(str2);
        }
        d55.u.b("MicroMsg.recovery.operator", "#downloadTinkerPatch start sync downloading", new java.lang.Object[0]);
        w95.a aVar2 = new w95.a();
        w95.c cVar = new w95.c(aVar2);
        cVar.f525611a = context;
        cVar.b(dVar);
        while (dVar.f525613d == 2030) {
            try {
                java.lang.Thread.sleep(((x95.c) dVar.h()).f534274a);
                cVar.b(dVar);
            } catch (java.lang.InterruptedException e17) {
                dVar.f525613d = 2040;
                aVar2.b(dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, e17.getLocalizedMessage());
            }
        }
    }

    public static void c(android.content.Context context, m3.a aVar, java.lang.String str, boolean z17, boolean z18) {
        boolean z19;
        if (z17) {
            d55.u.b("MicroMsg.recovery.operator", "force using HTTPS channel, skip mars init.", new java.lang.Object[0]);
        } else {
            try {
                a55.h.f83150a.a();
            } catch (java.lang.Throwable th6) {
                d55.u.c("MicroMsg.recovery.operator", "Mars init failed, force using https to fetch tinker patch configs.", th6, new java.lang.Object[0]);
                z17 = true;
            }
        }
        if (!z17 || z65.c.a() || y45.r.a(context).mo123524x41a8a7f2("sk_enable_https_patch_channel", false)) {
            z19 = z17;
        } else {
            d55.u.d("MicroMsg.recovery.operator", "https channel was not enabled, do not use it.", new java.lang.Object[0]);
            z19 = false;
        }
        java.lang.String str2 = lp0.a.f401789j;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            d55.u.b("MicroMsg.recovery.operator", "baseTinkerId = " + str, new java.lang.Object[0]);
            r45.f35 f35Var = new r45.f35();
            f35Var.f455520d = str;
            f35Var.f455521e = lp0.a.a();
            java.util.LinkedList b17 = b55.b.b();
            f35Var.f455522f = b17;
            b17.add(b55.b.a("biz-scene", "recovery"));
            f35Var.f455527n = 1;
            a(context, f35Var, aVar, true, z19, z18);
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        str = str2;
        d55.u.b("MicroMsg.recovery.operator", "baseTinkerId = " + str, new java.lang.Object[0]);
        r45.f35 f35Var2 = new r45.f35();
        f35Var2.f455520d = str;
        f35Var2.f455521e = lp0.a.a();
        java.util.LinkedList b172 = b55.b.b();
        f35Var2.f455522f = b172;
        b172.add(b55.b.a("biz-scene", "recovery"));
        f35Var2.f455527n = 1;
        a(context, f35Var2, aVar, true, z19, z18);
    }
}
