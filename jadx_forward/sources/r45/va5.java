package r45;

/* loaded from: classes4.dex */
public class va5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469567d;

    /* renamed from: e, reason: collision with root package name */
    public int f469568e;

    /* renamed from: f, reason: collision with root package name */
    public int f469569f;

    /* renamed from: g, reason: collision with root package name */
    public int f469570g;

    /* renamed from: h, reason: collision with root package name */
    public r45.i90 f469571h;

    /* renamed from: i, reason: collision with root package name */
    public r45.i90 f469572i;

    /* renamed from: m, reason: collision with root package name */
    public r45.i90 f469573m;

    /* renamed from: n, reason: collision with root package name */
    public r45.i90 f469574n;

    /* renamed from: o, reason: collision with root package name */
    public int f469575o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.va5)) {
            return false;
        }
        r45.va5 va5Var = (r45.va5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469567d), java.lang.Integer.valueOf(va5Var.f469567d)) && n51.f.a(java.lang.Integer.valueOf(this.f469568e), java.lang.Integer.valueOf(va5Var.f469568e)) && n51.f.a(java.lang.Integer.valueOf(this.f469569f), java.lang.Integer.valueOf(va5Var.f469569f)) && n51.f.a(java.lang.Integer.valueOf(this.f469570g), java.lang.Integer.valueOf(va5Var.f469570g)) && n51.f.a(this.f469571h, va5Var.f469571h) && n51.f.a(this.f469572i, va5Var.f469572i) && n51.f.a(this.f469573m, va5Var.f469573m) && n51.f.a(this.f469574n, va5Var.f469574n) && n51.f.a(java.lang.Integer.valueOf(this.f469575o), java.lang.Integer.valueOf(va5Var.f469575o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469567d);
            fVar.e(2, this.f469568e);
            fVar.e(3, this.f469569f);
            fVar.e(4, this.f469570g);
            r45.i90 i90Var = this.f469571h;
            if (i90Var != null) {
                fVar.i(5, i90Var.mo75928xcd1e8d8());
                this.f469571h.mo75956x3d5d1f78(fVar);
            }
            r45.i90 i90Var2 = this.f469572i;
            if (i90Var2 != null) {
                fVar.i(6, i90Var2.mo75928xcd1e8d8());
                this.f469572i.mo75956x3d5d1f78(fVar);
            }
            r45.i90 i90Var3 = this.f469573m;
            if (i90Var3 != null) {
                fVar.i(7, i90Var3.mo75928xcd1e8d8());
                this.f469573m.mo75956x3d5d1f78(fVar);
            }
            r45.i90 i90Var4 = this.f469574n;
            if (i90Var4 != null) {
                fVar.i(8, i90Var4.mo75928xcd1e8d8());
                this.f469574n.mo75956x3d5d1f78(fVar);
            }
            fVar.e(100, this.f469575o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469567d) + 0 + b36.f.e(2, this.f469568e) + b36.f.e(3, this.f469569f) + b36.f.e(4, this.f469570g);
            r45.i90 i90Var5 = this.f469571h;
            if (i90Var5 != null) {
                e17 += b36.f.i(5, i90Var5.mo75928xcd1e8d8());
            }
            r45.i90 i90Var6 = this.f469572i;
            if (i90Var6 != null) {
                e17 += b36.f.i(6, i90Var6.mo75928xcd1e8d8());
            }
            r45.i90 i90Var7 = this.f469573m;
            if (i90Var7 != null) {
                e17 += b36.f.i(7, i90Var7.mo75928xcd1e8d8());
            }
            r45.i90 i90Var8 = this.f469574n;
            if (i90Var8 != null) {
                e17 += b36.f.i(8, i90Var8.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(100, this.f469575o);
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
        r45.va5 va5Var = (r45.va5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            va5Var.f469575o = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                va5Var.f469567d = aVar2.g(intValue);
                return 0;
            case 2:
                va5Var.f469568e = aVar2.g(intValue);
                return 0;
            case 3:
                va5Var.f469569f = aVar2.g(intValue);
                return 0;
            case 4:
                va5Var.f469570g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.i90 i90Var9 = new r45.i90();
                    if (bArr != null && bArr.length > 0) {
                        i90Var9.mo11468x92b714fd(bArr);
                    }
                    va5Var.f469571h = i90Var9;
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.i90 i90Var10 = new r45.i90();
                    if (bArr2 != null && bArr2.length > 0) {
                        i90Var10.mo11468x92b714fd(bArr2);
                    }
                    va5Var.f469572i = i90Var10;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.i90 i90Var11 = new r45.i90();
                    if (bArr3 != null && bArr3.length > 0) {
                        i90Var11.mo11468x92b714fd(bArr3);
                    }
                    va5Var.f469573m = i90Var11;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.i90 i90Var12 = new r45.i90();
                    if (bArr4 != null && bArr4.length > 0) {
                        i90Var12.mo11468x92b714fd(bArr4);
                    }
                    va5Var.f469574n = i90Var12;
                }
                return 0;
            default:
                return -1;
        }
    }
}
