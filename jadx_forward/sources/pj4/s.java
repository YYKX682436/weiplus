package pj4;

/* loaded from: classes2.dex */
public class s extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f436809d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f436810e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f436811f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.s)) {
            return false;
        }
        pj4.s sVar = (pj4.s) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f436809d), java.lang.Long.valueOf(sVar.f436809d)) && n51.f.a(java.lang.Boolean.valueOf(this.f436810e), java.lang.Boolean.valueOf(sVar.f436810e)) && n51.f.a(java.lang.Boolean.valueOf(this.f436811f), java.lang.Boolean.valueOf(sVar.f436811f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f436809d);
            fVar.a(2, this.f436810e);
            fVar.a(3, this.f436811f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f436809d) + 0 + b36.f.a(2, this.f436810e) + b36.f.a(3, this.f436811f);
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
        pj4.s sVar = (pj4.s) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sVar.f436809d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            sVar.f436810e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        sVar.f436811f = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f436809d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "version", valueOf, false);
            eVar.d(jSONObject, "hb_is_empty", java.lang.Boolean.valueOf(this.f436810e), false);
            eVar.d(jSONObject, "self_recv_hb", java.lang.Boolean.valueOf(this.f436811f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
