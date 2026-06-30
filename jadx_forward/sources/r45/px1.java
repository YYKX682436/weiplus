package r45;

/* loaded from: classes4.dex */
public class px1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.xn1 f464985d;

    /* renamed from: e, reason: collision with root package name */
    public int f464986e;

    /* renamed from: f, reason: collision with root package name */
    public int f464987f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464988g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464989h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f464990i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.px1)) {
            return false;
        }
        r45.px1 px1Var = (r45.px1) fVar;
        return n51.f.a(this.f464985d, px1Var.f464985d) && n51.f.a(java.lang.Integer.valueOf(this.f464986e), java.lang.Integer.valueOf(px1Var.f464986e)) && n51.f.a(java.lang.Integer.valueOf(this.f464987f), java.lang.Integer.valueOf(px1Var.f464987f)) && n51.f.a(this.f464988g, px1Var.f464988g) && n51.f.a(this.f464989h, px1Var.f464989h) && n51.f.a(java.lang.Boolean.valueOf(this.f464990i), java.lang.Boolean.valueOf(px1Var.f464990i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.xn1 xn1Var = this.f464985d;
            if (xn1Var != null) {
                fVar.i(1, xn1Var.mo75928xcd1e8d8());
                this.f464985d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f464986e);
            fVar.e(3, this.f464987f);
            java.lang.String str = this.f464988g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f464989h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(6, this.f464990i);
            return 0;
        }
        if (i17 == 1) {
            r45.xn1 xn1Var2 = this.f464985d;
            int i18 = (xn1Var2 != null ? 0 + b36.f.i(1, xn1Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f464986e) + b36.f.e(3, this.f464987f);
            java.lang.String str3 = this.f464988g;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f464989h;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            return i18 + b36.f.a(6, this.f464990i);
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
        r45.px1 px1Var = (r45.px1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.xn1 xn1Var3 = new r45.xn1();
                    if (bArr != null && bArr.length > 0) {
                        xn1Var3.mo11468x92b714fd(bArr);
                    }
                    px1Var.f464985d = xn1Var3;
                }
                return 0;
            case 2:
                px1Var.f464986e = aVar2.g(intValue);
                return 0;
            case 3:
                px1Var.f464987f = aVar2.g(intValue);
                return 0;
            case 4:
                px1Var.f464988g = aVar2.k(intValue);
                return 0;
            case 5:
                px1Var.f464989h = aVar2.k(intValue);
                return 0;
            case 6:
                px1Var.f464990i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
