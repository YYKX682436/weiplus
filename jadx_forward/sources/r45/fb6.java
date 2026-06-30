package r45;

/* loaded from: classes2.dex */
public class fb6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455714d;

    /* renamed from: e, reason: collision with root package name */
    public int f455715e;

    /* renamed from: f, reason: collision with root package name */
    public int f455716f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455717g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455718h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455719i;

    /* renamed from: m, reason: collision with root package name */
    public int f455720m;

    /* renamed from: n, reason: collision with root package name */
    public int f455721n;

    /* renamed from: o, reason: collision with root package name */
    public int f455722o;

    /* renamed from: p, reason: collision with root package name */
    public int f455723p;

    /* renamed from: q, reason: collision with root package name */
    public long f455724q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fb6)) {
            return false;
        }
        r45.fb6 fb6Var = (r45.fb6) fVar;
        return n51.f.a(this.f455714d, fb6Var.f455714d) && n51.f.a(java.lang.Integer.valueOf(this.f455715e), java.lang.Integer.valueOf(fb6Var.f455715e)) && n51.f.a(java.lang.Integer.valueOf(this.f455716f), java.lang.Integer.valueOf(fb6Var.f455716f)) && n51.f.a(this.f455717g, fb6Var.f455717g) && n51.f.a(this.f455718h, fb6Var.f455718h) && n51.f.a(this.f455719i, fb6Var.f455719i) && n51.f.a(java.lang.Integer.valueOf(this.f455720m), java.lang.Integer.valueOf(fb6Var.f455720m)) && n51.f.a(java.lang.Integer.valueOf(this.f455721n), java.lang.Integer.valueOf(fb6Var.f455721n)) && n51.f.a(java.lang.Integer.valueOf(this.f455722o), java.lang.Integer.valueOf(fb6Var.f455722o)) && n51.f.a(java.lang.Integer.valueOf(this.f455723p), java.lang.Integer.valueOf(fb6Var.f455723p)) && n51.f.a(java.lang.Long.valueOf(this.f455724q), java.lang.Long.valueOf(fb6Var.f455724q));
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
                        case -1840815538:
                            if (next.equals("key_frame_image_file_size")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1831711143:
                            if (next.equals("key_frame_image_url")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1178105356:
                            if (next.equals("video_signature")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -324368021:
                            if (next.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37664x160cda9b)) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 549079586:
                            if (next.equals("key_frame_image_signature")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 664008090:
                            if (next.equals("video_duration_millisecond")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 706299096:
                            if (next.equals("video_duration")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1333285803:
                            if (next.equals("video_url")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1388977410:
                            if (next.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37666x963061b2)) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1969983049:
                            if (next.equals("media_file_size")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1981145670:
                            if (next.equals("sns_video_id")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f455714d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f455715e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f455716f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f455717g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f455718h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f455719i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f455720m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f455721n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            this.f455722o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f455723p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            this.f455724q = jSONObject.optLong(next);
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
            java.lang.String str = this.f455714d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f455715e);
            fVar.e(3, this.f455716f);
            java.lang.String str2 = this.f455717g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f455718h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f455719i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f455720m);
            fVar.e(8, this.f455721n);
            fVar.e(9, this.f455722o);
            fVar.e(10, this.f455723p);
            fVar.h(11, this.f455724q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f455714d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f455715e) + b36.f.e(3, this.f455716f);
            java.lang.String str6 = this.f455717g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f455718h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f455719i;
            if (str8 != null) {
                j17 += b36.f.j(6, str8);
            }
            return j17 + b36.f.e(7, this.f455720m) + b36.f.e(8, this.f455721n) + b36.f.e(9, this.f455722o) + b36.f.e(10, this.f455723p) + b36.f.h(11, this.f455724q);
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
        r45.fb6 fb6Var = (r45.fb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fb6Var.f455714d = aVar2.k(intValue);
                return 0;
            case 2:
                fb6Var.f455715e = aVar2.g(intValue);
                return 0;
            case 3:
                fb6Var.f455716f = aVar2.g(intValue);
                return 0;
            case 4:
                fb6Var.f455717g = aVar2.k(intValue);
                return 0;
            case 5:
                fb6Var.f455718h = aVar2.k(intValue);
                return 0;
            case 6:
                fb6Var.f455719i = aVar2.k(intValue);
                return 0;
            case 7:
                fb6Var.f455720m = aVar2.g(intValue);
                return 0;
            case 8:
                fb6Var.f455721n = aVar2.g(intValue);
                return 0;
            case 9:
                fb6Var.f455722o = aVar2.g(intValue);
                return 0;
            case 10:
                fb6Var.f455723p = aVar2.g(intValue);
                return 0;
            case 11:
                fb6Var.f455724q = aVar2.i(intValue);
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
            java.lang.String str = this.f455714d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "key_frame_image_url", str, false);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37664x160cda9b, java.lang.Integer.valueOf(this.f455715e), false);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37666x963061b2, java.lang.Integer.valueOf(this.f455716f), false);
            eVar.d(jSONObject, "video_url", this.f455717g, false);
            eVar.d(jSONObject, "key_frame_image_signature", this.f455718h, false);
            eVar.d(jSONObject, "video_signature", this.f455719i, false);
            eVar.d(jSONObject, "video_duration", java.lang.Integer.valueOf(this.f455720m), false);
            eVar.d(jSONObject, "video_duration_millisecond", java.lang.Integer.valueOf(this.f455721n), false);
            eVar.d(jSONObject, "media_file_size", java.lang.Integer.valueOf(this.f455722o), false);
            eVar.d(jSONObject, "key_frame_image_file_size", java.lang.Integer.valueOf(this.f455723p), false);
            eVar.d(jSONObject, "sns_video_id", java.lang.Long.valueOf(this.f455724q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
