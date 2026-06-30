package r45;

/* loaded from: classes4.dex */
public class ch0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453082d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453083e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f453084f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453085g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ch0)) {
            return false;
        }
        r45.ch0 ch0Var = (r45.ch0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453082d), java.lang.Integer.valueOf(ch0Var.f453082d)) && n51.f.a(this.f453083e, ch0Var.f453083e) && n51.f.a(java.lang.Boolean.valueOf(this.f453084f), java.lang.Boolean.valueOf(ch0Var.f453084f)) && n51.f.a(this.f453085g, ch0Var.f453085g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453082d);
            java.lang.String str = this.f453083e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f453084f);
            java.lang.String str2 = this.f453085g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453082d) + 0;
            java.lang.String str3 = this.f453083e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int a17 = e17 + b36.f.a(3, this.f453084f);
            java.lang.String str4 = this.f453085g;
            return str4 != null ? a17 + b36.f.j(4, str4) : a17;
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
        r45.ch0 ch0Var = (r45.ch0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ch0Var.f453082d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ch0Var.f453083e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ch0Var.f453084f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ch0Var.f453085g = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f453082d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "live_status", valueOf, false);
            eVar.d(jSONObject, "description", this.f453083e, false);
            eVar.d(jSONObject, "is_violation", java.lang.Boolean.valueOf(this.f453084f), false);
            eVar.d(jSONObject, "export_id", this.f453085g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
