package pj4;

/* loaded from: classes8.dex */
public class f1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f436572d;

    /* renamed from: e, reason: collision with root package name */
    public long f436573e;

    /* renamed from: f, reason: collision with root package name */
    public long f436574f;

    /* renamed from: g, reason: collision with root package name */
    public long f436575g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f436576h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.f1)) {
            return false;
        }
        pj4.f1 f1Var = (pj4.f1) fVar;
        return n51.f.a(this.f76494x2de60e5e, f1Var.f76494x2de60e5e) && n51.f.a(this.f436572d, f1Var.f436572d) && n51.f.a(java.lang.Long.valueOf(this.f436573e), java.lang.Long.valueOf(f1Var.f436573e)) && n51.f.a(java.lang.Long.valueOf(this.f436574f), java.lang.Long.valueOf(f1Var.f436574f)) && n51.f.a(java.lang.Long.valueOf(this.f436575g), java.lang.Long.valueOf(f1Var.f436575g)) && n51.f.a(this.f436576h, f1Var.f436576h);
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
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f436572d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.h(3, this.f436573e);
            fVar.h(4, this.f436574f);
            fVar.h(5, this.f436575g);
            fVar.g(6, 1, this.f436576h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f436572d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.h(3, this.f436573e) + b36.f.h(4, this.f436574f) + b36.f.h(5, this.f436575g) + b36.f.g(6, 1, this.f436576h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f436576h.clear();
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
        pj4.f1 f1Var = (pj4.f1) objArr[1];
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
                    f1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                f1Var.f436572d = aVar2.d(intValue);
                return 0;
            case 3:
                f1Var.f436573e = aVar2.i(intValue);
                return 0;
            case 4:
                f1Var.f436574f = aVar2.i(intValue);
                return 0;
            case 5:
                f1Var.f436575g = aVar2.i(intValue);
                return 0;
            case 6:
                f1Var.f436576h.add(aVar2.k(intValue));
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
            eVar.d(jSONObject, "context", this.f436572d, false);
            eVar.d(jSONObject, "op", java.lang.Long.valueOf(this.f436573e), false);
            eVar.d(jSONObject, "start_key", java.lang.Long.valueOf(this.f436574f), false);
            eVar.d(jSONObject, "limit", java.lang.Long.valueOf(this.f436575g), false);
            eVar.d(jSONObject, "statusIds", this.f436576h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
