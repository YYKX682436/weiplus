package w8;

/* loaded from: classes15.dex */
public final class f implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f525157a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f525158b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f525159c;

    /* renamed from: d, reason: collision with root package name */
    public q8.o f525160d;

    /* renamed from: e, reason: collision with root package name */
    public int f525161e;

    /* renamed from: f, reason: collision with root package name */
    public int f525162f;

    /* renamed from: g, reason: collision with root package name */
    public int f525163g;

    /* renamed from: h, reason: collision with root package name */
    public long f525164h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f525165i;

    /* renamed from: j, reason: collision with root package name */
    public int f525166j;

    /* renamed from: k, reason: collision with root package name */
    public long f525167k;

    public f(java.lang.String str) {
        t9.p pVar = new t9.p(new byte[15]);
        this.f525157a = pVar;
        byte[] bArr = pVar.f498073a;
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = 1;
        this.f525161e = 0;
        this.f525158b = str;
    }

    @Override // w8.h
    public void a(t9.p pVar) {
        while (true) {
            int i17 = pVar.f498075c;
            int i18 = pVar.f498074b;
            if (i17 - i18 <= 0) {
                return;
            }
            int i19 = this.f525161e;
            boolean z17 = false;
            if (i19 == 0) {
                while (true) {
                    if (pVar.f498075c - pVar.f498074b <= 0) {
                        break;
                    }
                    int i27 = this.f525163g << 8;
                    this.f525163g = i27;
                    int m17 = i27 | pVar.m();
                    this.f525163g = m17;
                    if (m17 == 2147385345) {
                        this.f525163g = 0;
                        z17 = true;
                        break;
                    }
                }
                if (z17) {
                    this.f525162f = 4;
                    this.f525161e = 1;
                }
            } else if (i19 == 1) {
                t9.p pVar2 = this.f525157a;
                byte[] bArr = pVar2.f498073a;
                int min = java.lang.Math.min(i17 - i18, 15 - this.f525162f);
                pVar.b(bArr, this.f525162f, min);
                int i28 = this.f525162f + min;
                this.f525162f = i28;
                if (i28 == 15) {
                    byte[] bArr2 = pVar2.f498073a;
                    if (this.f525165i == null) {
                        java.lang.String str = this.f525159c;
                        java.lang.String str2 = this.f525158b;
                        t9.o oVar = new t9.o(bArr2, bArr2.length);
                        oVar.f(60);
                        int i29 = n8.y.f417128a[oVar.d(6)];
                        int i37 = n8.y.f417129b[oVar.d(4)];
                        int d17 = oVar.d(5);
                        int i38 = d17 >= 29 ? -1 : (n8.y.f417130c[d17] * 1000) / 2;
                        oVar.f(10);
                        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c17 = com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.c(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54250xb16311ba, null, i38, -1, i29 + (oVar.d(2) > 0 ? 1 : 0), i37, null, null, 0, str2);
                        this.f525165i = c17;
                        this.f525160d.c(c17);
                    }
                    this.f525166j = (((bArr2[5] & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f525164h = (int) (((((((bArr2[4] & 1) << 6) | ((r3 & 252) >> 2)) + 1) * 32) * 1000000) / this.f525165i.f125626y);
                    pVar2.w(0);
                    this.f525160d.a(pVar2, 15);
                    this.f525161e = 2;
                }
            } else if (i19 == 2) {
                int min2 = java.lang.Math.min(i17 - i18, this.f525166j - this.f525162f);
                this.f525160d.a(pVar, min2);
                int i39 = this.f525162f + min2;
                this.f525162f = i39;
                int i47 = this.f525166j;
                if (i39 == i47) {
                    this.f525160d.b(this.f525167k, 1, i47, 0, null);
                    this.f525167k += this.f525164h;
                    this.f525161e = 0;
                }
            }
        }
    }

    @Override // w8.h
    public void b() {
        this.f525161e = 0;
        this.f525162f = 0;
        this.f525163g = 0;
    }

    @Override // w8.h
    public void c() {
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        this.f525167k = j17;
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f525159c = g0Var.f525178e;
        g0Var.b();
        this.f525160d = gVar.l(g0Var.f525177d, 1);
    }
}
