package pj4;

/* loaded from: classes4.dex */
public class o extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436741d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f436742e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436743f;

    /* renamed from: g, reason: collision with root package name */
    public long f436744g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436745h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.o)) {
            return false;
        }
        pj4.o oVar = (pj4.o) fVar;
        return n51.f.a(this.f76494x2de60e5e, oVar.f76494x2de60e5e) && n51.f.a(this.f436741d, oVar.f436741d) && n51.f.a(this.f436742e, oVar.f436742e) && n51.f.a(this.f436743f, oVar.f436743f) && n51.f.a(java.lang.Long.valueOf(this.f436744g), java.lang.Long.valueOf(oVar.f436744g)) && n51.f.a(this.f436745h, oVar.f436745h);
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
            java.lang.String str = this.f436741d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f436742e);
            java.lang.String str2 = this.f436743f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f436744g);
            java.lang.String str3 = this.f436745h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f436741d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f436742e);
            java.lang.String str5 = this.f436743f;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            int h17 = g17 + b36.f.h(5, this.f436744g);
            java.lang.String str6 = this.f436745h;
            return str6 != null ? h17 + b36.f.j(6, str6) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f436742e.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        pj4.o oVar = (pj4.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    oVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                oVar.f436741d = aVar2.k(intValue);
                return 0;
            case 3:
                oVar.f436742e.add(aVar2.k(intValue));
                return 0;
            case 4:
                oVar.f436743f = aVar2.k(intValue);
                return 0;
            case 5:
                oVar.f436744g = aVar2.i(intValue);
                return 0;
            case 6:
                oVar.f436745h = aVar2.k(intValue);
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
            eVar.d(jSONObject, "text_status_ext_info", this.f436741d, false);
            eVar.d(jSONObject, "blacklist_usernames", this.f436742e, false);
            eVar.d(jSONObject, "text_status_id", this.f436743f, false);
            eVar.d(jSONObject, "mod_status_option", java.lang.Long.valueOf(this.f436744g), false);
            eVar.d(jSONObject, "private_info", this.f436745h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
