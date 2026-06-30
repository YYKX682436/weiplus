package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class f9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f157068d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4[] f157069e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f157070f = new java.util.HashMap();

    public f9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f157068d = c11510xdd90c2f2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: accept */
    public boolean mo49299xab27b508(java.lang.String str) {
        try {
            b().k(str);
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: access */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49300xab27b564(java.lang.String str) {
        boolean d17 = b().d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var3 = !d17 ? j1Var : j1Var2;
        if (j1Var3 == j1Var) {
            if (str.length() == 0) {
                return j1Var;
            }
            java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
            if (!b17.substring(b17.length() - 1).equals("/")) {
                b17 = b17.concat("/");
            }
            java.util.List<java.lang.String> e17 = b().e();
            if (e17 == null) {
                e17 = java.util.Collections.emptyList();
            }
            java.util.Iterator<java.lang.String> it = e17.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (next == null) {
                    next = "";
                }
                if (next.startsWith(b17)) {
                    return j1Var2;
                }
            }
        }
        return j1Var3;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4[] a4VarArr = this.f157069e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 a4Var = a4VarArr[0];
        if (a4Var == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z3.f157621a == a4Var) {
            synchronized (a4VarArr) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4[] a4VarArr2 = this.f157069e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 a4Var2 = a4VarArr2[0];
                if (a4Var2 == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z3.f157621a == a4Var2) {
                    a4VarArr2[0] = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(this.f157068d, false);
                }
            }
        }
        return this.f157069e[0];
    }

    public final void c(java.lang.String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
            return;
        }
        while (!str.equals("")) {
            if (str.endsWith("/")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
                return;
            }
            str = str.substring(0, str.lastIndexOf("/"));
            boolean equals = str.equals("");
            java.util.Map map = this.f157070f;
            if (equals) {
                ((java.util.HashMap) map).put("/", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            } else {
                ((java.util.HashMap) map).put(str.concat("/"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: getAbsoluteFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49301x1d537609(java.lang.String str, boolean z17) {
        if (!z17) {
            if (mo49303x5fd6f23(str) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                return null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af = b().mo49254xc00e82af(str);
        if (mo49254xc00e82af == null) {
            return null;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y5.a(mo49254xc00e82af.f157576d, mo49254xc00e82af.f157578f);
        if (android.text.TextUtils.isEmpty(a17)) {
            return null;
        }
        return new com.p314xaae8f345.mm.vfs.r6(a17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: initialize */
    public void mo49302x33ebcb90() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: isdir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49303x5fd6f23(java.lang.String str) {
        return mo49305x40654317(str, new ik1.b0());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: openReadPartialInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 mo49304xc00e82af(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af = b().mo49254xc00e82af(str);
        if (mo49254xc00e82af != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46(mo49254xc00e82af.f157577e, mo49254xc00e82af.f157578f, mo49254xc00e82af.f157579g, mo49254xc00e82af.f157580h);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readDir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49305x40654317(java.lang.String str, ik1.b0 b0Var) {
        boolean d17 = b().d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if ((!d17 ? j1Var : j1Var2) == j1Var2) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_IS_FILE;
        }
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
        java.util.List<java.lang.String> e17 = b().e();
        if (e17 == null) {
            return j1Var;
        }
        java.lang.String quote = java.util.regex.Pattern.quote(b17);
        java.util.Iterator<java.lang.String> it = e17.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if ((next == null ? "" : next).startsWith(b17)) {
                java.lang.String replaceFirst = next.replaceFirst(quote, "");
                if (replaceFirst.split("/").length <= 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h1();
                    h1Var.f157726a = replaceFirst;
                    b0Var.f373357a = b0Var.f373357a == null ? new java.util.LinkedList() : (java.util.List) b0Var.f373357a;
                    ((java.util.List) b0Var.f373357a).add(h1Var);
                }
            }
        }
        return b0Var.f373357a == null ? j1Var : j1Var2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49306xcc440832(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        long available;
        java.nio.ByteBuffer byteBuffer;
        java.io.InputStream i17 = b().i(str);
        if (i17 == null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        }
        try {
            if (j18 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                try {
                    available = i17.available() - j17;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", e17, "readFile", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(i17);
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
                }
            } else {
                available = j18;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 a17 = a(j17, available, i17.available());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
            if (a17 != j1Var) {
                return a17;
            }
            if ((j17 == 0 && available == ((long) i17.available())) && (i17 instanceof nf.a)) {
                byteBuffer = java.nio.ByteBuffer.allocateDirect(i17.available());
                byteBuffer.put(((nf.a) i17).f418105d);
            } else {
                byte[] c17 = ik1.f.c(i17, j17, available);
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(c17.length);
                allocateDirect.put(java.nio.ByteBuffer.wrap(c17));
                byteBuffer = allocateDirect;
            }
            byteBuffer.rewind();
            b0Var.f373357a = byteBuffer;
            c(str);
            return j1Var;
        } finally {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readZipEntry */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49308xa09c5587(java.lang.String str, ik1.b0 b0Var, java.lang.String str2, long j17, long j18) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.e(mo49301x1d537609(str, false).o(), b0Var, str2, j17, j18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: release */
    public void mo49309x41012807() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4[] a4VarArr = this.f157069e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 a4Var = a4VarArr[0];
        if (a4Var == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z3.f157621a == a4Var) {
            synchronized (a4VarArr) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 a4Var2 = this.f157069e[0];
                if (a4Var2 != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z3.f157621a != a4Var2) {
                }
                return;
            }
        }
        this.f157069e[0].mo49253x5a5ddf8();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: stat */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49310x360654(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685 c11700x155a0685) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 l17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af = b().mo49254xc00e82af(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if (mo49254xc00e82af != null) {
            mo49254xc00e82af.f157576d.q().m49607x15990000(c11700x155a0685);
            c11700x155a0685.f33490x8ecf5f1f = mo49254xc00e82af.f157580h;
            return j1Var;
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        boolean d17 = b().d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        if ((!d17 ? j1Var2 : j1Var) != j1Var2 || (l17 = b().l(str)) == null) {
            return j1Var2;
        }
        l17.q().m49607x15990000(c11700x155a0685);
        c11700x155a0685.m49610xc97826ca();
        c11700x155a0685.f33490x8ecf5f1f = 0L;
        java.lang.Long l18 = (java.lang.Long) ((java.util.HashMap) this.f157070f).get(str);
        if (l18 == null) {
            return j1Var;
        }
        c11700x155a0685.f33486x4a239f50 = l18.longValue();
        return j1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: statDir */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49311x8eeb7599(java.lang.String str, java.util.List list) {
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "statDir: path = [%s] is illegal", str);
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_PERMISSION_DENIED;
        }
        for (java.lang.String str2 : b().e()) {
            if (str2 != null && str2.startsWith(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h2(str2);
                java.lang.String name = mo49310x360654(str2, h2Var).name();
                if (name.equals("OK")) {
                    list.add(h2Var);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "statDir: stat [%s] fail:[%s]", str2, name);
                }
            }
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832(java.lang.String str, ik1.b0 b0Var) {
        java.io.InputStream i17 = b().i(str);
        if (i17 == null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        }
        try {
            try {
                int available = i17.available();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(i17);
                return mo49306xcc440832(str, 0L, available, b0Var);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", e17, "readFile", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(i17);
                return j1Var;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(i17);
            throw th6;
        }
    }
}
