package r45;

/* loaded from: classes4.dex */
public class h40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f457349d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457350e;

    /* renamed from: f, reason: collision with root package name */
    public int f457351f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h40)) {
            return false;
        }
        r45.h40 h40Var = (r45.h40) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f457349d), java.lang.Boolean.valueOf(h40Var.f457349d)) && n51.f.a(this.f457350e, h40Var.f457350e) && n51.f.a(java.lang.Integer.valueOf(this.f457351f), java.lang.Integer.valueOf(h40Var.f457351f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f457349d);
            java.lang.String str = this.f457350e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f457351f);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f457349d) + 0;
            java.lang.String str2 = this.f457350e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            return a17 + b36.f.e(3, this.f457351f);
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
        r45.h40 h40Var = (r45.h40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h40Var.f457349d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            h40Var.f457350e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        h40Var.f457351f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f457349d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "SugStickBottom", valueOf, false);
            eVar.d(jSONObject, "SugBlockTitle", this.f457350e, false);
            eVar.d(jSONObject, "RecommendNum", java.lang.Integer.valueOf(this.f457351f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
