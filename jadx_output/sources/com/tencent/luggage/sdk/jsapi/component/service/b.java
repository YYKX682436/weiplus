package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public abstract class b implements bl.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f47384d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f47385e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.String f47386f;

    public b(com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        this.f47384d = new java.lang.ref.WeakReference(mVar);
    }

    @Override // bl.a
    public com.tencent.mm.appbrand.commonjni.BatchRequestWxaFileDescriptorsResponse A(java.lang.String[] strArr, java.util.Map map) {
        com.tencent.mm.plugin.appbrand.jsapi.m mVar = (com.tencent.mm.plugin.appbrand.jsapi.m) this.f47384d.get();
        com.tencent.mm.appbrand.commonjni.BatchRequestWxaFileDescriptorsResponse batchRequestWxaFileDescriptorsResponse = null;
        if (mVar == null) {
            return null;
        }
        if (mVar instanceof com.tencent.mm.plugin.appbrand.y) {
            com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) mVar;
            if (strArr != null && strArr.length != 0) {
                batchRequestWxaFileDescriptorsResponse = new com.tencent.mm.appbrand.commonjni.BatchRequestWxaFileDescriptorsResponse();
                batchRequestWxaFileDescriptorsResponse.keyPath = com.tencent.mm.plugin.appbrand.utils.e3.a();
                java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
                com.tencent.mm.plugin.appbrand.appcache.y3 M0 = yVar.M0();
                java.util.Objects.requireNonNull(M0);
                for (java.lang.String str : strArr) {
                    com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = M0.openReadPartialInfo(str);
                    if (openReadPartialInfo != null) {
                        com.tencent.mm.appbrand.commonjni.V8ScriptWxaFileDescriptor v8ScriptWxaFileDescriptor = new com.tencent.mm.appbrand.commonjni.V8ScriptWxaFileDescriptor();
                        v8ScriptWxaFileDescriptor.wxaFileName = openReadPartialInfo.f76045f;
                        v8ScriptWxaFileDescriptor.wxaPkgPath = openReadPartialInfo.f76044e;
                        arrayList.add(v8ScriptWxaFileDescriptor);
                    }
                }
                batchRequestWxaFileDescriptorsResponse.fds = (com.tencent.mm.appbrand.commonjni.V8ScriptWxaFileDescriptor[]) arrayList.toArray(new com.tencent.mm.appbrand.commonjni.V8ScriptWxaFileDescriptor[0]);
            }
        }
        return batchRequestWxaFileDescriptorsResponse;
    }

    @Override // bl.a
    public java.lang.String[] T() {
        java.lang.ref.WeakReference weakReference = this.f47384d;
        if (weakReference.get() != null) {
            return ((com.tencent.mm.plugin.appbrand.jsapi.m) weakReference.get()).k0();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AbsAppBrandDelegate", "hy: component released when getAsyncableJsApis");
        return new java.lang.String[0];
    }

    public com.tencent.mm.plugin.appbrand.jsruntime.t a(int i17) {
        return null;
    }

    @Override // bl.a
    public java.lang.String c0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, int i19) {
        com.tencent.mm.plugin.appbrand.jsruntime.t a17;
        if (this.f47384d.get() != null && !this.f47385e.get()) {
            if (i18 > 0) {
                try {
                    a17 = a(i18);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AbsAppBrandDelegate", th6, "nativeInvokeHandler", new java.lang.Object[0]);
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.luggage.sdk.jsapi.component.service.a(this, th6));
                    return "";
                }
            } else {
                a17 = null;
            }
            return ((com.tencent.mm.plugin.appbrand.jsapi.m) this.f47384d.get()).q0(str, str2, str3, i17, z17, a17, i19);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AbsAppBrandDelegate", "hy: component released when nativeInvokeHandler: %s, %s, %d, %b", str, str2, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        java.lang.String str4 = this.f47386f;
        if (!android.text.TextUtils.isEmpty(str4)) {
            try {
                return new org.json.JSONObject().put("errMsg", str + ":" + str4).toString();
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    @Override // bl.a
    public void d(java.lang.String str) {
        z65.c.b(android.util.Base64.encodeToString(str.getBytes(), 2), "appbrand_commonbinding");
    }

    @Override // bl.a
    public void g(int i17, int i18, int i19) {
        try {
            jx3.f.INSTANCE.w(i17, i18, i19);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // bl.a
    public boolean h0(int i17, java.lang.String str, java.lang.String str2) {
        return false;
    }

    @Override // bl.a
    public java.nio.ByteBuffer l0(java.lang.String str) {
        if (this.f47384d.get() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbsAppBrandDelegate", "hy: component released when readWeAppFile");
            return null;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = ((com.tencent.mm.plugin.appbrand.jsapi.m) this.f47384d.get()).getFileSystem();
        java.util.Objects.requireNonNull(fileSystem);
        com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = fileSystem.readFile(str, b0Var);
        if (readFile == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            return com.tencent.mm.plugin.appbrand.utils.v3.a((java.nio.ByteBuffer) b0Var.f291824a);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AbsAppBrandDelegate", "readFile %s failed: %s", str, readFile);
        return null;
    }

    @Override // bl.a
    public java.lang.String o0(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader;
        com.tencent.mm.plugin.appbrand.jsapi.m mVar = (com.tencent.mm.plugin.appbrand.jsapi.m) this.f47384d.get();
        if (mVar == null || (iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) mVar.q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class)) == null) {
            return null;
        }
        return iCommLibReader.M(str);
    }

    @Override // bl.a
    public java.nio.ByteBuffer p(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f47384d;
        if (weakReference.get() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbsAppBrandDelegate", "hy: component released when readWeAppFile");
            return null;
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) ((com.tencent.mm.plugin.appbrand.jsapi.m) weakReference.get()).q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class);
        if (iCommLibReader == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbsAppBrandDelegate", "commLibReader null");
            return null;
        }
        java.io.InputStream a17 = iCommLibReader.a(str);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbsAppBrandDelegate", "commLibReader openRead null");
            return null;
        }
        byte[] b17 = ik1.f.b(a17);
        if (b17.length != 0) {
            return com.tencent.mm.plugin.appbrand.utils.v3.e(b17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AbsAppBrandDelegate", "commLibReader byteArray null");
        return null;
    }

    @Override // bl.a
    public void r0(int i17, java.lang.String str) {
    }

    @Override // bl.a
    public void reportKV(int i17, java.lang.String str) {
        try {
            jx3.f.INSTANCE.kvStat(i17, str);
        } catch (java.lang.Exception unused) {
        }
    }
}
