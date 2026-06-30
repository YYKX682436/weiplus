package r45;

/* loaded from: classes4.dex */
public class rq5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f466657d;

    /* renamed from: e, reason: collision with root package name */
    public int f466658e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f466659f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public long f466660g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rq5)) {
            return false;
        }
        r45.rq5 rq5Var = (r45.rq5) fVar;
        return n51.f.a(this.f76492x92037252, rq5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f466657d), java.lang.Integer.valueOf(rq5Var.f466657d)) && n51.f.a(java.lang.Integer.valueOf(this.f466658e), java.lang.Integer.valueOf(rq5Var.f466658e)) && n51.f.a(this.f466659f, rq5Var.f466659f) && n51.f.a(java.lang.Long.valueOf(this.f466660g), java.lang.Long.valueOf(rq5Var.f466660g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466659f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f466657d);
            fVar.e(3, this.f466658e);
            fVar.g(4, 8, linkedList);
            fVar.h(5, this.f466660g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f466657d) + b36.f.e(3, this.f466658e) + b36.f.g(4, 8, linkedList) + b36.f.h(5, this.f466660g);
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
        r45.rq5 rq5Var = (r45.rq5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                rq5Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            rq5Var.f466657d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            rq5Var.f466658e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            rq5Var.f466660g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.oq5 oq5Var = new r45.oq5();
            if (bArr3 != null && bArr3.length > 0) {
                oq5Var.mo11468x92b714fd(bArr3);
            }
            rq5Var.f466659f.add(oq5Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "report_aggregate_interval_ms", java.lang.Integer.valueOf(this.f466657d), false);
            eVar.d(jSONObject, "report_aggregate_count", java.lang.Integer.valueOf(this.f466658e), false);
            eVar.d(jSONObject, "item_confs", this.f466659f, false);
            eVar.d(jSONObject, "item_confs_version", java.lang.Long.valueOf(this.f466660g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
