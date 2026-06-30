package r45;

/* loaded from: classes9.dex */
public class ug5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468896d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468897e;

    /* renamed from: f, reason: collision with root package name */
    public int f468898f;

    /* renamed from: g, reason: collision with root package name */
    public int f468899g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468900h;

    /* renamed from: i, reason: collision with root package name */
    public int f468901i;

    /* renamed from: m, reason: collision with root package name */
    public int f468902m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f468903n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ug5)) {
            return false;
        }
        r45.ug5 ug5Var = (r45.ug5) fVar;
        return n51.f.a(this.f76494x2de60e5e, ug5Var.f76494x2de60e5e) && n51.f.a(this.f468896d, ug5Var.f468896d) && n51.f.a(this.f468897e, ug5Var.f468897e) && n51.f.a(java.lang.Integer.valueOf(this.f468898f), java.lang.Integer.valueOf(ug5Var.f468898f)) && n51.f.a(java.lang.Integer.valueOf(this.f468899g), java.lang.Integer.valueOf(ug5Var.f468899g)) && n51.f.a(this.f468900h, ug5Var.f468900h) && n51.f.a(java.lang.Integer.valueOf(this.f468901i), java.lang.Integer.valueOf(ug5Var.f468901i)) && n51.f.a(java.lang.Integer.valueOf(this.f468902m), java.lang.Integer.valueOf(ug5Var.f468902m)) && n51.f.a(this.f468903n, ug5Var.f468903n);
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
            java.lang.String str = this.f468896d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f468897e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f468898f);
            fVar.e(5, this.f468899g);
            java.lang.String str3 = this.f468900h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f468901i);
            fVar.e(8, this.f468902m);
            java.lang.String str4 = this.f468903n;
            if (str4 != null) {
                fVar.j(100, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f468896d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f468897e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f468898f) + b36.f.e(5, this.f468899g);
            java.lang.String str7 = this.f468900h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f468901i) + b36.f.e(8, this.f468902m);
            java.lang.String str8 = this.f468903n;
            return str8 != null ? e18 + b36.f.j(100, str8) : e18;
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
        r45.ug5 ug5Var = (r45.ug5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            ug5Var.f468903n = aVar2.k(intValue);
            return 0;
        }
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
                    ug5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ug5Var.f468896d = aVar2.k(intValue);
                return 0;
            case 3:
                ug5Var.f468897e = aVar2.k(intValue);
                return 0;
            case 4:
                ug5Var.f468898f = aVar2.g(intValue);
                return 0;
            case 5:
                ug5Var.f468899g = aVar2.g(intValue);
                return 0;
            case 6:
                ug5Var.f468900h = aVar2.k(intValue);
                return 0;
            case 7:
                ug5Var.f468901i = aVar2.g(intValue);
                return 0;
            case 8:
                ug5Var.f468902m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
