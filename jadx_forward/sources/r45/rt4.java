package r45;

/* loaded from: classes8.dex */
public class rt4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466734d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466735e;

    /* renamed from: f, reason: collision with root package name */
    public int f466736f;

    /* renamed from: g, reason: collision with root package name */
    public int f466737g;

    /* renamed from: h, reason: collision with root package name */
    public int f466738h;

    /* renamed from: i, reason: collision with root package name */
    public int f466739i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rt4)) {
            return false;
        }
        r45.rt4 rt4Var = (r45.rt4) fVar;
        return n51.f.a(this.f466734d, rt4Var.f466734d) && n51.f.a(this.f466735e, rt4Var.f466735e) && n51.f.a(java.lang.Integer.valueOf(this.f466736f), java.lang.Integer.valueOf(rt4Var.f466736f)) && n51.f.a(java.lang.Integer.valueOf(this.f466737g), java.lang.Integer.valueOf(rt4Var.f466737g)) && n51.f.a(java.lang.Integer.valueOf(this.f466738h), java.lang.Integer.valueOf(rt4Var.f466738h)) && n51.f.a(java.lang.Integer.valueOf(this.f466739i), java.lang.Integer.valueOf(rt4Var.f466739i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466734d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466735e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f466736f);
            fVar.e(4, this.f466737g);
            fVar.e(5, this.f466738h);
            fVar.e(7, this.f466739i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f466734d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f466735e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f466736f) + b36.f.e(4, this.f466737g) + b36.f.e(5, this.f466738h) + b36.f.e(7, this.f466739i);
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
        r45.rt4 rt4Var = (r45.rt4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rt4Var.f466734d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            rt4Var.f466735e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            rt4Var.f466736f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            rt4Var.f466737g = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            rt4Var.f466738h = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        rt4Var.f466739i = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f466734d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "PortList", str, false);
            eVar.d(jSONObject, "TimeoutList", this.f466735e, false);
            eVar.d(jSONObject, "MinNoopInterval", java.lang.Integer.valueOf(this.f466736f), false);
            eVar.d(jSONObject, "MaxNoopInterval", java.lang.Integer.valueOf(this.f466737g), false);
            eVar.d(jSONObject, "TypingInterval", java.lang.Integer.valueOf(this.f466738h), false);
            eVar.d(jSONObject, "NoopIntervalTime", java.lang.Integer.valueOf(this.f466739i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
