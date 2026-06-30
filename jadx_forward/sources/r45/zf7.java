package r45;

/* loaded from: classes4.dex */
public class zf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473521d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f473522e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f473523f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zf7)) {
            return false;
        }
        r45.zf7 zf7Var = (r45.zf7) fVar;
        return n51.f.a(this.f473521d, zf7Var.f473521d) && n51.f.a(this.f473522e, zf7Var.f473522e) && n51.f.a(java.lang.Integer.valueOf(this.f473523f), java.lang.Integer.valueOf(zf7Var.f473523f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473522e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473521d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f473523f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f473521d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f473523f);
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
        r45.zf7 zf7Var = (r45.zf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zf7Var.f473521d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            zf7Var.f473523f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.xf7 xf7Var = new r45.xf7();
            if (bArr2 != null && bArr2.length > 0) {
                xf7Var.mo11468x92b714fd(bArr2);
            }
            zf7Var.f473522e.add(xf7Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f473521d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, dm.i4.f66875xa013b0d5, str, false);
            eVar.d(jSONObject, "scope_item_list", this.f473522e, false);
            eVar.d(jSONObject, "update_time", java.lang.Integer.valueOf(this.f473523f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
