package r45;

/* loaded from: classes2.dex */
public class hf0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ks5 f457636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457638f;

    /* renamed from: g, reason: collision with root package name */
    public int f457639g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457640h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457641i;

    /* renamed from: m, reason: collision with root package name */
    public int f457642m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457643n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hf0)) {
            return false;
        }
        r45.hf0 hf0Var = (r45.hf0) fVar;
        return n51.f.a(this.f457636d, hf0Var.f457636d) && n51.f.a(this.f457637e, hf0Var.f457637e) && n51.f.a(this.f457638f, hf0Var.f457638f) && n51.f.a(java.lang.Integer.valueOf(this.f457639g), java.lang.Integer.valueOf(hf0Var.f457639g)) && n51.f.a(this.f457640h, hf0Var.f457640h) && n51.f.a(this.f457641i, hf0Var.f457641i) && n51.f.a(java.lang.Integer.valueOf(this.f457642m), java.lang.Integer.valueOf(hf0Var.f457642m)) && n51.f.a(this.f457643n, hf0Var.f457643n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ks5 ks5Var = this.f457636d;
            if (ks5Var != null) {
                fVar.i(1, ks5Var.mo75928xcd1e8d8());
                this.f457636d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f457637e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f457638f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f457639g);
            java.lang.String str3 = this.f457640h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f457641i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f457642m);
            java.lang.String str5 = this.f457643n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ks5 ks5Var2 = this.f457636d;
            int i18 = ks5Var2 != null ? 0 + b36.f.i(1, ks5Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str6 = this.f457637e;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f457638f;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int e17 = i18 + b36.f.e(4, this.f457639g);
            java.lang.String str8 = this.f457640h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f457641i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            int e18 = e17 + b36.f.e(7, this.f457642m);
            java.lang.String str10 = this.f457643n;
            return str10 != null ? e18 + b36.f.j(8, str10) : e18;
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
        r45.hf0 hf0Var = (r45.hf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ks5 ks5Var3 = new r45.ks5();
                    if (bArr != null && bArr.length > 0) {
                        ks5Var3.mo11468x92b714fd(bArr);
                    }
                    hf0Var.f457636d = ks5Var3;
                }
                return 0;
            case 2:
                hf0Var.f457637e = aVar2.k(intValue);
                return 0;
            case 3:
                hf0Var.f457638f = aVar2.k(intValue);
                return 0;
            case 4:
                hf0Var.f457639g = aVar2.g(intValue);
                return 0;
            case 5:
                hf0Var.f457640h = aVar2.k(intValue);
                return 0;
            case 6:
                hf0Var.f457641i = aVar2.k(intValue);
                return 0;
            case 7:
                hf0Var.f457642m = aVar2.g(intValue);
                return 0;
            case 8:
                hf0Var.f457643n = aVar2.k(intValue);
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
            r45.ks5 ks5Var = this.f457636d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "CommContent", ks5Var, false);
            eVar.d(jSONObject, "JumpUrl", this.f457637e, false);
            eVar.d(jSONObject, "Date", this.f457638f, false);
            eVar.d(jSONObject, "JumpType", java.lang.Integer.valueOf(this.f457639g), false);
            eVar.d(jSONObject, "UserName", this.f457640h, false);
            eVar.d(jSONObject, "WeappPath", this.f457641i, false);
            eVar.d(jSONObject, "WeappVersion", java.lang.Integer.valueOf(this.f457642m), false);
            eVar.d(jSONObject, "SceneNote", this.f457643n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
