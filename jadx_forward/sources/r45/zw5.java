package r45;

/* loaded from: classes8.dex */
public class zw5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473968d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473969e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473970f;

    /* renamed from: g, reason: collision with root package name */
    public int f473971g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473972h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473973i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473974m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f473975n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f473976o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f473977p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zw5)) {
            return false;
        }
        r45.zw5 zw5Var = (r45.zw5) fVar;
        return n51.f.a(this.f473968d, zw5Var.f473968d) && n51.f.a(this.f473969e, zw5Var.f473969e) && n51.f.a(this.f473970f, zw5Var.f473970f) && n51.f.a(java.lang.Integer.valueOf(this.f473971g), java.lang.Integer.valueOf(zw5Var.f473971g)) && n51.f.a(this.f473972h, zw5Var.f473972h) && n51.f.a(this.f473973i, zw5Var.f473973i) && n51.f.a(this.f473974m, zw5Var.f473974m) && n51.f.a(this.f473975n, zw5Var.f473975n) && n51.f.a(this.f473976o, zw5Var.f473976o) && n51.f.a(this.f473977p, zw5Var.f473977p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473968d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473969e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f473970f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f473971g);
            java.lang.String str4 = this.f473972h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f473973i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f473974m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f473975n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f473976o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f473977p;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f473968d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f473969e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f473970f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            int e17 = j17 + b36.f.e(4, this.f473971g);
            java.lang.String str13 = this.f473972h;
            if (str13 != null) {
                e17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f473973i;
            if (str14 != null) {
                e17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f473974m;
            if (str15 != null) {
                e17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f473975n;
            if (str16 != null) {
                e17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f473976o;
            if (str17 != null) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f473977p;
            return str18 != null ? e17 + b36.f.j(10, str18) : e17;
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
        r45.zw5 zw5Var = (r45.zw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zw5Var.f473968d = aVar2.k(intValue);
                return 0;
            case 2:
                zw5Var.f473969e = aVar2.k(intValue);
                return 0;
            case 3:
                zw5Var.f473970f = aVar2.k(intValue);
                return 0;
            case 4:
                zw5Var.f473971g = aVar2.g(intValue);
                return 0;
            case 5:
                zw5Var.f473972h = aVar2.k(intValue);
                return 0;
            case 6:
                zw5Var.f473973i = aVar2.k(intValue);
                return 0;
            case 7:
                zw5Var.f473974m = aVar2.k(intValue);
                return 0;
            case 8:
                zw5Var.f473975n = aVar2.k(intValue);
                return 0;
            case 9:
                zw5Var.f473976o = aVar2.k(intValue);
                return 0;
            case 10:
                zw5Var.f473977p = aVar2.k(intValue);
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
            java.lang.String str = this.f473968d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "AppId", str, false);
            eVar.d(jSONObject, "Page", this.f473969e, false);
            eVar.d(jSONObject, "Query", this.f473970f, false);
            eVar.d(jSONObject, "SourceType", java.lang.Integer.valueOf(this.f473971g), false);
            eVar.d(jSONObject, "MinVersion", this.f473972h, false);
            eVar.d(jSONObject, "Title", this.f473973i, false);
            eVar.d(jSONObject, "Desc", this.f473974m, false);
            eVar.d(jSONObject, "ThumbUrl", this.f473975n, false);
            eVar.d(jSONObject, "SrcId", this.f473976o, false);
            eVar.d(jSONObject, "NsLink", this.f473977p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
