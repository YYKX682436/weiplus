package r45;

/* loaded from: classes12.dex */
public class hz3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458096d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458097e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458098f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458099g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458100h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458101i;

    /* renamed from: m, reason: collision with root package name */
    public int f458102m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hz3)) {
            return false;
        }
        r45.hz3 hz3Var = (r45.hz3) fVar;
        return n51.f.a(this.f458096d, hz3Var.f458096d) && n51.f.a(this.f458097e, hz3Var.f458097e) && n51.f.a(this.f458098f, hz3Var.f458098f) && n51.f.a(this.f458099g, hz3Var.f458099g) && n51.f.a(this.f458100h, hz3Var.f458100h) && n51.f.a(this.f458101i, hz3Var.f458101i) && n51.f.a(java.lang.Integer.valueOf(this.f458102m), java.lang.Integer.valueOf(hz3Var.f458102m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458096d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458097e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f458098f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f458099g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f458100h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f458101i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f458102m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f458096d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f458097e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f458098f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f458099g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f458100h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f458101i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            return j17 + b36.f.e(7, this.f458102m);
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
        r45.hz3 hz3Var = (r45.hz3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hz3Var.f458096d = aVar2.k(intValue);
                return 0;
            case 2:
                hz3Var.f458097e = aVar2.k(intValue);
                return 0;
            case 3:
                hz3Var.f458098f = aVar2.k(intValue);
                return 0;
            case 4:
                hz3Var.f458099g = aVar2.k(intValue);
                return 0;
            case 5:
                hz3Var.f458100h = aVar2.k(intValue);
                return 0;
            case 6:
                hz3Var.f458101i = aVar2.k(intValue);
                return 0;
            case 7:
                hz3Var.f458102m = aVar2.g(intValue);
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
            java.lang.String str = this.f458096d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "AppId", str, false);
            eVar.d(jSONObject, "Nickname", this.f458097e, false);
            eVar.d(jSONObject, "IconUrl", this.f458098f, false);
            eVar.d(jSONObject, "EnterPath", this.f458099g, false);
            eVar.d(jSONObject, "ForwardSceneNote", this.f458100h, false);
            eVar.d(jSONObject, "ShowSourceView", this.f458101i, false);
            eVar.d(jSONObject, "VersionType", java.lang.Integer.valueOf(this.f458102m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
