package r45;

/* loaded from: classes8.dex */
public class je7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459303e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459304f;

    /* renamed from: g, reason: collision with root package name */
    public int f459305g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459306h;

    /* renamed from: i, reason: collision with root package name */
    public int f459307i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.je7)) {
            return false;
        }
        r45.je7 je7Var = (r45.je7) fVar;
        return n51.f.a(this.f76494x2de60e5e, je7Var.f76494x2de60e5e) && n51.f.a(this.f459302d, je7Var.f459302d) && n51.f.a(this.f459303e, je7Var.f459303e) && n51.f.a(this.f459304f, je7Var.f459304f) && n51.f.a(java.lang.Integer.valueOf(this.f459305g), java.lang.Integer.valueOf(je7Var.f459305g)) && n51.f.a(this.f459306h, je7Var.f459306h) && n51.f.a(java.lang.Integer.valueOf(this.f459307i), java.lang.Integer.valueOf(je7Var.f459307i));
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
            java.lang.String str = this.f459302d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f459303e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f459304f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f459305g);
            java.lang.String str4 = this.f459306h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f459307i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f459302d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f459303e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f459304f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(5, this.f459305g);
            java.lang.String str8 = this.f459306h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.e(7, this.f459307i);
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
        r45.je7 je7Var = (r45.je7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    je7Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                je7Var.f459302d = aVar2.k(intValue);
                return 0;
            case 3:
                je7Var.f459303e = aVar2.k(intValue);
                return 0;
            case 4:
                je7Var.f459304f = aVar2.k(intValue);
                return 0;
            case 5:
                je7Var.f459305g = aVar2.g(intValue);
                return 0;
            case 6:
                je7Var.f459306h = aVar2.k(intValue);
                return 0;
            case 7:
                je7Var.f459307i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "appid", this.f459302d, false);
            eVar.d(jSONObject, "model_id", this.f459303e, false);
            eVar.d(jSONObject, "sn", this.f459304f, false);
            eVar.d(jSONObject, "status", java.lang.Integer.valueOf(this.f459305g), false);
            eVar.d(jSONObject, "voip_call_template_id", this.f459306h, false);
            eVar.d(jSONObject, "voip_call_status", java.lang.Integer.valueOf(this.f459307i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
