package pj4;

/* loaded from: classes9.dex */
public class u1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f436837d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.v1 f436838e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.s1 f436839f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.u1)) {
            return false;
        }
        pj4.u1 u1Var = (pj4.u1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f436837d), java.lang.Integer.valueOf(u1Var.f436837d)) && n51.f.a(this.f436838e, u1Var.f436838e) && n51.f.a(this.f436839f, u1Var.f436839f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f436837d);
            pj4.v1 v1Var = this.f436838e;
            if (v1Var != null) {
                fVar.i(2, v1Var.mo75928xcd1e8d8());
                this.f436838e.mo75956x3d5d1f78(fVar);
            }
            pj4.s1 s1Var = this.f436839f;
            if (s1Var != null) {
                fVar.i(3, s1Var.mo75928xcd1e8d8());
                this.f436839f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f436837d) + 0;
            pj4.v1 v1Var2 = this.f436838e;
            if (v1Var2 != null) {
                e17 += b36.f.i(2, v1Var2.mo75928xcd1e8d8());
            }
            pj4.s1 s1Var2 = this.f436839f;
            return s1Var2 != null ? e17 + b36.f.i(3, s1Var2.mo75928xcd1e8d8()) : e17;
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
        pj4.u1 u1Var = (pj4.u1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u1Var.f436837d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                pj4.v1 v1Var3 = new pj4.v1();
                if (bArr != null && bArr.length > 0) {
                    v1Var3.mo11468x92b714fd(bArr);
                }
                u1Var.f436838e = v1Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            pj4.s1 s1Var3 = new pj4.s1();
            if (bArr2 != null && bArr2.length > 0) {
                s1Var3.mo11468x92b714fd(bArr2);
            }
            u1Var.f436839f = s1Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f436837d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "type", valueOf, false);
            eVar.d(jSONObject, "music", this.f436838e, false);
            eVar.d(jSONObject, "finder", this.f436839f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
