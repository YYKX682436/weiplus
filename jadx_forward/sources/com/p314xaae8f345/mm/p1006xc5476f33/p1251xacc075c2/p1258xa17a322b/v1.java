package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1 f174447a = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f174448b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f174449c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f174450d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f174451e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f174452f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f174453g;

    static {
        jz5.g b17 = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.t1.f174269d);
        f174448b = b17;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6((com.p314xaae8f345.mm.vfs.r6) ((jz5.n) b17).mo141623x754a37bb(), "sdk");
        f174449c = r6Var;
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, "download");
        f174450d = r6Var2;
        f174451e = new com.p314xaae8f345.mm.vfs.r6(r6Var, "upload");
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var2, "chat_package").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        f174452f = o17;
        java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(r6Var, "roam_backupper.db").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
        f174453g = o18;
    }

    public final boolean a(android.content.Context context, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).n0()) {
            return true;
        }
        c01.w9.a();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a7f));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.s1(callback));
        u1Var.q(false);
        return false;
    }

    public final void b(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        ot5.g.c("RoamBackupUtil", "Try to delete cache dir, path=" + r6Var.o());
        if (r6Var.m()) {
            long nanoTime = java.lang.System.nanoTime();
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6((com.p314xaae8f345.mm.vfs.r6) ((jz5.n) f174448b).mo141623x754a37bb(), "temp_dir");
            com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(r6Var2, java.lang.String.valueOf(nanoTime));
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2 l2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174177a;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174178b) {
                synchronized (qo1.f0.f447007v) {
                    if (qo1.j1.f447056a.b(qo1.f1.f447029d) > 0) {
                        ot5.g.c("RoamBackupUtil", "Task is running, skip deleting cache.");
                    } else if (r6Var.m() && !com.p314xaae8f345.mm.vfs.w6.v(r6Var.o(), r6Var3.o())) {
                        ot5.g.a("RoamBackupUtil", "Fail to rename dir from " + r6Var + " to " + r6Var3);
                    }
                }
            } else if (r6Var.m() && !com.p314xaae8f345.mm.vfs.w6.v(r6Var.o(), r6Var3.o())) {
                ot5.g.a("RoamBackupUtil", "Fail to rename dir from " + r6Var + " to " + r6Var3);
            }
            com.p314xaae8f345.mm.vfs.r6[] G = r6Var2.G();
            if (G != null) {
                for (com.p314xaae8f345.mm.vfs.r6 r6Var4 : G) {
                    ot5.g.c("RoamBackupUtil", "delete temp file=" + r6Var4.o() + ", ret=" + (r6Var4.y() ? com.p314xaae8f345.mm.vfs.w6.g(r6Var4.o(), true) : r6Var4.l()) + '.');
                }
            }
        }
    }

    public final int c() {
        boolean m40092xb9aa8b5f;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474792f) {
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
        } else if (r75.d.f474790d == -100) {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
            r75.d.f474790d = m40067xab9ed241;
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(r75.d.f474790d);
        }
        if (m40092xb9aa8b5f) {
            return 2;
        }
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40085xe877826c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 1 : 0;
    }

    public final java.lang.Object d(java.lang.Object obj) {
        java.lang.String name;
        if (obj == null) {
            return org.json.JSONObject.NULL;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, org.json.JSONObject.NULL)) {
            return obj;
        }
        try {
            if (!(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.Double) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.String)) {
                java.lang.Package r07 = obj.getClass().getPackage();
                boolean z17 = false;
                if (r07 != null && (name = r07.getName()) != null && r26.i0.y(name, "java.", false)) {
                    z17 = true;
                }
                if (z17) {
                    return obj.toString();
                }
                return null;
            }
            return obj;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
