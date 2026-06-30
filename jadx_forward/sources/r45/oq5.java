package r45;

/* loaded from: classes4.dex */
public class oq5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463983d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463984e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463985f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f463986g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f463987h;

    /* renamed from: i, reason: collision with root package name */
    public int f463988i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oq5)) {
            return false;
        }
        r45.oq5 oq5Var = (r45.oq5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463983d), java.lang.Integer.valueOf(oq5Var.f463983d)) && n51.f.a(this.f463984e, oq5Var.f463984e) && n51.f.a(this.f463985f, oq5Var.f463985f) && n51.f.a(java.lang.Boolean.valueOf(this.f463986g), java.lang.Boolean.valueOf(oq5Var.f463986g)) && n51.f.a(java.lang.Integer.valueOf(this.f463987h), java.lang.Integer.valueOf(oq5Var.f463987h)) && n51.f.a(java.lang.Integer.valueOf(this.f463988i), java.lang.Integer.valueOf(oq5Var.f463988i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463983d);
            java.lang.String str = this.f463984e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f463985f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f463986g);
            fVar.e(5, this.f463987h);
            fVar.e(6, this.f463988i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f463983d) + 0;
            java.lang.String str3 = this.f463984e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f463985f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.a(4, this.f463986g) + b36.f.e(5, this.f463987h) + b36.f.e(6, this.f463988i);
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
        r45.oq5 oq5Var = (r45.oq5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oq5Var.f463983d = aVar2.g(intValue);
                return 0;
            case 2:
                oq5Var.f463984e = aVar2.k(intValue);
                return 0;
            case 3:
                oq5Var.f463985f = aVar2.k(intValue);
                return 0;
            case 4:
                oq5Var.f463986g = aVar2.c(intValue);
                return 0;
            case 5:
                oq5Var.f463987h = aVar2.g(intValue);
                return 0;
            case 6:
                oq5Var.f463988i = aVar2.g(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f463983d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "item_type", valueOf, false);
            eVar.d(jSONObject, ya.b.f77482xa8eebdc7, this.f463984e, false);
            eVar.d(jSONObject, "event_id", this.f463985f, false);
            eVar.d(jSONObject, "need_report", java.lang.Boolean.valueOf(this.f463986g), false);
            eVar.d(jSONObject, "interval_ms", java.lang.Integer.valueOf(this.f463987h), false);
            eVar.d(jSONObject, "middle_action_type", java.lang.Integer.valueOf(this.f463988i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
