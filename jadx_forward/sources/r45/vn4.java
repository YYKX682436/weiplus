package r45;

/* loaded from: classes4.dex */
public class vn4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469929d;

    /* renamed from: e, reason: collision with root package name */
    public r45.un4 f469930e;

    /* renamed from: f, reason: collision with root package name */
    public int f469931f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vn4)) {
            return false;
        }
        r45.vn4 vn4Var = (r45.vn4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469929d), java.lang.Integer.valueOf(vn4Var.f469929d)) && n51.f.a(this.f469930e, vn4Var.f469930e) && n51.f.a(java.lang.Integer.valueOf(this.f469931f), java.lang.Integer.valueOf(vn4Var.f469931f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469929d);
            r45.un4 un4Var = this.f469930e;
            if (un4Var != null) {
                fVar.i(2, un4Var.mo75928xcd1e8d8());
                this.f469930e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f469931f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469929d) + 0;
            r45.un4 un4Var2 = this.f469930e;
            if (un4Var2 != null) {
                e17 += b36.f.i(2, un4Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(3, this.f469931f);
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
        r45.vn4 vn4Var = (r45.vn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vn4Var.f469929d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            vn4Var.f469931f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.un4 un4Var3 = new r45.un4();
            if (bArr != null && bArr.length > 0) {
                un4Var3.mo11468x92b714fd(bArr);
            }
            vn4Var.f469930e = un4Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f469929d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Ret", valueOf, false);
            eVar.d(jSONObject, "ModOperation", this.f469930e, false);
            eVar.d(jSONObject, "ResInfo", java.lang.Integer.valueOf(this.f469931f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
