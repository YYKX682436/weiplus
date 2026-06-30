package r45;

/* loaded from: classes2.dex */
public class yn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472755d;

    /* renamed from: e, reason: collision with root package name */
    public int f472756e;

    /* renamed from: f, reason: collision with root package name */
    public int f472757f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472758g;

    /* renamed from: h, reason: collision with root package name */
    public int f472759h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472760i;

    /* renamed from: m, reason: collision with root package name */
    public int f472761m;

    /* renamed from: n, reason: collision with root package name */
    public int f472762n;

    /* renamed from: o, reason: collision with root package name */
    public int f472763o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f472764p;

    /* renamed from: q, reason: collision with root package name */
    public int f472765q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yn)) {
            return false;
        }
        r45.yn ynVar = (r45.yn) fVar;
        return n51.f.a(this.f472755d, ynVar.f472755d) && n51.f.a(java.lang.Integer.valueOf(this.f472756e), java.lang.Integer.valueOf(ynVar.f472756e)) && n51.f.a(java.lang.Integer.valueOf(this.f472757f), java.lang.Integer.valueOf(ynVar.f472757f)) && n51.f.a(this.f472758g, ynVar.f472758g) && n51.f.a(java.lang.Integer.valueOf(this.f472759h), java.lang.Integer.valueOf(ynVar.f472759h)) && n51.f.a(this.f472760i, ynVar.f472760i) && n51.f.a(java.lang.Integer.valueOf(this.f472761m), java.lang.Integer.valueOf(ynVar.f472761m)) && n51.f.a(java.lang.Integer.valueOf(this.f472762n), java.lang.Integer.valueOf(ynVar.f472762n)) && n51.f.a(java.lang.Integer.valueOf(this.f472763o), java.lang.Integer.valueOf(ynVar.f472763o)) && n51.f.a(this.f472764p, ynVar.f472764p) && n51.f.a(java.lang.Integer.valueOf(this.f472765q), java.lang.Integer.valueOf(ynVar.f472765q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472755d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f472756e);
            fVar.e(3, this.f472757f);
            java.lang.String str2 = this.f472758g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f472759h);
            java.lang.String str3 = this.f472760i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f472761m);
            fVar.e(8, this.f472762n);
            fVar.e(9, this.f472763o);
            java.lang.String str4 = this.f472764p;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(15, this.f472765q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f472755d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f472756e) + b36.f.e(3, this.f472757f);
            java.lang.String str6 = this.f472758g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            int e17 = j17 + b36.f.e(5, this.f472759h);
            java.lang.String str7 = this.f472760i;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f472761m) + b36.f.e(8, this.f472762n) + b36.f.e(9, this.f472763o);
            java.lang.String str8 = this.f472764p;
            if (str8 != null) {
                e18 += b36.f.j(10, str8);
            }
            return e18 + b36.f.e(15, this.f472765q);
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
        r45.yn ynVar = (r45.yn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 15) {
            ynVar.f472765q = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                ynVar.f472755d = aVar2.k(intValue);
                return 0;
            case 2:
                ynVar.f472756e = aVar2.g(intValue);
                return 0;
            case 3:
                ynVar.f472757f = aVar2.g(intValue);
                return 0;
            case 4:
                ynVar.f472758g = aVar2.k(intValue);
                return 0;
            case 5:
                ynVar.f472759h = aVar2.g(intValue);
                return 0;
            case 6:
                ynVar.f472760i = aVar2.k(intValue);
                return 0;
            case 7:
                ynVar.f472761m = aVar2.g(intValue);
                return 0;
            case 8:
                ynVar.f472762n = aVar2.g(intValue);
                return 0;
            case 9:
                ynVar.f472763o = aVar2.g(intValue);
                return 0;
            case 10:
                ynVar.f472764p = aVar2.k(intValue);
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
            java.lang.String str = this.f472755d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "appid", str, false);
            eVar.d(jSONObject, "version_type", java.lang.Integer.valueOf(this.f472756e), false);
            eVar.d(jSONObject, "app_version", java.lang.Integer.valueOf(this.f472757f), false);
            eVar.d(jSONObject, "extinfo", this.f472758g, false);
            eVar.d(jSONObject, "appuin", java.lang.Integer.valueOf(this.f472759h), false);
            eVar.d(jSONObject, "debugurl", this.f472760i, false);
            eVar.d(jSONObject, "isrefresh", java.lang.Integer.valueOf(this.f472761m), false);
            eVar.d(jSONObject, "isdevtools", java.lang.Integer.valueOf(this.f472762n), false);
            eVar.d(jSONObject, "isusing_cached_location", java.lang.Integer.valueOf(this.f472763o), false);
            eVar.d(jSONObject, "from_url", this.f472764p, false);
            eVar.d(jSONObject, "screen_width", java.lang.Integer.valueOf(this.f472765q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
