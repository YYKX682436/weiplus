package r45;

/* loaded from: classes4.dex */
public class ef0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454916d;

    /* renamed from: e, reason: collision with root package name */
    public int f454917e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef0)) {
            return false;
        }
        r45.ef0 ef0Var = (r45.ef0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454916d), java.lang.Integer.valueOf(ef0Var.f454916d)) && n51.f.a(java.lang.Integer.valueOf(this.f454917e), java.lang.Integer.valueOf(ef0Var.f454917e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454916d);
            fVar.e(2, this.f454917e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f454916d) + 0 + b36.f.e(2, this.f454917e);
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
        r45.ef0 ef0Var = (r45.ef0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ef0Var.f454916d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ef0Var.f454917e = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f454916d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BeginTime", valueOf, false);
            eVar.d(jSONObject, "EndTime", java.lang.Integer.valueOf(this.f454917e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
