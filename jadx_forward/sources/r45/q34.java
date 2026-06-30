package r45;

/* loaded from: classes9.dex */
public class q34 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465157d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f465158e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465159f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465160g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465161h;

    /* renamed from: i, reason: collision with root package name */
    public r45.dn5 f465162i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465163m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q34)) {
            return false;
        }
        r45.q34 q34Var = (r45.q34) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465157d), java.lang.Integer.valueOf(q34Var.f465157d)) && n51.f.a(java.lang.Boolean.valueOf(this.f465158e), java.lang.Boolean.valueOf(q34Var.f465158e)) && n51.f.a(this.f465159f, q34Var.f465159f) && n51.f.a(this.f465160g, q34Var.f465160g) && n51.f.a(this.f465161h, q34Var.f465161h) && n51.f.a(this.f465162i, q34Var.f465162i) && n51.f.a(this.f465163m, q34Var.f465163m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465157d);
            fVar.a(2, this.f465158e);
            java.lang.String str = this.f465159f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f465160g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f465161h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.dn5 dn5Var = this.f465162i;
            if (dn5Var != null) {
                fVar.i(6, dn5Var.mo75928xcd1e8d8());
                this.f465162i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f465163m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465157d) + 0 + b36.f.a(2, this.f465158e);
            java.lang.String str5 = this.f465159f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f465160g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f465161h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            r45.dn5 dn5Var2 = this.f465162i;
            if (dn5Var2 != null) {
                e17 += b36.f.i(6, dn5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f465163m;
            return str8 != null ? e17 + b36.f.j(7, str8) : e17;
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
        r45.q34 q34Var = (r45.q34) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q34Var.f465157d = aVar2.g(intValue);
                return 0;
            case 2:
                q34Var.f465158e = aVar2.c(intValue);
                return 0;
            case 3:
                q34Var.f465159f = aVar2.k(intValue);
                return 0;
            case 4:
                q34Var.f465160g = aVar2.k(intValue);
                return 0;
            case 5:
                q34Var.f465161h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.dn5 dn5Var3 = new r45.dn5();
                    if (bArr != null && bArr.length > 0) {
                        dn5Var3.mo11468x92b714fd(bArr);
                    }
                    q34Var.f465162i = dn5Var3;
                }
                return 0;
            case 7:
                q34Var.f465163m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
