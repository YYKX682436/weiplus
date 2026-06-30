package vr4;

/* loaded from: classes9.dex */
public class a1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f521208d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f521209e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f521210f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f521211g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f521212h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.a1)) {
            return false;
        }
        vr4.a1 a1Var = (vr4.a1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f521208d), java.lang.Integer.valueOf(a1Var.f521208d)) && n51.f.a(this.f521209e, a1Var.f521209e) && n51.f.a(this.f521210f, a1Var.f521210f) && n51.f.a(this.f521211g, a1Var.f521211g) && n51.f.a(this.f521212h, a1Var.f521212h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f521208d);
            java.lang.String str = this.f521209e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f521210f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f521211g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f521212h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f521208d) + 0;
            java.lang.String str5 = this.f521209e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f521210f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f521211g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f521212h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        vr4.a1 a1Var = (vr4.a1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a1Var.f521208d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            a1Var.f521209e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            a1Var.f521210f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            a1Var.f521211g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        a1Var.f521212h = aVar2.k(intValue);
        return 0;
    }
}
