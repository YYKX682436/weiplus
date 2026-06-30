package com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44;

/* loaded from: classes15.dex */
public final class g extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o f296294a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 f296295b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296296c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0 f296297d;

    /* renamed from: e, reason: collision with root package name */
    public int f296298e;

    /* renamed from: f, reason: collision with root package name */
    public int f296299f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.f f296300g;

    /* renamed from: h, reason: collision with root package name */
    public int f296301h;

    /* renamed from: i, reason: collision with root package name */
    public int f296302i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f296303j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f296304k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f296305l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f296306m;

    public g(com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4) {
        this.f296295b = c22956x1a4bbf4;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = c22956x1a4bbf4.f296274p;
        this.f296296c = c22949xf1deaba4;
        this.f296297d = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0) c22949xf1deaba4.m83599xfd37656d();
        this.f296300g = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.f();
        d();
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k1
    public void a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4, int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o oVar;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o oVar2;
        int i18 = this.f296298e;
        boolean z17 = true;
        if (!(i18 == 1 && this.f296299f == 1) && i17 == 1) {
            this.f296306m = false;
            this.f296298e = 1;
            int i19 = this.f296302i;
            if (i19 != -1) {
                this.f296301h = i19;
                this.f296302i = -1;
            } else if (this.f296301h == -1) {
                this.f296301h = this.f296297d.N();
            }
            c(1);
            return;
        }
        if ((i18 == 1 || i18 == 4) && i17 == 2) {
            if (this.f296304k) {
                c(2);
                this.f296303j = true;
                return;
            }
            return;
        }
        boolean z18 = i18 == 1 || i18 == 4;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.f fVar = this.f296300g;
        if (z18 && i17 == 0) {
            e();
            if (!this.f296304k) {
                int i27 = fVar.f296291a;
                if (i27 != -1 && (oVar2 = this.f296294a) != null) {
                    oVar2.b(i27, 0.0f, 0);
                }
            } else if (fVar.f296293c == 0) {
                int i28 = this.f296301h;
                int i29 = fVar.f296291a;
                if (i28 != i29 && (oVar = this.f296294a) != null) {
                    oVar.c(i29);
                }
            } else {
                z17 = false;
            }
            if (z17) {
                c(0);
                d();
            }
        }
        if (this.f296298e == 2 && i17 == 0 && this.f296305l) {
            e();
            if (fVar.f296293c == 0) {
                int i37 = this.f296302i;
                int i38 = fVar.f296291a;
                if (i37 != i38) {
                    if (i38 == -1) {
                        i38 = 0;
                    }
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o oVar3 = this.f296294a;
                    if (oVar3 != null) {
                        oVar3.c(i38);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r7 == (n3.v0.d(r8) == 1)) goto L17;
     */
    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f296304k = r6
            r5.e()
            boolean r0 = r5.f296303j
            r1 = -1
            com.tencent.mm.xcompat.viewpager2.widget.f r2 = r5.f296300g
            r3 = 0
            if (r0 == 0) goto L4a
            r5.f296303j = r3
            if (r8 > 0) goto L2f
            if (r8 != 0) goto L2d
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 r8 = r5.f296295b
            com.tencent.mm.xcompat.recyclerview.widget.e0 r8 = r8.f296271m
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView r8 = r8.f296055b
            java.util.WeakHashMap r0 = n3.l1.f415895a
            int r8 = n3.v0.d(r8)
            if (r8 != r6) goto L29
            r8 = r6
            goto L2a
        L29:
            r8 = r3
        L2a:
            if (r7 != r8) goto L2d
            goto L2f
        L2d:
            r7 = r3
            goto L30
        L2f:
            r7 = r6
        L30:
            if (r7 == 0) goto L3a
            int r7 = r2.f296293c
            if (r7 == 0) goto L3a
            int r7 = r2.f296291a
            int r7 = r7 + r6
            goto L3c
        L3a:
            int r7 = r2.f296291a
        L3c:
            r5.f296302i = r7
            int r8 = r5.f296301h
            if (r8 == r7) goto L5a
            com.tencent.mm.xcompat.viewpager2.widget.o r8 = r5.f296294a
            if (r8 == 0) goto L5a
            r8.c(r7)
            goto L5a
        L4a:
            int r7 = r5.f296298e
            if (r7 != 0) goto L5a
            int r7 = r2.f296291a
            if (r7 != r1) goto L53
            r7 = r3
        L53:
            com.tencent.mm.xcompat.viewpager2.widget.o r8 = r5.f296294a
            if (r8 == 0) goto L5a
            r8.c(r7)
        L5a:
            int r7 = r2.f296291a
            if (r7 != r1) goto L5f
            r7 = r3
        L5f:
            float r8 = r2.f296292b
            int r0 = r2.f296293c
            com.tencent.mm.xcompat.viewpager2.widget.o r4 = r5.f296294a
            if (r4 == 0) goto L6a
            r4.b(r7, r8, r0)
        L6a:
            int r7 = r2.f296291a
            int r8 = r5.f296302i
            if (r7 == r8) goto L72
            if (r8 != r1) goto L80
        L72:
            int r7 = r2.f296293c
            if (r7 != 0) goto L80
            int r7 = r5.f296299f
            if (r7 == r6) goto L80
            r5.c(r3)
            r5.d()
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.g.b(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i17) {
        if ((this.f296298e == 3 && this.f296299f == 0) || this.f296299f == i17) {
            return;
        }
        this.f296299f = i17;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o oVar = this.f296294a;
        if (oVar != null) {
            oVar.a(i17);
        }
    }

    public final void d() {
        this.f296298e = 0;
        this.f296299f = 0;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.f fVar = this.f296300g;
        fVar.f296291a = -1;
        fVar.f296292b = 0.0f;
        fVar.f296293c = 0;
        this.f296301h = -1;
        this.f296302i = -1;
        this.f296303j = false;
        this.f296304k = false;
        this.f296306m = false;
        this.f296305l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0123, code lost:
    
        if (r6[r3 - 1][1] >= r5) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.g.e():void");
    }
}
