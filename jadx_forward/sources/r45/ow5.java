package r45;

/* loaded from: classes8.dex */
public class ow5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464114d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464115e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464116f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464117g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464118h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464119i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ow5)) {
            return false;
        }
        r45.ow5 ow5Var = (r45.ow5) fVar;
        return n51.f.a(this.f464114d, ow5Var.f464114d) && n51.f.a(this.f464115e, ow5Var.f464115e) && n51.f.a(this.f464116f, ow5Var.f464116f) && n51.f.a(this.f464117g, ow5Var.f464117g) && n51.f.a(this.f464118h, ow5Var.f464118h) && n51.f.a(this.f464119i, ow5Var.f464119i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464114d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464115e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f464116f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f464117g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f464118h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f464119i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f464114d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f464115e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f464116f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f464117g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f464118h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f464119i;
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
        r45.ow5 ow5Var = (r45.ow5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ow5Var.f464114d = aVar2.k(intValue);
                return 0;
            case 2:
                ow5Var.f464115e = aVar2.k(intValue);
                return 0;
            case 3:
                ow5Var.f464116f = aVar2.k(intValue);
                return 0;
            case 4:
                ow5Var.f464117g = aVar2.k(intValue);
                return 0;
            case 5:
                ow5Var.f464118h = aVar2.k(intValue);
                return 0;
            case 6:
                ow5Var.f464119i = aVar2.k(intValue);
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
            java.lang.String str = this.f464114d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "UserName", this.f464115e, false);
            eVar.d(jSONObject, "HeadUrl", this.f464116f, false);
            eVar.d(jSONObject, "NickName", this.f464117g, false);
            eVar.d(jSONObject, "AuthJob", this.f464118h, false);
            eVar.d(jSONObject, "AuthIcon", this.f464119i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
