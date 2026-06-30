package r45;

/* loaded from: classes12.dex */
public class ed3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454836d;

    /* renamed from: e, reason: collision with root package name */
    public int f454837e;

    /* renamed from: f, reason: collision with root package name */
    public int f454838f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454839g;

    /* renamed from: h, reason: collision with root package name */
    public int f454840h;

    /* renamed from: i, reason: collision with root package name */
    public int f454841i;

    /* renamed from: m, reason: collision with root package name */
    public int f454842m;

    /* renamed from: n, reason: collision with root package name */
    public r45.fw3 f454843n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ed3)) {
            return false;
        }
        r45.ed3 ed3Var = (r45.ed3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454836d), java.lang.Integer.valueOf(ed3Var.f454836d)) && n51.f.a(java.lang.Integer.valueOf(this.f454837e), java.lang.Integer.valueOf(ed3Var.f454837e)) && n51.f.a(java.lang.Integer.valueOf(this.f454838f), java.lang.Integer.valueOf(ed3Var.f454838f)) && n51.f.a(this.f454839g, ed3Var.f454839g) && n51.f.a(java.lang.Integer.valueOf(this.f454840h), java.lang.Integer.valueOf(ed3Var.f454840h)) && n51.f.a(java.lang.Integer.valueOf(this.f454841i), java.lang.Integer.valueOf(ed3Var.f454841i)) && n51.f.a(java.lang.Integer.valueOf(this.f454842m), java.lang.Integer.valueOf(ed3Var.f454842m)) && n51.f.a(this.f454843n, ed3Var.f454843n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454836d);
            fVar.e(2, this.f454837e);
            fVar.e(3, this.f454838f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454839g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f454840h);
            fVar.e(6, this.f454841i);
            fVar.e(7, this.f454842m);
            r45.fw3 fw3Var = this.f454843n;
            if (fw3Var != null) {
                fVar.i(8, fw3Var.mo75928xcd1e8d8());
                this.f454843n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454836d) + 0 + b36.f.e(2, this.f454837e) + b36.f.e(3, this.f454838f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454839g;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            int e18 = e17 + b36.f.e(5, this.f454840h) + b36.f.e(6, this.f454841i) + b36.f.e(7, this.f454842m);
            r45.fw3 fw3Var2 = this.f454843n;
            return fw3Var2 != null ? e18 + b36.f.i(8, fw3Var2.mo75928xcd1e8d8()) : e18;
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
        r45.ed3 ed3Var = (r45.ed3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ed3Var.f454836d = aVar2.g(intValue);
                return 0;
            case 2:
                ed3Var.f454837e = aVar2.g(intValue);
                return 0;
            case 3:
                ed3Var.f454838f = aVar2.g(intValue);
                return 0;
            case 4:
                ed3Var.f454839g = aVar2.d(intValue);
                return 0;
            case 5:
                ed3Var.f454840h = aVar2.g(intValue);
                return 0;
            case 6:
                ed3Var.f454841i = aVar2.g(intValue);
                return 0;
            case 7:
                ed3Var.f454842m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.fw3 fw3Var3 = new r45.fw3();
                    if (bArr != null && bArr.length > 0) {
                        fw3Var3.mo11468x92b714fd(bArr);
                    }
                    ed3Var.f454843n = fw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
