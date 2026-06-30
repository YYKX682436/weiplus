package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f150243a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MatrixDelegate");

    public static void a(android.content.Context context, android.content.Intent intent) {
        android.widget.TextView textView;
        dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
        if (bVar == null) {
            return;
        }
        if ("ENABLE_FPS".equals(intent.getAction())) {
            kj.m mVar = bVar.f314350n;
            boolean booleanExtra = intent.getBooleanExtra("ENABLE_FPS", mVar.f389749d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                mVar.g();
                mVar.i();
            } else {
                mVar.e();
                mVar.h();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                f150243a.putInt("clicfg_matrix_trace_fps_enable", booleanExtra ? 1 : -1);
                return;
            }
            return;
        }
        if ("ENABLE_FPS_FLOAT".equals(intent.getAction())) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (mj.i.f408501o == null) {
                if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                    mj.i.f408501o = new mj.i(context2, new com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.C4717x6bd28ad6(context2));
                } else {
                    try {
                        java.lang.Object obj = mj.i.f408502p;
                        synchronized (obj) {
                            mj.i.f408500n.post(new mj.e(context2));
                            obj.wait();
                        }
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
            mj.i iVar = mj.i.f408501o;
            java.lang.String a17 = bm5.f1.a();
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.C4717x6bd28ad6 c4717x6bd28ad6 = iVar.f408507d;
            if (c4717x6bd28ad6 != null && (textView = (android.widget.TextView) c4717x6bd28ad6.findViewById(com.p314xaae8f345.mm.R.id.dln)) != null) {
                textView.setText(a17);
            }
            iVar.f408508e = new com.p314xaae8f345.mm.p849xbf8d97c1.d0();
            boolean booleanExtra2 = intent.getBooleanExtra("ENABLE_FPS_FLOAT", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra2));
            if (booleanExtra2 && !android.provider.Settings.canDrawOverlays(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Matrix.UISettingHandler", "permission denied for window type");
                return;
            }
            iVar.f408510g = true;
            if (booleanExtra2) {
                java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
                if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.UISettingHandler", "not in the foreground now!");
                } else if (iVar.f408510g) {
                    mj.i.f408500n.post(new mj.f(iVar));
                }
            } else {
                mj.i.f408500n.post(new mj.g(iVar));
                iVar.f408510g = false;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                f150243a.putInt("ENABLE_FPS_FLOAT", booleanExtra2 ? 1 : -1);
                return;
            }
            return;
        }
        if ("ENABLE_START_UP".equals(intent.getAction())) {
            kj.e0 e0Var = bVar.f314349m;
            boolean booleanExtra3 = intent.getBooleanExtra("ENABLE_START_UP", e0Var.f389749d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra3));
            if (booleanExtra3) {
                e0Var.g();
            } else {
                e0Var.e();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                f150243a.putInt("clicfg_matrix_trace_startup_enable", booleanExtra3 ? 1 : -1);
                return;
            }
            return;
        }
        if ("ENABLE_EVIL_METHOD".equals(intent.getAction())) {
            kj.c cVar = bVar.f314348i;
            boolean booleanExtra4 = intent.getBooleanExtra("ENABLE_EVIL_METHOD", cVar.f389749d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra4));
            if (booleanExtra4) {
                cVar.g();
            } else {
                cVar.e();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                f150243a.putInt("clicfg_matrix_trace_evil_method_enable", booleanExtra4 ? 1 : -1);
                return;
            }
            return;
        }
        if ("ENABLE_ANR".equals(intent.getAction())) {
            kj.u uVar = bVar.f314351o;
            boolean booleanExtra5 = intent.getBooleanExtra("ENABLE_ANR", uVar.f389749d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra5));
            if (booleanExtra5) {
                uVar.g();
            } else {
                uVar.e();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                f150243a.putInt("clicfg_matrix_trace_anr_enable", booleanExtra5 ? 1 : -1);
                return;
            }
            return;
        }
        if ("ENABLE_METHOD_BEAT".equals(intent.getAction())) {
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118 m41264x9cf0d20b = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41264x9cf0d20b();
            boolean booleanExtra6 = intent.getBooleanExtra("ENABLE_METHOD_BEAT", m41264x9cf0d20b.m41273x7a7245c3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra6));
            if (booleanExtra6) {
                m41264x9cf0d20b.m41275xb05099c3();
                return;
            } else {
                m41264x9cf0d20b.m41276xc39f8281();
                return;
            }
        }
        if ("ENABLE_DEV_LOG".equals(intent.getAction())) {
            boolean booleanExtra7 = intent.getBooleanExtra("ENABLE_DEV_LOG", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra7));
            bVar.f314347h.f334794h = booleanExtra7;
            return;
        }
        if ("MODIFY_EVIL_THRESHOLD".equals(intent.getAction())) {
            long longExtra = intent.getLongExtra("MODIFY_EVIL_THRESHOLD", 700L);
            bVar.f314348i.f389721f = longExtra;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                f150243a.putLong("clicfg_matrix_trace_evil_method_threshold", longExtra);
                return;
            }
            return;
        }
        if ("ENABLE_BATTERY".equals(intent.getAction())) {
            boolean booleanExtra8 = intent.getBooleanExtra("ENABLE_BATTERY", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra8));
            ph.u uVar2 = (ph.u) ih.d.d().a(ph.u.class);
            if (booleanExtra8) {
                uVar2.e();
            } else {
                int i17 = uVar2.f444988g;
                if (i17 == 8) {
                    throw new java.lang.RuntimeException("plugin stop, but plugin has been already destroyed");
                }
                if (!(i17 == 2)) {
                    throw new java.lang.RuntimeException("plugin stop, but plugin is never started");
                }
                uVar2.f444988g = 4;
                qi.c cVar2 = uVar2.f444985d;
                if (cVar2 == null) {
                    throw new java.lang.RuntimeException("plugin stop, plugin listener is null");
                }
                cVar2.d(uVar2);
                qh.f0 f0Var = uVar2.f435829h;
                f0Var.getClass();
                synchronized (qh.f0.class) {
                    if (f0Var.f444874m) {
                        f0Var.f444869e.removeCallbacksAndMessages(null);
                        java.util.Iterator it = ((java.util.ArrayList) f0Var.f444868d.f444839y).iterator();
                        while (it.hasNext()) {
                            ((rh.e3) it.next()).e();
                        }
                        f0Var.f444874m = false;
                    }
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                f150243a.putInt("ENABLE_BATTERY", booleanExtra8 ? 1 : -1);
            }
        }
    }
}
