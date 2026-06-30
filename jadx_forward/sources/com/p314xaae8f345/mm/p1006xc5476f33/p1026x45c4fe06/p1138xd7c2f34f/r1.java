package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f f166625a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient boolean f166626b = false;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u8 f166627c;

    /* renamed from: d, reason: collision with root package name */
    public volatile transient com.p314xaae8f345.mm.p794xb0fa9b5e.r f166628d;

    /* renamed from: e, reason: collision with root package name */
    public volatile transient java.lang.ref.WeakReference f166629e;

    public r1(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f166629e = new java.lang.ref.WeakReference(activity);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f c12333xba065a6f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f();
        this.f166625a = c12333xba065a6f;
        c12333xba065a6f.f165913d = bm5.f1.a();
        c12333xba065a6f.f165915f = o6Var.u0();
        c12333xba065a6f.f165916g = o6Var.l2();
        c12333xba065a6f.f165917h = o6Var.S2(false);
        c12333xba065a6f.f165914e = o6Var.u0().S1;
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r1 r1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906) {
        r1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1 o1Var = c12334xbda92906.f165918d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = r1Var.f166625a.f165915f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "[applaunch] runInClientProcess, event = %s, %s %d", o1Var, c11809xbc286be4.f158811d, java.lang.Integer.valueOf(c11809xbc286be4.f158814g));
        if (o1Var == null) {
            return;
        }
        switch (o1Var.ordinal()) {
            case 0:
                if (r1Var.f166627c != null) {
                    r1Var.f166627c.w(c12334xbda92906.f165923i);
                    return;
                }
                return;
            case 1:
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = c12334xbda92906.f165920f;
                if (c11813xf952a195 == null && c12334xbda92906.f165919e == null) {
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f1(r1Var));
                } else if (c11813xf952a195 != null) {
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g1(r1Var));
                }
                if (r1Var.f166627c == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPrepareTask", "runInClientProcess, prepare done, but callback is null");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a1952 = c12334xbda92906.f165920f;
                if (c11813xf952a1952 != null) {
                    ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h1(r1Var, c11813xf952a1952.f387385r));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "runInClientProcess, config null");
                }
                try {
                    r1Var.f166627c.G(c12334xbda92906.f165920f, c12334xbda92906.f165919e, c12334xbda92906.f165921g);
                    return;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPrepareTask", th6, "runInClientProcess, prepare done exception interrupted[%b] appId[%s]", java.lang.Boolean.valueOf(r1Var.f166626b), r1Var.f166625a.f165915f.f158811d);
                    if (r1Var.f166626b) {
                        return;
                    }
                    android.app.Activity activity = (android.app.Activity) r1Var.f166629e.get();
                    if (activity != null) {
                        activity.finish();
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i1(r1Var, th6));
                    return;
                }
            case 2:
                java.lang.ref.WeakReference weakReference = r1Var.f166629e;
                android.app.Activity activity2 = weakReference == null ? null : (android.app.Activity) weakReference.get();
                if (activity2 != null) {
                    activity2.finish();
                    activity2.overridePendingTransition(0, 0);
                }
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask", "onEventResult", "(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask$PrepareResult;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask", "onEventResult", "(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask$PrepareResult;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                return;
            case 3:
                if (r1Var.f166627c != null) {
                    r1Var.f166627c.H(c12334xbda92906.f165922h);
                    return;
                }
                return;
            case 4:
                if (r1Var.f166627c != null) {
                    r1Var.f166627c.A();
                    return;
                }
                return;
            case 5:
                if (r1Var.f166627c != null) {
                    r1Var.f166627c.E(c12334xbda92906.f165924m);
                    return;
                }
                return;
            case 6:
                if (r1Var.f166627c != null) {
                    r1Var.f166627c.J();
                    return;
                }
                return;
            case 7:
                if (r1Var.f166627c != null) {
                    r1Var.f166627c.F();
                    return;
                }
                return;
            case 8:
                if (r1Var.f166627c != null) {
                    r1Var.f166627c.y();
                    return;
                }
                return;
            case 9:
                if (r1Var.f166627c != null) {
                    r1Var.f166627c.C();
                    return;
                }
                return;
            case 10:
                if (r1Var.f166627c != null) {
                    r1Var.f166627c.z(c12334xbda92906.f165925n);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void b() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f c12333xba065a6f = this.f166625a;
        objArr[0] = c12333xba065a6f == null ? null : c12333xba065a6f.f165915f.f158811d;
        objArr[1] = java.lang.Integer.valueOf(c12333xba065a6f == null ? -1 : c12333xba065a6f.f165915f.f158814g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "interrupt() appId[%s] type[%d]", objArr);
        this.f166626b = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u8 u8Var = this.f166627c;
        if (u8Var != null) {
            u8Var.mo10668x2efc64();
        }
        if (this.f166628d != null) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.c(this.f166628d);
            this.f166628d = null;
        }
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f c12333xba065a6f = this.f166625a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = c12333xba065a6f.f165917h;
        java.lang.String str = c12333xba065a6f.f165915f.f158811d;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(interfaceC11702x4ae7c33 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3);
        objArr[1] = java.lang.Integer.valueOf(interfaceC11702x4ae7c33 == null ? -1 : interfaceC11702x4ae7c33.i());
        objArr[2] = interfaceC11702x4ae7c33 == null ? "" : interfaceC11702x4ae7c33.W0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, str, java.lang.String.format(locale, "CommLibInfo: useLocal=%b,libVersionInt=%d,libVersionStr=%s", objArr));
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c12333xba065a6f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.m1.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = c12333xba065a6f.f165915f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "[applaunch] startPrepare in appbrand %s, %d", c11809xbc286be4.f158811d, java.lang.Integer.valueOf(c11809xbc286be4.f158814g));
    }
}
