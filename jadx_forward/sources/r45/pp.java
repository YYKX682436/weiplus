package r45;

/* loaded from: classes2.dex */
public class pp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464794d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rp f464795e;

    /* renamed from: f, reason: collision with root package name */
    public r45.gx5 f464796f;

    /* renamed from: g, reason: collision with root package name */
    public r45.yp f464797g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464798h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pp)) {
            return false;
        }
        r45.pp ppVar = (r45.pp) fVar;
        return n51.f.a(this.f464794d, ppVar.f464794d) && n51.f.a(this.f464795e, ppVar.f464795e) && n51.f.a(this.f464796f, ppVar.f464796f) && n51.f.a(this.f464797g, ppVar.f464797g) && n51.f.a(this.f464798h, ppVar.f464798h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464794d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.rp rpVar = this.f464795e;
            if (rpVar != null) {
                fVar.i(2, rpVar.mo75928xcd1e8d8());
                this.f464795e.mo75956x3d5d1f78(fVar);
            }
            r45.gx5 gx5Var = this.f464796f;
            if (gx5Var != null) {
                fVar.i(3, gx5Var.mo75928xcd1e8d8());
                this.f464796f.mo75956x3d5d1f78(fVar);
            }
            r45.yp ypVar = this.f464797g;
            if (ypVar != null) {
                fVar.i(4, ypVar.mo75928xcd1e8d8());
                this.f464797g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f464798h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f464794d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.rp rpVar2 = this.f464795e;
            if (rpVar2 != null) {
                j17 += b36.f.i(2, rpVar2.mo75928xcd1e8d8());
            }
            r45.gx5 gx5Var2 = this.f464796f;
            if (gx5Var2 != null) {
                j17 += b36.f.i(3, gx5Var2.mo75928xcd1e8d8());
            }
            r45.yp ypVar2 = this.f464797g;
            if (ypVar2 != null) {
                j17 += b36.f.i(4, ypVar2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f464798h;
            return str4 != null ? j17 + b36.f.j(5, str4) : j17;
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
        r45.pp ppVar = (r45.pp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ppVar.f464794d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.rp rpVar3 = new r45.rp();
                if (bArr != null && bArr.length > 0) {
                    rpVar3.mo11468x92b714fd(bArr);
                }
                ppVar.f464795e = rpVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.gx5 gx5Var3 = new r45.gx5();
                if (bArr2 != null && bArr2.length > 0) {
                    gx5Var3.mo11468x92b714fd(bArr2);
                }
                ppVar.f464796f = gx5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            ppVar.f464798h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.yp ypVar3 = new r45.yp();
            if (bArr3 != null && bArr3.length > 0) {
                ypVar3.mo11468x92b714fd(bArr3);
            }
            ppVar.f464797g = ypVar3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f464794d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "NickName", str, false);
            eVar.d(jSONObject, "DetailInfo", this.f464795e, false);
            eVar.d(jSONObject, "ContactItem", this.f464796f, false);
            eVar.d(jSONObject, "ServiceInfo", this.f464797g, false);
            eVar.d(jSONObject, "JumpUrl", this.f464798h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
