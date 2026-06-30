package r45;

/* loaded from: classes10.dex */
public class fw5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456186d;

    /* renamed from: e, reason: collision with root package name */
    public int f456187e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456188f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vm4 f456189g;

    /* renamed from: h, reason: collision with root package name */
    public r45.u2 f456190h;

    /* renamed from: i, reason: collision with root package name */
    public r45.nu3 f456191i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fw5)) {
            return false;
        }
        r45.fw5 fw5Var = (r45.fw5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456186d), java.lang.Integer.valueOf(fw5Var.f456186d)) && n51.f.a(java.lang.Integer.valueOf(this.f456187e), java.lang.Integer.valueOf(fw5Var.f456187e)) && n51.f.a(this.f456188f, fw5Var.f456188f) && n51.f.a(this.f456189g, fw5Var.f456189g) && n51.f.a(this.f456190h, fw5Var.f456190h) && n51.f.a(this.f456191i, fw5Var.f456191i);
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
                        case -1957430851:
                            if (next.equals("miniprogram_context")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1253585859:
                            if (next.equals("h5_context")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -284708993:
                            if (next.equals("geta8key_scene")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -43415091:
                            if (next.equals("sub_scene")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1070994835:
                            if (next.equals("ad_context")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1106582040:
                            if (next.equals("search_context")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f456186d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        this.f456187e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        this.f456188f = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            r45.vm4 vm4Var = new r45.vm4();
                            vm4Var.mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                            this.f456189g = vm4Var;
                        }
                    } else if (c17 == 4) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONObject) {
                            r45.u2 u2Var = new r45.u2();
                            u2Var.mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                            this.f456190h = u2Var;
                        }
                    } else if (c17 == 5) {
                        java.lang.Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof org.json.JSONObject) {
                            r45.nu3 nu3Var = new r45.nu3();
                            nu3Var.mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                            this.f456191i = nu3Var;
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
            fVar.e(1, this.f456186d);
            fVar.e(2, this.f456187e);
            java.lang.String str = this.f456188f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.vm4 vm4Var = this.f456189g;
            if (vm4Var != null) {
                fVar.i(4, vm4Var.mo75928xcd1e8d8());
                this.f456189g.mo75956x3d5d1f78(fVar);
            }
            r45.u2 u2Var = this.f456190h;
            if (u2Var != null) {
                fVar.i(5, u2Var.mo75928xcd1e8d8());
                this.f456190h.mo75956x3d5d1f78(fVar);
            }
            r45.nu3 nu3Var = this.f456191i;
            if (nu3Var != null) {
                fVar.i(6, nu3Var.mo75928xcd1e8d8());
                this.f456191i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456186d) + 0 + b36.f.e(2, this.f456187e);
            java.lang.String str2 = this.f456188f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            r45.vm4 vm4Var2 = this.f456189g;
            if (vm4Var2 != null) {
                e17 += b36.f.i(4, vm4Var2.mo75928xcd1e8d8());
            }
            r45.u2 u2Var2 = this.f456190h;
            if (u2Var2 != null) {
                e17 += b36.f.i(5, u2Var2.mo75928xcd1e8d8());
            }
            r45.nu3 nu3Var2 = this.f456191i;
            return nu3Var2 != null ? e17 + b36.f.i(6, nu3Var2.mo75928xcd1e8d8()) : e17;
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
        r45.fw5 fw5Var = (r45.fw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fw5Var.f456186d = aVar2.g(intValue);
                return 0;
            case 2:
                fw5Var.f456187e = aVar2.g(intValue);
                return 0;
            case 3:
                fw5Var.f456188f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.vm4 vm4Var3 = new r45.vm4();
                    if (bArr != null && bArr.length > 0) {
                        vm4Var3.mo11468x92b714fd(bArr);
                    }
                    fw5Var.f456189g = vm4Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.u2 u2Var3 = new r45.u2();
                    if (bArr2 != null && bArr2.length > 0) {
                        u2Var3.mo11468x92b714fd(bArr2);
                    }
                    fw5Var.f456190h = u2Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.nu3 nu3Var3 = new r45.nu3();
                    if (bArr3 != null && bArr3.length > 0) {
                        nu3Var3.mo11468x92b714fd(bArr3);
                    }
                    fw5Var.f456191i = nu3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
