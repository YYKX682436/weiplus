package r45;

/* loaded from: classes2.dex */
public class bf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452264d;

    /* renamed from: e, reason: collision with root package name */
    public int f452265e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452266f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452267g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452268h;

    /* renamed from: i, reason: collision with root package name */
    public int f452269i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f452270m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f452271n = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bf7)) {
            return false;
        }
        r45.bf7 bf7Var = (r45.bf7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452264d), java.lang.Integer.valueOf(bf7Var.f452264d)) && n51.f.a(java.lang.Integer.valueOf(this.f452265e), java.lang.Integer.valueOf(bf7Var.f452265e)) && n51.f.a(this.f452266f, bf7Var.f452266f) && n51.f.a(this.f452267g, bf7Var.f452267g) && n51.f.a(this.f452268h, bf7Var.f452268h) && n51.f.a(java.lang.Integer.valueOf(this.f452269i), java.lang.Integer.valueOf(bf7Var.f452269i)) && n51.f.a(java.lang.Boolean.valueOf(this.f452270m), java.lang.Boolean.valueOf(bf7Var.f452270m)) && n51.f.a(java.lang.Boolean.valueOf(this.f452271n), java.lang.Boolean.valueOf(bf7Var.f452271n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452264d);
            fVar.e(2, this.f452265e);
            java.lang.String str = this.f452266f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f452267g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f452268h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f452269i);
            fVar.a(7, this.f452270m);
            fVar.a(8, this.f452271n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452264d) + 0 + b36.f.e(2, this.f452265e);
            java.lang.String str4 = this.f452266f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f452267g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f452268h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f452269i) + b36.f.a(7, this.f452270m) + b36.f.a(8, this.f452271n);
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
        r45.bf7 bf7Var = (r45.bf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bf7Var.f452264d = aVar2.g(intValue);
                return 0;
            case 2:
                bf7Var.f452265e = aVar2.g(intValue);
                return 0;
            case 3:
                bf7Var.f452266f = aVar2.k(intValue);
                return 0;
            case 4:
                bf7Var.f452267g = aVar2.k(intValue);
                return 0;
            case 5:
                bf7Var.f452268h = aVar2.k(intValue);
                return 0;
            case 6:
                bf7Var.f452269i = aVar2.g(intValue);
                return 0;
            case 7:
                bf7Var.f452270m = aVar2.c(intValue);
                return 0;
            case 8:
                bf7Var.f452271n = aVar2.c(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f452264d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "h5_version", valueOf, false);
            eVar.d(jSONObject, "sub_type", java.lang.Integer.valueOf(this.f452265e), false);
            eVar.d(jSONObject, "session_id", this.f452266f, false);
            eVar.d(jSONObject, "keyword_id", this.f452267g, false);
            eVar.d(jSONObject, "wording_id", this.f452268h, false);
            eVar.d(jSONObject, "sug_pos", java.lang.Integer.valueOf(this.f452269i), false);
            eVar.d(jSONObject, "is_local_search", java.lang.Boolean.valueOf(this.f452270m), false);
            eVar.d(jSONObject, "no_history_save", java.lang.Boolean.valueOf(this.f452271n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
