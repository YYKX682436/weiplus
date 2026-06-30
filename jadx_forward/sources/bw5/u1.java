package bw5;

/* loaded from: classes2.dex */
public class u1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115224d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115225e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115226f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115227g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115228h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f115229i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f115230m = new boolean[7];

    static {
        new bw5.u1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.u1 mo11468x92b714fd(byte[] bArr) {
        return (bw5.u1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u1)) {
            return false;
        }
        bw5.u1 u1Var = (bw5.u1) fVar;
        return n51.f.a(this.f115224d, u1Var.f115224d) && n51.f.a(this.f115225e, u1Var.f115225e) && n51.f.a(this.f115226f, u1Var.f115226f) && n51.f.a(this.f115227g, u1Var.f115227g) && n51.f.a(this.f115228h, u1Var.f115228h) && n51.f.a(this.f115229i, u1Var.f115229i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.u1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115230m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115224d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115225e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f115226f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f115227g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f115228h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f115229i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f115224d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f115225e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f115226f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f115227g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f115228h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f115229i;
            return (str12 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str12);
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
                this.f115224d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115225e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115226f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115227g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115228h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115229i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
