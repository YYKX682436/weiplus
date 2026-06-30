package bw5;

/* loaded from: classes2.dex */
public class fa0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108734d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f108735e;

    /* renamed from: f, reason: collision with root package name */
    public int f108736f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f108737g = new boolean[4];

    static {
        new bw5.fa0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fa0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.fa0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fa0)) {
            return false;
        }
        bw5.fa0 fa0Var = (bw5.fa0) fVar;
        return n51.f.a(this.f108734d, fa0Var.f108734d) && n51.f.a(java.lang.Boolean.valueOf(this.f108735e), java.lang.Boolean.valueOf(fa0Var.f108735e)) && n51.f.a(java.lang.Integer.valueOf(this.f108736f), java.lang.Integer.valueOf(fa0Var.f108736f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fa0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108737g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108734d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f108735e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f108736f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f108734d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f108735e);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f108736f) : i18;
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
            this.f108734d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108735e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f108736f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
