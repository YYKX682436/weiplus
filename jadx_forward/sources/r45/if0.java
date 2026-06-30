package r45;

/* loaded from: classes9.dex */
public class if0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458514d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458515e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458516f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.if0)) {
            return false;
        }
        r45.if0 if0Var = (r45.if0) fVar;
        return n51.f.a(this.f458514d, if0Var.f458514d) && n51.f.a(this.f458515e, if0Var.f458515e) && n51.f.a(this.f458516f, if0Var.f458516f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458514d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458515e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f458516f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f458514d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f458515e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f458516f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        r45.if0 if0Var = (r45.if0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            if0Var.f458514d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            if0Var.f458515e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        if0Var.f458516f = aVar2.k(intValue);
        return 0;
    }
}
