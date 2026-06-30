package r45;

/* loaded from: classes9.dex */
public class ir0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458810d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458811e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f458812f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ir0)) {
            return false;
        }
        r45.ir0 ir0Var = (r45.ir0) fVar;
        return n51.f.a(this.f458810d, ir0Var.f458810d) && n51.f.a(this.f458811e, ir0Var.f458811e) && n51.f.a(java.lang.Boolean.valueOf(this.f458812f), java.lang.Boolean.valueOf(ir0Var.f458812f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458810d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458811e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f458812f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f458810d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f458811e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.a(3, this.f458812f);
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
        r45.ir0 ir0Var = (r45.ir0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ir0Var.f458810d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ir0Var.f458811e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        ir0Var.f458812f = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f458810d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, dm.i4.f66865x76d1ec5a, str, false);
            eVar.d(jSONObject, "wording", this.f458811e, false);
            eVar.d(jSONObject, "isUseToConfirm", java.lang.Boolean.valueOf(this.f458812f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
