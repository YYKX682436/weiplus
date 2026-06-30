package r45;

/* loaded from: classes2.dex */
public class ht5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f457974d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457975e;

    /* renamed from: f, reason: collision with root package name */
    public int f457976f;

    /* renamed from: g, reason: collision with root package name */
    public int f457977g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ht5)) {
            return false;
        }
        r45.ht5 ht5Var = (r45.ht5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f457974d), java.lang.Long.valueOf(ht5Var.f457974d)) && n51.f.a(this.f457975e, ht5Var.f457975e) && n51.f.a(java.lang.Integer.valueOf(this.f457976f), java.lang.Integer.valueOf(ht5Var.f457976f)) && n51.f.a(java.lang.Integer.valueOf(this.f457977g), java.lang.Integer.valueOf(ht5Var.f457977g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f457974d);
            java.lang.String str = this.f457975e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f457976f);
            fVar.e(4, this.f457977g);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f457974d) + 0;
            java.lang.String str2 = this.f457975e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.e(3, this.f457976f) + b36.f.e(4, this.f457977g);
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
        r45.ht5 ht5Var = (r45.ht5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ht5Var.f457974d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            ht5Var.f457975e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ht5Var.f457976f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ht5Var.f457977g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f457974d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "FinderObjectId", valueOf, false);
            eVar.d(jSONObject, "FinderNonceId", this.f457975e, false);
            eVar.d(jSONObject, "StartTs", java.lang.Integer.valueOf(this.f457976f), false);
            eVar.d(jSONObject, "EndTs", java.lang.Integer.valueOf(this.f457977g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
