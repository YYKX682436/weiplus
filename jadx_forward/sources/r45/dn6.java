package r45;

/* loaded from: classes8.dex */
public class dn6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454136d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454137e;

    /* renamed from: f, reason: collision with root package name */
    public long f454138f;

    /* renamed from: g, reason: collision with root package name */
    public int f454139g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454140h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454141i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454142m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dn6)) {
            return false;
        }
        r45.dn6 dn6Var = (r45.dn6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454136d), java.lang.Integer.valueOf(dn6Var.f454136d)) && n51.f.a(this.f454137e, dn6Var.f454137e) && n51.f.a(java.lang.Long.valueOf(this.f454138f), java.lang.Long.valueOf(dn6Var.f454138f)) && n51.f.a(java.lang.Integer.valueOf(this.f454139g), java.lang.Integer.valueOf(dn6Var.f454139g)) && n51.f.a(this.f454140h, dn6Var.f454140h) && n51.f.a(this.f454141i, dn6Var.f454141i) && n51.f.a(this.f454142m, dn6Var.f454142m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454136d);
            java.lang.String str = this.f454137e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f454138f);
            fVar.e(4, this.f454139g);
            java.lang.String str2 = this.f454140h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f454141i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454142m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454136d) + 0;
            java.lang.String str4 = this.f454137e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int h17 = e17 + b36.f.h(3, this.f454138f) + b36.f.e(4, this.f454139g);
            java.lang.String str5 = this.f454140h;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f454141i;
            if (str6 != null) {
                h17 += b36.f.j(6, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454142m;
            return gVar2 != null ? h17 + b36.f.b(7, gVar2) : h17;
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
        r45.dn6 dn6Var = (r45.dn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dn6Var.f454136d = aVar2.g(intValue);
                return 0;
            case 2:
                dn6Var.f454137e = aVar2.k(intValue);
                return 0;
            case 3:
                dn6Var.f454138f = aVar2.i(intValue);
                return 0;
            case 4:
                dn6Var.f454139g = aVar2.g(intValue);
                return 0;
            case 5:
                dn6Var.f454140h = aVar2.k(intValue);
                return 0;
            case 6:
                dn6Var.f454141i = aVar2.k(intValue);
                return 0;
            case 7:
                dn6Var.f454142m = aVar2.d(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f454136d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Id", valueOf, false);
            eVar.d(jSONObject, "UserName", this.f454137e, false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f454138f), false);
            eVar.d(jSONObject, "MsgType", java.lang.Integer.valueOf(this.f454139g), false);
            eVar.d(jSONObject, "MsgSummary", this.f454140h, false);
            eVar.d(jSONObject, "MsgUserName", this.f454141i, false);
            eVar.d(jSONObject, "ClientBuf", this.f454142m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
