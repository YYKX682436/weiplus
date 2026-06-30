package r45;

/* loaded from: classes9.dex */
public class p35 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464232d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464233e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464234f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464235g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464236h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p35)) {
            return false;
        }
        r45.p35 p35Var = (r45.p35) fVar;
        return n51.f.a(this.f464232d, p35Var.f464232d) && n51.f.a(this.f464233e, p35Var.f464233e) && n51.f.a(this.f464234f, p35Var.f464234f) && n51.f.a(this.f464235g, p35Var.f464235g) && n51.f.a(this.f464236h, p35Var.f464236h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464232d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464233e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f464234f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f464235g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f464236h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f464232d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f464233e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f464234f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f464235g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f464236h;
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
        r45.p35 p35Var = (r45.p35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p35Var.f464232d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            p35Var.f464233e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            p35Var.f464234f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            p35Var.f464235g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        p35Var.f464236h = aVar2.k(intValue);
        return 0;
    }
}
