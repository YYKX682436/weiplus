package r45;

/* loaded from: classes10.dex */
public class dx5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454365e;

    /* renamed from: f, reason: collision with root package name */
    public int f454366f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454367g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g05 f454368h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454369i;

    /* renamed from: m, reason: collision with root package name */
    public int f454370m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454371n;

    /* renamed from: o, reason: collision with root package name */
    public r45.fw5 f454372o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dx5)) {
            return false;
        }
        r45.dx5 dx5Var = (r45.dx5) fVar;
        return n51.f.a(this.f454364d, dx5Var.f454364d) && n51.f.a(this.f454365e, dx5Var.f454365e) && n51.f.a(java.lang.Integer.valueOf(this.f454366f), java.lang.Integer.valueOf(dx5Var.f454366f)) && n51.f.a(this.f454367g, dx5Var.f454367g) && n51.f.a(this.f454368h, dx5Var.f454368h) && n51.f.a(this.f454369i, dx5Var.f454369i) && n51.f.a(java.lang.Integer.valueOf(this.f454370m), java.lang.Integer.valueOf(dx5Var.f454370m)) && n51.f.a(this.f454371n, dx5Var.f454371n) && n51.f.a(this.f454372o, dx5Var.f454372o);
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
                        case -1569063082:
                            if (next.equals("openim_finder_info")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1125980387:
                            if (next.equals("tp_type")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -1101837319:
                            if (next.equals("search_contact_context")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -1068855134:
                            if (next.equals("mobile")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 116079:
                            if (next.equals("url")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 109254796:
                            if (next.equals(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 171880113:
                            if (next.equals("tp_qrcode")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 253328057:
                            if (next.equals("spam_context")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 893190521:
                            if (next.equals("tp_multi_user_qrcode")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f454364d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f454365e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f454366f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f454367g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.g05 g05Var = new r45.g05();
                                g05Var.mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                this.f454368h = g05Var;
                                break;
                            }
                        case 5:
                            this.f454369i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f454370m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f454371n = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt2, 0));
                                break;
                            }
                        case '\b':
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.fw5 fw5Var = new r45.fw5();
                                fw5Var.mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                                this.f454372o = fw5Var;
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
            java.lang.String str = this.f454364d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454365e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f454366f);
            java.lang.String str3 = this.f454367g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.g05 g05Var = this.f454368h;
            if (g05Var != null) {
                fVar.i(5, g05Var.mo75928xcd1e8d8());
                this.f454368h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f454369i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f454370m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454371n;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            r45.fw5 fw5Var = this.f454372o;
            if (fw5Var != null) {
                fVar.i(9, fw5Var.mo75928xcd1e8d8());
                this.f454372o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f454364d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f454365e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f454366f);
            java.lang.String str7 = this.f454367g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            r45.g05 g05Var2 = this.f454368h;
            if (g05Var2 != null) {
                e17 += b36.f.i(5, g05Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f454369i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int e18 = e17 + b36.f.e(7, this.f454370m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454371n;
            if (gVar2 != null) {
                e18 += b36.f.b(8, gVar2);
            }
            r45.fw5 fw5Var2 = this.f454372o;
            return fw5Var2 != null ? e18 + b36.f.i(9, fw5Var2.mo75928xcd1e8d8()) : e18;
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
        r45.dx5 dx5Var = (r45.dx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dx5Var.f454364d = aVar2.k(intValue);
                return 0;
            case 2:
                dx5Var.f454365e = aVar2.k(intValue);
                return 0;
            case 3:
                dx5Var.f454366f = aVar2.g(intValue);
                return 0;
            case 4:
                dx5Var.f454367g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.g05 g05Var3 = new r45.g05();
                    if (bArr != null && bArr.length > 0) {
                        g05Var3.mo11468x92b714fd(bArr);
                    }
                    dx5Var.f454368h = g05Var3;
                }
                return 0;
            case 6:
                dx5Var.f454369i = aVar2.k(intValue);
                return 0;
            case 7:
                dx5Var.f454370m = aVar2.g(intValue);
                return 0;
            case 8:
                dx5Var.f454371n = aVar2.d(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.fw5 fw5Var3 = new r45.fw5();
                    if (bArr2 != null && bArr2.length > 0) {
                        fw5Var3.mo11468x92b714fd(bArr2);
                    }
                    dx5Var.f454372o = fw5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
