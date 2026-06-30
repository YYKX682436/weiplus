package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f68710a = com.tencent.mm.sdk.platformtools.o4.M("MatrixDelegate");

    public static void a(android.content.Context context, android.content.Intent intent) {
        android.widget.TextView textView;
        dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
        if (bVar == null) {
            return;
        }
        if ("ENABLE_FPS".equals(intent.getAction())) {
            kj.m mVar = bVar.f232817n;
            boolean booleanExtra = intent.getBooleanExtra("ENABLE_FPS", mVar.f308216d);
            com.tencent.mars.xlog.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                mVar.g();
                mVar.i();
            } else {
                mVar.e();
                mVar.h();
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                f68710a.putInt("clicfg_matrix_trace_fps_enable", booleanExtra ? 1 : -1);
                return;
            }
            return;
        }
        if ("ENABLE_FPS_FLOAT".equals(intent.getAction())) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (mj.i.f326968o == null) {
                if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                    mj.i.f326968o = new mj.i(context2, new com.tencent.matrix.trace.view.FloatFrameView(context2));
                } else {
                    try {
                        java.lang.Object obj = mj.i.f326969p;
                        synchronized (obj) {
                            mj.i.f326967n.post(new mj.e(context2));
                            obj.wait();
                        }
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
            mj.i iVar = mj.i.f326968o;
            java.lang.String a17 = bm5.f1.a();
            com.tencent.matrix.trace.view.FloatFrameView floatFrameView = iVar.f326974d;
            if (floatFrameView != null && (textView = (android.widget.TextView) floatFrameView.findViewById(com.tencent.mm.R.id.dln)) != null) {
                textView.setText(a17);
            }
            iVar.f326975e = new com.tencent.mm.matrix.d0();
            boolean booleanExtra2 = intent.getBooleanExtra("ENABLE_FPS_FLOAT", false);
            com.tencent.mars.xlog.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra2));
            if (booleanExtra2 && !android.provider.Settings.canDrawOverlays(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mars.xlog.Log.e("Matrix.UISettingHandler", "permission denied for window type");
                return;
            }
            iVar.f326977g = true;
            if (booleanExtra2) {
                java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
                if (!com.tencent.matrix.lifecycle.owners.f0.f52739u) {
                    com.tencent.mars.xlog.Log.w("Matrix.UISettingHandler", "not in the foreground now!");
                } else if (iVar.f326977g) {
                    mj.i.f326967n.post(new mj.f(iVar));
                }
            } else {
                mj.i.f326967n.post(new mj.g(iVar));
                iVar.f326977g = false;
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                f68710a.putInt("ENABLE_FPS_FLOAT", booleanExtra2 ? 1 : -1);
                return;
            }
            return;
        }
        if ("ENABLE_START_UP".equals(intent.getAction())) {
            kj.e0 e0Var = bVar.f232816m;
            boolean booleanExtra3 = intent.getBooleanExtra("ENABLE_START_UP", e0Var.f308216d);
            com.tencent.mars.xlog.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra3));
            if (booleanExtra3) {
                e0Var.g();
            } else {
                e0Var.e();
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                f68710a.putInt("clicfg_matrix_trace_startup_enable", booleanExtra3 ? 1 : -1);
                return;
            }
            return;
        }
        if ("ENABLE_EVIL_METHOD".equals(intent.getAction())) {
            kj.c cVar = bVar.f232815i;
            boolean booleanExtra4 = intent.getBooleanExtra("ENABLE_EVIL_METHOD", cVar.f308216d);
            com.tencent.mars.xlog.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra4));
            if (booleanExtra4) {
                cVar.g();
            } else {
                cVar.e();
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                f68710a.putInt("clicfg_matrix_trace_evil_method_enable", booleanExtra4 ? 1 : -1);
                return;
            }
            return;
        }
        if ("ENABLE_ANR".equals(intent.getAction())) {
            kj.u uVar = bVar.f232818o;
            boolean booleanExtra5 = intent.getBooleanExtra("ENABLE_ANR", uVar.f308216d);
            com.tencent.mars.xlog.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra5));
            if (booleanExtra5) {
                uVar.g();
            } else {
                uVar.e();
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                f68710a.putInt("clicfg_matrix_trace_anr_enable", booleanExtra5 ? 1 : -1);
                return;
            }
            return;
        }
        if ("ENABLE_METHOD_BEAT".equals(intent.getAction())) {
            com.tencent.matrix.trace.core.AppMethodBeat appMethodBeat = com.tencent.matrix.trace.core.AppMethodBeat.getInstance();
            boolean booleanExtra6 = intent.getBooleanExtra("ENABLE_METHOD_BEAT", appMethodBeat.isAlive());
            com.tencent.mars.xlog.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra6));
            if (booleanExtra6) {
                appMethodBeat.onStart();
                return;
            } else {
                appMethodBeat.onStop();
                return;
            }
        }
        if ("ENABLE_DEV_LOG".equals(intent.getAction())) {
            boolean booleanExtra7 = intent.getBooleanExtra("ENABLE_DEV_LOG", false);
            com.tencent.mars.xlog.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra7));
            bVar.f232814h.f253261h = booleanExtra7;
            return;
        }
        if ("MODIFY_EVIL_THRESHOLD".equals(intent.getAction())) {
            long longExtra = intent.getLongExtra("MODIFY_EVIL_THRESHOLD", 700L);
            bVar.f232815i.f308188f = longExtra;
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                f68710a.putLong("clicfg_matrix_trace_evil_method_threshold", longExtra);
                return;
            }
            return;
        }
        if ("ENABLE_BATTERY".equals(intent.getAction())) {
            boolean booleanExtra8 = intent.getBooleanExtra("ENABLE_BATTERY", false);
            com.tencent.mars.xlog.Log.i("Matrix.UISettingHandler", "action=%s isEnable=%s", intent.getAction(), java.lang.Boolean.valueOf(booleanExtra8));
            ph.u uVar2 = (ph.u) ih.d.d().a(ph.u.class);
            if (booleanExtra8) {
                uVar2.e();
            } else {
                int i17 = uVar2.f363455g;
                if (i17 == 8) {
                    throw new java.lang.RuntimeException("plugin stop, but plugin has been already destroyed");
                }
                if (!(i17 == 2)) {
                    throw new java.lang.RuntimeException("plugin stop, but plugin is never started");
                }
                uVar2.f363455g = 4;
                qi.c cVar2 = uVar2.f363452d;
                if (cVar2 == null) {
                    throw new java.lang.RuntimeException("plugin stop, plugin listener is null");
                }
                cVar2.d(uVar2);
                qh.f0 f0Var = uVar2.f354296h;
                f0Var.getClass();
                synchronized (qh.f0.class) {
                    if (f0Var.f363341m) {
                        f0Var.f363336e.removeCallbacksAndMessages(null);
                        java.util.Iterator it = ((java.util.ArrayList) f0Var.f363335d.f363306y).iterator();
                        while (it.hasNext()) {
                            ((rh.e3) it.next()).e();
                        }
                        f0Var.f363341m = false;
                    }
                }
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                f68710a.putInt("ENABLE_BATTERY", booleanExtra8 ? 1 : -1);
            }
        }
    }
}
