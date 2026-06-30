package r45;

/* loaded from: classes8.dex */
public class j30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459062d;

    /* renamed from: e, reason: collision with root package name */
    public int f459063e;

    /* renamed from: f, reason: collision with root package name */
    public int f459064f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f459065g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j30)) {
            return false;
        }
        r45.j30 j30Var = (r45.j30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459062d), java.lang.Integer.valueOf(j30Var.f459062d)) && n51.f.a(java.lang.Integer.valueOf(this.f459063e), java.lang.Integer.valueOf(j30Var.f459063e)) && n51.f.a(java.lang.Integer.valueOf(this.f459064f), java.lang.Integer.valueOf(j30Var.f459064f)) && n51.f.a(java.lang.Boolean.valueOf(this.f459065g), java.lang.Boolean.valueOf(j30Var.f459065g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459062d);
            fVar.e(2, this.f459063e);
            fVar.e(3, this.f459064f);
            fVar.a(4, this.f459065g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f459062d) + 0 + b36.f.e(2, this.f459063e) + b36.f.e(3, this.f459064f) + b36.f.a(4, this.f459065g);
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
        r45.j30 j30Var = (r45.j30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j30Var.f459062d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            j30Var.f459063e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            j30Var.f459064f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        j30Var.f459065g = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f459062d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BizSwitch", valueOf, false);
            eVar.d(jSONObject, "WeappSwitch", java.lang.Integer.valueOf(this.f459063e), false);
            eVar.d(jSONObject, "FinderSwitch", java.lang.Integer.valueOf(this.f459064f), false);
            eVar.d(jSONObject, "ChildModeSwitch", java.lang.Boolean.valueOf(this.f459065g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
