package pj4;

/* loaded from: classes2.dex */
public class r extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f436801d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.l f436802e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f436803f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f436804g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.r)) {
            return false;
        }
        pj4.r rVar = (pj4.r) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f436801d), java.lang.Long.valueOf(rVar.f436801d)) && n51.f.a(this.f436802e, rVar.f436802e) && n51.f.a(this.f436803f, rVar.f436803f) && n51.f.a(this.f436804g, rVar.f436804g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436804g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f436801d);
            pj4.l lVar = this.f436802e;
            if (lVar != null) {
                fVar.i(2, lVar.mo75928xcd1e8d8());
                this.f436802e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 1, this.f436803f);
            fVar.g(4, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f436801d) + 0;
            pj4.l lVar2 = this.f436802e;
            if (lVar2 != null) {
                h17 += b36.f.i(2, lVar2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.g(3, 1, this.f436803f) + b36.f.g(4, 2, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f436803f.clear();
            linkedList.clear();
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
        pj4.r rVar = (pj4.r) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rVar.f436801d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                rVar.f436803f.add(aVar2.k(intValue));
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            rVar.f436804g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            pj4.l lVar3 = new pj4.l();
            if (bArr2 != null && bArr2.length > 0) {
                lVar3.mo11468x92b714fd(bArr2);
            }
            rVar.f436802e = lVar3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f436801d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "version", valueOf, false);
            eVar.d(jSONObject, "hb_status", this.f436802e, false);
            eVar.d(jSONObject, "whitelist_usernames", this.f436803f, false);
            eVar.d(jSONObject, "whitelist_labels", this.f436804g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
