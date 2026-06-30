package w8;

/* loaded from: classes15.dex */
public final class c0 implements q8.e {

    /* renamed from: l, reason: collision with root package name */
    public static final long f525118l = t9.d0.f("AC-3");

    /* renamed from: m, reason: collision with root package name */
    public static final long f525119m = t9.d0.f("EAC3");

    /* renamed from: n, reason: collision with root package name */
    public static final long f525120n = t9.d0.f("HEVC");

    /* renamed from: a, reason: collision with root package name */
    public final int f525121a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f525122b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f525123c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseIntArray f525124d;

    /* renamed from: e, reason: collision with root package name */
    public final w8.f0 f525125e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.SparseArray f525126f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseBooleanArray f525127g;

    /* renamed from: h, reason: collision with root package name */
    public q8.g f525128h;

    /* renamed from: i, reason: collision with root package name */
    public int f525129i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f525130j;

    /* renamed from: k, reason: collision with root package name */
    public w8.h0 f525131k;

    public c0(int i17, int i18) {
        this(i17, new t9.a0(0L), new w8.e(i18, java.util.Collections.emptyList()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008b, code lost:
    
        if (r11 != ((r9 + 1) & 15)) goto L48;
     */
    @Override // q8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(q8.f r11, q8.k r12) {
        /*
            r10 = this;
            t9.p r12 = r10.f525123c
            byte[] r0 = r12.f498073a
            int r1 = r12.f498074b
            int r2 = 9400 - r1
            r3 = 188(0xbc, float:2.63E-43)
            r4 = 0
            if (r2 >= r3) goto L18
            int r2 = r12.f498075c
            int r2 = r2 - r1
            if (r2 <= 0) goto L15
            java.lang.System.arraycopy(r0, r1, r0, r4, r2)
        L15:
            r12.u(r0, r2)
        L18:
            int r1 = r12.f498075c
            int r2 = r12.f498074b
            int r5 = r1 - r2
            if (r5 >= r3) goto L32
            int r2 = 9400 - r1
            r5 = r11
            q8.b r5 = (q8.b) r5
            int r2 = r5.c(r0, r1, r2)
            r5 = -1
            if (r2 != r5) goto L2d
            return r5
        L2d:
            int r1 = r1 + r2
            r12.v(r1)
            goto L18
        L32:
            if (r2 >= r1) goto L3d
            r11 = r0[r2]
            r5 = 71
            if (r11 == r5) goto L3d
            int r2 = r2 + 1
            goto L32
        L3d:
            r12.w(r2)
            int r2 = r2 + r3
            if (r2 <= r1) goto L44
            return r4
        L44:
            int r11 = r12.c()
            r0 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r11
            if (r0 == 0) goto L51
            r12.w(r2)
            return r4
        L51:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r11
            r3 = 1
            if (r0 == 0) goto L59
            r0 = r3
            goto L5a
        L59:
            r0 = r4
        L5a:
            r5 = 2096896(0x1fff00, float:2.938377E-39)
            r5 = r5 & r11
            int r5 = r5 >> 8
            r6 = r11 & 32
            if (r6 == 0) goto L66
            r6 = r3
            goto L67
        L66:
            r6 = r4
        L67:
            r7 = r11 & 16
            if (r7 == 0) goto L6d
            r7 = r3
            goto L6e
        L6d:
            r7 = r4
        L6e:
            int r8 = r10.f525121a
            r9 = 2
            if (r8 == r9) goto L8e
            r11 = r11 & 15
            android.util.SparseIntArray r8 = r10.f525124d
            int r9 = r11 + (-1)
            int r9 = r8.get(r5, r9)
            r8.put(r5, r11)
            if (r9 != r11) goto L88
            if (r7 == 0) goto L8e
            r12.w(r2)
            return r4
        L88:
            int r9 = r9 + r3
            r8 = r9 & 15
            if (r11 == r8) goto L8e
            goto L8f
        L8e:
            r3 = r4
        L8f:
            if (r6 == 0) goto L98
            int r11 = r12.m()
            r12.x(r11)
        L98:
            if (r7 == 0) goto Lb2
            android.util.SparseArray r11 = r10.f525126f
            java.lang.Object r11 = r11.get(r5)
            w8.h0 r11 = (w8.h0) r11
            if (r11 == 0) goto Lb2
            if (r3 == 0) goto La9
            r11.b()
        La9:
            r12.v(r2)
            r11.a(r12, r0)
            r12.v(r1)
        Lb2:
            r12.w(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.c0.a(q8.f, q8.k):int");
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f525128h = gVar;
        gVar.b(new q8.l(-9223372036854775807L));
    }

    public final void c() {
        this.f525127g.clear();
        android.util.SparseArray sparseArray = this.f525126f;
        sparseArray.clear();
        ((w8.e) this.f525125e).getClass();
        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
        int size = sparseArray2.size();
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray.put(sparseArray2.keyAt(i17), sparseArray2.valueAt(i17));
        }
        sparseArray.put(0, new w8.x(new w8.a0(this)));
        this.f525131k = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r1 = r1 + 1;
     */
    @Override // q8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(q8.f r7) {
        /*
            r6 = this;
            t9.p r0 = r6.f525123c
            byte[] r0 = r0.f498073a
            r1 = r7
            q8.b r1 = (q8.b) r1
            r2 = 0
            r3 = 940(0x3ac, float:1.317E-42)
            r1.b(r0, r2, r3, r2)
            r1 = r2
        Le:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2c
            r3 = r2
        L13:
            r4 = 5
            if (r3 != r4) goto L1d
            q8.b r7 = (q8.b) r7
            r7.f(r1)
            r7 = 1
            return r7
        L1d:
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L29
            int r1 = r1 + 1
            goto Le
        L29:
            int r3 = r3 + 1
            goto L13
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.c0.e(q8.f):boolean");
    }

    @Override // q8.e
    /* renamed from: release */
    public void mo131096x41012807() {
    }

    @Override // q8.e
    /* renamed from: seek */
    public void mo131097x35ce78(long j17, long j18) {
        java.util.List list = this.f525122b;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((t9.a0) list.get(i17)).f498024c = -9223372036854775807L;
        }
        this.f525123c.s();
        this.f525124d.clear();
        c();
    }

    public c0(int i17, t9.a0 a0Var, w8.f0 f0Var) {
        f0Var.getClass();
        this.f525125e = f0Var;
        this.f525121a = i17;
        if (i17 != 1 && i17 != 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f525122b = arrayList;
            arrayList.add(a0Var);
        } else {
            this.f525122b = java.util.Collections.singletonList(a0Var);
        }
        this.f525123c = new t9.p(9400);
        this.f525127g = new android.util.SparseBooleanArray();
        this.f525126f = new android.util.SparseArray();
        this.f525124d = new android.util.SparseIntArray();
        c();
    }
}
