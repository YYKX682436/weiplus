package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public abstract class b implements bl.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f128917d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f128918e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.String f128919f;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar) {
        this.f128917d = new java.lang.ref.WeakReference(mVar);
    }

    @Override // bl.a
    public com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5131x1c4cfc5e A(java.lang.String[] strArr, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m) this.f128917d.get();
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5131x1c4cfc5e c5131x1c4cfc5e = null;
        if (mVar == null) {
            return null;
        }
        if (mVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) mVar;
            if (strArr != null && strArr.length != 0) {
                c5131x1c4cfc5e = new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5131x1c4cfc5e();
                c5131x1c4cfc5e.f21474xcf632f24 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.a();
                java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 M0 = yVar.M0();
                java.util.Objects.requireNonNull(M0);
                for (java.lang.String str : strArr) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af = M0.mo49254xc00e82af(str);
                    if (mo49254xc00e82af != null) {
                        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5135x5683f13e c5135x5683f13e = new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5135x5683f13e();
                        c5135x5683f13e.f21478xbeaa57e7 = mo49254xc00e82af.f157578f;
                        c5135x5683f13e.f21479xaee3fa51 = mo49254xc00e82af.f157577e;
                        arrayList.add(c5135x5683f13e);
                    }
                }
                c5131x1c4cfc5e.fds = (com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5135x5683f13e[]) arrayList.toArray(new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5135x5683f13e[0]);
            }
        }
        return c5131x1c4cfc5e;
    }

    @Override // bl.a
    public java.lang.String[] T() {
        java.lang.ref.WeakReference weakReference = this.f128917d;
        if (weakReference.get() != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m) weakReference.get()).k0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbsAppBrandDelegate", "hy: component released when getAsyncableJsApis");
        return new java.lang.String[0];
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t a(int i17) {
        return null;
    }

    @Override // bl.a
    public java.lang.String c0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t a17;
        if (this.f128917d.get() != null && !this.f128918e.get()) {
            if (i18 > 0) {
                try {
                    a17 = a(i18);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AbsAppBrandDelegate", th6, "nativeInvokeHandler", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a(this, th6));
                    return "";
                }
            } else {
                a17 = null;
            }
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m) this.f128917d.get()).q0(str, str2, str3, i17, z17, a17, i19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbsAppBrandDelegate", "hy: component released when nativeInvokeHandler: %s, %s, %d, %b", str, str2, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        java.lang.String str4 = this.f128919f;
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
        if (this.f128917d.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbsAppBrandDelegate", "hy: component released when readWeAppFile");
            return null;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m) this.f128917d.get()).mo50354x59eafec1();
        java.util.Objects.requireNonNull(mo50354x59eafec1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832 = mo50354x59eafec1.mo49307xcc440832(str, b0Var);
        if (mo49307xcc440832 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.a((java.nio.ByteBuffer) b0Var.f373357a);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbsAppBrandDelegate", "readFile %s failed: %s", str, mo49307xcc440832);
        return null;
    }

    @Override // bl.a
    public java.lang.String o0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m) this.f128917d.get();
        if (mVar == null || (interfaceC11702x4ae7c33 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) mVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class)) == null) {
            return null;
        }
        return interfaceC11702x4ae7c33.M(str);
    }

    @Override // bl.a
    public java.nio.ByteBuffer p(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f128917d;
        if (weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbsAppBrandDelegate", "hy: component released when readWeAppFile");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m) weakReference.get()).q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class);
        if (interfaceC11702x4ae7c33 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbsAppBrandDelegate", "commLibReader null");
            return null;
        }
        java.io.InputStream a17 = interfaceC11702x4ae7c33.a(str);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbsAppBrandDelegate", "commLibReader openRead null");
            return null;
        }
        byte[] b17 = ik1.f.b(a17);
        if (b17.length != 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(b17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbsAppBrandDelegate", "commLibReader byteArray null");
        return null;
    }

    @Override // bl.a
    public void r0(int i17, java.lang.String str) {
    }

    @Override // bl.a
    /* renamed from: reportKV */
    public void mo10303xe68be19f(int i17, java.lang.String str) {
        try {
            jx3.f.INSTANCE.mo68478xbd3cda5f(i17, str);
        } catch (java.lang.Exception unused) {
        }
    }
}
