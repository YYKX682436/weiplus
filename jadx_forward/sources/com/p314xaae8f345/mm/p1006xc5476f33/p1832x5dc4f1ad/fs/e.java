package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.j implements jc3.k0 {

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 f229493s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.CopyOnWriteArrayList f229494t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String instanceName, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var, java.util.List list) {
        super(instanceName);
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f229503g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushFileSystem", "file system invalid instanceName:" + instanceName + ",not register");
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f229504h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6Var);
        java.lang.String o17 = r6Var.o();
        java.lang.String str3 = "/" + this.f229503g;
        com.p314xaae8f345.mm.vfs.z7 a17 = o17 == null ? null : com.p314xaae8f345.mm.vfs.z7.a(o17);
        if (a17 == null) {
            z7Var = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l(str3, false, false), null, null);
        } else {
            boolean isEmpty = str3.isEmpty();
            java.lang.String str4 = a17.f294812f;
            if (!isEmpty) {
                str4 = com.p314xaae8f345.mm.vfs.e8.l(str4 + '/' + str3, false, false);
            }
            z7Var = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, str4, a17.f294813g, a17.f294814h);
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(z7Var, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(z7Var, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = this.f229504h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6Var2);
        java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(r6Var2.o(), "/" + this.f229503g).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(o18, "files/");
        if (!r6Var3.m()) {
            r6Var3.J();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3(r6Var3.o(), "wxfile://usr");
        j3Var.f157760f = ((java.lang.Number) ((jz5.n) this.f229505i).mo141623x754a37bb()).longValue();
        e().add(j3Var);
        jc3.k0.Ag(this, instanceName, str, str2, u1Var, null, 16, null);
        mo49302x33ebcb90();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystem", "file system established instanceName:" + instanceName + ",pkgPath:" + str + ",prefix:" + str2 + ",assetsFS:" + u1Var);
    }

    @Override // jc3.k0
    public void J(java.lang.String instanceName, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        if (list != null) {
            this.f229494t = new java.util.concurrent.CopyOnWriteArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next();
                if (b(u1Var2.getClass()) == null) {
                    e().add(u1Var2);
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f229494t;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(copyOnWriteArrayList);
                    copyOnWriteArrayList.add(u1Var2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystem", "addExternalFS bizName:" + this.f229503g + ",externalFS:" + u1Var2);
                }
            }
        }
        if (b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class) == null) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = this.f229504h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6Var);
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var.o(), "/" + this.f229503g).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(o17, "objects/");
            if (!r6Var2.m()) {
                r6Var2.J();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1(r6Var2.o(), "default_obfuscation_key", "wxfile://");
            n1Var.f157813i = g();
            e().add(n1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystem", "addFlattenFS instanceName:".concat(instanceName));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 n1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class);
        if (n1Var2 != null) {
            n1Var2.c();
        }
        if (str == null) {
            if (u1Var == null || b(u1Var.getClass()) != null) {
                return;
            }
            e().add(u1Var);
            this.f229493s = u1Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystem", "addPkgFS instanceName:" + instanceName + ",assetsFS:" + u1Var);
            return;
        }
        if (b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.c.class) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8(str);
            if (y8Var.a()) {
                cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.c(y8Var, str2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushFileSystem", "getPkgFileSystem readInfo error calculateMD5:" + com.p314xaae8f345.mm.vfs.w6.p(str));
                cVar = null;
            }
            if (cVar != null) {
                e().add(cVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystem", "addPkgFS instanceName:" + instanceName + ",pkgPath:" + str + ",prefix:" + str2 + ",assetsFS:" + u1Var);
        }
    }

    @Override // jc3.k0
    public void Vf(java.lang.String pkgPath, java.lang.String customName, java.lang.String str) {
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgPath, "pkgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customName, "customName");
        if (str != null) {
            str2 = customName + '/' + str;
        } else {
            str2 = customName;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystem", "addCustomPkgFS bizName:" + this.f229503g + ", customName:" + customName + ",pkgPath:" + pkgPath + ",prefix:" + str);
        if (!c().contains(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.d(customName, pkgPath);
            synchronized (this) {
                synchronized (this.f229516e) {
                    this.f229516e.put(str2, dVar);
                }
            }
            return;
        }
        java.lang.Object obj = c().get(str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.fs.MBPkgFileSystemWithModularizingNewImpl");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.s) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.d) obj).c();
        sVar.getClass();
        if (sVar.f229530d) {
            return;
        }
        sVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.q(sVar, pkgPath));
    }

    @Override // jc3.k0
    public java.lang.String X3(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f229504h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6Var);
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(r6Var.o(), "/" + this.f229503g).o(), "files/");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(filePath)) {
            return "";
        }
        if (!r26.i0.y(filePath, r26.i0.n("wxfile://usr", "/", false) ? "wxfile://usr" : "wxfile://usr/", false)) {
            return "";
        }
        java.lang.String quote = java.util.regex.Pattern.quote("wxfile://usr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(quote, "quote(...)");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(quote);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceFirst = compile.matcher(filePath).replaceFirst("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceFirst, "replaceFirst(...)");
        java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.h(replaceFirst);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "removeDuplicatedLeadingSlash(...)");
        java.lang.String a17 = s46.c.a(r6Var2.o(), r26.i0.t(h17, "\u0000", "", false));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            return "";
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystem", "filePath:%s, physicalPath:%s", filePath, r6Var3.o());
        java.lang.String o17 = r6Var3.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // jc3.k0
    public void s7(java.lang.String instanceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystem", "removePkgFS instanceName:".concat(instanceName));
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.c) b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.c.class);
        if (cVar != null) {
            e().remove(cVar);
        }
        if (this.f229493s != null) {
            e().remove(this.f229493s);
            this.f229493s = null;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f229494t;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                e().remove((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next());
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f229494t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(copyOnWriteArrayList2);
            copyOnWriteArrayList2.clear();
        }
        java.util.Set entrySet = c().entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it6 = entrySet.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) ((java.util.Map.Entry) it6.next()).getValue();
            if (u1Var != null) {
                u1Var.mo49309x41012807();
            }
        }
        mo49309x41012807();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class);
        if (n1Var != null) {
            n1Var.b();
            e().remove(n1Var);
        }
    }
}
