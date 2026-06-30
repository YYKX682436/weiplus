package r45;

/* loaded from: classes15.dex */
public class x56 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471328d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471329e;

    /* renamed from: f, reason: collision with root package name */
    public long f471330f;

    /* renamed from: g, reason: collision with root package name */
    public int f471331g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471332h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471333i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471334m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471335n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x56)) {
            return false;
        }
        r45.x56 x56Var = (r45.x56) fVar;
        return n51.f.a(this.f471328d, x56Var.f471328d) && n51.f.a(this.f471329e, x56Var.f471329e) && n51.f.a(java.lang.Long.valueOf(this.f471330f), java.lang.Long.valueOf(x56Var.f471330f)) && n51.f.a(java.lang.Integer.valueOf(this.f471331g), java.lang.Integer.valueOf(x56Var.f471331g)) && n51.f.a(this.f471332h, x56Var.f471332h) && n51.f.a(this.f471333i, x56Var.f471333i) && n51.f.a(this.f471334m, x56Var.f471334m) && n51.f.a(this.f471335n, x56Var.f471335n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471328d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f471329e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f471330f);
            fVar.e(4, this.f471331g);
            java.lang.String str3 = this.f471332h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f471333i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f471334m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f471335n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f471328d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f471329e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int h17 = j17 + b36.f.h(3, this.f471330f) + b36.f.e(4, this.f471331g);
            java.lang.String str9 = this.f471332h;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f471333i;
            if (str10 != null) {
                h17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f471334m;
            if (str11 != null) {
                h17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f471335n;
            return str12 != null ? h17 + b36.f.j(8, str12) : h17;
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
        r45.x56 x56Var = (r45.x56) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x56Var.f471328d = aVar2.k(intValue);
                return 0;
            case 2:
                x56Var.f471329e = aVar2.k(intValue);
                return 0;
            case 3:
                x56Var.f471330f = aVar2.i(intValue);
                return 0;
            case 4:
                x56Var.f471331g = aVar2.g(intValue);
                return 0;
            case 5:
                x56Var.f471332h = aVar2.k(intValue);
                return 0;
            case 6:
                x56Var.f471333i = aVar2.k(intValue);
                return 0;
            case 7:
                x56Var.f471334m = aVar2.k(intValue);
                return 0;
            case 8:
                x56Var.f471335n = aVar2.k(intValue);
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
            java.lang.String str = this.f471328d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, dm.i4.f66865x76d1ec5a, str, false);
            eVar.d(jSONObject, "wording", this.f471329e, false);
            eVar.d(jSONObject, "category", java.lang.Long.valueOf(this.f471330f), false);
            eVar.d(jSONObject, "actionType", java.lang.Integer.valueOf(this.f471331g), false);
            eVar.d(jSONObject, "url", this.f471332h, false);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f471333i, false);
            eVar.d(jSONObject, "subTitle", this.f471334m, false);
            eVar.d(jSONObject, "icon", this.f471335n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
