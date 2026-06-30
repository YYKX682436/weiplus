package r45;

/* loaded from: classes2.dex */
public class vp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469946d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469947e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469948f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469949g;

    /* renamed from: h, reason: collision with root package name */
    public int f469950h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469951i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vp)) {
            return false;
        }
        r45.vp vpVar = (r45.vp) fVar;
        return n51.f.a(this.f469946d, vpVar.f469946d) && n51.f.a(this.f469947e, vpVar.f469947e) && n51.f.a(this.f469948f, vpVar.f469948f) && n51.f.a(this.f469949g, vpVar.f469949g) && n51.f.a(java.lang.Integer.valueOf(this.f469950h), java.lang.Integer.valueOf(vpVar.f469950h)) && n51.f.a(this.f469951i, vpVar.f469951i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469946d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469947e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469948f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f469949g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f469950h);
            java.lang.String str5 = this.f469951i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f469946d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f469947e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f469948f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f469949g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f469950h);
            java.lang.String str10 = this.f469951i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.vp vpVar = (r45.vp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vpVar.f469946d = aVar2.k(intValue);
                return 0;
            case 2:
                vpVar.f469947e = aVar2.k(intValue);
                return 0;
            case 3:
                vpVar.f469948f = aVar2.k(intValue);
                return 0;
            case 4:
                vpVar.f469949g = aVar2.k(intValue);
                return 0;
            case 5:
                vpVar.f469950h = aVar2.g(intValue);
                return 0;
            case 6:
                vpVar.f469951i = aVar2.k(intValue);
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
            java.lang.String str = this.f469946d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "ProductId", str, false);
            eVar.d(jSONObject, "ProductName", this.f469947e, false);
            eVar.d(jSONObject, "SellerName", this.f469948f, false);
            eVar.d(jSONObject, "SellerUserName", this.f469949g, false);
            eVar.d(jSONObject, "Price", java.lang.Integer.valueOf(this.f469950h), false);
            eVar.d(jSONObject, "ProductImgUrl", this.f469951i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
