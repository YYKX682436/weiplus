package r45;

/* loaded from: classes8.dex */
public class ls extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461324d;

    /* renamed from: e, reason: collision with root package name */
    public int f461325e;

    /* renamed from: f, reason: collision with root package name */
    public int f461326f;

    /* renamed from: g, reason: collision with root package name */
    public int f461327g;

    /* renamed from: h, reason: collision with root package name */
    public int f461328h;

    /* renamed from: i, reason: collision with root package name */
    public int f461329i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ls)) {
            return false;
        }
        r45.ls lsVar = (r45.ls) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461324d), java.lang.Integer.valueOf(lsVar.f461324d)) && n51.f.a(java.lang.Integer.valueOf(this.f461325e), java.lang.Integer.valueOf(lsVar.f461325e)) && n51.f.a(java.lang.Integer.valueOf(this.f461326f), java.lang.Integer.valueOf(lsVar.f461326f)) && n51.f.a(java.lang.Integer.valueOf(this.f461327g), java.lang.Integer.valueOf(lsVar.f461327g)) && n51.f.a(java.lang.Integer.valueOf(this.f461328h), java.lang.Integer.valueOf(lsVar.f461328h)) && n51.f.a(java.lang.Integer.valueOf(this.f461329i), java.lang.Integer.valueOf(lsVar.f461329i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461324d);
            fVar.e(2, this.f461325e);
            fVar.e(3, this.f461326f);
            fVar.e(4, this.f461327g);
            fVar.e(5, this.f461328h);
            fVar.e(6, this.f461329i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f461324d) + 0 + b36.f.e(2, this.f461325e) + b36.f.e(3, this.f461326f) + b36.f.e(4, this.f461327g) + b36.f.e(5, this.f461328h) + b36.f.e(6, this.f461329i);
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
        r45.ls lsVar = (r45.ls) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lsVar.f461324d = aVar2.g(intValue);
                return 0;
            case 2:
                lsVar.f461325e = aVar2.g(intValue);
                return 0;
            case 3:
                lsVar.f461326f = aVar2.g(intValue);
                return 0;
            case 4:
                lsVar.f461327g = aVar2.g(intValue);
                return 0;
            case 5:
                lsVar.f461328h = aVar2.g(intValue);
                return 0;
            case 6:
                lsVar.f461329i = aVar2.g(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f461324d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "C2CShowErrorDelayMS", valueOf, false);
            eVar.d(jSONObject, "SNSShowErrorDelayMS", java.lang.Integer.valueOf(this.f461325e), false);
            eVar.d(jSONObject, "C2CRetryInterval", java.lang.Integer.valueOf(this.f461326f), false);
            eVar.d(jSONObject, "SNSRetryInterval", java.lang.Integer.valueOf(this.f461327g), false);
            eVar.d(jSONObject, "C2CRWTimeout", java.lang.Integer.valueOf(this.f461328h), false);
            eVar.d(jSONObject, "SNSRWTimeout", java.lang.Integer.valueOf(this.f461329i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
