package r45;

/* loaded from: classes8.dex */
public class q55 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465228d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f465229e;

    /* renamed from: f, reason: collision with root package name */
    public int f465230f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q55)) {
            return false;
        }
        r45.q55 q55Var = (r45.q55) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465228d), java.lang.Integer.valueOf(q55Var.f465228d)) && n51.f.a(this.f465229e, q55Var.f465229e) && n51.f.a(java.lang.Integer.valueOf(this.f465230f), java.lang.Integer.valueOf(q55Var.f465230f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465228d);
            r45.cu5 cu5Var = this.f465229e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f465229e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f465230f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465228d) + 0;
            r45.cu5 cu5Var2 = this.f465229e;
            if (cu5Var2 != null) {
                e17 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(3, this.f465230f);
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
        r45.q55 q55Var = (r45.q55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q55Var.f465228d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            q55Var.f465230f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            q55Var.f465229e = cu5Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f465228d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "PatternVersion", valueOf, false);
            eVar.d(jSONObject, "Sign", this.f465229e, false);
            eVar.d(jSONObject, "LockStatus", java.lang.Integer.valueOf(this.f465230f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
