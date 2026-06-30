package r45;

/* loaded from: classes15.dex */
public class qf4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465468d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465469e;

    /* renamed from: f, reason: collision with root package name */
    public int f465470f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465471g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465472h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465473i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465474m;

    /* renamed from: n, reason: collision with root package name */
    public int f465475n;

    /* renamed from: o, reason: collision with root package name */
    public int f465476o;

    /* renamed from: p, reason: collision with root package name */
    public r45.sx3 f465477p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qf4)) {
            return false;
        }
        r45.qf4 qf4Var = (r45.qf4) fVar;
        return n51.f.a(this.f465468d, qf4Var.f465468d) && n51.f.a(this.f465469e, qf4Var.f465469e) && n51.f.a(java.lang.Integer.valueOf(this.f465470f), java.lang.Integer.valueOf(qf4Var.f465470f)) && n51.f.a(this.f465471g, qf4Var.f465471g) && n51.f.a(this.f465472h, qf4Var.f465472h) && n51.f.a(this.f465473i, qf4Var.f465473i) && n51.f.a(this.f465474m, qf4Var.f465474m) && n51.f.a(java.lang.Integer.valueOf(this.f465475n), java.lang.Integer.valueOf(qf4Var.f465475n)) && n51.f.a(java.lang.Integer.valueOf(this.f465476o), java.lang.Integer.valueOf(qf4Var.f465476o)) && n51.f.a(this.f465477p, qf4Var.f465477p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465468d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465469e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f465470f);
            java.lang.String str3 = this.f465471g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f465472h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f465473i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f465474m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f465475n);
            fVar.e(9, this.f465476o);
            r45.sx3 sx3Var = this.f465477p;
            if (sx3Var != null) {
                fVar.i(10, sx3Var.mo75928xcd1e8d8());
                this.f465477p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f465468d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f465469e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f465470f);
            java.lang.String str9 = this.f465471g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f465472h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f465473i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f465474m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            int e18 = e17 + b36.f.e(8, this.f465475n) + b36.f.e(9, this.f465476o);
            r45.sx3 sx3Var2 = this.f465477p;
            return sx3Var2 != null ? e18 + b36.f.i(10, sx3Var2.mo75928xcd1e8d8()) : e18;
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
        r45.qf4 qf4Var = (r45.qf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qf4Var.f465468d = aVar2.k(intValue);
                return 0;
            case 2:
                qf4Var.f465469e = aVar2.k(intValue);
                return 0;
            case 3:
                qf4Var.f465470f = aVar2.g(intValue);
                return 0;
            case 4:
                qf4Var.f465471g = aVar2.k(intValue);
                return 0;
            case 5:
                qf4Var.f465472h = aVar2.k(intValue);
                return 0;
            case 6:
                qf4Var.f465473i = aVar2.k(intValue);
                return 0;
            case 7:
                qf4Var.f465474m = aVar2.k(intValue);
                return 0;
            case 8:
                qf4Var.f465475n = aVar2.g(intValue);
                return 0;
            case 9:
                qf4Var.f465476o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.sx3 sx3Var3 = new r45.sx3();
                    if (bArr != null && bArr.length > 0) {
                        sx3Var3.mo11468x92b714fd(bArr);
                    }
                    qf4Var.f465477p = sx3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
