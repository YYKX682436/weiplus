package bw5;

/* loaded from: classes10.dex */
public class q3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113446d;

    /* renamed from: e, reason: collision with root package name */
    public long f113447e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113448f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f113449g = new boolean[4];

    static {
        new bw5.q3();
    }

    public java.lang.String b() {
        return this.f113449g[3] ? this.f113448f : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.q3 mo11468x92b714fd(byte[] bArr) {
        return (bw5.q3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q3)) {
            return false;
        }
        bw5.q3 q3Var = (bw5.q3) fVar;
        return n51.f.a(this.f113446d, q3Var.f113446d) && n51.f.a(java.lang.Long.valueOf(this.f113447e), java.lang.Long.valueOf(q3Var.f113447e)) && n51.f.a(this.f113448f, q3Var.f113448f);
    }

    public bw5.q3 d(java.lang.String str) {
        this.f113446d = str;
        this.f113449g[1] = true;
        return this;
    }

    public bw5.q3 e(java.lang.String str) {
        this.f113448f = str;
        this.f113449g[3] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113449g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113446d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f113447e);
            }
            java.lang.String str2 = this.f113448f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f113446d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f113447e);
            }
            java.lang.String str4 = this.f113448f;
            return (str4 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str4);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f113446d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113447e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f113448f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
