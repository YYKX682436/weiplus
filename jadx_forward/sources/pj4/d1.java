package pj4;

/* loaded from: classes4.dex */
public class d1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f436552d;

    /* renamed from: e, reason: collision with root package name */
    public long f436553e;

    /* renamed from: f, reason: collision with root package name */
    public long f436554f;

    /* renamed from: g, reason: collision with root package name */
    public int f436555g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f436556h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.d1)) {
            return false;
        }
        pj4.d1 d1Var = (pj4.d1) fVar;
        return n51.f.a(this.f76494x2de60e5e, d1Var.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f436552d), java.lang.Long.valueOf(d1Var.f436552d)) && n51.f.a(java.lang.Long.valueOf(this.f436553e), java.lang.Long.valueOf(d1Var.f436553e)) && n51.f.a(java.lang.Long.valueOf(this.f436554f), java.lang.Long.valueOf(d1Var.f436554f)) && n51.f.a(java.lang.Integer.valueOf(this.f436555g), java.lang.Integer.valueOf(d1Var.f436555g)) && n51.f.a(this.f436556h, d1Var.f436556h);
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
            fVar.h(2, this.f436552d);
            fVar.h(3, this.f436553e);
            fVar.h(4, this.f436554f);
            fVar.e(5, this.f436555g);
            fVar.g(6, 8, this.f436556h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f436552d) + b36.f.h(3, this.f436553e) + b36.f.h(4, this.f436554f) + b36.f.e(5, this.f436555g) + b36.f.g(6, 8, this.f436556h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f436556h.clear();
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
        pj4.d1 d1Var = (pj4.d1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    d1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                d1Var.f436552d = aVar2.i(intValue);
                return 0;
            case 3:
                d1Var.f436553e = aVar2.i(intValue);
                return 0;
            case 4:
                d1Var.f436554f = aVar2.i(intValue);
                return 0;
            case 5:
                d1Var.f436555g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    pj4.h0 h0Var = new pj4.h0();
                    if (bArr3 != null && bArr3.length > 0) {
                        h0Var.mo11468x92b714fd(bArr3);
                    }
                    d1Var.f436556h.add(h0Var);
                }
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
            eVar.d(jSONObject, "key", java.lang.Long.valueOf(this.f436552d), false);
            eVar.d(jSONObject, "cover_agenda_key", java.lang.Long.valueOf(this.f436553e), false);
            eVar.d(jSONObject, "keyValueConfigKey", java.lang.Long.valueOf(this.f436554f), false);
            eVar.d(jSONObject, "flag", java.lang.Integer.valueOf(this.f436555g), false);
            eVar.d(jSONObject, "icon_config_id_keys", this.f436556h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
