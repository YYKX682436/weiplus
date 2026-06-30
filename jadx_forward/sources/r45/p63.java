package r45;

/* loaded from: classes8.dex */
public class p63 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464320d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464321e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464322f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464323g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464324h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p63)) {
            return false;
        }
        r45.p63 p63Var = (r45.p63) fVar;
        return n51.f.a(this.f464320d, p63Var.f464320d) && n51.f.a(this.f464321e, p63Var.f464321e) && n51.f.a(this.f464322f, p63Var.f464322f) && n51.f.a(this.f464323g, p63Var.f464323g) && n51.f.a(this.f464324h, p63Var.f464324h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464320d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464321e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f464322f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f464323g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f464324h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f464320d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f464321e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f464322f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f464323g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f464324h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        r45.p63 p63Var = (r45.p63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p63Var.f464320d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            p63Var.f464321e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            p63Var.f464322f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            p63Var.f464323g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        p63Var.f464324h = aVar2.k(intValue);
        return 0;
    }
}
