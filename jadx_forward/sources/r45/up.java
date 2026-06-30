package r45;

/* loaded from: classes2.dex */
public class up extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469071d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469072e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469073f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469074g;

    /* renamed from: h, reason: collision with root package name */
    public int f469075h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469076i;

    /* renamed from: m, reason: collision with root package name */
    public int f469077m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.up)) {
            return false;
        }
        r45.up upVar = (r45.up) fVar;
        return n51.f.a(this.f469071d, upVar.f469071d) && n51.f.a(this.f469072e, upVar.f469072e) && n51.f.a(this.f469073f, upVar.f469073f) && n51.f.a(this.f469074g, upVar.f469074g) && n51.f.a(java.lang.Integer.valueOf(this.f469075h), java.lang.Integer.valueOf(upVar.f469075h)) && n51.f.a(this.f469076i, upVar.f469076i) && n51.f.a(java.lang.Integer.valueOf(this.f469077m), java.lang.Integer.valueOf(upVar.f469077m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469071d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469072e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469073f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f469074g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f469075h);
            java.lang.String str5 = this.f469076i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f469077m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f469071d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f469072e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f469073f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f469074g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f469075h);
            java.lang.String str10 = this.f469076i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f469077m);
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
        r45.up upVar = (r45.up) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                upVar.f469071d = aVar2.k(intValue);
                return 0;
            case 2:
                upVar.f469072e = aVar2.k(intValue);
                return 0;
            case 3:
                upVar.f469073f = aVar2.k(intValue);
                return 0;
            case 4:
                upVar.f469074g = aVar2.k(intValue);
                return 0;
            case 5:
                upVar.f469075h = aVar2.g(intValue);
                return 0;
            case 6:
                upVar.f469076i = aVar2.k(intValue);
                return 0;
            case 7:
                upVar.f469077m = aVar2.g(intValue);
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
            java.lang.String str = this.f469071d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "Url", this.f469072e, false);
            eVar.d(jSONObject, "Position", this.f469073f, false);
            eVar.d(jSONObject, "DetailInfo", this.f469074g, false);
            eVar.d(jSONObject, "StarLevel", java.lang.Integer.valueOf(this.f469075h), false);
            eVar.d(jSONObject, "Average", this.f469076i, false);
            eVar.d(jSONObject, "PoiFlag", java.lang.Integer.valueOf(this.f469077m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
