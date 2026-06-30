package r45;

/* loaded from: classes8.dex */
public class fz2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f456274d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.st3 f456275e;

    /* renamed from: f, reason: collision with root package name */
    public r45.st3 f456276f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cr4 f456277g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fz2)) {
            return false;
        }
        r45.fz2 fz2Var = (r45.fz2) fVar;
        return n51.f.a(this.f456274d, fz2Var.f456274d) && n51.f.a(this.f456275e, fz2Var.f456275e) && n51.f.a(this.f456276f, fz2Var.f456276f) && n51.f.a(this.f456277g, fz2Var.f456277g);
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
                        case -382202216:
                            if (next.equals("orignal_attr")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 104993457:
                            if (next.equals("nodes")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 405921849:
                            if (next.equals("multi_level_dsl_render")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 759428452:
                            if (next.equals("thumbnail_attr")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                java.lang.Object obj = jSONArray.get(i17);
                                if (obj instanceof org.json.JSONObject) {
                                    java.util.LinkedList linkedList = this.f456274d;
                                    r45.cp5 cp5Var = new r45.cp5();
                                    cp5Var.mo75930xb5cb93b2(((org.json.JSONObject) obj).toString());
                                    linkedList.add(cp5Var);
                                }
                            }
                        }
                    } else if (c17 == 1) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONObject) {
                            r45.st3 st3Var = new r45.st3();
                            st3Var.mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                            this.f456275e = st3Var;
                        }
                    } else if (c17 == 2) {
                        java.lang.Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof org.json.JSONObject) {
                            r45.st3 st3Var2 = new r45.st3();
                            st3Var2.mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                            this.f456276f = st3Var2;
                        }
                    } else if (c17 == 3) {
                        java.lang.Object opt4 = jSONObject.opt(next);
                        if (opt4 instanceof org.json.JSONObject) {
                            r45.cr4 cr4Var = new r45.cr4();
                            cr4Var.mo75930xb5cb93b2(((org.json.JSONObject) opt4).toString());
                            this.f456277g = cr4Var;
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
            fVar.g(1, 8, this.f456274d);
            r45.st3 st3Var = this.f456275e;
            if (st3Var != null) {
                fVar.i(2, st3Var.mo75928xcd1e8d8());
                this.f456275e.mo75956x3d5d1f78(fVar);
            }
            r45.st3 st3Var2 = this.f456276f;
            if (st3Var2 != null) {
                fVar.i(3, st3Var2.mo75928xcd1e8d8());
                this.f456276f.mo75956x3d5d1f78(fVar);
            }
            r45.cr4 cr4Var = this.f456277g;
            if (cr4Var != null) {
                fVar.i(4, cr4Var.mo75928xcd1e8d8());
                this.f456277g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f456274d) + 0;
            r45.st3 st3Var3 = this.f456275e;
            if (st3Var3 != null) {
                g17 += b36.f.i(2, st3Var3.mo75928xcd1e8d8());
            }
            r45.st3 st3Var4 = this.f456276f;
            if (st3Var4 != null) {
                g17 += b36.f.i(3, st3Var4.mo75928xcd1e8d8());
            }
            r45.cr4 cr4Var2 = this.f456277g;
            return cr4Var2 != null ? g17 + b36.f.i(4, cr4Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456274d.clear();
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
        r45.fz2 fz2Var = (r45.fz2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.cp5 cp5Var = new r45.cp5();
                if (bArr2 != null && bArr2.length > 0) {
                    cp5Var.mo11468x92b714fd(bArr2);
                }
                fz2Var.f456274d.add(cp5Var);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.st3 st3Var5 = new r45.st3();
                if (bArr3 != null && bArr3.length > 0) {
                    st3Var5.mo11468x92b714fd(bArr3);
                }
                fz2Var.f456275e = st3Var5;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr4 = (byte[]) j19.get(i27);
                r45.st3 st3Var6 = new r45.st3();
                if (bArr4 != null && bArr4.length > 0) {
                    st3Var6.mo11468x92b714fd(bArr4);
                }
                fz2Var.f456276f = st3Var6;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr5 = (byte[]) j27.get(i28);
            r45.cr4 cr4Var3 = new r45.cr4();
            if (bArr5 != null && bArr5.length > 0) {
                cr4Var3.mo11468x92b714fd(bArr5);
            }
            fz2Var.f456277g = cr4Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.LinkedList linkedList = this.f456274d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "nodes", linkedList, true);
            eVar.d(jSONObject, "orignal_attr", this.f456275e, true);
            eVar.d(jSONObject, "thumbnail_attr", this.f456276f, true);
            eVar.d(jSONObject, "multi_level_dsl_render", this.f456277g, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
