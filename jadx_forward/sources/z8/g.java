package z8;

/* loaded from: classes15.dex */
public final class g extends m8.a implements android.os.Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public final z8.d f552160o;

    /* renamed from: p, reason: collision with root package name */
    public final z8.f f552161p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Handler f552162q;

    /* renamed from: r, reason: collision with root package name */
    public final m8.s f552163r;

    /* renamed from: s, reason: collision with root package name */
    public final z8.e f552164s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f[] f552165t;

    /* renamed from: u, reason: collision with root package name */
    public final long[] f552166u;

    /* renamed from: v, reason: collision with root package name */
    public int f552167v;

    /* renamed from: w, reason: collision with root package name */
    public int f552168w;

    /* renamed from: x, reason: collision with root package name */
    public z8.b f552169x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f552170y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z8.f fVar, android.os.Looper looper) {
        super(4);
        z8.d dVar = z8.d.f552158a;
        fVar.getClass();
        this.f552161p = fVar;
        this.f552162q = looper == null ? null : new android.os.Handler(looper, this);
        this.f552160o = dVar;
        this.f552163r = new m8.s();
        this.f552164s = new z8.e();
        this.f552165t = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f[5];
        this.f552166u = new long[5];
    }

    @Override // m8.c0
    public int c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        ((z8.c) this.f552160o).getClass();
        java.lang.String str = c1601x7dc4e417.f125613i;
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54228xf853cae9.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54225x1223e6ab.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54236x301c48d2.equals(str) ? 4 : 0;
    }

    @Override // m8.b0
    public boolean h() {
        return this.f552170y;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 0) {
            throw new java.lang.IllegalStateException();
        }
        this.f552161p.p((com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f) message.obj);
        return true;
    }

    @Override // m8.b0
    public void i(long j17, long j18) {
        boolean z17 = this.f552170y;
        long[] jArr = this.f552166u;
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f[] c1603xe907df4fArr = this.f552165t;
        if (!z17 && this.f552168w < 5) {
            z8.e eVar = this.f552164s;
            eVar.l();
            m8.s sVar = this.f552163r;
            if (r(sVar, eVar, false) == -4) {
                if (eVar.b(4)) {
                    this.f552170y = true;
                } else if (!eVar.k()) {
                    eVar.f552159i = sVar.f406199a.C;
                    eVar.f425143f.flip();
                    int i17 = (this.f552167v + this.f552168w) % 5;
                    c1603xe907df4fArr[i17] = this.f552169x.a(eVar);
                    jArr[i17] = eVar.f425144g;
                    this.f552168w++;
                }
            }
        }
        if (this.f552168w > 0) {
            int i18 = this.f552167v;
            if (jArr[i18] <= j17) {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f c1603xe907df4f = c1603xe907df4fArr[i18];
                android.os.Handler handler = this.f552162q;
                if (handler != null) {
                    handler.obtainMessage(0, c1603xe907df4f).sendToTarget();
                } else {
                    this.f552161p.p(c1603xe907df4f);
                }
                int i19 = this.f552167v;
                c1603xe907df4fArr[i19] = null;
                this.f552167v = (i19 + 1) % 5;
                this.f552168w--;
            }
        }
    }

    @Override // m8.b0
    /* renamed from: isReady */
    public boolean mo134934x7b5e8699() {
        return true;
    }

    @Override // m8.a
    public void l() {
        java.util.Arrays.fill(this.f552165t, (java.lang.Object) null);
        this.f552167v = 0;
        this.f552168w = 0;
        this.f552169x = null;
    }

    @Override // m8.a
    public void n(long j17, boolean z17) {
        java.util.Arrays.fill(this.f552165t, (java.lang.Object) null);
        this.f552167v = 0;
        this.f552168w = 0;
        this.f552170y = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r2.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54228xf853cae9) == false) goto L4;
     */
    @Override // m8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] r2, long r3) {
        /*
            r1 = this;
            r3 = 0
            r2 = r2[r3]
            z8.d r4 = r1.f552160o
            z8.c r4 = (z8.c) r4
            r4.getClass()
            java.lang.String r2 = r2.f125613i
            r2.getClass()
            int r4 = r2.hashCode()
            r0 = -1
            switch(r4) {
                case -1248341703: goto L2f;
                case 1154383568: goto L24;
                case 1652648887: goto L19;
                default: goto L17;
            }
        L17:
            r3 = r0
            goto L38
        L19:
            java.lang.String r3 = "application/x-scte35"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            goto L17
        L22:
            r3 = 2
            goto L38
        L24:
            java.lang.String r3 = "application/x-emsg"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2d
            goto L17
        L2d:
            r3 = 1
            goto L38
        L2f:
            java.lang.String r4 = "application/id3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L38
            goto L17
        L38:
            switch(r3) {
                case 0: goto L4f;
                case 1: goto L49;
                case 2: goto L43;
                default: goto L3b;
            }
        L3b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Attempted to create decoder for unsupported format"
            r2.<init>(r3)
            throw r2
        L43:
            c9.b r2 = new c9.b
            r2.<init>()
            goto L55
        L49:
            a9.b r2 = new a9.b
            r2.<init>()
            goto L55
        L4f:
            b9.i r2 = new b9.i
            r3 = 0
            r2.<init>(r3)
        L55:
            r1.f552169x = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.g.q(com.google.android.exoplayer2.Format[], long):void");
    }
}
