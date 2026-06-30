package h1;

/* loaded from: classes14.dex */
public final class a extends h1.c {

    /* renamed from: i, reason: collision with root package name */
    public final e1.g0 f359474i;

    /* renamed from: m, reason: collision with root package name */
    public final long f359475m;

    /* renamed from: n, reason: collision with root package name */
    public final long f359476n;

    /* renamed from: o, reason: collision with root package name */
    public int f359477o;

    /* renamed from: p, reason: collision with root package name */
    public final long f359478p;

    /* renamed from: q, reason: collision with root package name */
    public float f359479q;

    /* renamed from: r, reason: collision with root package name */
    public e1.z f359480r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(e1.g0 r8, long r9, long r11, int r13, p3321xbce91901.jvm.p3324x21ffc6bd.i r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            if (r14 == 0) goto L8
            int r9 = p2.m.f432922c
            long r9 = p2.m.f432921b
        L8:
            r2 = r9
            r9 = r13 & 4
            if (r9 == 0) goto L1c
            r9 = r8
            e1.d r9 = (e1.d) r9
            int r10 = r9.b()
            int r9 = r9.a()
            long r11 = p2.r.a(r10, r9)
        L1c:
            r4 = r11
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.a.<init>(e1.g0, long, long, int, kotlin.jvm.internal.i):void");
    }

    @Override // h1.c
    public boolean a(float f17) {
        this.f359479q = f17;
        return true;
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        this.f359480r = zVar;
        return true;
    }

    /* renamed from: equals */
    public boolean m132622xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1.a)) {
            return false;
        }
        h1.a aVar = (h1.a) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f359474i, aVar.f359474i)) {
            return false;
        }
        int i17 = p2.m.f432922c;
        if ((this.f359475m == aVar.f359475m) && p2.q.a(this.f359476n, aVar.f359476n)) {
            return this.f359477o == aVar.f359477o;
        }
        return false;
    }

    @Override // h1.c
    public long h() {
        return p2.r.b(this.f359478p);
    }

    /* renamed from: hashCode */
    public int m132623x8cdac1b() {
        int hashCode = this.f359474i.hashCode() * 31;
        int i17 = p2.m.f432922c;
        return ((((hashCode + java.lang.Long.hashCode(this.f359475m)) * 31) + java.lang.Long.hashCode(this.f359476n)) * 31) + java.lang.Integer.hashCode(this.f359477o);
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        g1.h.c(iVar, this.f359474i, this.f359475m, this.f359476n, 0L, p2.r.a(a06.d.b(d1.k.d(iVar.a())), a06.d.b(d1.k.b(iVar.a()))), this.f359479q, null, this.f359480r, 0, this.f359477o, 328, null);
    }

    /* renamed from: toString */
    public java.lang.String m132624x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BitmapPainter(image=");
        sb6.append(this.f359474i);
        sb6.append(", srcOffset=");
        sb6.append((java.lang.Object) p2.m.c(this.f359475m));
        sb6.append(", srcSize=");
        sb6.append((java.lang.Object) p2.q.c(this.f359476n));
        sb6.append(", filterQuality=");
        int i17 = this.f359477o;
        if (i17 == 0) {
            str = "None";
        } else {
            if (i17 == 1) {
                str = "Low";
            } else {
                if (i17 == 2) {
                    str = "Medium";
                } else {
                    str = i17 == 3 ? "High" : "Unknown";
                }
            }
        }
        sb6.append((java.lang.Object) str);
        sb6.append(')');
        return sb6.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (p2.q.b(r7) <= r4.a()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(e1.g0 r4, long r5, long r7, p3321xbce91901.jvm.p3324x21ffc6bd.i r9) {
        /*
            r3 = this;
            r3.<init>()
            r3.f359474i = r4
            r3.f359475m = r5
            r3.f359476n = r7
            r9 = 1
            r3.f359477o = r9
            int r0 = p2.m.f432922c
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            if (r1 < 0) goto L39
            int r5 = p2.m.b(r5)
            if (r5 < 0) goto L39
            long r5 = r7 >> r0
            int r5 = (int) r5
            if (r5 < 0) goto L39
            int r6 = p2.q.b(r7)
            if (r6 < 0) goto L39
            e1.d r4 = (e1.d) r4
            int r6 = r4.b()
            if (r5 > r6) goto L39
            int r5 = p2.q.b(r7)
            int r4 = r4.a()
            if (r5 > r4) goto L39
            goto L3a
        L39:
            r9 = 0
        L3a:
            if (r9 == 0) goto L43
            r3.f359478p = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f359479q = r4
            return
        L43:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Failed requirement."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.a.<init>(e1.g0, long, long, kotlin.jvm.internal.i):void");
    }
}
