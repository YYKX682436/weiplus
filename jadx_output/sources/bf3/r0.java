package bf3;

/* loaded from: classes7.dex */
public abstract class r0 {
    public static final boolean a(java.lang.String dumpFileName, java.lang.String content) {
        com.tencent.mm.vfs.a7 a7Var;
        kotlin.jvm.internal.o.g(dumpFileName, "dumpFileName");
        kotlin.jvm.internal.o.g(content, "content");
        if (!fp.i.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBaseUtil", "dumpToFile error, SDCard is unavailable.");
            return false;
        }
        com.tencent.mm.vfs.a7 a7Var2 = null;
        try {
            try {
                java.lang.String str = lp0.b.D() + "appbrand/trace/";
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
                if (!r6Var.m()) {
                    r6Var.J();
                    com.tencent.mm.vfs.w6.t(str);
                }
                a7Var = new com.tencent.mm.vfs.a7(new com.tencent.mm.vfs.r6(r6Var, dumpFileName), false);
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            a7Var.write(content);
            try {
                a7Var.close();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicBaseUtil", "close file error: " + e18);
            }
            return true;
        } catch (java.lang.Exception e19) {
            a7Var2 = a7Var;
            e = e19;
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBaseUtil", "dump file error: " + e);
            if (a7Var2 == null) {
                return false;
            }
            try {
                a7Var2.close();
                return false;
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicBaseUtil", "close file error: " + e27);
                return false;
            }
        } catch (java.lang.Throwable th7) {
            a7Var2 = a7Var;
            th = th7;
            if (a7Var2 != null) {
                try {
                    a7Var2.close();
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MagicBaseUtil", "close file error: " + e28);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5 A[Catch: all -> 0x0232, TryCatch #0 {, blocks: (B:4:0x001d, B:8:0x003e, B:12:0x0047, B:16:0x0064, B:17:0x0143, B:19:0x0155, B:21:0x016a, B:22:0x0170, B:24:0x01b5, B:27:0x01dd, B:28:0x0205, B:30:0x0215, B:33:0x0208, B:34:0x009a, B:36:0x00a2, B:38:0x00af, B:39:0x00d6, B:42:0x00ee, B:48:0x0138, B:50:0x00e5), top: B:3:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized boolean b(lc3.a r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bf3.r0.b(lc3.a, java.lang.String):boolean");
    }

    public static final java.lang.String c(lc3.a aVar, java.lang.String pkgId) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).getClass();
        kotlin.jvm.internal.o.g(pkgId, "pkgId");
        java.lang.String str = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("magicAssets"), true) + "/" + pkgId;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgPath", "getMagicAssetsPkgPath path:%s", str);
        kotlin.jvm.internal.o.f(str, "getMagicAssetsPkgPath(...)");
        sb6.append(str);
        sb6.append(java.io.File.separator);
        return sb6.toString();
    }

    public static final java.lang.String d(lc3.a aVar, java.lang.String bizName) {
        kotlin.jvm.internal.o.g(aVar, "<this>");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        return c(aVar, bizName) + bizName + '@' + aVar.f317880c;
    }

    public static final java.lang.String e(com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(u1Var, "<this>");
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = u1Var.readFile(str, b0Var);
        kotlin.jvm.internal.o.f(readFile, "readFile(...)");
        if (readFile != com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBaseUtil", "no file found");
            return "";
        }
        byte[] a17 = ik1.f.a((java.nio.ByteBuffer) b0Var.f291824a);
        kotlin.jvm.internal.o.f(a17, "arrayOfByteBuffer(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
        return new java.lang.String(a17, UTF_8);
    }
}
