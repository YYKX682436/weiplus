package fh1;

/* loaded from: classes7.dex */
public final class l0 extends lc3.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final fh1.k0 f344092m = new fh1.k0(null);

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f344093e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f344094f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 f344095g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f344096h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f344097i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.lang.String instanceName) {
        super(instanceName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        this.f344093e = "MicroMsg.MagicBrushFramePkgManagementDelegate(" + instanceName + ')';
        this.f344096h = new java.util.concurrent.ConcurrentHashMap();
        this.f344097i = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    @Override // jc3.x
    public java.lang.String a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i(path);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "removeLeadingSlashForEnterPath(...)");
        if (!r26.i0.y(i17, "WAMagicBrush", false)) {
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.f344094f;
        if (interfaceC11702x4ae7c33 != null) {
            java.lang.String M = interfaceC11702x4ae7c33.M(path);
            return M == null ? "" : M;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wxaCommLib");
        throw null;
    }

    @Override // jc3.x
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = this.f344095g;
        if (u1Var != null) {
            return u1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fs");
        throw null;
    }

    @Override // jc3.x
    public lc3.k0 c(java.lang.String path, java.util.Map map) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.String obj2 = (map == null || (obj = map.get("appId")) == null) ? null : obj.toString();
        boolean z17 = true;
        if (obj2 != null && r26.i0.y(obj2, "CARD_", false)) {
            obj2 = obj2.substring(5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "substring(...)");
        }
        if (obj2 != null && obj2.length() != 0) {
            z17 = false;
        }
        java.lang.String str = this.f344093e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "provideWxaScriptDescriptor for path:" + path + ", with invalid contextInfoMap");
            return null;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f344097i.readLock();
        readLock.lock();
        try {
            fj1.t tVar = (fj1.t) this.f344096h.get(obj2);
            readLock.unlock();
            if (tVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "provideWxaScriptDescriptor for path:" + path + " appId:" + obj2 + ", pkgReader not ready");
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af = tVar.f344671b.mo49254xc00e82af(path);
            if (mo49254xc00e82af != null) {
                java.lang.String wxaPkgFilePath = mo49254xc00e82af.f157577e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wxaPkgFilePath, "wxaPkgFilePath");
                java.lang.String fileName = mo49254xc00e82af.f157578f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fileName, "fileName");
                return new lc3.k0(wxaPkgFilePath, fileName);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "provideWxaScriptDescriptor for path:" + path + " appId:" + obj2 + ", resource not found");
            return null;
        } catch (java.lang.Throwable th6) {
            readLock.unlock();
            throw th6;
        }
    }

    @Override // jc3.x
    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.f344094f;
        if (interfaceC11702x4ae7c33 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wxaCommLib");
            throw null;
        }
        if (interfaceC11702x4ae7c33 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11660xa0d206d) {
            if (interfaceC11702x4ae7c33 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wxaCommLib");
                throw null;
            }
            java.lang.String mo49188x6476c63b = interfaceC11702x4ae7c33.getF172191d().mo49188x6476c63b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo49188x6476c63b);
            return mo49188x6476c63b;
        }
        if (interfaceC11702x4ae7c33 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wxaCommLib");
            throw null;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(interfaceC11702x4ae7c33.Y0());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        return a17;
    }

    @Override // jc3.x
    public void f(yz5.l cb6) {
        java.lang.Object j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.f344094f;
        if (interfaceC11702x4ae7c33 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wxaCommLib");
            throw null;
        }
        android.content.res.AssetFileDescriptor G0 = interfaceC11702x4ae7c33.G0("WAMagicBrushMainContext.js");
        if (G0 != null) {
            j0Var = new lc3.d(G0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c332 = this.f344094f;
            if (interfaceC11702x4ae7c332 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wxaCommLib");
                throw null;
            }
            java.lang.String M = interfaceC11702x4ae7c332.M("WAMagicBrushMainContext.js");
            if (M == null) {
                M = "";
            }
            j0Var = new lc3.j0(M);
        }
        linkedList.add(j0Var);
        cb6.mo146xb9724478(linkedList);
    }

    @Override // jc3.x
    public java.lang.String g() {
        return "weuse";
    }

    @Override // jc3.x
    /* renamed from: release */
    public void mo66315x41012807() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f344096h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.f344094f;
        if (interfaceC11702x4ae7c33 != null) {
            interfaceC11702x4ae7c33.close();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = this.f344095g;
        if (u1Var != null) {
            u1Var.mo49309x41012807();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = this.f344097i;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i17 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i18 = 0; i18 < readHoldCount; i18++) {
            readLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            try {
                java.util.Collection values = concurrentHashMap.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                java.util.Iterator it = values.iterator();
                while (it.hasNext()) {
                    ((fj1.t) it.next()).f344671b.mo49253x5a5ddf8();
                }
            } finally {
                concurrentHashMap.clear();
            }
        } finally {
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
        }
    }
}
