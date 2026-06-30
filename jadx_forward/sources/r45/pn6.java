package r45;

/* loaded from: classes15.dex */
public class pn6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464769d;

    /* renamed from: e, reason: collision with root package name */
    public int f464770e;

    /* renamed from: f, reason: collision with root package name */
    public int f464771f;

    /* renamed from: g, reason: collision with root package name */
    public int f464772g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464773h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464774i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464775m;

    /* renamed from: n, reason: collision with root package name */
    public r45.on6 f464776n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f464777o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pn6)) {
            return false;
        }
        r45.pn6 pn6Var = (r45.pn6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464769d), java.lang.Integer.valueOf(pn6Var.f464769d)) && n51.f.a(java.lang.Integer.valueOf(this.f464770e), java.lang.Integer.valueOf(pn6Var.f464770e)) && n51.f.a(java.lang.Integer.valueOf(this.f464771f), java.lang.Integer.valueOf(pn6Var.f464771f)) && n51.f.a(java.lang.Integer.valueOf(this.f464772g), java.lang.Integer.valueOf(pn6Var.f464772g)) && n51.f.a(this.f464773h, pn6Var.f464773h) && n51.f.a(this.f464774i, pn6Var.f464774i) && n51.f.a(this.f464775m, pn6Var.f464775m) && n51.f.a(this.f464776n, pn6Var.f464776n) && n51.f.a(java.lang.Boolean.valueOf(this.f464777o), java.lang.Boolean.valueOf(pn6Var.f464777o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464769d);
            fVar.e(2, this.f464770e);
            fVar.e(3, this.f464771f);
            fVar.e(4, this.f464772g);
            java.lang.String str = this.f464773h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f464774i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f464775m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.on6 on6Var = this.f464776n;
            if (on6Var != null) {
                fVar.i(8, on6Var.mo75928xcd1e8d8());
                this.f464776n.mo75956x3d5d1f78(fVar);
            }
            fVar.a(9, this.f464777o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464769d) + 0 + b36.f.e(2, this.f464770e) + b36.f.e(3, this.f464771f) + b36.f.e(4, this.f464772g);
            java.lang.String str4 = this.f464773h;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            java.lang.String str5 = this.f464774i;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f464775m;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            r45.on6 on6Var2 = this.f464776n;
            if (on6Var2 != null) {
                e17 += b36.f.i(8, on6Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.a(9, this.f464777o);
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
        r45.pn6 pn6Var = (r45.pn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pn6Var.f464769d = aVar2.g(intValue);
                return 0;
            case 2:
                pn6Var.f464770e = aVar2.g(intValue);
                return 0;
            case 3:
                pn6Var.f464771f = aVar2.g(intValue);
                return 0;
            case 4:
                pn6Var.f464772g = aVar2.g(intValue);
                return 0;
            case 5:
                pn6Var.f464773h = aVar2.k(intValue);
                return 0;
            case 6:
                pn6Var.f464774i = aVar2.k(intValue);
                return 0;
            case 7:
                pn6Var.f464775m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.on6 on6Var3 = new r45.on6();
                    if (bArr != null && bArr.length > 0) {
                        on6Var3.mo11468x92b714fd(bArr);
                    }
                    pn6Var.f464776n = on6Var3;
                }
                return 0;
            case 9:
                pn6Var.f464777o = aVar2.c(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f464769d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "beginTime", valueOf, false);
            eVar.d(jSONObject, "endTime", java.lang.Integer.valueOf(this.f464770e), false);
            eVar.d(jSONObject, "minShowTime", java.lang.Integer.valueOf(this.f464771f), false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f464772g), false);
            eVar.d(jSONObject, dm.i4.f66865x76d1ec5a, this.f464773h, false);
            eVar.d(jSONObject, "subId", this.f464774i, false);
            eVar.d(jSONObject, "bizUin", this.f464775m, false);
            eVar.d(jSONObject, "videoDotInfo", this.f464776n, false);
            eVar.d(jSONObject, "isShow", java.lang.Boolean.valueOf(this.f464777o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
