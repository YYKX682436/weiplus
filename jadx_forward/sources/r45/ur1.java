package r45;

/* loaded from: classes4.dex */
public class ur1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f469120d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469121e;

    /* renamed from: f, reason: collision with root package name */
    public long f469122f;

    /* renamed from: g, reason: collision with root package name */
    public long f469123g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f469124h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469125i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ur1)) {
            return false;
        }
        r45.ur1 ur1Var = (r45.ur1) fVar;
        return n51.f.a(this.f76494x2de60e5e, ur1Var.f76494x2de60e5e) && n51.f.a(this.f469120d, ur1Var.f469120d) && n51.f.a(this.f469121e, ur1Var.f469121e) && n51.f.a(java.lang.Long.valueOf(this.f469122f), java.lang.Long.valueOf(ur1Var.f469122f)) && n51.f.a(java.lang.Long.valueOf(this.f469123g), java.lang.Long.valueOf(ur1Var.f469123g)) && n51.f.a(this.f469124h, ur1Var.f469124h) && n51.f.a(this.f469125i, ur1Var.f469125i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469124h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.kv0 kv0Var = this.f469120d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f469120d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469121e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.h(4, this.f469122f);
            fVar.h(5, this.f469123g);
            fVar.g(6, 8, linkedList);
            java.lang.String str = this.f469125i;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f469120d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469121e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            int h17 = i18 + b36.f.h(4, this.f469122f) + b36.f.h(5, this.f469123g) + b36.f.g(6, 8, linkedList);
            java.lang.String str2 = this.f469125i;
            return str2 != null ? h17 + b36.f.j(7, str2) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.ur1 ur1Var = (r45.ur1) objArr[1];
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
                    ur1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr3);
                    }
                    ur1Var.f469120d = kv0Var3;
                }
                return 0;
            case 3:
                ur1Var.f469121e = aVar2.d(intValue);
                return 0;
            case 4:
                ur1Var.f469122f = aVar2.i(intValue);
                return 0;
            case 5:
                ur1Var.f469123g = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.tn tnVar = new r45.tn();
                    if (bArr4 != null && bArr4.length > 0) {
                        tnVar.mo11468x92b714fd(bArr4);
                    }
                    ur1Var.f469124h.add(tnVar);
                }
                return 0;
            case 7:
                ur1Var.f469125i = aVar2.k(intValue);
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
            eVar.d(jSONObject, "finder_basereq", this.f469120d, false);
            eVar.d(jSONObject, "live_cookies", this.f469121e, false);
            eVar.d(jSONObject, "object_id", java.lang.Long.valueOf(this.f469122f), false);
            eVar.d(jSONObject, "live_id", java.lang.Long.valueOf(this.f469123g), false);
            eVar.d(jSONObject, "box_list", this.f469124h, false);
            eVar.d(jSONObject, "finder_username", this.f469125i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
