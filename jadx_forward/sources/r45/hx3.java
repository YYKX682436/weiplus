package r45;

/* loaded from: classes8.dex */
public class hx3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458068d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458069e;

    /* renamed from: f, reason: collision with root package name */
    public int f458070f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hx3)) {
            return false;
        }
        r45.hx3 hx3Var = (r45.hx3) fVar;
        return n51.f.a(this.f458068d, hx3Var.f458068d) && n51.f.a(this.f458069e, hx3Var.f458069e) && n51.f.a(java.lang.Integer.valueOf(this.f458070f), java.lang.Integer.valueOf(hx3Var.f458070f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458068d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458069e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f458070f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f458068d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f458069e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f458070f);
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
        r45.hx3 hx3Var = (r45.hx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hx3Var.f458068d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hx3Var.f458069e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        hx3Var.f458070f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f458068d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Origin", str, false);
            eVar.d(jSONObject, "Substitute", this.f458069e, false);
            eVar.d(jSONObject, "Priority", java.lang.Integer.valueOf(this.f458070f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
