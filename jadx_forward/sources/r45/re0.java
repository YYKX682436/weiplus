package r45;

/* loaded from: classes4.dex */
public class re0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466291d;

    /* renamed from: e, reason: collision with root package name */
    public int f466292e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.re0)) {
            return false;
        }
        r45.re0 re0Var = (r45.re0) fVar;
        return n51.f.a(this.f466291d, re0Var.f466291d) && n51.f.a(java.lang.Integer.valueOf(this.f466292e), java.lang.Integer.valueOf(re0Var.f466292e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466291d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f466292e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f466291d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f466292e);
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
        r45.re0 re0Var = (r45.re0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            re0Var.f466291d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        re0Var.f466292e = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f466291d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "word", str, false);
            eVar.d(jSONObject, "update_time", java.lang.Integer.valueOf(this.f466292e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
