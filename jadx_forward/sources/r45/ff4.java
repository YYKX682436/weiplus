package r45;

/* loaded from: classes7.dex */
public class ff4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455805e;

    /* renamed from: f, reason: collision with root package name */
    public int f455806f;

    /* renamed from: g, reason: collision with root package name */
    public int f455807g;

    /* renamed from: h, reason: collision with root package name */
    public int f455808h;

    /* renamed from: i, reason: collision with root package name */
    public int f455809i;

    /* renamed from: m, reason: collision with root package name */
    public int f455810m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455811n;

    /* renamed from: o, reason: collision with root package name */
    public int f455812o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ff4)) {
            return false;
        }
        r45.ff4 ff4Var = (r45.ff4) fVar;
        return n51.f.a(this.f455804d, ff4Var.f455804d) && n51.f.a(this.f455805e, ff4Var.f455805e) && n51.f.a(java.lang.Integer.valueOf(this.f455806f), java.lang.Integer.valueOf(ff4Var.f455806f)) && n51.f.a(java.lang.Integer.valueOf(this.f455807g), java.lang.Integer.valueOf(ff4Var.f455807g)) && n51.f.a(java.lang.Integer.valueOf(this.f455808h), java.lang.Integer.valueOf(ff4Var.f455808h)) && n51.f.a(java.lang.Integer.valueOf(this.f455809i), java.lang.Integer.valueOf(ff4Var.f455809i)) && n51.f.a(java.lang.Integer.valueOf(this.f455810m), java.lang.Integer.valueOf(ff4Var.f455810m)) && n51.f.a(this.f455811n, ff4Var.f455811n) && n51.f.a(java.lang.Integer.valueOf(this.f455812o), java.lang.Integer.valueOf(ff4Var.f455812o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455804d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f455805e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f455806f);
            fVar.e(4, this.f455807g);
            fVar.e(5, this.f455808h);
            fVar.e(6, this.f455809i);
            fVar.e(7, this.f455810m);
            java.lang.String str3 = this.f455811n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f455812o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f455804d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f455805e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f455806f) + b36.f.e(4, this.f455807g) + b36.f.e(5, this.f455808h) + b36.f.e(6, this.f455809i) + b36.f.e(7, this.f455810m);
            java.lang.String str6 = this.f455811n;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            return e17 + b36.f.e(9, this.f455812o);
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
        r45.ff4 ff4Var = (r45.ff4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ff4Var.f455804d = aVar2.k(intValue);
                return 0;
            case 2:
                ff4Var.f455805e = aVar2.k(intValue);
                return 0;
            case 3:
                ff4Var.f455806f = aVar2.g(intValue);
                return 0;
            case 4:
                ff4Var.f455807g = aVar2.g(intValue);
                return 0;
            case 5:
                ff4Var.f455808h = aVar2.g(intValue);
                return 0;
            case 6:
                ff4Var.f455809i = aVar2.g(intValue);
                return 0;
            case 7:
                ff4Var.f455810m = aVar2.g(intValue);
                return 0;
            case 8:
                ff4Var.f455811n = aVar2.k(intValue);
                return 0;
            case 9:
                ff4Var.f455812o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
