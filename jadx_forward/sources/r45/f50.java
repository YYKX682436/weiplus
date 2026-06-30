package r45;

/* loaded from: classes4.dex */
public class f50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f455546d;

    /* renamed from: e, reason: collision with root package name */
    public int f455547e;

    /* renamed from: f, reason: collision with root package name */
    public int f455548f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f455549g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f455550h;

    /* renamed from: i, reason: collision with root package name */
    public long f455551i;

    /* renamed from: m, reason: collision with root package name */
    public int f455552m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455553n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f50)) {
            return false;
        }
        r45.f50 f50Var = (r45.f50) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f455546d), java.lang.Long.valueOf(f50Var.f455546d)) && n51.f.a(java.lang.Integer.valueOf(this.f455547e), java.lang.Integer.valueOf(f50Var.f455547e)) && n51.f.a(java.lang.Integer.valueOf(this.f455548f), java.lang.Integer.valueOf(f50Var.f455548f)) && n51.f.a(this.f455549g, f50Var.f455549g) && n51.f.a(this.f455550h, f50Var.f455550h) && n51.f.a(java.lang.Long.valueOf(this.f455551i), java.lang.Long.valueOf(f50Var.f455551i)) && n51.f.a(java.lang.Integer.valueOf(this.f455552m), java.lang.Integer.valueOf(f50Var.f455552m)) && n51.f.a(this.f455553n, f50Var.f455553n);
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
                        case -1490206402:
                            if (next.equals("qrcode_url")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1438342585:
                            if (next.equals("invitation_expire_time")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -559170823:
                            if (next.equals("settlement_mode")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 3506294:
                            if (next.equals("role")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 294537048:
                            if (next.equals("invitation_status")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 589164048:
                            if (next.equals("initiator_contact")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 783410305:
                            if (next.equals("invitee_list")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 851453825:
                            if (next.equals("invitation_id")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f455546d = jSONObject.optLong(next);
                            break;
                        case 1:
                            this.f455547e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f455548f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        this.f455549g.add((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa().mo75930xb5cb93b2(((org.json.JSONObject) obj).toString()));
                                    }
                                }
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (opt2 instanceof org.json.JSONObject) {
                                this.f455550h = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa().mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            this.f455551i = jSONObject.optLong(next);
                            break;
                        case 6:
                            this.f455552m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f455553n = (java.lang.String) jSONObject.opt(next);
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
        java.util.LinkedList linkedList = this.f455549g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f455546d);
            fVar.e(2, this.f455547e);
            fVar.e(3, this.f455548f);
            fVar.g(4, 8, linkedList);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f455550h;
            if (c19782x23db1cfa != null) {
                fVar.i(5, c19782x23db1cfa.mo75928xcd1e8d8());
                this.f455550h.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f455551i);
            fVar.e(7, this.f455552m);
            java.lang.String str = this.f455553n;
            if (str != null) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f455546d) + 0 + b36.f.e(2, this.f455547e) + b36.f.e(3, this.f455548f) + b36.f.g(4, 8, linkedList);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = this.f455550h;
            if (c19782x23db1cfa2 != null) {
                h17 += b36.f.i(5, c19782x23db1cfa2.mo75928xcd1e8d8());
            }
            int h18 = h17 + b36.f.h(6, this.f455551i) + b36.f.e(7, this.f455552m);
            java.lang.String str2 = this.f455553n;
            return str2 != null ? h18 + b36.f.j(8, str2) : h18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.f50 f50Var = (r45.f50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f50Var.f455546d = aVar2.i(intValue);
                return 0;
            case 2:
                f50Var.f455547e = aVar2.g(intValue);
                return 0;
            case 3:
                f50Var.f455548f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                    if (bArr2 != null && bArr2.length > 0) {
                        c19782x23db1cfa3.mo11468x92b714fd(bArr2);
                    }
                    f50Var.f455549g.add(c19782x23db1cfa3);
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                    if (bArr3 != null && bArr3.length > 0) {
                        c19782x23db1cfa4.mo11468x92b714fd(bArr3);
                    }
                    f50Var.f455550h = c19782x23db1cfa4;
                }
                return 0;
            case 6:
                f50Var.f455551i = aVar2.i(intValue);
                return 0;
            case 7:
                f50Var.f455552m = aVar2.g(intValue);
                return 0;
            case 8:
                f50Var.f455553n = aVar2.k(intValue);
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
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f455546d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "invitation_id", valueOf, true);
            eVar.d(jSONObject, "invitation_status", java.lang.Integer.valueOf(this.f455547e), true);
            eVar.d(jSONObject, "settlement_mode", java.lang.Integer.valueOf(this.f455548f), true);
            eVar.d(jSONObject, "invitee_list", this.f455549g, true);
            eVar.d(jSONObject, "initiator_contact", this.f455550h, true);
            eVar.d(jSONObject, "invitation_expire_time", java.lang.Long.valueOf(this.f455551i), true);
            eVar.d(jSONObject, "role", java.lang.Integer.valueOf(this.f455552m), true);
            eVar.d(jSONObject, "qrcode_url", this.f455553n, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
