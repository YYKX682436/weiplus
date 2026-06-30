package bw5;

/* loaded from: classes2.dex */
public class l50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111176d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111177e;

    /* renamed from: f, reason: collision with root package name */
    public int f111178f;

    /* renamed from: g, reason: collision with root package name */
    public int f111179g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111180h = new boolean[5];

    static {
        new bw5.l50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l50 mo11468x92b714fd(byte[] bArr) {
        return (bw5.l50) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l50)) {
            return false;
        }
        bw5.l50 l50Var = (bw5.l50) fVar;
        return n51.f.a(this.f111176d, l50Var.f111176d) && n51.f.a(this.f111177e, l50Var.f111177e) && n51.f.a(java.lang.Integer.valueOf(this.f111178f), java.lang.Integer.valueOf(l50Var.f111178f)) && n51.f.a(java.lang.Integer.valueOf(this.f111179g), java.lang.Integer.valueOf(l50Var.f111179g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.l50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111180h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111176d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111177e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111178f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111179g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f111176d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f111177e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f111178f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f111179g) : i18;
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
            this.f111176d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111177e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f111178f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f111179g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
