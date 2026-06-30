package r45;

/* loaded from: classes4.dex */
public class wc4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f470599d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f470600e;

    /* renamed from: f, reason: collision with root package name */
    public int f470601f;

    /* renamed from: g, reason: collision with root package name */
    public int f470602g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wc4)) {
            return false;
        }
        r45.wc4 wc4Var = (r45.wc4) fVar;
        return n51.f.a(this.f470599d, wc4Var.f470599d) && n51.f.a(java.lang.Integer.valueOf(this.f470600e), java.lang.Integer.valueOf(wc4Var.f470600e)) && n51.f.a(java.lang.Integer.valueOf(this.f470601f), java.lang.Integer.valueOf(wc4Var.f470601f)) && n51.f.a(java.lang.Integer.valueOf(this.f470602g), java.lang.Integer.valueOf(wc4Var.f470602g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470599d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f470600e);
            fVar.e(3, this.f470601f);
            fVar.e(4, this.f470602g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f470600e) + b36.f.e(3, this.f470601f) + b36.f.e(4, this.f470602g);
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
        r45.wc4 wc4Var = (r45.wc4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                wc4Var.f470600e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                wc4Var.f470601f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            wc4Var.f470602g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.re0 re0Var = new r45.re0();
            if (bArr2 != null && bArr2.length > 0) {
                re0Var.mo11468x92b714fd(bArr2);
            }
            wc4Var.f470599d.add(re0Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.LinkedList linkedList = this.f470599d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "items", linkedList, false);
            eVar.d(jSONObject, "update_time", java.lang.Integer.valueOf(this.f470600e), false);
            eVar.d(jSONObject, "expire_time", java.lang.Integer.valueOf(this.f470601f), false);
            eVar.d(jSONObject, "max_dict_size", java.lang.Integer.valueOf(this.f470602g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
