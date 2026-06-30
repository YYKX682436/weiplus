package r45;

/* loaded from: classes4.dex */
public class wb6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470571d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470572e;

    /* renamed from: f, reason: collision with root package name */
    public long f470573f;

    /* renamed from: g, reason: collision with root package name */
    public int f470574g;

    /* renamed from: h, reason: collision with root package name */
    public long f470575h;

    /* renamed from: i, reason: collision with root package name */
    public int f470576i;

    /* renamed from: m, reason: collision with root package name */
    public int f470577m;

    /* renamed from: n, reason: collision with root package name */
    public int f470578n;

    /* renamed from: o, reason: collision with root package name */
    public int f470579o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wb6)) {
            return false;
        }
        r45.wb6 wb6Var = (r45.wb6) fVar;
        return n51.f.a(this.f76494x2de60e5e, wb6Var.f76494x2de60e5e) && n51.f.a(this.f470571d, wb6Var.f470571d) && n51.f.a(this.f470572e, wb6Var.f470572e) && n51.f.a(java.lang.Long.valueOf(this.f470573f), java.lang.Long.valueOf(wb6Var.f470573f)) && n51.f.a(java.lang.Integer.valueOf(this.f470574g), java.lang.Integer.valueOf(wb6Var.f470574g)) && n51.f.a(java.lang.Long.valueOf(this.f470575h), java.lang.Long.valueOf(wb6Var.f470575h)) && n51.f.a(java.lang.Integer.valueOf(this.f470576i), java.lang.Integer.valueOf(wb6Var.f470576i)) && n51.f.a(java.lang.Integer.valueOf(this.f470577m), java.lang.Integer.valueOf(wb6Var.f470577m)) && n51.f.a(java.lang.Integer.valueOf(this.f470578n), java.lang.Integer.valueOf(wb6Var.f470578n)) && n51.f.a(java.lang.Integer.valueOf(this.f470579o), java.lang.Integer.valueOf(wb6Var.f470579o));
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
            java.lang.String str = this.f470571d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f470572e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f470573f);
            fVar.e(5, this.f470574g);
            fVar.h(6, this.f470575h);
            fVar.e(7, this.f470576i);
            fVar.e(8, this.f470577m);
            fVar.e(9, this.f470578n);
            fVar.e(10, this.f470579o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f470571d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f470572e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.h(4, this.f470573f) + b36.f.e(5, this.f470574g) + b36.f.h(6, this.f470575h) + b36.f.e(7, this.f470576i) + b36.f.e(8, this.f470577m) + b36.f.e(9, this.f470578n) + b36.f.e(10, this.f470579o);
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
        r45.wb6 wb6Var = (r45.wb6) objArr[1];
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
                    wb6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                wb6Var.f470571d = aVar2.k(intValue);
                return 0;
            case 3:
                wb6Var.f470572e = aVar2.k(intValue);
                return 0;
            case 4:
                wb6Var.f470573f = aVar2.i(intValue);
                return 0;
            case 5:
                wb6Var.f470574g = aVar2.g(intValue);
                return 0;
            case 6:
                wb6Var.f470575h = aVar2.i(intValue);
                return 0;
            case 7:
                wb6Var.f470576i = aVar2.g(intValue);
                return 0;
            case 8:
                wb6Var.f470577m = aVar2.g(intValue);
                return 0;
            case 9:
                wb6Var.f470578n = aVar2.g(intValue);
                return 0;
            case 10:
                wb6Var.f470579o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
