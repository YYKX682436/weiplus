package r45;

/* loaded from: classes8.dex */
public class cw5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453403d;

    /* renamed from: e, reason: collision with root package name */
    public long f453404e;

    /* renamed from: f, reason: collision with root package name */
    public int f453405f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f453406g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cw5)) {
            return false;
        }
        r45.cw5 cw5Var = (r45.cw5) fVar;
        return n51.f.a(this.f453403d, cw5Var.f453403d) && n51.f.a(java.lang.Long.valueOf(this.f453404e), java.lang.Long.valueOf(cw5Var.f453404e)) && n51.f.a(java.lang.Integer.valueOf(this.f453405f), java.lang.Integer.valueOf(cw5Var.f453405f)) && n51.f.a(java.lang.Boolean.valueOf(this.f453406g), java.lang.Boolean.valueOf(cw5Var.f453406g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453403d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f453404e);
            fVar.e(3, this.f453405f);
            fVar.a(4, this.f453406g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f453403d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f453404e) + b36.f.e(3, this.f453405f) + b36.f.a(4, this.f453406g);
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
        r45.cw5 cw5Var = (r45.cw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cw5Var.f453403d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            cw5Var.f453404e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            cw5Var.f453405f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        cw5Var.f453406g = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f453403d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "SearchPrefix", str, false);
            eVar.d(jSONObject, "SearchTimestampMs", java.lang.Long.valueOf(this.f453404e), false);
            eVar.d(jSONObject, "ClickType", java.lang.Integer.valueOf(this.f453405f), false);
            eVar.d(jSONObject, "IsLocalClick", java.lang.Boolean.valueOf(this.f453406g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
