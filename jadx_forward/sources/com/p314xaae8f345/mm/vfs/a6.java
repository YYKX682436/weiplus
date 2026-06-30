package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class a6 extends com.p314xaae8f345.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294316e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f294317f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f294318g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String[] f294319h;

    /* renamed from: i, reason: collision with root package name */
    public long f294320i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.TreeMap f294321m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.b6[] f294322n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f294323o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.b6[] f294324p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f294325q;

    /* renamed from: r, reason: collision with root package name */
    public int f294326r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22767x2079386e f294327s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.p314xaae8f345.mm.vfs.C22767x2079386e c22767x2079386e, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Map map) {
        super(c22767x2079386e, map);
        this.f294327s = c22767x2079386e;
        this.f294320i = Long.MIN_VALUE;
        this.f294316e = q2Var;
        this.f294317f = java.util.Collections.singletonList(q2Var);
        this.f294318g = strArr;
        this.f294319h = strArr2;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.util.List K() {
        return this.f294317f;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public com.p314xaae8f345.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f294316e;
    }

    public final void O(com.p314xaae8f345.mm.vfs.b6 b6Var) {
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[0] = "relPath";
        objArr[1] = b6Var.f294366d;
        objArr[2] = "recursive";
        objArr[3] = java.lang.Boolean.valueOf(b6Var.f294367e);
        objArr[4] = "totalSize";
        objArr[5] = java.lang.Long.valueOf(b6Var.f294370h);
        objArr[6] = "fileCount";
        objArr[7] = java.lang.Integer.valueOf(b6Var.f294371i);
        objArr[8] = "dirCount";
        objArr[9] = java.lang.Integer.valueOf(b6Var.f294372m);
        objArr[10] = "averageAge";
        objArr[11] = java.lang.Long.valueOf(b6Var.f294371i - b6Var.f294376q == 0 ? 0L : b6Var.f294373n / (r1 - r3));
        objArr[12] = "maxDepth";
        objArr[13] = java.lang.Integer.valueOf(b6Var.f294374o);
        objArr[14] = "maxFileSize";
        objArr[15] = java.lang.Long.valueOf(b6Var.f294375p);
        J(2, objArr);
    }

    public final void P() {
        long j17 = com.p314xaae8f345.mm.vfs.a3.f294314a.j();
        if (this.f294320i != j17 || this.f294322n == null) {
            this.f294320i = j17;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            this.f294321m = new java.util.TreeMap();
            this.f294326r = 0;
            for (java.lang.String str : this.f294318g) {
                boolean z17 = !str.endsWith("\u0000");
                if (!z17) {
                    str = str.substring(0, str.length() - 1);
                }
                com.p314xaae8f345.mm.vfs.b6 b6Var = new com.p314xaae8f345.mm.vfs.b6(str, z17);
                if (z17) {
                    arrayList.add(b6Var);
                    this.f294321m.put(str, new com.p314xaae8f345.mm.vfs.b6[]{b6Var});
                } else {
                    arrayList2.add(b6Var);
                }
            }
            com.p314xaae8f345.mm.vfs.b6[] b6VarArr = new com.p314xaae8f345.mm.vfs.b6[0];
            this.f294322n = (com.p314xaae8f345.mm.vfs.b6[]) arrayList.toArray(b6VarArr);
            com.p314xaae8f345.mm.vfs.b6[] b6VarArr2 = (com.p314xaae8f345.mm.vfs.b6[]) arrayList2.toArray(b6VarArr);
            this.f294324p = b6VarArr2;
            this.f294323o = new byte[this.f294322n.length];
            this.f294325q = new byte[b6VarArr2.length];
        }
    }

    /* renamed from: equals */
    public boolean m82365xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.a6)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.a6 a6Var = (com.p314xaae8f345.mm.vfs.a6) obj;
        return this.f294316e.equals(a6Var.f294316e) && java.util.Arrays.equals(this.f294318g, a6Var.f294318g) && java.util.Arrays.equals(this.f294319h, a6Var.f294319h) && this.f294327s.f294289h == a6Var.f294327s.f294289h;
    }

    /* renamed from: hashCode */
    public int m82366x8cdac1b() {
        int hashCode = com.p314xaae8f345.mm.vfs.a6.class.hashCode();
        java.lang.Object[] objArr = {this.f294316e, this.f294318g, this.f294319h, java.lang.Boolean.valueOf(this.f294327s.f294289h)};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    /* renamed from: list */
    public java.lang.Iterable mo82286x32b09e(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.b6 b6Var;
        java.lang.Iterable mo82286x32b09e = super.mo82286x32b09e(str);
        if (com.p314xaae8f345.mm.vfs.a3.f294314a.j() == Long.MIN_VALUE) {
            return mo82286x32b09e;
        }
        P();
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, true);
        com.p314xaae8f345.mm.vfs.b6[] b6VarArr = (com.p314xaae8f345.mm.vfs.b6[]) this.f294321m.remove(l17);
        int binarySearch = java.util.Arrays.binarySearch(this.f294324p, l17);
        if (b6VarArr == null && binarySearch < 0) {
            return mo82286x32b09e;
        }
        if (binarySearch < 0) {
            b6Var = null;
        } else {
            b6Var = this.f294324p[binarySearch];
            this.f294325q[binarySearch] = (byte) (mo82286x32b09e == null ? 2 : 1);
        }
        int binarySearch2 = java.util.Arrays.binarySearch(this.f294322n, l17);
        if (binarySearch2 >= 0) {
            this.f294323o[binarySearch2] = (byte) (mo82286x32b09e != null ? 1 : 2);
        }
        if (mo82286x32b09e == null) {
            return null;
        }
        this.f294326r++;
        com.p314xaae8f345.mm.vfs.z5 z5Var = new com.p314xaae8f345.mm.vfs.z5(this, b6VarArr, b6Var);
        return new pm5.l(mo82286x32b09e, z5Var, z5Var, false);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> mo82286x32b09e;
        try {
            if (this.f294327s.f294289h && com.p314xaae8f345.mm.vfs.a3.f294314a.j() != Long.MIN_VALUE) {
                if (this.f294326r != 0) {
                    this.f294321m = null;
                    this.f294322n = null;
                    this.f294324p = null;
                    this.f294325q = null;
                    this.f294326r = 0;
                }
                P();
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    com.p314xaae8f345.mm.vfs.b6[] b6VarArr = this.f294324p;
                    if (i17 >= b6VarArr.length) {
                        break;
                    }
                    if (this.f294325q[i17] <= 0 && (mo82286x32b09e = mo82286x32b09e(b6VarArr[i17].f294366d)) != null) {
                        for (com.p314xaae8f345.mm.vfs.x1 x1Var : mo82286x32b09e) {
                            i18++;
                            if ((i18 & 16) == 0) {
                                cancellationSignal.throwIfCanceled();
                            }
                        }
                    }
                    i17++;
                }
                while (!this.f294321m.isEmpty()) {
                    java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> mo82286x32b09e2 = mo82286x32b09e((java.lang.String) this.f294321m.lastKey());
                    if (mo82286x32b09e2 != null) {
                        for (com.p314xaae8f345.mm.vfs.x1 x1Var2 : mo82286x32b09e2) {
                            i18++;
                            if ((i18 & 16) == 0) {
                                cancellationSignal.throwIfCanceled();
                            }
                        }
                    }
                }
            }
            if (this.f294322n != null && this.f294324p != null && this.f294326r == 0) {
                int i19 = 0;
                while (true) {
                    com.p314xaae8f345.mm.vfs.b6[] b6VarArr2 = this.f294322n;
                    if (i19 >= b6VarArr2.length) {
                        break;
                    }
                    if (this.f294323o[i19] == 1) {
                        com.p314xaae8f345.mm.vfs.b6 b6Var = b6VarArr2[i19];
                        java.util.TreeMap treeMap = this.f294321m;
                        java.lang.String str = b6Var.f294366d;
                        java.lang.String str2 = b6Var.f294366d;
                        java.lang.String str3 = (java.lang.String) treeMap.ceilingKey(str);
                        if (str3 != null) {
                            if (!str3.equals(str2)) {
                                if (str3.startsWith(str2 + '/')) {
                                }
                            }
                        }
                        O(b6Var);
                    }
                    i19++;
                }
                int i27 = 0;
                while (true) {
                    com.p314xaae8f345.mm.vfs.b6[] b6VarArr3 = this.f294324p;
                    if (i27 >= b6VarArr3.length) {
                        break;
                    }
                    if (this.f294325q[i27] == 1) {
                        O(b6VarArr3[i27]);
                    }
                    i27++;
                }
            }
            this.f294320i = Long.MIN_VALUE;
            this.f294321m = null;
            this.f294322n = null;
            this.f294323o = null;
            this.f294324p = null;
            this.f294325q = null;
            this.f294326r = 0;
            cancellationSignal.throwIfCanceled();
            super.q(cancellationSignal);
        } catch (java.lang.Throwable th6) {
            this.f294320i = Long.MIN_VALUE;
            this.f294321m = null;
            this.f294322n = null;
            this.f294323o = null;
            this.f294324p = null;
            this.f294325q = null;
            this.f294326r = 0;
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        return "stat <- " + this.f294316e;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294327s;
    }
}
