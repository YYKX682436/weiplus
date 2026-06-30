package kh;

/* loaded from: classes12.dex */
public final class k1 extends kh.d {

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f389371n = ((java.lang.Boolean) kh.p2.f389419b.mo141623x754a37bb()).booleanValue();

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f389372l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f389373m;

    public k1() {
        jz5.i iVar = jz5.i.f384362d;
        this.f389372l = jz5.h.a(iVar, kh.j1.f389367d);
        jz5.h.a(iVar, new kh.h1(this));
        this.f389373m = jz5.h.a(iVar, new kh.i1(this));
    }

    public static final void y(kh.k1 k1Var, kh.g1 g1Var) {
        java.util.Map map = (java.util.Map) ((java.lang.ThreadLocal) k1Var.f389372l.mo141623x754a37bb()).get();
        kh.g1 g1Var2 = map != null ? (kh.g1) map.remove(java.lang.Integer.valueOf(g1Var.f389345e)) : null;
        if (g1Var2 != null) {
            k1Var.w(g1Var2.a(), g1Var2.f389345e);
        }
    }

    public static final void z(kh.k1 k1Var, kh.g1 g1Var) {
        java.lang.ThreadLocal threadLocal = (java.lang.ThreadLocal) k1Var.f389372l.mo141623x754a37bb();
        java.lang.Object obj = threadLocal.get();
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            threadLocal.set(obj);
        }
        ((java.util.Map) obj).put(java.lang.Integer.valueOf(g1Var.f389345e), g1Var);
        k1Var.x(g1Var.a(), g1Var.f389345e);
    }

    public final boolean A() {
        java.util.List list = this.f476827a.f444868d.f444837w;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        if (list.size() != 1) {
            return false;
        }
        java.lang.String lowerCase = ((java.lang.String) list.get(0)).toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18);
    }

    public final boolean B() {
        java.util.Collection collection = this.f476827a.f444868d.f444837w;
        if (collection == null) {
            collection = kz5.p0.f395529d;
        }
        if (!collection.isEmpty()) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                java.lang.String lowerCase = ((java.lang.String) it.next()).toLowerCase(java.util.Locale.ROOT);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
    }

    @Override // rh.e3
    public int b() {
        return 0;
    }

    @Override // kh.d, rh.g, rh.a, rh.e3
    public void c() {
        java.lang.Class<?> cls;
        java.lang.String message;
        boolean z17 = f389371n;
        super.c();
        if (!pj.a.f436434a) {
            try {
                pj.a.f436434a = true;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ArtReflectExemptions", th6, "unseal failed", new java.lang.Object[0]);
            }
        }
        kh.a1 a1Var = (kh.a1) this.f389373m.mo141623x754a37bb();
        a1Var.getClass();
        try {
            java.lang.Object a17 = a1Var.a();
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.os.Looper$Observer");
            pj.d.f436435a.a(android.os.Looper.class, "setObserver", new java.lang.Class[]{cls2}).invoke(null, java.lang.reflect.Proxy.newProxyInstance(cls2.getClassLoader(), new java.lang.Class[]{cls2}, new kh.z0(a17, a1Var.f389279a, cls2)));
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.LooperTaskMonitorFeatureKt", th7, "hook Looper.Observer failed", new java.lang.Object[0]);
            if (z17) {
                ap.a.a(1, "errHookLooper", th7, null, "setObserver", th7.getMessage());
            }
        }
        if (!pj.a.f436434a) {
            try {
                pj.a.f436434a = true;
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ArtReflectExemptions", th8, "unseal failed", new java.lang.Object[0]);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f476827a.d(), "getContext(...)");
        kh.p2 p2Var = kh.p2.f389418a;
        p2Var.a(kh.b0.f389289f);
        kh.k4 k4Var = kh.k4.f389377a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f476827a.d(), "getContext(...)");
        p2Var.a(kh.t3.f389455f);
        try {
            cls = java.lang.Class.forName("android.view.ViewTreeObserver$CopyOnWriteArray");
        } catch (java.lang.Throwable th9) {
            th = th9;
            cls = null;
        }
        try {
            try {
                java.lang.reflect.Field declaredField = java.lang.Class.class.getDeclaredField("accessFlags");
                declaredField.setAccessible(true);
                declaredField.setInt(cls, (declaredField.getInt(cls) & (-3)) | 1);
                java.lang.String.valueOf(declaredField.getInt(cls));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.MatrixReportUtils", e17, "modifyAndGetClassAccessFlags failed", new java.lang.Object[0]);
                e17.getMessage();
            }
            kh.k4.f389378b = cls;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(new kh.c4());
        } catch (java.lang.Throwable th10) {
            th = th10;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.TraversalTracker", th, "buildErr: " + th.getMessage(), new java.lang.Object[0]);
            if (z17) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                if (cls != null) {
                    try {
                        java.lang.reflect.Field declaredField2 = java.lang.Class.class.getDeclaredField("accessFlags");
                        declaredField2.setAccessible(true);
                        declaredField2.setInt(cls, (declaredField2.getInt(cls) & (-3)) | 1);
                        message = java.lang.String.valueOf(declaredField2.getInt(cls));
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.MatrixReportUtils", e18, "modifyAndGetClassAccessFlags failed", new java.lang.Object[0]);
                        message = e18.getMessage();
                        if (message == null) {
                            message = e18.getClass().getName();
                        }
                    }
                    linkedHashMap.put("accessFlags", message);
                }
                ap.a.a(1, "errTrackTraversal", th, linkedHashMap, "build");
            }
            kh.t tVar = kh.t.f389443a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f476827a.d(), "getContext(...)");
            kh.p2.f389418a.a(kh.g.f389335f);
            tVar.a(null);
        }
        kh.t tVar2 = kh.t.f389443a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f476827a.d(), "getContext(...)");
        kh.p2.f389418a.a(kh.g.f389335f);
        tVar2.a(null);
    }

    @Override // rh.g, rh.a, rh.e3
    public void e() {
        super.e();
    }

    @Override // rh.g, rh.a
    public java.lang.String i() {
        return "Matrix.battery.LooperTaskMonitorFeatureKt";
    }

    @Override // kh.d, rh.g
    public boolean t(rh.o2 delta) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delta, "delta");
        super.t(delta);
        return delta.f477020d > 10;
    }
}
