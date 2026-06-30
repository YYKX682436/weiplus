package r45;

/* loaded from: classes9.dex */
public class n43 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f462601d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462602e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462603f;

    /* renamed from: g, reason: collision with root package name */
    public int f462604g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462605h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462606i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462607m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n43)) {
            return false;
        }
        r45.n43 n43Var = (r45.n43) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f462601d), java.lang.Long.valueOf(n43Var.f462601d)) && n51.f.a(this.f462602e, n43Var.f462602e) && n51.f.a(this.f462603f, n43Var.f462603f) && n51.f.a(java.lang.Integer.valueOf(this.f462604g), java.lang.Integer.valueOf(n43Var.f462604g)) && n51.f.a(this.f462605h, n43Var.f462605h) && n51.f.a(this.f462606i, n43Var.f462606i) && n51.f.a(this.f462607m, n43Var.f462607m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f462601d);
            java.lang.String str = this.f462602e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f462603f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f462604g);
            java.lang.String str3 = this.f462605h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f462606i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f462607m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f462601d) + 0;
            java.lang.String str6 = this.f462602e;
            if (str6 != null) {
                h17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f462603f;
            if (str7 != null) {
                h17 += b36.f.j(3, str7);
            }
            int e17 = h17 + b36.f.e(4, this.f462604g);
            java.lang.String str8 = this.f462605h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f462606i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f462607m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.n43 n43Var = (r45.n43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n43Var.f462601d = aVar2.i(intValue);
                return 0;
            case 2:
                n43Var.f462602e = aVar2.k(intValue);
                return 0;
            case 3:
                n43Var.f462603f = aVar2.k(intValue);
                return 0;
            case 4:
                n43Var.f462604g = aVar2.g(intValue);
                return 0;
            case 5:
                n43Var.f462605h = aVar2.k(intValue);
                return 0;
            case 6:
                n43Var.f462606i = aVar2.k(intValue);
                return 0;
            case 7:
                n43Var.f462607m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
