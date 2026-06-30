package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 f129035a;

    /* renamed from: b, reason: collision with root package name */
    public final u81.f f129036b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f129037c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f129038d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f129039e = new java.lang.Object();

    public n2() {
        sk1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f129035a = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.j2(this);
        this.f129036b = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.l2(this);
    }

    public final java.nio.ByteBuffer a(byte[] bArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.flip();
        return allocateDirect;
    }

    public final java.util.List b(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54) entry.getValue();
            byte[] bArr = c12540xf7cdfd54.f168926d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getForegroundBytes(...)");
            java.nio.ByteBuffer a17 = a(bArr);
            byte[] bArr2 = c12540xf7cdfd54.f168927e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr2, "getBackgroundBytes(...)");
            java.nio.ByteBuffer a18 = a(bArr2);
            byte[] bArr3 = c12540xf7cdfd54.f168928f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr3, "getSuspendBytes(...)");
            arrayList.add(new vp5.g(new vp5.f(a17, a18, a(bArr3)), str));
        }
        return arrayList;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd54;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd542;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd543;
        si1.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f129038d = runtime;
        runtime.N.a(this.f129036b);
        synchronized (this.f129039e) {
            this.f129037c = runtime.C0();
        }
        ze.n nVar = (ze.n) runtime;
        si1.g gVar = nVar.X1;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeAppCoreJsApiBridge", "runtimeReady: permissionCtrl is null");
            return;
        }
        synchronized (gVar.f489784e) {
            c12540xf7cdfd54 = gVar.f489785f;
        }
        byte[] bArr = c12540xf7cdfd54.f168926d;
        synchronized (gVar.f489784e) {
            c12540xf7cdfd542 = gVar.f489785f;
        }
        byte[] bArr2 = c12540xf7cdfd542.f168927e;
        synchronized (gVar.f489784e) {
            c12540xf7cdfd543 = gVar.f489785f;
        }
        byte[] bArr3 = c12540xf7cdfd543.f168928f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr);
        java.nio.ByteBuffer a17 = a(bArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr2);
        java.nio.ByteBuffer a18 = a(bArr2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr3);
        vp5.f fVar = new vp5.f(a17, a18, a(bArr3));
        synchronized (gVar.f489786g) {
            java.util.HashMap hashMap = gVar.f489787h;
            hVar = (hashMap == null || hashMap.isEmpty()) ? null : new si1.h(gVar);
        }
        java.util.List<vp5.g> b17 = b(hVar);
        java.lang.String str = x51.o1.f533593m;
        if (str == null) {
            str = "";
        }
        boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "1");
        com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 abstractC22919x419b2652 = this.f129035a;
        if (abstractC22919x419b2652 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo48802x59eafec1 = runtime.mo48802x59eafec1();
        if (mo48802x59eafec1 != null) {
            if (!(mo48802x59eafec1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2)) {
                throw new java.lang.IllegalStateException("getFileSystem not LuggageFileSystemRegistry".toString());
            }
            java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1> linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2) mo48802x59eafec1).f157722d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getOrderedFileSystemList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var : linkedList) {
                if (u1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) u1Var;
                    java.lang.String str2 = j3Var.f157758d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getRootPath(...)");
                    java.lang.String str3 = j3Var.f157759e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getPathPrefix(...)");
                    arrayList.add(new vp5.e(false, str3, str2, j3Var.f157760f));
                } else if (u1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) u1Var;
                    java.lang.String str4 = n1Var.f157809e;
                    java.lang.String str5 = n1Var.f157810f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                    arrayList.add(new vp5.e(true, str5, str4, 0L));
                }
            }
            abstractC22919x419b2652.m83331x8db6e66d(arrayList);
        }
        long j18 = nVar.E0() == null ? 0L : nVar.E0().f387385r.f33456x1c82a56c;
        long j19 = nVar.E0() != null ? nVar.E0().f387385r.f156932d + 1 : 0L;
        java.lang.String str6 = nVar.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str6, "getAppId(...)");
        vp5.i iVar = new vp5.i(str6, j18, j19, j17, b18);
        com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 abstractC22919x419b26522 = this.f129035a;
        if (abstractC22919x419b26522 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
            throw null;
        }
        abstractC22919x419b26522.m83336x72a140ab(iVar, fVar, b17);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.m2 m2Var = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.m2(this);
        synchronized (gVar.f489784e) {
            ((java.util.ArrayList) gVar.f489790k).add(m2Var);
        }
    }
}
