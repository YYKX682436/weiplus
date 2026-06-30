package r45;

/* loaded from: classes2.dex */
public class hx4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458071d;

    /* renamed from: e, reason: collision with root package name */
    public long f458072e;

    /* renamed from: f, reason: collision with root package name */
    public long f458073f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hx4)) {
            return false;
        }
        r45.hx4 hx4Var = (r45.hx4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458071d), java.lang.Integer.valueOf(hx4Var.f458071d)) && n51.f.a(java.lang.Long.valueOf(this.f458072e), java.lang.Long.valueOf(hx4Var.f458072e)) && n51.f.a(java.lang.Long.valueOf(this.f458073f), java.lang.Long.valueOf(hx4Var.f458073f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458071d);
            fVar.h(2, this.f458072e);
            fVar.h(3, this.f458073f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f458071d) + 0 + b36.f.h(2, this.f458072e) + b36.f.h(3, this.f458073f);
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
        r45.hx4 hx4Var = (r45.hx4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hx4Var.f458071d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hx4Var.f458072e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        hx4Var.f458073f = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f458071d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "field", valueOf, false);
            eVar.d(jSONObject, "from", java.lang.Long.valueOf(this.f458072e), false);
            eVar.d(jSONObject, "to", java.lang.Long.valueOf(this.f458073f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
