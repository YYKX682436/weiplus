package r45;

/* loaded from: classes4.dex */
public class p96 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464424d;

    /* renamed from: f, reason: collision with root package name */
    public int f464426f;

    /* renamed from: h, reason: collision with root package name */
    public int f464428h;

    /* renamed from: m, reason: collision with root package name */
    public int f464430m;

    /* renamed from: o, reason: collision with root package name */
    public int f464432o;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f464425e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f464427g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f464429i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f464431n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p96)) {
            return false;
        }
        r45.p96 p96Var = (r45.p96) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464424d), java.lang.Integer.valueOf(p96Var.f464424d)) && n51.f.a(this.f464425e, p96Var.f464425e) && n51.f.a(java.lang.Integer.valueOf(this.f464426f), java.lang.Integer.valueOf(p96Var.f464426f)) && n51.f.a(this.f464427g, p96Var.f464427g) && n51.f.a(java.lang.Integer.valueOf(this.f464428h), java.lang.Integer.valueOf(p96Var.f464428h)) && n51.f.a(this.f464429i, p96Var.f464429i) && n51.f.a(java.lang.Integer.valueOf(this.f464430m), java.lang.Integer.valueOf(p96Var.f464430m)) && n51.f.a(this.f464431n, p96Var.f464431n) && n51.f.a(java.lang.Integer.valueOf(this.f464432o), java.lang.Integer.valueOf(p96Var.f464432o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464429i;
        java.util.LinkedList linkedList2 = this.f464425e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464424d);
            fVar.g(2, 8, linkedList2);
            fVar.e(3, this.f464426f);
            fVar.k(4, 2, this.f464427g);
            fVar.e(5, this.f464428h);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f464430m);
            fVar.k(8, 2, this.f464431n);
            fVar.e(9, this.f464432o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f464424d) + 0 + b36.f.g(2, 8, linkedList2) + b36.f.e(3, this.f464426f) + b36.f.k(4, 2, this.f464427g) + b36.f.e(5, this.f464428h) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f464430m) + b36.f.k(8, 2, this.f464431n) + b36.f.e(9, this.f464432o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            this.f464427g.clear();
            linkedList.clear();
            this.f464431n.clear();
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
        r45.p96 p96Var = (r45.p96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p96Var.f464424d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var.b(bArr2);
                    }
                    p96Var.f464425e.add(du5Var);
                }
                return 0;
            case 3:
                p96Var.f464426f = aVar2.g(intValue);
                return 0;
            case 4:
                byte[] bArr3 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList3.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                p96Var.f464427g = linkedList3;
                return 0;
            case 5:
                p96Var.f464428h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr4 = (byte[]) j18.get(i19);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var2.b(bArr4);
                    }
                    p96Var.f464429i.add(du5Var2);
                }
                return 0;
            case 7:
                p96Var.f464430m = aVar2.g(intValue);
                return 0;
            case 8:
                byte[] bArr5 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler2 = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr5, 0, bArr5.length);
                java.util.LinkedList linkedList4 = new java.util.LinkedList();
                while (aVar4.f329129c < aVar4.f329128b) {
                    linkedList4.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                p96Var.f464431n = linkedList4;
                return 0;
            case 9:
                p96Var.f464432o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
