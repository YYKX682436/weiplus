package r45;

/* loaded from: classes8.dex */
public class qx5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465872e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465873f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465874g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465875h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465876i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465877m;

    /* renamed from: n, reason: collision with root package name */
    public int f465878n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qx5)) {
            return false;
        }
        r45.qx5 qx5Var = (r45.qx5) fVar;
        return n51.f.a(this.f465871d, qx5Var.f465871d) && n51.f.a(this.f465872e, qx5Var.f465872e) && n51.f.a(this.f465873f, qx5Var.f465873f) && n51.f.a(this.f465874g, qx5Var.f465874g) && n51.f.a(this.f465875h, qx5Var.f465875h) && n51.f.a(this.f465876i, qx5Var.f465876i) && n51.f.a(this.f465877m, qx5Var.f465877m) && n51.f.a(java.lang.Integer.valueOf(this.f465878n), java.lang.Integer.valueOf(qx5Var.f465878n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465871d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465872e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f465873f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f465874g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f465875h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f465876i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f465877m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.e(8, this.f465878n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f465871d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f465872e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f465873f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f465874g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f465875h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f465876i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f465877m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            return j17 + b36.f.e(8, this.f465878n);
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
        r45.qx5 qx5Var = (r45.qx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qx5Var.f465871d = aVar2.k(intValue);
                return 0;
            case 2:
                qx5Var.f465872e = aVar2.k(intValue);
                return 0;
            case 3:
                qx5Var.f465873f = aVar2.k(intValue);
                return 0;
            case 4:
                qx5Var.f465874g = aVar2.k(intValue);
                return 0;
            case 5:
                qx5Var.f465875h = aVar2.k(intValue);
                return 0;
            case 6:
                qx5Var.f465876i = aVar2.k(intValue);
                return 0;
            case 7:
                qx5Var.f465877m = aVar2.k(intValue);
                return 0;
            case 8:
                qx5Var.f465878n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f465871d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "Desc", this.f465872e, false);
            eVar.d(jSONObject, "ThumbUrl", this.f465873f, false);
            eVar.d(jSONObject, "AppID", this.f465874g, false);
            eVar.d(jSONObject, "UserName", this.f465875h, false);
            eVar.d(jSONObject, "Path", this.f465876i, false);
            eVar.d(jSONObject, "WeappIconUrl", this.f465877m, false);
            eVar.d(jSONObject, "Version", java.lang.Integer.valueOf(this.f465878n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
