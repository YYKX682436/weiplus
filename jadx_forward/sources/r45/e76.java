package r45;

/* loaded from: classes4.dex */
public class e76 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f454611d;

    /* renamed from: e, reason: collision with root package name */
    public int f454612e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f454613f;

    /* renamed from: g, reason: collision with root package name */
    public int f454614g;

    /* renamed from: h, reason: collision with root package name */
    public int f454615h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f454616i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e76)) {
            return false;
        }
        r45.e76 e76Var = (r45.e76) fVar;
        return n51.f.a(this.f454611d, e76Var.f454611d) && n51.f.a(java.lang.Integer.valueOf(this.f454612e), java.lang.Integer.valueOf(e76Var.f454612e)) && n51.f.a(this.f454613f, e76Var.f454613f) && n51.f.a(java.lang.Integer.valueOf(this.f454614g), java.lang.Integer.valueOf(e76Var.f454614g)) && n51.f.a(java.lang.Integer.valueOf(this.f454615h), java.lang.Integer.valueOf(e76Var.f454615h)) && n51.f.a(this.f454616i, e76Var.f454616i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f454611d;
            if (du5Var != null) {
                fVar.i(1, du5Var.mo75928xcd1e8d8());
                this.f454611d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f454612e);
            r45.du5 du5Var2 = this.f454613f;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.mo75928xcd1e8d8());
                this.f454613f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f454614g);
            fVar.e(5, this.f454615h);
            fVar.k(6, 2, this.f454616i);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var3 = this.f454611d;
            int i18 = (du5Var3 != null ? 0 + b36.f.i(1, du5Var3.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f454612e);
            r45.du5 du5Var4 = this.f454613f;
            if (du5Var4 != null) {
                i18 += b36.f.i(3, du5Var4.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(4, this.f454614g) + b36.f.e(5, this.f454615h) + b36.f.k(6, 2, this.f454616i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f454616i.clear();
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
        r45.e76 e76Var = (r45.e76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var5.b(bArr2);
                    }
                    e76Var.f454611d = du5Var5;
                }
                return 0;
            case 2:
                e76Var.f454612e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var6.b(bArr3);
                    }
                    e76Var.f454613f = du5Var6;
                }
                return 0;
            case 4:
                e76Var.f454614g = aVar2.g(intValue);
                return 0;
            case 5:
                e76Var.f454615h = aVar2.g(intValue);
                return 0;
            case 6:
                byte[] bArr4 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                e76Var.f454616i = linkedList;
                return 0;
            default:
                return -1;
        }
    }
}
