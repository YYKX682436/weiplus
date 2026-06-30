package pj4;

/* loaded from: classes9.dex */
public class i2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436649d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436650e;

    /* renamed from: f, reason: collision with root package name */
    public long f436651f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f436652g;

    /* renamed from: h, reason: collision with root package name */
    public int f436653h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f436654i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f436655m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f436656n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f436657o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.i2)) {
            return false;
        }
        pj4.i2 i2Var = (pj4.i2) fVar;
        return n51.f.a(this.f76494x2de60e5e, i2Var.f76494x2de60e5e) && n51.f.a(this.f436649d, i2Var.f436649d) && n51.f.a(this.f436650e, i2Var.f436650e) && n51.f.a(java.lang.Long.valueOf(this.f436651f), java.lang.Long.valueOf(i2Var.f436651f)) && n51.f.a(this.f436652g, i2Var.f436652g) && n51.f.a(java.lang.Integer.valueOf(this.f436653h), java.lang.Integer.valueOf(i2Var.f436653h)) && n51.f.a(this.f436654i, i2Var.f436654i) && n51.f.a(this.f436655m, i2Var.f436655m) && n51.f.a(this.f436656n, i2Var.f436656n) && n51.f.a(this.f436657o, i2Var.f436657o);
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
            java.lang.String str = this.f436649d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f436650e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f436651f);
            java.lang.String str3 = this.f436652g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f436653h);
            java.lang.String str4 = this.f436654i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f436655m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f436656n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f436657o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str8 = this.f436649d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f436650e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int h17 = i18 + b36.f.h(4, this.f436651f);
            java.lang.String str10 = this.f436652g;
            if (str10 != null) {
                h17 += b36.f.j(5, str10);
            }
            int e17 = h17 + b36.f.e(6, this.f436653h);
            java.lang.String str11 = this.f436654i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f436655m;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f436656n;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f436657o;
            return str14 != null ? e17 + b36.f.j(10, str14) : e17;
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
        pj4.i2 i2Var = (pj4.i2) objArr[1];
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
                    i2Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                i2Var.f436649d = aVar2.k(intValue);
                return 0;
            case 3:
                i2Var.f436650e = aVar2.k(intValue);
                return 0;
            case 4:
                i2Var.f436651f = aVar2.i(intValue);
                return 0;
            case 5:
                i2Var.f436652g = aVar2.k(intValue);
                return 0;
            case 6:
                i2Var.f436653h = aVar2.g(intValue);
                return 0;
            case 7:
                i2Var.f436654i = aVar2.k(intValue);
                return 0;
            case 8:
                i2Var.f436655m = aVar2.k(intValue);
                return 0;
            case 9:
                i2Var.f436656n = aVar2.k(intValue);
                return 0;
            case 10:
                i2Var.f436657o = aVar2.k(intValue);
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
            eVar.d(jSONObject, "tag", this.f436649d, false);
            eVar.d(jSONObject, "source_id", this.f436650e, false);
            eVar.d(jSONObject, "card_key", java.lang.Long.valueOf(this.f436651f), false);
            eVar.d(jSONObject, "status_id", this.f436652g, false);
            eVar.d(jSONObject, "modify_count", java.lang.Integer.valueOf(this.f436653h), false);
            eVar.d(jSONObject, "to_enc_username", this.f436654i, false);
            eVar.d(jSONObject, "to_hash_username", this.f436655m, false);
            eVar.d(jSONObject, "client_msg_id", this.f436656n, false);
            eVar.d(jSONObject, "session_id", this.f436657o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
