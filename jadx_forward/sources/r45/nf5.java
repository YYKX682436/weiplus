package r45;

/* loaded from: classes4.dex */
public class nf5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462885d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f462886e;

    /* renamed from: f, reason: collision with root package name */
    public int f462887f;

    /* renamed from: g, reason: collision with root package name */
    public int f462888g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462889h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f462890i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462891m;

    /* renamed from: n, reason: collision with root package name */
    public int f462892n;

    /* renamed from: o, reason: collision with root package name */
    public int f462893o;

    /* renamed from: p, reason: collision with root package name */
    public int f462894p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f462895q;

    /* renamed from: r, reason: collision with root package name */
    public int f462896r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nf5)) {
            return false;
        }
        r45.nf5 nf5Var = (r45.nf5) fVar;
        return n51.f.a(this.f76492x92037252, nf5Var.f76492x92037252) && n51.f.a(this.f462885d, nf5Var.f462885d) && n51.f.a(this.f462886e, nf5Var.f462886e) && n51.f.a(java.lang.Integer.valueOf(this.f462887f), java.lang.Integer.valueOf(nf5Var.f462887f)) && n51.f.a(java.lang.Integer.valueOf(this.f462888g), java.lang.Integer.valueOf(nf5Var.f462888g)) && n51.f.a(this.f462889h, nf5Var.f462889h) && n51.f.a(this.f462890i, nf5Var.f462890i) && n51.f.a(this.f462891m, nf5Var.f462891m) && n51.f.a(java.lang.Integer.valueOf(this.f462892n), java.lang.Integer.valueOf(nf5Var.f462892n)) && n51.f.a(java.lang.Integer.valueOf(this.f462893o), java.lang.Integer.valueOf(nf5Var.f462893o)) && n51.f.a(java.lang.Integer.valueOf(this.f462894p), java.lang.Integer.valueOf(nf5Var.f462894p)) && n51.f.a(this.f462895q, nf5Var.f462895q) && n51.f.a(java.lang.Integer.valueOf(this.f462896r), java.lang.Integer.valueOf(nf5Var.f462896r));
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
                        case -1892415531:
                            if (next.equals("CheckTime")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1845267886:
                            if (next.equals("BaseResponse")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1140125618:
                            if (next.equals("BlueToothBroadCastUUID")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -388923850:
                            if (next.equals("NotifyKey")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -381010447:
                            if (next.equals("WebFileHelperUrl")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -64004164:
                            if (next.equals("AlertWording")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 2192268:
                            if (next.equals("Flag")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 2616251:
                            if (next.equals("UUID")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 79702124:
                            if (next.equals("Scene")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 541048137:
                            if (next.equals("AlertCode")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1103952614:
                            if (next.equals("BlueToothBroadCastContent")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1575353202:
                            if (next.equals("ExpiredTime")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1624812116:
                            if (next.equals("AbandonedPushLoginUrl")) {
                                c17 = '\f';
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
                                this.f76492x92037252 = (r45.ie) new r45.ie().mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                break;
                            }
                        case 1:
                            this.f462885d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f462886e = (r45.cu5) new r45.cu5().mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                                break;
                            }
                        case 3:
                            this.f462887f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 4:
                            this.f462888g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f462889h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f462890i = (r45.cu5) new r45.cu5().mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                                break;
                            }
                        case 7:
                            this.f462891m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f462892n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f462893o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            this.f462894p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 11:
                            this.f462895q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\f':
                            this.f462896r = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f462885d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f462886e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f462886e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f462887f);
            fVar.e(5, this.f462888g);
            java.lang.String str2 = this.f462889h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.cu5 cu5Var2 = this.f462890i;
            if (cu5Var2 != null) {
                fVar.i(7, cu5Var2.mo75928xcd1e8d8());
                this.f462890i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f462891m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f462892n);
            fVar.e(10, this.f462893o);
            fVar.e(11, this.f462894p);
            java.lang.String str4 = this.f462895q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f462896r);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f462885d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            r45.cu5 cu5Var3 = this.f462886e;
            if (cu5Var3 != null) {
                i18 += b36.f.i(3, cu5Var3.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f462887f) + b36.f.e(5, this.f462888g);
            java.lang.String str6 = this.f462889h;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            r45.cu5 cu5Var4 = this.f462890i;
            if (cu5Var4 != null) {
                e17 += b36.f.i(7, cu5Var4.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f462891m;
            if (str7 != null) {
                e17 += b36.f.j(8, str7);
            }
            int e18 = e17 + b36.f.e(9, this.f462892n) + b36.f.e(10, this.f462893o) + b36.f.e(11, this.f462894p);
            java.lang.String str8 = this.f462895q;
            if (str8 != null) {
                e18 += b36.f.j(12, str8);
            }
            return e18 + b36.f.e(13, this.f462896r);
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
        r45.nf5 nf5Var = (r45.nf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    nf5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                nf5Var.f462885d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    nf5Var.f462886e = cu5Var5;
                }
                return 0;
            case 4:
                nf5Var.f462887f = aVar2.g(intValue);
                return 0;
            case 5:
                nf5Var.f462888g = aVar2.g(intValue);
                return 0;
            case 6:
                nf5Var.f462889h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    nf5Var.f462890i = cu5Var6;
                }
                return 0;
            case 8:
                nf5Var.f462891m = aVar2.k(intValue);
                return 0;
            case 9:
                nf5Var.f462892n = aVar2.g(intValue);
                return 0;
            case 10:
                nf5Var.f462893o = aVar2.g(intValue);
                return 0;
            case 11:
                nf5Var.f462894p = aVar2.g(intValue);
                return 0;
            case 12:
                nf5Var.f462895q = aVar2.k(intValue);
                return 0;
            case 13:
                nf5Var.f462896r = aVar2.g(intValue);
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
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "UUID", this.f462885d, false);
            eVar.d(jSONObject, "NotifyKey", this.f462886e, false);
            eVar.d(jSONObject, "CheckTime", java.lang.Integer.valueOf(this.f462887f), false);
            eVar.d(jSONObject, "ExpiredTime", java.lang.Integer.valueOf(this.f462888g), false);
            eVar.d(jSONObject, "BlueToothBroadCastUUID", this.f462889h, false);
            eVar.d(jSONObject, "BlueToothBroadCastContent", this.f462890i, false);
            eVar.d(jSONObject, "WebFileHelperUrl", this.f462891m, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f462892n), false);
            eVar.d(jSONObject, "Flag", java.lang.Integer.valueOf(this.f462893o), false);
            eVar.d(jSONObject, "AlertCode", java.lang.Integer.valueOf(this.f462894p), false);
            eVar.d(jSONObject, "AlertWording", this.f462895q, false);
            eVar.d(jSONObject, "AbandonedPushLoginUrl", java.lang.Integer.valueOf(this.f462896r), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
