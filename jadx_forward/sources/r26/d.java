package r26;

/* loaded from: classes10.dex */
public final class d implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f450401d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f450402e;

    /* renamed from: f, reason: collision with root package name */
    public int f450403f;

    /* renamed from: g, reason: collision with root package name */
    public e06.k f450404g;

    /* renamed from: h, reason: collision with root package name */
    public int f450405h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r26.e f450406i;

    public d(r26.e eVar) {
        this.f450406i = eVar;
        int f17 = e06.p.f(eVar.f450408b, 0, eVar.f450407a.length());
        this.f450402e = f17;
        this.f450403f = f17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            int r0 = r7.f450403f
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f450401d = r1
            r0 = 0
            r7.f450404g = r0
            goto L7b
        Lb:
            r26.e r2 = r7.f450406i
            int r3 = r2.f450409c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f450405h
            int r6 = r6 + r5
            r7.f450405h = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f450407a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            e06.k r0 = new e06.k
            int r1 = r7.f450402e
            java.lang.CharSequence r2 = r2.f450407a
            int r2 = r26.n0.H(r2)
            r0.<init>(r1, r2)
            r7.f450404g = r0
            r7.f450403f = r4
            goto L79
        L34:
            yz5.p r0 = r2.f450410d
            java.lang.CharSequence r3 = r2.f450407a
            int r6 = r7.f450403f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.mo149xb9724478(r3, r6)
            jz5.l r0 = (jz5.l) r0
            if (r0 != 0) goto L58
            e06.k r0 = new e06.k
            int r1 = r7.f450402e
            java.lang.CharSequence r2 = r2.f450407a
            int r2 = r26.n0.H(r2)
            r0.<init>(r1, r2)
            r7.f450404g = r0
            r7.f450403f = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f384366d
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f384367e
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f450402e
            e06.k r3 = e06.p.m(r3, r2)
            r7.f450404g = r3
            int r2 = r2 + r0
            r7.f450402e = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f450403f = r2
        L79:
            r7.f450401d = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r26.d.b():void");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f450401d == -1) {
            b();
        }
        return this.f450401d == 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f450401d == -1) {
            b();
        }
        if (this.f450401d == 0) {
            throw new java.util.NoSuchElementException();
        }
        e06.k kVar = this.f450404g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(kVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f450404g = null;
        this.f450401d = -1;
        return kVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
