package r45;

/* loaded from: classes4.dex */
public class cb6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452961d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452962e;

    /* renamed from: f, reason: collision with root package name */
    public long f452963f;

    /* renamed from: g, reason: collision with root package name */
    public int f452964g;

    /* renamed from: h, reason: collision with root package name */
    public int f452965h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cb6)) {
            return false;
        }
        r45.cb6 cb6Var = (r45.cb6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452961d), java.lang.Integer.valueOf(cb6Var.f452961d)) && n51.f.a(this.f452962e, cb6Var.f452962e) && n51.f.a(java.lang.Long.valueOf(this.f452963f), java.lang.Long.valueOf(cb6Var.f452963f)) && n51.f.a(java.lang.Integer.valueOf(this.f452964g), java.lang.Integer.valueOf(cb6Var.f452964g)) && n51.f.a(java.lang.Integer.valueOf(this.f452965h), java.lang.Integer.valueOf(cb6Var.f452965h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452961d);
            java.lang.String str = this.f452962e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f452963f);
            fVar.e(4, this.f452964g);
            fVar.e(5, this.f452965h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452961d) + 0;
            java.lang.String str2 = this.f452962e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f452963f) + b36.f.e(4, this.f452964g) + b36.f.e(5, this.f452965h);
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
        r45.cb6 cb6Var = (r45.cb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cb6Var.f452961d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            cb6Var.f452962e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            cb6Var.f452963f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            cb6Var.f452964g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        cb6Var.f452965h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f452961d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "SnsFlag", valueOf, false);
            eVar.d(jSONObject, "SnsBGImgID", this.f452962e, false);
            eVar.d(jSONObject, "SnsBGObjectID", java.lang.Long.valueOf(this.f452963f), false);
            eVar.d(jSONObject, "SnsFlagEx", java.lang.Integer.valueOf(this.f452964g), false);
            eVar.d(jSONObject, "SnsPrivacyRecent", java.lang.Integer.valueOf(this.f452965h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
