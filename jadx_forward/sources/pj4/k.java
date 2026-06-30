package pj4;

/* loaded from: classes2.dex */
public class k extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f436680d;

    /* renamed from: e, reason: collision with root package name */
    public int f436681e;

    /* renamed from: f, reason: collision with root package name */
    public long f436682f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f436683g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436684h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f436685i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.k)) {
            return false;
        }
        pj4.k kVar = (pj4.k) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f436680d), java.lang.Integer.valueOf(kVar.f436680d)) && n51.f.a(java.lang.Integer.valueOf(this.f436681e), java.lang.Integer.valueOf(kVar.f436681e)) && n51.f.a(java.lang.Long.valueOf(this.f436682f), java.lang.Long.valueOf(kVar.f436682f)) && n51.f.a(this.f436683g, kVar.f436683g) && n51.f.a(this.f436684h, kVar.f436684h) && n51.f.a(this.f436685i, kVar.f436685i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(2, this.f436680d);
            fVar.e(3, this.f436681e);
            fVar.h(4, this.f436682f);
            java.lang.String str = this.f436683g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f436684h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f436685i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(2, this.f436680d) + 0 + b36.f.e(3, this.f436681e) + b36.f.h(4, this.f436682f);
            java.lang.String str3 = this.f436683g;
            if (str3 != null) {
                e17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f436684h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f436685i;
            return gVar2 != null ? e17 + b36.f.b(7, gVar2) : e17;
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
        pj4.k kVar = (pj4.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 2:
                kVar.f436680d = aVar2.g(intValue);
                return 0;
            case 3:
                kVar.f436681e = aVar2.g(intValue);
                return 0;
            case 4:
                kVar.f436682f = aVar2.i(intValue);
                return 0;
            case 5:
                kVar.f436683g = aVar2.k(intValue);
                return 0;
            case 6:
                kVar.f436684h = aVar2.k(intValue);
                return 0;
            case 7:
                kVar.f436685i = aVar2.d(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f436680d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "sequence", valueOf, false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f436681e), false);
            eVar.d(jSONObject, "amt", java.lang.Long.valueOf(this.f436682f), false);
            eVar.d(jSONObject, "comment_id", this.f436683g, false);
            eVar.d(jSONObject, "wishing", this.f436684h, false);
            eVar.d(jSONObject, "Cover", this.f436685i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
