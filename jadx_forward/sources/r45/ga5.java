package r45;

/* loaded from: classes2.dex */
public class ga5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456574d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456575e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456576f;

    /* renamed from: g, reason: collision with root package name */
    public long f456577g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ga5)) {
            return false;
        }
        r45.ga5 ga5Var = (r45.ga5) fVar;
        return n51.f.a(this.f456574d, ga5Var.f456574d) && n51.f.a(this.f456575e, ga5Var.f456575e) && n51.f.a(this.f456576f, ga5Var.f456576f) && n51.f.a(java.lang.Long.valueOf(this.f456577g), java.lang.Long.valueOf(ga5Var.f456577g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456574d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456575e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f456576f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f456577g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f456574d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f456575e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f456576f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f456577g);
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
        r45.ga5 ga5Var = (r45.ga5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ga5Var.f456574d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ga5Var.f456575e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ga5Var.f456576f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ga5Var.f456577g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f456574d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "userName", str, false);
            eVar.d(jSONObject, "avatarUrl", this.f456575e, false);
            eVar.d(jSONObject, "displayName", this.f456576f, false);
            eVar.d(jSONObject, "selectTime", java.lang.Long.valueOf(this.f456577g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
