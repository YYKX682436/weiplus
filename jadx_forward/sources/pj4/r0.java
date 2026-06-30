package pj4;

/* loaded from: classes7.dex */
public class r0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f436805d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.w f436806e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.r0)) {
            return false;
        }
        pj4.r0 r0Var = (pj4.r0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f436805d), java.lang.Integer.valueOf(r0Var.f436805d)) && n51.f.a(this.f436806e, r0Var.f436806e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f436805d);
            pj4.w wVar = this.f436806e;
            if (wVar != null) {
                fVar.i(2, wVar.mo75928xcd1e8d8());
                this.f436806e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f436805d) + 0;
            pj4.w wVar2 = this.f436806e;
            return wVar2 != null ? e17 + b36.f.i(2, wVar2.mo75928xcd1e8d8()) : e17;
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
        pj4.r0 r0Var = (pj4.r0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r0Var.f436805d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            pj4.w wVar3 = new pj4.w();
            if (bArr != null && bArr.length > 0) {
                wVar3.mo11468x92b714fd(bArr);
            }
            r0Var.f436806e = wVar3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f436805d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "action", valueOf, false);
            eVar.d(jSONObject, "resSetTextStatus", this.f436806e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
