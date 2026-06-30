package bw5;

/* loaded from: classes2.dex */
public class zh extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117524d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117525e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117526f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f117527g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117528h;

    /* renamed from: i, reason: collision with root package name */
    public int f117529i;

    /* renamed from: m, reason: collision with root package name */
    public int f117530m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f117531n = new boolean[8];

    static {
        new bw5.zh();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zh mo11468x92b714fd(byte[] bArr) {
        return (bw5.zh) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zh)) {
            return false;
        }
        bw5.zh zhVar = (bw5.zh) fVar;
        return n51.f.a(this.f117524d, zhVar.f117524d) && n51.f.a(this.f117525e, zhVar.f117525e) && n51.f.a(this.f117526f, zhVar.f117526f) && n51.f.a(this.f117527g, zhVar.f117527g) && n51.f.a(this.f117528h, zhVar.f117528h) && n51.f.a(java.lang.Integer.valueOf(this.f117529i), java.lang.Integer.valueOf(zhVar.f117529i)) && n51.f.a(java.lang.Integer.valueOf(this.f117530m), java.lang.Integer.valueOf(zhVar.f117530m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zh();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f117531n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117524d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f117525e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f117526f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f117527g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f117528h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f117529i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f117530m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f117524d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f117525e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f117526f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f117527g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f117528h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f117529i);
            }
            return zArr[7] ? i18 + b36.f.e(7, this.f117530m) : i18;
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
                this.f117524d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117525e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117526f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117527g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117528h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117529i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117530m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
