package r45;

/* loaded from: classes4.dex */
public class o86 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463566d;

    /* renamed from: e, reason: collision with root package name */
    public int f463567e;

    /* renamed from: f, reason: collision with root package name */
    public int f463568f;

    /* renamed from: g, reason: collision with root package name */
    public int f463569g;

    /* renamed from: h, reason: collision with root package name */
    public int f463570h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f463571i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o86)) {
            return false;
        }
        r45.o86 o86Var = (r45.o86) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463566d), java.lang.Integer.valueOf(o86Var.f463566d)) && n51.f.a(java.lang.Integer.valueOf(this.f463567e), java.lang.Integer.valueOf(o86Var.f463567e)) && n51.f.a(java.lang.Integer.valueOf(this.f463568f), java.lang.Integer.valueOf(o86Var.f463568f)) && n51.f.a(java.lang.Integer.valueOf(this.f463569g), java.lang.Integer.valueOf(o86Var.f463569g)) && n51.f.a(java.lang.Integer.valueOf(this.f463570h), java.lang.Integer.valueOf(o86Var.f463570h)) && n51.f.a(this.f463571i, o86Var.f463571i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463566d);
            fVar.e(2, this.f463567e);
            fVar.e(3, this.f463568f);
            fVar.e(4, this.f463569g);
            fVar.e(5, this.f463570h);
            fVar.k(6, 2, this.f463571i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f463566d) + 0 + b36.f.e(2, this.f463567e) + b36.f.e(3, this.f463568f) + b36.f.e(4, this.f463569g) + b36.f.e(5, this.f463570h) + b36.f.k(6, 2, this.f463571i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f463571i.clear();
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
        r45.o86 o86Var = (r45.o86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o86Var.f463566d = aVar2.g(intValue);
                return 0;
            case 2:
                o86Var.f463567e = aVar2.g(intValue);
                return 0;
            case 3:
                o86Var.f463568f = aVar2.g(intValue);
                return 0;
            case 4:
                o86Var.f463569g = aVar2.g(intValue);
                return 0;
            case 5:
                o86Var.f463570h = aVar2.g(intValue);
                return 0;
            case 6:
                byte[] bArr2 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr2, 0, bArr2.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                o86Var.f463571i = linkedList;
                return 0;
            default:
                return -1;
        }
    }
}
