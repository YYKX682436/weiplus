package r45;

/* loaded from: classes8.dex */
public class fn6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456002d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bz2 f456003e;

    /* renamed from: f, reason: collision with root package name */
    public r45.f03 f456004f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vs2 f456005g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fn6)) {
            return false;
        }
        r45.fn6 fn6Var = (r45.fn6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456002d), java.lang.Integer.valueOf(fn6Var.f456002d)) && n51.f.a(this.f456003e, fn6Var.f456003e) && n51.f.a(this.f456004f, fn6Var.f456004f) && n51.f.a(this.f456005g, fn6Var.f456005g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456002d);
            r45.bz2 bz2Var = this.f456003e;
            if (bz2Var != null) {
                fVar.i(2, bz2Var.mo75928xcd1e8d8());
                this.f456003e.mo75956x3d5d1f78(fVar);
            }
            r45.f03 f03Var = this.f456004f;
            if (f03Var != null) {
                fVar.i(3, f03Var.mo75928xcd1e8d8());
                this.f456004f.mo75956x3d5d1f78(fVar);
            }
            r45.vs2 vs2Var = this.f456005g;
            if (vs2Var != null) {
                fVar.i(4, vs2Var.mo75928xcd1e8d8());
                this.f456005g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456002d) + 0;
            r45.bz2 bz2Var2 = this.f456003e;
            if (bz2Var2 != null) {
                e17 += b36.f.i(2, bz2Var2.mo75928xcd1e8d8());
            }
            r45.f03 f03Var2 = this.f456004f;
            if (f03Var2 != null) {
                e17 += b36.f.i(3, f03Var2.mo75928xcd1e8d8());
            }
            r45.vs2 vs2Var2 = this.f456005g;
            return vs2Var2 != null ? e17 + b36.f.i(4, vs2Var2.mo75928xcd1e8d8()) : e17;
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
        r45.fn6 fn6Var = (r45.fn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fn6Var.f456002d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.bz2 bz2Var3 = new r45.bz2();
                if (bArr != null && bArr.length > 0) {
                    bz2Var3.mo11468x92b714fd(bArr);
                }
                fn6Var.f456003e = bz2Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.f03 f03Var3 = new r45.f03();
                if (bArr2 != null && bArr2.length > 0) {
                    f03Var3.mo11468x92b714fd(bArr2);
                }
                fn6Var.f456004f = f03Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            r45.vs2 vs2Var3 = new r45.vs2();
            if (bArr3 != null && bArr3.length > 0) {
                vs2Var3.mo11468x92b714fd(bArr3);
            }
            fn6Var.f456005g = vs2Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f456002d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "category", valueOf, false);
            eVar.d(jSONObject, "tipsShowInfo", this.f456003e, false);
            eVar.d(jSONObject, "showInfo", this.f456004f, false);
            eVar.d(jSONObject, "ctrlInfo", this.f456005g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
