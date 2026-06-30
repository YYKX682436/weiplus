package r45;

/* loaded from: classes4.dex */
public class sn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467383d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467384e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467385f;

    /* renamed from: g, reason: collision with root package name */
    public int f467386g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sn)) {
            return false;
        }
        r45.sn snVar = (r45.sn) fVar;
        return n51.f.a(this.f467383d, snVar.f467383d) && n51.f.a(this.f467384e, snVar.f467384e) && n51.f.a(this.f467385f, snVar.f467385f) && n51.f.a(java.lang.Integer.valueOf(this.f467386g), java.lang.Integer.valueOf(snVar.f467386g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467383d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467384e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f467385f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f467386g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f467383d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f467384e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f467385f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f467386g);
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
        r45.sn snVar = (r45.sn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            snVar.f467383d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            snVar.f467384e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            snVar.f467385f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        snVar.f467386g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f467383d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Query", str, false);
            eVar.d(jSONObject, "ContextId", this.f467384e, false);
            eVar.d(jSONObject, "Url", this.f467385f, false);
            eVar.d(jSONObject, "Type", java.lang.Integer.valueOf(this.f467386g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
