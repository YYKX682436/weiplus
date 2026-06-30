package r45;

/* loaded from: classes12.dex */
public class jo0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.di6 f459519d;

    /* renamed from: e, reason: collision with root package name */
    public int f459520e;

    /* renamed from: f, reason: collision with root package name */
    public long f459521f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jo0)) {
            return false;
        }
        r45.jo0 jo0Var = (r45.jo0) fVar;
        return n51.f.a(this.f459519d, jo0Var.f459519d) && n51.f.a(java.lang.Integer.valueOf(this.f459520e), java.lang.Integer.valueOf(jo0Var.f459520e)) && n51.f.a(java.lang.Long.valueOf(this.f459521f), java.lang.Long.valueOf(jo0Var.f459521f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.di6 di6Var = this.f459519d;
            if (di6Var != null) {
                fVar.i(1, di6Var.mo75928xcd1e8d8());
                this.f459519d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f459520e);
            fVar.h(3, this.f459521f);
            return 0;
        }
        if (i17 == 1) {
            r45.di6 di6Var2 = this.f459519d;
            return (di6Var2 != null ? 0 + b36.f.i(1, di6Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f459520e) + b36.f.h(3, this.f459521f);
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
        r45.jo0 jo0Var = (r45.jo0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                jo0Var.f459520e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            jo0Var.f459521f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.di6 di6Var3 = new r45.di6();
            if (bArr != null && bArr.length > 0) {
                di6Var3.mo11468x92b714fd(bArr);
            }
            jo0Var.f459519d = di6Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.di6 di6Var = this.f459519d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Item", di6Var, false);
            eVar.d(jSONObject, "Index", java.lang.Integer.valueOf(this.f459520e), false);
            eVar.d(jSONObject, "SearchId", java.lang.Long.valueOf(this.f459521f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
