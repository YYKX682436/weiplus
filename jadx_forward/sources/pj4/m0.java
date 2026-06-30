package pj4;

/* loaded from: classes10.dex */
public class m0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436708d;

    /* renamed from: e, reason: collision with root package name */
    public int f436709e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436710f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f436711g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436712h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f436713i;

    /* renamed from: m, reason: collision with root package name */
    public long f436714m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.m0)) {
            return false;
        }
        pj4.m0 m0Var = (pj4.m0) fVar;
        return n51.f.a(this.f436708d, m0Var.f436708d) && n51.f.a(java.lang.Integer.valueOf(this.f436709e), java.lang.Integer.valueOf(m0Var.f436709e)) && n51.f.a(this.f436710f, m0Var.f436710f) && n51.f.a(this.f436711g, m0Var.f436711g) && n51.f.a(this.f436712h, m0Var.f436712h) && n51.f.a(this.f436713i, m0Var.f436713i) && n51.f.a(java.lang.Long.valueOf(this.f436714m), java.lang.Long.valueOf(m0Var.f436714m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436708d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f436709e);
            java.lang.String str2 = this.f436710f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f436711g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f436712h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f436713i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.h(7, this.f436714m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f436708d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f436709e);
            java.lang.String str7 = this.f436710f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f436711g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f436712h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f436713i;
            if (str10 != null) {
                j17 += b36.f.j(6, str10);
            }
            return j17 + b36.f.h(7, this.f436714m);
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
        pj4.m0 m0Var = (pj4.m0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m0Var.f436708d = aVar2.k(intValue);
                return 0;
            case 2:
                m0Var.f436709e = aVar2.g(intValue);
                return 0;
            case 3:
                m0Var.f436710f = aVar2.k(intValue);
                return 0;
            case 4:
                m0Var.f436711g = aVar2.k(intValue);
                return 0;
            case 5:
                m0Var.f436712h = aVar2.k(intValue);
                return 0;
            case 6:
                m0Var.f436713i = aVar2.k(intValue);
                return 0;
            case 7:
                m0Var.f436714m = aVar2.i(intValue);
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
            java.lang.String str = this.f436708d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "media_name", str, false);
            eVar.d(jSONObject, "media_type", java.lang.Integer.valueOf(this.f436709e), false);
            eVar.d(jSONObject, "media_url", this.f436710f, false);
            eVar.d(jSONObject, "media_aes_key", this.f436711g, false);
            eVar.d(jSONObject, "media_thumb_url", this.f436712h, false);
            eVar.d(jSONObject, "media_thumb_aes_key", this.f436713i, false);
            eVar.d(jSONObject, "media_duration_ms", java.lang.Long.valueOf(this.f436714m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
