package bw5;

/* loaded from: classes2.dex */
public class ce extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107592d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107593e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107594f;

    /* renamed from: g, reason: collision with root package name */
    public int f107595g;

    /* renamed from: h, reason: collision with root package name */
    public int f107596h;

    /* renamed from: i, reason: collision with root package name */
    public int f107597i;

    /* renamed from: m, reason: collision with root package name */
    public int f107598m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f107599n = new boolean[8];

    static {
        new bw5.ce();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ce mo11468x92b714fd(byte[] bArr) {
        return (bw5.ce) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ce)) {
            return false;
        }
        bw5.ce ceVar = (bw5.ce) fVar;
        return n51.f.a(this.f107592d, ceVar.f107592d) && n51.f.a(this.f107593e, ceVar.f107593e) && n51.f.a(this.f107594f, ceVar.f107594f) && n51.f.a(java.lang.Integer.valueOf(this.f107595g), java.lang.Integer.valueOf(ceVar.f107595g)) && n51.f.a(java.lang.Integer.valueOf(this.f107596h), java.lang.Integer.valueOf(ceVar.f107596h)) && n51.f.a(java.lang.Integer.valueOf(this.f107597i), java.lang.Integer.valueOf(ceVar.f107597i)) && n51.f.a(java.lang.Integer.valueOf(this.f107598m), java.lang.Integer.valueOf(ceVar.f107598m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ce();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107599n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107592d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107593e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f107594f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107595g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107596h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107597i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f107598m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f107592d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f107593e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f107594f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f107595g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f107596h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f107597i);
            }
            return zArr[7] ? i18 + b36.f.e(7, this.f107598m) : i18;
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
                this.f107592d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107593e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107594f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107595g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107596h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107597i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107598m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
