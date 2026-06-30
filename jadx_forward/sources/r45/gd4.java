package r45;

/* loaded from: classes10.dex */
public class gd4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456666d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456667e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zz6 f456668f;

    /* renamed from: g, reason: collision with root package name */
    public float f456669g;

    /* renamed from: h, reason: collision with root package name */
    public float f456670h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bi0 f456671i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gd4)) {
            return false;
        }
        r45.gd4 gd4Var = (r45.gd4) fVar;
        return n51.f.a(this.f456666d, gd4Var.f456666d) && n51.f.a(this.f456667e, gd4Var.f456667e) && n51.f.a(this.f456668f, gd4Var.f456668f) && n51.f.a(java.lang.Float.valueOf(this.f456669g), java.lang.Float.valueOf(gd4Var.f456669g)) && n51.f.a(java.lang.Float.valueOf(this.f456670h), java.lang.Float.valueOf(gd4Var.f456670h)) && n51.f.a(this.f456671i, gd4Var.f456671i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456666d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456667e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.zz6 zz6Var = this.f456668f;
            if (zz6Var != null) {
                fVar.i(4, zz6Var.mo75928xcd1e8d8());
                this.f456668f.mo75956x3d5d1f78(fVar);
            }
            fVar.d(5, this.f456669g);
            fVar.d(6, this.f456670h);
            r45.bi0 bi0Var = this.f456671i;
            if (bi0Var != null) {
                fVar.i(7, bi0Var.mo75928xcd1e8d8());
                this.f456671i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f456666d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f456667e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.zz6 zz6Var2 = this.f456668f;
            if (zz6Var2 != null) {
                j17 += b36.f.i(4, zz6Var2.mo75928xcd1e8d8());
            }
            int d17 = j17 + b36.f.d(5, this.f456669g) + b36.f.d(6, this.f456670h);
            r45.bi0 bi0Var2 = this.f456671i;
            return bi0Var2 != null ? d17 + b36.f.i(7, bi0Var2.mo75928xcd1e8d8()) : d17;
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
        r45.gd4 gd4Var = (r45.gd4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gd4Var.f456666d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gd4Var.f456667e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.zz6 zz6Var3 = new r45.zz6();
                if (bArr != null && bArr.length > 0) {
                    zz6Var3.mo11468x92b714fd(bArr);
                }
                gd4Var.f456668f = zz6Var3;
            }
            return 0;
        }
        if (intValue == 5) {
            gd4Var.f456669g = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 6) {
            gd4Var.f456670h = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.bi0 bi0Var3 = new r45.bi0();
            if (bArr2 != null && bArr2.length > 0) {
                bi0Var3.mo11468x92b714fd(bArr2);
            }
            gd4Var.f456671i = bi0Var3;
        }
        return 0;
    }
}
