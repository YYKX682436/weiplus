package r45;

/* loaded from: classes14.dex */
public class d37 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.do5 f453585d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ve0 f453586e;

    /* renamed from: f, reason: collision with root package name */
    public int f453587f;

    /* renamed from: h, reason: collision with root package name */
    public int f453589h;

    /* renamed from: m, reason: collision with root package name */
    public int f453591m;

    /* renamed from: n, reason: collision with root package name */
    public r45.do5 f453592n;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f453588g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f453590i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d37)) {
            return false;
        }
        r45.d37 d37Var = (r45.d37) fVar;
        return n51.f.a(this.f453585d, d37Var.f453585d) && n51.f.a(this.f453586e, d37Var.f453586e) && n51.f.a(java.lang.Integer.valueOf(this.f453587f), java.lang.Integer.valueOf(d37Var.f453587f)) && n51.f.a(this.f453588g, d37Var.f453588g) && n51.f.a(java.lang.Integer.valueOf(this.f453589h), java.lang.Integer.valueOf(d37Var.f453589h)) && n51.f.a(this.f453590i, d37Var.f453590i) && n51.f.a(java.lang.Integer.valueOf(this.f453591m), java.lang.Integer.valueOf(d37Var.f453591m)) && n51.f.a(this.f453592n, d37Var.f453592n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.do5 do5Var = this.f453585d;
            if (do5Var != null) {
                fVar.i(1, do5Var.mo75928xcd1e8d8());
                this.f453585d.mo75956x3d5d1f78(fVar);
            }
            r45.ve0 ve0Var = this.f453586e;
            if (ve0Var != null) {
                fVar.i(2, ve0Var.mo75928xcd1e8d8());
                this.f453586e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f453587f);
            fVar.k(4, 2, this.f453588g);
            fVar.e(5, this.f453589h);
            fVar.k(6, 2, this.f453590i);
            fVar.e(7, this.f453591m);
            r45.do5 do5Var2 = this.f453592n;
            if (do5Var2 != null) {
                fVar.i(8, do5Var2.mo75928xcd1e8d8());
                this.f453592n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.do5 do5Var3 = this.f453585d;
            int i18 = do5Var3 != null ? 0 + b36.f.i(1, do5Var3.mo75928xcd1e8d8()) : 0;
            r45.ve0 ve0Var2 = this.f453586e;
            if (ve0Var2 != null) {
                i18 += b36.f.i(2, ve0Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f453587f) + b36.f.k(4, 2, this.f453588g) + b36.f.e(5, this.f453589h) + b36.f.k(6, 2, this.f453590i) + b36.f.e(7, this.f453591m);
            r45.do5 do5Var4 = this.f453592n;
            return do5Var4 != null ? e17 + b36.f.i(8, do5Var4.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f453588g.clear();
            this.f453590i.clear();
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
        r45.d37 d37Var = (r45.d37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.do5 do5Var5 = new r45.do5();
                    if (bArr2 != null && bArr2.length > 0) {
                        do5Var5.mo11468x92b714fd(bArr2);
                    }
                    d37Var.f453585d = do5Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ve0 ve0Var3 = new r45.ve0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ve0Var3.mo11468x92b714fd(bArr3);
                    }
                    d37Var.f453586e = ve0Var3;
                }
                return 0;
            case 3:
                d37Var.f453587f = aVar2.g(intValue);
                return 0;
            case 4:
                byte[] bArr4 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                d37Var.f453588g = linkedList;
                return 0;
            case 5:
                d37Var.f453589h = aVar2.g(intValue);
                return 0;
            case 6:
                byte[] bArr5 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler2 = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr5, 0, bArr5.length);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                while (aVar4.f329129c < aVar4.f329128b) {
                    linkedList2.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                d37Var.f453590i = linkedList2;
                return 0;
            case 7:
                d37Var.f453591m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr6 = (byte[]) j19.get(i28);
                    r45.do5 do5Var6 = new r45.do5();
                    if (bArr6 != null && bArr6.length > 0) {
                        do5Var6.mo11468x92b714fd(bArr6);
                    }
                    d37Var.f453592n = do5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
