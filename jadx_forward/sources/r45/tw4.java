package r45;

/* loaded from: classes8.dex */
public class tw4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468365e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468366f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468367g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468368h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tw4)) {
            return false;
        }
        r45.tw4 tw4Var = (r45.tw4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468364d), java.lang.Integer.valueOf(tw4Var.f468364d)) && n51.f.a(this.f468365e, tw4Var.f468365e) && n51.f.a(this.f468366f, tw4Var.f468366f) && n51.f.a(this.f468367g, tw4Var.f468367g) && n51.f.a(this.f468368h, tw4Var.f468368h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468364d);
            java.lang.String str = this.f468365e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f468366f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f468367g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f468368h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468364d) + 0;
            java.lang.String str5 = this.f468365e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f468366f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f468367g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f468368h;
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
        r45.tw4 tw4Var = (r45.tw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tw4Var.f468364d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            tw4Var.f468365e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            tw4Var.f468366f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            tw4Var.f468367g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        tw4Var.f468368h = aVar2.k(intValue);
        return 0;
    }
}
