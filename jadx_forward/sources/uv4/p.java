package uv4;

/* loaded from: classes8.dex */
public final class p extends uv4.b {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f512977h;

    /* renamed from: i, reason: collision with root package name */
    public int f512978i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f512979j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i17, java.lang.String templatePath, java.lang.String zipFileName, java.lang.String assetDir, long j17) {
        super(i17, templatePath, zipFileName, assetDir, j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templatePath, "templatePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zipFileName, "zipFileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetDir, "assetDir");
        this.f512977h = new java.util.HashMap();
        this.f512978i = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "Init WebSearchTemplateByUDR templatePath:" + templatePath + " zipFileName:" + zipFileName + " assetDir:" + assetDir);
        this.f512955f = "_udr";
    }

    @Override // uv4.b, uv4.g
    public void a(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        int b17 = uv4.x.f512991a.b();
        if (b17 != 1) {
            if (b17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByCheckResUpdate: level 2, checkResUpdate is disabled");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByCheckResUpdate: unexpected level=" + b17 + ", fallback to default");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByCheckResUpdate: level 1, use normal directory (without _udr suffix)");
        uv4.a aVar = uv4.b.f512949g;
        aVar.e(this.f512954e, 0L, 1L, false);
        int c17 = aVar.c(this.f512951b, filePath, this.f512950a, null);
        new vu4.i(vu4.h.f521860e, vu4.j.f521872f, ya.b.f77504xbb80cbe3, b17, c17, this.f512950a).a();
        if (y(filePath, c17, true, "", b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByCheckResUpdate: level 1 update success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByCheckResUpdate: level 1 update failed");
        }
    }

    @Override // uv4.g
    public int b() {
        if (this.f512978i == 1) {
            x(uv4.x.f512991a.b());
        }
        return this.f512978i;
    }

    @Override // uv4.g
    public java.lang.String c() {
        return l().concat("/app.html");
    }

    @Override // uv4.b, uv4.g
    public void d(java.lang.String filePath) {
        java.lang.String str;
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        int b17 = uv4.x.f512991a.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: start, expLevel=" + b17 + ", filePath=" + filePath);
        if (b17 != 1) {
            str = "_udr";
            if (b17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: unexpected expLevel=" + b17 + ", fallback to UDR");
                lVar = new uv4.n(this);
            } else {
                lVar = new uv4.m(this);
            }
        } else {
            str = "";
            lVar = null;
        }
        uv4.a aVar = uv4.b.f512949g;
        java.lang.String str2 = this.f512951b;
        int i17 = this.f512950a;
        int c17 = aVar.c(str2, filePath, i17, lVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: zipFileVersion=" + c17 + ", dirType=" + str);
        if (c17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: invalid zip file version, abort");
            return;
        }
        boolean g17 = com.p314xaae8f345.mm.vfs.w6.g(new com.p314xaae8f345.mm.vfs.r6(n(), str2 + str).o(), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLocalTemplate: delete old directory, result=");
        sb6.append(g17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", sb6.toString());
        if (!g17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: failed to delete old directory");
            return;
        }
        java.lang.String u17 = u(c17, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: target folder: ".concat(u17));
        s(filePath, u17);
        if (lVar != null ? ((java.lang.Boolean) lVar.mo146xb9724478(u17)).booleanValue() : aVar.d(u17, i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: validation passed, version=" + c17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: validation failed! delete folder, result=" + com.p314xaae8f345.mm.vfs.w6.g(u17, true));
        }
        k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateLocalTemplate: finished, currentH5Version=" + b() + ", currentDirType=" + this.f512955f);
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
        java.util.HashMap hashMap = this.f512977h;
        if (hashMap.isEmpty()) {
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
                            hashMap.put(str, optString);
                        }
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchTemplateByUDR", e18, "getJsFileMap", new java.lang.Object[0]);
            }
        }
        return hashMap;
    }

    @Override // uv4.b, uv4.g
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "checkOrInitTemplate: start, clean both NORMAL and UDR directories");
        t("");
        t("_udr");
        k();
        int b17 = b();
        if (b17 != 1) {
            java.lang.String l17 = l();
            if (!w(l17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "checkOrInitTemplate: current template invalid (version=" + b17 + ", path=" + l17 + "), delete and reset");
                com.p314xaae8f345.mm.vfs.w6.f(l17);
                k();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "checkOrInitTemplate: finished, currentVersion=" + b() + ", currentDirType=" + this.f512955f);
    }

    @Override // uv4.g
    public java.lang.String h() {
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(l(), this.f512952c).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // uv4.b, uv4.g
    public java.lang.String i() {
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(n(), this.f512951b + this.f512955f).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // uv4.g
    public java.lang.String j() {
        java.lang.String str = this.f512953d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.lang.String str2 = this.f512952c;
        if (K0) {
            return str2;
        }
        return str + '/' + str2;
    }

    @Override // uv4.g
    public void k() {
        x(uv4.x.f512991a.b());
    }

    @Override // uv4.g
    public java.lang.String l() {
        int b17 = b();
        java.lang.String str = this.f512951b;
        if (b17 == 1) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(n(), str + this.f512955f);
            if (!r6Var.m()) {
                r6Var.J();
            }
            java.lang.String o17 = r6Var.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            return o17;
        }
        if (!this.f512979j) {
            return u(b17, this.f512955f);
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(n(), str + this.f512955f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getFTSTemplatePath: version " + b17 + " is in root dir, path=" + r6Var2.o());
        java.lang.String o18 = r6Var2.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
        return o18;
    }

    /* JADX WARN: Type inference failed for: r4v20, types: [boolean] */
    public final void t(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(n(), this.f512951b + str);
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): folder not exists, skip");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        uv4.a aVar = uv4.b.f512949g;
        java.lang.String o17 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        int a17 = aVar.a(o17);
        boolean z17 = true;
        if (a17 > 1) {
            arrayList.add(new uv4.l(a17, "root", true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): found version " + a17 + " in root directory");
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        int i17 = 0;
        if (G != null) {
            int length = G.length;
            int i18 = 0;
            while (i18 < length) {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = G[i18];
                if (r6Var2.y() && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6Var2.m82467xfb82e301(), ".nomedia")) {
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r6Var2.m82467xfb82e301(), i17);
                    if (P > 0) {
                        java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                        arrayList.add(new uv4.l(P, m82467xfb82e301, false));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): found version " + P + " in subdirectory " + r6Var2.m82467xfb82e301());
                    } else {
                        ?? r47 = z17;
                        if (a17 <= r47) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): delete invalid folder " + r6Var2.m82467xfb82e301() + " (no root version), result=" + com.p314xaae8f345.mm.vfs.w6.g(r6Var2.o(), r47));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): keep folder " + r6Var2.m82467xfb82e301() + " (part of root version)");
                        }
                    }
                }
                i18++;
                z17 = true;
                i17 = 0;
            }
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): no valid versions found");
            return;
        }
        kz5.g0.t(arrayList, uv4.k.f512970d);
        uv4.l lVar = (uv4.l) arrayList.get(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): found " + arrayList.size() + " version(s), max version=" + lVar.f512971a + " at " + lVar.f512972b);
        int i19 = 0;
        for (java.lang.Object obj : arrayList) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            uv4.l lVar2 = (uv4.l) obj;
            if (i19 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): keep version " + lVar2.f512971a + " at " + lVar2.f512972b);
            } else {
                boolean z18 = lVar2.f512973c;
                int i28 = lVar2.f512971a;
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): cleaning root directory version " + i28);
                    com.p314xaae8f345.mm.vfs.r6[] G2 = r6Var.G();
                    if (G2 != null) {
                        for (com.p314xaae8f345.mm.vfs.r6 r6Var3 : G2) {
                            if (!r6Var3.y()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): delete root file " + r6Var3.m82467xfb82e301() + ", result=" + com.p314xaae8f345.mm.vfs.w6.h(r6Var3.o()));
                            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r6Var3.m82467xfb82e301(), 0) == 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6Var3.m82467xfb82e301(), ".nomedia")) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): delete root folder " + r6Var3.m82467xfb82e301() + ", result=" + com.p314xaae8f345.mm.vfs.w6.g(r6Var3.o(), true));
                            }
                        }
                    }
                } else {
                    java.lang.String str2 = lVar2.f512972b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "cleanOldVersionsOnInit (dirType=" + str + "): delete old version " + i28 + " at " + str2 + ", result=" + com.p314xaae8f345.mm.vfs.w6.g(new com.p314xaae8f345.mm.vfs.r6(r6Var, str2).o(), true));
                    i19 = i27;
                }
            }
            i19 = i27;
        }
    }

    public final java.lang.String u(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(n(), this.f512951b + str), java.lang.String.valueOf(i17));
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.String o17 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public final uv4.i v(java.lang.String str) {
        boolean z17;
        java.lang.Integer num;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(n(), this.f512951b + str);
        boolean z18 = true;
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getMaxVersionWithLocation (dirType=" + str + "): folder not exists");
            return new uv4.i(1, false);
        }
        uv4.a aVar = uv4.b.f512949g;
        java.lang.String o17 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        int a17 = aVar.a(o17);
        int max = java.lang.Math.max(1, a17);
        boolean z19 = a17 > 1;
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            int length = G.length;
            int i17 = 0;
            while (i17 < length) {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = G[i17];
                if (!r6Var2.y() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6Var2.m82467xfb82e301(), ".nomedia")) {
                    z17 = z18;
                } else {
                    try {
                        java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                        num = r26.h0.h(m82467xfb82e301);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchTemplateByUDR", e17, "getMaxVersionWithLocation: parse folder name failed", new java.lang.Object[0]);
                        num = null;
                    }
                    if (num == null || num.intValue() <= 0) {
                        java.lang.String o18 = r6Var2.o();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
                        num = java.lang.Integer.valueOf(aVar.a(o18));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getMaxVersionWithLocation (dirType=" + str + "): fallback to getFolderVersion for folder '" + r6Var2.m82467xfb82e301() + "', got version=" + num);
                    }
                    if (num.intValue() > max) {
                        z17 = true;
                        if (num.intValue() != 1) {
                            max = num.intValue();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getMaxVersionWithLocation (dirType=" + str + "): found valid version " + num + " in " + r6Var2.m82467xfb82e301());
                            z19 = false;
                        }
                    } else {
                        z17 = true;
                    }
                }
                i17++;
                z18 = z17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getMaxVersionWithLocation (dirType=" + str + "): final maxVersion=" + max + ", isInRootDir=" + z19);
        return new uv4.i(max, z19);
    }

    public final boolean w(java.lang.String targetFolderPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetFolderPath, "targetFolderPath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(targetFolderPath, "config.conf");
        java.util.Properties properties = new java.util.Properties();
        if (r6Var.A()) {
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
        java.lang.String property = properties.getProperty("md5map");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(property)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "isTemplateValidForUDR: md5map is null or empty");
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(property);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(targetFolderPath, next);
                if (!r6Var2.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "isTemplateValidForUDR: file not exist: " + r6Var2.o());
                    return false;
                }
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var2.o());
                java.lang.String string = jSONObject.getString(next);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17) || !r26.i0.p(p17, string, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "isTemplateValidForUDR: md5 mismatch, file=" + next + ", actual=" + p17 + ", expected=" + string);
                    return false;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "isTemplateValidForUDR: validation passed for ".concat(targetFolderPath));
            return true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchTemplateByUDR", e18, "isTemplateValidForUDR: exception during validation", new java.lang.Object[0]);
            return false;
        }
    }

    public final void x(int i17) {
        if (i17 != 1) {
            if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: unexpected expLevel=" + i17 + ", should be 1 or 2");
                return;
            }
            uv4.i v17 = v("_udr");
            this.f512955f = "_udr";
            int i18 = v17.f512968a;
            if (i18 <= 0) {
                this.f512978i = 1;
                this.f512979j = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: level 2, no valid UDR version found, set to Default");
                return;
            }
            this.f512978i = i18;
            this.f512979j = v17.f512969b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: level 2, use UDR directory only, version=" + this.f512978i + ", isInRootDir=" + this.f512979j);
            return;
        }
        uv4.i v18 = v("");
        uv4.i v19 = v("_udr");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshCurrentH5Config: level 1, normalMaxVersion=");
        int i19 = v18.f512968a;
        sb6.append(i19);
        sb6.append(", udrMaxVersion=");
        int i27 = v19.f512968a;
        sb6.append(i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", sb6.toString());
        if (i19 <= 0 && i27 <= 0) {
            this.f512978i = 1;
            this.f512979j = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: no valid version found, set to Default");
            return;
        }
        if (i19 >= i27) {
            this.f512955f = "";
            this.f512978i = i19;
            this.f512979j = v18.f512969b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: use normal directory (higher version), version=" + this.f512978i + ", isInRootDir=" + this.f512979j);
            return;
        }
        this.f512955f = "_udr";
        this.f512978i = i27;
        this.f512979j = v19.f512969b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "refreshCurrentH5Config: use UDR directory (higher version), version=" + this.f512978i + ", isInRootDir=" + this.f512979j);
    }

    public final boolean y(java.lang.String str, int i17, boolean z17, java.lang.String str2, int i18) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: zip file not exist: " + str);
            long j17 = this.f512954e;
            if (j17 > 0) {
                jx3.f.INSTANCE.mo68477x336bdfd8(j17, 1L, 1L, false);
            }
            return false;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: invalid zip file version");
            long j18 = this.f512954e;
            if (j18 > 0) {
                jx3.f.INSTANCE.mo68477x336bdfd8(j18, 1L, 1L, false);
            }
            return false;
        }
        long j19 = this.f512954e;
        if (j19 > 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(j19, 2L, 1L, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: zipFileVersion=" + i17 + ", shouldCheckVersion=" + z17 + ", dirType=" + str2);
        int b17 = b();
        java.lang.String u17 = u(i17, str2);
        vu4.j jVar = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "_udr") ? vu4.j.f521873g : vu4.j.f521872f;
        if (z17 && i17 <= b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: zipFileVersion (" + i17 + ") <= currentVersion (" + b17 + "), skip update");
            long j27 = this.f512954e;
            if (j27 > 0) {
                jx3.f.INSTANCE.mo68477x336bdfd8(j27, 3L, 1L, false);
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: update from " + b17 + " to " + i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: target folder: ".concat(u17));
        long j28 = this.f512954e;
        if (j28 > 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(j28, 4L, 1L, false);
        }
        for (int i19 = 0; i19 < 3; i19++) {
            s(str, u17);
            if (w(u17)) {
                break;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: invalid md5, retryTimes:" + i19);
        }
        if (!w(u17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: validation failed! delete folder, result:" + com.p314xaae8f345.mm.vfs.w6.g(u17, true));
            long j29 = this.f512954e;
            if (j29 > 0) {
                jx3.f.INSTANCE.mo68477x336bdfd8(j29, 5L, 1L, false);
            }
            new vu4.i(vu4.h.f521861f, jVar, "fail", i18, i17, this.f512950a).a();
            return false;
        }
        long j37 = this.f512954e;
        if (j37 > 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(j37, 6L, 1L, false);
        }
        new vu4.i(vu4.h.f521861f, jVar, ya.b.f77504xbb80cbe3, i18, i17, this.f512950a).a();
        k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplate: switched to version " + i17 + ", path: " + u17);
        return true;
    }

    public void z(java.lang.String udrFilePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udrFilePath, "udrFilePath");
        uv4.a aVar = uv4.b.f512949g;
        aVar.e(this.f512954e, 0L, 1L, false);
        int b17 = uv4.x.f512991a.b();
        int c17 = aVar.c(this.f512951b, udrFilePath, this.f512950a, new uv4.o(this));
        new vu4.i(vu4.h.f521860e, vu4.j.f521873g, ya.b.f77504xbb80cbe3, b17, c17, this.f512950a).a();
        boolean z17 = b17 == 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByUDR: expLevel=" + b17 + ", shouldCheckVersion=" + z17 + ", zipFileVersion=" + c17);
        if (y(udrFilePath, c17, z17, "_udr", b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByUDR: update success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchTemplateByUDR", "updateTemplateByUDR: update failed");
        }
    }
}
