package r45;

/* loaded from: classes8.dex */
public class e64 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f454579d;

    /* renamed from: e, reason: collision with root package name */
    public float f454580e;

    /* renamed from: f, reason: collision with root package name */
    public int f454581f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454582g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454583h;

    /* renamed from: i, reason: collision with root package name */
    public int f454584i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454585m;

    /* renamed from: n, reason: collision with root package name */
    public int f454586n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e64)) {
            return false;
        }
        r45.e64 e64Var = (r45.e64) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f454579d), java.lang.Float.valueOf(e64Var.f454579d)) && n51.f.a(java.lang.Float.valueOf(this.f454580e), java.lang.Float.valueOf(e64Var.f454580e)) && n51.f.a(java.lang.Integer.valueOf(this.f454581f), java.lang.Integer.valueOf(e64Var.f454581f)) && n51.f.a(this.f454582g, e64Var.f454582g) && n51.f.a(this.f454583h, e64Var.f454583h) && n51.f.a(java.lang.Integer.valueOf(this.f454584i), java.lang.Integer.valueOf(e64Var.f454584i)) && n51.f.a(this.f454585m, e64Var.f454585m) && n51.f.a(java.lang.Integer.valueOf(this.f454586n), java.lang.Integer.valueOf(e64Var.f454586n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f454579d);
            fVar.d(2, this.f454580e);
            fVar.e(3, this.f454581f);
            java.lang.String str = this.f454582g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f454583h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f454584i);
            java.lang.String str3 = this.f454585m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f454586n);
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f454579d) + 0 + b36.f.d(2, this.f454580e) + b36.f.e(3, this.f454581f);
            java.lang.String str4 = this.f454582g;
            if (str4 != null) {
                d17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f454583h;
            if (str5 != null) {
                d17 += b36.f.j(5, str5);
            }
            int e17 = d17 + b36.f.e(6, this.f454584i);
            java.lang.String str6 = this.f454585m;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            return e17 + b36.f.e(8, this.f454586n);
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
        r45.e64 e64Var = (r45.e64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e64Var.f454579d = aVar2.f(intValue);
                return 0;
            case 2:
                e64Var.f454580e = aVar2.f(intValue);
                return 0;
            case 3:
                e64Var.f454581f = aVar2.g(intValue);
                return 0;
            case 4:
                e64Var.f454582g = aVar2.k(intValue);
                return 0;
            case 5:
                e64Var.f454583h = aVar2.k(intValue);
                return 0;
            case 6:
                e64Var.f454584i = aVar2.g(intValue);
                return 0;
            case 7:
                e64Var.f454585m = aVar2.k(intValue);
                return 0;
            case 8:
                e64Var.f454586n = aVar2.g(intValue);
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
            java.lang.Float valueOf = java.lang.Float.valueOf(this.f454579d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Longitude", valueOf, false);
            eVar.d(jSONObject, "Latitude", java.lang.Float.valueOf(this.f454580e), false);
            eVar.d(jSONObject, "Precision", java.lang.Integer.valueOf(this.f454581f), false);
            eVar.d(jSONObject, "MacAddr", this.f454582g, false);
            eVar.d(jSONObject, "CellId", this.f454583h, false);
            eVar.d(jSONObject, "GPSSource", java.lang.Integer.valueOf(this.f454584i), false);
            eVar.d(jSONObject, "Address", this.f454585m, false);
            eVar.d(jSONObject, "AddrFlag", java.lang.Integer.valueOf(this.f454586n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
