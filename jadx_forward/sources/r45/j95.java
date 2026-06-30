package r45;

/* loaded from: classes2.dex */
public class j95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459200d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459201e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459202f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459203g;

    /* renamed from: h, reason: collision with root package name */
    public float f459204h;

    /* renamed from: i, reason: collision with root package name */
    public float f459205i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459206m;

    /* renamed from: n, reason: collision with root package name */
    public long f459207n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j95)) {
            return false;
        }
        r45.j95 j95Var = (r45.j95) fVar;
        return n51.f.a(this.f459200d, j95Var.f459200d) && n51.f.a(this.f459201e, j95Var.f459201e) && n51.f.a(this.f459202f, j95Var.f459202f) && n51.f.a(this.f459203g, j95Var.f459203g) && n51.f.a(java.lang.Float.valueOf(this.f459204h), java.lang.Float.valueOf(j95Var.f459204h)) && n51.f.a(java.lang.Float.valueOf(this.f459205i), java.lang.Float.valueOf(j95Var.f459205i)) && n51.f.a(this.f459206m, j95Var.f459206m) && n51.f.a(java.lang.Long.valueOf(this.f459207n), java.lang.Long.valueOf(j95Var.f459207n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459200d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459201e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f459202f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f459203g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.d(5, this.f459204h);
            fVar.d(6, this.f459205i);
            java.lang.String str5 = this.f459206m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f459207n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f459200d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f459201e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f459202f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f459203g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int d17 = j17 + b36.f.d(5, this.f459204h) + b36.f.d(6, this.f459205i);
            java.lang.String str10 = this.f459206m;
            if (str10 != null) {
                d17 += b36.f.j(7, str10);
            }
            return d17 + b36.f.h(8, this.f459207n);
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
        r45.j95 j95Var = (r45.j95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j95Var.f459200d = aVar2.k(intValue);
                return 0;
            case 2:
                j95Var.f459201e = aVar2.k(intValue);
                return 0;
            case 3:
                j95Var.f459202f = aVar2.k(intValue);
                return 0;
            case 4:
                j95Var.f459203g = aVar2.k(intValue);
                return 0;
            case 5:
                j95Var.f459204h = aVar2.f(intValue);
                return 0;
            case 6:
                j95Var.f459205i = aVar2.f(intValue);
                return 0;
            case 7:
                j95Var.f459206m = aVar2.k(intValue);
                return 0;
            case 8:
                j95Var.f459207n = aVar2.i(intValue);
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
            java.lang.String str = this.f459200d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "PoiID", str, false);
            eVar.d(jSONObject, "Country", this.f459201e, false);
            eVar.d(jSONObject, "City", this.f459202f, false);
            eVar.d(jSONObject, "PoiName", this.f459203g, false);
            eVar.d(jSONObject, "Latitude", java.lang.Float.valueOf(this.f459204h), false);
            eVar.d(jSONObject, "Longitude", java.lang.Float.valueOf(this.f459205i), false);
            eVar.d(jSONObject, "PoiQuery", this.f459206m, false);
            eVar.d(jSONObject, "SnsID", java.lang.Long.valueOf(this.f459207n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
