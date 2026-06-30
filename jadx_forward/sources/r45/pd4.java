package r45;

/* loaded from: classes4.dex */
public class pd4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464492d;

    /* renamed from: e, reason: collision with root package name */
    public int f464493e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464494f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464495g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464496h;

    /* renamed from: i, reason: collision with root package name */
    public int f464497i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464498m;

    /* renamed from: n, reason: collision with root package name */
    public int f464499n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464500o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pd4)) {
            return false;
        }
        r45.pd4 pd4Var = (r45.pd4) fVar;
        return n51.f.a(this.f464492d, pd4Var.f464492d) && n51.f.a(java.lang.Integer.valueOf(this.f464493e), java.lang.Integer.valueOf(pd4Var.f464493e)) && n51.f.a(this.f464494f, pd4Var.f464494f) && n51.f.a(this.f464495g, pd4Var.f464495g) && n51.f.a(this.f464496h, pd4Var.f464496h) && n51.f.a(java.lang.Integer.valueOf(this.f464497i), java.lang.Integer.valueOf(pd4Var.f464497i)) && n51.f.a(this.f464498m, pd4Var.f464498m) && n51.f.a(java.lang.Integer.valueOf(this.f464499n), java.lang.Integer.valueOf(pd4Var.f464499n)) && n51.f.a(this.f464500o, pd4Var.f464500o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    switch (next.hashCode()) {
                        case -1808614382:
                            if (next.equals("Status")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1129667380:
                            if (next.equals("HeadImgURL")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -202022634:
                            if (next.equals("UserName")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 80669:
                            if (next.equals("Pwd")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 2616251:
                            if (next.equals("UUID")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 134381742:
                            if (next.equals("NickName")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1018119815:
                            if (next.equals("AuthUrl")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1469887698:
                            if (next.equals("PushLoginURLExpiredTime")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1575353202:
                            if (next.equals("ExpiredTime")) {
                                c17 = 7;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f464492d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f464493e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f464494f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f464495g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f464496h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f464497i = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 6:
                            this.f464498m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f464499n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            this.f464500o = (java.lang.String) jSONObject.opt(next);
                            break;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464492d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f464493e);
            java.lang.String str2 = this.f464494f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f464495g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f464496h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f464497i);
            java.lang.String str5 = this.f464498m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f464499n);
            java.lang.String str6 = this.f464500o;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f464492d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f464493e);
            java.lang.String str8 = this.f464494f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f464495g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f464496h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            int e17 = j17 + b36.f.e(6, this.f464497i);
            java.lang.String str11 = this.f464498m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int e18 = e17 + b36.f.e(8, this.f464499n);
            java.lang.String str12 = this.f464500o;
            return str12 != null ? e18 + b36.f.j(15, str12) : e18;
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
        r45.pd4 pd4Var = (r45.pd4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 15) {
            pd4Var.f464500o = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                pd4Var.f464492d = aVar2.k(intValue);
                return 0;
            case 2:
                pd4Var.f464493e = aVar2.g(intValue);
                return 0;
            case 3:
                pd4Var.f464494f = aVar2.k(intValue);
                return 0;
            case 4:
                pd4Var.f464495g = aVar2.k(intValue);
                return 0;
            case 5:
                pd4Var.f464496h = aVar2.k(intValue);
                return 0;
            case 6:
                pd4Var.f464497i = aVar2.g(intValue);
                return 0;
            case 7:
                pd4Var.f464498m = aVar2.k(intValue);
                return 0;
            case 8:
                pd4Var.f464499n = aVar2.g(intValue);
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
            java.lang.String str = this.f464492d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "UUID", str, false);
            eVar.d(jSONObject, "Status", java.lang.Integer.valueOf(this.f464493e), false);
            eVar.d(jSONObject, "UserName", this.f464494f, false);
            eVar.d(jSONObject, "Pwd", this.f464495g, false);
            eVar.d(jSONObject, "HeadImgURL", this.f464496h, false);
            eVar.d(jSONObject, "PushLoginURLExpiredTime", java.lang.Integer.valueOf(this.f464497i), false);
            eVar.d(jSONObject, "NickName", this.f464498m, false);
            eVar.d(jSONObject, "ExpiredTime", java.lang.Integer.valueOf(this.f464499n), false);
            eVar.d(jSONObject, "AuthUrl", this.f464500o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
