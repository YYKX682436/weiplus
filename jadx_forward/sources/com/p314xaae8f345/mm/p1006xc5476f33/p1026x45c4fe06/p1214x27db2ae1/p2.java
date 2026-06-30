package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.p2 f172332a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.p2();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.vfs.r6 f172333b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f172334c;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.vfs.r6 f172335d;

    static {
        f172334c = wo.w0.q() ? "arm64-v8a" : "armeabi-v7a";
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 snapshotInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotInfo, "snapshotInfo");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(snapshotInfo.f172202i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotManager", "deleteSnapshotFile, snapshot: " + r6Var);
        return r6Var.l();
    }

    public final com.p314xaae8f345.mm.vfs.r6 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 snapshotInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotInfo, "snapshotInfo");
        com.p314xaae8f345.mm.vfs.r6 r6Var = f172335d;
        if (r6Var == null) {
            com.p314xaae8f345.mm.vfs.r6 c17 = c();
            if (c17 != null) {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(c17, f172334c);
                if (!r6Var2.m()) {
                    com.p314xaae8f345.mm.vfs.w6.u(r6Var2.o());
                }
                r6Var = r6Var2;
            } else {
                r6Var = null;
            }
            f172335d = r6Var;
        }
        if (r6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibV8SnapshotManager", "getOrCreateSnapshotDir, curArchSnapshotParentDir is null");
            return null;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(snapshotInfo.f172199f);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str2 = a17.f294812f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getName(...)");
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(r6Var, str2);
        if (!r6Var3.m()) {
            com.p314xaae8f345.mm.vfs.w6.u(r6Var3.o());
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(r6Var3, snapshotInfo.f172201h.name());
        if (!r6Var4.m()) {
            com.p314xaae8f345.mm.vfs.w6.u(r6Var4.o());
        }
        r6Var4.m82469x9616526c();
        return r6Var4;
    }

    public final com.p314xaae8f345.mm.vfs.r6 c() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = f172333b;
        if (r6Var != null) {
            return r6Var;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) uk0.a.d(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.o2.f172329a);
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = null;
        java.lang.String str = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
        if (str != null) {
            r6Var2 = new com.p314xaae8f345.mm.vfs.r6(str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f);
            if (!r6Var2.m()) {
                com.p314xaae8f345.mm.vfs.w6.u(r6Var2.o());
            }
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = r6Var2;
        f172333b = r6Var3;
        return r6Var3;
    }
}
