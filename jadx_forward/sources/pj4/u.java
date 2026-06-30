package pj4;

/* loaded from: classes8.dex */
public class u extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436833d;

    /* renamed from: e, reason: collision with root package name */
    public long f436834e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436835f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.u)) {
            return false;
        }
        pj4.u uVar = (pj4.u) fVar;
        return n51.f.a(this.f436833d, uVar.f436833d) && n51.f.a(java.lang.Long.valueOf(this.f436834e), java.lang.Long.valueOf(uVar.f436834e)) && n51.f.a(this.f436835f, uVar.f436835f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436833d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f436834e);
            java.lang.String str2 = this.f436835f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f436833d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f436834e);
            java.lang.String str4 = this.f436835f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        pj4.u uVar = (pj4.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            uVar.f436833d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            uVar.f436834e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        uVar.f436835f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f436833d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "iconId", str, false);
            eVar.d(jSONObject, "postTime", java.lang.Long.valueOf(this.f436834e), false);
            eVar.d(jSONObject, "statusDesc", this.f436835f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
