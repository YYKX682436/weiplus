package r45;

/* loaded from: classes8.dex */
public class ez3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455372d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455373e;

    /* renamed from: f, reason: collision with root package name */
    public int f455374f;

    /* renamed from: g, reason: collision with root package name */
    public long f455375g;

    /* renamed from: h, reason: collision with root package name */
    public int f455376h;

    /* renamed from: i, reason: collision with root package name */
    public int f455377i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ez3)) {
            return false;
        }
        r45.ez3 ez3Var = (r45.ez3) fVar;
        return n51.f.a(this.f455372d, ez3Var.f455372d) && n51.f.a(this.f455373e, ez3Var.f455373e) && n51.f.a(java.lang.Integer.valueOf(this.f455374f), java.lang.Integer.valueOf(ez3Var.f455374f)) && n51.f.a(java.lang.Long.valueOf(this.f455375g), java.lang.Long.valueOf(ez3Var.f455375g)) && n51.f.a(java.lang.Integer.valueOf(this.f455376h), java.lang.Integer.valueOf(ez3Var.f455376h)) && n51.f.a(java.lang.Integer.valueOf(this.f455377i), java.lang.Integer.valueOf(ez3Var.f455377i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455372d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f455373e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f455374f);
            fVar.h(4, this.f455375g);
            fVar.e(5, this.f455376h);
            fVar.e(6, this.f455377i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f455372d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f455373e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f455374f) + b36.f.h(4, this.f455375g) + b36.f.e(5, this.f455376h) + b36.f.e(6, this.f455377i);
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
        r45.ez3 ez3Var = (r45.ez3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ez3Var.f455372d = aVar2.k(intValue);
                return 0;
            case 2:
                ez3Var.f455373e = aVar2.k(intValue);
                return 0;
            case 3:
                ez3Var.f455374f = aVar2.g(intValue);
                return 0;
            case 4:
                ez3Var.f455375g = aVar2.i(intValue);
                return 0;
            case 5:
                ez3Var.f455376h = aVar2.g(intValue);
                return 0;
            case 6:
                ez3Var.f455377i = aVar2.g(intValue);
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
            java.lang.String str = this.f455372d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "ImageId", str, false);
            eVar.d(jSONObject, "ArticleUrl", this.f455373e, false);
            eVar.d(jSONObject, "ItemShowType", java.lang.Integer.valueOf(this.f455374f), false);
            eVar.d(jSONObject, "Bizuin", java.lang.Long.valueOf(this.f455375g), false);
            eVar.d(jSONObject, "Mid", java.lang.Integer.valueOf(this.f455376h), false);
            eVar.d(jSONObject, "Idx", java.lang.Integer.valueOf(this.f455377i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
