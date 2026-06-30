package w8;

/* loaded from: classes15.dex */
public final class x implements w8.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final w8.w f525322a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f525323b = new t9.p(32);

    /* renamed from: c, reason: collision with root package name */
    public int f525324c;

    /* renamed from: d, reason: collision with root package name */
    public int f525325d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f525326e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f525327f;

    public x(w8.w wVar) {
        this.f525322a = wVar;
    }

    @Override // w8.h0
    public void a(t9.p pVar, boolean z17) {
        int m17 = z17 ? pVar.f498074b + pVar.m() : -1;
        if (this.f525327f) {
            if (!z17) {
                return;
            }
            this.f525327f = false;
            pVar.w(m17);
            this.f525325d = 0;
        }
        while (true) {
            int i17 = pVar.f498075c;
            int i18 = pVar.f498074b;
            if (i17 - i18 <= 0) {
                return;
            }
            int i19 = this.f525325d;
            t9.p pVar2 = this.f525323b;
            if (i19 < 3) {
                if (i19 == 0) {
                    int m18 = pVar.m();
                    pVar.w(pVar.f498074b - 1);
                    if (m18 == 255) {
                        this.f525327f = true;
                        return;
                    }
                }
                int min = java.lang.Math.min(pVar.f498075c - pVar.f498074b, 3 - this.f525325d);
                pVar.b(pVar2.f498073a, this.f525325d, min);
                int i27 = this.f525325d + min;
                this.f525325d = i27;
                if (i27 == 3) {
                    pVar2.t(3);
                    pVar2.x(1);
                    int m19 = pVar2.m();
                    int m27 = pVar2.m();
                    this.f525326e = (m19 & 128) != 0;
                    this.f525324c = (((m19 & 15) << 8) | m27) + 3;
                    int a17 = pVar2.a();
                    int i28 = this.f525324c;
                    if (a17 < i28) {
                        byte[] bArr = pVar2.f498073a;
                        pVar2.t(java.lang.Math.min(4098, java.lang.Math.max(i28, bArr.length * 2)));
                        java.lang.System.arraycopy(bArr, 0, pVar2.f498073a, 0, 3);
                    }
                }
            } else {
                int min2 = java.lang.Math.min(i17 - i18, this.f525324c - i19);
                pVar.b(pVar2.f498073a, this.f525325d, min2);
                int i29 = this.f525325d + min2;
                this.f525325d = i29;
                int i37 = this.f525324c;
                if (i29 != i37) {
                    continue;
                } else {
                    if (this.f525326e) {
                        byte[] bArr2 = pVar2.f498073a;
                        int i38 = t9.d0.f498031a;
                        int i39 = -1;
                        for (int i47 = 0; i47 < i37; i47++) {
                            i39 = t9.d0.f498037g[((i39 >>> 24) ^ (bArr2[i47] & 255)) & 255] ^ (i39 << 8);
                        }
                        if (i39 != 0) {
                            this.f525327f = true;
                            return;
                        }
                        pVar2.t(this.f525324c - 4);
                    } else {
                        pVar2.t(i37);
                    }
                    this.f525322a.a(pVar2);
                    this.f525325d = 0;
                }
            }
        }
    }

    @Override // w8.h0
    public void b() {
        this.f525327f = true;
    }

    @Override // w8.h0
    public void c(t9.a0 a0Var, q8.g gVar, w8.g0 g0Var) {
        this.f525322a.c(a0Var, gVar, g0Var);
        this.f525327f = true;
    }
}
