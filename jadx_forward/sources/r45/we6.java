package r45;

/* loaded from: classes2.dex */
public class we6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f470648d;

    /* renamed from: e, reason: collision with root package name */
    public int f470649e;

    /* renamed from: f, reason: collision with root package name */
    public int f470650f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f470651g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f470652h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f470653i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470654m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.we6)) {
            return false;
        }
        r45.we6 we6Var = (r45.we6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f470648d), java.lang.Long.valueOf(we6Var.f470648d)) && n51.f.a(java.lang.Integer.valueOf(this.f470649e), java.lang.Integer.valueOf(we6Var.f470649e)) && n51.f.a(java.lang.Integer.valueOf(this.f470650f), java.lang.Integer.valueOf(we6Var.f470650f)) && n51.f.a(java.lang.Boolean.valueOf(this.f470651g), java.lang.Boolean.valueOf(we6Var.f470651g)) && n51.f.a(this.f470652h, we6Var.f470652h) && n51.f.a(this.f470653i, we6Var.f470653i) && n51.f.a(this.f470654m, we6Var.f470654m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470653i;
        java.util.LinkedList linkedList2 = this.f470652h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f470648d);
            fVar.e(2, this.f470649e);
            fVar.e(3, this.f470650f);
            fVar.a(4, this.f470651g);
            fVar.g(5, 1, linkedList2);
            fVar.g(6, 1, linkedList);
            java.lang.String str = this.f470654m;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f470648d) + 0 + b36.f.e(2, this.f470649e) + b36.f.e(3, this.f470650f) + b36.f.a(4, this.f470651g) + b36.f.g(5, 1, linkedList2) + b36.f.g(6, 1, linkedList);
            java.lang.String str2 = this.f470654m;
            return str2 != null ? h17 + b36.f.j(7, str2) : h17;
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
        r45.we6 we6Var = (r45.we6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                we6Var.f470648d = aVar2.i(intValue);
                return 0;
            case 2:
                we6Var.f470649e = aVar2.g(intValue);
                return 0;
            case 3:
                we6Var.f470650f = aVar2.g(intValue);
                return 0;
            case 4:
                we6Var.f470651g = aVar2.c(intValue);
                return 0;
            case 5:
                we6Var.f470652h.add(aVar2.k(intValue));
                return 0;
            case 6:
                we6Var.f470653i.add(aVar2.k(intValue));
                return 0;
            case 7:
                we6Var.f470654m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
