package r45;

/* loaded from: classes2.dex */
public class kc7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460124d;

    /* renamed from: e, reason: collision with root package name */
    public int f460125e;

    /* renamed from: f, reason: collision with root package name */
    public int f460126f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kc7)) {
            return false;
        }
        r45.kc7 kc7Var = (r45.kc7) fVar;
        return n51.f.a(this.f76494x2de60e5e, kc7Var.f76494x2de60e5e) && n51.f.a(this.f460124d, kc7Var.f460124d) && n51.f.a(java.lang.Integer.valueOf(this.f460125e), java.lang.Integer.valueOf(kc7Var.f460125e)) && n51.f.a(java.lang.Integer.valueOf(this.f460126f), java.lang.Integer.valueOf(kc7Var.f460126f));
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
            java.lang.String str = this.f460124d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f460125e);
            fVar.e(4, this.f460126f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f460124d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f460125e) + b36.f.e(4, this.f460126f);
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
        r45.kc7 kc7Var = (r45.kc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                kc7Var.f460124d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                kc7Var.f460125e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            kc7Var.f460126f = aVar2.g(intValue);
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
            kc7Var.f76494x2de60e5e = heVar3;
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
            eVar.d(jSONObject, dm.i4.f66875xa013b0d5, this.f460124d, false);
            eVar.d(jSONObject, "last_update_time", java.lang.Integer.valueOf(this.f460125e), false);
            eVar.d(jSONObject, "record_count", java.lang.Integer.valueOf(this.f460126f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
