package r45;

/* loaded from: classes4.dex */
public class c66 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452870d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f452871e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c66)) {
            return false;
        }
        r45.c66 c66Var = (r45.c66) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452870d), java.lang.Integer.valueOf(c66Var.f452870d)) && n51.f.a(this.f452871e, c66Var.f452871e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452870d);
            fVar.g(2, 8, this.f452871e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f452870d) + 0 + b36.f.g(2, 8, this.f452871e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f452871e.clear();
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
        r45.c66 c66Var = (r45.c66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c66Var.f452870d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.b66 b66Var = new r45.b66();
            if (bArr2 != null && bArr2.length > 0) {
                b66Var.mo11468x92b714fd(bArr2);
            }
            c66Var.f452871e.add(b66Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f452870d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Count", valueOf, false);
            eVar.d(jSONObject, "Item", this.f452871e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
