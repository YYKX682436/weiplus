package r45;

/* loaded from: classes4.dex */
public class gq4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457016d;

    /* renamed from: e, reason: collision with root package name */
    public double f457017e;

    /* renamed from: f, reason: collision with root package name */
    public long f457018f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gq4)) {
            return false;
        }
        r45.gq4 gq4Var = (r45.gq4) fVar;
        return n51.f.a(this.f457016d, gq4Var.f457016d) && n51.f.a(java.lang.Double.valueOf(this.f457017e), java.lang.Double.valueOf(gq4Var.f457017e)) && n51.f.a(java.lang.Long.valueOf(this.f457018f), java.lang.Long.valueOf(gq4Var.f457018f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457016d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.c(2, this.f457017e);
            fVar.h(3, this.f457018f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f457016d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.c(2, this.f457017e) + b36.f.h(3, this.f457018f);
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
        r45.gq4 gq4Var = (r45.gq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gq4Var.f457016d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gq4Var.f457017e = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        gq4Var.f457018f = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f457016d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Username", str, false);
            eVar.d(jSONObject, "Score", java.lang.Double.valueOf(this.f457017e), false);
            eVar.d(jSONObject, "LastUpdateTime", java.lang.Long.valueOf(this.f457018f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
