package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public final class q5 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.app.q5 f135270c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f135271a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f135272b = new java.util.LinkedList();

    public q5(android.content.Context context) {
        this.f135271a = false;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120 c4679x33de8120 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495;
        this.f135271a = c4679x33de8120.mo40975xf7b3660d();
        c4679x33de8120.mo40973x40b15f2e(new com.p314xaae8f345.mm.app.r5(this));
    }

    public static com.p314xaae8f345.mm.app.q5 b() {
        if (f135270c == null) {
            synchronized ("MicroMsg.ProcForegroundDelegate") {
                if (f135270c == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!");
                }
            }
        }
        return f135270c;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ProcForegroundDelegate", th6, "getBallInfoListSync fail!", new java.lang.Object[0]);
        }
        return java.util.Collections.emptyList();
    }

    public void a(com.p314xaae8f345.mm.app.s5 s5Var) {
        synchronized (this.f135272b) {
            if (!((java.util.LinkedList) this.f135272b).contains(s5Var)) {
                ((java.util.LinkedList) this.f135272b).add(s5Var);
            }
        }
    }

    public boolean d() {
        java.util.List p07;
        boolean z17 = true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((ov.r0) ((com.p314xaae8f345.mm.app.u2) i95.n0.c(com.p314xaae8f345.mm.app.u2.class))).getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || (p07 = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().p0()) == null) {
                return false;
            }
            return !p07.isEmpty();
        }
        ((ov.r0) ((com.p314xaae8f345.mm.app.u2) i95.n0.c(com.p314xaae8f345.mm.app.u2.class))).getClass();
        java.util.List asList = java.util.Arrays.asList(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.class);
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

    public void e(com.p314xaae8f345.mm.app.s5 s5Var) {
        synchronized (this.f135272b) {
            java.util.ListIterator listIterator = this.f135272b.listIterator();
            while (listIterator.hasNext()) {
                if (((com.p314xaae8f345.mm.app.s5) listIterator.next()) == s5Var) {
                    listIterator.remove();
                }
            }
        }
    }
}
