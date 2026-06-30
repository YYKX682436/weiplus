package r45;

/* loaded from: classes2.dex */
public class qh4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465528d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465529e;

    /* renamed from: f, reason: collision with root package name */
    public long f465530f;

    /* renamed from: g, reason: collision with root package name */
    public long f465531g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465532h;

    /* renamed from: i, reason: collision with root package name */
    public int f465533i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qh4)) {
            return false;
        }
        r45.qh4 qh4Var = (r45.qh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465528d), java.lang.Integer.valueOf(qh4Var.f465528d)) && n51.f.a(this.f465529e, qh4Var.f465529e) && n51.f.a(java.lang.Long.valueOf(this.f465530f), java.lang.Long.valueOf(qh4Var.f465530f)) && n51.f.a(java.lang.Long.valueOf(this.f465531g), java.lang.Long.valueOf(qh4Var.f465531g)) && n51.f.a(this.f465532h, qh4Var.f465532h) && n51.f.a(java.lang.Integer.valueOf(this.f465533i), java.lang.Integer.valueOf(qh4Var.f465533i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465528d);
            java.lang.String str = this.f465529e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f465530f);
            fVar.h(4, this.f465531g);
            java.lang.String str2 = this.f465532h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f465533i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465528d) + 0;
            java.lang.String str3 = this.f465529e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int h17 = e17 + b36.f.h(3, this.f465530f) + b36.f.h(4, this.f465531g);
            java.lang.String str4 = this.f465532h;
            if (str4 != null) {
                h17 += b36.f.j(5, str4);
            }
            return h17 + b36.f.e(6, this.f465533i);
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
        r45.qh4 qh4Var = (r45.qh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qh4Var.f465528d = aVar2.g(intValue);
                return 0;
            case 2:
                qh4Var.f465529e = aVar2.k(intValue);
                return 0;
            case 3:
                qh4Var.f465530f = aVar2.i(intValue);
                return 0;
            case 4:
                qh4Var.f465531g = aVar2.i(intValue);
                return 0;
            case 5:
                qh4Var.f465532h = aVar2.k(intValue);
                return 0;
            case 6:
                qh4Var.f465533i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f465528d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, valueOf, false);
            eVar.d(jSONObject, "Json", this.f465529e, false);
            eVar.d(jSONObject, "CacheSecond", java.lang.Long.valueOf(this.f465530f), false);
            eVar.d(jSONObject, "LastCacheSecond", java.lang.Long.valueOf(this.f465531g), false);
            eVar.d(jSONObject, "SearchID", this.f465532h, false);
            eVar.d(jSONObject, "Type", java.lang.Integer.valueOf(this.f465533i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
