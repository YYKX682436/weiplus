package bw5;

/* loaded from: classes2.dex */
public class k80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110819d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110820e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110821f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110822g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110823h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f110824i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f110825m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f110826n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f110827o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f110828p = new boolean[11];

    static {
        new bw5.k80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k80 mo11468x92b714fd(byte[] bArr) {
        return (bw5.k80) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k80)) {
            return false;
        }
        bw5.k80 k80Var = (bw5.k80) fVar;
        return n51.f.a(this.f110819d, k80Var.f110819d) && n51.f.a(this.f110820e, k80Var.f110820e) && n51.f.a(this.f110821f, k80Var.f110821f) && n51.f.a(this.f110822g, k80Var.f110822g) && n51.f.a(this.f110823h, k80Var.f110823h) && n51.f.a(this.f110824i, k80Var.f110824i) && n51.f.a(this.f110825m, k80Var.f110825m) && n51.f.a(java.lang.Boolean.valueOf(this.f110826n), java.lang.Boolean.valueOf(k80Var.f110826n)) && n51.f.a(this.f110827o, k80Var.f110827o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.k80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110828p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110819d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f110820e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f110821f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f110822g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f110823h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f110824i;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f110825m;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            if (zArr[9]) {
                fVar.a(9, this.f110826n);
            }
            java.lang.String str8 = this.f110827o;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f110819d;
            if (str9 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str9);
            }
            java.lang.String str10 = this.f110820e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f110821f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f110822g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f110823h;
            if (str13 != null && zArr[5]) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f110824i;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f110825m;
            if (str15 != null && zArr[8]) {
                i18 += b36.f.j(8, str15);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f110826n);
            }
            java.lang.String str16 = this.f110827o;
            return (str16 == null || !zArr[10]) ? i18 : i18 + b36.f.j(10, str16);
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
                this.f110819d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110820e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110821f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110822g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110823h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                this.f110824i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f110825m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f110826n = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f110827o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
        }
    }
}
