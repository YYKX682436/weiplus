package r45;

/* loaded from: classes8.dex */
public class bw5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452632d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452633e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452634f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452635g;

    /* renamed from: h, reason: collision with root package name */
    public int f452636h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452637i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f452638m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f452639n;

    /* renamed from: o, reason: collision with root package name */
    public int f452640o;

    /* renamed from: p, reason: collision with root package name */
    public int f452641p;

    /* renamed from: q, reason: collision with root package name */
    public int f452642q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bw5)) {
            return false;
        }
        r45.bw5 bw5Var = (r45.bw5) fVar;
        return n51.f.a(this.f452632d, bw5Var.f452632d) && n51.f.a(this.f452633e, bw5Var.f452633e) && n51.f.a(this.f452634f, bw5Var.f452634f) && n51.f.a(this.f452635g, bw5Var.f452635g) && n51.f.a(java.lang.Integer.valueOf(this.f452636h), java.lang.Integer.valueOf(bw5Var.f452636h)) && n51.f.a(this.f452637i, bw5Var.f452637i) && n51.f.a(this.f452638m, bw5Var.f452638m) && n51.f.a(this.f452639n, bw5Var.f452639n) && n51.f.a(java.lang.Integer.valueOf(this.f452640o), java.lang.Integer.valueOf(bw5Var.f452640o)) && n51.f.a(java.lang.Integer.valueOf(this.f452641p), java.lang.Integer.valueOf(bw5Var.f452641p)) && n51.f.a(java.lang.Integer.valueOf(this.f452642q), java.lang.Integer.valueOf(bw5Var.f452642q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452632d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452633e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452634f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f452635g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f452636h);
            java.lang.String str5 = this.f452637i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f452638m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f452639n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f452640o);
            fVar.e(10, this.f452641p);
            fVar.e(11, this.f452642q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f452632d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f452633e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f452634f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f452635g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            int e17 = j17 + b36.f.e(5, this.f452636h);
            java.lang.String str12 = this.f452637i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f452638m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f452639n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            return e17 + b36.f.e(9, this.f452640o) + b36.f.e(10, this.f452641p) + b36.f.e(11, this.f452642q);
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
        r45.bw5 bw5Var = (r45.bw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bw5Var.f452632d = aVar2.k(intValue);
                return 0;
            case 2:
                bw5Var.f452633e = aVar2.k(intValue);
                return 0;
            case 3:
                bw5Var.f452634f = aVar2.k(intValue);
                return 0;
            case 4:
                bw5Var.f452635g = aVar2.k(intValue);
                return 0;
            case 5:
                bw5Var.f452636h = aVar2.g(intValue);
                return 0;
            case 6:
                bw5Var.f452637i = aVar2.k(intValue);
                return 0;
            case 7:
                bw5Var.f452638m = aVar2.k(intValue);
                return 0;
            case 8:
                bw5Var.f452639n = aVar2.k(intValue);
                return 0;
            case 9:
                bw5Var.f452640o = aVar2.g(intValue);
                return 0;
            case 10:
                bw5Var.f452641p = aVar2.g(intValue);
                return 0;
            case 11:
                bw5Var.f452642q = aVar2.g(intValue);
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
            java.lang.String str = this.f452632d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "Desc", this.f452633e, false);
            eVar.d(jSONObject, "ThumbUrl", this.f452634f, false);
            eVar.d(jSONObject, "Link", this.f452635g, false);
            eVar.d(jSONObject, "ItemShowType", java.lang.Integer.valueOf(this.f452636h), false);
            eVar.d(jSONObject, "SourceUsername", this.f452637i, false);
            eVar.d(jSONObject, "SourceDisplayName", this.f452638m, false);
            eVar.d(jSONObject, "Vid", this.f452639n, false);
            eVar.d(jSONObject, "Duraion", java.lang.Integer.valueOf(this.f452640o), false);
            eVar.d(jSONObject, "Width", java.lang.Integer.valueOf(this.f452641p), false);
            eVar.d(jSONObject, "Height", java.lang.Integer.valueOf(this.f452642q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
