package r45;

/* loaded from: classes4.dex */
public class o61 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f463506d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f463507e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qm1 f463508f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f463509g;

    /* renamed from: h, reason: collision with root package name */
    public long f463510h;

    /* renamed from: i, reason: collision with root package name */
    public long f463511i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463512m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o61)) {
            return false;
        }
        r45.o61 o61Var = (r45.o61) fVar;
        return n51.f.a(this.f76494x2de60e5e, o61Var.f76494x2de60e5e) && n51.f.a(this.f463506d, o61Var.f463506d) && n51.f.a(this.f463507e, o61Var.f463507e) && n51.f.a(this.f463508f, o61Var.f463508f) && n51.f.a(this.f463509g, o61Var.f463509g) && n51.f.a(java.lang.Long.valueOf(this.f463510h), java.lang.Long.valueOf(o61Var.f463510h)) && n51.f.a(java.lang.Long.valueOf(this.f463511i), java.lang.Long.valueOf(o61Var.f463511i)) && n51.f.a(this.f463512m, o61Var.f463512m);
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
            r45.kv0 kv0Var = this.f463506d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f463506d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f463507e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.qm1 qm1Var = this.f463508f;
            if (qm1Var != null) {
                fVar.i(4, qm1Var.mo75928xcd1e8d8());
                this.f463508f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f463509g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            fVar.h(6, this.f463510h);
            fVar.h(7, this.f463511i);
            java.lang.String str = this.f463512m;
            if (str != null) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f463506d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f463507e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            r45.qm1 qm1Var2 = this.f463508f;
            if (qm1Var2 != null) {
                i18 += b36.f.i(4, qm1Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f463509g;
            if (gVar4 != null) {
                i18 += b36.f.b(5, gVar4);
            }
            int h17 = i18 + b36.f.h(6, this.f463510h) + b36.f.h(7, this.f463511i);
            java.lang.String str2 = this.f463512m;
            return str2 != null ? h17 + b36.f.j(8, str2) : h17;
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
        r45.o61 o61Var = (r45.o61) objArr[1];
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
                    o61Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    o61Var.f463506d = kv0Var3;
                }
                return 0;
            case 3:
                o61Var.f463507e = aVar2.d(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.qm1 qm1Var3 = new r45.qm1();
                    if (bArr3 != null && bArr3.length > 0) {
                        qm1Var3.mo11468x92b714fd(bArr3);
                    }
                    o61Var.f463508f = qm1Var3;
                }
                return 0;
            case 5:
                o61Var.f463509g = aVar2.d(intValue);
                return 0;
            case 6:
                o61Var.f463510h = aVar2.i(intValue);
                return 0;
            case 7:
                o61Var.f463511i = aVar2.i(intValue);
                return 0;
            case 8:
                o61Var.f463512m = aVar2.k(intValue);
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
            eVar.d(jSONObject, "finder_basereq", this.f463506d, false);
            eVar.d(jSONObject, "live_cookies", this.f463507e, false);
            eVar.d(jSONObject, "box_id", this.f463508f, false);
            eVar.d(jSONObject, "last_buffer", this.f463509g, false);
            eVar.d(jSONObject, "object_id", java.lang.Long.valueOf(this.f463510h), false);
            eVar.d(jSONObject, "live_id", java.lang.Long.valueOf(this.f463511i), false);
            eVar.d(jSONObject, "finder_username", this.f463512m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
