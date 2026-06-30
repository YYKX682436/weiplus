package r45;

/* loaded from: classes11.dex */
public class fh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455871d;

    /* renamed from: e, reason: collision with root package name */
    public int f455872e;

    /* renamed from: f, reason: collision with root package name */
    public int f455873f;

    /* renamed from: g, reason: collision with root package name */
    public int f455874g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f455875h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f455876i;

    /* renamed from: m, reason: collision with root package name */
    public int f455877m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f455878n;

    /* renamed from: o, reason: collision with root package name */
    public int f455879o;

    /* renamed from: p, reason: collision with root package name */
    public int f455880p;

    /* renamed from: q, reason: collision with root package name */
    public int f455881q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fh0)) {
            return false;
        }
        r45.fh0 fh0Var = (r45.fh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455871d), java.lang.Integer.valueOf(fh0Var.f455871d)) && n51.f.a(java.lang.Integer.valueOf(this.f455872e), java.lang.Integer.valueOf(fh0Var.f455872e)) && n51.f.a(java.lang.Integer.valueOf(this.f455873f), java.lang.Integer.valueOf(fh0Var.f455873f)) && n51.f.a(java.lang.Integer.valueOf(this.f455874g), java.lang.Integer.valueOf(fh0Var.f455874g)) && n51.f.a(java.lang.Boolean.valueOf(this.f455875h), java.lang.Boolean.valueOf(fh0Var.f455875h)) && n51.f.a(java.lang.Boolean.valueOf(this.f455876i), java.lang.Boolean.valueOf(fh0Var.f455876i)) && n51.f.a(java.lang.Integer.valueOf(this.f455877m), java.lang.Integer.valueOf(fh0Var.f455877m)) && n51.f.a(java.lang.Boolean.valueOf(this.f455878n), java.lang.Boolean.valueOf(fh0Var.f455878n)) && n51.f.a(java.lang.Integer.valueOf(this.f455879o), java.lang.Integer.valueOf(fh0Var.f455879o)) && n51.f.a(java.lang.Integer.valueOf(this.f455880p), java.lang.Integer.valueOf(fh0Var.f455880p)) && n51.f.a(java.lang.Integer.valueOf(this.f455881q), java.lang.Integer.valueOf(fh0Var.f455881q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455871d);
            fVar.e(2, this.f455872e);
            fVar.e(3, this.f455873f);
            fVar.e(4, this.f455874g);
            fVar.a(6, this.f455875h);
            fVar.a(7, this.f455876i);
            fVar.e(8, this.f455877m);
            fVar.a(9, this.f455878n);
            fVar.e(10, this.f455879o);
            fVar.e(11, this.f455880p);
            fVar.e(12, this.f455881q);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f455871d) + 0 + b36.f.e(2, this.f455872e) + b36.f.e(3, this.f455873f) + b36.f.e(4, this.f455874g) + b36.f.a(6, this.f455875h) + b36.f.a(7, this.f455876i) + b36.f.e(8, this.f455877m) + b36.f.a(9, this.f455878n) + b36.f.e(10, this.f455879o) + b36.f.e(11, this.f455880p) + b36.f.e(12, this.f455881q);
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
        r45.fh0 fh0Var = (r45.fh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fh0Var.f455871d = aVar2.g(intValue);
                return 0;
            case 2:
                fh0Var.f455872e = aVar2.g(intValue);
                return 0;
            case 3:
                fh0Var.f455873f = aVar2.g(intValue);
                return 0;
            case 4:
                fh0Var.f455874g = aVar2.g(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                fh0Var.f455875h = aVar2.c(intValue);
                return 0;
            case 7:
                fh0Var.f455876i = aVar2.c(intValue);
                return 0;
            case 8:
                fh0Var.f455877m = aVar2.g(intValue);
                return 0;
            case 9:
                fh0Var.f455878n = aVar2.c(intValue);
                return 0;
            case 10:
                fh0Var.f455879o = aVar2.g(intValue);
                return 0;
            case 11:
                fh0Var.f455880p = aVar2.g(intValue);
                return 0;
            case 12:
                fh0Var.f455881q = aVar2.g(intValue);
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f455871d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "abstract_type", valueOf, false);
            eVar.d(jSONObject, "display_type", java.lang.Integer.valueOf(this.f455872e), false);
            eVar.d(jSONObject, "display_count", java.lang.Integer.valueOf(this.f455873f), false);
            eVar.d(jSONObject, "notify_keep_time", java.lang.Integer.valueOf(this.f455874g), false);
            eVar.d(jSONObject, "allow_notify_keep_for_android", java.lang.Boolean.valueOf(this.f455875h), false);
            eVar.d(jSONObject, "allow_notify_unpin", java.lang.Boolean.valueOf(this.f455876i), false);
            eVar.d(jSONObject, "notify_unpin_time", java.lang.Integer.valueOf(this.f455877m), false);
            eVar.d(jSONObject, "enable_notify_parity", java.lang.Boolean.valueOf(this.f455878n), false);
            eVar.d(jSONObject, "fold_type", java.lang.Integer.valueOf(this.f455879o), false);
            eVar.d(jSONObject, "weak_level_open", java.lang.Integer.valueOf(this.f455880p), false);
            eVar.d(jSONObject, "weak_level_v2_open", java.lang.Integer.valueOf(this.f455881q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
