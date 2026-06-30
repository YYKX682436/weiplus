package r45;

/* loaded from: classes12.dex */
public class lp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461226d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461227e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461228f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461229g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461230h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461231i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f461232m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f461233n;

    /* renamed from: o, reason: collision with root package name */
    public r45.bq0 f461234o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lp0)) {
            return false;
        }
        r45.lp0 lp0Var = (r45.lp0) fVar;
        return n51.f.a(this.f461226d, lp0Var.f461226d) && n51.f.a(this.f461227e, lp0Var.f461227e) && n51.f.a(this.f461228f, lp0Var.f461228f) && n51.f.a(this.f461229g, lp0Var.f461229g) && n51.f.a(this.f461230h, lp0Var.f461230h) && n51.f.a(this.f461231i, lp0Var.f461231i) && n51.f.a(this.f461232m, lp0Var.f461232m) && n51.f.a(java.lang.Integer.valueOf(this.f461233n), java.lang.Integer.valueOf(lp0Var.f461233n)) && n51.f.a(this.f461234o, lp0Var.f461234o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461232m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461226d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461227e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f461228f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f461229g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f461230h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f461231i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.g(7, 1, linkedList);
            fVar.e(8, this.f461233n);
            r45.bq0 bq0Var = this.f461234o;
            if (bq0Var != null) {
                fVar.i(9, bq0Var.mo75928xcd1e8d8());
                this.f461234o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f461226d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f461227e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f461228f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f461229g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f461230h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f461231i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            int g17 = j17 + b36.f.g(7, 1, linkedList) + b36.f.e(8, this.f461233n);
            r45.bq0 bq0Var2 = this.f461234o;
            return bq0Var2 != null ? g17 + b36.f.i(9, bq0Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.lp0 lp0Var = (r45.lp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lp0Var.f461226d = aVar2.k(intValue);
                return 0;
            case 2:
                lp0Var.f461227e = aVar2.k(intValue);
                return 0;
            case 3:
                lp0Var.f461228f = aVar2.k(intValue);
                return 0;
            case 4:
                lp0Var.f461229g = aVar2.k(intValue);
                return 0;
            case 5:
                lp0Var.f461230h = aVar2.k(intValue);
                return 0;
            case 6:
                lp0Var.f461231i = aVar2.k(intValue);
                return 0;
            case 7:
                lp0Var.f461232m.add(aVar2.k(intValue));
                return 0;
            case 8:
                lp0Var.f461233n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.bq0 bq0Var3 = new r45.bq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        bq0Var3.mo11468x92b714fd(bArr2);
                    }
                    lp0Var.f461234o = bq0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
