package r45;

/* loaded from: classes4.dex */
public class ve1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469683d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469684e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f469685f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f469686g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ve1)) {
            return false;
        }
        r45.ve1 ve1Var = (r45.ve1) fVar;
        return n51.f.a(this.f469683d, ve1Var.f469683d) && n51.f.a(this.f469684e, ve1Var.f469684e) && n51.f.a(this.f469685f, ve1Var.f469685f) && n51.f.a(java.lang.Boolean.valueOf(this.f469686g), java.lang.Boolean.valueOf(ve1Var.f469686g));
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
                        case -1933542537:
                            if (next.equals("agreement_update_title")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1350800053:
                            if (next.equals("agreement_items")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -613876125:
                            if (next.equals("enable_backend_agreement")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -449723944:
                            if (next.equals("agreement_update_content")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f469683d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f469684e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                java.lang.Object obj = jSONArray.get(i17);
                                if (obj instanceof org.json.JSONObject) {
                                    java.util.LinkedList linkedList = this.f469685f;
                                    r45.s6 s6Var = new r45.s6();
                                    s6Var.mo75930xb5cb93b2(((org.json.JSONObject) obj).toString());
                                    linkedList.add(s6Var);
                                }
                            }
                        }
                    } else if (c17 == 3) {
                        this.f469686g = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469685f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469683d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469684e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            fVar.a(4, this.f469686g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f469683d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f469684e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, linkedList) + b36.f.a(4, this.f469686g);
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
        r45.ve1 ve1Var = (r45.ve1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ve1Var.f469683d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ve1Var.f469684e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            ve1Var.f469686g = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.s6 s6Var = new r45.s6();
            if (bArr2 != null && bArr2.length > 0) {
                s6Var.mo11468x92b714fd(bArr2);
            }
            ve1Var.f469685f.add(s6Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f469683d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "agreement_update_title", str, true);
            eVar.d(jSONObject, "agreement_update_content", this.f469684e, true);
            eVar.d(jSONObject, "agreement_items", this.f469685f, true);
            eVar.d(jSONObject, "enable_backend_agreement", java.lang.Boolean.valueOf(this.f469686g), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
