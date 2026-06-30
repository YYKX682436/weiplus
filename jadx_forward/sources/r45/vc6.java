package r45;

/* loaded from: classes14.dex */
public class vc6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469632d;

    /* renamed from: e, reason: collision with root package name */
    public int f469633e;

    /* renamed from: f, reason: collision with root package name */
    public int f469634f;

    /* renamed from: g, reason: collision with root package name */
    public r45.b27 f469635g;

    /* renamed from: h, reason: collision with root package name */
    public int f469636h;

    /* renamed from: i, reason: collision with root package name */
    public int f469637i;

    /* renamed from: m, reason: collision with root package name */
    public int f469638m;

    /* renamed from: n, reason: collision with root package name */
    public int f469639n;

    /* renamed from: p, reason: collision with root package name */
    public int f469641p;

    /* renamed from: r, reason: collision with root package name */
    public int f469643r;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f469645t;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f469640o = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f469642q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f469644s = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vc6)) {
            return false;
        }
        r45.vc6 vc6Var = (r45.vc6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469632d), java.lang.Integer.valueOf(vc6Var.f469632d)) && n51.f.a(java.lang.Integer.valueOf(this.f469633e), java.lang.Integer.valueOf(vc6Var.f469633e)) && n51.f.a(java.lang.Integer.valueOf(this.f469634f), java.lang.Integer.valueOf(vc6Var.f469634f)) && n51.f.a(this.f469635g, vc6Var.f469635g) && n51.f.a(java.lang.Integer.valueOf(this.f469636h), java.lang.Integer.valueOf(vc6Var.f469636h)) && n51.f.a(java.lang.Integer.valueOf(this.f469637i), java.lang.Integer.valueOf(vc6Var.f469637i)) && n51.f.a(java.lang.Integer.valueOf(this.f469638m), java.lang.Integer.valueOf(vc6Var.f469638m)) && n51.f.a(java.lang.Integer.valueOf(this.f469639n), java.lang.Integer.valueOf(vc6Var.f469639n)) && n51.f.a(this.f469640o, vc6Var.f469640o) && n51.f.a(java.lang.Integer.valueOf(this.f469641p), java.lang.Integer.valueOf(vc6Var.f469641p)) && n51.f.a(this.f469642q, vc6Var.f469642q) && n51.f.a(java.lang.Integer.valueOf(this.f469643r), java.lang.Integer.valueOf(vc6Var.f469643r)) && n51.f.a(this.f469644s, vc6Var.f469644s) && n51.f.a(this.f469645t, vc6Var.f469645t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469632d);
            fVar.e(2, this.f469633e);
            fVar.e(3, this.f469634f);
            r45.b27 b27Var = this.f469635g;
            if (b27Var != null) {
                fVar.i(4, b27Var.mo75928xcd1e8d8());
                this.f469635g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f469636h);
            fVar.e(6, this.f469637i);
            fVar.e(7, this.f469638m);
            fVar.e(8, this.f469639n);
            fVar.k(9, 2, this.f469640o);
            fVar.e(10, this.f469641p);
            fVar.k(11, 2, this.f469642q);
            fVar.e(12, this.f469643r);
            fVar.k(13, 2, this.f469644s);
            java.lang.String str = this.f469645t;
            if (str == null) {
                return 0;
            }
            fVar.j(14, str);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469632d) + 0 + b36.f.e(2, this.f469633e) + b36.f.e(3, this.f469634f);
            r45.b27 b27Var2 = this.f469635g;
            if (b27Var2 != null) {
                e17 += b36.f.i(4, b27Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(5, this.f469636h) + b36.f.e(6, this.f469637i) + b36.f.e(7, this.f469638m) + b36.f.e(8, this.f469639n) + b36.f.k(9, 2, this.f469640o) + b36.f.e(10, this.f469641p) + b36.f.k(11, 2, this.f469642q) + b36.f.e(12, this.f469643r) + b36.f.k(13, 2, this.f469644s);
            java.lang.String str2 = this.f469645t;
            return str2 != null ? e18 + b36.f.j(14, str2) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f469640o.clear();
            this.f469642q.clear();
            this.f469644s.clear();
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
        r45.vc6 vc6Var = (r45.vc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vc6Var.f469632d = aVar2.g(intValue);
                return 0;
            case 2:
                vc6Var.f469633e = aVar2.g(intValue);
                return 0;
            case 3:
                vc6Var.f469634f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.b27 b27Var3 = new r45.b27();
                    if (bArr2 != null && bArr2.length > 0) {
                        b27Var3.mo11468x92b714fd(bArr2);
                    }
                    vc6Var.f469635g = b27Var3;
                }
                return 0;
            case 5:
                vc6Var.f469636h = aVar2.g(intValue);
                return 0;
            case 6:
                vc6Var.f469637i = aVar2.g(intValue);
                return 0;
            case 7:
                vc6Var.f469638m = aVar2.g(intValue);
                return 0;
            case 8:
                vc6Var.f469639n = aVar2.g(intValue);
                return 0;
            case 9:
                byte[] bArr3 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                vc6Var.f469640o = linkedList;
                return 0;
            case 10:
                vc6Var.f469641p = aVar2.g(intValue);
                return 0;
            case 11:
                byte[] bArr4 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler2 = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                while (aVar4.f329129c < aVar4.f329128b) {
                    linkedList2.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                vc6Var.f469642q = linkedList2;
                return 0;
            case 12:
                vc6Var.f469643r = aVar2.g(intValue);
                return 0;
            case 13:
                byte[] bArr5 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler3 = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler3, "unknownTagHandler");
                e36.a aVar5 = new e36.a(bArr5, 0, bArr5.length);
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                while (aVar5.f329129c < aVar5.f329128b) {
                    linkedList3.add(java.lang.Integer.valueOf(aVar5.f()));
                }
                vc6Var.f469644s = linkedList3;
                return 0;
            case 14:
                vc6Var.f469645t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
