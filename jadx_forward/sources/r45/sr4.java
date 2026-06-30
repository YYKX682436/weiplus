package r45;

/* loaded from: classes10.dex */
public class sr4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467472d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467473e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467474f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467475g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467476h;

    /* renamed from: i, reason: collision with root package name */
    public int f467477i;

    /* renamed from: m, reason: collision with root package name */
    public r45.hf2 f467478m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sr4)) {
            return false;
        }
        r45.sr4 sr4Var = (r45.sr4) fVar;
        return n51.f.a(this.f467472d, sr4Var.f467472d) && n51.f.a(this.f467473e, sr4Var.f467473e) && n51.f.a(this.f467474f, sr4Var.f467474f) && n51.f.a(this.f467475g, sr4Var.f467475g) && n51.f.a(this.f467476h, sr4Var.f467476h) && n51.f.a(java.lang.Integer.valueOf(this.f467477i), java.lang.Integer.valueOf(sr4Var.f467477i)) && n51.f.a(this.f467478m, sr4Var.f467478m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467472d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467473e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f467474f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f467475g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f467476h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f467477i);
            r45.hf2 hf2Var = this.f467478m;
            if (hf2Var != null) {
                fVar.i(7, hf2Var.mo75928xcd1e8d8());
                this.f467478m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f467472d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f467473e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f467474f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f467475g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f467476h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            int e17 = j17 + b36.f.e(6, this.f467477i);
            r45.hf2 hf2Var2 = this.f467478m;
            return hf2Var2 != null ? e17 + b36.f.i(7, hf2Var2.mo75928xcd1e8d8()) : e17;
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
        r45.sr4 sr4Var = (r45.sr4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sr4Var.f467472d = aVar2.k(intValue);
                return 0;
            case 2:
                sr4Var.f467473e = aVar2.k(intValue);
                return 0;
            case 3:
                sr4Var.f467474f = aVar2.k(intValue);
                return 0;
            case 4:
                sr4Var.f467475g = aVar2.k(intValue);
                return 0;
            case 5:
                sr4Var.f467476h = aVar2.k(intValue);
                return 0;
            case 6:
                sr4Var.f467477i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.hf2 hf2Var3 = new r45.hf2();
                    if (bArr != null && bArr.length > 0) {
                        hf2Var3.mo11468x92b714fd(bArr);
                    }
                    sr4Var.f467478m = hf2Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
