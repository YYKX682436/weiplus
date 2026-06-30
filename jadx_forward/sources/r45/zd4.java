package r45;

/* loaded from: classes9.dex */
public class zd4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473465d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473466e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473467f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473468g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473469h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zd4)) {
            return false;
        }
        r45.zd4 zd4Var = (r45.zd4) fVar;
        return n51.f.a(this.f473465d, zd4Var.f473465d) && n51.f.a(this.f473466e, zd4Var.f473466e) && n51.f.a(this.f473467f, zd4Var.f473467f) && n51.f.a(this.f473468g, zd4Var.f473468g) && n51.f.a(this.f473469h, zd4Var.f473469h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473465d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473466e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f473467f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473468g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str4 = this.f473469h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f473465d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f473466e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f473467f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f473468g;
            if (gVar2 != null) {
                j17 += b36.f.b(4, gVar2);
            }
            java.lang.String str8 = this.f473469h;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        r45.zd4 zd4Var = (r45.zd4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zd4Var.f473465d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zd4Var.f473466e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zd4Var.f473467f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            zd4Var.f473468g = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        zd4Var.f473469h = aVar2.k(intValue);
        return 0;
    }
}
