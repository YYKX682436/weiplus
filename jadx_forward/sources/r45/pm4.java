package r45;

/* loaded from: classes9.dex */
public class pm4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464712d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464713e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464714f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464715g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464716h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pm4)) {
            return false;
        }
        r45.pm4 pm4Var = (r45.pm4) fVar;
        return n51.f.a(this.f464712d, pm4Var.f464712d) && n51.f.a(this.f464713e, pm4Var.f464713e) && n51.f.a(this.f464714f, pm4Var.f464714f) && n51.f.a(this.f464715g, pm4Var.f464715g) && n51.f.a(this.f464716h, pm4Var.f464716h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464712d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464713e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f464714f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f464715g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f464716h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f464712d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f464713e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f464714f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f464715g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f464716h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        r45.pm4 pm4Var = (r45.pm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pm4Var.f464712d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            pm4Var.f464713e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            pm4Var.f464714f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            pm4Var.f464715g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        pm4Var.f464716h = aVar2.k(intValue);
        return 0;
    }
}
