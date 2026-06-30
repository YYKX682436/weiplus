package r45;

/* loaded from: classes7.dex */
public class jr5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459604e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459605f;

    /* renamed from: g, reason: collision with root package name */
    public int f459606g;

    /* renamed from: h, reason: collision with root package name */
    public int f459607h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jr5)) {
            return false;
        }
        r45.jr5 jr5Var = (r45.jr5) fVar;
        return n51.f.a(this.f459603d, jr5Var.f459603d) && n51.f.a(this.f459604e, jr5Var.f459604e) && n51.f.a(this.f459605f, jr5Var.f459605f) && n51.f.a(java.lang.Integer.valueOf(this.f459606g), java.lang.Integer.valueOf(jr5Var.f459606g)) && n51.f.a(java.lang.Integer.valueOf(this.f459607h), java.lang.Integer.valueOf(jr5Var.f459607h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459603d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459604e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f459605f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f459606g);
            fVar.e(5, this.f459607h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f459603d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f459604e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f459605f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f459606g) + b36.f.e(5, this.f459607h);
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
        r45.jr5 jr5Var = (r45.jr5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jr5Var.f459603d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jr5Var.f459604e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            jr5Var.f459605f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            jr5Var.f459606g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        jr5Var.f459607h = aVar2.g(intValue);
        return 0;
    }
}
