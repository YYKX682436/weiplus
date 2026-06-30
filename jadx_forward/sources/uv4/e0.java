package uv4;

/* loaded from: classes8.dex */
public final class e0 extends uv4.b {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f512961h;

    /* renamed from: i, reason: collision with root package name */
    public int f512962i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i17, java.lang.String templatePath, java.lang.String zipFileName, java.lang.String assetDir, long j17) {
        super(i17, templatePath, zipFileName, assetDir, j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templatePath, "templatePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zipFileName, "zipFileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetDir, "assetDir");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "Init WebSearchVersionTemplate templatePath:" + templatePath + " zipFileName:" + zipFileName + " assetDir:" + assetDir);
        this.f512961h = new java.util.HashMap();
        this.f512962i = 1;
    }

    @Override // uv4.b, uv4.g
    public void a(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        uv4.a aVar = uv4.b.f512949g;
        aVar.e(this.f512954e, 0L, 1L, false);
        java.lang.String str = this.f512951b;
        int i17 = this.f512950a;
        int c17 = aVar.c(str, filePath, i17, null);
        int b17 = b();
        if (c17 == 1) {
            aVar.e(this.f512954e, 1L, 1L, false);
        } else {
            aVar.e(this.f512954e, 2L, 1L, false);
        }
        java.lang.String t17 = t(c17);
        if (c17 <= b17) {
            aVar.e(this.f512954e, 3L, 1L, false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate update template currentVersion %d zipFileVersion %d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(c17));
        aVar.e(this.f512954e, 4L, 1L, false);
        for (int i18 = 0; i18 < 3; i18++) {
            s(filePath, t17);
            if (aVar.d(t17, i17)) {
                break;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate invalid md5 and delete template folder retryTimes:%s", java.lang.Integer.valueOf(i18));
        }
        if (aVar.d(t17, i17)) {
            aVar.e(this.f512954e, 6L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate final update success version %d", java.lang.Integer.valueOf(c17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate final md5 is invalid! deleteResult:" + com.p314xaae8f345.mm.vfs.w6.g(t17, true));
            aVar.e(this.f512954e, 5L, 1L, false);
        }
        k();
    }

    @Override // uv4.g
    public int b() {
        if (this.f512962i == 1) {
            k();
        }
        return this.f512962i;
    }

    @Override // uv4.g
    public java.lang.String c() {
        return l().concat("/app.html");
    }

    @Override // uv4.b, uv4.g
    public void d(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        uv4.a aVar = uv4.b.f512949g;
        java.lang.String str = this.f512951b;
        int i17 = this.f512950a;
        int c17 = aVar.c(str, filePath, i17, null);
        if (c17 == 1 || !com.p314xaae8f345.mm.vfs.w6.g(new com.p314xaae8f345.mm.vfs.r6(n(), str).o(), true)) {
            return;
        }
        java.lang.String t17 = t(c17);
        s(filePath, t17);
        if (!aVar.d(t17, i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateLocalTemplate final md5 is invalid! deleteResult:" + com.p314xaae8f345.mm.vfs.w6.g(t17, true));
        }
        k();
    }

    @Override // uv4.g
    public java.lang.String e() {
        java.lang.String str = this.f512953d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "config.conf";
        }
        return str + "/config.conf";
    }

    @Override // uv4.g
    public java.util.HashMap f() {
        int b17 = b();
        java.util.HashMap hashMap = this.f512961h;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(b17);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.HashMap();
            hashMap.put(valueOf, obj);
        }
        java.util.HashMap hashMap2 = (java.util.HashMap) obj;
        if (hashMap2.isEmpty()) {
            try {
                com.p314xaae8f345.mm.vfs.r6 p17 = p();
                java.util.Properties properties = new java.util.Properties();
                if (p17.A()) {
                    try {
                        java.io.InputStream C = com.p314xaae8f345.mm.vfs.w6.C(p17);
                        try {
                            properties.load(C);
                            vz5.b.a(C, null);
                        } finally {
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
                    }
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(properties.getProperty("md5map"));
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (next != null && r26.i0.n(next, ".js", false)) {
                        java.lang.String str = l() + '/' + next;
                        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                            java.lang.String optString = jSONObject.optString(next, "");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                            hashMap2.put(str, optString);
                        }
                    }
                }
                hashMap.put(java.lang.Integer.valueOf(b17), hashMap2);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchVersionTemplate", e18, "", new java.lang.Object[0]);
            }
        }
        return hashMap2;
    }

    @Override // uv4.b, uv4.g
    public void g() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(n(), this.f512951b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6Var2.m82467xfb82e301(), ".nomedia")) {
                    arrayList.add(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r6Var2.m82467xfb82e301(), 0)), r6Var2.m82467xfb82e301()));
                }
            }
        }
        kz5.g0.t(arrayList, uv4.d0.f512960d);
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            jz5.l lVar = (jz5.l) obj;
            if (i17 >= 1 || ((java.lang.Number) lVar.f384366d).intValue() == 0) {
                com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(r6Var, (java.lang.String) lVar.f384367e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "delete lower version:" + r6Var3.o() + " deleteResult:" + (r6Var3.y() ? com.p314xaae8f345.mm.vfs.w6.g(r6Var3.o(), true) : com.p314xaae8f345.mm.vfs.w6.h(r6Var3.o())));
            }
            i17 = i18;
        }
        int m17 = m();
        int b17 = b();
        boolean z17 = b17 < m17;
        int i19 = this.f512950a;
        uv4.a aVar = uv4.b.f512949g;
        if (!z17 && !aVar.d(l(), i19)) {
            com.p314xaae8f345.mm.vfs.w6.f(r6Var.o());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "current template invalid needInitTemplate");
            z17 = true;
        }
        if (z17) {
            java.lang.String t17 = t(m17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "checkOrInitTemplate update template currentVersion %d assetVersion %d targetFolderPath %s", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(m17), t17);
            for (int i27 = 0; i27 < 3; i27++) {
                r(t17);
                if (aVar.d(t17, i19)) {
                    break;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "checkOrInitTemplate invalid md5 and delete template folder retryTimes:%s", java.lang.Integer.valueOf(i27));
            }
            if (!aVar.d(t17, i19)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchVersionTemplate", "checkOrInitTemplate final md5 is invalid! deleteResult:" + com.p314xaae8f345.mm.vfs.w6.g(t17, true));
                aVar.e(this.f512954e, 7L, 1L, false);
            }
            k();
        }
    }

    @Override // uv4.g
    public java.lang.String h() {
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(l(), this.f512952c).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // uv4.b, uv4.g
    public java.lang.String i() {
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(n(), this.f512951b).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // uv4.g
    public java.lang.String j() {
        java.lang.String str = this.f512953d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "config.conf";
        }
        return str + '/' + this.f512952c;
    }

    @Override // uv4.g
    public void k() {
        com.p314xaae8f345.mm.vfs.r6[] G = new com.p314xaae8f345.mm.vfs.r6(n(), this.f512951b).G();
        int i17 = 0;
        if (G != null) {
            int i18 = 0;
            for (com.p314xaae8f345.mm.vfs.r6 r6Var : G) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r6Var.m82467xfb82e301(), 0);
                if (P > i18) {
                    i18 = P;
                }
            }
            i17 = i18;
        }
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "refreshCurrentH5Config maxVersion is zero");
            return;
        }
        this.f512962i = uv4.b.f512949g.a(t(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVersionTemplate", "refreshCurrentH5Config " + i17);
    }

    @Override // uv4.g
    public java.lang.String l() {
        return t(b());
    }

    @Override // uv4.b
    public void q() {
        r(t(m()));
    }

    public final java.lang.String t(int i17) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(n(), this.f512951b), java.lang.String.valueOf(i17));
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.String o17 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }
}
