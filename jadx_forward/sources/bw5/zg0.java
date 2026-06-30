package bw5;

/* loaded from: classes2.dex */
public class zg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117515d;

    /* renamed from: e, reason: collision with root package name */
    public int f117516e;

    /* renamed from: f, reason: collision with root package name */
    public int f117517f;

    /* renamed from: g, reason: collision with root package name */
    public int f117518g;

    /* renamed from: h, reason: collision with root package name */
    public int f117519h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f117520i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f117521m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f117522n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f117523o = new boolean[9];

    static {
        new bw5.zg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zg0)) {
            return false;
        }
        bw5.zg0 zg0Var = (bw5.zg0) fVar;
        return n51.f.a(this.f117515d, zg0Var.f117515d) && n51.f.a(java.lang.Integer.valueOf(this.f117516e), java.lang.Integer.valueOf(zg0Var.f117516e)) && n51.f.a(java.lang.Integer.valueOf(this.f117517f), java.lang.Integer.valueOf(zg0Var.f117517f)) && n51.f.a(java.lang.Integer.valueOf(this.f117518g), java.lang.Integer.valueOf(zg0Var.f117518g)) && n51.f.a(java.lang.Integer.valueOf(this.f117519h), java.lang.Integer.valueOf(zg0Var.f117519h)) && n51.f.a(this.f117520i, zg0Var.f117520i) && n51.f.a(this.f117521m, zg0Var.f117521m) && n51.f.a(this.f117522n, zg0Var.f117522n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f117523o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117515d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f117516e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117517f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117518g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f117519h);
            }
            java.lang.String str2 = this.f117520i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f117521m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f117522n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f117515d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f117516e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f117517f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f117518g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f117519h);
            }
            java.lang.String str6 = this.f117520i;
            if (str6 != null && zArr[6]) {
                i18 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f117521m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f117522n;
            return (str8 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str8);
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
                this.f117515d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117516e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117517f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117518g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117519h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117520i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117521m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f117522n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.zg0) super.mo11468x92b714fd(bArr);
    }
}
