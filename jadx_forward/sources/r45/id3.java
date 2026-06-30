package r45;

/* loaded from: classes4.dex */
public class id3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458481d;

    /* renamed from: e, reason: collision with root package name */
    public int f458482e;

    /* renamed from: f, reason: collision with root package name */
    public long f458483f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.id3)) {
            return false;
        }
        r45.id3 id3Var = (r45.id3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458481d), java.lang.Integer.valueOf(id3Var.f458481d)) && n51.f.a(java.lang.Integer.valueOf(this.f458482e), java.lang.Integer.valueOf(id3Var.f458482e)) && n51.f.a(java.lang.Long.valueOf(this.f458483f), java.lang.Long.valueOf(id3Var.f458483f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458481d);
            fVar.e(2, this.f458482e);
            fVar.h(3, this.f458483f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f458481d) + 0 + b36.f.e(2, this.f458482e) + b36.f.h(3, this.f458483f);
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
        r45.id3 id3Var = (r45.id3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            id3Var.f458481d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            id3Var.f458482e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        id3Var.f458483f = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f458481d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Type", valueOf, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f458482e), false);
            eVar.d(jSONObject, "Version", java.lang.Long.valueOf(this.f458483f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
