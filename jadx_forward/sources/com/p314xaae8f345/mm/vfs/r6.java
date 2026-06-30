package com.p314xaae8f345.mm.vfs;

/* loaded from: classes7.dex */
public class r6 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.z7 f294699d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.z2 f294700e;

    public r6(java.lang.String str) {
        this(com.p314xaae8f345.mm.vfs.z7.a(str));
    }

    public static com.p314xaae8f345.mm.vfs.r6 j(java.io.File file) {
        if (file != null) {
            return new com.p314xaae8f345.mm.vfs.r6(file);
        }
        return null;
    }

    public boolean A() {
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.z2 M = M();
        return (!M.a() || (m17 = M.f294799a.m(M.f294800b)) == null || m17.f294769f) ? false : true;
    }

    public long B() {
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (M.a() && (m17 = M.f294799a.m(M.f294800b)) != null) {
            return m17.f294768e;
        }
        return 0L;
    }

    public long C() {
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (M.a() && (m17 = M.f294799a.m(M.f294800b)) != null) {
            return m17.f294766c;
        }
        return 0L;
    }

    public java.lang.String[] D() {
        java.lang.Iterable C;
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (!M.a() || (C = M.f294799a.C(M.f294800b)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = C.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public java.lang.String[] E(com.p314xaae8f345.mm.vfs.b7 b7Var) {
        java.lang.Iterable<java.lang.String> C;
        if (b7Var == null) {
            return D();
        }
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (!M.a() || (C = M.f294799a.C(M.f294800b)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : C) {
            if (b7Var.a(this, str)) {
                arrayList.add(str);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public com.p314xaae8f345.mm.vfs.r6[] G() {
        java.lang.Iterable C;
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (!M.a() || (C = M.f294799a.C(M.f294800b)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = C.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p314xaae8f345.mm.vfs.r6((java.lang.String) it.next(), this.f294699d));
        }
        return (com.p314xaae8f345.mm.vfs.r6[]) arrayList.toArray(new com.p314xaae8f345.mm.vfs.r6[0]);
    }

    public com.p314xaae8f345.mm.vfs.r6[] H(com.p314xaae8f345.mm.vfs.t6 t6Var) {
        java.lang.Iterable C;
        if (t6Var == null) {
            return G();
        }
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (!M.a() || (C = M.f294799a.C(M.f294800b)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = C.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6((java.lang.String) it.next(), this.f294699d);
            if (t6Var.mo40607xab27b508(r6Var)) {
                arrayList.add(r6Var);
            }
        }
        return (com.p314xaae8f345.mm.vfs.r6[]) arrayList.toArray(new com.p314xaae8f345.mm.vfs.r6[0]);
    }

    public com.p314xaae8f345.mm.vfs.r6[] I(com.p314xaae8f345.mm.vfs.b7 b7Var) {
        java.lang.Iterable<java.lang.String> C;
        if (b7Var == null) {
            return G();
        }
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (!M.a() || (C = M.f294799a.C(M.f294800b)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : C) {
            if (b7Var.a(this, str)) {
                arrayList.add(new com.p314xaae8f345.mm.vfs.r6(str, this.f294699d));
            }
        }
        return (com.p314xaae8f345.mm.vfs.r6[]) arrayList.toArray(new com.p314xaae8f345.mm.vfs.r6[0]);
    }

    public boolean J() {
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (M.a()) {
            return M.f294799a.r(M.f294800b);
        }
        return false;
    }

    public boolean L(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        com.p314xaae8f345.mm.vfs.z2 M = M();
        com.p314xaae8f345.mm.vfs.z2 M2 = r6Var.M();
        if (M.a() && M2.a()) {
            try {
                return M2.f294799a.t(M2.f294800b, M.f294799a, M.f294800b);
            } catch (java.io.IOException unused) {
            }
        }
        return false;
    }

    public com.p314xaae8f345.mm.vfs.z2 M() {
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(this.f294699d, this.f294700e);
        this.f294700e = m17;
        return m17;
    }

    public boolean N(long j17) {
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (M.a()) {
            return M.f294799a.n(M.f294800b, j17);
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return u().compareTo(((com.p314xaae8f345.mm.vfs.r6) obj).u());
    }

    /* renamed from: equals */
    public boolean m82466xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.r6)) {
            return false;
        }
        return this.f294699d.m82497xb2c87fbf(((com.p314xaae8f345.mm.vfs.r6) obj).f294699d);
    }

    /* renamed from: getName */
    public java.lang.String m82467xfb82e301() {
        java.lang.String str = this.f294699d.f294812f;
        int lastIndexOf = str.lastIndexOf("/");
        return lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1);
    }

    public boolean h() {
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (!M.a()) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.q2 q2Var = M.f294799a;
        java.lang.String str = M.f294800b;
        java.lang.String D = q2Var.D(str, false);
        return D != null ? new java.io.File(D).canRead() : q2Var.F(str);
    }

    /* renamed from: hashCode */
    public int m82468x8cdac1b() {
        return u().hashCode() ^ 1234321;
    }

    public boolean i() {
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (!M.a()) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.q2 q2Var = M.f294799a;
        if ((q2Var.o() & 1) == 0) {
            return false;
        }
        java.lang.String str = M.f294800b;
        java.lang.String D = q2Var.D(str, true);
        return D != null ? new java.io.File(D).canWrite() : q2Var.F(str);
    }

    public boolean k() {
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (!M.a()) {
            throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + this.f294699d);
        }
        com.p314xaae8f345.mm.vfs.q2 q2Var = M.f294799a;
        java.lang.String str = M.f294800b;
        if (q2Var.F(str)) {
            return false;
        }
        q2Var.c(str, false).close();
        return true;
    }

    public boolean l() {
        com.p314xaae8f345.mm.vfs.z2 M = M();
        return M.a() && M.f294799a.d(M.f294800b);
    }

    public boolean m() {
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (M.a()) {
            return M.f294799a.F(M.f294800b);
        }
        return false;
    }

    public com.p314xaae8f345.mm.vfs.r6 n() {
        return new com.p314xaae8f345.mm.vfs.r6((java.lang.String) null, p());
    }

    public java.lang.String o() {
        return p().m82499x9616526c();
    }

    public final com.p314xaae8f345.mm.vfs.z7 p() {
        com.p314xaae8f345.mm.vfs.z7 z7Var = this.f294699d;
        java.lang.String str = z7Var.f294812f;
        boolean z17 = true;
        if (!(z7Var.f294810d != null) && (str.length() <= 0 || str.charAt(0) != '/')) {
            z17 = false;
        }
        if (z17) {
            return z7Var;
        }
        java.lang.String str2 = z7Var.f294812f;
        java.lang.String property = java.lang.System.getProperty("user.dir");
        if (!str2.isEmpty()) {
            property = property + '/' + str2;
        }
        return new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, property, z7Var.f294813g, z7Var.f294814h);
    }

    public java.lang.String r() {
        com.p314xaae8f345.mm.vfs.z7 t17 = t();
        if (t17 == null) {
            return null;
        }
        return t17.m82499x9616526c();
    }

    public com.p314xaae8f345.mm.vfs.r6 s() {
        com.p314xaae8f345.mm.vfs.z7 t17 = t();
        if (t17 == null) {
            return null;
        }
        return new com.p314xaae8f345.mm.vfs.r6((java.lang.String) null, t17);
    }

    public com.p314xaae8f345.mm.vfs.z7 t() {
        com.p314xaae8f345.mm.vfs.z7 z7Var = this.f294699d;
        java.lang.String str = z7Var.f294812f;
        int length = str.length();
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1 || str.charAt(length - 1) == '/') {
            return null;
        }
        return new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, (str.indexOf(47) == lastIndexOf && str.charAt(0) == '/') ? str.substring(0, lastIndexOf + 1) : str.substring(0, lastIndexOf), z7Var.f294813g, z7Var.f294814h);
    }

    /* renamed from: toString */
    public java.lang.String m82469x9616526c() {
        return this.f294699d.m82499x9616526c();
    }

    public java.lang.String u() {
        return this.f294699d.m82499x9616526c();
    }

    public long w() {
        com.p314xaae8f345.mm.vfs.o2 g17;
        com.p314xaae8f345.mm.vfs.z2 M = M();
        if (M.a() && (g17 = M.f294799a.g(M.f294800b)) != null) {
            return g17.f294637c;
        }
        return 0L;
    }

    public boolean y() {
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.z2 M = M();
        return M.a() && (m17 = M.f294799a.m(M.f294800b)) != null && m17.f294769f;
    }

    public r6(com.p314xaae8f345.mm.vfs.z7 z7Var) {
        this.f294700e = null;
        java.lang.String str = z7Var.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!z7Var.f294812f.equals(l17)) {
                z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, l17, z7Var.f294813g, z7Var.f294814h);
            }
        }
        this.f294699d = z7Var;
    }

    public r6(android.net.Uri uri) {
        this(new com.p314xaae8f345.mm.vfs.z7(uri));
    }

    public r6(java.io.File file) {
        this.f294700e = null;
        this.f294699d = new com.p314xaae8f345.mm.vfs.z7(null, null, file.getPath(), null, null);
    }

    public r6(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f294700e = null;
        this.f294699d = r6Var.f294699d;
        this.f294700e = r6Var.f294700e;
    }

    public r6(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.z7 a17 = str == null ? null : com.p314xaae8f345.mm.vfs.z7.a(str);
        this.f294700e = null;
        if (a17 == null) {
            this.f294699d = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l(str2, false, false), null, null);
            return;
        }
        boolean isEmpty = str2.isEmpty();
        java.lang.String str3 = a17.f294812f;
        if (!isEmpty) {
            str3 = com.p314xaae8f345.mm.vfs.e8.l(str3 + '/' + str2, false, false);
        }
        this.f294699d = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, str3, a17.f294813g, a17.f294814h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r6(com.p314xaae8f345.mm.vfs.r6 r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            java.lang.String r4 = com.p314xaae8f345.mm.vfs.e8.l(r4, r0, r1)
            if (r3 != 0) goto Lb
            com.tencent.mm.vfs.z7 r3 = com.p314xaae8f345.mm.vfs.z7.f294809i
            goto Ld
        Lb:
            com.tencent.mm.vfs.z7 r3 = r3.f294699d
        Ld:
            r2.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.r6.<init>(com.tencent.mm.vfs.r6, java.lang.String):void");
    }

    public r6(java.io.File file, java.lang.String str) {
        this(new java.io.File(file, str));
    }

    public r6(java.lang.String str, com.p314xaae8f345.mm.vfs.z7 z7Var) {
        this.f294700e = null;
        if (str != null && !str.isEmpty()) {
            java.lang.String str2 = z7Var.f294812f;
            this.f294699d = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str2 + '/' + str, z7Var.f294813g, z7Var.f294814h);
            return;
        }
        this.f294699d = z7Var;
    }
}
