package com.p314xaae8f345.mm.p2818xd0d82df3;

/* loaded from: classes7.dex */
public final class s extends ea5.l {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: addToPeriod */
    public boolean mo40417x561213dd() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_xnet_npu_udr_switch, 0) != 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1868L, z17 ? 8L : 7L, 1L, true);
        if (!z17) {
            return com.p314xaae8f345.mm.p2818xd0d82df3.v.f295912a.a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRXNetNPULibsFeatureService", " [addToPeriod]: clicfg_android_xnet_npu_udr_switch=false");
        return false;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getParameter */
    public java.util.ArrayList mo14972x73ec24f3() {
        java.lang.Object obj;
        java.util.ArrayList d17 = com.p314xaae8f345.mm.p2818xd0d82df3.v.f295912a.d();
        java.util.Iterator it = d17.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.f299117m[1] ? vVar.f299111d : "", "ro_soc_model")) {
                break;
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v) obj;
        java.lang.String str = vVar2 != null ? vVar2.f299117m[6] ? vVar2.f299116i : "" : null;
        java.lang.String str2 = str != null ? str : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRXNetNPULibsFeatureService", " getParameter: ro_soc_model=".concat(str2));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1868L, str2.length() > 0 ? 11L : 12L, 1L, true);
        return d17;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_57353131";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1868L, 9L, 1L, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8(resource.m117639xfb83cc9b());
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(resource.c(), "unpack").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        if (!y8Var.a()) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.u(o17);
        java.util.Iterator it = new java.util.LinkedList(y8Var.f157605h.keySet()).iterator();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = null;
        while (true) {
            if (!it.hasNext()) {
                if (atomicBoolean != null && atomicBoolean.get()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1868L, 10L, 1L, true);
                    return;
                }
                return;
            }
            java.lang.String str = (java.lang.String) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (r26.i0.n(str, ".so", false)) {
                java.io.InputStream c17 = y8Var.c(str);
                try {
                    java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(o17, str).o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
                    try {
                        com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(o18);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = c17.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    y6Var.write(bArr, 0, read);
                                }
                            }
                            vz5.b.a(y6Var, null);
                            vz5.b.a(c17, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRXNetNPULibsFeatureService", " postProcess unpack wxapkg " + str + " to " + o18 + " md5=[" + com.p314xaae8f345.mm.vfs.w6.p(o18) + ']');
                            if (atomicBoolean == null) {
                                atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
                            }
                        } finally {
                            try {
                                break;
                            } catch (java.lang.Throwable th6) {
                            }
                        }
                    } finally {
                        try {
                            break;
                        } catch (java.lang.Throwable th7) {
                        }
                    }
                } catch (java.io.IOException e17) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UDRXNetNPULibsFeatureService", " postProcess unpack wxapkg to dir fail: " + e17.getMessage());
                    atomicBoolean = atomicBoolean2;
                }
            }
        }
    }
}
