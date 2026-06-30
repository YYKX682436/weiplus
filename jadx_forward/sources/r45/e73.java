package r45;

/* loaded from: classes4.dex */
public class e73 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454598d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454599e;

    /* renamed from: f, reason: collision with root package name */
    public int f454600f;

    /* renamed from: g, reason: collision with root package name */
    public int f454601g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454602h;

    /* renamed from: i, reason: collision with root package name */
    public int f454603i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454604m;

    /* renamed from: n, reason: collision with root package name */
    public int f454605n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e73)) {
            return false;
        }
        r45.e73 e73Var = (r45.e73) fVar;
        return n51.f.a(this.f454598d, e73Var.f454598d) && n51.f.a(this.f454599e, e73Var.f454599e) && n51.f.a(java.lang.Integer.valueOf(this.f454600f), java.lang.Integer.valueOf(e73Var.f454600f)) && n51.f.a(java.lang.Integer.valueOf(this.f454601g), java.lang.Integer.valueOf(e73Var.f454601g)) && n51.f.a(this.f454602h, e73Var.f454602h) && n51.f.a(java.lang.Integer.valueOf(this.f454603i), java.lang.Integer.valueOf(e73Var.f454603i)) && n51.f.a(this.f454604m, e73Var.f454604m) && n51.f.a(java.lang.Integer.valueOf(this.f454605n), java.lang.Integer.valueOf(e73Var.f454605n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454598d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454599e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f454600f);
            fVar.e(4, this.f454601g);
            java.lang.String str3 = this.f454602h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f454603i);
            java.lang.String str4 = this.f454604m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f454605n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f454598d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f454599e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f454600f) + b36.f.e(4, this.f454601g);
            java.lang.String str7 = this.f454602h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int e18 = e17 + b36.f.e(6, this.f454603i);
            java.lang.String str8 = this.f454604m;
            if (str8 != null) {
                e18 += b36.f.j(7, str8);
            }
            return e18 + b36.f.e(8, this.f454605n);
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
        r45.e73 e73Var = (r45.e73) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e73Var.f454598d = aVar2.k(intValue);
                return 0;
            case 2:
                e73Var.f454599e = aVar2.k(intValue);
                return 0;
            case 3:
                e73Var.f454600f = aVar2.g(intValue);
                return 0;
            case 4:
                e73Var.f454601g = aVar2.g(intValue);
                return 0;
            case 5:
                e73Var.f454602h = aVar2.k(intValue);
                return 0;
            case 6:
                e73Var.f454603i = aVar2.g(intValue);
                return 0;
            case 7:
                e73Var.f454604m = aVar2.k(intValue);
                return 0;
            case 8:
                e73Var.f454605n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
