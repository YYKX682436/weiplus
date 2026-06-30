package r45;

/* loaded from: classes2.dex */
public class sh4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467257d;

    /* renamed from: e, reason: collision with root package name */
    public int f467258e;

    /* renamed from: f, reason: collision with root package name */
    public r45.e64 f467259f;

    /* renamed from: g, reason: collision with root package name */
    public int f467260g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467261h;

    /* renamed from: i, reason: collision with root package name */
    public long f467262i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f467263m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467264n;

    /* renamed from: o, reason: collision with root package name */
    public r45.j30 f467265o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f467266p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f467267q;

    /* renamed from: r, reason: collision with root package name */
    public int f467268r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sh4)) {
            return false;
        }
        r45.sh4 sh4Var = (r45.sh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467257d), java.lang.Integer.valueOf(sh4Var.f467257d)) && n51.f.a(java.lang.Integer.valueOf(this.f467258e), java.lang.Integer.valueOf(sh4Var.f467258e)) && n51.f.a(this.f467259f, sh4Var.f467259f) && n51.f.a(java.lang.Integer.valueOf(this.f467260g), java.lang.Integer.valueOf(sh4Var.f467260g)) && n51.f.a(this.f467261h, sh4Var.f467261h) && n51.f.a(java.lang.Long.valueOf(this.f467262i), java.lang.Long.valueOf(sh4Var.f467262i)) && n51.f.a(this.f467263m, sh4Var.f467263m) && n51.f.a(this.f467264n, sh4Var.f467264n) && n51.f.a(this.f467265o, sh4Var.f467265o) && n51.f.a(this.f467266p, sh4Var.f467266p) && n51.f.a(this.f467267q, sh4Var.f467267q) && n51.f.a(java.lang.Integer.valueOf(this.f467268r), java.lang.Integer.valueOf(sh4Var.f467268r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467266p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467257d);
            fVar.e(2, this.f467258e);
            r45.e64 e64Var = this.f467259f;
            if (e64Var != null) {
                fVar.i(3, e64Var.mo75928xcd1e8d8());
                this.f467259f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f467260g);
            java.lang.String str = this.f467261h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.h(6, this.f467262i);
            java.lang.String str2 = this.f467263m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f467264n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.j30 j30Var = this.f467265o;
            if (j30Var != null) {
                fVar.i(9, j30Var.mo75928xcd1e8d8());
                this.f467265o.mo75956x3d5d1f78(fVar);
            }
            fVar.g(10, 8, linkedList);
            java.lang.String str4 = this.f467267q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.e(12, this.f467268r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467257d) + 0 + b36.f.e(2, this.f467258e);
            r45.e64 e64Var2 = this.f467259f;
            if (e64Var2 != null) {
                e17 += b36.f.i(3, e64Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(4, this.f467260g);
            java.lang.String str5 = this.f467261h;
            if (str5 != null) {
                e18 += b36.f.j(5, str5);
            }
            int h17 = e18 + b36.f.h(6, this.f467262i);
            java.lang.String str6 = this.f467263m;
            if (str6 != null) {
                h17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f467264n;
            if (str7 != null) {
                h17 += b36.f.j(8, str7);
            }
            r45.j30 j30Var2 = this.f467265o;
            if (j30Var2 != null) {
                h17 += b36.f.i(9, j30Var2.mo75928xcd1e8d8());
            }
            int g17 = h17 + b36.f.g(10, 8, linkedList);
            java.lang.String str8 = this.f467267q;
            if (str8 != null) {
                g17 += b36.f.j(11, str8);
            }
            return g17 + b36.f.e(12, this.f467268r);
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
        r45.sh4 sh4Var = (r45.sh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sh4Var.f467257d = aVar2.g(intValue);
                return 0;
            case 2:
                sh4Var.f467258e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.mo11468x92b714fd(bArr2);
                    }
                    sh4Var.f467259f = e64Var3;
                }
                return 0;
            case 4:
                sh4Var.f467260g = aVar2.g(intValue);
                return 0;
            case 5:
                sh4Var.f467261h = aVar2.k(intValue);
                return 0;
            case 6:
                sh4Var.f467262i = aVar2.i(intValue);
                return 0;
            case 7:
                sh4Var.f467263m = aVar2.k(intValue);
                return 0;
            case 8:
                sh4Var.f467264n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr3 != null && bArr3.length > 0) {
                        j30Var3.mo11468x92b714fd(bArr3);
                    }
                    sh4Var.f467265o = j30Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr4 != null && bArr4.length > 0) {
                        x50Var.mo11468x92b714fd(bArr4);
                    }
                    sh4Var.f467266p.add(x50Var);
                }
                return 0;
            case 11:
                sh4Var.f467267q = aVar2.k(intValue);
                return 0;
            case 12:
                sh4Var.f467268r = aVar2.g(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f467257d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f467258e), false);
            eVar.d(jSONObject, "Location", this.f467259f, false);
            eVar.d(jSONObject, "BusinessType", java.lang.Integer.valueOf(this.f467260g), false);
            eVar.d(jSONObject, "Language", this.f467261h, false);
            eVar.d(jSONObject, "ConfigParam", java.lang.Long.valueOf(this.f467262i), false);
            eVar.d(jSONObject, "SessionId", this.f467263m, false);
            eVar.d(jSONObject, "GuideInfo", this.f467264n, false);
            eVar.d(jSONObject, "ChildMode", this.f467265o, false);
            eVar.d(jSONObject, "ExtReqParams", this.f467266p, false);
            eVar.d(jSONObject, "RequestId", this.f467267q, false);
            eVar.d(jSONObject, "Reqtype", java.lang.Integer.valueOf(this.f467268r), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
