package bw5;

/* loaded from: classes2.dex */
public class lh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f111314d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111315e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111316f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111317g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111318h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111319i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.x7 f111320m;

    /* renamed from: n, reason: collision with root package name */
    public int f111321n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f111322o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f111323p = new boolean[10];

    static {
        new bw5.lh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lh0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.lh0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lh0)) {
            return false;
        }
        bw5.lh0 lh0Var = (bw5.lh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111314d), java.lang.Integer.valueOf(lh0Var.f111314d)) && n51.f.a(this.f111315e, lh0Var.f111315e) && n51.f.a(this.f111316f, lh0Var.f111316f) && n51.f.a(this.f111317g, lh0Var.f111317g) && n51.f.a(this.f111318h, lh0Var.f111318h) && n51.f.a(this.f111319i, lh0Var.f111319i) && n51.f.a(this.f111320m, lh0Var.f111320m) && n51.f.a(java.lang.Integer.valueOf(this.f111321n), java.lang.Integer.valueOf(lh0Var.f111321n)) && n51.f.a(this.f111322o, lh0Var.f111322o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111323p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f111314d);
            }
            java.lang.String str = this.f111315e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f111316f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f111317g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f111318h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f111319i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            bw5.x7 x7Var = this.f111320m;
            if (x7Var != null && zArr[7]) {
                fVar.i(7, x7Var.mo75928xcd1e8d8());
                this.f111320m.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.e(8, this.f111321n);
            }
            java.lang.String str6 = this.f111322o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f111314d) : 0;
            java.lang.String str7 = this.f111315e;
            if (str7 != null && zArr[2]) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f111316f;
            if (str8 != null && zArr[3]) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f111317g;
            if (str9 != null && zArr[4]) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f111318h;
            if (str10 != null && zArr[5]) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f111319i;
            if (str11 != null && zArr[6]) {
                e17 += b36.f.j(6, str11);
            }
            bw5.x7 x7Var2 = this.f111320m;
            if (x7Var2 != null && zArr[7]) {
                e17 += b36.f.i(7, x7Var2.mo75928xcd1e8d8());
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f111321n);
            }
            java.lang.String str12 = this.f111322o;
            return (str12 == null || !zArr[9]) ? e17 : e17 + b36.f.j(9, str12);
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
                this.f111314d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111315e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111316f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111317g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111318h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111319i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr != null && bArr.length > 0) {
                        x7Var3.mo11468x92b714fd(bArr);
                    }
                    this.f111320m = x7Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f111321n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111322o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
