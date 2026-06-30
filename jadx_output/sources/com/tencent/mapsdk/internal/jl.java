package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public class jl extends com.tencent.mapsdk.internal.iw {

    /* renamed from: c, reason: collision with root package name */
    static final int f49997c = 0;

    /* renamed from: d, reason: collision with root package name */
    static final int f49998d = 1;

    /* renamed from: e, reason: collision with root package name */
    static final int f49999e = 0;

    /* renamed from: f, reason: collision with root package name */
    static final int f50000f = 1;

    /* renamed from: g, reason: collision with root package name */
    static final int f50001g = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f50002n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f50003o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f50004p = -1;
    private long B;

    /* renamed from: h, reason: collision with root package name */
    long f50013h;

    /* renamed from: k, reason: collision with root package name */
    com.tencent.mapsdk.internal.jh[] f50016k;

    /* renamed from: l, reason: collision with root package name */
    java.util.HashMap<java.lang.Integer, com.tencent.mapsdk.internal.jh> f50017l;

    /* renamed from: m, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.it f50018m;

    /* renamed from: q, reason: collision with root package name */
    private static java.lang.ThreadLocal<com.tencent.mapsdk.internal.jl.a> f50005q = new java.lang.ThreadLocal<>();

    /* renamed from: r, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.tencent.mapsdk.internal.jl>> f50006r = new java.lang.ThreadLocal<java.util.ArrayList<com.tencent.mapsdk.internal.jl>>() { // from class: com.tencent.mapsdk.internal.jl.1
        private static java.util.ArrayList<com.tencent.mapsdk.internal.jl> a() {
            return new java.util.ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ java.util.ArrayList<com.tencent.mapsdk.internal.jl> initialValue() {
            return new java.util.ArrayList<>();
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.tencent.mapsdk.internal.jl>> f50007s = new java.lang.ThreadLocal<java.util.ArrayList<com.tencent.mapsdk.internal.jl>>() { // from class: com.tencent.mapsdk.internal.jl.2
        private static java.util.ArrayList<com.tencent.mapsdk.internal.jl> a() {
            return new java.util.ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ java.util.ArrayList<com.tencent.mapsdk.internal.jl> initialValue() {
            return new java.util.ArrayList<>();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.tencent.mapsdk.internal.jl>> f50008t = new java.lang.ThreadLocal<java.util.ArrayList<com.tencent.mapsdk.internal.jl>>() { // from class: com.tencent.mapsdk.internal.jl.3
        private static java.util.ArrayList<com.tencent.mapsdk.internal.jl> a() {
            return new java.util.ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ java.util.ArrayList<com.tencent.mapsdk.internal.jl> initialValue() {
            return new java.util.ArrayList<>();
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.tencent.mapsdk.internal.jl>> f50009u = new java.lang.ThreadLocal<java.util.ArrayList<com.tencent.mapsdk.internal.jl>>() { // from class: com.tencent.mapsdk.internal.jl.4
        private static java.util.ArrayList<com.tencent.mapsdk.internal.jl> a() {
            return new java.util.ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ java.util.ArrayList<com.tencent.mapsdk.internal.jl> initialValue() {
            return new java.util.ArrayList<>();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.tencent.mapsdk.internal.jl>> f50010v = new java.lang.ThreadLocal<java.util.ArrayList<com.tencent.mapsdk.internal.jl>>() { // from class: com.tencent.mapsdk.internal.jl.5
        private static java.util.ArrayList<com.tencent.mapsdk.internal.jl> a() {
            return new java.util.ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ java.util.ArrayList<com.tencent.mapsdk.internal.jl> initialValue() {
            return new java.util.ArrayList<>();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private static final android.view.animation.Interpolator f50011w = new android.view.animation.LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    private static final long f49996b = 10;
    private static long G = f49996b;

    /* renamed from: i, reason: collision with root package name */
    long f50014i = -1;

    /* renamed from: x, reason: collision with root package name */
    private boolean f50019x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f50020y = 0;

    /* renamed from: z, reason: collision with root package name */
    private float f50021z = 0.0f;
    private boolean A = false;

    /* renamed from: j, reason: collision with root package name */
    int f50015j = 0;
    private boolean C = false;
    private boolean D = false;
    private long E = 300;
    private long F = 0;
    private int H = 0;
    private int I = 1;

    /* renamed from: J, reason: collision with root package name */
    private android.view.animation.Interpolator f50012J = f50011w;
    private java.util.ArrayList<com.tencent.mapsdk.internal.jl.b> K = null;

    /* loaded from: classes16.dex */
    public static class a extends android.os.Handler {
        public a(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            boolean z17;
            java.util.ArrayList arrayList = (java.util.ArrayList) com.tencent.mapsdk.internal.jl.f50006r.get();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) com.tencent.mapsdk.internal.jl.f50008t.get();
            int i17 = message.what;
            if (i17 == 0) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) com.tencent.mapsdk.internal.jl.f50007s.get();
                z17 = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        com.tencent.mapsdk.internal.jl jlVar = (com.tencent.mapsdk.internal.jl) arrayList4.get(i18);
                        if (jlVar.F == 0) {
                            jlVar.y();
                        } else {
                            arrayList2.add(jlVar);
                        }
                    }
                }
            } else if (i17 != 1) {
                return;
            } else {
                z17 = true;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            java.util.ArrayList arrayList5 = (java.util.ArrayList) com.tencent.mapsdk.internal.jl.f50010v.get();
            java.util.ArrayList arrayList6 = (java.util.ArrayList) com.tencent.mapsdk.internal.jl.f50009u.get();
            int size2 = arrayList2.size();
            for (int i19 = 0; i19 < size2; i19++) {
                com.tencent.mapsdk.internal.jl jlVar2 = (com.tencent.mapsdk.internal.jl) arrayList2.get(i19);
                if (com.tencent.mapsdk.internal.jl.a(jlVar2, uptimeMillis)) {
                    arrayList5.add(jlVar2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i27 = 0; i27 < size3; i27++) {
                    com.tencent.mapsdk.internal.jl jlVar3 = (com.tencent.mapsdk.internal.jl) arrayList5.get(i27);
                    jlVar3.y();
                    com.tencent.mapsdk.internal.jl.c(jlVar3);
                    arrayList2.remove(jlVar3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i28 = 0;
            while (i28 < size4) {
                com.tencent.mapsdk.internal.jl jlVar4 = (com.tencent.mapsdk.internal.jl) arrayList.get(i28);
                if (jlVar4.c(uptimeMillis)) {
                    arrayList6.add(jlVar4);
                }
                if (arrayList.size() == size4) {
                    i28++;
                } else {
                    size4--;
                    arrayList6.remove(jlVar4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i29 = 0; i29 < arrayList6.size(); i29++) {
                    ((com.tencent.mapsdk.internal.jl) arrayList6.get(i29)).x();
                }
                arrayList6.clear();
            }
            if (z17) {
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                sendEmptyMessageDelayed(1, java.lang.Math.max(0L, com.tencent.mapsdk.internal.jl.G - (android.os.SystemClock.uptimeMillis() - uptimeMillis)));
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    public jl(com.tencent.mapsdk.internal.it itVar) {
        this.f50018m = itVar;
    }

    private static int A() {
        return f50006r.get().size();
    }

    private static void B() {
        f50006r.get().clear();
        f50007s.get().clear();
        f50008t.get().clear();
    }

    private static void C() {
    }

    public static /* synthetic */ boolean c(com.tencent.mapsdk.internal.jl jlVar) {
        jlVar.C = true;
        return true;
    }

    private com.tencent.mapsdk.internal.jh[] o() {
        return this.f50016k;
    }

    private long p() {
        if (this.f50015j == 0) {
            return 0L;
        }
        return android.os.SystemClock.uptimeMillis() - this.f50013h;
    }

    private static long q() {
        return G;
    }

    private java.lang.Object r() {
        com.tencent.mapsdk.internal.jh[] jhVarArr = this.f50016k;
        if (jhVarArr == null || jhVarArr.length <= 0) {
            return null;
        }
        return jhVarArr[0].b();
    }

    private int s() {
        return this.H;
    }

    private int t() {
        return this.I;
    }

    private void u() {
        java.util.ArrayList<com.tencent.mapsdk.internal.jl.b> arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        this.K = null;
    }

    private android.view.animation.Interpolator v() {
        return this.f50012J;
    }

    private void w() {
        this.f50019x = !this.f50019x;
        if (this.f50015j != 1) {
            a(true);
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        this.f50013h = uptimeMillis - (this.E - (uptimeMillis - this.f50013h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList;
        f50006r.get().remove(this);
        f50007s.get().remove(this);
        f50008t.get().remove(this);
        this.f50015j = 0;
        if (this.C && (arrayList = this.f49929a) != null) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((com.tencent.mapsdk.internal.iw.a) arrayList2.get(i17)).b(this);
            }
        }
        this.C = false;
        this.D = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList;
        f50006r.get().add(this);
        if (this.F <= 0 || (arrayList = this.f49929a) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((com.tencent.mapsdk.internal.iw.a) arrayList2.get(i17)).a(this);
        }
    }

    private float z() {
        return this.f50021z;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final long e() {
        return this.E;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final boolean f() {
        return this.f50015j == 1 || this.C;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final boolean g() {
        return this.D;
    }

    @Override // com.tencent.mapsdk.internal.iw
    /* renamed from: h */
    public com.tencent.mapsdk.internal.iw clone() {
        com.tencent.mapsdk.internal.jl jlVar = (com.tencent.mapsdk.internal.jl) super.clone();
        java.util.ArrayList<com.tencent.mapsdk.internal.jl.b> arrayList = this.K;
        if (arrayList != null) {
            jlVar.K = new java.util.ArrayList<>();
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                jlVar.K.add(arrayList.get(i17));
            }
        }
        jlVar.f50014i = -1L;
        jlVar.f50019x = false;
        jlVar.f50020y = 0;
        jlVar.f50015j = 0;
        jlVar.A = false;
        com.tencent.mapsdk.internal.jh[] jhVarArr = this.f50016k;
        if (jhVarArr != null) {
            int length = jhVarArr.length;
            jlVar.f50016k = new com.tencent.mapsdk.internal.jh[length];
            jlVar.f50017l = new java.util.HashMap<>(length);
            for (int i18 = 0; i18 < length; i18++) {
                com.tencent.mapsdk.internal.jh clone = jhVarArr[i18].clone();
                jlVar.f50016k[i18] = clone;
                jlVar.f50017l.put(java.lang.Integer.valueOf(clone.f49985a), clone);
            }
        }
        return jlVar;
    }

    public java.lang.String toString() {
        java.lang.String str = "ValueAnimator@" + java.lang.Integer.toHexString(hashCode());
        if (this.f50016k != null) {
            for (int i17 = 0; i17 < this.f50016k.length; i17++) {
                str = str + "\n    " + this.f50016k[i17].toString();
            }
        }
        return str;
    }

    private static com.tencent.mapsdk.internal.jl a(com.tencent.mapsdk.internal.it itVar, int... iArr) {
        com.tencent.mapsdk.internal.jl jlVar = new com.tencent.mapsdk.internal.jl(itVar);
        jlVar.a(iArr);
        return jlVar;
    }

    public static com.tencent.mapsdk.internal.jl b(double... dArr) {
        com.tencent.mapsdk.internal.jl jlVar = new com.tencent.mapsdk.internal.jl(null);
        jlVar.a(dArr);
        return jlVar;
    }

    private void c(int i17) {
        this.I = i17;
    }

    private void e(long j17) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (this.f50015j != 1) {
            this.f50014i = j17;
            this.f50015j = 2;
        }
        this.f50013h = uptimeMillis - j17;
        c(uptimeMillis);
    }

    private boolean f(long j17) {
        if (!this.A) {
            this.A = true;
            this.B = j17;
            return false;
        }
        long j18 = j17 - this.B;
        long j19 = this.F;
        if (j18 <= j19) {
            return false;
        }
        this.f50013h = j17 - (j18 - j19);
        this.f50015j = 1;
        return true;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final long d() {
        return this.F;
    }

    public static void d(long j17) {
        G = j17;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void c() {
        if (!f50006r.get().contains(this) && !f50007s.get().contains(this)) {
            this.A = false;
            y();
        }
        int i17 = this.H;
        if (i17 > 0 && (i17 & 1) == 1) {
            a(0.0f);
        } else {
            a(1.0f);
        }
        x();
    }

    private static com.tencent.mapsdk.internal.jl a(com.tencent.mapsdk.internal.it itVar, com.tencent.mapsdk.internal.jh... jhVarArr) {
        com.tencent.mapsdk.internal.jl jlVar = new com.tencent.mapsdk.internal.jl(itVar);
        jlVar.a(jhVarArr);
        return jlVar;
    }

    @Override // com.tencent.mapsdk.internal.iw
    public com.tencent.mapsdk.internal.iw b(long j17) {
        if (j17 >= 0) {
            this.E = j17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("Animators cannot have negative duration: ".concat(java.lang.String.valueOf(j17)));
    }

    private static com.tencent.mapsdk.internal.jl a(com.tencent.mapsdk.internal.it itVar, com.tencent.mapsdk.internal.jk<?> jkVar, java.lang.Object[] objArr) {
        com.tencent.mapsdk.internal.jl jlVar = new com.tencent.mapsdk.internal.jl(itVar);
        jlVar.a(objArr);
        jlVar.a(jkVar);
        return jlVar;
    }

    private void b(int i17) {
        this.H = i17;
    }

    private void b(com.tencent.mapsdk.internal.jl.b bVar) {
        java.util.ArrayList<com.tencent.mapsdk.internal.jl.b> arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(bVar);
        if (this.K.size() == 0) {
            this.K = null;
        }
    }

    public void a(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        com.tencent.mapsdk.internal.jh[] jhVarArr = this.f50016k;
        if (jhVarArr != null && jhVarArr.length != 0) {
            jhVarArr[0].a(iArr);
        } else {
            a(com.tencent.mapsdk.internal.jh.a(0, iArr));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(long r11) {
        /*
            r10 = this;
            int r0 = r10.f50015j
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L1a
            r10.f50015j = r3
            long r4 = r10.f50014i
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
            r10.f50013h = r11
            goto L1a
        L12:
            long r4 = r11 - r4
            r10.f50013h = r4
            r4 = -1
            r10.f50014i = r4
        L1a:
            int r0 = r10.f50015j
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L23
            if (r0 == r4) goto L23
            goto L7b
        L23:
            long r6 = r10.E
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L32
            long r8 = r10.f50013h
            long r11 = r11 - r8
            float r11 = (float) r11
            float r12 = (float) r6
            float r11 = r11 / r12
            goto L33
        L32:
            r11 = r1
        L33:
            int r12 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r12 < 0) goto L70
            int r12 = r10.f50020y
            int r0 = r10.H
            if (r12 < r0) goto L46
            r12 = -1
            if (r0 != r12) goto L41
            goto L46
        L41:
            float r11 = java.lang.Math.min(r11, r1)
            goto L71
        L46:
            java.util.ArrayList<com.tencent.mapsdk.internal.iw$a> r12 = r10.f49929a
            if (r12 == 0) goto L59
            int r12 = r12.size()
            r0 = r5
        L4f:
            if (r0 >= r12) goto L59
            java.util.ArrayList<com.tencent.mapsdk.internal.iw$a> r2 = r10.f49929a
            r2.get(r0)
            int r0 = r0 + 1
            goto L4f
        L59:
            int r12 = r10.I
            if (r12 != r4) goto L62
            boolean r12 = r10.f50019x
            r12 = r12 ^ r3
            r10.f50019x = r12
        L62:
            int r12 = r10.f50020y
            int r0 = (int) r11
            int r12 = r12 + r0
            r10.f50020y = r12
            float r11 = r11 % r1
            long r2 = r10.f50013h
            long r6 = r10.E
            long r2 = r2 + r6
            r10.f50013h = r2
        L70:
            r3 = r5
        L71:
            boolean r12 = r10.f50019x
            if (r12 == 0) goto L77
            float r11 = r1 - r11
        L77:
            r10.a(r11)
            r5 = r3
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.jl.c(long):boolean");
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void b() {
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList;
        if (this.f50015j != 0 || f50007s.get().contains(this) || f50008t.get().contains(this)) {
            if (this.C && (arrayList = this.f49929a) != null) {
                java.util.Iterator it = ((java.util.ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((com.tencent.mapsdk.internal.iw.a) it.next()).a();
                }
            }
            x();
        }
    }

    public void a(double... dArr) {
        if (dArr == null || dArr.length == 0) {
            return;
        }
        com.tencent.mapsdk.internal.jh[] jhVarArr = this.f50016k;
        if (jhVarArr != null && jhVarArr.length != 0) {
            jhVarArr[0].a(dArr);
        } else {
            a(com.tencent.mapsdk.internal.jh.a(0, dArr));
        }
    }

    public void a(java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        com.tencent.mapsdk.internal.jh[] jhVarArr = this.f50016k;
        if (jhVarArr != null && jhVarArr.length != 0) {
            jhVarArr[0].a(objArr);
        } else {
            a(com.tencent.mapsdk.internal.jh.a(0, objArr));
        }
    }

    public final void a(com.tencent.mapsdk.internal.jh... jhVarArr) {
        int length = jhVarArr.length;
        this.f50016k = jhVarArr;
        this.f50017l = new java.util.HashMap<>(length);
        for (com.tencent.mapsdk.internal.jh jhVar : jhVarArr) {
            this.f50017l.put(java.lang.Integer.valueOf(jhVar.f49985a), jhVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void a(long j17) {
        this.F = j17;
    }

    private java.lang.Object a(int i17) {
        com.tencent.mapsdk.internal.jh jhVar = this.f50017l.get(java.lang.Integer.valueOf(i17));
        if (jhVar != null) {
            return jhVar.b();
        }
        return null;
    }

    private void a(com.tencent.mapsdk.internal.jl.b bVar) {
        if (this.K == null) {
            this.K = new java.util.ArrayList<>();
        }
        this.K.add(bVar);
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void a(android.view.animation.Interpolator interpolator) {
        if (interpolator != null) {
            this.f50012J = interpolator;
        } else {
            this.f50012J = new android.view.animation.LinearInterpolator();
        }
    }

    public final void a(com.tencent.mapsdk.internal.jk<?> jkVar) {
        com.tencent.mapsdk.internal.jh[] jhVarArr;
        if (jkVar == null || (jhVarArr = this.f50016k) == null || jhVarArr.length <= 0) {
            return;
        }
        jhVarArr[0].a(jkVar);
    }

    private void a(boolean z17) {
        this.f50019x = z17;
        this.f50020y = 0;
        this.f50015j = 0;
        this.D = true;
        this.A = false;
        f50007s.get().add(this);
        if (this.F == 0) {
            long uptimeMillis = this.f50015j != 0 ? android.os.SystemClock.uptimeMillis() - this.f50013h : 0L;
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
            if (this.f50015j != 1) {
                this.f50014i = uptimeMillis;
                this.f50015j = 2;
            }
            this.f50013h = uptimeMillis2 - uptimeMillis;
            c(uptimeMillis2);
            this.f50015j = 0;
            this.C = true;
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = this.f49929a;
            if (arrayList != null) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i17 = 0; i17 < size; i17++) {
                    ((com.tencent.mapsdk.internal.iw.a) arrayList2.get(i17)).a(this);
                }
            }
        }
        com.tencent.mapsdk.internal.jl.a aVar = f50005q.get();
        if (aVar == null) {
            aVar = new com.tencent.mapsdk.internal.jl.a(android.os.Looper.getMainLooper());
            f50005q.set(aVar);
        } else {
            aVar.removeMessages(0);
            aVar.removeMessages(1);
        }
        aVar.sendEmptyMessage(0);
    }

    @Override // com.tencent.mapsdk.internal.iw
    public final void a() {
        a(false);
    }

    public void a(float f17) {
        float interpolation = this.f50012J.getInterpolation(f17);
        this.f50021z = interpolation;
        int length = this.f50016k.length;
        for (int i17 = 0; i17 < length; i17++) {
            this.f50016k[i17].a(interpolation);
            com.tencent.mapsdk.internal.it itVar = this.f50018m;
            if (itVar != null) {
                com.tencent.mapsdk.internal.jh jhVar = this.f50016k[i17];
                itVar.a(jhVar.f49985a, jhVar.b());
            }
        }
        java.util.ArrayList<com.tencent.mapsdk.internal.jl.b> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                this.K.get(i18);
            }
        }
    }

    public static /* synthetic */ boolean a(com.tencent.mapsdk.internal.jl jlVar, long j17) {
        if (!jlVar.A) {
            jlVar.A = true;
            jlVar.B = j17;
            return false;
        }
        long j18 = j17 - jlVar.B;
        long j19 = jlVar.F;
        if (j18 <= j19) {
            return false;
        }
        jlVar.f50013h = j17 - (j18 - j19);
        jlVar.f50015j = 1;
        return true;
    }
}
