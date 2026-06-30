package r45;

/* loaded from: classes4.dex */
public class r40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f466050d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f466051e;

    /* renamed from: f, reason: collision with root package name */
    public int f466052f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f466053g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r40)) {
            return false;
        }
        r45.r40 r40Var = (r45.r40) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f466050d), java.lang.Integer.valueOf(r40Var.f466050d)) && n51.f.a(this.f466051e, r40Var.f466051e) && n51.f.a(java.lang.Integer.valueOf(this.f466052f), java.lang.Integer.valueOf(r40Var.f466052f)) && n51.f.a(this.f466053g, r40Var.f466053g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f466050d);
            r45.cu5 cu5Var = this.f466051e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f466051e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f466052f);
            r45.cu5 cu5Var2 = this.f466053g;
            if (cu5Var2 != null) {
                fVar.i(4, cu5Var2.mo75928xcd1e8d8());
                this.f466053g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f466050d) + 0;
            r45.cu5 cu5Var3 = this.f466051e;
            if (cu5Var3 != null) {
                e17 += b36.f.i(2, cu5Var3.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(3, this.f466052f);
            r45.cu5 cu5Var4 = this.f466053g;
            return cu5Var4 != null ? e18 + b36.f.i(4, cu5Var4.mo75928xcd1e8d8()) : e18;
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
        r45.r40 r40Var = (r45.r40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r40Var.f466050d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.cu5 cu5Var5 = new r45.cu5();
                if (bArr != null && bArr.length > 0) {
                    cu5Var5.b(bArr);
                }
                r40Var.f466051e = cu5Var5;
            }
            return 0;
        }
        if (intValue == 3) {
            r40Var.f466052f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.cu5 cu5Var6 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var6.b(bArr2);
            }
            r40Var.f466053g = cu5Var6;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f466050d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "OperationType", valueOf, false);
            eVar.d(jSONObject, "OperationInfo", this.f466051e, false);
            eVar.d(jSONObject, "OperationContentLength", java.lang.Integer.valueOf(this.f466052f), false);
            eVar.d(jSONObject, "ExtOperationInfo", this.f466053g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
