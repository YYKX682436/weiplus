package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class l2 extends com.tencent.mm.plugin.appbrand.appstorage.g2 {
    static {
        com.tencent.mm.plugin.appbrand.jsapi.file.l2.class.getClassLoader();
        fp.d0.n("appbrandcommon");
    }

    public l2(ze.n nVar, com.tencent.mm.plugin.appbrand.jsapi.file.h hVar) {
        super(new java.util.LinkedList());
        com.tencent.mm.plugin.appbrand.appcache.f9 f9Var = new com.tencent.mm.plugin.appbrand.appcache.f9(nVar);
        this.f76189d.clear();
        com.tencent.mm.plugin.appbrand.appstorage.u0 u0Var = new com.tencent.mm.plugin.appbrand.appstorage.u0(e() + nVar.f74803n + "/blobTmp/", nVar.f74803n, "wxblob://", new com.tencent.mm.plugin.appbrand.jsapi.file.k2(this, nVar));
        long j17 = hVar.f81064d;
        this.f76189d.add(u0Var);
        com.tencent.mm.plugin.appbrand.appstorage.n1 f17 = f(nVar.f74803n);
        f17.f76280i = hVar.f81064d * 1048576;
        com.tencent.mm.plugin.appbrand.appstorage.j3 i17 = i(kk.v.a(nVar.u0().f47279x0), nVar.f74803n);
        i17.f76227f = hVar.f81064d * 1048576;
        com.tencent.mm.plugin.appbrand.appstorage.j3 j18 = j(kk.v.a(nVar.u0().f47279x0), nVar.f74803n);
        j18.f76227f = hVar.f81068h * 1048576;
        this.f76189d.add(j18);
        com.tencent.mm.plugin.appbrand.appstorage.j3 k17 = k(kk.v.a(nVar.u0().f47279x0), nVar.f74803n);
        k17.f76227f = hVar.f81069i * 1048576;
        this.f76189d.add(k17);
        com.tencent.mm.plugin.appbrand.appstorage.j3 c17 = c(kk.v.a(nVar.u0().f47279x0), nVar.f74803n);
        c17.f76227f = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f76189d.add(c17);
        com.tencent.mm.plugin.appbrand.appstorage.j3 l17 = l(kk.v.a(nVar.u0().f47279x0), nVar.f74803n);
        l17.f76227f = hVar.f81064d * 1048576;
        this.f76189d.add(l17);
        com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var = new com.tencent.mm.plugin.appbrand.appstorage.j3(h("wxsdk"), "wxfile://sdk");
        j3Var.f76227f = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH;
        this.f76189d.add(j3Var);
        this.f76189d.add(i17);
        this.f76189d.add(f17);
        this.f76189d.add(f9Var);
        initialize();
    }

    public static com.tencent.mm.plugin.appbrand.appstorage.j3 c(java.lang.String str, java.lang.String str2) {
        return new com.tencent.mm.plugin.appbrand.appstorage.j3(h(str, str2, "clientdata"), "wxfile://clientdata");
    }

    public static com.tencent.mm.vfs.r6 d() {
        if (!fp.i.b()) {
            return null;
        }
        java.lang.String D = lp0.b.D();
        if (!D.endsWith("/")) {
            D = D.concat("/");
        }
        return new com.tencent.mm.vfs.r6(D + "wxanewfiles/");
    }

    public static java.lang.String e() {
        return (java.lang.String) com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.f76110b.b();
    }

    public static com.tencent.mm.plugin.appbrand.appstorage.n1 f(java.lang.String str) {
        return new com.tencent.mm.plugin.appbrand.appstorage.n1(e() + str + "/", str, "wxfile://");
    }

    public static java.lang.String g(java.lang.String... strArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(";");
        for (java.lang.String str : strArr) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(';');
        }
        return kk.k.g(sb6.toString().getBytes());
    }

    public static java.lang.String h(java.lang.String... strArr) {
        com.tencent.mm.vfs.r6 d17 = d();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LuggageFileSystemRegistryWC", "getIndependentRootPath, extRoot NULL");
            return null;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(d17.u() + "/" + g(strArr));
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        return a17.toString();
    }

    public static com.tencent.mm.plugin.appbrand.appstorage.j3 i(java.lang.String str, java.lang.String str2) {
        return new com.tencent.mm.plugin.appbrand.appstorage.j3(h(str, str2), "wxfile://usr");
    }

    public static com.tencent.mm.plugin.appbrand.appstorage.j3 j(java.lang.String str, java.lang.String str2) {
        return new com.tencent.mm.plugin.appbrand.appstorage.j3(h(str, str2, "opendata"), "wxfile://opendata");
    }

    public static com.tencent.mm.plugin.appbrand.appstorage.j3 k(java.lang.String str, java.lang.String str2) {
        return new com.tencent.mm.plugin.appbrand.appstorage.j3(h(str, str2, "wxprivate"), "wxfile://__wxprivate__");
    }

    public static com.tencent.mm.plugin.appbrand.appstorage.j3 l(java.lang.String str, java.lang.String str2) {
        return new com.tencent.mm.plugin.appbrand.appstorage.j3(h(str, str2, "singlePage"), "wxfile://singlepage");
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.g2, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 allocTempFile(java.lang.String str) {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).allocTempFile(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.g2, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).createTempFileFrom(r6Var, str, z17, b0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.g2, com.tencent.mm.plugin.appbrand.appstorage.u1
    public java.util.List getSavedFileList() {
        return ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).getSavedFileList();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.g2, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readDir(java.lang.String str, ik1.b0 b0Var) {
        android.net.Uri parse = android.net.Uri.parse(str);
        if (!"wxfile".equals(parse.getScheme()) || !com.tencent.mm.sdk.platformtools.t8.K0(parse.getAuthority())) {
            return super.readDir(str, b0Var);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ((com.tencent.mm.plugin.appbrand.appstorage.n1) b(com.tencent.mm.plugin.appbrand.appstorage.n1.class)).readDir("", b0Var);
        if (!com.tencent.mm.sdk.platformtools.t8.L0((java.util.List) b0Var.f291824a)) {
            for (com.tencent.mm.plugin.appbrand.appstorage.h1 h1Var : (java.util.List) b0Var.f291824a) {
                h1Var.f76193a = h1Var.f76193a.replaceFirst(java.util.regex.Pattern.quote("wxfile://"), "");
            }
        }
        nf.c.b(linkedList, (java.util.List) b0Var.f291824a);
        ((com.tencent.mm.plugin.appbrand.appstorage.j3) a("wxfile://usr")).readDir("wxfile://usr", b0Var);
        nf.c.b(linkedList, (java.util.List) b0Var.f291824a);
        b0Var.f291824a = linkedList;
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }
}
