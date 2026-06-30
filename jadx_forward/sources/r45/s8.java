package r45;

/* loaded from: classes4.dex */
public class s8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467073d;

    /* renamed from: e, reason: collision with root package name */
    public int f467074e;

    /* renamed from: f, reason: collision with root package name */
    public int f467075f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467076g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s8)) {
            return false;
        }
        r45.s8 s8Var = (r45.s8) fVar;
        return n51.f.a(this.f467073d, s8Var.f467073d) && n51.f.a(java.lang.Integer.valueOf(this.f467074e), java.lang.Integer.valueOf(s8Var.f467074e)) && n51.f.a(java.lang.Integer.valueOf(this.f467075f), java.lang.Integer.valueOf(s8Var.f467075f)) && n51.f.a(this.f467076g, s8Var.f467076g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467073d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f467074e);
            fVar.e(3, this.f467075f);
            java.lang.String str2 = this.f467076g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f467073d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f467074e) + b36.f.e(3, this.f467075f);
            java.lang.String str4 = this.f467076g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        r45.s8 s8Var = (r45.s8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s8Var.f467073d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            s8Var.f467074e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            s8Var.f467075f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        s8Var.f467076g = aVar2.k(intValue);
        return 0;
    }
}
