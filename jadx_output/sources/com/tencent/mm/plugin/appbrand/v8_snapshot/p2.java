package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.p2 f90799a = new com.tencent.mm.plugin.appbrand.v8_snapshot.p2();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.vfs.r6 f90800b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f90801c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.vfs.r6 f90802d;

    static {
        f90801c = wo.w0.q() ? "arm64-v8a" : "armeabi-v7a";
    }

    public final boolean a(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(snapshotInfo.f90669i);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotManager", "deleteSnapshotFile, snapshot: " + r6Var);
        return r6Var.l();
    }

    public final com.tencent.mm.vfs.r6 b(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        com.tencent.mm.vfs.r6 r6Var = f90802d;
        if (r6Var == null) {
            com.tencent.mm.vfs.r6 c17 = c();
            if (c17 != null) {
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(c17, f90801c);
                if (!r6Var2.m()) {
                    com.tencent.mm.vfs.w6.u(r6Var2.o());
                }
                r6Var = r6Var2;
            } else {
                r6Var = null;
            }
            f90802d = r6Var;
        }
        if (r6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibV8SnapshotManager", "getOrCreateSnapshotDir, curArchSnapshotParentDir is null");
            return null;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(snapshotInfo.f90666f);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str2 = a17.f213279f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        kotlin.jvm.internal.o.f(str2, "getName(...)");
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(r6Var, str2);
        if (!r6Var3.m()) {
            com.tencent.mm.vfs.w6.u(r6Var3.o());
        }
        com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(r6Var3, snapshotInfo.f90668h.name());
        if (!r6Var4.m()) {
            com.tencent.mm.vfs.w6.u(r6Var4.o());
        }
        r6Var4.toString();
        return r6Var4;
    }

    public final com.tencent.mm.vfs.r6 c() {
        com.tencent.mm.vfs.r6 r6Var = f90800b;
        if (r6Var != null) {
            return r6Var;
        }
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) uk0.a.d(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.v8_snapshot.o2.f90796a);
        com.tencent.mm.vfs.r6 r6Var2 = null;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        if (str != null) {
            r6Var2 = new com.tencent.mm.vfs.r6(str, com.tencent.mm.plugin.appbrand.j0.f78445f);
            if (!r6Var2.m()) {
                com.tencent.mm.vfs.w6.u(r6Var2.o());
            }
        }
        com.tencent.mm.vfs.r6 r6Var3 = r6Var2;
        f90800b = r6Var3;
        return r6Var3;
    }
}
