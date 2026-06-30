package pj4;

/* loaded from: classes8.dex */
public class b1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436525d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436526e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.m2 f436527f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.b1)) {
            return false;
        }
        pj4.b1 b1Var = (pj4.b1) fVar;
        return n51.f.a(this.f76494x2de60e5e, b1Var.f76494x2de60e5e) && n51.f.a(this.f436525d, b1Var.f436525d) && n51.f.a(this.f436526e, b1Var.f436526e) && n51.f.a(this.f436527f, b1Var.f436527f);
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
            java.lang.String str = this.f436525d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f436526e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            pj4.m2 m2Var = this.f436527f;
            if (m2Var != null) {
                fVar.i(4, m2Var.mo75928xcd1e8d8());
                this.f436527f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f436525d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f436526e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            pj4.m2 m2Var2 = this.f436527f;
            return m2Var2 != null ? i18 + b36.f.i(4, m2Var2.mo75928xcd1e8d8()) : i18;
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
        pj4.b1 b1Var = (pj4.b1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                b1Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            b1Var.f436525d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            b1Var.f436526e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            pj4.m2 m2Var3 = new pj4.m2();
            if (bArr2 != null && bArr2.length > 0) {
                m2Var3.mo11468x92b714fd(bArr2);
            }
            b1Var.f436527f = m2Var3;
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
            eVar.d(jSONObject, "url", this.f436525d, false);
            eVar.d(jSONObject, "status_signature", this.f436526e, false);
            eVar.d(jSONObject, "status_signature_ext_info", this.f436527f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
