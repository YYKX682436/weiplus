package r45;

/* loaded from: classes2.dex */
public class d96 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453786d;

    /* renamed from: e, reason: collision with root package name */
    public int f453787e;

    /* renamed from: f, reason: collision with root package name */
    public int f453788f;

    /* renamed from: g, reason: collision with root package name */
    public int f453789g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453790h;

    /* renamed from: i, reason: collision with root package name */
    public long f453791i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d96)) {
            return false;
        }
        r45.d96 d96Var = (r45.d96) fVar;
        return n51.f.a(this.f453786d, d96Var.f453786d) && n51.f.a(java.lang.Integer.valueOf(this.f453787e), java.lang.Integer.valueOf(d96Var.f453787e)) && n51.f.a(java.lang.Integer.valueOf(this.f453788f), java.lang.Integer.valueOf(d96Var.f453788f)) && n51.f.a(java.lang.Integer.valueOf(this.f453789g), java.lang.Integer.valueOf(d96Var.f453789g)) && n51.f.a(this.f453790h, d96Var.f453790h) && n51.f.a(java.lang.Long.valueOf(this.f453791i), java.lang.Long.valueOf(d96Var.f453791i));
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
                        case -1785553152:
                            if (next.equals("image_file_size")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1773565470:
                            if (next.equals("image_width")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -877823861:
                            if (next.equals("image_url")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -29843098:
                            if (next.equals("sns_image_id")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 421050507:
                            if (next.equals("image_height")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 604341972:
                            if (next.equals("image_signature")) {
                                c17 = 4;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f453786d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f453787e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        this.f453788f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f453789g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 4) {
                        this.f453790h = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 5) {
                        this.f453791i = jSONObject.optLong(next);
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
            java.lang.String str = this.f453786d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f453787e);
            fVar.e(3, this.f453788f);
            fVar.e(4, this.f453789g);
            java.lang.String str2 = this.f453790h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f453791i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f453786d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f453787e) + b36.f.e(3, this.f453788f) + b36.f.e(4, this.f453789g);
            java.lang.String str4 = this.f453790h;
            if (str4 != null) {
                j17 += b36.f.j(5, str4);
            }
            return j17 + b36.f.h(6, this.f453791i);
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
        r45.d96 d96Var = (r45.d96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d96Var.f453786d = aVar2.k(intValue);
                return 0;
            case 2:
                d96Var.f453787e = aVar2.g(intValue);
                return 0;
            case 3:
                d96Var.f453788f = aVar2.g(intValue);
                return 0;
            case 4:
                d96Var.f453789g = aVar2.g(intValue);
                return 0;
            case 5:
                d96Var.f453790h = aVar2.k(intValue);
                return 0;
            case 6:
                d96Var.f453791i = aVar2.i(intValue);
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
            java.lang.String str = this.f453786d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "image_url", str, false);
            eVar.d(jSONObject, "image_width", java.lang.Integer.valueOf(this.f453787e), false);
            eVar.d(jSONObject, "image_height", java.lang.Integer.valueOf(this.f453788f), false);
            eVar.d(jSONObject, "image_file_size", java.lang.Integer.valueOf(this.f453789g), false);
            eVar.d(jSONObject, "image_signature", this.f453790h, false);
            eVar.d(jSONObject, "sns_image_id", java.lang.Long.valueOf(this.f453791i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
