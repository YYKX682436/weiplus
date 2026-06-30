package x36;

/* loaded from: classes14.dex */
public final class y implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.k f533250d;

    /* renamed from: e, reason: collision with root package name */
    public x36.c0 f533251e;

    /* renamed from: f, reason: collision with root package name */
    public int f533252f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f533253g;

    /* renamed from: h, reason: collision with root package name */
    public long f533254h;

    /* renamed from: i, reason: collision with root package name */
    public final x36.m f533255i;

    public y(x36.m upstream) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(upstream, "upstream");
        this.f533255i = upstream;
        x36.k mo174954x12f2b736 = upstream.mo174954x12f2b736();
        this.f533250d = mo174954x12f2b736;
        x36.c0 c0Var = mo174954x12f2b736.f533226d;
        this.f533251e = c0Var;
        this.f533252f = c0Var != null ? c0Var.f533191b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r5 == r7.f533191b) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    @Override // x36.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long B(x36.k r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L81
            boolean r5 = r8.f533253g
            r5 = r5 ^ r4
            if (r5 == 0) goto L75
            x36.c0 r5 = r8.f533251e
            x36.k r6 = r8.f533250d
            if (r5 == 0) goto L2a
            x36.c0 r7 = r6.f533226d
            if (r5 != r7) goto L2b
            int r5 = r8.f533252f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
            int r7 = r7.f533191b
            if (r5 != r7) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L69
            if (r2 != 0) goto L30
            return r0
        L30:
            long r0 = r8.f533254h
            r2 = 1
            long r0 = r0 + r2
            x36.m r2 = r8.f533255i
            boolean r0 = r2.d(r0)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            x36.c0 r0 = r8.f533251e
            if (r0 != 0) goto L51
            x36.c0 r0 = r6.f533226d
            if (r0 == 0) goto L51
            r8.f533251e = r0
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            int r0 = r0.f533191b
            r8.f533252f = r0
        L51:
            long r0 = r6.f533227e
            long r2 = r8.f533254h
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            x36.k r2 = r8.f533250d
            long r4 = r8.f533254h
            r3 = r9
            r6 = r10
            r2.b(r3, r4, r6)
            long r0 = r8.f533254h
            long r0 = r0 + r10
            r8.f533254h = r0
            return r10
        L69:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L75:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L81:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.y.B(x36.k, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f533253g = true;
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f533255i.h();
    }
}
