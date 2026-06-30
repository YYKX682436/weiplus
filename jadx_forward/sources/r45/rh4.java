package r45;

/* loaded from: classes2.dex */
public class rh4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f466404d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466405e;

    /* renamed from: f, reason: collision with root package name */
    public long f466406f;

    /* renamed from: g, reason: collision with root package name */
    public long f466407g;

    /* renamed from: h, reason: collision with root package name */
    public int f466408h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rh4)) {
            return false;
        }
        r45.rh4 rh4Var = (r45.rh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f466404d), java.lang.Integer.valueOf(rh4Var.f466404d)) && n51.f.a(this.f466405e, rh4Var.f466405e) && n51.f.a(java.lang.Long.valueOf(this.f466406f), java.lang.Long.valueOf(rh4Var.f466406f)) && n51.f.a(java.lang.Long.valueOf(this.f466407g), java.lang.Long.valueOf(rh4Var.f466407g)) && n51.f.a(java.lang.Integer.valueOf(this.f466408h), java.lang.Integer.valueOf(rh4Var.f466408h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f466404d);
            java.lang.String str = this.f466405e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f466406f);
            fVar.h(4, this.f466407g);
            fVar.e(5, this.f466408h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f466404d) + 0;
            java.lang.String str2 = this.f466405e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f466406f) + b36.f.h(4, this.f466407g) + b36.f.e(5, this.f466408h);
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
        r45.rh4 rh4Var = (r45.rh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rh4Var.f466404d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            rh4Var.f466405e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            rh4Var.f466406f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            rh4Var.f466407g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        rh4Var.f466408h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f466404d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "Json", this.f466405e, false);
            eVar.d(jSONObject, "Interval", java.lang.Long.valueOf(this.f466406f), false);
            eVar.d(jSONObject, "LastCacheSecond", java.lang.Long.valueOf(this.f466407g), false);
            eVar.d(jSONObject, "IsPreload", java.lang.Integer.valueOf(this.f466408h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
