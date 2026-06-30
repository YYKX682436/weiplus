package r45;

/* loaded from: classes4.dex */
public class hj3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457745d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457746e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457747f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hj3)) {
            return false;
        }
        r45.hj3 hj3Var = (r45.hj3) fVar;
        return n51.f.a(this.f76494x2de60e5e, hj3Var.f76494x2de60e5e) && n51.f.a(this.f457745d, hj3Var.f457745d) && n51.f.a(this.f457746e, hj3Var.f457746e) && n51.f.a(this.f457747f, hj3Var.f457747f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f457745d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f457746e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f457747f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f457745d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f457746e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f457747f;
            return str6 != null ? i18 + b36.f.j(4, str6) : i18;
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
        r45.hj3 hj3Var = (r45.hj3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                hj3Var.f457745d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                hj3Var.f457746e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            hj3Var.f457747f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.mo11468x92b714fd(bArr);
            }
            hj3Var.f76494x2de60e5e = heVar3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "from_username", this.f457745d, false);
            eVar.d(jSONObject, "to_username", this.f457746e, false);
            eVar.d(jSONObject, "msg_session_id", this.f457747f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
