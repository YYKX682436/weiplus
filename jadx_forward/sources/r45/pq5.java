package r45;

/* loaded from: classes14.dex */
public class pq5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.nq5 f464846d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464847e;

    /* renamed from: f, reason: collision with root package name */
    public r45.uq5 f464848f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464849g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464850h;

    /* renamed from: i, reason: collision with root package name */
    public int f464851i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pq5)) {
            return false;
        }
        r45.pq5 pq5Var = (r45.pq5) fVar;
        return n51.f.a(this.f464846d, pq5Var.f464846d) && n51.f.a(this.f464847e, pq5Var.f464847e) && n51.f.a(this.f464848f, pq5Var.f464848f) && n51.f.a(this.f464849g, pq5Var.f464849g) && n51.f.a(this.f464850h, pq5Var.f464850h) && n51.f.a(java.lang.Integer.valueOf(this.f464851i), java.lang.Integer.valueOf(pq5Var.f464851i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.nq5 nq5Var = this.f464846d;
            if (nq5Var != null) {
                fVar.i(1, nq5Var.mo75928xcd1e8d8());
                this.f464846d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f464847e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.uq5 uq5Var = this.f464848f;
            if (uq5Var != null) {
                fVar.i(3, uq5Var.mo75928xcd1e8d8());
                this.f464848f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f464849g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f464850h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f464851i);
            return 0;
        }
        if (i17 == 1) {
            r45.nq5 nq5Var2 = this.f464846d;
            int i18 = nq5Var2 != null ? 0 + b36.f.i(1, nq5Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f464847e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            r45.uq5 uq5Var2 = this.f464848f;
            if (uq5Var2 != null) {
                i18 += b36.f.i(3, uq5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f464849g;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f464850h;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            return i18 + b36.f.e(6, this.f464851i);
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
        r45.pq5 pq5Var = (r45.pq5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.nq5 nq5Var3 = new r45.nq5();
                    if (bArr != null && bArr.length > 0) {
                        nq5Var3.mo11468x92b714fd(bArr);
                    }
                    pq5Var.f464846d = nq5Var3;
                }
                return 0;
            case 2:
                pq5Var.f464847e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.uq5 uq5Var3 = new r45.uq5();
                    if (bArr2 != null && bArr2.length > 0) {
                        uq5Var3.mo11468x92b714fd(bArr2);
                    }
                    pq5Var.f464848f = uq5Var3;
                }
                return 0;
            case 4:
                pq5Var.f464849g = aVar2.k(intValue);
                return 0;
            case 5:
                pq5Var.f464850h = aVar2.k(intValue);
                return 0;
            case 6:
                pq5Var.f464851i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.nq5 nq5Var = this.f464846d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "item", nq5Var, false);
            eVar.d(jSONObject, "event_id", this.f464847e, false);
            eVar.d(jSONObject, "event_time", this.f464848f, false);
            eVar.d(jSONObject, "data_json", this.f464849g, false);
            eVar.d(jSONObject, "local_item_request_id", this.f464850h, false);
            eVar.d(jSONObject, "item_retry_cnt", java.lang.Integer.valueOf(this.f464851i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
