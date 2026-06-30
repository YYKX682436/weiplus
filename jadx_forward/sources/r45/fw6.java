package r45;

/* loaded from: classes2.dex */
public class fw6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456192d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456193e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456194f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456195g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456196h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456197i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fw6)) {
            return false;
        }
        r45.fw6 fw6Var = (r45.fw6) fVar;
        return n51.f.a(this.f456192d, fw6Var.f456192d) && n51.f.a(this.f456193e, fw6Var.f456193e) && n51.f.a(this.f456194f, fw6Var.f456194f) && n51.f.a(this.f456195g, fw6Var.f456195g) && n51.f.a(this.f456196h, fw6Var.f456196h) && n51.f.a(this.f456197i, fw6Var.f456197i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456192d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456193e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f456194f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f456195g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f456196h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f456197i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f456192d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f456193e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f456194f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f456195g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f456196h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f456197i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        r45.fw6 fw6Var = (r45.fw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fw6Var.f456192d = aVar2.k(intValue);
                return 0;
            case 2:
                fw6Var.f456193e = aVar2.k(intValue);
                return 0;
            case 3:
                fw6Var.f456194f = aVar2.k(intValue);
                return 0;
            case 4:
                fw6Var.f456195g = aVar2.k(intValue);
                return 0;
            case 5:
                fw6Var.f456196h = aVar2.k(intValue);
                return 0;
            case 6:
                fw6Var.f456197i = aVar2.k(intValue);
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
            java.lang.String str = this.f456192d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "UserName", str, false);
            eVar.d(jSONObject, "MatchWord", this.f456193e, false);
            eVar.d(jSONObject, "NickName", this.f456194f, false);
            eVar.d(jSONObject, "Remark", this.f456195g, false);
            eVar.d(jSONObject, "Alias", this.f456196h, false);
            eVar.d(jSONObject, "Description", this.f456197i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
