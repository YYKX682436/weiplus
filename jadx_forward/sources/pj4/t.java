package pj4;

/* loaded from: classes10.dex */
public class t extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f436821d;

    /* renamed from: e, reason: collision with root package name */
    public int f436822e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f436823f;

    /* renamed from: g, reason: collision with root package name */
    public int f436824g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436825h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f436826i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f436827m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.t)) {
            return false;
        }
        pj4.t tVar = (pj4.t) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f436821d), java.lang.Integer.valueOf(tVar.f436821d)) && n51.f.a(java.lang.Integer.valueOf(this.f436822e), java.lang.Integer.valueOf(tVar.f436822e)) && n51.f.a(java.lang.Boolean.valueOf(this.f436823f), java.lang.Boolean.valueOf(tVar.f436823f)) && n51.f.a(java.lang.Integer.valueOf(this.f436824g), java.lang.Integer.valueOf(tVar.f436824g)) && n51.f.a(this.f436825h, tVar.f436825h) && n51.f.a(this.f436826i, tVar.f436826i) && n51.f.a(java.lang.Boolean.valueOf(this.f436827m), java.lang.Boolean.valueOf(tVar.f436827m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f436821d);
            fVar.e(2, this.f436822e);
            fVar.a(3, this.f436823f);
            fVar.e(4, this.f436824g);
            java.lang.String str = this.f436825h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f436826i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.a(7, this.f436827m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f436821d) + 0 + b36.f.e(2, this.f436822e) + b36.f.a(3, this.f436823f) + b36.f.e(4, this.f436824g);
            java.lang.String str3 = this.f436825h;
            if (str3 != null) {
                e17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f436826i;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.a(7, this.f436827m);
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
        pj4.t tVar = (pj4.t) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tVar.f436821d = aVar2.g(intValue);
                return 0;
            case 2:
                tVar.f436822e = aVar2.g(intValue);
                return 0;
            case 3:
                tVar.f436823f = aVar2.c(intValue);
                return 0;
            case 4:
                tVar.f436824g = aVar2.g(intValue);
                return 0;
            case 5:
                tVar.f436825h = aVar2.k(intValue);
                return 0;
            case 6:
                tVar.f436826i = aVar2.k(intValue);
                return 0;
            case 7:
                tVar.f436827m = aVar2.c(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f436821d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "scaleType", valueOf, false);
            eVar.d(jSONObject, "pullDownScene", java.lang.Integer.valueOf(this.f436822e), false);
            eVar.d(jSONObject, "isPreviewVideo", java.lang.Boolean.valueOf(this.f436823f), false);
            eVar.d(jSONObject, "statusCreateTime", java.lang.Integer.valueOf(this.f436824g), false);
            eVar.d(jSONObject, "textStatusId", this.f436825h, false);
            eVar.d(jSONObject, "userName", this.f436826i, false);
            eVar.d(jSONObject, "isContextResumedOnInitPullDownView", java.lang.Boolean.valueOf(this.f436827m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
