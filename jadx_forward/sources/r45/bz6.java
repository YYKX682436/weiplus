package r45;

/* loaded from: classes4.dex */
public class bz6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452715d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fv f452716e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fv f452717f;

    /* renamed from: g, reason: collision with root package name */
    public int f452718g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bz6)) {
            return false;
        }
        r45.bz6 bz6Var = (r45.bz6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452715d), java.lang.Integer.valueOf(bz6Var.f452715d)) && n51.f.a(this.f452716e, bz6Var.f452716e) && n51.f.a(this.f452717f, bz6Var.f452717f) && n51.f.a(java.lang.Integer.valueOf(this.f452718g), java.lang.Integer.valueOf(bz6Var.f452718g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452715d);
            r45.fv fvVar = this.f452716e;
            if (fvVar != null) {
                fVar.i(4, fvVar.mo75928xcd1e8d8());
                this.f452716e.mo75956x3d5d1f78(fVar);
            }
            r45.fv fvVar2 = this.f452717f;
            if (fvVar2 != null) {
                fVar.i(5, fvVar2.mo75928xcd1e8d8());
                this.f452717f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f452718g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452715d) + 0;
            r45.fv fvVar3 = this.f452716e;
            if (fvVar3 != null) {
                e17 += b36.f.i(4, fvVar3.mo75928xcd1e8d8());
            }
            r45.fv fvVar4 = this.f452717f;
            if (fvVar4 != null) {
                e17 += b36.f.i(5, fvVar4.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(6, this.f452718g);
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
        r45.bz6 bz6Var = (r45.bz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bz6Var.f452715d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.fv fvVar5 = new r45.fv();
                if (bArr != null && bArr.length > 0) {
                    fvVar5.mo11468x92b714fd(bArr);
                }
                bz6Var.f452716e = fvVar5;
            }
            return 0;
        }
        if (intValue != 5) {
            if (intValue != 6) {
                return -1;
            }
            bz6Var.f452718g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.fv fvVar6 = new r45.fv();
            if (bArr2 != null && bArr2.length > 0) {
                fvVar6.mo11468x92b714fd(bArr2);
            }
            bz6Var.f452717f = fvVar6;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f452715d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "CdnScene", valueOf, false);
            eVar.d(jSONObject, "CtnInfo", this.f452716e, false);
            eVar.d(jSONObject, "MpInfo", this.f452717f, false);
            eVar.d(jSONObject, "CdnSourceType", java.lang.Integer.valueOf(this.f452718g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
