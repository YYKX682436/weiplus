package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.v1 f92914a = new com.tencent.mm.plugin.backup.roambackup.v1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f92915b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f92916c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f92917d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f92918e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f92919f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f92920g;

    static {
        jz5.g b17 = jz5.h.b(com.tencent.mm.plugin.backup.roambackup.t1.f92736d);
        f92915b = b17;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6((com.tencent.mm.vfs.r6) ((jz5.n) b17).getValue(), "sdk");
        f92916c = r6Var;
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, "download");
        f92917d = r6Var2;
        f92918e = new com.tencent.mm.vfs.r6(r6Var, "upload");
        java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var2, "chat_package").o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        f92919f = o17;
        java.lang.String o18 = new com.tencent.mm.vfs.r6(r6Var, "roam_backupper.db").o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        f92920g = o18;
    }

    public final boolean a(android.content.Context context, yz5.a callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).n0()) {
            return true;
        }
        c01.w9.a();
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getString(com.tencent.mm.R.string.a7f));
        u1Var.l(new com.tencent.mm.plugin.backup.roambackup.s1(callback));
        u1Var.q(false);
        return false;
    }

    public final void b(com.tencent.mm.vfs.r6 r6Var) {
        ot5.g.c("RoamBackupUtil", "Try to delete cache dir, path=" + r6Var.o());
        if (r6Var.m()) {
            long nanoTime = java.lang.System.nanoTime();
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6((com.tencent.mm.vfs.r6) ((jz5.n) f92915b).getValue(), "temp_dir");
            com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(r6Var2, java.lang.String.valueOf(nanoTime));
            com.tencent.mm.plugin.backup.roambackup.l2 l2Var = com.tencent.mm.plugin.backup.roambackup.l2.f92644a;
            if (com.tencent.mm.plugin.backup.roambackup.l2.f92645b) {
                synchronized (qo1.f0.f365474v) {
                    if (qo1.j1.f365523a.b(qo1.f1.f365496d) > 0) {
                        ot5.g.c("RoamBackupUtil", "Task is running, skip deleting cache.");
                    } else if (r6Var.m() && !com.tencent.mm.vfs.w6.v(r6Var.o(), r6Var3.o())) {
                        ot5.g.a("RoamBackupUtil", "Fail to rename dir from " + r6Var + " to " + r6Var3);
                    }
                }
            } else if (r6Var.m() && !com.tencent.mm.vfs.w6.v(r6Var.o(), r6Var3.o())) {
                ot5.g.a("RoamBackupUtil", "Fail to rename dir from " + r6Var + " to " + r6Var3);
            }
            com.tencent.mm.vfs.r6[] G = r6Var2.G();
            if (G != null) {
                for (com.tencent.mm.vfs.r6 r6Var4 : G) {
                    ot5.g.c("RoamBackupUtil", "delete temp file=" + r6Var4.o() + ", ret=" + (r6Var4.y() ? com.tencent.mm.vfs.w6.g(r6Var4.o(), true) : r6Var4.l()) + '.');
                }
            }
        }
    }

    public final int c() {
        boolean isWifi;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        if (isWifi) {
            return 2;
        }
        return com.tencent.mars.comm.NetStatusUtil.isMobile(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1 : 0;
    }

    public final java.lang.Object d(java.lang.Object obj) {
        java.lang.String name;
        if (obj == null) {
            return org.json.JSONObject.NULL;
        }
        if (kotlin.jvm.internal.o.b(obj, org.json.JSONObject.NULL)) {
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
