package r45;

/* loaded from: classes4.dex */
public class m76 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461738d;

    /* renamed from: e, reason: collision with root package name */
    public long f461739e;

    /* renamed from: f, reason: collision with root package name */
    public long f461740f;

    /* renamed from: g, reason: collision with root package name */
    public int f461741g;

    /* renamed from: h, reason: collision with root package name */
    public long f461742h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f461743i;

    /* renamed from: m, reason: collision with root package name */
    public int f461744m;

    /* renamed from: n, reason: collision with root package name */
    public int f461745n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f461746o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f461747p;

    /* renamed from: q, reason: collision with root package name */
    public int f461748q;

    /* renamed from: r, reason: collision with root package name */
    public long f461749r;

    /* renamed from: s, reason: collision with root package name */
    public long f461750s;

    /* renamed from: t, reason: collision with root package name */
    public long f461751t;

    /* renamed from: u, reason: collision with root package name */
    public int f461752u;

    /* renamed from: v, reason: collision with root package name */
    public long f461753v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f461754w;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m76)) {
            return false;
        }
        r45.m76 m76Var = (r45.m76) fVar;
        return n51.f.a(this.f76494x2de60e5e, m76Var.f76494x2de60e5e) && n51.f.a(this.f461738d, m76Var.f461738d) && n51.f.a(java.lang.Long.valueOf(this.f461739e), java.lang.Long.valueOf(m76Var.f461739e)) && n51.f.a(java.lang.Long.valueOf(this.f461740f), java.lang.Long.valueOf(m76Var.f461740f)) && n51.f.a(java.lang.Integer.valueOf(this.f461741g), java.lang.Integer.valueOf(m76Var.f461741g)) && n51.f.a(java.lang.Long.valueOf(this.f461742h), java.lang.Long.valueOf(m76Var.f461742h)) && n51.f.a(this.f461743i, m76Var.f461743i) && n51.f.a(java.lang.Integer.valueOf(this.f461744m), java.lang.Integer.valueOf(m76Var.f461744m)) && n51.f.a(java.lang.Integer.valueOf(this.f461745n), java.lang.Integer.valueOf(m76Var.f461745n)) && n51.f.a(this.f461746o, m76Var.f461746o) && n51.f.a(java.lang.Integer.valueOf(this.f461747p), java.lang.Integer.valueOf(m76Var.f461747p)) && n51.f.a(java.lang.Integer.valueOf(this.f461748q), java.lang.Integer.valueOf(m76Var.f461748q)) && n51.f.a(java.lang.Long.valueOf(this.f461749r), java.lang.Long.valueOf(m76Var.f461749r)) && n51.f.a(java.lang.Long.valueOf(this.f461750s), java.lang.Long.valueOf(m76Var.f461750s)) && n51.f.a(java.lang.Long.valueOf(this.f461751t), java.lang.Long.valueOf(m76Var.f461751t)) && n51.f.a(java.lang.Integer.valueOf(this.f461752u), java.lang.Integer.valueOf(m76Var.f461752u)) && n51.f.a(java.lang.Long.valueOf(this.f461753v), java.lang.Long.valueOf(m76Var.f461753v)) && n51.f.a(this.f461754w, m76Var.f461754w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f461738d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f461739e);
            fVar.h(4, this.f461740f);
            fVar.e(5, this.f461741g);
            fVar.h(6, this.f461742h);
            r45.cu5 cu5Var = this.f461743i;
            if (cu5Var != null) {
                fVar.i(7, cu5Var.mo75928xcd1e8d8());
                this.f461743i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f461744m);
            fVar.e(11, this.f461745n);
            fVar.k(12, 3, this.f461746o);
            fVar.e(13, this.f461747p);
            fVar.e(14, this.f461748q);
            fVar.h(15, this.f461749r);
            fVar.h(16, this.f461750s);
            fVar.h(17, this.f461751t);
            fVar.e(18, this.f461752u);
            fVar.h(19, this.f461753v);
            r45.cu5 cu5Var2 = this.f461754w;
            if (cu5Var2 == null) {
                return 0;
            }
            fVar.i(20, cu5Var2.mo75928xcd1e8d8());
            this.f461754w.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f461738d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int h17 = i18 + b36.f.h(3, this.f461739e) + b36.f.h(4, this.f461740f) + b36.f.e(5, this.f461741g) + b36.f.h(6, this.f461742h);
            r45.cu5 cu5Var3 = this.f461743i;
            if (cu5Var3 != null) {
                h17 += b36.f.i(7, cu5Var3.mo75928xcd1e8d8());
            }
            int e17 = h17 + b36.f.e(8, this.f461744m) + b36.f.e(11, this.f461745n) + b36.f.k(12, 3, this.f461746o) + b36.f.e(13, this.f461747p) + b36.f.e(14, this.f461748q) + b36.f.h(15, this.f461749r) + b36.f.h(16, this.f461750s) + b36.f.h(17, this.f461751t) + b36.f.e(18, this.f461752u) + b36.f.h(19, this.f461753v);
            r45.cu5 cu5Var4 = this.f461754w;
            return cu5Var4 != null ? e17 + b36.f.i(20, cu5Var4.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f461746o.clear();
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
        r45.m76 m76Var = (r45.m76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    m76Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                m76Var.f461738d = aVar2.k(intValue);
                return 0;
            case 3:
                m76Var.f461739e = aVar2.i(intValue);
                return 0;
            case 4:
                m76Var.f461740f = aVar2.i(intValue);
                return 0;
            case 5:
                m76Var.f461741g = aVar2.g(intValue);
                return 0;
            case 6:
                m76Var.f461742h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    m76Var.f461743i = cu5Var5;
                }
                return 0;
            case 8:
                m76Var.f461744m = aVar2.g(intValue);
                return 0;
            case 9:
            case 10:
            default:
                return -1;
            case 11:
                m76Var.f461745n = aVar2.g(intValue);
                return 0;
            case 12:
                byte[] bArr4 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList.add(java.lang.Long.valueOf(aVar3.g()));
                }
                m76Var.f461746o = linkedList;
                return 0;
            case 13:
                m76Var.f461747p = aVar2.g(intValue);
                return 0;
            case 14:
                m76Var.f461748q = aVar2.g(intValue);
                return 0;
            case 15:
                m76Var.f461749r = aVar2.i(intValue);
                return 0;
            case 16:
                m76Var.f461750s = aVar2.i(intValue);
                return 0;
            case 17:
                m76Var.f461751t = aVar2.i(intValue);
                return 0;
            case 18:
                m76Var.f461752u = aVar2.g(intValue);
                return 0;
            case 19:
                m76Var.f461753v = aVar2.i(intValue);
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr5 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var6.b(bArr5);
                    }
                    m76Var.f461754w = cu5Var6;
                }
                return 0;
        }
    }
}
