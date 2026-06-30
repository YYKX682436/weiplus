package bw5;

/* loaded from: classes2.dex */
public class b9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107101d;

    /* renamed from: e, reason: collision with root package name */
    public int f107102e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107103f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107104g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107105h = new boolean[5];

    static {
        new bw5.b9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b9 mo11468x92b714fd(byte[] bArr) {
        return (bw5.b9) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b9)) {
            return false;
        }
        bw5.b9 b9Var = (bw5.b9) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107101d), java.lang.Integer.valueOf(b9Var.f107101d)) && n51.f.a(java.lang.Integer.valueOf(this.f107102e), java.lang.Integer.valueOf(b9Var.f107102e)) && n51.f.a(this.f107103f, b9Var.f107103f) && n51.f.a(this.f107104g, b9Var.f107104g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.b9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107105h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107101d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f107102e);
            }
            java.lang.String str = this.f107103f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f107104g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107101d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f107102e);
            }
            java.lang.String str3 = this.f107103f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f107104g;
            return (str4 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str4);
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
            this.f107101d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107102e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107103f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f107104g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
