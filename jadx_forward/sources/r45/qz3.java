package r45;

/* loaded from: classes4.dex */
public class qz3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465894d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465895e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465896f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465897g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465898h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qz3)) {
            return false;
        }
        r45.qz3 qz3Var = (r45.qz3) fVar;
        return n51.f.a(this.f465894d, qz3Var.f465894d) && n51.f.a(this.f465895e, qz3Var.f465895e) && n51.f.a(this.f465896f, qz3Var.f465896f) && n51.f.a(this.f465897g, qz3Var.f465897g) && n51.f.a(this.f465898h, qz3Var.f465898h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465894d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465895e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f465896f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f465897g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f465898h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f465894d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f465895e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f465896f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f465897g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f465898h;
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
        r45.qz3 qz3Var = (r45.qz3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qz3Var.f465894d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qz3Var.f465895e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            qz3Var.f465896f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            qz3Var.f465897g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        qz3Var.f465898h = aVar2.k(intValue);
        return 0;
    }
}
