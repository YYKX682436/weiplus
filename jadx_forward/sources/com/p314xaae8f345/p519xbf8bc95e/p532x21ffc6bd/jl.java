package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public class jl extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw {

    /* renamed from: c, reason: collision with root package name */
    static final int f131530c = 0;

    /* renamed from: d, reason: collision with root package name */
    static final int f131531d = 1;

    /* renamed from: e, reason: collision with root package name */
    static final int f131532e = 0;

    /* renamed from: f, reason: collision with root package name */
    static final int f131533f = 1;

    /* renamed from: g, reason: collision with root package name */
    static final int f131534g = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f131535n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f131536o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f131537p = -1;
    private long B;

    /* renamed from: h, reason: collision with root package name */
    long f131546h;

    /* renamed from: k, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] f131549k;

    /* renamed from: l, reason: collision with root package name */
    java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh> f131550l;

    /* renamed from: m, reason: collision with root package name */
    protected com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it f131551m;

    /* renamed from: q, reason: collision with root package name */
    private static java.lang.ThreadLocal<com.tencent.mapsdk.internal.jl.a> f131538q = new java.lang.ThreadLocal<>();

    /* renamed from: r, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl>> f131539r = new java.lang.ThreadLocal<java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl>>() { // from class: com.tencent.mapsdk.internal.jl.1
        private static java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl> a() {
            return new java.util.ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl> initialValue() {
            return new java.util.ArrayList<>();
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl>> f131540s = new java.lang.ThreadLocal<java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl>>() { // from class: com.tencent.mapsdk.internal.jl.2
        private static java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl> a() {
            return new java.util.ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl> initialValue() {
            return new java.util.ArrayList<>();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl>> f131541t = new java.lang.ThreadLocal<java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl>>() { // from class: com.tencent.mapsdk.internal.jl.3
        private static java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl> a() {
            return new java.util.ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl> initialValue() {
            return new java.util.ArrayList<>();
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl>> f131542u = new java.lang.ThreadLocal<java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl>>() { // from class: com.tencent.mapsdk.internal.jl.4
        private static java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl> a() {
            return new java.util.ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl> initialValue() {
            return new java.util.ArrayList<>();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl>> f131543v = new java.lang.ThreadLocal<java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl>>() { // from class: com.tencent.mapsdk.internal.jl.5
        private static java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl> a() {
            return new java.util.ArrayList<>();
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl> initialValue() {
            return new java.util.ArrayList<>();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private static final android.view.animation.Interpolator f131544w = new android.view.animation.LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    private static final long f131529b = 10;
    private static long G = f131529b;

    /* renamed from: i, reason: collision with root package name */
    long f131547i = -1;

    /* renamed from: x, reason: collision with root package name */
    private boolean f131552x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f131553y = 0;

    /* renamed from: z, reason: collision with root package name */
    private float f131554z = 0.0f;
    private boolean A = false;

    /* renamed from: j, reason: collision with root package name */
    int f131548j = 0;
    private boolean C = false;
    private boolean D = false;
    private long E = 300;
    private long F = 0;
    private int H = 0;
    private int I = 1;

    /* renamed from: J, reason: collision with root package name */
    private android.view.animation.Interpolator f131545J = f131544w;
    private java.util.ArrayList<com.tencent.mapsdk.internal.jl.b> K = null;

    /* loaded from: classes16.dex */
    public static class a extends android.os.Handler {
        public a(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            boolean z17;
            java.util.ArrayList arrayList = (java.util.ArrayList) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.f131539r.get();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.f131541t.get();
            int i17 = message.what;
            if (i17 == 0) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.f131540s.get();
                z17 = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl) arrayList4.get(i18);
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
            java.util.ArrayList arrayList5 = (java.util.ArrayList) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.f131543v.get();
            java.util.ArrayList arrayList6 = (java.util.ArrayList) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.f131542u.get();
            int size2 = arrayList2.size();
            for (int i19 = 0; i19 < size2; i19++) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar2 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl) arrayList2.get(i19);
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.a(jlVar2, uptimeMillis)) {
                    arrayList5.add(jlVar2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i27 = 0; i27 < size3; i27++) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar3 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl) arrayList5.get(i27);
                    jlVar3.y();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.c(jlVar3);
                    arrayList2.remove(jlVar3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i28 = 0;
            while (i28 < size4) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar4 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl) arrayList.get(i28);
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
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl) arrayList6.get(i29)).x();
                }
                arrayList6.clear();
            }
            if (z17) {
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                sendEmptyMessageDelayed(1, java.lang.Math.max(0L, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.G - (android.os.SystemClock.uptimeMillis() - uptimeMillis)));
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    public jl(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar) {
        this.f131551m = itVar;
    }

    private static int A() {
        return f131539r.get().size();
    }

    private static void B() {
        f131539r.get().clear();
        f131540s.get().clear();
        f131541t.get().clear();
    }

    private static void C() {
    }

    public static /* synthetic */ boolean c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar) {
        jlVar.C = true;
        return true;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] o() {
        return this.f131549k;
    }

    private long p() {
        if (this.f131548j == 0) {
            return 0L;
        }
        return android.os.SystemClock.uptimeMillis() - this.f131546h;
    }

    private static long q() {
        return G;
    }

    private java.lang.Object r() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr = this.f131549k;
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
        return this.f131545J;
    }

    private void w() {
        this.f131552x = !this.f131552x;
        if (this.f131548j != 1) {
            a(true);
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        this.f131546h = uptimeMillis - (this.E - (uptimeMillis - this.f131546h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList;
        f131539r.get().remove(this);
        f131540s.get().remove(this);
        f131541t.get().remove(this);
        this.f131548j = 0;
        if (this.C && (arrayList = this.f131462a) != null) {
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
        f131539r.get().add(this);
        if (this.F <= 0 || (arrayList = this.f131462a) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((com.tencent.mapsdk.internal.iw.a) arrayList2.get(i17)).a(this);
        }
    }

    private float z() {
        return this.f131554z;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final long e() {
        return this.E;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final boolean f() {
        return this.f131548j == 1 || this.C;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final boolean g() {
        return this.D;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    /* renamed from: h */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw mo36792x5a5dd5d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl) super.mo36792x5a5dd5d();
        java.util.ArrayList<com.tencent.mapsdk.internal.jl.b> arrayList = this.K;
        if (arrayList != null) {
            jlVar.K = new java.util.ArrayList<>();
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                jlVar.K.add(arrayList.get(i17));
            }
        }
        jlVar.f131547i = -1L;
        jlVar.f131552x = false;
        jlVar.f131553y = 0;
        jlVar.f131548j = 0;
        jlVar.A = false;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr = this.f131549k;
        if (jhVarArr != null) {
            int length = jhVarArr.length;
            jlVar.f131549k = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[length];
            jlVar.f131550l = new java.util.HashMap<>(length);
            for (int i18 = 0; i18 < length; i18++) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh mo36799x5a5dd5d = jhVarArr[i18].mo36799x5a5dd5d();
                jlVar.f131549k[i18] = mo36799x5a5dd5d;
                jlVar.f131550l.put(java.lang.Integer.valueOf(mo36799x5a5dd5d.f131518a), mo36799x5a5dd5d);
            }
        }
        return jlVar;
    }

    /* renamed from: toString */
    public java.lang.String mo36797x9616526c() {
        java.lang.String str = "ValueAnimator@" + java.lang.Integer.toHexString(hashCode());
        if (this.f131549k != null) {
            for (int i17 = 0; i17 < this.f131549k.length; i17++) {
                str = str + "\n    " + this.f131549k[i17].m36800x9616526c();
            }
        }
        return str;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar, int... iArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl(itVar);
        jlVar.a(iArr);
        return jlVar;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl b(double... dArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl(null);
        jlVar.a(dArr);
        return jlVar;
    }

    private void c(int i17) {
        this.I = i17;
    }

    private void e(long j17) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (this.f131548j != 1) {
            this.f131547i = j17;
            this.f131548j = 2;
        }
        this.f131546h = uptimeMillis - j17;
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
        this.f131546h = j17 - (j18 - j19);
        this.f131548j = 1;
        return true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final long d() {
        return this.F;
    }

    public static void d(long j17) {
        G = j17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final void c() {
        if (!f131539r.get().contains(this) && !f131540s.get().contains(this)) {
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

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh... jhVarArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl(itVar);
        jlVar.a(jhVarArr);
        return jlVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw b(long j17) {
        if (j17 >= 0) {
            this.E = j17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("Animators cannot have negative duration: ".concat(java.lang.String.valueOf(j17)));
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk<?> jkVar, java.lang.Object[] objArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl(itVar);
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
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr = this.f131549k;
        if (jhVarArr != null && jhVarArr.length != 0) {
            jhVarArr[0].a(iArr);
        } else {
            a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh.a(0, iArr));
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
            int r0 = r10.f131548j
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L1a
            r10.f131548j = r3
            long r4 = r10.f131547i
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
            r10.f131546h = r11
            goto L1a
        L12:
            long r4 = r11 - r4
            r10.f131546h = r4
            r4 = -1
            r10.f131547i = r4
        L1a:
            int r0 = r10.f131548j
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
            long r8 = r10.f131546h
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
            int r12 = r10.f131553y
            int r0 = r10.H
            if (r12 < r0) goto L46
            r12 = -1
            if (r0 != r12) goto L41
            goto L46
        L41:
            float r11 = java.lang.Math.min(r11, r1)
            goto L71
        L46:
            java.util.ArrayList<com.tencent.mapsdk.internal.iw$a> r12 = r10.f131462a
            if (r12 == 0) goto L59
            int r12 = r12.size()
            r0 = r5
        L4f:
            if (r0 >= r12) goto L59
            java.util.ArrayList<com.tencent.mapsdk.internal.iw$a> r2 = r10.f131462a
            r2.get(r0)
            int r0 = r0 + 1
            goto L4f
        L59:
            int r12 = r10.I
            if (r12 != r4) goto L62
            boolean r12 = r10.f131552x
            r12 = r12 ^ r3
            r10.f131552x = r12
        L62:
            int r12 = r10.f131553y
            int r0 = (int) r11
            int r12 = r12 + r0
            r10.f131553y = r12
            float r11 = r11 % r1
            long r2 = r10.f131546h
            long r6 = r10.E
            long r2 = r2 + r6
            r10.f131546h = r2
        L70:
            r3 = r5
        L71:
            boolean r12 = r10.f131552x
            if (r12 == 0) goto L77
            float r11 = r1 - r11
        L77:
            r10.a(r11)
            r5 = r3
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.c(long):boolean");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final void b() {
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList;
        if (this.f131548j != 0 || f131540s.get().contains(this) || f131541t.get().contains(this)) {
            if (this.C && (arrayList = this.f131462a) != null) {
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
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr = this.f131549k;
        if (jhVarArr != null && jhVarArr.length != 0) {
            jhVarArr[0].a(dArr);
        } else {
            a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh.a(0, dArr));
        }
    }

    public void a(java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr = this.f131549k;
        if (jhVarArr != null && jhVarArr.length != 0) {
            jhVarArr[0].a(objArr);
        } else {
            a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh.a(0, objArr));
        }
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh... jhVarArr) {
        int length = jhVarArr.length;
        this.f131549k = jhVarArr;
        this.f131550l = new java.util.HashMap<>(length);
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh jhVar : jhVarArr) {
            this.f131550l.put(java.lang.Integer.valueOf(jhVar.f131518a), jhVar);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final void a(long j17) {
        this.F = j17;
    }

    private java.lang.Object a(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh jhVar = this.f131550l.get(java.lang.Integer.valueOf(i17));
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

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final void a(android.view.animation.Interpolator interpolator) {
        if (interpolator != null) {
            this.f131545J = interpolator;
        } else {
            this.f131545J = new android.view.animation.LinearInterpolator();
        }
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk<?> jkVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr;
        if (jkVar == null || (jhVarArr = this.f131549k) == null || jhVarArr.length <= 0) {
            return;
        }
        jhVarArr[0].a(jkVar);
    }

    private void a(boolean z17) {
        this.f131552x = z17;
        this.f131553y = 0;
        this.f131548j = 0;
        this.D = true;
        this.A = false;
        f131540s.get().add(this);
        if (this.F == 0) {
            long uptimeMillis = this.f131548j != 0 ? android.os.SystemClock.uptimeMillis() - this.f131546h : 0L;
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
            if (this.f131548j != 1) {
                this.f131547i = uptimeMillis;
                this.f131548j = 2;
            }
            this.f131546h = uptimeMillis2 - uptimeMillis;
            c(uptimeMillis2);
            this.f131548j = 0;
            this.C = true;
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = this.f131462a;
            if (arrayList != null) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i17 = 0; i17 < size; i17++) {
                    ((com.tencent.mapsdk.internal.iw.a) arrayList2.get(i17)).a(this);
                }
            }
        }
        com.tencent.mapsdk.internal.jl.a aVar = f131538q.get();
        if (aVar == null) {
            aVar = new com.tencent.mapsdk.internal.jl.a(android.os.Looper.getMainLooper());
            f131538q.set(aVar);
        } else {
            aVar.removeMessages(0);
            aVar.removeMessages(1);
        }
        aVar.sendEmptyMessage(0);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final void a() {
        a(false);
    }

    public void a(float f17) {
        float interpolation = this.f131545J.getInterpolation(f17);
        this.f131554z = interpolation;
        int length = this.f131549k.length;
        for (int i17 = 0; i17 < length; i17++) {
            this.f131549k[i17].a(interpolation);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar = this.f131551m;
            if (itVar != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh jhVar = this.f131549k[i17];
                itVar.a(jhVar.f131518a, jhVar.b());
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

    public static /* synthetic */ boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl jlVar, long j17) {
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
        jlVar.f131546h = j17 - (j18 - j19);
        jlVar.f131548j = 1;
        return true;
    }
}
