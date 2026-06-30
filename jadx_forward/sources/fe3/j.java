package fe3;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static fe3.j f343087a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f343088b = "magic";

    public static fe3.j b() {
        if (f343087a == null) {
            synchronized (fe3.j.class) {
                f343087a = new fe3.j();
                f();
            }
        }
        return f343087a;
    }

    public static void f() {
        jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi("MagicPkgVersionSyncSTORAGE", null);
        if (wi6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "init version fail,storage is nil");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jc3.u0 u0Var = jc3.u0.f380529a;
        for (java.lang.String str : jc3.u0.f380537i) {
            java.lang.Object[] b17 = ((ue3.f) wi6).b(str);
            java.lang.String str2 = ((lc3.z) b17[0]) == lc3.x.f399467a ? (java.lang.String) b17[1] : null;
            if (str2 != null) {
                sb6.append(str);
                sb6.append(str2);
                sb6.append("-");
            }
        }
        if (sb6.length() > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "initMagicPkgVersion:%s", sb6.toString());
            f343088b = sb6.toString();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "init version fail,no vaild data");
    }

    public boolean a(java.lang.String str, java.lang.String str2, boolean z17, jc3.m0 m0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "checkMagicPkg pkgId:%s,baseId:%s", str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "checkMagicPkg invaild pkgid");
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c17 = c(lowerCase);
        java.lang.String str3 = "default";
        if (c17 == null) {
            j(lowerCase, null, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed.f37586x3e0f4e8, 0, 0, false);
        } else {
            if (!str2.isEmpty()) {
                str3 = str2;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f229398n)) {
                str3 = c17.f229398n;
            }
            j(lowerCase, c17, 1, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed.f37586x3e0f4e8, 0, 0, false);
        }
        java.lang.String str4 = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "realBaseId is %s", str4);
        oq1.l lVar = (oq1.l) i95.n0.c(oq1.l.class);
        fe3.k kVar = new fe3.k(this, lowerCase, c17, false, m0Var);
        ((nq1.d) lVar).getClass();
        nq1.s sVar = (nq1.s) ((oq1.m) i95.n0.c(oq1.m.class));
        sVar.m134976x2690a4ac();
        sVar.f420504d.getClass();
        gm0.j1.d().g(new z73.c(lowerCase, str4, "", z17, kVar));
        return true;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c(java.lang.String str) {
        android.os.Bundle bundle;
        try {
            bundle = ue3.i.a("getMagicPkgInfo", str, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicPkgLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "null == bundle, appId:" + str);
            return null;
        }
        bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd.class.getClassLoader());
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd) bundle.getParcelable("MagicPkg");
        if (!fe3.l.f(c16421xe4d4fcd)) {
            h(c16421xe4d4fcd);
            i(c16421xe4d4fcd);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,patchId:%s,file not exist", c16421xe4d4fcd.f229391d, c16421xe4d4fcd.f229398n);
            return null;
        }
        if (d(str) == null && !l(c16421xe4d4fcd)) {
            h(c16421xe4d4fcd);
            i(c16421xe4d4fcd);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,patchId:%s,save to storage fail", c16421xe4d4fcd.f229391d, c16421xe4d4fcd.f229398n);
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16421xe4d4fcd.f229400p)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16421xe4d4fcd.f229396i)) {
                c16421xe4d4fcd.f229400p = bf3.b0.f101145a.a(c16421xe4d4fcd.f229395h);
            } else {
                c16421xe4d4fcd.f229400p = c16421xe4d4fcd.f229394g;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "getMagicPkgInfo pkg:%s,md5:%s,version:%s", c16421xe4d4fcd.f229391d, c16421xe4d4fcd.f229393f, c16421xe4d4fcd.f229399o);
        return c16421xe4d4fcd;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd d(java.lang.String str) {
        jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi("MagicPkgSyncSTORAGE", null);
        if (wi6 != null) {
            java.lang.Object[] b17 = ((ue3.f) wi6).b(str);
            lc3.z zVar = (lc3.z) b17[0];
            java.lang.String str2 = zVar == lc3.x.f399467a ? (java.lang.String) b17[1] : null;
            if (str2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd();
                c16421xe4d4fcd.f229391d = str;
                try {
                    java.lang.String[] split = str2.split(",");
                    java.util.HashMap hashMap = new java.util.HashMap();
                    for (java.lang.String str3 : split) {
                        java.lang.String[] split2 = str3.split(":");
                        hashMap.put(split2[0], split2[1]);
                    }
                    c16421xe4d4fcd.f229392e = (java.lang.String) hashMap.get("url");
                    c16421xe4d4fcd.f229393f = (java.lang.String) hashMap.get("md5");
                    c16421xe4d4fcd.f229394g = (java.lang.String) hashMap.get("pkgpath");
                    c16421xe4d4fcd.f229395h = (java.lang.String) hashMap.get("unzippath");
                    c16421xe4d4fcd.f229396i = (java.lang.String) hashMap.get("originalName");
                    c16421xe4d4fcd.f229397m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) hashMap.get("pkgtype"), 3);
                    c16421xe4d4fcd.f229398n = (java.lang.String) hashMap.get("patchId");
                    c16421xe4d4fcd.f229399o = (java.lang.String) hashMap.get("version");
                    c16421xe4d4fcd.f229400p = (java.lang.String) hashMap.get("wxapath");
                    if (!fe3.l.f(c16421xe4d4fcd)) {
                        i(c16421xe4d4fcd);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,patchId:%s,file not exist", c16421xe4d4fcd.f229391d, c16421xe4d4fcd.f229398n);
                        return null;
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16421xe4d4fcd.f229400p)) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16421xe4d4fcd.f229396i)) {
                            c16421xe4d4fcd.f229400p = bf3.b0.f101145a.a(c16421xe4d4fcd.f229395h);
                        } else {
                            c16421xe4d4fcd.f229400p = c16421xe4d4fcd.f229394g;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "getMagicPkgInfoMulti pkg:%s,md5:%s,version:%s", c16421xe4d4fcd.f229391d, c16421xe4d4fcd.f229393f, c16421xe4d4fcd.f229399o);
                    return c16421xe4d4fcd;
                } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
                    i(c16421xe4d4fcd);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicPkgLogic", e17, "pkg:%s,get info exception", str);
                    return null;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,file not in storage,errNo:%d,errMsg:%s", str, java.lang.Integer.valueOf(zVar.f399477a), zVar.f399478b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "pkg:%s,get storage fail,storage is nil", str);
        }
        return null;
    }

    public java.util.List e() {
        android.os.Bundle bundle;
        try {
            bundle = ue3.i.a("getMagicPkgList", null, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicPkgLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "getMagicPkgList bundle is null.");
            return null;
        }
        bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd.class.getClassLoader());
        if (bundle.containsKey("MagicPkgList")) {
            return bundle.getParcelableArrayList("MagicPkgList");
        }
        return null;
    }

    public void g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "processMagicBootsCmd pkgId:%s,op:%s,url:%s", str, str4, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "processMagicBootsCmd invaild argc");
            return;
        }
        java.lang.String[] split = str4.split("#", 6);
        if (split.length != 6 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[0]) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[1]) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[2]) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[3]) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[4]) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[5])) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "processMagicBootsCmd invaild op");
            return;
        }
        java.lang.String lowerCase = str.toLowerCase();
        java.lang.String str5 = split[0];
        java.lang.String str6 = split[1];
        java.lang.String str7 = split[2];
        java.lang.String str8 = split[3];
        java.lang.String str9 = split[4];
        java.lang.String str10 = split[5];
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c17 = c(lowerCase);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) || c17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f229399o) || !str6.equalsIgnoreCase(c17.f229399o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "processMagicBootsCmd version not match");
            return;
        }
        oq1.q qVar = new oq1.q();
        qVar.f428883e = str3;
        qVar.f428882d = new java.lang.String(android.util.Base64.decode(str2, 0));
        qVar.f428881c = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str8, 3));
        qVar.f428884f = str9;
        qVar.f428888j = str;
        qVar.f428889k = str9;
        qVar.f428890l = str7;
        qVar.f428891m = str10;
        fe3.i.INSTANCE.a(qVar, c17, lowerCase, null);
    }

    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd) {
        if (c16421xe4d4fcd == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "remove db fail,info is nil");
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.f(c16421xe4d4fcd.f229395h);
        com.p314xaae8f345.mm.vfs.w6.h(c16421xe4d4fcd.f229394g);
        com.p314xaae8f345.mm.vfs.w6.h(c16421xe4d4fcd.f229400p);
        try {
            ue3.i.a("removeMagicPkgInfo", c16421xe4d4fcd.f229391d, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicPkgLogic", e17, "", new java.lang.Object[0]);
        }
        i(c16421xe4d4fcd);
    }

    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd) {
        if (c16421xe4d4fcd == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "remove storage fail,info is nil");
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.f(c16421xe4d4fcd.f229395h);
        com.p314xaae8f345.mm.vfs.w6.h(c16421xe4d4fcd.f229394g);
        com.p314xaae8f345.mm.vfs.w6.h(c16421xe4d4fcd.f229400p);
        jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi("MagicPkgSyncSTORAGE", null);
        if (wi6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "pkg:%s,remove storage fail,storage is nil", c16421xe4d4fcd.f229391d);
            return;
        }
        lc3.z f17 = ((ue3.f) wi6).f(c16421xe4d4fcd.f229391d);
        if (f17 != lc3.x.f399467a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "remove storage fail,errNo:%d,errMsg:%s", java.lang.Integer.valueOf(f17.f399477a), f17.f399478b);
        }
    }

    public final void j(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed scene, int i18, int i19, boolean z17) {
        int i27 = i18;
        if (z17) {
            if (i27 == 0) {
                i27 = 3;
            } else if (i27 == 1) {
                i27 = 4;
            } else if (i27 == 2) {
                i27 = 5;
            }
        }
        int i28 = i27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        ((je3.i) i95.n0.c(je3.i.class)).Rg(str, c16421xe4d4fcd != null ? c16421xe4d4fcd.f229398n : null, c16421xe4d4fcd != null ? c16421xe4d4fcd.f229399o : null, c16421xe4d4fcd != null ? c16421xe4d4fcd.f229393f : null, i17, scene, i28, i19);
    }

    public void k(final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd) {
        if (c16421xe4d4fcd == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "app is empty.");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16421xe4d4fcd.f229394g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "app path is empty.");
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c16421xe4d4fcd.f229394g);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!a17.f294812f.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "app file isn't exist.");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("MagicPkg", c16421xe4d4fcd);
        try {
            ue3.i.a("insertMagicPkgInfo", c16421xe4d4fcd.f229391d, bundle);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicPkgLogic", e17, "", new java.lang.Object[0]);
        }
        l(c16421xe4d4fcd);
        jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi("MagicPkgVersionSyncSTORAGE", null);
        if (wi6 != null) {
            ue3.f fVar = (ue3.f) wi6;
            lc3.z g17 = fVar.g(c16421xe4d4fcd.f229391d, c16421xe4d4fcd.f229399o, "String");
            lc3.z zVar = lc3.x.f399467a;
            if (g17 != zVar) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,update pkg version fail,errNo:%d,errMsg:%s", c16421xe4d4fcd.f229391d, java.lang.Integer.valueOf(g17.f399477a), g17.f399478b);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (java.lang.String str2 : jc3.u0.f380537i) {
                    java.lang.Object[] b17 = fVar.b(str2.toLowerCase());
                    java.lang.String str3 = ((lc3.z) b17[0]) == zVar ? (java.lang.String) b17[1] : null;
                    if (str3 != null) {
                        sb6.append(str2.toLowerCase());
                        sb6.append(str3);
                        sb6.append("-");
                    }
                }
                if (sb6.length() > 0) {
                    sb6.deleteCharAt(sb6.length() - 1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "updateMagicPkgVersionStorage magicVersion:%s", sb6.toString());
                    f343088b = sb6.toString();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "update pkg version fail,no vaild data");
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "pkg:%s,update pkg version fail,storage is nil", c16421xe4d4fcd.f229391d);
        }
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: fe3.j$$a
            @Override // java.lang.Runnable
            public final void run() {
                ie3.i iVar = (ie3.i) i95.n0.c(ie3.i.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd2 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd.this;
                ((he3.e) iVar).mj(c16421xe4d4fcd2.f229391d, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(c16421xe4d4fcd2.f229399o, -1), c16421xe4d4fcd2.f229400p);
            }
        });
    }

    public final boolean l(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd) {
        if (c16421xe4d4fcd == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "update storage fail,info is nil");
            return false;
        }
        jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi("MagicPkgSyncSTORAGE", null);
        if (wi6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "pkg:%s,update storage fail,storage is nil", c16421xe4d4fcd.f229391d);
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pkgId", c16421xe4d4fcd.f229391d);
        hashMap.put("url", c16421xe4d4fcd.f229392e);
        hashMap.put("md5", c16421xe4d4fcd.f229393f);
        hashMap.put("pkgpath", c16421xe4d4fcd.f229394g);
        hashMap.put("unzippath", c16421xe4d4fcd.f229395h);
        hashMap.put("originalName", c16421xe4d4fcd.f229396i);
        hashMap.put("pkgtype", java.lang.Integer.toString(c16421xe4d4fcd.f229397m));
        hashMap.put("patchId", c16421xe4d4fcd.f229398n);
        hashMap.put("version", c16421xe4d4fcd.f229399o);
        hashMap.put("wxapath", c16421xe4d4fcd.f229400p);
        java.util.Set keySet = hashMap.keySet();
        java.lang.String[] strArr = (java.lang.String[]) keySet.toArray(new java.lang.String[keySet.size()]);
        java.util.Arrays.sort(strArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < strArr.length; i17++) {
            if (java.lang.String.valueOf(hashMap.get(strArr[i17])).trim().length() > 0) {
                sb6.append(strArr[i17]);
                sb6.append(":");
                sb6.append(java.lang.String.valueOf(hashMap.get(strArr[i17])).trim());
            }
            if (i17 != strArr.length - 1) {
                sb6.append(",");
            }
        }
        lc3.z g17 = ((ue3.f) wi6).g(c16421xe4d4fcd.f229391d, sb6.toString(), "String");
        if (g17 == lc3.x.f399467a) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,update storage fail,errNo:%d,errMsg:%s", c16421xe4d4fcd.f229391d, java.lang.Integer.valueOf(g17.f399477a), g17.f399478b);
        return false;
    }
}
