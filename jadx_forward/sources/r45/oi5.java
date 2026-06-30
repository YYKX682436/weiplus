package r45;

/* loaded from: classes8.dex */
public class oi5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463816d;

    /* renamed from: e, reason: collision with root package name */
    public int f463817e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463818f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463819g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463820h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463821i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oi5)) {
            return false;
        }
        r45.oi5 oi5Var = (r45.oi5) fVar;
        return n51.f.a(this.f463816d, oi5Var.f463816d) && n51.f.a(java.lang.Integer.valueOf(this.f463817e), java.lang.Integer.valueOf(oi5Var.f463817e)) && n51.f.a(this.f463818f, oi5Var.f463818f) && n51.f.a(this.f463819g, oi5Var.f463819g) && n51.f.a(this.f463820h, oi5Var.f463820h) && n51.f.a(this.f463821i, oi5Var.f463821i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463816d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f463817e);
            java.lang.String str2 = this.f463818f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f463819g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f463820h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f463821i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f463816d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f463817e);
            java.lang.String str7 = this.f463818f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f463819g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f463820h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f463821i;
            return str10 != null ? j17 + b36.f.j(6, str10) : j17;
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
        r45.oi5 oi5Var = (r45.oi5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oi5Var.f463816d = aVar2.k(intValue);
                return 0;
            case 2:
                oi5Var.f463817e = aVar2.g(intValue);
                return 0;
            case 3:
                oi5Var.f463818f = aVar2.k(intValue);
                return 0;
            case 4:
                oi5Var.f463819g = aVar2.k(intValue);
                return 0;
            case 5:
                oi5Var.f463820h = aVar2.k(intValue);
                return 0;
            case 6:
                oi5Var.f463821i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
