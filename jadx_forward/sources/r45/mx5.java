package r45;

/* loaded from: classes4.dex */
public class mx5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462430d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462431e;

    /* renamed from: f, reason: collision with root package name */
    public r45.r44 f462432f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mx5)) {
            return false;
        }
        r45.mx5 mx5Var = (r45.mx5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462430d), java.lang.Integer.valueOf(mx5Var.f462430d)) && n51.f.a(this.f462431e, mx5Var.f462431e) && n51.f.a(this.f462432f, mx5Var.f462432f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462430d);
            java.lang.String str = this.f462431e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.r44 r44Var = this.f462432f;
            if (r44Var != null) {
                fVar.i(4, r44Var.mo75928xcd1e8d8());
                this.f462432f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462430d) + 0;
            java.lang.String str2 = this.f462431e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.r44 r44Var2 = this.f462432f;
            return r44Var2 != null ? e17 + b36.f.i(4, r44Var2.mo75928xcd1e8d8()) : e17;
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
        r45.mx5 mx5Var = (r45.mx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mx5Var.f462430d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mx5Var.f462431e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.r44 r44Var3 = new r45.r44();
            if (bArr != null && bArr.length > 0) {
                r44Var3.mo11468x92b714fd(bArr);
            }
            mx5Var.f462432f = r44Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f462430d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "Query", this.f462431e, false);
            eVar.d(jSONObject, "kv_list", this.f462432f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
