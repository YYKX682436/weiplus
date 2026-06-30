package cy5;

/* loaded from: classes13.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public int f306412a = -1;

    public h() {
        r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
    
        by5.u.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c8, code lost:
    
        return 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(int r8, boolean r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy5.h.a(int, boolean, java.lang.String):int");
    }

    public abstract void b();

    public boolean c() {
        if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c == null) {
            by5.c4.c(m(), "clearPatchDownloadInfo, context is null");
            return false;
        }
        android.content.SharedPreferences d17 = by5.d4.d(m());
        if (d17 == null) {
            by5.c4.c(m(), "clearPatchDownloadInfo, sp is null");
            return false;
        }
        java.util.Map<java.lang.String, ?> all = d17.getAll();
        if (all == null || all.size() == 0) {
            return true;
        }
        android.content.SharedPreferences.Editor edit = d17.edit();
        for (java.lang.String str : all.keySet()) {
            if (str != null && str.startsWith("patchDownloadCount_")) {
                by5.c4.f(m(), "clearPatchDownloadInfo, remove key ".concat(str));
                edit.remove(str);
            }
        }
        return edit.commit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        by5.c4.c("XWalkPluginPatchConfigP", "getPluginPatchConfigList unknown flag:" + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(by5.n0 r18) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy5.h.d(by5.n0):boolean");
    }

    public int e() {
        return this.f306412a;
    }

    public int f(boolean z17) {
        if (z17) {
            r();
        }
        return this.f306412a;
    }

    public abstract java.lang.String g(int i17, boolean z17);

    public java.lang.String h(int i17) {
        java.lang.String o17 = o(i17);
        if (o17.isEmpty()) {
            by5.c4.c(m(), "getExtractDir, versionDir is empty");
            return "";
        }
        java.lang.String str = o17 + java.io.File.separator + "extracted";
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public java.lang.String i(int i17, java.lang.String str) {
        if (str == null || str.isEmpty()) {
            by5.c4.c(m(), "getExtractFile, fileName is empty");
            return "";
        }
        java.lang.String h17 = h(i17);
        if (h17.isEmpty()) {
            by5.c4.c(m(), "getExtractFile, extractDir is empty");
            return "";
        }
        return h17 + java.io.File.separator + str;
    }

    public abstract java.util.List j(int i17);

    public java.lang.String k(int i17) {
        java.lang.String o17 = o(i17);
        if (o17.isEmpty()) {
            by5.c4.c(m(), "getPatchDir, versionDir is empty");
            return "";
        }
        java.lang.String str = o17 + java.io.File.separator + "patch_temp";
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public java.lang.String l(int i17, java.lang.String str) {
        if (str == null || str.isEmpty()) {
            by5.c4.c(m(), "getPatchFile, fileName is empty");
            return "";
        }
        java.lang.String k17 = k(i17);
        if (k17.isEmpty()) {
            by5.c4.c(m(), "getPatchFile, patchDir is null");
            return "";
        }
        return k17 + java.io.File.separator + str;
    }

    public abstract java.lang.String m();

    public java.lang.String n(int i17) {
        java.lang.String o17 = o(i17);
        if (o17 == null || o17.isEmpty()) {
            by5.c4.c(m(), "getPrivateCacheDir, versionDir is empty");
            return "";
        }
        java.lang.String str = o17 + java.io.File.separator + "cache";
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public java.lang.String o(int i17) {
        if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c == null) {
            by5.c4.c(m(), "getVersionDir, context is null");
            return "";
        }
        java.lang.String l17 = by5.z3.l();
        if (l17.isEmpty()) {
            by5.c4.c(m(), "getVersionDir, pluginBaseDir is null");
            return "";
        }
        java.lang.String str = l17 + java.io.File.separator + m() + "_" + i17;
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public abstract boolean p();

    public abstract boolean q();

    public final void r() {
        if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c == null) {
            by5.c4.c(m(), "loadVer, context is null");
            return;
        }
        android.content.SharedPreferences d17 = by5.d4.d(m());
        if (d17 == null) {
            by5.c4.c(m(), "loadVer, sp is null");
            return;
        }
        int i17 = this.f306412a;
        int i18 = d17.getInt("availableVersion", -1);
        this.f306412a = i18;
        if (i18 != i17) {
            if (i17 == -1) {
                by5.c4.f(m(), "loadVer, version = " + this.f306412a);
                return;
            }
            by5.c4.f(m(), "loadVer, old version = " + i17 + ", new version = " + this.f306412a);
        }
    }

    public abstract int s(by5.n0 n0Var);

    public void t(int i17, int i18, int i19, int i27) {
        if (i17 <= 0) {
            by5.c4.c(m(), "reportUsingVersion, reportVersion invalid");
            return;
        }
        android.content.SharedPreferences d17 = by5.d4.d(m());
        if (d17 == null) {
            by5.c4.c(m(), "reportUsingVersion, sp is null");
            return;
        }
        int i28 = d17.getInt("lastReportVersion", -1);
        java.lang.String string = d17.getString("lastReportDate", "");
        try {
            java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
            if (i28 == i17 && string.equals(format)) {
                return;
            }
            int i29 = i19 + (i17 % (i27 - i19));
            by5.c4.b(m(), "reportUsingVersion, id:" + i18 + ", key:" + i29);
            by5.s0.e((long) i18, (long) i29, 1L);
            android.content.SharedPreferences.Editor edit = d17.edit();
            if (edit == null) {
                by5.c4.c(m(), "reportUsingVersion, editor is null");
                return;
            }
            edit.putInt("lastReportVersion", i17);
            edit.putString("lastReportDate", format);
            edit.commit();
        } catch (java.lang.Throwable th6) {
            by5.c4.c(m(), "reportUsingVersion, get cur date error: " + th6);
        }
    }

    public boolean u(int i17, boolean z17) {
        if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c == null) {
            by5.c4.c(m(), "setVer, context is null");
            return false;
        }
        android.content.SharedPreferences d17 = by5.d4.d(m());
        if (d17 == null) {
            by5.c4.c(m(), "setVer, sp is null");
            return false;
        }
        android.content.SharedPreferences.Editor edit = d17.edit();
        edit.putInt("availableVersion", i17);
        boolean commit = edit.commit();
        if (commit && z17) {
            this.f306412a = i17;
        }
        by5.c4.f(m(), "setVer, version = " + i17 + ", isNow = " + z17 + ", ret = " + commit);
        return commit;
    }
}
