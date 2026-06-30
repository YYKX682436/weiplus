package ey2;

/* loaded from: classes2.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f338974a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f338975b;

    /* renamed from: e, reason: collision with root package name */
    public int f338978e;

    /* renamed from: f, reason: collision with root package name */
    public int f338979f;

    /* renamed from: g, reason: collision with root package name */
    public long f338980g;

    /* renamed from: h, reason: collision with root package name */
    public long f338981h;

    /* renamed from: i, reason: collision with root package name */
    public long f338982i;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f338984k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f338985l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f338986m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f338987n;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f338976c = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f338977d = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public ey2.q0 f338983j = ey2.q0.f339004d;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6 A[LOOP:0: B:17:0x00a0->B:19:0x00a6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o0(int r7, boolean r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f338974a = r7
            r6.f338975b = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r6.f338976c = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r6.f338977d = r0
            ey2.q0 r0 = ey2.q0.f339004d
            r6.f338983j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r8 == 0) goto Lbf
            bu2.d0 r8 = bu2.e0.f106031a
            java.lang.Class<cq.k> r8 = cq.k.class
            i95.m r8 = i95.n0.c(r8)
            cq.k r8 = (cq.k) r8
            r1 = 1
            java.lang.String r8 = r8.Di(r1)
            com.tencent.mm.vfs.r6 r2 = new com.tencent.mm.vfs.r6
            r2.<init>(r8)
            boolean r8 = r2.y()
            if (r8 != 0) goto L41
            r2.l()
        L41:
            boolean r8 = r2.m()
            if (r8 != 0) goto L4a
            r2.J()
        L4a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = r2.o()
            r8.append(r2)
            r2 = 47
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = "_subtabs.ext"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = -1
            r2 = 0
            byte[] r7 = com.p314xaae8f345.mm.vfs.w6.N(r7, r2, r8)
            r45.tx2 r8 = new r45.tx2
            r8.<init>()
            r3 = 0
            if (r7 != 0) goto L76
            goto L86
        L76:
            r8.mo11468x92b714fd(r7)     // Catch: java.lang.Exception -> L7a
            goto L87
        L7a:
            r7 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "safeParser"
            java.lang.String r4 = ""
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r8, r4, r7)
        L86:
            r8 = r3
        L87:
            if (r8 == 0) goto L8d
            java.util.LinkedList r3 = r8.m75941xfb821914(r1)
        L8d:
            if (r3 != 0) goto L91
            kz5.p0 r3 = kz5.p0.f395529d
        L91:
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kz5.d0.q(r3, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r3.iterator()
        La0:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r8.next()
            r45.sx2 r1 = (r45.sx2) r1
            ey2.r0 r3 = new ey2.r0
            ey2.o0 r4 = new ey2.o0
            int r5 = r6.f338974a
            r4.<init>(r5, r2)
            r3.<init>(r1, r4)
            r7.add(r3)
            goto La0
        Lbc:
            r0.addAll(r7)
        Lbf:
            r6.f338987n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ey2.o0.<init>(int, boolean):void");
    }

    public final void a(ey2.q0 value) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (value != this.f338983j) {
            boolean z18 = false;
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TlTabStateVM", "tabType" + this.f338974a + ",refreshState from " + this.f338983j + " to " + value);
            }
        }
        this.f338983j = value;
    }

    /* renamed from: equals */
    public boolean m128359xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.o0)) {
            return false;
        }
        ey2.o0 o0Var = (ey2.o0) obj;
        return this.f338974a == o0Var.f338974a && this.f338975b == o0Var.f338975b;
    }

    /* renamed from: hashCode */
    public int m128360x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f338974a) * 31) + java.lang.Boolean.hashCode(this.f338975b);
    }

    /* renamed from: toString */
    public java.lang.String m128361x9616526c() {
        return "Cache(tabType=" + this.f338974a + ", isInitSubTabs=" + this.f338975b + ')';
    }
}
