package r45;

/* loaded from: classes4.dex */
public class vi extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f469804d;

    /* renamed from: e, reason: collision with root package name */
    public float f469805e;

    /* renamed from: f, reason: collision with root package name */
    public float f469806f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f469807g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vi)) {
            return false;
        }
        r45.vi viVar = (r45.vi) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f469804d), java.lang.Float.valueOf(viVar.f469804d)) && n51.f.a(java.lang.Float.valueOf(this.f469805e), java.lang.Float.valueOf(viVar.f469805e)) && n51.f.a(java.lang.Float.valueOf(this.f469806f), java.lang.Float.valueOf(viVar.f469806f)) && n51.f.a(java.lang.Boolean.valueOf(this.f469807g), java.lang.Boolean.valueOf(viVar.f469807g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f469804d);
            fVar.d(2, this.f469805e);
            fVar.d(3, this.f469806f);
            fVar.a(4, this.f469807g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f469804d) + 0 + b36.f.d(2, this.f469805e) + b36.f.d(3, this.f469806f) + b36.f.a(4, this.f469807g);
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
        r45.vi viVar = (r45.vi) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            viVar.f469804d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            viVar.f469805e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            viVar.f469806f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        viVar.f469807g = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Float valueOf = java.lang.Float.valueOf(this.f469804d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "latitude", valueOf, false);
            eVar.d(jSONObject, "longitude", java.lang.Float.valueOf(this.f469805e), false);
            eVar.d(jSONObject, "precision", java.lang.Float.valueOf(this.f469806f), false);
            eVar.d(jSONObject, "is_empty", java.lang.Boolean.valueOf(this.f469807g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
