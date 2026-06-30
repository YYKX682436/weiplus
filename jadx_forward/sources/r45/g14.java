package r45;

/* loaded from: classes8.dex */
public class g14 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456333d;

    /* renamed from: e, reason: collision with root package name */
    public int f456334e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456335f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456336g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g14)) {
            return false;
        }
        r45.g14 g14Var = (r45.g14) fVar;
        return n51.f.a(this.f456333d, g14Var.f456333d) && n51.f.a(java.lang.Integer.valueOf(this.f456334e), java.lang.Integer.valueOf(g14Var.f456334e)) && n51.f.a(this.f456335f, g14Var.f456335f) && n51.f.a(this.f456336g, g14Var.f456336g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456333d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f456334e);
            java.lang.String str2 = this.f456335f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f456336g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f456333d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f456334e);
            java.lang.String str5 = this.f456335f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f456336g;
            return str6 != null ? j17 + b36.f.j(4, str6) : j17;
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
        r45.g14 g14Var = (r45.g14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g14Var.f456333d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            g14Var.f456334e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            g14Var.f456335f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        g14Var.f456336g = aVar2.k(intValue);
        return 0;
    }
}
