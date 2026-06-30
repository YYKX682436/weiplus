package r45;

/* loaded from: classes2.dex */
public class aw4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451828d;

    /* renamed from: e, reason: collision with root package name */
    public int f451829e;

    /* renamed from: f, reason: collision with root package name */
    public int f451830f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vs4 f451831g;

    /* renamed from: h, reason: collision with root package name */
    public r45.xt2 f451832h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aw4)) {
            return false;
        }
        r45.aw4 aw4Var = (r45.aw4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451828d), java.lang.Integer.valueOf(aw4Var.f451828d)) && n51.f.a(java.lang.Integer.valueOf(this.f451829e), java.lang.Integer.valueOf(aw4Var.f451829e)) && n51.f.a(java.lang.Integer.valueOf(this.f451830f), java.lang.Integer.valueOf(aw4Var.f451830f)) && n51.f.a(this.f451831g, aw4Var.f451831g) && n51.f.a(this.f451832h, aw4Var.f451832h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451828d);
            fVar.e(2, this.f451829e);
            fVar.e(3, this.f451830f);
            r45.vs4 vs4Var = this.f451831g;
            if (vs4Var != null) {
                fVar.i(4, vs4Var.mo75928xcd1e8d8());
                this.f451831g.mo75956x3d5d1f78(fVar);
            }
            r45.xt2 xt2Var = this.f451832h;
            if (xt2Var != null) {
                fVar.i(5, xt2Var.mo75928xcd1e8d8());
                this.f451832h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f451828d) + 0 + b36.f.e(2, this.f451829e) + b36.f.e(3, this.f451830f);
            r45.vs4 vs4Var2 = this.f451831g;
            if (vs4Var2 != null) {
                e17 += b36.f.i(4, vs4Var2.mo75928xcd1e8d8());
            }
            r45.xt2 xt2Var2 = this.f451832h;
            return xt2Var2 != null ? e17 + b36.f.i(5, xt2Var2.mo75928xcd1e8d8()) : e17;
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
        r45.aw4 aw4Var = (r45.aw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aw4Var.f451828d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            aw4Var.f451829e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            aw4Var.f451830f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.vs4 vs4Var3 = new r45.vs4();
                if (bArr != null && bArr.length > 0) {
                    vs4Var3.mo11468x92b714fd(bArr);
                }
                aw4Var.f451831g = vs4Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.xt2 xt2Var3 = new r45.xt2();
            if (bArr2 != null && bArr2.length > 0) {
                xt2Var3.mo11468x92b714fd(bArr2);
            }
            aw4Var.f451832h = xt2Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f451828d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Type", valueOf, false);
            eVar.d(jSONObject, "StartTime", java.lang.Integer.valueOf(this.f451829e), false);
            eVar.d(jSONObject, "EndTime", java.lang.Integer.valueOf(this.f451830f), false);
            eVar.d(jSONObject, "Music", this.f451831g, false);
            eVar.d(jSONObject, "Finder", this.f451832h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
