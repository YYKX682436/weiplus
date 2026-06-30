package r45;

/* loaded from: classes8.dex */
public class s30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f466991d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f466992e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f466993f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f466994g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s30)) {
            return false;
        }
        r45.s30 s30Var = (r45.s30) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f466991d), java.lang.Boolean.valueOf(s30Var.f466991d)) && n51.f.a(this.f466992e, s30Var.f466992e) && n51.f.a(this.f466993f, s30Var.f466993f) && n51.f.a(this.f466994g, s30Var.f466994g);
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
                    int i17 = 0;
                    switch (next.hashCode()) {
                        case -1354792126:
                            if (next.equals("config")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1298848381:
                            if (next.equals("enable")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1220066020:
                            if (next.equals("clear_ctrl_type")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 64241494:
                            if (next.equals("clear_tab_type")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f466991d = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                    } else if (c17 == 1) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                            while (i17 < jSONArray.length()) {
                                this.f466992e.add(java.lang.Integer.valueOf(((java.lang.Integer) jSONArray.get(i17)).intValue()));
                                i17++;
                            }
                        }
                    } else if (c17 == 2) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt2;
                            while (i17 < jSONArray2.length()) {
                                this.f466993f.add(java.lang.Integer.valueOf(((java.lang.Integer) jSONArray2.get(i17)).intValue()));
                                i17++;
                            }
                        }
                    } else if (c17 == 3) {
                        java.lang.Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray3 = (org.json.JSONArray) opt3;
                            while (i17 < jSONArray3.length()) {
                                java.lang.Object obj = jSONArray3.get(i17);
                                if (obj instanceof org.json.JSONObject) {
                                    java.util.LinkedList linkedList = this.f466994g;
                                    r45.r30 r30Var = new r45.r30();
                                    r30Var.mo75930xb5cb93b2(((org.json.JSONObject) obj).toString());
                                    linkedList.add(r30Var);
                                }
                                i17++;
                            }
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
        java.util.LinkedList linkedList = this.f466994g;
        java.util.LinkedList linkedList2 = this.f466993f;
        java.util.LinkedList linkedList3 = this.f466992e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f466991d);
            fVar.g(2, 2, linkedList3);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f466991d) + 0 + b36.f.g(2, 2, linkedList3) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.s30 s30Var = (r45.s30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s30Var.f466991d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            s30Var.f466992e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 3) {
            s30Var.f466993f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.r30 r30Var = new r45.r30();
            if (bArr2 != null && bArr2.length > 0) {
                r30Var.mo11468x92b714fd(bArr2);
            }
            s30Var.f466994g.add(r30Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f466991d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "enable", valueOf, true);
            eVar.d(jSONObject, "clear_tab_type", this.f466992e, true);
            eVar.d(jSONObject, "clear_ctrl_type", this.f466993f, true);
            eVar.d(jSONObject, "config", this.f466994g, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
