package bw5;

/* loaded from: classes9.dex */
public class n5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112021d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112022e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112023f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112024g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112025h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112026i;

    /* renamed from: m, reason: collision with root package name */
    public int f112027m;

    /* renamed from: n, reason: collision with root package name */
    public int f112028n;

    /* renamed from: o, reason: collision with root package name */
    public int f112029o;

    /* renamed from: p, reason: collision with root package name */
    public int f112030p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f112031q = new boolean[13];

    static {
        new bw5.n5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.n5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n5)) {
            return false;
        }
        bw5.n5 n5Var = (bw5.n5) fVar;
        return n51.f.a(this.f112021d, n5Var.f112021d) && n51.f.a(this.f112022e, n5Var.f112022e) && n51.f.a(this.f112023f, n5Var.f112023f) && n51.f.a(this.f112024g, n5Var.f112024g) && n51.f.a(this.f112025h, n5Var.f112025h) && n51.f.a(this.f112026i, n5Var.f112026i) && n51.f.a(java.lang.Integer.valueOf(this.f112027m), java.lang.Integer.valueOf(n5Var.f112027m)) && n51.f.a(java.lang.Integer.valueOf(this.f112028n), java.lang.Integer.valueOf(n5Var.f112028n)) && n51.f.a(java.lang.Integer.valueOf(this.f112029o), java.lang.Integer.valueOf(n5Var.f112029o)) && n51.f.a(java.lang.Integer.valueOf(this.f112030p), java.lang.Integer.valueOf(n5Var.f112030p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112031q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112021d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f112022e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f112023f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f112024g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f112025h;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f112026i;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.e(9, this.f112027m);
            }
            if (zArr[10]) {
                fVar.e(10, this.f112028n);
            }
            if (zArr[11]) {
                fVar.e(11, this.f112029o);
            }
            if (zArr[12]) {
                fVar.e(12, this.f112030p);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f112021d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f112022e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f112023f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f112024g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f112025h;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f112026i;
            if (str12 != null && zArr[8]) {
                i18 += b36.f.j(8, str12);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f112027m);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f112028n);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f112029o);
            }
            return zArr[12] ? i18 + b36.f.e(12, this.f112030p) : i18;
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
                this.f112021d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112022e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112023f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112024g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            case 6:
            default:
                return -1;
            case 7:
                this.f112025h = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112026i = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112027m = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f112028n = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f112029o = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f112030p = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
        }
    }
}
