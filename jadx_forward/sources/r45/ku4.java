package r45;

/* loaded from: classes8.dex */
public class ku4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460491d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460492e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460493f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460494g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460495h;

    /* renamed from: i, reason: collision with root package name */
    public int f460496i;

    /* renamed from: m, reason: collision with root package name */
    public int f460497m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460498n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ku4)) {
            return false;
        }
        r45.ku4 ku4Var = (r45.ku4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460491d), java.lang.Integer.valueOf(ku4Var.f460491d)) && n51.f.a(this.f460492e, ku4Var.f460492e) && n51.f.a(this.f460493f, ku4Var.f460493f) && n51.f.a(this.f460494g, ku4Var.f460494g) && n51.f.a(this.f460495h, ku4Var.f460495h) && n51.f.a(java.lang.Integer.valueOf(this.f460496i), java.lang.Integer.valueOf(ku4Var.f460496i)) && n51.f.a(java.lang.Integer.valueOf(this.f460497m), java.lang.Integer.valueOf(ku4Var.f460497m)) && n51.f.a(this.f460498n, ku4Var.f460498n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460491d);
            java.lang.String str = this.f460492e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460493f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f460494g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f460495h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f460496i);
            fVar.e(7, this.f460497m);
            java.lang.String str5 = this.f460498n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460491d) + 0;
            java.lang.String str6 = this.f460492e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f460493f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f460494g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f460495h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            int e18 = e17 + b36.f.e(6, this.f460496i) + b36.f.e(7, this.f460497m);
            java.lang.String str10 = this.f460498n;
            return str10 != null ? e18 + b36.f.j(8, str10) : e18;
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
        r45.ku4 ku4Var = (r45.ku4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ku4Var.f460491d = aVar2.g(intValue);
                return 0;
            case 2:
                ku4Var.f460492e = aVar2.k(intValue);
                return 0;
            case 3:
                ku4Var.f460493f = aVar2.k(intValue);
                return 0;
            case 4:
                ku4Var.f460494g = aVar2.k(intValue);
                return 0;
            case 5:
                ku4Var.f460495h = aVar2.k(intValue);
                return 0;
            case 6:
                ku4Var.f460496i = aVar2.g(intValue);
                return 0;
            case 7:
                ku4Var.f460497m = aVar2.g(intValue);
                return 0;
            case 8:
                ku4Var.f460498n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
