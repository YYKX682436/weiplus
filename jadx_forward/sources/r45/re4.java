package r45;

/* loaded from: classes8.dex */
public class re4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466296d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466297e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466298f;

    /* renamed from: g, reason: collision with root package name */
    public int f466299g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466300h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.re4)) {
            return false;
        }
        r45.re4 re4Var = (r45.re4) fVar;
        return n51.f.a(this.f466296d, re4Var.f466296d) && n51.f.a(this.f466297e, re4Var.f466297e) && n51.f.a(this.f466298f, re4Var.f466298f) && n51.f.a(java.lang.Integer.valueOf(this.f466299g), java.lang.Integer.valueOf(re4Var.f466299g)) && n51.f.a(this.f466300h, re4Var.f466300h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466296d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466297e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466298f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f466299g);
            java.lang.String str4 = this.f466300h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f466296d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f466297e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f466298f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f466299g);
            java.lang.String str8 = this.f466300h;
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
        r45.re4 re4Var = (r45.re4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            re4Var.f466296d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            re4Var.f466297e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            re4Var.f466298f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            re4Var.f466299g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        re4Var.f466300h = aVar2.k(intValue);
        return 0;
    }
}
