package r45;

/* loaded from: classes8.dex */
public class rx5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466807d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466808e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466809f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466810g;

    /* renamed from: h, reason: collision with root package name */
    public int f466811h;

    /* renamed from: i, reason: collision with root package name */
    public int f466812i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rx5)) {
            return false;
        }
        r45.rx5 rx5Var = (r45.rx5) fVar;
        return n51.f.a(this.f466807d, rx5Var.f466807d) && n51.f.a(this.f466808e, rx5Var.f466808e) && n51.f.a(this.f466809f, rx5Var.f466809f) && n51.f.a(this.f466810g, rx5Var.f466810g) && n51.f.a(java.lang.Integer.valueOf(this.f466811h), java.lang.Integer.valueOf(rx5Var.f466811h)) && n51.f.a(java.lang.Integer.valueOf(this.f466812i), java.lang.Integer.valueOf(rx5Var.f466812i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466807d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466808e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466809f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f466810g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f466811h);
            fVar.e(6, this.f466812i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f466807d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f466808e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f466809f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f466810g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f466811h) + b36.f.e(6, this.f466812i);
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
        r45.rx5 rx5Var = (r45.rx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rx5Var.f466807d = aVar2.k(intValue);
                return 0;
            case 2:
                rx5Var.f466808e = aVar2.k(intValue);
                return 0;
            case 3:
                rx5Var.f466809f = aVar2.k(intValue);
                return 0;
            case 4:
                rx5Var.f466810g = aVar2.k(intValue);
                return 0;
            case 5:
                rx5Var.f466811h = aVar2.g(intValue);
                return 0;
            case 6:
                rx5Var.f466812i = aVar2.g(intValue);
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
            java.lang.String str = this.f466807d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "UserName", str, false);
            eVar.d(jSONObject, "SourceDisplayName", this.f466808e, false);
            eVar.d(jSONObject, "ThumbUrl", this.f466809f, false);
            eVar.d(jSONObject, "AppID", this.f466810g, false);
            eVar.d(jSONObject, "TradingGuaranteeFlag", java.lang.Integer.valueOf(this.f466811h), false);
            eVar.d(jSONObject, "BrandOfficialFlag", java.lang.Integer.valueOf(this.f466812i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
