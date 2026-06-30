package r45;

/* loaded from: classes11.dex */
public class mm6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462201d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462202e;

    /* renamed from: f, reason: collision with root package name */
    public int f462203f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462204g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462205h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462206i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462207m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f462208n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f462209o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462210p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f462211q;

    /* renamed from: r, reason: collision with root package name */
    public int f462212r;

    /* renamed from: s, reason: collision with root package name */
    public int f462213s;

    /* renamed from: t, reason: collision with root package name */
    public int f462214t;

    /* renamed from: u, reason: collision with root package name */
    public int f462215u;

    /* renamed from: v, reason: collision with root package name */
    public int f462216v;

    /* renamed from: w, reason: collision with root package name */
    public int f462217w;

    /* renamed from: x, reason: collision with root package name */
    public int f462218x;

    /* renamed from: y, reason: collision with root package name */
    public int f462219y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f462220z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mm6)) {
            return false;
        }
        r45.mm6 mm6Var = (r45.mm6) fVar;
        return n51.f.a(this.f462201d, mm6Var.f462201d) && n51.f.a(this.f462202e, mm6Var.f462202e) && n51.f.a(java.lang.Integer.valueOf(this.f462203f), java.lang.Integer.valueOf(mm6Var.f462203f)) && n51.f.a(this.f462204g, mm6Var.f462204g) && n51.f.a(this.f462205h, mm6Var.f462205h) && n51.f.a(this.f462206i, mm6Var.f462206i) && n51.f.a(this.f462207m, mm6Var.f462207m) && n51.f.a(this.f462208n, mm6Var.f462208n) && n51.f.a(this.f462209o, mm6Var.f462209o) && n51.f.a(this.f462210p, mm6Var.f462210p) && n51.f.a(this.f462211q, mm6Var.f462211q) && n51.f.a(java.lang.Integer.valueOf(this.f462212r), java.lang.Integer.valueOf(mm6Var.f462212r)) && n51.f.a(java.lang.Integer.valueOf(this.f462213s), java.lang.Integer.valueOf(mm6Var.f462213s)) && n51.f.a(java.lang.Integer.valueOf(this.f462214t), java.lang.Integer.valueOf(mm6Var.f462214t)) && n51.f.a(java.lang.Integer.valueOf(this.f462215u), java.lang.Integer.valueOf(mm6Var.f462215u)) && n51.f.a(java.lang.Integer.valueOf(this.f462216v), java.lang.Integer.valueOf(mm6Var.f462216v)) && n51.f.a(java.lang.Integer.valueOf(this.f462217w), java.lang.Integer.valueOf(mm6Var.f462217w)) && n51.f.a(java.lang.Integer.valueOf(this.f462218x), java.lang.Integer.valueOf(mm6Var.f462218x)) && n51.f.a(java.lang.Integer.valueOf(this.f462219y), java.lang.Integer.valueOf(mm6Var.f462219y)) && n51.f.a(this.f462220z, mm6Var.f462220z) && n51.f.a(this.A, mm6Var.A);
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
                        case -1780691089:
                            if (next.equals("isShowDialog")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case -1364966910:
                            if (next.equals("cdnUrl")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1114961022:
                            if (next.equals("newApkMd5")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -791595133:
                            if (next.equals("patchId")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -737365201:
                            if (next.equals("isShowRedot")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case -722265993:
                            if (next.equals("showDialogIntervalTime")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case -519374818:
                            if (next.equals("downloadingTitle")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case -513404823:
                            if (next.equals("patchSize")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -500633081:
                            if (next.equals("showDialogMaxTimes")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case -203964767:
                            if (next.equals("newApkPath")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 108417:
                            if (next.equals("msg")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 105765600:
                            if (next.equals("okBtn")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 110371416:
                            if (next.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 476548482:
                            if (next.equals("cancelBtn")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 688591589:
                            if (next.equals(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5)) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 719273028:
                            if (next.equals("updateClientVersion")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case 908960928:
                            if (next.equals("packageType")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case 1004621513:
                            if (next.equals("oldApkMd5")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1230358550:
                            if (next.equals("patchMd5")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1268725447:
                            if (next.equals("downloadingMsg")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case 2062213586:
                            if (next.equals("isShowNotification")) {
                                c17 = 14;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f462201d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f462202e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f462203f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f462204g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f462205h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f462206i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f462207m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f462208n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f462209o = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            this.f462210p = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\n':
                            this.f462211q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 11:
                            this.f462212r = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\f':
                            this.f462213s = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\r':
                            this.f462214t = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 14:
                            this.f462215u = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 15:
                            this.f462216v = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 16:
                            this.f462217w = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 17:
                            this.f462218x = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 18:
                            this.f462219y = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            this.f462220z = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 20:
                            this.A = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f462201d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462202e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f462203f);
            java.lang.String str3 = this.f462204g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f462205h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f462206i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f462207m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f462208n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f462209o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f462210p;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            java.lang.String str10 = this.f462211q;
            if (str10 != null) {
                fVar.j(11, str10);
            }
            fVar.e(12, this.f462212r);
            fVar.e(13, this.f462213s);
            fVar.e(14, this.f462214t);
            fVar.e(15, this.f462215u);
            fVar.e(16, this.f462216v);
            fVar.e(17, this.f462217w);
            fVar.e(18, this.f462218x);
            fVar.e(19, this.f462219y);
            java.lang.String str11 = this.f462220z;
            if (str11 != null) {
                fVar.j(20, str11);
            }
            java.lang.String str12 = this.A;
            if (str12 != null) {
                fVar.j(21, str12);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f462201d;
            int j17 = str13 != null ? b36.f.j(1, str13) + 0 : 0;
            java.lang.String str14 = this.f462202e;
            if (str14 != null) {
                j17 += b36.f.j(2, str14);
            }
            int e17 = j17 + b36.f.e(3, this.f462203f);
            java.lang.String str15 = this.f462204g;
            if (str15 != null) {
                e17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f462205h;
            if (str16 != null) {
                e17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f462206i;
            if (str17 != null) {
                e17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f462207m;
            if (str18 != null) {
                e17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f462208n;
            if (str19 != null) {
                e17 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f462209o;
            if (str20 != null) {
                e17 += b36.f.j(9, str20);
            }
            java.lang.String str21 = this.f462210p;
            if (str21 != null) {
                e17 += b36.f.j(10, str21);
            }
            java.lang.String str22 = this.f462211q;
            if (str22 != null) {
                e17 += b36.f.j(11, str22);
            }
            int e18 = e17 + b36.f.e(12, this.f462212r) + b36.f.e(13, this.f462213s) + b36.f.e(14, this.f462214t) + b36.f.e(15, this.f462215u) + b36.f.e(16, this.f462216v) + b36.f.e(17, this.f462217w) + b36.f.e(18, this.f462218x) + b36.f.e(19, this.f462219y);
            java.lang.String str23 = this.f462220z;
            if (str23 != null) {
                e18 += b36.f.j(20, str23);
            }
            java.lang.String str24 = this.A;
            return str24 != null ? e18 + b36.f.j(21, str24) : e18;
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
        r45.mm6 mm6Var = (r45.mm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mm6Var.f462201d = aVar2.k(intValue);
                return 0;
            case 2:
                mm6Var.f462202e = aVar2.k(intValue);
                return 0;
            case 3:
                mm6Var.f462203f = aVar2.g(intValue);
                return 0;
            case 4:
                mm6Var.f462204g = aVar2.k(intValue);
                return 0;
            case 5:
                mm6Var.f462205h = aVar2.k(intValue);
                return 0;
            case 6:
                mm6Var.f462206i = aVar2.k(intValue);
                return 0;
            case 7:
                mm6Var.f462207m = aVar2.k(intValue);
                return 0;
            case 8:
                mm6Var.f462208n = aVar2.k(intValue);
                return 0;
            case 9:
                mm6Var.f462209o = aVar2.k(intValue);
                return 0;
            case 10:
                mm6Var.f462210p = aVar2.k(intValue);
                return 0;
            case 11:
                mm6Var.f462211q = aVar2.k(intValue);
                return 0;
            case 12:
                mm6Var.f462212r = aVar2.g(intValue);
                return 0;
            case 13:
                mm6Var.f462213s = aVar2.g(intValue);
                return 0;
            case 14:
                mm6Var.f462214t = aVar2.g(intValue);
                return 0;
            case 15:
                mm6Var.f462215u = aVar2.g(intValue);
                return 0;
            case 16:
                mm6Var.f462216v = aVar2.g(intValue);
                return 0;
            case 17:
                mm6Var.f462217w = aVar2.g(intValue);
                return 0;
            case 18:
                mm6Var.f462218x = aVar2.g(intValue);
                return 0;
            case 19:
                mm6Var.f462219y = aVar2.g(intValue);
                return 0;
            case 20:
                mm6Var.f462220z = aVar2.k(intValue);
                return 0;
            case 21:
                mm6Var.A = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f462201d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "patchId", str, false);
            eVar.d(jSONObject, "newApkPath", this.f462202e, false);
            eVar.d(jSONObject, "patchSize", java.lang.Integer.valueOf(this.f462203f), false);
            eVar.d(jSONObject, "newApkMd5", this.f462204g, false);
            eVar.d(jSONObject, "oldApkMd5", this.f462205h, false);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f462206i, false);
            eVar.d(jSONObject, "msg", this.f462207m, false);
            eVar.d(jSONObject, "okBtn", this.f462208n, false);
            eVar.d(jSONObject, "cancelBtn", this.f462209o, false);
            eVar.d(jSONObject, "cdnUrl", this.f462210p, false);
            eVar.d(jSONObject, "patchMd5", this.f462211q, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5, java.lang.Integer.valueOf(this.f462212r), false);
            eVar.d(jSONObject, "updateClientVersion", java.lang.Integer.valueOf(this.f462213s), false);
            eVar.d(jSONObject, "packageType", java.lang.Integer.valueOf(this.f462214t), false);
            eVar.d(jSONObject, "isShowNotification", java.lang.Integer.valueOf(this.f462215u), false);
            eVar.d(jSONObject, "isShowRedot", java.lang.Integer.valueOf(this.f462216v), false);
            eVar.d(jSONObject, "isShowDialog", java.lang.Integer.valueOf(this.f462217w), false);
            eVar.d(jSONObject, "showDialogMaxTimes", java.lang.Integer.valueOf(this.f462218x), false);
            eVar.d(jSONObject, "showDialogIntervalTime", java.lang.Integer.valueOf(this.f462219y), false);
            eVar.d(jSONObject, "downloadingTitle", this.f462220z, false);
            eVar.d(jSONObject, "downloadingMsg", this.A, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
