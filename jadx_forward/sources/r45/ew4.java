package r45;

/* loaded from: classes12.dex */
public class ew4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455291d;

    /* renamed from: e, reason: collision with root package name */
    public r45.c50 f455292e;

    /* renamed from: f, reason: collision with root package name */
    public int f455293f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f455294g;

    /* renamed from: h, reason: collision with root package name */
    public int f455295h;

    /* renamed from: i, reason: collision with root package name */
    public int f455296i;

    /* renamed from: m, reason: collision with root package name */
    public int f455297m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ew4)) {
            return false;
        }
        r45.ew4 ew4Var = (r45.ew4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455291d), java.lang.Integer.valueOf(ew4Var.f455291d)) && n51.f.a(this.f455292e, ew4Var.f455292e) && n51.f.a(java.lang.Integer.valueOf(this.f455293f), java.lang.Integer.valueOf(ew4Var.f455293f)) && n51.f.a(this.f455294g, ew4Var.f455294g) && n51.f.a(java.lang.Integer.valueOf(this.f455295h), java.lang.Integer.valueOf(ew4Var.f455295h)) && n51.f.a(java.lang.Integer.valueOf(this.f455296i), java.lang.Integer.valueOf(ew4Var.f455296i)) && n51.f.a(java.lang.Integer.valueOf(this.f455297m), java.lang.Integer.valueOf(ew4Var.f455297m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455291d);
            r45.c50 c50Var = this.f455292e;
            if (c50Var != null) {
                fVar.i(2, c50Var.mo75928xcd1e8d8());
                this.f455292e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f455293f);
            r45.cu5 cu5Var = this.f455294g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f455294g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f455295h);
            fVar.e(6, this.f455296i);
            fVar.e(7, this.f455297m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455291d) + 0;
            r45.c50 c50Var2 = this.f455292e;
            if (c50Var2 != null) {
                e17 += b36.f.i(2, c50Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(3, this.f455293f);
            r45.cu5 cu5Var2 = this.f455294g;
            if (cu5Var2 != null) {
                e18 += b36.f.i(4, cu5Var2.mo75928xcd1e8d8());
            }
            return e18 + b36.f.e(5, this.f455295h) + b36.f.e(6, this.f455296i) + b36.f.e(7, this.f455297m);
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
        r45.ew4 ew4Var = (r45.ew4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ew4Var.f455291d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.c50 c50Var3 = new r45.c50();
                    if (bArr != null && bArr.length > 0) {
                        c50Var3.mo11468x92b714fd(bArr);
                    }
                    ew4Var.f455292e = c50Var3;
                }
                return 0;
            case 3:
                ew4Var.f455293f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    ew4Var.f455294g = cu5Var3;
                }
                return 0;
            case 5:
                ew4Var.f455295h = aVar2.g(intValue);
                return 0;
            case 6:
                ew4Var.f455296i = aVar2.g(intValue);
                return 0;
            case 7:
                ew4Var.f455297m = aVar2.g(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f455291d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Ret", valueOf, false);
            eVar.d(jSONObject, "CmdList", this.f455292e, false);
            eVar.d(jSONObject, "ContinueFlag", java.lang.Integer.valueOf(this.f455293f), false);
            eVar.d(jSONObject, "KeyBuf", this.f455294g, false);
            eVar.d(jSONObject, "Status", java.lang.Integer.valueOf(this.f455295h), false);
            eVar.d(jSONObject, "OnlineVersion", java.lang.Integer.valueOf(this.f455296i), false);
            eVar.d(jSONObject, "SvrTime", java.lang.Integer.valueOf(this.f455297m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
