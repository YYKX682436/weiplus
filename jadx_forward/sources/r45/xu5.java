package r45;

/* loaded from: classes12.dex */
public class xu5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f471959d;

    /* renamed from: e, reason: collision with root package name */
    public int f471960e;

    /* renamed from: f, reason: collision with root package name */
    public int f471961f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471962g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471963h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471964i;

    /* renamed from: m, reason: collision with root package name */
    public int f471965m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471966n;

    /* renamed from: o, reason: collision with root package name */
    public int f471967o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f471968p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xu5)) {
            return false;
        }
        r45.xu5 xu5Var = (r45.xu5) fVar;
        return n51.f.a(this.f76494x2de60e5e, xu5Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f471959d), java.lang.Integer.valueOf(xu5Var.f471959d)) && n51.f.a(java.lang.Integer.valueOf(this.f471960e), java.lang.Integer.valueOf(xu5Var.f471960e)) && n51.f.a(java.lang.Integer.valueOf(this.f471961f), java.lang.Integer.valueOf(xu5Var.f471961f)) && n51.f.a(this.f471962g, xu5Var.f471962g) && n51.f.a(this.f471963h, xu5Var.f471963h) && n51.f.a(this.f471964i, xu5Var.f471964i) && n51.f.a(java.lang.Integer.valueOf(this.f471965m), java.lang.Integer.valueOf(xu5Var.f471965m)) && n51.f.a(this.f471966n, xu5Var.f471966n) && n51.f.a(java.lang.Integer.valueOf(this.f471967o), java.lang.Integer.valueOf(xu5Var.f471967o)) && n51.f.a(this.f471968p, xu5Var.f471968p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f471959d);
            fVar.e(3, this.f471960e);
            fVar.e(4, this.f471961f);
            java.lang.String str = this.f471962g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f471963h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f471964i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f471965m);
            java.lang.String str4 = this.f471966n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f471967o);
            java.lang.String str5 = this.f471968p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f471959d) + b36.f.e(3, this.f471960e) + b36.f.e(4, this.f471961f);
            java.lang.String str6 = this.f471962g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f471963h;
            if (str7 != null) {
                i18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f471964i;
            if (str8 != null) {
                i18 += b36.f.j(7, str8);
            }
            int e17 = i18 + b36.f.e(8, this.f471965m);
            java.lang.String str9 = this.f471966n;
            if (str9 != null) {
                e17 += b36.f.j(9, str9);
            }
            int e18 = e17 + b36.f.e(10, this.f471967o);
            java.lang.String str10 = this.f471968p;
            return str10 != null ? e18 + b36.f.j(11, str10) : e18;
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
        r45.xu5 xu5Var = (r45.xu5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    xu5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                xu5Var.f471959d = aVar2.g(intValue);
                return 0;
            case 3:
                xu5Var.f471960e = aVar2.g(intValue);
                return 0;
            case 4:
                xu5Var.f471961f = aVar2.g(intValue);
                return 0;
            case 5:
                xu5Var.f471962g = aVar2.k(intValue);
                return 0;
            case 6:
                xu5Var.f471963h = aVar2.k(intValue);
                return 0;
            case 7:
                xu5Var.f471964i = aVar2.k(intValue);
                return 0;
            case 8:
                xu5Var.f471965m = aVar2.g(intValue);
                return 0;
            case 9:
                xu5Var.f471966n = aVar2.k(intValue);
                return 0;
            case 10:
                xu5Var.f471967o = aVar2.g(intValue);
                return 0;
            case 11:
                xu5Var.f471968p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
