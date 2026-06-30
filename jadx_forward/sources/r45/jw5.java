package r45;

/* loaded from: classes2.dex */
public class jw5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f459702d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459703e;

    /* renamed from: f, reason: collision with root package name */
    public int f459704f;

    /* renamed from: g, reason: collision with root package name */
    public r45.e64 f459705g;

    /* renamed from: h, reason: collision with root package name */
    public int f459706h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f459707i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f459708m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459709n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jw5)) {
            return false;
        }
        r45.jw5 jw5Var = (r45.jw5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f459702d), java.lang.Long.valueOf(jw5Var.f459702d)) && n51.f.a(this.f459703e, jw5Var.f459703e) && n51.f.a(java.lang.Integer.valueOf(this.f459704f), java.lang.Integer.valueOf(jw5Var.f459704f)) && n51.f.a(this.f459705g, jw5Var.f459705g) && n51.f.a(java.lang.Integer.valueOf(this.f459706h), java.lang.Integer.valueOf(jw5Var.f459706h)) && n51.f.a(this.f459707i, jw5Var.f459707i) && n51.f.a(java.lang.Integer.valueOf(this.f459708m), java.lang.Integer.valueOf(jw5Var.f459708m)) && n51.f.a(this.f459709n, jw5Var.f459709n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459707i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f459702d);
            java.lang.String str = this.f459703e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f459704f);
            r45.e64 e64Var = this.f459705g;
            if (e64Var != null) {
                fVar.i(4, e64Var.mo75928xcd1e8d8());
                this.f459705g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f459706h);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f459708m);
            java.lang.String str2 = this.f459709n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f459702d) + 0;
            java.lang.String str3 = this.f459703e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            int e17 = h17 + b36.f.e(3, this.f459704f);
            r45.e64 e64Var2 = this.f459705g;
            if (e64Var2 != null) {
                e17 += b36.f.i(4, e64Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(5, this.f459706h) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f459708m);
            java.lang.String str4 = this.f459709n;
            return str4 != null ? e18 + b36.f.j(8, str4) : e18;
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
        r45.jw5 jw5Var = (r45.jw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jw5Var.f459702d = aVar2.i(intValue);
                return 0;
            case 2:
                jw5Var.f459703e = aVar2.k(intValue);
                return 0;
            case 3:
                jw5Var.f459704f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.mo11468x92b714fd(bArr2);
                    }
                    jw5Var.f459705g = e64Var3;
                }
                return 0;
            case 5:
                jw5Var.f459706h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.fw6 fw6Var = new r45.fw6();
                    if (bArr3 != null && bArr3.length > 0) {
                        fw6Var.mo11468x92b714fd(bArr3);
                    }
                    jw5Var.f459707i.add(fw6Var);
                }
                return 0;
            case 7:
                jw5Var.f459708m = aVar2.g(intValue);
                return 0;
            case 8:
                jw5Var.f459709n = aVar2.k(intValue);
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
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f459702d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BusinessType", valueOf, false);
            eVar.d(jSONObject, "KeyWord", this.f459703e, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f459704f), false);
            eVar.d(jSONObject, "Location", this.f459705g, false);
            eVar.d(jSONObject, "RequestSrc", java.lang.Integer.valueOf(this.f459706h), false);
            eVar.d(jSONObject, "MatchUserList", this.f459707i, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f459708m), false);
            eVar.d(jSONObject, "SearchID", this.f459709n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
