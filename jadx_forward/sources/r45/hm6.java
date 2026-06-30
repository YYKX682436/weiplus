package r45;

/* loaded from: classes2.dex */
public class hm6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457828d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457829e;

    /* renamed from: f, reason: collision with root package name */
    public int f457830f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457831g;

    /* renamed from: h, reason: collision with root package name */
    public int f457832h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457833i;

    /* renamed from: m, reason: collision with root package name */
    public int f457834m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f457835n;

    /* renamed from: o, reason: collision with root package name */
    public r45.g77 f457836o;

    /* renamed from: p, reason: collision with root package name */
    public long f457837p;

    /* renamed from: q, reason: collision with root package name */
    public int f457838q;

    /* renamed from: r, reason: collision with root package name */
    public r45.im6 f457839r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hm6)) {
            return false;
        }
        r45.hm6 hm6Var = (r45.hm6) fVar;
        return n51.f.a(this.f457828d, hm6Var.f457828d) && n51.f.a(this.f457829e, hm6Var.f457829e) && n51.f.a(java.lang.Integer.valueOf(this.f457830f), java.lang.Integer.valueOf(hm6Var.f457830f)) && n51.f.a(this.f457831g, hm6Var.f457831g) && n51.f.a(java.lang.Integer.valueOf(this.f457832h), java.lang.Integer.valueOf(hm6Var.f457832h)) && n51.f.a(this.f457833i, hm6Var.f457833i) && n51.f.a(java.lang.Integer.valueOf(this.f457834m), java.lang.Integer.valueOf(hm6Var.f457834m)) && n51.f.a(java.lang.Boolean.valueOf(this.f457835n), java.lang.Boolean.valueOf(hm6Var.f457835n)) && n51.f.a(this.f457836o, hm6Var.f457836o) && n51.f.a(java.lang.Long.valueOf(this.f457837p), java.lang.Long.valueOf(hm6Var.f457837p)) && n51.f.a(java.lang.Integer.valueOf(this.f457838q), java.lang.Integer.valueOf(hm6Var.f457838q)) && n51.f.a(this.f457839r, hm6Var.f457839r);
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
                        case -1008929860:
                            if (next.equals("finder_green_dot_time_stamp")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -898481431:
                            if (next.equals("bizusername")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -791592328:
                            if (next.equals("weight")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -673896098:
                            if (next.equals("finder_feed_export_id")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -182716453:
                            if (next.equals("use_weapp")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 3145580:
                            if (next.equals("flag")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 110371416:
                            if (next.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1212992377:
                            if (next.equals("live_scene")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1387772886:
                            if (next.equals("weapp_data")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1816824233:
                            if (next.equals("refresh_interval")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1969605927:
                            if (next.equals("finder_info")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 2027875547:
                            if (next.equals("logo_url")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f457828d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f457829e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f457830f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f457831g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f457832h = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f457833i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f457834m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f457835n = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case '\b':
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.g77 g77Var = new r45.g77();
                                g77Var.mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                this.f457836o = g77Var;
                                break;
                            }
                        case '\t':
                            this.f457837p = jSONObject.optLong(next);
                            break;
                        case '\n':
                            this.f457838q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 11:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.im6 im6Var = new r45.im6();
                                im6Var.mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                                this.f457839r = im6Var;
                                break;
                            }
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
            java.lang.String str = this.f457828d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f457829e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f457830f);
            java.lang.String str3 = this.f457831g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f457832h);
            java.lang.String str4 = this.f457833i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f457834m);
            fVar.a(8, this.f457835n);
            r45.g77 g77Var = this.f457836o;
            if (g77Var != null) {
                fVar.i(9, g77Var.mo75928xcd1e8d8());
                this.f457836o.mo75956x3d5d1f78(fVar);
            }
            fVar.h(10, this.f457837p);
            fVar.e(11, this.f457838q);
            r45.im6 im6Var = this.f457839r;
            if (im6Var != null) {
                fVar.i(12, im6Var.mo75928xcd1e8d8());
                this.f457839r.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f457828d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f457829e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f457830f);
            java.lang.String str7 = this.f457831g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.f457832h);
            java.lang.String str8 = this.f457833i;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            int e19 = e18 + b36.f.e(7, this.f457834m) + b36.f.a(8, this.f457835n);
            r45.g77 g77Var2 = this.f457836o;
            if (g77Var2 != null) {
                e19 += b36.f.i(9, g77Var2.mo75928xcd1e8d8());
            }
            int h17 = e19 + b36.f.h(10, this.f457837p) + b36.f.e(11, this.f457838q);
            r45.im6 im6Var2 = this.f457839r;
            return im6Var2 != null ? h17 + b36.f.i(12, im6Var2.mo75928xcd1e8d8()) : h17;
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
        r45.hm6 hm6Var = (r45.hm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hm6Var.f457828d = aVar2.k(intValue);
                return 0;
            case 2:
                hm6Var.f457829e = aVar2.k(intValue);
                return 0;
            case 3:
                hm6Var.f457830f = aVar2.g(intValue);
                return 0;
            case 4:
                hm6Var.f457831g = aVar2.k(intValue);
                return 0;
            case 5:
                hm6Var.f457832h = aVar2.g(intValue);
                return 0;
            case 6:
                hm6Var.f457833i = aVar2.k(intValue);
                return 0;
            case 7:
                hm6Var.f457834m = aVar2.g(intValue);
                return 0;
            case 8:
                hm6Var.f457835n = aVar2.c(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.g77 g77Var3 = new r45.g77();
                    if (bArr != null && bArr.length > 0) {
                        g77Var3.mo11468x92b714fd(bArr);
                    }
                    hm6Var.f457836o = g77Var3;
                }
                return 0;
            case 10:
                hm6Var.f457837p = aVar2.i(intValue);
                return 0;
            case 11:
                hm6Var.f457838q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.im6 im6Var3 = new r45.im6();
                    if (bArr2 != null && bArr2.length > 0) {
                        im6Var3.mo11468x92b714fd(bArr2);
                    }
                    hm6Var.f457839r = im6Var3;
                }
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
            java.lang.String str = this.f457828d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "bizusername", str, true);
            eVar.d(jSONObject, "logo_url", this.f457829e, true);
            eVar.d(jSONObject, "weight", java.lang.Integer.valueOf(this.f457830f), true);
            eVar.d(jSONObject, "finder_feed_export_id", this.f457831g, true);
            eVar.d(jSONObject, "refresh_interval", java.lang.Integer.valueOf(this.f457832h), true);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f457833i, true);
            eVar.d(jSONObject, "live_scene", java.lang.Integer.valueOf(this.f457834m), true);
            eVar.d(jSONObject, "use_weapp", java.lang.Boolean.valueOf(this.f457835n), true);
            eVar.d(jSONObject, "weapp_data", this.f457836o, true);
            eVar.d(jSONObject, "finder_green_dot_time_stamp", java.lang.Long.valueOf(this.f457837p), true);
            eVar.d(jSONObject, "flag", java.lang.Integer.valueOf(this.f457838q), true);
            eVar.d(jSONObject, "finder_info", this.f457839r, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
