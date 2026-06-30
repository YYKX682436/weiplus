package r45;

/* loaded from: classes9.dex */
public class e77 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454617d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f77 f454618e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454619f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454620g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454621h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454622i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454623m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454624n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e77)) {
            return false;
        }
        r45.e77 e77Var = (r45.e77) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454617d), java.lang.Integer.valueOf(e77Var.f454617d)) && n51.f.a(this.f454618e, e77Var.f454618e) && n51.f.a(this.f454619f, e77Var.f454619f) && n51.f.a(this.f454620g, e77Var.f454620g) && n51.f.a(this.f454621h, e77Var.f454621h) && n51.f.a(this.f454622i, e77Var.f454622i) && n51.f.a(this.f454623m, e77Var.f454623m) && n51.f.a(this.f454624n, e77Var.f454624n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454617d);
            r45.f77 f77Var = this.f454618e;
            if (f77Var != null) {
                fVar.i(2, f77Var.mo75928xcd1e8d8());
                this.f454618e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f454619f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f454620g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f454621h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f454622i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f454623m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f454624n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454617d) + 0;
            r45.f77 f77Var2 = this.f454618e;
            if (f77Var2 != null) {
                e17 += b36.f.i(2, f77Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f454619f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f454620g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f454621h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f454622i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f454623m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f454624n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.e77 e77Var = (r45.e77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e77Var.f454617d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.f77 f77Var3 = new r45.f77();
                    if (bArr != null && bArr.length > 0) {
                        f77Var3.mo11468x92b714fd(bArr);
                    }
                    e77Var.f454618e = f77Var3;
                }
                return 0;
            case 3:
                e77Var.f454619f = aVar2.k(intValue);
                return 0;
            case 4:
                e77Var.f454620g = aVar2.k(intValue);
                return 0;
            case 5:
                e77Var.f454621h = aVar2.k(intValue);
                return 0;
            case 6:
                e77Var.f454622i = aVar2.k(intValue);
                return 0;
            case 7:
                e77Var.f454623m = aVar2.k(intValue);
                return 0;
            case 8:
                e77Var.f454624n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
