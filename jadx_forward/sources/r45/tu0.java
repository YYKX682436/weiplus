package r45;

/* loaded from: classes2.dex */
public class tu0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f468341d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f468342e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.dg4 f468343f;

    /* renamed from: g, reason: collision with root package name */
    public r45.qb1 f468344g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tu0)) {
            return false;
        }
        r45.tu0 tu0Var = (r45.tu0) fVar;
        return n51.f.a(this.f468341d, tu0Var.f468341d) && n51.f.a(this.f468342e, tu0Var.f468342e) && n51.f.a(this.f468343f, tu0Var.f468343f) && n51.f.a(this.f468344g, tu0Var.f468344g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468342e;
        java.util.LinkedList linkedList2 = this.f468341d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            r45.dg4 dg4Var = this.f468343f;
            if (dg4Var != null) {
                fVar.i(3, dg4Var.mo75928xcd1e8d8());
                this.f468343f.mo75956x3d5d1f78(fVar);
            }
            r45.qb1 qb1Var = this.f468344g;
            if (qb1Var != null) {
                fVar.i(4, qb1Var.mo75928xcd1e8d8());
                this.f468344g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
            r45.dg4 dg4Var2 = this.f468343f;
            if (dg4Var2 != null) {
                g17 += b36.f.i(3, dg4Var2.mo75928xcd1e8d8());
            }
            r45.qb1 qb1Var2 = this.f468344g;
            return qb1Var2 != null ? g17 + b36.f.i(4, qb1Var2.mo75928xcd1e8d8()) : g17;
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
        r45.tu0 tu0Var = (r45.tu0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                if (bArr2 != null && bArr2.length > 0) {
                    c19792x256d2725.mo11468x92b714fd(bArr2);
                }
                tu0Var.f468341d.add(c19792x256d2725);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.ig4 ig4Var = new r45.ig4();
                if (bArr3 != null && bArr3.length > 0) {
                    ig4Var.mo11468x92b714fd(bArr3);
                }
                tu0Var.f468342e.add(ig4Var);
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr4 = (byte[]) j19.get(i27);
                r45.dg4 dg4Var3 = new r45.dg4();
                if (bArr4 != null && bArr4.length > 0) {
                    dg4Var3.mo11468x92b714fd(bArr4);
                }
                tu0Var.f468343f = dg4Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr5 = (byte[]) j27.get(i28);
            r45.qb1 qb1Var3 = new r45.qb1();
            if (bArr5 != null && bArr5.length > 0) {
                qb1Var3.mo11468x92b714fd(bArr5);
            }
            tu0Var.f468344g = qb1Var3;
        }
        return 0;
    }
}
