package w8;

/* loaded from: classes15.dex */
public final class r implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f525279a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.j f525280b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f525281c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f525282d;

    /* renamed from: e, reason: collision with root package name */
    public q8.o f525283e;

    /* renamed from: f, reason: collision with root package name */
    public int f525284f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f525285g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f525286h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f525287i;

    /* renamed from: j, reason: collision with root package name */
    public long f525288j;

    /* renamed from: k, reason: collision with root package name */
    public int f525289k;

    /* renamed from: l, reason: collision with root package name */
    public long f525290l;

    public r(java.lang.String str) {
        t9.p pVar = new t9.p(4);
        this.f525279a = pVar;
        pVar.f498073a[0] = -1;
        this.f525280b = new q8.j();
        this.f525281c = str;
    }

    @Override // w8.h
    public void a(t9.p pVar) {
        while (true) {
            int i17 = pVar.f498075c;
            int i18 = pVar.f498074b;
            if (i17 - i18 <= 0) {
                return;
            }
            int i19 = this.f525284f;
            t9.p pVar2 = this.f525279a;
            if (i19 == 0) {
                byte[] bArr = pVar.f498073a;
                while (true) {
                    if (i18 >= i17) {
                        pVar.w(i17);
                        break;
                    }
                    byte b17 = bArr[i18];
                    boolean z17 = (b17 & 255) == 255;
                    boolean z18 = this.f525287i && (b17 & 224) == 224;
                    this.f525287i = z17;
                    if (z18) {
                        pVar.w(i18 + 1);
                        this.f525287i = false;
                        pVar2.f498073a[1] = bArr[i18];
                        this.f525285g = 2;
                        this.f525284f = 1;
                        break;
                    }
                    i18++;
                }
            } else if (i19 == 1) {
                int min = java.lang.Math.min(i17 - i18, 4 - this.f525285g);
                pVar.b(pVar2.f498073a, this.f525285g, min);
                int i27 = this.f525285g + min;
                this.f525285g = i27;
                if (i27 >= 4) {
                    pVar2.w(0);
                    int c17 = pVar2.c();
                    q8.j jVar = this.f525280b;
                    if (q8.j.b(c17, jVar)) {
                        this.f525289k = jVar.f442168c;
                        if (!this.f525286h) {
                            int i28 = jVar.f442169d;
                            this.f525288j = (jVar.f442172g * 1000000) / i28;
                            this.f525283e.c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.c(this.f525282d, jVar.f442167b, null, -1, 4096, jVar.f442170e, i28, null, null, 0, this.f525281c));
                            this.f525286h = true;
                        }
                        pVar2.w(0);
                        this.f525283e.a(pVar2, 4);
                        this.f525284f = 2;
                    } else {
                        this.f525285g = 0;
                        this.f525284f = 1;
                    }
                }
            } else if (i19 == 2) {
                int min2 = java.lang.Math.min(i17 - i18, this.f525289k - this.f525285g);
                this.f525283e.a(pVar, min2);
                int i29 = this.f525285g + min2;
                this.f525285g = i29;
                int i37 = this.f525289k;
                if (i29 >= i37) {
                    this.f525283e.b(this.f525290l, 1, i37, 0, null);
                    this.f525290l += this.f525288j;
                    this.f525285g = 0;
                    this.f525284f = 0;
                }
            }
        }
    }

    @Override // w8.h
    public void b() {
        this.f525284f = 0;
        this.f525285g = 0;
        this.f525287i = false;
    }

    @Override // w8.h
    public void c() {
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        this.f525290l = j17;
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f525282d = g0Var.f525178e;
        g0Var.b();
        this.f525283e = gVar.l(g0Var.f525177d, 1);
    }
}
