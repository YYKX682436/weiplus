package m53;

/* loaded from: classes2.dex */
public class w1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public m53.h f405673d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405674e;

    /* renamed from: g, reason: collision with root package name */
    public m53.n3 f405676g;

    /* renamed from: h, reason: collision with root package name */
    public m53.c3 f405677h;

    /* renamed from: i, reason: collision with root package name */
    public m53.y2 f405678i;

    /* renamed from: m, reason: collision with root package name */
    public m53.r4 f405679m;

    /* renamed from: o, reason: collision with root package name */
    public m53.d5 f405681o;

    /* renamed from: p, reason: collision with root package name */
    public m53.b3 f405682p;

    /* renamed from: q, reason: collision with root package name */
    public m53.w2 f405683q;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f405675f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f405680n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.w1)) {
            return false;
        }
        m53.w1 w1Var = (m53.w1) fVar;
        return n51.f.a(this.f76492x92037252, w1Var.f76492x92037252) && n51.f.a(this.f405673d, w1Var.f405673d) && n51.f.a(this.f405674e, w1Var.f405674e) && n51.f.a(this.f405675f, w1Var.f405675f) && n51.f.a(this.f405676g, w1Var.f405676g) && n51.f.a(this.f405677h, w1Var.f405677h) && n51.f.a(this.f405678i, w1Var.f405678i) && n51.f.a(this.f405679m, w1Var.f405679m) && n51.f.a(this.f405680n, w1Var.f405680n) && n51.f.a(this.f405681o, w1Var.f405681o) && n51.f.a(this.f405682p, w1Var.f405682p) && n51.f.a(this.f405683q, w1Var.f405683q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405680n;
        java.util.LinkedList linkedList2 = this.f405675f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            m53.h hVar = this.f405673d;
            if (hVar != null) {
                fVar.i(2, hVar.mo75928xcd1e8d8());
                this.f405673d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f405674e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList2);
            m53.n3 n3Var = this.f405676g;
            if (n3Var != null) {
                fVar.i(5, n3Var.mo75928xcd1e8d8());
                this.f405676g.mo75956x3d5d1f78(fVar);
            }
            m53.c3 c3Var = this.f405677h;
            if (c3Var != null) {
                fVar.i(7, c3Var.mo75928xcd1e8d8());
                this.f405677h.mo75956x3d5d1f78(fVar);
            }
            m53.y2 y2Var = this.f405678i;
            if (y2Var != null) {
                fVar.i(8, y2Var.mo75928xcd1e8d8());
                this.f405678i.mo75956x3d5d1f78(fVar);
            }
            m53.r4 r4Var = this.f405679m;
            if (r4Var != null) {
                fVar.i(9, r4Var.mo75928xcd1e8d8());
                this.f405679m.mo75956x3d5d1f78(fVar);
            }
            fVar.g(10, 8, linkedList);
            m53.d5 d5Var = this.f405681o;
            if (d5Var != null) {
                fVar.i(11, d5Var.mo75928xcd1e8d8());
                this.f405681o.mo75956x3d5d1f78(fVar);
            }
            m53.b3 b3Var = this.f405682p;
            if (b3Var != null) {
                fVar.i(12, b3Var.mo75928xcd1e8d8());
                this.f405682p.mo75956x3d5d1f78(fVar);
            }
            m53.w2 w2Var = this.f405683q;
            if (w2Var != null) {
                fVar.i(13, w2Var.mo75928xcd1e8d8());
                this.f405683q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            m53.h hVar2 = this.f405673d;
            if (hVar2 != null) {
                i18 += b36.f.i(2, hVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f405674e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList2);
            m53.n3 n3Var2 = this.f405676g;
            if (n3Var2 != null) {
                g17 += b36.f.i(5, n3Var2.mo75928xcd1e8d8());
            }
            m53.c3 c3Var2 = this.f405677h;
            if (c3Var2 != null) {
                g17 += b36.f.i(7, c3Var2.mo75928xcd1e8d8());
            }
            m53.y2 y2Var2 = this.f405678i;
            if (y2Var2 != null) {
                g17 += b36.f.i(8, y2Var2.mo75928xcd1e8d8());
            }
            m53.r4 r4Var2 = this.f405679m;
            if (r4Var2 != null) {
                g17 += b36.f.i(9, r4Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(10, 8, linkedList);
            m53.d5 d5Var2 = this.f405681o;
            if (d5Var2 != null) {
                g18 += b36.f.i(11, d5Var2.mo75928xcd1e8d8());
            }
            m53.b3 b3Var2 = this.f405682p;
            if (b3Var2 != null) {
                g18 += b36.f.i(12, b3Var2.mo75928xcd1e8d8());
            }
            m53.w2 w2Var2 = this.f405683q;
            return w2Var2 != null ? g18 + b36.f.i(13, w2Var2.mo75928xcd1e8d8()) : g18;
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
        m53.w1 w1Var = (m53.w1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    w1Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    m53.h hVar3 = new m53.h();
                    if (bArr3 != null && bArr3.length > 0) {
                        hVar3.mo11468x92b714fd(bArr3);
                    }
                    w1Var.f405673d = hVar3;
                }
                return 0;
            case 3:
                w1Var.f405674e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    m53.k0 k0Var = new m53.k0();
                    if (bArr4 != null && bArr4.length > 0) {
                        k0Var.mo11468x92b714fd(bArr4);
                    }
                    w1Var.f405675f.add(k0Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    m53.n3 n3Var3 = new m53.n3();
                    if (bArr5 != null && bArr5.length > 0) {
                        n3Var3.mo11468x92b714fd(bArr5);
                    }
                    w1Var.f405676g = n3Var3;
                }
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    m53.c3 c3Var3 = new m53.c3();
                    if (bArr6 != null && bArr6.length > 0) {
                        c3Var3.mo11468x92b714fd(bArr6);
                    }
                    w1Var.f405677h = c3Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    m53.y2 y2Var3 = new m53.y2();
                    if (bArr7 != null && bArr7.length > 0) {
                        y2Var3.mo11468x92b714fd(bArr7);
                    }
                    w1Var.f405678i = y2Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    m53.r4 r4Var3 = new m53.r4();
                    if (bArr8 != null && bArr8.length > 0) {
                        r4Var3.mo11468x92b714fd(bArr8);
                    }
                    w1Var.f405679m = r4Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    m53.l0 l0Var = new m53.l0();
                    if (bArr9 != null && bArr9.length > 0) {
                        l0Var.mo11468x92b714fd(bArr9);
                    }
                    w1Var.f405680n.add(l0Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    m53.d5 d5Var3 = new m53.d5();
                    if (bArr10 != null && bArr10.length > 0) {
                        d5Var3.mo11468x92b714fd(bArr10);
                    }
                    w1Var.f405681o = d5Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    m53.b3 b3Var3 = new m53.b3();
                    if (bArr11 != null && bArr11.length > 0) {
                        b3Var3.mo11468x92b714fd(bArr11);
                    }
                    w1Var.f405682p = b3Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    m53.w2 w2Var3 = new m53.w2();
                    if (bArr12 != null && bArr12.length > 0) {
                        w2Var3.mo11468x92b714fd(bArr12);
                    }
                    w1Var.f405683q = w2Var3;
                }
                return 0;
        }
    }
}
