package r45;

/* loaded from: classes8.dex */
public class xb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f471474d;

    /* renamed from: e, reason: collision with root package name */
    public int f471475e;

    /* renamed from: f, reason: collision with root package name */
    public int f471476f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xb0)) {
            return false;
        }
        r45.xb0 xb0Var = (r45.xb0) fVar;
        return n51.f.a(this.f471474d, xb0Var.f471474d) && n51.f.a(java.lang.Integer.valueOf(this.f471475e), java.lang.Integer.valueOf(xb0Var.f471475e)) && n51.f.a(java.lang.Integer.valueOf(this.f471476f), java.lang.Integer.valueOf(xb0Var.f471476f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f471474d;
            if (du5Var != null) {
                fVar.i(1, du5Var.mo75928xcd1e8d8());
                this.f471474d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f471475e);
            fVar.e(3, this.f471476f);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var2 = this.f471474d;
            return (du5Var2 != null ? 0 + b36.f.i(1, du5Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f471475e) + b36.f.e(3, this.f471476f);
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
        r45.xb0 xb0Var = (r45.xb0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                xb0Var.f471475e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            xb0Var.f471476f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.du5 du5Var3 = new r45.du5();
            if (bArr != null && bArr.length > 0) {
                du5Var3.b(bArr);
            }
            xb0Var.f471474d = du5Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.du5 du5Var = this.f471474d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "UserName", du5Var, false);
            eVar.d(jSONObject, "DeleteContactScene", java.lang.Integer.valueOf(this.f471475e), false);
            eVar.d(jSONObject, "IsRetainChatHistory", java.lang.Integer.valueOf(this.f471476f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
