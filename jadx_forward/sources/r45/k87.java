package r45;

/* loaded from: classes7.dex */
public class k87 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460028d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460029e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460030f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k87)) {
            return false;
        }
        r45.k87 k87Var = (r45.k87) fVar;
        return n51.f.a(this.f460028d, k87Var.f460028d) && n51.f.a(this.f460029e, k87Var.f460029e) && n51.f.a(this.f460030f, k87Var.f460030f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460028d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460029e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460030f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f460028d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f460029e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f460030f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        r45.k87 k87Var = (r45.k87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k87Var.f460028d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            k87Var.f460029e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        k87Var.f460030f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f460028d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "user_name", str, false);
            eVar.d(jSONObject, "nick_name", this.f460029e, false);
            eVar.d(jSONObject, "head_url", this.f460030f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
