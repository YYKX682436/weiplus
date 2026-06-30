package r45;

/* loaded from: classes15.dex */
public class s1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466907d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466908e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466909f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466910g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s1)) {
            return false;
        }
        r45.s1 s1Var = (r45.s1) fVar;
        return n51.f.a(this.f466907d, s1Var.f466907d) && n51.f.a(this.f466908e, s1Var.f466908e) && n51.f.a(this.f466909f, s1Var.f466909f) && n51.f.a(this.f466910g, s1Var.f466910g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466907d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466908e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466909f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f466910g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f466907d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f466908e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f466909f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f466910g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        r45.s1 s1Var = (r45.s1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s1Var.f466907d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            s1Var.f466908e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s1Var.f466909f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        s1Var.f466910g = aVar2.k(intValue);
        return 0;
    }
}
