package bw5;

/* loaded from: classes2.dex */
public class sv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f114674d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114675e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114676f;

    /* renamed from: g, reason: collision with root package name */
    public float f114677g;

    /* renamed from: h, reason: collision with root package name */
    public float f114678h;

    /* renamed from: i, reason: collision with root package name */
    public int f114679i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f114680m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f114681n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f114682o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f114683p = new boolean[10];

    static {
        new bw5.sv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sv mo11468x92b714fd(byte[] bArr) {
        return (bw5.sv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sv)) {
            return false;
        }
        bw5.sv svVar = (bw5.sv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114674d), java.lang.Integer.valueOf(svVar.f114674d)) && n51.f.a(this.f114675e, svVar.f114675e) && n51.f.a(this.f114676f, svVar.f114676f) && n51.f.a(java.lang.Float.valueOf(this.f114677g), java.lang.Float.valueOf(svVar.f114677g)) && n51.f.a(java.lang.Float.valueOf(this.f114678h), java.lang.Float.valueOf(svVar.f114678h)) && n51.f.a(java.lang.Integer.valueOf(this.f114679i), java.lang.Integer.valueOf(svVar.f114679i)) && n51.f.a(this.f114680m, svVar.f114680m) && n51.f.a(this.f114681n, svVar.f114681n) && n51.f.a(this.f114682o, svVar.f114682o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.sv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114683p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114674d);
            }
            java.lang.String str = this.f114675e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f114676f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.d(4, this.f114677g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f114678h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f114679i);
            }
            java.lang.String str3 = this.f114680m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f114681n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f114682o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f114674d) : 0;
            java.lang.String str6 = this.f114675e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f114676f;
            if (str7 != null && zArr[3]) {
                e17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                e17 += b36.f.d(4, this.f114677g);
            }
            if (zArr[5]) {
                e17 += b36.f.d(5, this.f114678h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f114679i);
            }
            java.lang.String str8 = this.f114680m;
            if (str8 != null && zArr[7]) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f114681n;
            if (str9 != null && zArr[8]) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f114682o;
            return (str10 == null || !zArr[9]) ? e17 : e17 + b36.f.j(9, str10);
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
                this.f114674d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114675e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114676f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114677g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114678h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114679i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114680m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114681n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114682o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
