package r45;

/* loaded from: classes2.dex */
public class cb7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452966d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452967e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452968f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452969g;

    /* renamed from: h, reason: collision with root package name */
    public int f452970h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452971i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f452972m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cb7)) {
            return false;
        }
        r45.cb7 cb7Var = (r45.cb7) fVar;
        return n51.f.a(this.f452966d, cb7Var.f452966d) && n51.f.a(this.f452967e, cb7Var.f452967e) && n51.f.a(this.f452968f, cb7Var.f452968f) && n51.f.a(this.f452969g, cb7Var.f452969g) && n51.f.a(java.lang.Integer.valueOf(this.f452970h), java.lang.Integer.valueOf(cb7Var.f452970h)) && n51.f.a(this.f452971i, cb7Var.f452971i) && n51.f.a(this.f452972m, cb7Var.f452972m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452966d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452967e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452968f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f452969g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f452970h);
            java.lang.String str5 = this.f452971i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f452972m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f452966d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f452967e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f452968f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f452969g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f452970h);
            java.lang.String str11 = this.f452971i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f452972m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
        r45.cb7 cb7Var = (r45.cb7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cb7Var.f452966d = aVar2.k(intValue);
                return 0;
            case 2:
                cb7Var.f452967e = aVar2.k(intValue);
                return 0;
            case 3:
                cb7Var.f452968f = aVar2.k(intValue);
                return 0;
            case 4:
                cb7Var.f452969g = aVar2.k(intValue);
                return 0;
            case 5:
                cb7Var.f452970h = aVar2.g(intValue);
                return 0;
            case 6:
                cb7Var.f452971i = aVar2.k(intValue);
                return 0;
            case 7:
                cb7Var.f452972m = aVar2.k(intValue);
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
            java.lang.String str = this.f452966d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "DocId", str, false);
            eVar.d(jSONObject, "UserName", this.f452967e, false);
            eVar.d(jSONObject, "NickName", this.f452968f, false);
            eVar.d(jSONObject, "AppID", this.f452969g, false);
            eVar.d(jSONObject, "AppVersion", java.lang.Integer.valueOf(this.f452970h), false);
            eVar.d(jSONObject, "BoxInfo", this.f452971i, false);
            eVar.d(jSONObject, "IconUrl", this.f452972m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
