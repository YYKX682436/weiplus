package uv4;

/* loaded from: classes8.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(java.lang.String targetFolderPath) {
        java.io.InputStream D;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetFolderPath, "targetFolderPath");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(targetFolderPath);
        com.p314xaae8f345.mm.vfs.z7 z7Var = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a17.f294812f + "/config.conf", false, false), a17.f294813g, a17.f294814h);
        java.util.Properties properties = new java.util.Properties();
        try {
            D = com.p314xaae8f345.mm.vfs.w6.D(z7Var, com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "getFolderVersion %s", targetFolderPath);
        }
        try {
            properties.load(D);
            vz5.b.a(D, null);
            try {
                java.lang.String property = properties.getProperty("version", "1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(property, "getProperty(...)");
                return java.lang.Integer.parseInt(property);
            } catch (java.lang.Exception unused) {
                return 1;
            }
        } finally {
        }
    }

    public final java.util.Properties b(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.util.Properties properties = new java.util.Properties();
        if (r6Var != null && r6Var.A()) {
            try {
                java.io.InputStream C = com.p314xaae8f345.mm.vfs.w6.C(r6Var);
                try {
                    properties.load(C);
                    vz5.b.a(C, null);
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
            }
        }
        return properties;
    }

    public final int c(java.lang.String templatePath, java.lang.String zipFilePath, int i17, yz5.l lVar) {
        int i18;
        boolean d17;
        int parseInt;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templatePath, "templatePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zipFilePath, "zipFilePath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir(), "temp/".concat(templatePath));
        if (r6Var.m()) {
            com.p314xaae8f345.mm.vfs.w6.f(r6Var.o());
        }
        r6Var.J();
        try {
            i18 = com.p314xaae8f345.mm.p930xc01b152a.C11080x4adeb616.m47708xb232dc81(com.p314xaae8f345.mm.vfs.w6.i(zipFilePath, false), com.p314xaae8f345.mm.vfs.w6.i(r6Var.o(), true));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "SevenZipUtil unzip error", new java.lang.Object[0]);
            i18 = -1;
        }
        if (i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.BaseWebSearchTemplate", "unzip fail, ret = " + i18 + ", zipFilePath = " + zipFilePath + ", unzipPath = " + r6Var.o());
            return 1;
        }
        if (lVar != null) {
            java.lang.String o17 = r6Var.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            d17 = ((java.lang.Boolean) lVar.mo146xb9724478(o17)).booleanValue();
        } else {
            java.lang.String o18 = r6Var.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
            d17 = d(o18, i17);
        }
        if (!d17) {
            return 1;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l("config.conf", false, true);
        com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var.f294699d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str = z7Var.f294812f;
            z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str + '/' + l17, z7Var.f294813g, z7Var.f294814h);
        }
        java.util.Properties properties = new java.util.Properties();
        try {
            java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(z7Var, com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null));
            try {
                properties.load(D);
                vz5.b.a(D, null);
            } finally {
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchTemplate", e18, "getZipFileVersion %s", zipFilePath);
        }
        try {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(properties.getProperty("debug", "0"), "1")) {
                parseInt = Integer.MAX_VALUE;
            } else {
                java.lang.String property = properties.getProperty("version", "1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(property, "getProperty(...)");
                parseInt = java.lang.Integer.parseInt(property);
            }
            return parseInt;
        } catch (java.lang.Exception unused) {
            return 1;
        }
    }

    public final boolean d(java.lang.String targetFolderPath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetFolderPath, "targetFolderPath");
        java.util.Properties b17 = b(new com.p314xaae8f345.mm.vfs.r6(targetFolderPath, "config.conf"));
        if (i17 != 0) {
            if (i17 == 1 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17.getProperty("business"), "recommend")) {
                return false;
            }
        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17.getProperty("business"), "websearch")) {
            return false;
        }
        java.lang.String property = b17.getProperty("md5map");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(property)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(property);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(targetFolderPath, next);
                if (!r6Var.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.BaseWebSearchTemplate", "isMd5Valid fail, file not exist %s", r6Var.o());
                    return false;
                }
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.o());
                java.lang.String string = jSONObject.getString(next);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p17, string)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.BaseWebSearchTemplate", "isMd5Valid fail, fileName %s, fileMd5 %s, expect md5 %s", next, p17, string);
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final void e(long j17, long j18, long j19, boolean z17) {
        if (j17 > 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
        }
    }
}
