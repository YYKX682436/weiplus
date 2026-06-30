package r45;

/* loaded from: classes9.dex */
public class xj6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bz3 f471699d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f471700e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f471701f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.bz3 f471702g;

    /* renamed from: h, reason: collision with root package name */
    public r45.bm5 f471703h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471704i;

    /* renamed from: m, reason: collision with root package name */
    public r45.t35 f471705m;

    /* renamed from: n, reason: collision with root package name */
    public r45.yt5 f471706n;

    /* renamed from: o, reason: collision with root package name */
    public r45.xt5 f471707o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xj6)) {
            return false;
        }
        r45.xj6 xj6Var = (r45.xj6) fVar;
        return n51.f.a(this.f471699d, xj6Var.f471699d) && n51.f.a(this.f471700e, xj6Var.f471700e) && n51.f.a(this.f471701f, xj6Var.f471701f) && n51.f.a(this.f471702g, xj6Var.f471702g) && n51.f.a(this.f471703h, xj6Var.f471703h) && n51.f.a(this.f471704i, xj6Var.f471704i) && n51.f.a(this.f471705m, xj6Var.f471705m) && n51.f.a(this.f471706n, xj6Var.f471706n) && n51.f.a(this.f471707o, xj6Var.f471707o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471701f;
        java.util.LinkedList linkedList2 = this.f471700e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bz3 bz3Var = this.f471699d;
            if (bz3Var != null) {
                fVar.i(1, bz3Var.mo75928xcd1e8d8());
                this.f471699d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            r45.bz3 bz3Var2 = this.f471702g;
            if (bz3Var2 != null) {
                fVar.i(4, bz3Var2.mo75928xcd1e8d8());
                this.f471702g.mo75956x3d5d1f78(fVar);
            }
            r45.bm5 bm5Var = this.f471703h;
            if (bm5Var != null) {
                fVar.i(5, bm5Var.mo75928xcd1e8d8());
                this.f471703h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f471704i;
            if (str != null) {
                fVar.j(6, str);
            }
            r45.t35 t35Var = this.f471705m;
            if (t35Var != null) {
                fVar.i(7, t35Var.mo75928xcd1e8d8());
                this.f471705m.mo75956x3d5d1f78(fVar);
            }
            r45.yt5 yt5Var = this.f471706n;
            if (yt5Var != null) {
                fVar.i(8, yt5Var.mo75928xcd1e8d8());
                this.f471706n.mo75956x3d5d1f78(fVar);
            }
            r45.xt5 xt5Var = this.f471707o;
            if (xt5Var != null) {
                fVar.i(9, xt5Var.mo75928xcd1e8d8());
                this.f471707o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bz3 bz3Var3 = this.f471699d;
            int i18 = (bz3Var3 != null ? 0 + b36.f.i(1, bz3Var3.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
            r45.bz3 bz3Var4 = this.f471702g;
            if (bz3Var4 != null) {
                i18 += b36.f.i(4, bz3Var4.mo75928xcd1e8d8());
            }
            r45.bm5 bm5Var2 = this.f471703h;
            if (bm5Var2 != null) {
                i18 += b36.f.i(5, bm5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f471704i;
            if (str2 != null) {
                i18 += b36.f.j(6, str2);
            }
            r45.t35 t35Var2 = this.f471705m;
            if (t35Var2 != null) {
                i18 += b36.f.i(7, t35Var2.mo75928xcd1e8d8());
            }
            r45.yt5 yt5Var2 = this.f471706n;
            if (yt5Var2 != null) {
                i18 += b36.f.i(8, yt5Var2.mo75928xcd1e8d8());
            }
            r45.xt5 xt5Var2 = this.f471707o;
            return xt5Var2 != null ? i18 + b36.f.i(9, xt5Var2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.xj6 xj6Var = (r45.xj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.bz3 bz3Var5 = new r45.bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz3Var5.mo11468x92b714fd(bArr2);
                    }
                    xj6Var.f471699d = bz3Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.rl6 rl6Var = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var.mo11468x92b714fd(bArr3);
                    }
                    xj6Var.f471700e.add(rl6Var);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.rl6 rl6Var2 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var2.mo11468x92b714fd(bArr4);
                    }
                    xj6Var.f471701f.add(rl6Var2);
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.bz3 bz3Var6 = new r45.bz3();
                    if (bArr5 != null && bArr5.length > 0) {
                        bz3Var6.mo11468x92b714fd(bArr5);
                    }
                    xj6Var.f471702g = bz3Var6;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.bm5 bm5Var3 = new r45.bm5();
                    if (bArr6 != null && bArr6.length > 0) {
                        bm5Var3.mo11468x92b714fd(bArr6);
                    }
                    xj6Var.f471703h = bm5Var3;
                }
                return 0;
            case 6:
                xj6Var.f471704i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.t35 t35Var3 = new r45.t35();
                    if (bArr7 != null && bArr7.length > 0) {
                        t35Var3.mo11468x92b714fd(bArr7);
                    }
                    xj6Var.f471705m = t35Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr8 != null && bArr8.length > 0) {
                        yt5Var3.mo11468x92b714fd(bArr8);
                    }
                    xj6Var.f471706n = yt5Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.xt5 xt5Var3 = new r45.xt5();
                    if (bArr9 != null && bArr9.length > 0) {
                        xt5Var3.mo11468x92b714fd(bArr9);
                    }
                    xj6Var.f471707o = xt5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
