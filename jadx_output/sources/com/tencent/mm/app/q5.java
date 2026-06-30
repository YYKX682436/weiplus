package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class q5 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.tencent.mm.app.q5 f53737c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f53738a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f53739b = new java.util.LinkedList();

    public q5(android.content.Context context) {
        this.f53738a = false;
        com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner processUIStartedStateOwner = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE;
        this.f53738a = processUIStartedStateOwner.isForeground();
        processUIStartedStateOwner.addLifecycleCallback(new com.tencent.mm.app.r5(this));
    }

    public static com.tencent.mm.app.q5 b() {
        if (f53737c == null) {
            synchronized ("MicroMsg.ProcForegroundDelegate") {
                if (f53737c == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!");
                }
            }
        }
        return f53737c;
    }

    public static java.util.List c() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.WindowManagerGlobal");
            java.lang.Object invoke = cls.getMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.String[] strArr = (java.lang.String[]) cls.getDeclaredMethod("getViewRootNames", new java.lang.Class[0]).invoke(invoke, new java.lang.Object[0]);
            if (strArr != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str : strArr) {
                    java.lang.Object invoke2 = cls.getDeclaredMethod("getRootView", java.lang.String.class).invoke(invoke, str);
                    if (invoke2 instanceof android.view.View) {
                        arrayList.add((android.view.View) invoke2);
                    }
                }
                return arrayList;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProcForegroundDelegate", th6, "getBallInfoListSync fail!", new java.lang.Object[0]);
        }
        return java.util.Collections.emptyList();
    }

    public void a(com.tencent.mm.app.s5 s5Var) {
        synchronized (this.f53739b) {
            if (!((java.util.LinkedList) this.f53739b).contains(s5Var)) {
                ((java.util.LinkedList) this.f53739b).add(s5Var);
            }
        }
    }

    public boolean d() {
        java.util.List p07;
        boolean z17 = true;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((ov.r0) ((com.tencent.mm.app.u2) i95.n0.c(com.tencent.mm.app.u2.class))).getClass();
            if (!com.tencent.mm.sdk.platformtools.x2.n() || (p07 = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().p0()) == null) {
                return false;
            }
            return !p07.isEmpty();
        }
        ((ov.r0) ((com.tencent.mm.app.u2) i95.n0.c(com.tencent.mm.app.u2.class))).getClass();
        java.util.List asList = java.util.Arrays.asList(com.tencent.mm.plugin.ball.view.FloatBallView.class, com.tencent.mm.plugin.ball.view.FloatMenuView.class);
        if (asList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = c().iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (asList.contains(((android.view.View) it.next()).getClass())) {
                break;
            }
        }
        return z17;
    }

    public void e(com.tencent.mm.app.s5 s5Var) {
        synchronized (this.f53739b) {
            java.util.ListIterator listIterator = this.f53739b.listIterator();
            while (listIterator.hasNext()) {
                if (((com.tencent.mm.app.s5) listIterator.next()) == s5Var) {
                    listIterator.remove();
                }
            }
        }
    }
}
