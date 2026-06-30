package hx1;

/* loaded from: classes12.dex */
public abstract class b {
    public static java.lang.String a(java.lang.String str, int i17) {
        return kk.k.g((str + i17 + java.lang.System.currentTimeMillis()).getBytes());
    }

    public static com.p314xaae8f345.mm.vfs.r6 b(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(java.lang.String.format("%s%s/%d/", gm0.j1.u().d(), "chatroom_notice/", java.lang.Integer.valueOf(str.hashCode() & 255)));
        if (!r6Var.m() || !r6Var.y()) {
            r6Var.J();
        }
        return r6Var;
    }

    public static java.lang.String c(r45.gp0 gp0Var) {
        boolean z17;
        if (gp0Var == null) {
            return "";
        }
        java.lang.String str = gp0Var.T;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !gm0.j1.a()) {
            return "";
        }
        if (!g(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorLogic", "getDataPath: blocked unsafe dataId: %s", str);
            return "";
        }
        java.lang.String str2 = gp0Var.K;
        if (!g(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorLogic", "getDataPath: blocked unsafe data fmt: %s", str2);
            return "";
        }
        com.p314xaae8f345.mm.vfs.r6 b17 = b(str);
        int i17 = gp0Var.I;
        if ((i17 == 8 || i17 == 10130) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456937d)) {
            str = gp0Var.f456937d;
            if (!g(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorLogic", "getDataPath: blocked unsafe title: %s", str);
                return "";
            }
            b17 = b(gp0Var.T);
            z17 = true;
        } else {
            z17 = false;
        }
        java.lang.String str3 = gp0Var.K;
        if (str3 != null && str3.trim().length() > 0 && !z17) {
            str = str + "." + gp0Var.K;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(b17, str);
        java.lang.String o17 = r6Var.o();
        if (!f(o17, gm0.j1.u().d() + "chatroom_notice/")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorLogic", "getDataPath: blocked path traversal, dataId:%s absPath:%s", gp0Var.T, o17);
            return "";
        }
        if (r6Var.m() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.M)) {
            return o17;
        }
        java.lang.String g17 = kk.k.g((gp0Var.M + gp0Var.T).getBytes());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            return o17;
        }
        java.lang.String str4 = gp0Var.K;
        if (str4 != null && str4.trim().length() > 0) {
            g17 = g17 + "." + gp0Var.K;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(b17, g17);
        if (r6Var2.m()) {
            return r6Var2.o();
        }
        java.lang.String str5 = gp0Var.T;
        java.lang.String str6 = gp0Var.K;
        if (str6 != null && str6.trim().length() > 0) {
            str5 = str5 + "." + gp0Var.K;
        }
        return new com.p314xaae8f345.mm.vfs.r6(b17, str5).o();
    }

    public static java.lang.String d(float f17) {
        return f17 < 1024.0f ? java.lang.String.format("%.1fB", java.lang.Float.valueOf(f17)) : f17 < 1048576.0f ? java.lang.String.format("%.1fKB", java.lang.Float.valueOf(f17 / 1024.0f)) : f17 < 1.0737418E9f ? java.lang.String.format("%.1fMB", java.lang.Float.valueOf((f17 / 1024.0f) / 1024.0f)) : java.lang.String.format("%.1fGB", java.lang.Float.valueOf(((f17 / 1024.0f) / 1024.0f) / 1024.0f));
    }

    public static java.lang.String e(r45.gp0 gp0Var) {
        if (gp0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.T)) {
            return "";
        }
        java.lang.String str = gp0Var.T;
        if (!g(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorLogic", "getThumbPath: blocked unsafe dataId: %s", str);
            return "";
        }
        java.lang.String str2 = str + "_t";
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(b(str2), str2).o();
        if (f(o17, gm0.j1.u().d() + "chatroom_notice/")) {
            return o17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorLogic", "getThumbPath: blocked path traversal, dataId:%s absPath:%s", str, o17);
        return "";
    }

    public static boolean f(java.lang.String str, java.lang.String str2) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            try {
                java.lang.String canonicalPath = new java.io.File(str).getCanonicalPath();
                java.lang.String canonicalPath2 = new java.io.File(str2).getCanonicalPath();
                java.lang.String str3 = java.io.File.separator;
                if (!canonicalPath2.endsWith(str3)) {
                    canonicalPath2 = canonicalPath2 + str3;
                }
                return canonicalPath.startsWith(canonicalPath2);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EditorLogic", e17, "isPathInsideSandbox", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public static boolean g(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        return (".".equals(str) || "..".equals(str) || str.contains("..")) ? false : true;
    }
}
