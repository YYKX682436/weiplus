package r45;

/* loaded from: classes4.dex */
public class tj3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468037d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468038e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tj3)) {
            return false;
        }
        r45.tj3 tj3Var = (r45.tj3) fVar;
        return n51.f.a(this.f468037d, tj3Var.f468037d) && n51.f.a(this.f468038e, tj3Var.f468038e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468037d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468038e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f468037d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f468038e;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
        r45.tj3 tj3Var = (r45.tj3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tj3Var.f468037d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        tj3Var.f468038e = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f468037d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "tousername", str, false);
            eVar.d(jSONObject, "privacy_agreement_url", this.f468038e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
