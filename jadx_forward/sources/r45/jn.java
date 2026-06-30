package r45;

/* loaded from: classes8.dex */
public class jn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f459489d;

    /* renamed from: e, reason: collision with root package name */
    public long f459490e;

    /* renamed from: f, reason: collision with root package name */
    public long f459491f;

    /* renamed from: g, reason: collision with root package name */
    public long f459492g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459493h;

    /* renamed from: i, reason: collision with root package name */
    public long f459494i;

    /* renamed from: m, reason: collision with root package name */
    public long f459495m;

    /* renamed from: n, reason: collision with root package name */
    public long f459496n;

    /* renamed from: o, reason: collision with root package name */
    public long f459497o;

    /* renamed from: p, reason: collision with root package name */
    public long f459498p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jn)) {
            return false;
        }
        r45.jn jnVar = (r45.jn) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f459489d), java.lang.Long.valueOf(jnVar.f459489d)) && n51.f.a(java.lang.Long.valueOf(this.f459490e), java.lang.Long.valueOf(jnVar.f459490e)) && n51.f.a(java.lang.Long.valueOf(this.f459491f), java.lang.Long.valueOf(jnVar.f459491f)) && n51.f.a(java.lang.Long.valueOf(this.f459492g), java.lang.Long.valueOf(jnVar.f459492g)) && n51.f.a(this.f459493h, jnVar.f459493h) && n51.f.a(java.lang.Long.valueOf(this.f459494i), java.lang.Long.valueOf(jnVar.f459494i)) && n51.f.a(java.lang.Long.valueOf(this.f459495m), java.lang.Long.valueOf(jnVar.f459495m)) && n51.f.a(java.lang.Long.valueOf(this.f459496n), java.lang.Long.valueOf(jnVar.f459496n)) && n51.f.a(java.lang.Long.valueOf(this.f459497o), java.lang.Long.valueOf(jnVar.f459497o)) && n51.f.a(java.lang.Long.valueOf(this.f459498p), java.lang.Long.valueOf(jnVar.f459498p));
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
                        case -2129294769:
                            if (next.equals("startTime")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1556159969:
                            if (next.equals("patchMergeCount")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -867717901:
                            if (next.equals("startPatchTime")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -708751081:
                            if (next.equals("noticeCount")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -579272421:
                            if (next.equals("patchloadTime")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -295915613:
                            if (next.equals("updateType")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 5877095:
                            if (next.equals("downloadCount")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1109068661:
                            if (next.equals("downloadTime")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1922277623:
                            if (next.equals("startDownloadTime")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 2009367604:
                            if (next.equals("installCount")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f459489d = jSONObject.optLong(next);
                            break;
                        case 1:
                            this.f459490e = jSONObject.optLong(next);
                            break;
                        case 2:
                            this.f459491f = jSONObject.optLong(next);
                            break;
                        case 3:
                            this.f459492g = jSONObject.optLong(next);
                            break;
                        case 4:
                            this.f459493h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f459494i = jSONObject.optLong(next);
                            break;
                        case 6:
                            this.f459495m = jSONObject.optLong(next);
                            break;
                        case 7:
                            this.f459496n = jSONObject.optLong(next);
                            break;
                        case '\b':
                            this.f459497o = jSONObject.optLong(next);
                            break;
                        case '\t':
                            this.f459498p = jSONObject.optLong(next);
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
            fVar.h(1, this.f459489d);
            fVar.h(2, this.f459490e);
            fVar.h(3, this.f459491f);
            fVar.h(4, this.f459492g);
            java.lang.String str = this.f459493h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.h(6, this.f459494i);
            fVar.h(7, this.f459495m);
            fVar.h(8, this.f459496n);
            fVar.h(9, this.f459497o);
            fVar.h(10, this.f459498p);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f459489d) + 0 + b36.f.h(2, this.f459490e) + b36.f.h(3, this.f459491f) + b36.f.h(4, this.f459492g);
            java.lang.String str2 = this.f459493h;
            if (str2 != null) {
                h17 += b36.f.j(5, str2);
            }
            return h17 + b36.f.h(6, this.f459494i) + b36.f.h(7, this.f459495m) + b36.f.h(8, this.f459496n) + b36.f.h(9, this.f459497o) + b36.f.h(10, this.f459498p);
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
        r45.jn jnVar = (r45.jn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jnVar.f459489d = aVar2.i(intValue);
                return 0;
            case 2:
                jnVar.f459490e = aVar2.i(intValue);
                return 0;
            case 3:
                jnVar.f459491f = aVar2.i(intValue);
                return 0;
            case 4:
                jnVar.f459492g = aVar2.i(intValue);
                return 0;
            case 5:
                jnVar.f459493h = aVar2.k(intValue);
                return 0;
            case 6:
                jnVar.f459494i = aVar2.i(intValue);
                return 0;
            case 7:
                jnVar.f459495m = aVar2.i(intValue);
                return 0;
            case 8:
                jnVar.f459496n = aVar2.i(intValue);
                return 0;
            case 9:
                jnVar.f459497o = aVar2.i(intValue);
                return 0;
            case 10:
                jnVar.f459498p = aVar2.i(intValue);
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
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f459489d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "downloadCount", valueOf, false);
            eVar.d(jSONObject, "noticeCount", java.lang.Long.valueOf(this.f459490e), false);
            eVar.d(jSONObject, "patchMergeCount", java.lang.Long.valueOf(this.f459491f), false);
            eVar.d(jSONObject, "installCount", java.lang.Long.valueOf(this.f459492g), false);
            eVar.d(jSONObject, "updateType", this.f459493h, false);
            eVar.d(jSONObject, "downloadTime", java.lang.Long.valueOf(this.f459494i), false);
            eVar.d(jSONObject, "patchloadTime", java.lang.Long.valueOf(this.f459495m), false);
            eVar.d(jSONObject, "startTime", java.lang.Long.valueOf(this.f459496n), false);
            eVar.d(jSONObject, "startDownloadTime", java.lang.Long.valueOf(this.f459497o), false);
            eVar.d(jSONObject, "startPatchTime", java.lang.Long.valueOf(this.f459498p), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
