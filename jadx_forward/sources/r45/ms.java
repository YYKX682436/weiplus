package r45;

/* loaded from: classes8.dex */
public class ms extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462303d;

    /* renamed from: e, reason: collision with root package name */
    public int f462304e;

    /* renamed from: f, reason: collision with root package name */
    public int f462305f;

    /* renamed from: g, reason: collision with root package name */
    public int f462306g;

    /* renamed from: h, reason: collision with root package name */
    public int f462307h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462309m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f462310n;

    /* renamed from: o, reason: collision with root package name */
    public int f462311o;

    /* renamed from: p, reason: collision with root package name */
    public int f462312p;

    /* renamed from: t, reason: collision with root package name */
    public int f462316t;

    /* renamed from: u, reason: collision with root package name */
    public int f462317u;

    /* renamed from: v, reason: collision with root package name */
    public int f462318v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f462319w;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f462308i = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f462313q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f462314r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f462315s = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ms)) {
            return false;
        }
        r45.ms msVar = (r45.ms) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462303d), java.lang.Integer.valueOf(msVar.f462303d)) && n51.f.a(java.lang.Integer.valueOf(this.f462304e), java.lang.Integer.valueOf(msVar.f462304e)) && n51.f.a(java.lang.Integer.valueOf(this.f462305f), java.lang.Integer.valueOf(msVar.f462305f)) && n51.f.a(java.lang.Integer.valueOf(this.f462306g), java.lang.Integer.valueOf(msVar.f462306g)) && n51.f.a(java.lang.Integer.valueOf(this.f462307h), java.lang.Integer.valueOf(msVar.f462307h)) && n51.f.a(this.f462308i, msVar.f462308i) && n51.f.a(this.f462309m, msVar.f462309m) && n51.f.a(this.f462310n, msVar.f462310n) && n51.f.a(java.lang.Integer.valueOf(this.f462311o), java.lang.Integer.valueOf(msVar.f462311o)) && n51.f.a(java.lang.Integer.valueOf(this.f462312p), java.lang.Integer.valueOf(msVar.f462312p)) && n51.f.a(this.f462313q, msVar.f462313q) && n51.f.a(this.f462314r, msVar.f462314r) && n51.f.a(this.f462315s, msVar.f462315s) && n51.f.a(java.lang.Integer.valueOf(this.f462316t), java.lang.Integer.valueOf(msVar.f462316t)) && n51.f.a(java.lang.Integer.valueOf(this.f462317u), java.lang.Integer.valueOf(msVar.f462317u)) && n51.f.a(java.lang.Integer.valueOf(this.f462318v), java.lang.Integer.valueOf(msVar.f462318v)) && n51.f.a(this.f462319w, msVar.f462319w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462315s;
        java.util.LinkedList linkedList2 = this.f462314r;
        java.util.LinkedList linkedList3 = this.f462313q;
        java.util.LinkedList linkedList4 = this.f462308i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462303d);
            fVar.e(2, this.f462304e);
            fVar.e(3, this.f462305f);
            fVar.e(4, this.f462306g);
            fVar.e(5, this.f462307h);
            fVar.g(6, 8, linkedList4);
            java.lang.String str = this.f462309m;
            if (str != null) {
                fVar.j(7, str);
            }
            r45.cu5 cu5Var = this.f462310n;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.mo75928xcd1e8d8());
                this.f462310n.mo75956x3d5d1f78(fVar);
            }
            fVar.e(9, this.f462311o);
            fVar.e(10, this.f462312p);
            fVar.g(11, 8, linkedList3);
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            fVar.e(14, this.f462316t);
            fVar.e(15, this.f462317u);
            fVar.e(16, this.f462318v);
            r45.cu5 cu5Var2 = this.f462319w;
            if (cu5Var2 != null) {
                fVar.i(17, cu5Var2.mo75928xcd1e8d8());
                this.f462319w.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462303d) + 0 + b36.f.e(2, this.f462304e) + b36.f.e(3, this.f462305f) + b36.f.e(4, this.f462306g) + b36.f.e(5, this.f462307h) + b36.f.g(6, 8, linkedList4);
            java.lang.String str2 = this.f462309m;
            if (str2 != null) {
                e17 += b36.f.j(7, str2);
            }
            r45.cu5 cu5Var3 = this.f462310n;
            if (cu5Var3 != null) {
                e17 += b36.f.i(8, cu5Var3.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(9, this.f462311o) + b36.f.e(10, this.f462312p) + b36.f.g(11, 8, linkedList3) + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList) + b36.f.e(14, this.f462316t) + b36.f.e(15, this.f462317u) + b36.f.e(16, this.f462318v);
            r45.cu5 cu5Var4 = this.f462319w;
            return cu5Var4 != null ? e18 + b36.f.i(17, cu5Var4.mo75928xcd1e8d8()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
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
        r45.ms msVar = (r45.ms) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                msVar.f462303d = aVar2.g(intValue);
                return 0;
            case 2:
                msVar.f462304e = aVar2.g(intValue);
                return 0;
            case 3:
                msVar.f462305f = aVar2.g(intValue);
                return 0;
            case 4:
                msVar.f462306g = aVar2.g(intValue);
                return 0;
            case 5:
                msVar.f462307h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var.b(bArr2);
                    }
                    msVar.f462308i.add(du5Var);
                }
                return 0;
            case 7:
                msVar.f462309m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    msVar.f462310n = cu5Var5;
                }
                return 0;
            case 9:
                msVar.f462311o = aVar2.g(intValue);
                return 0;
            case 10:
                msVar.f462312p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var2.b(bArr4);
                    }
                    msVar.f462313q.add(du5Var2);
                }
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.ns nsVar = new r45.ns();
                    if (bArr5 != null && bArr5.length > 0) {
                        nsVar.mo11468x92b714fd(bArr5);
                    }
                    msVar.f462314r.add(nsVar);
                }
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.ns nsVar2 = new r45.ns();
                    if (bArr6 != null && bArr6.length > 0) {
                        nsVar2.mo11468x92b714fd(bArr6);
                    }
                    msVar.f462315s.add(nsVar2);
                }
                return 0;
            case 14:
                msVar.f462316t = aVar2.g(intValue);
                return 0;
            case 15:
                msVar.f462317u = aVar2.g(intValue);
                return 0;
            case 16:
                msVar.f462318v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var6.b(bArr7);
                    }
                    msVar.f462319w = cu5Var6;
                }
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f462303d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Ver", valueOf, false);
            eVar.d(jSONObject, "Uin", java.lang.Integer.valueOf(this.f462304e), false);
            eVar.d(jSONObject, "ExpireTime", java.lang.Integer.valueOf(this.f462305f), false);
            eVar.d(jSONObject, "FrontID", java.lang.Integer.valueOf(this.f462306g), false);
            eVar.d(jSONObject, "FrontIPCount", java.lang.Integer.valueOf(this.f462307h), false);
            eVar.d(jSONObject, "FrontIPList", this.f462308i, false);
            eVar.d(jSONObject, "ZoneDomain", this.f462309m, false);
            eVar.d(jSONObject, "AuthKey", this.f462310n, false);
            eVar.d(jSONObject, "ZoneID", java.lang.Integer.valueOf(this.f462311o), false);
            eVar.d(jSONObject, "ZoneIPCount", java.lang.Integer.valueOf(this.f462312p), false);
            eVar.d(jSONObject, "ZoneIPList", this.f462313q, false);
            eVar.d(jSONObject, "FrontIPPortList", this.f462314r, false);
            eVar.d(jSONObject, "ZoneIPPortList", this.f462315s, false);
            eVar.d(jSONObject, "FrontIPPortCount", java.lang.Integer.valueOf(this.f462316t), false);
            eVar.d(jSONObject, "ZoneIPPortCount", java.lang.Integer.valueOf(this.f462317u), false);
            eVar.d(jSONObject, "FakeUin", java.lang.Integer.valueOf(this.f462318v), false);
            eVar.d(jSONObject, "NewAuthKey", this.f462319w, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
