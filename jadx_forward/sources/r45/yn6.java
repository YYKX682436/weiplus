package r45;

/* loaded from: classes11.dex */
public class yn6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472776d;

    /* renamed from: e, reason: collision with root package name */
    public long f472777e;

    /* renamed from: f, reason: collision with root package name */
    public long f472778f;

    /* renamed from: g, reason: collision with root package name */
    public long f472779g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yn6)) {
            return false;
        }
        r45.yn6 yn6Var = (r45.yn6) fVar;
        return n51.f.a(this.f472776d, yn6Var.f472776d) && n51.f.a(java.lang.Long.valueOf(this.f472777e), java.lang.Long.valueOf(yn6Var.f472777e)) && n51.f.a(java.lang.Long.valueOf(this.f472778f), java.lang.Long.valueOf(yn6Var.f472778f)) && n51.f.a(java.lang.Long.valueOf(this.f472779g), java.lang.Long.valueOf(yn6Var.f472779g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472776d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f472777e);
            fVar.h(3, this.f472778f);
            fVar.h(4, this.f472779g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f472776d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f472777e) + b36.f.h(3, this.f472778f) + b36.f.h(4, this.f472779g);
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
        r45.yn6 yn6Var = (r45.yn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yn6Var.f472776d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yn6Var.f472777e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            yn6Var.f472778f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        yn6Var.f472779g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f472776d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "mediaId", str, false);
            eVar.d(jSONObject, "preloadOffset", java.lang.Long.valueOf(this.f472777e), false);
            eVar.d(jSONObject, "preloadPercent", java.lang.Long.valueOf(this.f472778f), false);
            eVar.d(jSONObject, "videoSize", java.lang.Long.valueOf(this.f472779g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
