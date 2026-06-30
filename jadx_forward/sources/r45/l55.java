package r45;

/* loaded from: classes9.dex */
public class l55 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460685d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460686e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460687f;

    /* renamed from: g, reason: collision with root package name */
    public long f460688g;

    /* renamed from: h, reason: collision with root package name */
    public int f460689h;

    /* renamed from: i, reason: collision with root package name */
    public long f460690i;

    /* renamed from: m, reason: collision with root package name */
    public int f460691m;

    /* renamed from: n, reason: collision with root package name */
    public int f460692n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l55)) {
            return false;
        }
        r45.l55 l55Var = (r45.l55) fVar;
        return n51.f.a(this.f460685d, l55Var.f460685d) && n51.f.a(this.f460686e, l55Var.f460686e) && n51.f.a(this.f460687f, l55Var.f460687f) && n51.f.a(java.lang.Long.valueOf(this.f460688g), java.lang.Long.valueOf(l55Var.f460688g)) && n51.f.a(java.lang.Integer.valueOf(this.f460689h), java.lang.Integer.valueOf(l55Var.f460689h)) && n51.f.a(java.lang.Long.valueOf(this.f460690i), java.lang.Long.valueOf(l55Var.f460690i)) && n51.f.a(java.lang.Integer.valueOf(this.f460691m), java.lang.Integer.valueOf(l55Var.f460691m)) && n51.f.a(java.lang.Integer.valueOf(this.f460692n), java.lang.Integer.valueOf(l55Var.f460692n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460685d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460686e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460687f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f460688g);
            fVar.e(5, this.f460689h);
            fVar.h(6, this.f460690i);
            fVar.e(7, this.f460691m);
            fVar.e(8, this.f460692n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f460685d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f460686e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f460687f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f460688g) + b36.f.e(5, this.f460689h) + b36.f.h(6, this.f460690i) + b36.f.e(7, this.f460691m) + b36.f.e(8, this.f460692n);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.l55 l55Var = (r45.l55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l55Var.f460685d = aVar2.k(intValue);
                return 0;
            case 2:
                l55Var.f460686e = aVar2.k(intValue);
                return 0;
            case 3:
                l55Var.f460687f = aVar2.k(intValue);
                return 0;
            case 4:
                l55Var.f460688g = aVar2.i(intValue);
                return 0;
            case 5:
                l55Var.f460689h = aVar2.g(intValue);
                return 0;
            case 6:
                l55Var.f460690i = aVar2.i(intValue);
                return 0;
            case 7:
                l55Var.f460691m = aVar2.g(intValue);
                return 0;
            case 8:
                l55Var.f460692n = aVar2.g(intValue);
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
            java.lang.String str = this.f460685d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "fromUser", str, false);
            eVar.d(jSONObject, "pattedUser", this.f460686e, false);
            eVar.d(jSONObject, "template", this.f460687f, false);
            eVar.d(jSONObject, "createTime", java.lang.Long.valueOf(this.f460688g), false);
            eVar.d(jSONObject, "readStatus", java.lang.Integer.valueOf(this.f460689h), false);
            eVar.d(jSONObject, "svrId", java.lang.Long.valueOf(this.f460690i), false);
            eVar.d(jSONObject, "showModifyTip", java.lang.Integer.valueOf(this.f460691m), false);
            eVar.d(jSONObject, "isNewPatMsg", java.lang.Integer.valueOf(this.f460692n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
