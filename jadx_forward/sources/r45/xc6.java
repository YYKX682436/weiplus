package r45;

/* loaded from: classes14.dex */
public class xc6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471502d;

    /* renamed from: e, reason: collision with root package name */
    public int f471503e;

    /* renamed from: f, reason: collision with root package name */
    public int f471504f;

    /* renamed from: g, reason: collision with root package name */
    public int f471505g;

    /* renamed from: h, reason: collision with root package name */
    public int f471506h;

    /* renamed from: i, reason: collision with root package name */
    public int f471507i;

    /* renamed from: m, reason: collision with root package name */
    public int f471508m;

    /* renamed from: o, reason: collision with root package name */
    public int f471510o;

    /* renamed from: p, reason: collision with root package name */
    public int f471511p;

    /* renamed from: r, reason: collision with root package name */
    public int f471513r;

    /* renamed from: s, reason: collision with root package name */
    public int f471514s;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f471509n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f471512q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xc6)) {
            return false;
        }
        r45.xc6 xc6Var = (r45.xc6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471502d), java.lang.Integer.valueOf(xc6Var.f471502d)) && n51.f.a(java.lang.Integer.valueOf(this.f471503e), java.lang.Integer.valueOf(xc6Var.f471503e)) && n51.f.a(java.lang.Integer.valueOf(this.f471504f), java.lang.Integer.valueOf(xc6Var.f471504f)) && n51.f.a(java.lang.Integer.valueOf(this.f471505g), java.lang.Integer.valueOf(xc6Var.f471505g)) && n51.f.a(java.lang.Integer.valueOf(this.f471506h), java.lang.Integer.valueOf(xc6Var.f471506h)) && n51.f.a(java.lang.Integer.valueOf(this.f471507i), java.lang.Integer.valueOf(xc6Var.f471507i)) && n51.f.a(java.lang.Integer.valueOf(this.f471508m), java.lang.Integer.valueOf(xc6Var.f471508m)) && n51.f.a(this.f471509n, xc6Var.f471509n) && n51.f.a(java.lang.Integer.valueOf(this.f471510o), java.lang.Integer.valueOf(xc6Var.f471510o)) && n51.f.a(java.lang.Integer.valueOf(this.f471511p), java.lang.Integer.valueOf(xc6Var.f471511p)) && n51.f.a(this.f471512q, xc6Var.f471512q) && n51.f.a(java.lang.Integer.valueOf(this.f471513r), java.lang.Integer.valueOf(xc6Var.f471513r)) && n51.f.a(java.lang.Integer.valueOf(this.f471514s), java.lang.Integer.valueOf(xc6Var.f471514s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471512q;
        java.util.LinkedList linkedList2 = this.f471509n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471502d);
            fVar.e(2, this.f471503e);
            fVar.e(3, this.f471504f);
            fVar.e(4, this.f471505g);
            fVar.e(5, this.f471506h);
            fVar.e(6, this.f471507i);
            fVar.e(7, this.f471508m);
            fVar.g(8, 2, linkedList2);
            fVar.e(9, this.f471510o);
            fVar.e(10, this.f471511p);
            fVar.g(11, 2, linkedList);
            fVar.e(12, this.f471513r);
            fVar.e(13, this.f471514s);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f471502d) + 0 + b36.f.e(2, this.f471503e) + b36.f.e(3, this.f471504f) + b36.f.e(4, this.f471505g) + b36.f.e(5, this.f471506h) + b36.f.e(6, this.f471507i) + b36.f.e(7, this.f471508m) + b36.f.g(8, 2, linkedList2) + b36.f.e(9, this.f471510o) + b36.f.e(10, this.f471511p) + b36.f.g(11, 2, linkedList) + b36.f.e(12, this.f471513r) + b36.f.e(13, this.f471514s);
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
        r45.xc6 xc6Var = (r45.xc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xc6Var.f471502d = aVar2.g(intValue);
                return 0;
            case 2:
                xc6Var.f471503e = aVar2.g(intValue);
                return 0;
            case 3:
                xc6Var.f471504f = aVar2.g(intValue);
                return 0;
            case 4:
                xc6Var.f471505g = aVar2.g(intValue);
                return 0;
            case 5:
                xc6Var.f471506h = aVar2.g(intValue);
                return 0;
            case 6:
                xc6Var.f471507i = aVar2.g(intValue);
                return 0;
            case 7:
                xc6Var.f471508m = aVar2.g(intValue);
                return 0;
            case 8:
                xc6Var.f471509n.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 9:
                xc6Var.f471510o = aVar2.g(intValue);
                return 0;
            case 10:
                xc6Var.f471511p = aVar2.g(intValue);
                return 0;
            case 11:
                xc6Var.f471512q.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 12:
                xc6Var.f471513r = aVar2.g(intValue);
                return 0;
            case 13:
                xc6Var.f471514s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
