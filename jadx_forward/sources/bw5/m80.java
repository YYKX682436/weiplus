package bw5;

/* loaded from: classes2.dex */
public class m80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111643d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111644e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111645f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111646g;

    /* renamed from: h, reason: collision with root package name */
    public int f111647h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111648i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111649m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.lb0 f111650n;

    /* renamed from: o, reason: collision with root package name */
    public long f111651o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.xa0 f111652p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f111653q;

    /* renamed from: r, reason: collision with root package name */
    public int f111654r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f111655s = new boolean[13];

    static {
        new bw5.m80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m80 mo11468x92b714fd(byte[] bArr) {
        return (bw5.m80) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m80)) {
            return false;
        }
        bw5.m80 m80Var = (bw5.m80) fVar;
        return n51.f.a(this.f111643d, m80Var.f111643d) && n51.f.a(this.f111644e, m80Var.f111644e) && n51.f.a(this.f111645f, m80Var.f111645f) && n51.f.a(this.f111646g, m80Var.f111646g) && n51.f.a(java.lang.Integer.valueOf(this.f111647h), java.lang.Integer.valueOf(m80Var.f111647h)) && n51.f.a(this.f111648i, m80Var.f111648i) && n51.f.a(this.f111649m, m80Var.f111649m) && n51.f.a(this.f111650n, m80Var.f111650n) && n51.f.a(java.lang.Long.valueOf(this.f111651o), java.lang.Long.valueOf(m80Var.f111651o)) && n51.f.a(this.f111652p, m80Var.f111652p) && n51.f.a(this.f111653q, m80Var.f111653q) && n51.f.a(java.lang.Integer.valueOf(this.f111654r), java.lang.Integer.valueOf(m80Var.f111654r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.m80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111655s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111643d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111644e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f111645f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f111646g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f111647h);
            }
            java.lang.String str5 = this.f111648i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f111649m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            bw5.lb0 lb0Var = this.f111650n;
            if (lb0Var != null && zArr[8]) {
                fVar.i(8, lb0Var.mo75928xcd1e8d8());
                this.f111650n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[9]) {
                fVar.h(9, this.f111651o);
            }
            bw5.xa0 xa0Var = this.f111652p;
            if (xa0Var != null && zArr[10]) {
                fVar.i(10, xa0Var.mo75928xcd1e8d8());
                this.f111652p.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str7 = this.f111653q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            if (!zArr[12]) {
                return 0;
            }
            fVar.e(12, this.f111654r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f111643d;
            int j17 = (str8 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str8);
            java.lang.String str9 = this.f111644e;
            if (str9 != null && zArr[2]) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f111645f;
            if (str10 != null && zArr[3]) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f111646g;
            if (str11 != null && zArr[4]) {
                j17 += b36.f.j(4, str11);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f111647h);
            }
            java.lang.String str12 = this.f111648i;
            if (str12 != null && zArr[6]) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f111649m;
            if (str13 != null && zArr[7]) {
                j17 += b36.f.j(7, str13);
            }
            bw5.lb0 lb0Var2 = this.f111650n;
            if (lb0Var2 != null && zArr[8]) {
                j17 += b36.f.i(8, lb0Var2.mo75928xcd1e8d8());
            }
            if (zArr[9]) {
                j17 += b36.f.h(9, this.f111651o);
            }
            bw5.xa0 xa0Var2 = this.f111652p;
            if (xa0Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, xa0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str14 = this.f111653q;
            if (str14 != null && zArr[11]) {
                j17 += b36.f.j(11, str14);
            }
            return zArr[12] ? j17 + b36.f.e(12, this.f111654r) : j17;
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
                this.f111643d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111644e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111645f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111646g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111647h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111648i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111649m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.lb0 lb0Var3 = new bw5.lb0();
                    if (bArr != null && bArr.length > 0) {
                        lb0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f111650n = lb0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f111651o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f111652p = xa0Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f111653q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f111654r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
