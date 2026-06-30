package bw5;

/* loaded from: classes2.dex */
public class ir extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110215d;

    /* renamed from: e, reason: collision with root package name */
    public int f110216e;

    /* renamed from: f, reason: collision with root package name */
    public int f110217f;

    /* renamed from: g, reason: collision with root package name */
    public int f110218g;

    /* renamed from: h, reason: collision with root package name */
    public int f110219h;

    /* renamed from: i, reason: collision with root package name */
    public int f110220i;

    /* renamed from: m, reason: collision with root package name */
    public int f110221m;

    /* renamed from: n, reason: collision with root package name */
    public int f110222n;

    /* renamed from: o, reason: collision with root package name */
    public int f110223o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f110224p = new boolean[10];

    static {
        new bw5.ir();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ir mo11468x92b714fd(byte[] bArr) {
        return (bw5.ir) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ir)) {
            return false;
        }
        bw5.ir irVar = (bw5.ir) fVar;
        return n51.f.a(this.f110215d, irVar.f110215d) && n51.f.a(java.lang.Integer.valueOf(this.f110216e), java.lang.Integer.valueOf(irVar.f110216e)) && n51.f.a(java.lang.Integer.valueOf(this.f110217f), java.lang.Integer.valueOf(irVar.f110217f)) && n51.f.a(java.lang.Integer.valueOf(this.f110218g), java.lang.Integer.valueOf(irVar.f110218g)) && n51.f.a(java.lang.Integer.valueOf(this.f110219h), java.lang.Integer.valueOf(irVar.f110219h)) && n51.f.a(java.lang.Integer.valueOf(this.f110220i), java.lang.Integer.valueOf(irVar.f110220i)) && n51.f.a(java.lang.Integer.valueOf(this.f110221m), java.lang.Integer.valueOf(irVar.f110221m)) && n51.f.a(java.lang.Integer.valueOf(this.f110222n), java.lang.Integer.valueOf(irVar.f110222n)) && n51.f.a(java.lang.Integer.valueOf(this.f110223o), java.lang.Integer.valueOf(irVar.f110223o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ir();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110224p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110215d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110216e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f110217f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f110218g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f110219h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f110220i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f110221m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f110222n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f110223o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f110215d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f110216e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f110217f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f110218g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f110219h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f110220i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f110221m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f110222n);
            }
            return zArr[9] ? i18 + b36.f.e(9, this.f110223o) : i18;
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
        switch (intValue) {
            case 1:
                this.f110215d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110216e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110217f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110218g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110219h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110220i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110221m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f110222n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f110223o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
