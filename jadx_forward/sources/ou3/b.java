package ou3;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f430472a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f430473b;

    public b() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f430472a = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd>(a0Var) { // from class: com.tencent.mm.plugin.recordvideo.res.BaseVideoResLogic$checkResUpdateCacheFileEventListener$1
            {
                this.f39173x3fe91575 = 905296653;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = c5255x5f3208fd;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.r2 r2Var = event.f135586g;
                int i17 = r2Var.f89292a;
                ou3.b bVar = ou3.b.this;
                if (i17 != bVar.g() || r2Var.f89293b != 1) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.h(), "download res finish, path: %s, fileVersion: %s, fileUpdated: %s", r2Var.f89294c, java.lang.Integer.valueOf(r2Var.f89295d), java.lang.Boolean.valueOf(r2Var.f89296e));
                gm0.j1.e().j(new ou3.a(bVar, event));
                ou3.r rVar = (ou3.r) bVar.d();
                rVar.a(rVar.f430505a + 5);
                return false;
            }
        };
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "checkRes " + g());
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(g());
        ou3.r rVar = (ou3.r) d();
        rVar.a(rVar.f430505a + 4);
    }

    public abstract java.lang.String b();

    public abstract java.lang.String[] c();

    public abstract ou3.g d();

    public abstract java.lang.String e();

    public final java.lang.String f() {
        return e() + "temp/";
    }

    public abstract int g();

    public abstract java.lang.String h();

    public final void i(java.lang.String str) {
        java.lang.String str2 = f() + b() + str;
        java.lang.String str3 = e() + str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "file tmp:" + str2 + "  real:" + str3);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "Config does not matching file list!!!!!!!!");
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "move file " + str);
            com.p314xaae8f345.mm.vfs.w6.w(str2, str3);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uk.k.b(str2), uk.k.b(str3))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "already has file " + str);
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.h(str3);
        com.p314xaae8f345.mm.vfs.w6.w(str2, str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "replace file " + str);
    }

    public final void j() {
        if (this.f430473b) {
            ou3.r rVar = (ou3.r) d();
            rVar.a(rVar.f430505a + 2);
        } else {
            ou3.r rVar2 = (ou3.r) d();
            rVar2.a(rVar2.f430505a + 3);
        }
    }

    public final int k(java.lang.String str, java.lang.String str2) {
        java.util.zip.ZipInputStream zipInputStream = null;
        try {
            try {
                java.util.zip.ZipInputStream zipInputStream2 = new java.util.zip.ZipInputStream(com.p314xaae8f345.mm.vfs.w6.E(str));
                java.util.zip.ZipEntry zipEntry = null;
                while (true) {
                    try {
                        java.util.zip.ZipEntry nextEntry = zipInputStream2.getNextEntry();
                        if (nextEntry != null) {
                            zipEntry = nextEntry;
                        } else {
                            nextEntry = null;
                        }
                        if (nextEntry == null) {
                            com.p314xaae8f345.mm.vfs.e8.d(zipInputStream2);
                            return 0;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zipEntry);
                        java.lang.String name = zipEntry.getName();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
                        if (!r26.n0.B(name, "../", false) && !r26.n0.B(name, "..\\", false)) {
                            if (zipEntry.isDirectory()) {
                                java.lang.String substring = name.substring(0, name.length() - 1);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2 + '/' + substring);
                                java.lang.String str3 = a17.f294812f;
                                if (str3 != null) {
                                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                                    if (!str3.equals(l17)) {
                                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                                    }
                                }
                                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                                if (m17.a()) {
                                    m17.f294799a.r(m17.f294800b);
                                }
                            } else {
                                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2 + '/' + name);
                                com.p314xaae8f345.mm.vfs.r6 s17 = r6Var.s();
                                if (s17 != null) {
                                    s17.J();
                                }
                                java.io.OutputStream H = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(H, "openWrite(...)");
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = zipInputStream2.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    H.write(bArr, 0, read);
                                }
                                H.close();
                            }
                        }
                    } catch (java.io.FileNotFoundException e17) {
                        e = e17;
                        zipInputStream = zipInputStream2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(h(), e, "", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.vfs.e8.d(zipInputStream);
                        return -1;
                    } catch (java.io.IOException e18) {
                        e = e18;
                        zipInputStream = zipInputStream2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(h(), e, "", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.vfs.e8.d(zipInputStream);
                        return -2;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        zipInputStream = zipInputStream2;
                        com.p314xaae8f345.mm.vfs.e8.d(zipInputStream);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.io.FileNotFoundException e19) {
            e = e19;
        } catch (java.io.IOException e27) {
            e = e27;
        }
    }

    public final synchronized void l(java.lang.String filePath, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "unzipRes: %s", filePath);
        if (com.p314xaae8f345.mm.vfs.w6.j(filePath)) {
            com.p314xaae8f345.mm.vfs.w6.u(f());
            int k17 = k(filePath, f());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "unzip file ret:" + k17 + "  " + f());
            boolean z17 = false;
            java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(f() + b(), false);
            if (s17 != null) {
                for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "unzip file path:" + x1Var.f294764a + " name:" + x1Var.f294765b + " size:" + x1Var.f294766c);
                }
            }
            if (k17 == 0) {
                try {
                    try {
                        if (com.p314xaae8f345.mm.vfs.w6.j(f() + b() + "config.json")) {
                            java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(f() + b() + "config.json");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "meta json: %s", M);
                            org.json.JSONArray jSONArray = new org.json.JSONArray(M);
                            int length = jSONArray.length();
                            for (int i27 = 0; i27 < length; i27++) {
                                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i27);
                                for (java.lang.String str : c()) {
                                    java.lang.String optString = jSONObject.optString(str);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                                    i(optString);
                                }
                            }
                            com.p314xaae8f345.mm.vfs.w6.h(e() + "config.json");
                            com.p314xaae8f345.mm.vfs.w6.w(f() + b() + "config.json", e() + "config.json");
                            z17 = true;
                        }
                        if (z17) {
                            ou3.r rVar = (ou3.r) d();
                            rVar.a(rVar.f430505a + 6);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "unzip success");
                            ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ri(i17, i18, i19);
                            this.f430473b = true;
                        } else {
                            ou3.r rVar2 = (ou3.r) d();
                            rVar2.a(rVar2.f430505a + 7);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "unzip failed");
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(h(), e17, "unzipRes error: %s", e17.getMessage());
                        ou3.r rVar3 = (ou3.r) d();
                        rVar3.a(rVar3.f430505a + 7);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "unzip failed");
                    }
                    com.p314xaae8f345.mm.vfs.w6.g(f(), true);
                } catch (java.lang.Throwable th6) {
                    ou3.r rVar4 = (ou3.r) d();
                    rVar4.a(rVar4.f430505a + 7);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "unzip failed");
                    com.p314xaae8f345.mm.vfs.w6.g(f(), true);
                    throw th6;
                }
            }
        }
    }
}
