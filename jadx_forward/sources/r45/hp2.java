package r45;

/* loaded from: classes2.dex */
public class hp2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.u56 f457907d;

    /* renamed from: e, reason: collision with root package name */
    public r45.u56 f457908e;

    /* renamed from: f, reason: collision with root package name */
    public long f457909f;

    /* renamed from: g, reason: collision with root package name */
    public r45.fp2 f457910g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hp2)) {
            return false;
        }
        r45.hp2 hp2Var = (r45.hp2) fVar;
        return n51.f.a(this.f457907d, hp2Var.f457907d) && n51.f.a(this.f457908e, hp2Var.f457908e) && n51.f.a(java.lang.Long.valueOf(this.f457909f), java.lang.Long.valueOf(hp2Var.f457909f)) && n51.f.a(this.f457910g, hp2Var.f457910g);
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
                        case -2069530047:
                            if (next.equals("card_show_info")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1215479629:
                            if (next.equals("display_tab_flag")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1663305917:
                            if (next.equals("bubble_show_info")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1794168423:
                            if (next.equals("display_timing")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            r45.u56 u56Var = new r45.u56();
                            u56Var.mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                            this.f457907d = u56Var;
                        }
                    } else if (c17 == 1) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONObject) {
                            r45.u56 u56Var2 = new r45.u56();
                            u56Var2.mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                            this.f457908e = u56Var2;
                        }
                    } else if (c17 == 2) {
                        this.f457909f = jSONObject.optLong(next);
                    } else if (c17 == 3) {
                        java.lang.Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof org.json.JSONObject) {
                            r45.fp2 fp2Var = new r45.fp2();
                            fp2Var.mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                            this.f457910g = fp2Var;
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
            r45.u56 u56Var = this.f457907d;
            if (u56Var != null) {
                fVar.i(1, u56Var.mo75928xcd1e8d8());
                this.f457907d.mo75956x3d5d1f78(fVar);
            }
            r45.u56 u56Var2 = this.f457908e;
            if (u56Var2 != null) {
                fVar.i(2, u56Var2.mo75928xcd1e8d8());
                this.f457908e.mo75956x3d5d1f78(fVar);
            }
            fVar.h(3, this.f457909f);
            r45.fp2 fp2Var = this.f457910g;
            if (fp2Var != null) {
                fVar.i(4, fp2Var.mo75928xcd1e8d8());
                this.f457910g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.u56 u56Var3 = this.f457907d;
            int i18 = u56Var3 != null ? 0 + b36.f.i(1, u56Var3.mo75928xcd1e8d8()) : 0;
            r45.u56 u56Var4 = this.f457908e;
            if (u56Var4 != null) {
                i18 += b36.f.i(2, u56Var4.mo75928xcd1e8d8());
            }
            int h17 = i18 + b36.f.h(3, this.f457909f);
            r45.fp2 fp2Var2 = this.f457910g;
            return fp2Var2 != null ? h17 + b36.f.i(4, fp2Var2.mo75928xcd1e8d8()) : h17;
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
        r45.hp2 hp2Var = (r45.hp2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.u56 u56Var5 = new r45.u56();
                if (bArr != null && bArr.length > 0) {
                    u56Var5.mo11468x92b714fd(bArr);
                }
                hp2Var.f457907d = u56Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.u56 u56Var6 = new r45.u56();
                if (bArr2 != null && bArr2.length > 0) {
                    u56Var6.mo11468x92b714fd(bArr2);
                }
                hp2Var.f457908e = u56Var6;
            }
            return 0;
        }
        if (intValue == 3) {
            hp2Var.f457909f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.fp2 fp2Var3 = new r45.fp2();
            if (bArr3 != null && bArr3.length > 0) {
                fp2Var3.mo11468x92b714fd(bArr3);
            }
            hp2Var.f457910g = fp2Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.u56 u56Var = this.f457907d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "card_show_info", u56Var, true);
            eVar.d(jSONObject, "bubble_show_info", this.f457908e, true);
            eVar.d(jSONObject, "display_tab_flag", java.lang.Long.valueOf(this.f457909f), true);
            eVar.d(jSONObject, "display_timing", this.f457910g, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
