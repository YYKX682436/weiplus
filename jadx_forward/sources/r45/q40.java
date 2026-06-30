package r45;

/* loaded from: classes8.dex */
public class q40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465189d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465190e;

    /* renamed from: f, reason: collision with root package name */
    public long f465191f;

    /* renamed from: g, reason: collision with root package name */
    public long f465192g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f465193h;

    /* renamed from: i, reason: collision with root package name */
    public long f465194i;

    /* renamed from: m, reason: collision with root package name */
    public long f465195m;

    /* renamed from: n, reason: collision with root package name */
    public long f465196n;

    /* renamed from: o, reason: collision with root package name */
    public long f465197o;

    /* renamed from: p, reason: collision with root package name */
    public int f465198p;

    /* renamed from: q, reason: collision with root package name */
    public int f465199q;

    /* renamed from: r, reason: collision with root package name */
    public long f465200r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q40)) {
            return false;
        }
        r45.q40 q40Var = (r45.q40) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465189d), java.lang.Integer.valueOf(q40Var.f465189d)) && n51.f.a(this.f465190e, q40Var.f465190e) && n51.f.a(java.lang.Long.valueOf(this.f465191f), java.lang.Long.valueOf(q40Var.f465191f)) && n51.f.a(java.lang.Long.valueOf(this.f465192g), java.lang.Long.valueOf(q40Var.f465192g)) && n51.f.a(java.lang.Boolean.valueOf(this.f465193h), java.lang.Boolean.valueOf(q40Var.f465193h)) && n51.f.a(java.lang.Long.valueOf(this.f465194i), java.lang.Long.valueOf(q40Var.f465194i)) && n51.f.a(java.lang.Long.valueOf(this.f465195m), java.lang.Long.valueOf(q40Var.f465195m)) && n51.f.a(java.lang.Long.valueOf(this.f465196n), java.lang.Long.valueOf(q40Var.f465196n)) && n51.f.a(java.lang.Long.valueOf(this.f465197o), java.lang.Long.valueOf(q40Var.f465197o)) && n51.f.a(java.lang.Integer.valueOf(this.f465198p), java.lang.Integer.valueOf(q40Var.f465198p)) && n51.f.a(java.lang.Integer.valueOf(this.f465199q), java.lang.Integer.valueOf(q40Var.f465199q)) && n51.f.a(java.lang.Long.valueOf(this.f465200r), java.lang.Long.valueOf(q40Var.f465200r));
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
                        case -1903565834:
                            if (next.equals("show_line")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1552680137:
                            if (next.equals("last_expose_interval")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -1349100711:
                            if (next.equals("first_expose_time")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -620329246:
                            if (next.equals("had_sync_for_cold_time")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case -1118504:
                            if (next.equals("had_sync_cold_time")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 110210:
                            if (next.equals("oob")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 405808723:
                            if (next.equals("last_report_time_stamp")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 690196215:
                            if (next.equals("rece_time")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 785900756:
                            if (next.equals("expose_count")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 947760579:
                            if (next.equals("last_expose_time_stamp")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 957051455:
                            if (next.equals("last_expose_time")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 1845231328:
                            if (next.equals("expose_interval")) {
                                c17 = 7;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f465189d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f465190e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f465191f = jSONObject.optLong(next);
                            break;
                        case 3:
                            this.f465192g = jSONObject.optLong(next);
                            break;
                        case 4:
                            this.f465193h = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case 5:
                            this.f465194i = jSONObject.optLong(next);
                            break;
                        case 6:
                            this.f465195m = jSONObject.optLong(next);
                            break;
                        case 7:
                            this.f465196n = jSONObject.optLong(next);
                            break;
                        case '\b':
                            this.f465197o = jSONObject.optLong(next);
                            break;
                        case '\t':
                            this.f465198p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            this.f465199q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 11:
                            this.f465200r = jSONObject.optLong(next);
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
            fVar.e(1, this.f465189d);
            java.lang.String str = this.f465190e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f465191f);
            fVar.h(4, this.f465192g);
            fVar.a(5, this.f465193h);
            fVar.h(6, this.f465194i);
            fVar.h(7, this.f465195m);
            fVar.h(8, this.f465196n);
            fVar.h(9, this.f465197o);
            fVar.e(10, this.f465198p);
            fVar.e(100, this.f465199q);
            fVar.h(101, this.f465200r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465189d) + 0;
            java.lang.String str2 = this.f465190e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f465191f) + b36.f.h(4, this.f465192g) + b36.f.a(5, this.f465193h) + b36.f.h(6, this.f465194i) + b36.f.h(7, this.f465195m) + b36.f.h(8, this.f465196n) + b36.f.h(9, this.f465197o) + b36.f.e(10, this.f465198p) + b36.f.e(100, this.f465199q) + b36.f.h(101, this.f465200r);
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
        r45.q40 q40Var = (r45.q40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            q40Var.f465199q = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 101) {
            q40Var.f465200r = aVar2.i(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                q40Var.f465189d = aVar2.g(intValue);
                return 0;
            case 2:
                q40Var.f465190e = aVar2.k(intValue);
                return 0;
            case 3:
                q40Var.f465191f = aVar2.i(intValue);
                return 0;
            case 4:
                q40Var.f465192g = aVar2.i(intValue);
                return 0;
            case 5:
                q40Var.f465193h = aVar2.c(intValue);
                return 0;
            case 6:
                q40Var.f465194i = aVar2.i(intValue);
                return 0;
            case 7:
                q40Var.f465195m = aVar2.i(intValue);
                return 0;
            case 8:
                q40Var.f465196n = aVar2.i(intValue);
                return 0;
            case 9:
                q40Var.f465197o = aVar2.i(intValue);
                return 0;
            case 10:
                q40Var.f465198p = aVar2.g(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f465189d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "expose_count", valueOf, true);
            eVar.d(jSONObject, "oob", this.f465190e, true);
            eVar.d(jSONObject, "first_expose_time", java.lang.Long.valueOf(this.f465191f), true);
            eVar.d(jSONObject, "rece_time", java.lang.Long.valueOf(this.f465192g), true);
            eVar.d(jSONObject, "had_sync_cold_time", java.lang.Boolean.valueOf(this.f465193h), true);
            eVar.d(jSONObject, "last_expose_time_stamp", java.lang.Long.valueOf(this.f465194i), true);
            eVar.d(jSONObject, "last_report_time_stamp", java.lang.Long.valueOf(this.f465195m), true);
            eVar.d(jSONObject, "expose_interval", java.lang.Long.valueOf(this.f465196n), true);
            eVar.d(jSONObject, "last_expose_interval", java.lang.Long.valueOf(this.f465197o), true);
            eVar.d(jSONObject, "show_line", java.lang.Integer.valueOf(this.f465198p), true);
            eVar.d(jSONObject, "had_sync_for_cold_time", java.lang.Integer.valueOf(this.f465199q), true);
            eVar.d(jSONObject, "last_expose_time", java.lang.Long.valueOf(this.f465200r), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
