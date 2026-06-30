package bw5;

/* loaded from: classes2.dex */
public class nr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f112322d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112323e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112324f;

    /* renamed from: g, reason: collision with root package name */
    public int f112325g;

    /* renamed from: h, reason: collision with root package name */
    public int f112326h;

    /* renamed from: i, reason: collision with root package name */
    public long f112327i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112328m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f112329n;

    /* renamed from: o, reason: collision with root package name */
    public int f112330o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f112331p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f112332q = new boolean[11];

    static {
        new bw5.nr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nr mo11468x92b714fd(byte[] bArr) {
        return (bw5.nr) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nr)) {
            return false;
        }
        bw5.nr nrVar = (bw5.nr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f112322d), java.lang.Long.valueOf(nrVar.f112322d)) && n51.f.a(this.f112323e, nrVar.f112323e) && n51.f.a(this.f112324f, nrVar.f112324f) && n51.f.a(java.lang.Integer.valueOf(this.f112325g), java.lang.Integer.valueOf(nrVar.f112325g)) && n51.f.a(java.lang.Integer.valueOf(this.f112326h), java.lang.Integer.valueOf(nrVar.f112326h)) && n51.f.a(java.lang.Long.valueOf(this.f112327i), java.lang.Long.valueOf(nrVar.f112327i)) && n51.f.a(this.f112328m, nrVar.f112328m) && n51.f.a(this.f112329n, nrVar.f112329n) && n51.f.a(java.lang.Integer.valueOf(this.f112330o), java.lang.Integer.valueOf(nrVar.f112330o)) && n51.f.a(this.f112331p, nrVar.f112331p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112332q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f112322d);
            }
            java.lang.String str = this.f112323e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f112324f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f112325g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f112326h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f112327i);
            }
            java.lang.String str3 = this.f112328m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f112329n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f112330o);
            }
            java.lang.String str5 = this.f112331p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f112322d) : 0;
            java.lang.String str6 = this.f112323e;
            if (str6 != null && zArr[2]) {
                h17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f112324f;
            if (str7 != null && zArr[3]) {
                h17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f112325g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f112326h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f112327i);
            }
            java.lang.String str8 = this.f112328m;
            if (str8 != null && zArr[7]) {
                h17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f112329n;
            if (str9 != null && zArr[8]) {
                h17 += b36.f.j(8, str9);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f112330o);
            }
            java.lang.String str10 = this.f112331p;
            return (str10 == null || !zArr[10]) ? h17 : h17 + b36.f.j(10, str10);
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
                this.f112322d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112323e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112324f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112325g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112326h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112327i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112328m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112329n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112330o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f112331p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
