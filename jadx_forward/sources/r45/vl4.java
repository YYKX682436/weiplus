package r45;

/* loaded from: classes10.dex */
public class vl4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469878d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469879e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469880f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469881g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469882h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vl4)) {
            return false;
        }
        r45.vl4 vl4Var = (r45.vl4) fVar;
        return n51.f.a(this.f469878d, vl4Var.f469878d) && n51.f.a(this.f469879e, vl4Var.f469879e) && n51.f.a(this.f469880f, vl4Var.f469880f) && n51.f.a(this.f469881g, vl4Var.f469881g) && n51.f.a(this.f469882h, vl4Var.f469882h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469878d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469879e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469880f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f469881g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469882h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f469878d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f469879e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f469880f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f469881g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469882h;
            return gVar2 != null ? j17 + b36.f.b(5, gVar2) : j17;
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
        r45.vl4 vl4Var = (r45.vl4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vl4Var.f469878d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            vl4Var.f469879e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            vl4Var.f469880f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            vl4Var.f469881g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        vl4Var.f469882h = aVar2.d(intValue);
        return 0;
    }
}
