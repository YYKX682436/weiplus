package r45;

/* loaded from: classes10.dex */
public class ll6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461112d;

    /* renamed from: e, reason: collision with root package name */
    public int f461113e;

    /* renamed from: f, reason: collision with root package name */
    public int f461114f;

    /* renamed from: g, reason: collision with root package name */
    public r45.zz6 f461115g;

    /* renamed from: h, reason: collision with root package name */
    public int f461116h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bi0 f461117i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461118m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ll6)) {
            return false;
        }
        r45.ll6 ll6Var = (r45.ll6) fVar;
        return n51.f.a(this.f461112d, ll6Var.f461112d) && n51.f.a(java.lang.Integer.valueOf(this.f461113e), java.lang.Integer.valueOf(ll6Var.f461113e)) && n51.f.a(java.lang.Integer.valueOf(this.f461114f), java.lang.Integer.valueOf(ll6Var.f461114f)) && n51.f.a(this.f461115g, ll6Var.f461115g) && n51.f.a(java.lang.Integer.valueOf(this.f461116h), java.lang.Integer.valueOf(ll6Var.f461116h)) && n51.f.a(this.f461117i, ll6Var.f461117i) && n51.f.a(this.f461118m, ll6Var.f461118m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461112d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f461113e);
            fVar.e(3, this.f461114f);
            r45.zz6 zz6Var = this.f461115g;
            if (zz6Var != null) {
                fVar.i(4, zz6Var.mo75928xcd1e8d8());
                this.f461115g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f461116h);
            r45.bi0 bi0Var = this.f461117i;
            if (bi0Var != null) {
                fVar.i(6, bi0Var.mo75928xcd1e8d8());
                this.f461117i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f461118m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f461112d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f461113e) + b36.f.e(3, this.f461114f);
            r45.zz6 zz6Var2 = this.f461115g;
            if (zz6Var2 != null) {
                j17 += b36.f.i(4, zz6Var2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(5, this.f461116h);
            r45.bi0 bi0Var2 = this.f461117i;
            if (bi0Var2 != null) {
                e17 += b36.f.i(6, bi0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f461118m;
            return str4 != null ? e17 + b36.f.j(7, str4) : e17;
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
        r45.ll6 ll6Var = (r45.ll6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ll6Var.f461112d = aVar2.k(intValue);
                return 0;
            case 2:
                ll6Var.f461113e = aVar2.g(intValue);
                return 0;
            case 3:
                ll6Var.f461114f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.zz6 zz6Var3 = new r45.zz6();
                    if (bArr != null && bArr.length > 0) {
                        zz6Var3.mo11468x92b714fd(bArr);
                    }
                    ll6Var.f461115g = zz6Var3;
                }
                return 0;
            case 5:
                ll6Var.f461116h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.bi0 bi0Var3 = new r45.bi0();
                    if (bArr2 != null && bArr2.length > 0) {
                        bi0Var3.mo11468x92b714fd(bArr2);
                    }
                    ll6Var.f461117i = bi0Var3;
                }
                return 0;
            case 7:
                ll6Var.f461118m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
