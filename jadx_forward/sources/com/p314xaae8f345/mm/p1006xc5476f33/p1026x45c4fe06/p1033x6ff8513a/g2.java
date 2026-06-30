package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class g2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f157722d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 f157723e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0();

    public g2(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f157722d = linkedList2;
        linkedList2.addAll(linkedList);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 a(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = this.f157723e;
        if (K0) {
            return u1Var;
        }
        java.util.Iterator it = this.f157722d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next();
            if (u1Var2.mo49299xab27b508(str)) {
                return u1Var2;
            }
        }
        return u1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: accept */
    public boolean mo49299xab27b508(java.lang.String str) {
        java.lang.String[] strArr = {"file://", "http://", "https://"};
        for (int i17 = 0; i17 < 3; i17++) {
            if (nf.z.d(str, strArr[i17])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: access */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49300xab27b564(java.lang.String str) {
        return a(str).mo49300xab27b564(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: allocTempFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class)).mo49614x6665a5c5(str);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b(java.lang.Class cls) {
        java.util.Iterator it = this.f157722d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next();
            if (cls.isInstance(u1Var)) {
                return u1Var;
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: canRenameFile */
    public boolean mo49615x4d74a9ca(java.lang.String str) {
        java.util.Iterator it = this.f157722d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next();
            if (u1Var.mo49299xab27b508(str) && u1Var.mo49615x4d74a9ca(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: canSaveToLocal */
    public boolean mo49616x4d737b83(java.lang.String str) {
        java.util.Iterator it = this.f157722d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next();
            if (u1Var.mo49299xab27b508(str) && !u1Var.mo49616x4d737b83(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: copyTo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49618xaf40b0d0(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var, boolean z17) {
        return a(str).mo49618xaf40b0d0(str, r6Var, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: createTempFileFrom */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256;
        java.util.Iterator it = this.f157722d.iterator();
        do {
            boolean hasNext = it.hasNext();
            j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_NOT_SUPPORTED;
            if (!hasNext) {
                return j1Var;
            }
            mo49619x6aa75256 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next()).mo49619x6aa75256(r6Var, str, z17, b0Var);
        } while (mo49619x6aa75256 == j1Var);
        return mo49619x6aa75256;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getAbsoluteFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609(java.lang.String str) {
        return mo49301x1d537609(str, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getPrivateAbsoluteFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49621x2f1a0d80(java.lang.String str) {
        return a(str).mo49621x2f1a0d80(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getSavedFileList */
    public java.util.List mo49622x91aa142b() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class)).mo49622x91aa142b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getStorageSpaceStatistics */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 mo49623xfc54b5c4() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getTempDirectory */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49624x5d68c543(ik1.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49624x5d68c543;
        java.util.Iterator it = this.f157722d.iterator();
        do {
            boolean hasNext = it.hasNext();
            j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_NOT_SUPPORTED;
            if (!hasNext) {
                return j1Var;
            }
            mo49624x5d68c543 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next()).mo49624x5d68c543(b0Var);
        } while (mo49624x5d68c543 == j1Var);
        return mo49624x5d68c543;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: initialize */
    public void mo49302x33ebcb90() {
        java.util.Iterator it = this.f157722d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next()).mo49302x33ebcb90();
        }
        this.f157723e.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: isSavedFile */
    public boolean mo49625x51687e99(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class)).mo49625x51687e99(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: isdir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49303x5fd6f23(java.lang.String str) {
        return a(str).mo49303x5fd6f23(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: mkdir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49626x6322a2f(java.lang.String str, boolean z17) {
        return a(str).mo49626x6322a2f(str, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readDir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49305x40654317(java.lang.String str, ik1.b0 b0Var) {
        return a(str).mo49305x40654317(str, b0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832(java.lang.String str, ik1.b0 b0Var) {
        return a(str).mo49307xcc440832(str, b0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: readStream */
    public final java.io.InputStream mo49627xe22f8cb6(java.lang.String str) {
        return a(str).mo49627xe22f8cb6(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readZipEntry */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49308xa09c5587(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18) {
        return a(str).mo49308xa09c5587(str, b0Var, str2, j17, j18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: release */
    public void mo49309x41012807() {
        java.util.Iterator it = this.f157722d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next();
            if (u1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) u1Var).b();
            }
            u1Var.mo49309x41012807();
        }
        this.f157723e.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: removeSavedFile */
    public boolean mo49628x8907b87f(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1.class)).mo49628x8907b87f(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: resolvePath */
    public com.p314xaae8f345.mm.vfs.r6 mo49629x74638431(java.lang.String str) {
        return a(str).mo49629x74638431(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: rmdir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49630x6798872(java.lang.String str, boolean z17) {
        return a(str).mo49630x6798872(str, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: saveFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49631x84702499(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, ik1.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49631x84702499;
        java.util.Iterator it = this.f157722d.iterator();
        do {
            boolean hasNext = it.hasNext();
            j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_NOT_SUPPORTED;
            if (!hasNext) {
                return j1Var;
            }
            mo49631x84702499 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next()).mo49631x84702499(r6Var, str, b0Var);
        } while (mo49631x84702499 == j1Var);
        return mo49631x84702499;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: stat */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49310x360654(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685 c11700x155a0685) {
        return a(str).mo49310x360654(str, c11700x155a0685);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: statDir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49311x8eeb7599(java.lang.String str, java.util.List list) {
        return a(str).mo49311x8eeb7599(str, list);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: unlink */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49633xcde7ca13(java.lang.String str) {
        return a(str).mo49633xcde7ca13(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: unzip */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49634x6a495e8(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        return a(str).mo49634x6a495e8(str, r6Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: writeFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49635xac26b9fb(java.lang.String str, java.io.InputStream inputStream, boolean z17) {
        return a(str).mo49635xac26b9fb(str, inputStream, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: getAbsoluteFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49301x1d537609(java.lang.String str, boolean z17) {
        return a(str).mo49301x1d537609(str, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49306xcc440832(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        return a(str).mo49306xcc440832(str, j17, j18, b0Var);
    }
}
