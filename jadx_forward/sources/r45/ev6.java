package r45;

/* loaded from: classes4.dex */
public class ev6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f455285d;

    /* renamed from: e, reason: collision with root package name */
    public int f455286e;

    /* renamed from: f, reason: collision with root package name */
    public long f455287f;

    /* renamed from: g, reason: collision with root package name */
    public int f455288g;

    /* renamed from: h, reason: collision with root package name */
    public int f455289h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ev6)) {
            return false;
        }
        r45.ev6 ev6Var = (r45.ev6) fVar;
        return n51.f.a(this.f455285d, ev6Var.f455285d) && n51.f.a(java.lang.Integer.valueOf(this.f455286e), java.lang.Integer.valueOf(ev6Var.f455286e)) && n51.f.a(java.lang.Long.valueOf(this.f455287f), java.lang.Long.valueOf(ev6Var.f455287f)) && n51.f.a(java.lang.Integer.valueOf(this.f455288g), java.lang.Integer.valueOf(ev6Var.f455288g)) && n51.f.a(java.lang.Integer.valueOf(this.f455289h), java.lang.Integer.valueOf(ev6Var.f455289h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f455285d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f455286e);
            fVar.h(3, this.f455287f);
            fVar.e(4, this.f455288g);
            fVar.e(5, this.f455289h);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f455285d;
            return (gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0) + b36.f.e(2, this.f455286e) + b36.f.h(3, this.f455287f) + b36.f.e(4, this.f455288g) + b36.f.e(5, this.f455289h);
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
        r45.ev6 ev6Var = (r45.ev6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ev6Var.f455285d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            ev6Var.f455286e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ev6Var.f455287f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            ev6Var.f455288g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ev6Var.f455289h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f455285d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Url", gVar, false);
            eVar.d(jSONObject, "DurationMs", java.lang.Integer.valueOf(this.f455286e), false);
            eVar.d(jSONObject, "Filesize", java.lang.Long.valueOf(this.f455287f), false);
            eVar.d(jSONObject, "Width", java.lang.Integer.valueOf(this.f455288g), false);
            eVar.d(jSONObject, "Height", java.lang.Integer.valueOf(this.f455289h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
