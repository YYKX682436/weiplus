package r45;

/* loaded from: classes4.dex */
public class bp4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452477d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452478e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452479f;

    /* renamed from: g, reason: collision with root package name */
    public int f452480g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bp4)) {
            return false;
        }
        r45.bp4 bp4Var = (r45.bp4) fVar;
        return n51.f.a(this.f452477d, bp4Var.f452477d) && n51.f.a(this.f452478e, bp4Var.f452478e) && n51.f.a(this.f452479f, bp4Var.f452479f) && n51.f.a(java.lang.Integer.valueOf(this.f452480g), java.lang.Integer.valueOf(bp4Var.f452480g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452477d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452478e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452479f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f452480g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f452477d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f452478e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f452479f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f452480g);
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
        r45.bp4 bp4Var = (r45.bp4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bp4Var.f452477d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            bp4Var.f452478e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bp4Var.f452479f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        bp4Var.f452480g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f452477d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "appid", str, false);
            eVar.d(jSONObject, "plugin_appid", this.f452478e, false);
            eVar.d(jSONObject, "scope", this.f452479f, false);
            eVar.d(jSONObject, "state", java.lang.Integer.valueOf(this.f452480g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
