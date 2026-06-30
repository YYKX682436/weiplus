package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public final class td {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.md f291426c = new com.p314xaae8f345.mm.ui.md(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f291427d = new java.util.concurrent.ConcurrentHashMap(16);

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Field f291428e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.Executor f291429f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f291430a = new java.util.concurrent.ConcurrentHashMap(16);

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f291431b = new android.os.Handler(android.os.Looper.getMainLooper());

    static {
        boolean z17;
        try {
            java.lang.reflect.Field declaredField = android.os.Looper.class.getDeclaredField("sThreadLocal");
            f291428e = declaredField;
            z17 = true;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            java.lang.reflect.Field field = f291428e;
            if (field != null) {
                field.get(null);
            }
        } catch (java.lang.Throwable th6) {
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMLayoutPrefetcher", th6, "[-] Fail to init Looper injection, ignore preload requests.", new java.lang.Object[0]);
            f291428e = null;
        }
        if (!z17) {
            f291429f = null;
            return;
        }
        qo.m mVar = (qo.m) i95.n0.c(qo.m.class);
        com.p314xaae8f345.mm.ui.ld ldVar = com.p314xaae8f345.mm.ui.ld.f290610d;
        ((qo.c) mVar).getClass();
        f291429f = qo.q.f446854a.a("MicroMsg.MMLayoutPrefetcher", ldVar);
    }

    public td(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20297x5a9e9be3()) == 1 && com.p314xaae8f345.mm.ui.bk.F()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMLayoutPrefetcher", "[!] Fail to update configuration for night mode, which may cause white block in preloaded layouts.");
                return;
            }
            android.content.res.Configuration configuration = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getConfiguration();
            j65.m.c(configuration, com.p314xaae8f345.mm.ui.bk.C());
            android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
            if (resources instanceof j65.j) {
                ((j65.j) resources).i(configuration);
            }
        }
    }

    public final android.view.View a(android.view.LayoutInflater inflater, int i17, android.view.ViewGroup viewGroup, boolean z17) {
        com.p314xaae8f345.mm.ui.nd status;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        com.p314xaae8f345.mm.ui.od odVar = (com.p314xaae8f345.mm.ui.od) this.f291430a.remove(java.lang.Integer.valueOf(i17));
        if (odVar == null) {
            return b(inflater, i17, viewGroup, z17);
        }
        synchronized (odVar.f291002a) {
            status = odVar.f291003b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
            odVar.f291003b = status == com.p314xaae8f345.mm.ui.nd.f290945d ? com.p314xaae8f345.mm.ui.nd.f290947f : status;
            odVar.f291002a.notifyAll();
        }
        if (status == com.p314xaae8f345.mm.ui.nd.f290945d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMLayoutPrefetcher", "[+] resource 0x%x is still in queue, inflate it directly.", java.lang.Integer.valueOf(i17));
            return b(inflater, i17, viewGroup, z17);
        }
        if (status == com.p314xaae8f345.mm.ui.nd.f290946e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLayoutPrefetcher", "[+] resource 0x%x is still preloading, wait until finished.", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.ui.nd ndVar = com.p314xaae8f345.mm.ui.nd.f290947f;
            synchronized (odVar.f291002a) {
                while (odVar.f291003b != ndVar) {
                    odVar.f291002a.wait();
                }
            }
        } else if (status != com.p314xaae8f345.mm.ui.nd.f290947f) {
            throw new java.lang.IllegalStateException("Should not be here.");
        }
        android.view.View view = odVar.f291004c;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMLayoutPrefetcher", "[+] resource 0x%x preloads failed, inflate it directly.", java.lang.Integer.valueOf(i17));
            return b(inflater, i17, viewGroup, z17);
        }
        if (viewGroup == null || !z17) {
            return view;
        }
        viewGroup.addView(view);
        return view;
    }

    public final android.view.View b(android.view.LayoutInflater layoutInflater, int i17, android.view.ViewGroup viewGroup, boolean z17) {
        com.p314xaae8f345.mm.ui.qd qdVar = new com.p314xaae8f345.mm.ui.qd(layoutInflater, i17, viewGroup, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (android.os.Process.myPid() == android.os.Process.myTid()) {
            h0Var.f391656d = qdVar.mo152xb9724478();
        } else {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            this.f291431b.post(new com.p314xaae8f345.mm.ui.pd(h0Var, qdVar, countDownLatch));
            countDownLatch.await();
        }
        return (android.view.View) h0Var.f391656d;
    }
}
