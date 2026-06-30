package r45;

/* loaded from: classes4.dex */
public class qg3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.d66 f465493d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465494e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465495f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f465496g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public r45.am0 f465497h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465498i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qg3)) {
            return false;
        }
        r45.qg3 qg3Var = (r45.qg3) fVar;
        return n51.f.a(this.f76492x92037252, qg3Var.f76492x92037252) && n51.f.a(this.f465493d, qg3Var.f465493d) && n51.f.a(this.f465494e, qg3Var.f465494e) && n51.f.a(this.f465495f, qg3Var.f465495f) && n51.f.a(this.f465496g, qg3Var.f465496g) && n51.f.a(this.f465497h, qg3Var.f465497h) && n51.f.a(this.f465498i, qg3Var.f465498i);
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
                        case -1980299928:
                            if (next.equals("uplink_url_info")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1845267886:
                            if (next.equals("BaseResponse")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1786037690:
                            if (next.equals("expired_time_info")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -1728549842:
                            if (next.equals("logicresp")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1116517017:
                            if (next.equals("gateway_ticket")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -964944331:
                            if (next.equals("resp_spam_info")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 104192092:
                            if (next.equals("msgid")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof org.json.JSONObject) {
                                this.f76492x92037252 = (r45.ie) new r45.ie().mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (opt2 instanceof org.json.JSONObject) {
                                r45.d66 d66Var = new r45.d66();
                                d66Var.mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                                this.f465493d = d66Var;
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (opt3 instanceof java.lang.String) {
                                this.f465494e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt3, 0));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            this.f465495f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (opt4 instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt4;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        java.util.LinkedList linkedList = this.f465496g;
                                        r45.ot6 ot6Var = new r45.ot6();
                                        ot6Var.mo75930xb5cb93b2(((org.json.JSONObject) obj).toString());
                                        linkedList.add(ot6Var);
                                    }
                                }
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (opt5 instanceof org.json.JSONObject) {
                                r45.am0 am0Var = new r45.am0();
                                am0Var.mo75930xb5cb93b2(((org.json.JSONObject) opt5).toString());
                                this.f465497h = am0Var;
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (opt6 instanceof java.lang.String) {
                                this.f465498i = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt6, 0));
                                break;
                            } else {
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
        java.util.LinkedList linkedList = this.f465496g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.d66 d66Var = this.f465493d;
            if (d66Var != null) {
                fVar.i(2, d66Var.mo75928xcd1e8d8());
                this.f465493d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465494e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str = this.f465495f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 8, linkedList);
            r45.am0 am0Var = this.f465497h;
            if (am0Var != null) {
                fVar.i(6, am0Var.mo75928xcd1e8d8());
                this.f465497h.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465498i;
            if (gVar2 != null) {
                fVar.b(7, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.d66 d66Var2 = this.f465493d;
            if (d66Var2 != null) {
                i18 += b36.f.i(2, d66Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f465494e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            java.lang.String str2 = this.f465495f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList);
            r45.am0 am0Var2 = this.f465497h;
            if (am0Var2 != null) {
                g17 += b36.f.i(6, am0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f465498i;
            return gVar4 != null ? g17 + b36.f.b(7, gVar4) : g17;
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
        r45.qg3 qg3Var = (r45.qg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    qg3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.d66 d66Var3 = new r45.d66();
                    if (bArr3 != null && bArr3.length > 0) {
                        d66Var3.mo11468x92b714fd(bArr3);
                    }
                    qg3Var.f465493d = d66Var3;
                }
                return 0;
            case 3:
                qg3Var.f465494e = aVar2.d(intValue);
                return 0;
            case 4:
                qg3Var.f465495f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ot6 ot6Var = new r45.ot6();
                    if (bArr4 != null && bArr4.length > 0) {
                        ot6Var.mo11468x92b714fd(bArr4);
                    }
                    qg3Var.f465496g.add(ot6Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.am0 am0Var3 = new r45.am0();
                    if (bArr5 != null && bArr5.length > 0) {
                        am0Var3.mo11468x92b714fd(bArr5);
                    }
                    qg3Var.f465497h = am0Var3;
                }
                return 0;
            case 7:
                qg3Var.f465498i = aVar2.d(intValue);
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
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "logicresp", this.f465493d, false);
            eVar.d(jSONObject, "resp_spam_info", this.f465494e, false);
            eVar.d(jSONObject, "msgid", this.f465495f, false);
            eVar.d(jSONObject, "uplink_url_info", this.f465496g, false);
            eVar.d(jSONObject, "expired_time_info", this.f465497h, false);
            eVar.d(jSONObject, "gateway_ticket", this.f465498i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
