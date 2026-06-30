package r45;

/* loaded from: classes2.dex */
public class l95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.e95 f460774d;

    /* renamed from: e, reason: collision with root package name */
    public r45.p95 f460775e;

    /* renamed from: f, reason: collision with root package name */
    public r45.u95 f460776f;

    /* renamed from: m, reason: collision with root package name */
    public r45.x95 f460780m;

    /* renamed from: n, reason: collision with root package name */
    public r45.f95 f460781n;

    /* renamed from: o, reason: collision with root package name */
    public r45.w95 f460782o;

    /* renamed from: p, reason: collision with root package name */
    public r45.da5 f460783p;

    /* renamed from: q, reason: collision with root package name */
    public r45.d95 f460784q;

    /* renamed from: s, reason: collision with root package name */
    public r45.q95 f460786s;

    /* renamed from: u, reason: collision with root package name */
    public r45.t95 f460788u;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f460777g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f460778h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f460779i = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f460785r = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f460787t = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f460789v = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l95)) {
            return false;
        }
        r45.l95 l95Var = (r45.l95) fVar;
        return n51.f.a(this.f460774d, l95Var.f460774d) && n51.f.a(this.f460775e, l95Var.f460775e) && n51.f.a(this.f460776f, l95Var.f460776f) && n51.f.a(this.f460777g, l95Var.f460777g) && n51.f.a(this.f460778h, l95Var.f460778h) && n51.f.a(this.f460779i, l95Var.f460779i) && n51.f.a(this.f460780m, l95Var.f460780m) && n51.f.a(this.f460781n, l95Var.f460781n) && n51.f.a(this.f460782o, l95Var.f460782o) && n51.f.a(this.f460783p, l95Var.f460783p) && n51.f.a(this.f460784q, l95Var.f460784q) && n51.f.a(this.f460785r, l95Var.f460785r) && n51.f.a(this.f460786s, l95Var.f460786s) && n51.f.a(this.f460787t, l95Var.f460787t) && n51.f.a(this.f460788u, l95Var.f460788u) && n51.f.a(this.f460789v, l95Var.f460789v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f460789v;
        java.util.LinkedList linkedList2 = this.f460787t;
        java.util.LinkedList linkedList3 = this.f460785r;
        java.util.LinkedList linkedList4 = this.f460779i;
        java.util.LinkedList linkedList5 = this.f460778h;
        java.util.LinkedList linkedList6 = this.f460777g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.e95 e95Var = this.f460774d;
            if (e95Var != null) {
                fVar.i(1, e95Var.mo75928xcd1e8d8());
                this.f460774d.mo75956x3d5d1f78(fVar);
            }
            r45.p95 p95Var = this.f460775e;
            if (p95Var != null) {
                fVar.i(2, p95Var.mo75928xcd1e8d8());
                this.f460775e.mo75956x3d5d1f78(fVar);
            }
            r45.u95 u95Var = this.f460776f;
            if (u95Var != null) {
                fVar.i(3, u95Var.mo75928xcd1e8d8());
                this.f460776f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(4, 8, linkedList6);
            fVar.g(5, 8, linkedList5);
            fVar.g(6, 8, linkedList4);
            r45.x95 x95Var = this.f460780m;
            if (x95Var != null) {
                fVar.i(7, x95Var.mo75928xcd1e8d8());
                this.f460780m.mo75956x3d5d1f78(fVar);
            }
            r45.f95 f95Var = this.f460781n;
            if (f95Var != null) {
                fVar.i(8, f95Var.mo75928xcd1e8d8());
                this.f460781n.mo75956x3d5d1f78(fVar);
            }
            r45.w95 w95Var = this.f460782o;
            if (w95Var != null) {
                fVar.i(9, w95Var.mo75928xcd1e8d8());
                this.f460782o.mo75956x3d5d1f78(fVar);
            }
            r45.da5 da5Var = this.f460783p;
            if (da5Var != null) {
                fVar.i(10, da5Var.mo75928xcd1e8d8());
                this.f460783p.mo75956x3d5d1f78(fVar);
            }
            r45.d95 d95Var = this.f460784q;
            if (d95Var != null) {
                fVar.i(11, d95Var.mo75928xcd1e8d8());
                this.f460784q.mo75956x3d5d1f78(fVar);
            }
            fVar.g(12, 8, linkedList3);
            r45.q95 q95Var = this.f460786s;
            if (q95Var != null) {
                fVar.i(13, q95Var.mo75928xcd1e8d8());
                this.f460786s.mo75956x3d5d1f78(fVar);
            }
            fVar.g(14, 8, linkedList2);
            r45.t95 t95Var = this.f460788u;
            if (t95Var != null) {
                fVar.i(15, t95Var.mo75928xcd1e8d8());
                this.f460788u.mo75956x3d5d1f78(fVar);
            }
            fVar.g(16, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.e95 e95Var2 = this.f460774d;
            int i18 = e95Var2 != null ? b36.f.i(1, e95Var2.mo75928xcd1e8d8()) + 0 : 0;
            r45.p95 p95Var2 = this.f460775e;
            if (p95Var2 != null) {
                i18 += b36.f.i(2, p95Var2.mo75928xcd1e8d8());
            }
            r45.u95 u95Var2 = this.f460776f;
            if (u95Var2 != null) {
                i18 += b36.f.i(3, u95Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList6) + b36.f.g(5, 8, linkedList5) + b36.f.g(6, 8, linkedList4);
            r45.x95 x95Var2 = this.f460780m;
            if (x95Var2 != null) {
                g17 += b36.f.i(7, x95Var2.mo75928xcd1e8d8());
            }
            r45.f95 f95Var2 = this.f460781n;
            if (f95Var2 != null) {
                g17 += b36.f.i(8, f95Var2.mo75928xcd1e8d8());
            }
            r45.w95 w95Var2 = this.f460782o;
            if (w95Var2 != null) {
                g17 += b36.f.i(9, w95Var2.mo75928xcd1e8d8());
            }
            r45.da5 da5Var2 = this.f460783p;
            if (da5Var2 != null) {
                g17 += b36.f.i(10, da5Var2.mo75928xcd1e8d8());
            }
            r45.d95 d95Var2 = this.f460784q;
            if (d95Var2 != null) {
                g17 += b36.f.i(11, d95Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(12, 8, linkedList3);
            r45.q95 q95Var2 = this.f460786s;
            if (q95Var2 != null) {
                g18 += b36.f.i(13, q95Var2.mo75928xcd1e8d8());
            }
            int g19 = g18 + b36.f.g(14, 8, linkedList2);
            r45.t95 t95Var2 = this.f460788u;
            if (t95Var2 != null) {
                g19 += b36.f.i(15, t95Var2.mo75928xcd1e8d8());
            }
            return g19 + b36.f.g(16, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList6.clear();
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
        r45.l95 l95Var = (r45.l95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.e95 e95Var3 = new r45.e95();
                    if (bArr2 != null && bArr2.length > 0) {
                        e95Var3.mo11468x92b714fd(bArr2);
                    }
                    l95Var.f460774d = e95Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.p95 p95Var3 = new r45.p95();
                    if (bArr3 != null && bArr3.length > 0) {
                        p95Var3.mo11468x92b714fd(bArr3);
                    }
                    l95Var.f460775e = p95Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.u95 u95Var3 = new r45.u95();
                    if (bArr4 != null && bArr4.length > 0) {
                        u95Var3.mo11468x92b714fd(bArr4);
                    }
                    l95Var.f460776f = u95Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.q95 q95Var3 = new r45.q95();
                    if (bArr5 != null && bArr5.length > 0) {
                        q95Var3.mo11468x92b714fd(bArr5);
                    }
                    l95Var.f460777g.add(q95Var3);
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.k95 k95Var = new r45.k95();
                    if (bArr6 != null && bArr6.length > 0) {
                        k95Var.mo11468x92b714fd(bArr6);
                    }
                    l95Var.f460778h.add(k95Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.i95 i95Var = new r45.i95();
                    if (bArr7 != null && bArr7.length > 0) {
                        i95Var.mo11468x92b714fd(bArr7);
                    }
                    l95Var.f460779i.add(i95Var);
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.x95 x95Var3 = new r45.x95();
                    if (bArr8 != null && bArr8.length > 0) {
                        x95Var3.mo11468x92b714fd(bArr8);
                    }
                    l95Var.f460780m = x95Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.f95 f95Var3 = new r45.f95();
                    if (bArr9 != null && bArr9.length > 0) {
                        f95Var3.mo11468x92b714fd(bArr9);
                    }
                    l95Var.f460781n = f95Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.w95 w95Var3 = new r45.w95();
                    if (bArr10 != null && bArr10.length > 0) {
                        w95Var3.mo11468x92b714fd(bArr10);
                    }
                    l95Var.f460782o = w95Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.da5 da5Var3 = new r45.da5();
                    if (bArr11 != null && bArr11.length > 0) {
                        da5Var3.mo11468x92b714fd(bArr11);
                    }
                    l95Var.f460783p = da5Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.d95 d95Var3 = new r45.d95();
                    if (bArr12 != null && bArr12.length > 0) {
                        d95Var3.mo11468x92b714fd(bArr12);
                    }
                    l95Var.f460784q = d95Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.ba5 ba5Var = new r45.ba5();
                    if (bArr13 != null && bArr13.length > 0) {
                        ba5Var.mo11468x92b714fd(bArr13);
                    }
                    l95Var.f460785r.add(ba5Var);
                }
                return 0;
            case 13:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    r45.q95 q95Var4 = new r45.q95();
                    if (bArr14 != null && bArr14.length > 0) {
                        q95Var4.mo11468x92b714fd(bArr14);
                    }
                    l95Var.f460786s = q95Var4;
                }
                return 0;
            case 14:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    r45.v95 v95Var = new r45.v95();
                    if (bArr15 != null && bArr15.length > 0) {
                        v95Var.mo11468x92b714fd(bArr15);
                    }
                    l95Var.f460787t.add(v95Var);
                }
                return 0;
            case 15:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr16 = (byte[]) j59.get(i67);
                    r45.t95 t95Var3 = new r45.t95();
                    if (bArr16 != null && bArr16.length > 0) {
                        t95Var3.mo11468x92b714fd(bArr16);
                    }
                    l95Var.f460788u = t95Var3;
                }
                return 0;
            case 16:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr17 = (byte[]) j66.get(i68);
                    r45.ca5 ca5Var = new r45.ca5();
                    if (bArr17 != null && bArr17.length > 0) {
                        ca5Var.mo11468x92b714fd(bArr17);
                    }
                    l95Var.f460789v.add(ca5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
