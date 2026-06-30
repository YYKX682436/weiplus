package r45;

/* loaded from: classes11.dex */
public class xy5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472128d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472129e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472130f;

    /* renamed from: g, reason: collision with root package name */
    public long f472131g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xy5)) {
            return false;
        }
        r45.xy5 xy5Var = (r45.xy5) fVar;
        return n51.f.a(this.f472128d, xy5Var.f472128d) && n51.f.a(this.f472129e, xy5Var.f472129e) && n51.f.a(this.f472130f, xy5Var.f472130f) && n51.f.a(java.lang.Long.valueOf(this.f472131g), java.lang.Long.valueOf(xy5Var.f472131g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472128d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472129e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472130f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f472131g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f472128d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f472129e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f472130f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f472131g);
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
        r45.xy5 xy5Var = (r45.xy5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xy5Var.f472128d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            xy5Var.f472129e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            xy5Var.f472130f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        xy5Var.f472131g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f472128d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str, false);
            eVar.d(jSONObject, "fileExt", this.f472129e, false);
            eVar.d(jSONObject, "md5", this.f472130f, false);
            eVar.d(jSONObject, "totalLen", java.lang.Long.valueOf(this.f472131g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
