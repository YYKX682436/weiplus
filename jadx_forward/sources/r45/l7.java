package r45;

/* loaded from: classes9.dex */
public class l7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460721d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460722e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460723f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l7)) {
            return false;
        }
        r45.l7 l7Var = (r45.l7) fVar;
        return n51.f.a(this.f460721d, l7Var.f460721d) && n51.f.a(this.f460722e, l7Var.f460722e) && n51.f.a(this.f460723f, l7Var.f460723f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460721d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460722e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460723f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f460721d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f460722e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f460723f;
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
        r45.l7 l7Var = (r45.l7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l7Var.f460721d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            l7Var.f460722e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        l7Var.f460723f = aVar2.k(intValue);
        return 0;
    }
}
