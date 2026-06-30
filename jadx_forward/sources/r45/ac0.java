package r45;

/* loaded from: classes8.dex */
public class ac0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f451445d;

    /* renamed from: e, reason: collision with root package name */
    public int f451446e;

    /* renamed from: f, reason: collision with root package name */
    public long f451447f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ac0)) {
            return false;
        }
        r45.ac0 ac0Var = (r45.ac0) fVar;
        return n51.f.a(this.f451445d, ac0Var.f451445d) && n51.f.a(java.lang.Integer.valueOf(this.f451446e), java.lang.Integer.valueOf(ac0Var.f451446e)) && n51.f.a(java.lang.Long.valueOf(this.f451447f), java.lang.Long.valueOf(ac0Var.f451447f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f451445d;
            if (du5Var != null) {
                fVar.i(1, du5Var.mo75928xcd1e8d8());
                this.f451445d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f451446e);
            fVar.h(3, this.f451447f);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var2 = this.f451445d;
            return (du5Var2 != null ? 0 + b36.f.i(1, du5Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451446e) + b36.f.h(3, this.f451447f);
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
        r45.ac0 ac0Var = (r45.ac0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                ac0Var.f451446e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            ac0Var.f451447f = aVar2.i(intValue);
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
            ac0Var.f451445d = du5Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.du5 du5Var = this.f451445d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "UserName", du5Var, false);
            eVar.d(jSONObject, "MaxMsgId", java.lang.Integer.valueOf(this.f451446e), false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f451447f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
