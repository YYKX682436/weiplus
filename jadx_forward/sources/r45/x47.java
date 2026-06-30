package r45;

/* loaded from: classes2.dex */
public class x47 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f471309d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471310e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471311f;

    /* renamed from: g, reason: collision with root package name */
    public int f471312g;

    /* renamed from: h, reason: collision with root package name */
    public int f471313h;

    /* renamed from: i, reason: collision with root package name */
    public int f471314i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x47)) {
            return false;
        }
        r45.x47 x47Var = (r45.x47) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f471309d), java.lang.Boolean.valueOf(x47Var.f471309d)) && n51.f.a(this.f471310e, x47Var.f471310e) && n51.f.a(this.f471311f, x47Var.f471311f) && n51.f.a(java.lang.Integer.valueOf(this.f471312g), java.lang.Integer.valueOf(x47Var.f471312g)) && n51.f.a(java.lang.Integer.valueOf(this.f471313h), java.lang.Integer.valueOf(x47Var.f471313h)) && n51.f.a(java.lang.Integer.valueOf(this.f471314i), java.lang.Integer.valueOf(x47Var.f471314i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f471309d);
            java.lang.String str = this.f471310e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f471311f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f471312g);
            fVar.e(5, this.f471313h);
            fVar.e(6, this.f471314i);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f471309d) + 0;
            java.lang.String str3 = this.f471310e;
            if (str3 != null) {
                a17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f471311f;
            if (str4 != null) {
                a17 += b36.f.j(3, str4);
            }
            return a17 + b36.f.e(4, this.f471312g) + b36.f.e(5, this.f471313h) + b36.f.e(6, this.f471314i);
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
        r45.x47 x47Var = (r45.x47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x47Var.f471309d = aVar2.c(intValue);
                return 0;
            case 2:
                x47Var.f471310e = aVar2.k(intValue);
                return 0;
            case 3:
                x47Var.f471311f = aVar2.k(intValue);
                return 0;
            case 4:
                x47Var.f471312g = aVar2.g(intValue);
                return 0;
            case 5:
                x47Var.f471313h = aVar2.g(intValue);
                return 0;
            case 6:
                x47Var.f471314i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
