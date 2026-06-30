package r45;

/* loaded from: classes4.dex */
public class mf5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461979d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461980e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461981f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f461982g;

    /* renamed from: h, reason: collision with root package name */
    public int f461983h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461984i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f461985m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461986n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f461987o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f461988p;

    /* renamed from: q, reason: collision with root package name */
    public int f461989q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f461990r;

    /* renamed from: s, reason: collision with root package name */
    public int f461991s;

    /* renamed from: t, reason: collision with root package name */
    public int f461992t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mf5)) {
            return false;
        }
        r45.mf5 mf5Var = (r45.mf5) fVar;
        return n51.f.a(this.f76494x2de60e5e, mf5Var.f76494x2de60e5e) && n51.f.a(this.f461979d, mf5Var.f461979d) && n51.f.a(this.f461980e, mf5Var.f461980e) && n51.f.a(this.f461981f, mf5Var.f461981f) && n51.f.a(this.f461982g, mf5Var.f461982g) && n51.f.a(java.lang.Integer.valueOf(this.f461983h), java.lang.Integer.valueOf(mf5Var.f461983h)) && n51.f.a(this.f461984i, mf5Var.f461984i) && n51.f.a(this.f461985m, mf5Var.f461985m) && n51.f.a(this.f461986n, mf5Var.f461986n) && n51.f.a(this.f461987o, mf5Var.f461987o) && n51.f.a(this.f461988p, mf5Var.f461988p) && n51.f.a(java.lang.Integer.valueOf(this.f461989q), java.lang.Integer.valueOf(mf5Var.f461989q)) && n51.f.a(this.f461990r, mf5Var.f461990r) && n51.f.a(java.lang.Integer.valueOf(this.f461991s), java.lang.Integer.valueOf(mf5Var.f461991s)) && n51.f.a(java.lang.Integer.valueOf(this.f461992t), java.lang.Integer.valueOf(mf5Var.f461992t));
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
                        case -1957276818:
                            if (next.equals("OPCode")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -1548945544:
                            if (next.equals("Language")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case -1520513503:
                            if (next.equals("DeviceName")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -1507001342:
                            if (next.equals("IsExpandAutoLoginExpireTime")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case -1486671871:
                            if (next.equals("RandomEncryKey")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -369756472:
                            if (next.equals("AutoAuthKey")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -202022634:
                            if (next.equals("UserName")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 770051678:
                            if (next.equals("BaseRequest")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 973052486:
                            if (next.equals("ClientID")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1015799504:
                            if (next.equals("MsgContextPubKey")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 1085759208:
                            if (next.equals("HardwareExtra")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1130419379:
                            if (next.equals("AutoLoginSwitchEnabled")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 1366812856:
                            if (next.equals("ExtSpamInfo")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1436864003:
                            if (next.equals("AutoAuthTicket")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1857236111:
                            if (next.equals("IsExpandOneClickLoginExpireTime")) {
                                c17 = 14;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f76494x2de60e5e = (r45.he) new r45.he().mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                break;
                            }
                        case 1:
                            this.f461979d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f461980e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f461981f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f461982g = (r45.cu5) new r45.cu5().mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                                break;
                            }
                        case 5:
                            this.f461983h = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 6:
                            this.f461984i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f461985m = (r45.cu5) new r45.cu5().mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                                break;
                            }
                        case '\b':
                            this.f461986n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f461987o = (r45.cu5) new r45.cu5().mo75930xb5cb93b2(((org.json.JSONObject) opt4).toString());
                                break;
                            }
                        case '\n':
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f461988p = (r45.cu5) new r45.cu5().mo75930xb5cb93b2(((org.json.JSONObject) opt5).toString());
                                break;
                            }
                        case 11:
                            this.f461989q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\f':
                            this.f461990r = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\r':
                            this.f461991s = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 14:
                            this.f461992t = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f461979d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461980e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f461981f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.cu5 cu5Var = this.f461982g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f461982g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f461983h);
            java.lang.String str4 = this.f461984i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            r45.cu5 cu5Var2 = this.f461985m;
            if (cu5Var2 != null) {
                fVar.i(8, cu5Var2.mo75928xcd1e8d8());
                this.f461985m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f461986n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            r45.cu5 cu5Var3 = this.f461987o;
            if (cu5Var3 != null) {
                fVar.i(10, cu5Var3.mo75928xcd1e8d8());
                this.f461987o.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var4 = this.f461988p;
            if (cu5Var4 != null) {
                fVar.i(11, cu5Var4.mo75928xcd1e8d8());
                this.f461988p.mo75956x3d5d1f78(fVar);
            }
            fVar.e(12, this.f461989q);
            java.lang.String str6 = this.f461990r;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.e(14, this.f461991s);
            fVar.e(15, this.f461992t);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str7 = this.f461979d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f461980e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f461981f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            r45.cu5 cu5Var5 = this.f461982g;
            if (cu5Var5 != null) {
                i18 += b36.f.i(5, cu5Var5.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(6, this.f461983h);
            java.lang.String str10 = this.f461984i;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            r45.cu5 cu5Var6 = this.f461985m;
            if (cu5Var6 != null) {
                e17 += b36.f.i(8, cu5Var6.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.f461986n;
            if (str11 != null) {
                e17 += b36.f.j(9, str11);
            }
            r45.cu5 cu5Var7 = this.f461987o;
            if (cu5Var7 != null) {
                e17 += b36.f.i(10, cu5Var7.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var8 = this.f461988p;
            if (cu5Var8 != null) {
                e17 += b36.f.i(11, cu5Var8.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(12, this.f461989q);
            java.lang.String str12 = this.f461990r;
            if (str12 != null) {
                e18 += b36.f.j(13, str12);
            }
            return e18 + b36.f.e(14, this.f461991s) + b36.f.e(15, this.f461992t);
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
        r45.mf5 mf5Var = (r45.mf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    mf5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                mf5Var.f461979d = aVar2.k(intValue);
                return 0;
            case 3:
                mf5Var.f461980e = aVar2.k(intValue);
                return 0;
            case 4:
                mf5Var.f461981f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var9.b(bArr2);
                    }
                    mf5Var.f461982g = cu5Var9;
                }
                return 0;
            case 6:
                mf5Var.f461983h = aVar2.g(intValue);
                return 0;
            case 7:
                mf5Var.f461984i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var10 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var10.b(bArr3);
                    }
                    mf5Var.f461985m = cu5Var10;
                }
                return 0;
            case 9:
                mf5Var.f461986n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var11.b(bArr4);
                    }
                    mf5Var.f461987o = cu5Var11;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var12.b(bArr5);
                    }
                    mf5Var.f461988p = cu5Var12;
                }
                return 0;
            case 12:
                mf5Var.f461989q = aVar2.g(intValue);
                return 0;
            case 13:
                mf5Var.f461990r = aVar2.k(intValue);
                return 0;
            case 14:
                mf5Var.f461991s = aVar2.g(intValue);
                return 0;
            case 15:
                mf5Var.f461992t = aVar2.g(intValue);
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
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "UserName", this.f461979d, false);
            eVar.d(jSONObject, "AutoAuthTicket", this.f461980e, false);
            eVar.d(jSONObject, "ClientID", this.f461981f, false);
            eVar.d(jSONObject, "RandomEncryKey", this.f461982g, false);
            eVar.d(jSONObject, "OPCode", java.lang.Integer.valueOf(this.f461983h), false);
            eVar.d(jSONObject, "DeviceName", this.f461984i, false);
            eVar.d(jSONObject, "AutoAuthKey", this.f461985m, false);
            eVar.d(jSONObject, "HardwareExtra", this.f461986n, false);
            eVar.d(jSONObject, "MsgContextPubKey", this.f461987o, false);
            eVar.d(jSONObject, "ExtSpamInfo", this.f461988p, false);
            eVar.d(jSONObject, "AutoLoginSwitchEnabled", java.lang.Integer.valueOf(this.f461989q), false);
            eVar.d(jSONObject, "Language", this.f461990r, false);
            eVar.d(jSONObject, "IsExpandAutoLoginExpireTime", java.lang.Integer.valueOf(this.f461991s), false);
            eVar.d(jSONObject, "IsExpandOneClickLoginExpireTime", java.lang.Integer.valueOf(this.f461992t), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
