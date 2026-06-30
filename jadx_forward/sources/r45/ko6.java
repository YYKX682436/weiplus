package r45;

/* loaded from: classes8.dex */
public class ko6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460412d;

    /* renamed from: e, reason: collision with root package name */
    public int f460413e;

    /* renamed from: f, reason: collision with root package name */
    public int f460414f;

    /* renamed from: g, reason: collision with root package name */
    public int f460415g;

    /* renamed from: h, reason: collision with root package name */
    public int f460416h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460417i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460418m;

    /* renamed from: n, reason: collision with root package name */
    public int f460419n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ko6)) {
            return false;
        }
        r45.ko6 ko6Var = (r45.ko6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460412d), java.lang.Integer.valueOf(ko6Var.f460412d)) && n51.f.a(java.lang.Integer.valueOf(this.f460413e), java.lang.Integer.valueOf(ko6Var.f460413e)) && n51.f.a(java.lang.Integer.valueOf(this.f460414f), java.lang.Integer.valueOf(ko6Var.f460414f)) && n51.f.a(java.lang.Integer.valueOf(this.f460415g), java.lang.Integer.valueOf(ko6Var.f460415g)) && n51.f.a(java.lang.Integer.valueOf(this.f460416h), java.lang.Integer.valueOf(ko6Var.f460416h)) && n51.f.a(this.f460417i, ko6Var.f460417i) && n51.f.a(this.f460418m, ko6Var.f460418m) && n51.f.a(java.lang.Integer.valueOf(this.f460419n), java.lang.Integer.valueOf(ko6Var.f460419n));
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
                        case -1060440726:
                            if (next.equals("face_time_percentage")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -75725573:
                            if (next.equals("calculate_check_sum")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 530757060:
                            if (next.equals("has_storyline_edited")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 598087849:
                            if (next.equals("has_overlay_sticker")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 929118944:
                            if (next.equals("has_face_sticker")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1362967080:
                            if (next.equals("has_3d_layer")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 1830371750:
                            if (next.equals("original_check_sum")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 2022231724:
                            if (next.equals("likely_defective")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f460412d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f460413e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f460414f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f460415g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 4:
                            this.f460416h = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f460417i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f460418m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f460419n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            fVar.e(1, this.f460412d);
            fVar.e(2, this.f460413e);
            fVar.e(3, this.f460414f);
            fVar.e(4, this.f460415g);
            fVar.e(5, this.f460416h);
            java.lang.String str = this.f460417i;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f460418m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f460419n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460412d) + 0 + b36.f.e(2, this.f460413e) + b36.f.e(3, this.f460414f) + b36.f.e(4, this.f460415g) + b36.f.e(5, this.f460416h);
            java.lang.String str3 = this.f460417i;
            if (str3 != null) {
                e17 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f460418m;
            if (str4 != null) {
                e17 += b36.f.j(7, str4);
            }
            return e17 + b36.f.e(8, this.f460419n);
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
        r45.ko6 ko6Var = (r45.ko6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ko6Var.f460412d = aVar2.g(intValue);
                return 0;
            case 2:
                ko6Var.f460413e = aVar2.g(intValue);
                return 0;
            case 3:
                ko6Var.f460414f = aVar2.g(intValue);
                return 0;
            case 4:
                ko6Var.f460415g = aVar2.g(intValue);
                return 0;
            case 5:
                ko6Var.f460416h = aVar2.g(intValue);
                return 0;
            case 6:
                ko6Var.f460417i = aVar2.k(intValue);
                return 0;
            case 7:
                ko6Var.f460418m = aVar2.k(intValue);
                return 0;
            case 8:
                ko6Var.f460419n = aVar2.g(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f460412d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "face_time_percentage", valueOf, false);
            eVar.d(jSONObject, "has_face_sticker", java.lang.Integer.valueOf(this.f460413e), false);
            eVar.d(jSONObject, "has_overlay_sticker", java.lang.Integer.valueOf(this.f460414f), false);
            eVar.d(jSONObject, "likely_defective", java.lang.Integer.valueOf(this.f460415g), false);
            eVar.d(jSONObject, "has_storyline_edited", java.lang.Integer.valueOf(this.f460416h), false);
            eVar.d(jSONObject, "original_check_sum", this.f460417i, false);
            eVar.d(jSONObject, "calculate_check_sum", this.f460418m, false);
            eVar.d(jSONObject, "has_3d_layer", java.lang.Integer.valueOf(this.f460419n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
