package pj4;

/* loaded from: classes8.dex */
public class i0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f436643d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436644e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f436645f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.i0)) {
            return false;
        }
        pj4.i0 i0Var = (pj4.i0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f436643d), java.lang.Integer.valueOf(i0Var.f436643d)) && n51.f.a(this.f436644e, i0Var.f436644e) && n51.f.a(this.f436645f, i0Var.f436645f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436645f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f436643d);
            java.lang.String str = this.f436644e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f436643d) + 0;
            java.lang.String str2 = this.f436644e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, linkedList);
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
        pj4.i0 i0Var = (pj4.i0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i0Var.f436643d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            i0Var.f436644e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            pj4.j0 j0Var = new pj4.j0();
            if (bArr2 != null && bArr2.length > 0) {
                j0Var.mo11468x92b714fd(bArr2);
            }
            i0Var.f436645f.add(j0Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f436643d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "elementType", valueOf, false);
            eVar.d(jSONObject, "elementKey", this.f436644e, false);
            eVar.d(jSONObject, "jumpInfos", this.f436645f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
