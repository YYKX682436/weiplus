package r45;

/* loaded from: classes4.dex */
public class sc4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467157d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467158e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f467159f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public long f467160g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sc4)) {
            return false;
        }
        r45.sc4 sc4Var = (r45.sc4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467157d), java.lang.Integer.valueOf(sc4Var.f467157d)) && n51.f.a(this.f467158e, sc4Var.f467158e) && n51.f.a(this.f467159f, sc4Var.f467159f) && n51.f.a(java.lang.Long.valueOf(this.f467160g), java.lang.Long.valueOf(sc4Var.f467160g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467159f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467157d);
            java.lang.String str = this.f467158e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            fVar.h(4, this.f467160g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467157d) + 0;
            java.lang.String str2 = this.f467158e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, linkedList) + b36.f.h(4, this.f467160g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.sc4 sc4Var = (r45.sc4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sc4Var.f467157d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            sc4Var.f467158e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            sc4Var.f467160g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.pq5 pq5Var = new r45.pq5();
            if (bArr2 != null && bArr2.length > 0) {
                pq5Var.mo11468x92b714fd(bArr2);
            }
            sc4Var.f467159f.add(pq5Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f467157d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "businessId", valueOf, false);
            eVar.d(jSONObject, "collectKey", this.f467158e, false);
            eVar.d(jSONObject, "itemDataList", this.f467159f, false);
            eVar.d(jSONObject, "collectStartTimeMs", java.lang.Long.valueOf(this.f467160g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
