package r45;

/* loaded from: classes4.dex */
public class rv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f466754d;

    /* renamed from: e, reason: collision with root package name */
    public long f466755e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f466756f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rv)) {
            return false;
        }
        r45.rv rvVar = (r45.rv) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f466754d), java.lang.Long.valueOf(rvVar.f466754d)) && n51.f.a(java.lang.Long.valueOf(this.f466755e), java.lang.Long.valueOf(rvVar.f466755e)) && n51.f.a(this.f466756f, rvVar.f466756f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466756f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f466754d);
            fVar.h(2, this.f466755e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f466754d) + 0 + b36.f.h(2, this.f466755e) + b36.f.g(3, 8, linkedList);
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
        r45.rv rvVar = (r45.rv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rvVar.f466754d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            rvVar.f466755e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.a14 a14Var = new r45.a14();
            if (bArr2 != null && bArr2.length > 0) {
                a14Var.mo11468x92b714fd(bArr2);
            }
            rvVar.f466756f.add(a14Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f466754d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "item_confs_version", valueOf, false);
            eVar.d(jSONObject, "last_get_time", java.lang.Long.valueOf(this.f466755e), false);
            eVar.d(jSONObject, "item_confs", this.f466756f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
