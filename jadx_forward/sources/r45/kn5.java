package r45;

/* loaded from: classes14.dex */
public class kn5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460389d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460390e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460391f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460392g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460393h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460394i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kn5)) {
            return false;
        }
        r45.kn5 kn5Var = (r45.kn5) fVar;
        return n51.f.a(this.f460389d, kn5Var.f460389d) && n51.f.a(this.f460390e, kn5Var.f460390e) && n51.f.a(this.f460391f, kn5Var.f460391f) && n51.f.a(this.f460392g, kn5Var.f460392g) && n51.f.a(this.f460393h, kn5Var.f460393h) && n51.f.a(this.f460394i, kn5Var.f460394i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460389d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460390e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460391f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f460392g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f460393h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f460394i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f460389d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f460390e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f460391f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f460392g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f460393h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f460394i;
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
        r45.kn5 kn5Var = (r45.kn5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kn5Var.f460389d = aVar2.k(intValue);
                return 0;
            case 2:
                kn5Var.f460390e = aVar2.k(intValue);
                return 0;
            case 3:
                kn5Var.f460391f = aVar2.k(intValue);
                return 0;
            case 4:
                kn5Var.f460392g = aVar2.k(intValue);
                return 0;
            case 5:
                kn5Var.f460393h = aVar2.k(intValue);
                return 0;
            case 6:
                kn5Var.f460394i = aVar2.k(intValue);
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
            java.lang.String str = this.f460389d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "NickName", str, false);
            eVar.d(jSONObject, "PwdHash", this.f460390e, false);
            eVar.d(jSONObject, "HeadImgMd5", this.f460391f, false);
            eVar.d(jSONObject, "PhoneNumber", this.f460392g, false);
            eVar.d(jSONObject, "TimeZone", this.f460393h, false);
            eVar.d(jSONObject, "TimeZoneName", this.f460394i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
