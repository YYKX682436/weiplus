package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b0 f156984a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b0();

    public final org.p3343x72743996.net.AbstractC29563x9a627640 a(java.lang.String url, java.util.ArrayList arrayList, com.p314xaae8f345.mm.vfs.r6 filePath, long j17, org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442 listener, yz5.p pVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z(filePath, z17);
        zVar.f157614c = listener;
        if (pVar != null) {
            zVar.f157616e = pVar;
        }
        rc.c cVar = rc.b.f475439a;
        org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153158x92e7539b = cVar.f475440a.mo153158x92e7539b(url, zVar, cVar.f475441b);
        mo153158x92e7539b.mo153272x492a458b("GET");
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                mo153158x92e7539b.mo153266xec6c8a8e((java.lang.String) lVar.f384366d, (java.lang.String) lVar.f384367e);
            }
        }
        if (z17 && filePath.m()) {
            filePath.C();
            mo153158x92e7539b.mo153266xec6c8a8e("Range", "bytes=" + filePath.C() + '-');
        }
        org.p3343x72743996.net.AbstractC29563x9a627640 mo153269x59bc66e = mo153158x92e7539b.mo153269x59bc66e();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a0(mo153269x59bc66e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(a0Var, j17, null);
        mo153269x59bc66e.mo153671x68ac462();
        return mo153269x59bc66e;
    }
}
