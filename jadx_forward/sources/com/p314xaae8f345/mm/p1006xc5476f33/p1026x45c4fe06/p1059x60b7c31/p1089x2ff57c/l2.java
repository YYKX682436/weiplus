package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class l2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2 {
    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.class.getClassLoader();
        fp.d0.n("appbrandcommon");
    }

    public l2(ze.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.h hVar) {
        super(new java.util.LinkedList());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f9 f9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f9(nVar);
        this.f157722d.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u0(e() + nVar.f156336n + "/blobTmp/", nVar.f156336n, "wxblob://", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.k2(this, nVar));
        long j17 = hVar.f162597d;
        this.f157722d.add(u0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 f17 = f(nVar.f156336n);
        f17.f157813i = hVar.f162597d * 1048576;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 i17 = i(kk.v.a(nVar.u0().f128812x0), nVar.f156336n);
        i17.f157760f = hVar.f162597d * 1048576;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j18 = j(kk.v.a(nVar.u0().f128812x0), nVar.f156336n);
        j18.f157760f = hVar.f162601h * 1048576;
        this.f157722d.add(j18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 k17 = k(kk.v.a(nVar.u0().f128812x0), nVar.f156336n);
        k17.f157760f = hVar.f162602i * 1048576;
        this.f157722d.add(k17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 c17 = c(kk.v.a(nVar.u0().f128812x0), nVar.f156336n);
        c17.f157760f = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f157722d.add(c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 l17 = l(kk.v.a(nVar.u0().f128812x0), nVar.f156336n);
        l17.f157760f = hVar.f162597d * 1048576;
        this.f157722d.add(l17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3(h("wxsdk"), "wxfile://sdk");
        j3Var.f157760f = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8;
        this.f157722d.add(j3Var);
        this.f157722d.add(i17);
        this.f157722d.add(f17);
        this.f157722d.add(f9Var);
        mo49302x33ebcb90();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 c(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3(h(str, str2, "clientdata"), "wxfile://clientdata");
    }

    public static com.p314xaae8f345.mm.vfs.r6 d() {
        if (!fp.i.b()) {
            return null;
        }
        java.lang.String D = lp0.b.D();
        if (!D.endsWith("/")) {
            D = D.concat("/");
        }
        return new com.p314xaae8f345.mm.vfs.r6(D + "wxanewfiles/");
    }

    public static java.lang.String e() {
        return (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.f157643b.b();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 f(java.lang.String str) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1(e() + str + "/", str, "wxfile://");
    }

    public static java.lang.String g(java.lang.String... strArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(";");
        for (java.lang.String str : strArr) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(';');
        }
        return kk.k.g(sb6.toString().getBytes());
    }

    public static java.lang.String h(java.lang.String... strArr) {
        com.p314xaae8f345.mm.vfs.r6 d17 = d();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.LuggageFileSystemRegistryWC", "getIndependentRootPath, extRoot NULL");
            return null;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(d17.u() + "/" + g(strArr));
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        return a17.m82499x9616526c();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 i(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3(h(str, str2), "wxfile://usr");
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3(h(str, str2, "opendata"), "wxfile://opendata");
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 k(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3(h(str, str2, "wxprivate"), "wxfile://__wxprivate__");
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 l(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3(h(str, str2, "singlePage"), "wxfile://singlepage");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: allocTempFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class)).mo49614x6665a5c5(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: createTempFileFrom */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class)).mo49619x6aa75256(r6Var, str, z17, b0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getSavedFileList */
    public java.util.List mo49622x91aa142b() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class)).mo49622x91aa142b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readDir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49305x40654317(java.lang.String str, ik1.b0 b0Var) {
        android.net.Uri parse = android.net.Uri.parse(str);
        if (!"wxfile".equals(parse.getScheme()) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(parse.getAuthority())) {
            return super.mo49305x40654317(str, b0Var);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class)).mo49305x40654317("", b0Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0((java.util.List) b0Var.f373357a)) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h1 h1Var : (java.util.List) b0Var.f373357a) {
                h1Var.f157726a = h1Var.f157726a.replaceFirst(java.util.regex.Pattern.quote("wxfile://"), "");
            }
        }
        nf.c.b(linkedList, (java.util.List) b0Var.f373357a);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) a("wxfile://usr")).mo49305x40654317("wxfile://usr", b0Var);
        nf.c.b(linkedList, (java.util.List) b0Var.f373357a);
        b0Var.f373357a = linkedList;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
    }
}
