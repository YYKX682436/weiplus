package r45;

/* loaded from: classes2.dex */
public class o23 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f463375d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f463376e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.qb1 f463377f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o23)) {
            return false;
        }
        r45.o23 o23Var = (r45.o23) fVar;
        return n51.f.a(this.f463375d, o23Var.f463375d) && n51.f.a(this.f463376e, o23Var.f463376e) && n51.f.a(this.f463377f, o23Var.f463377f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463376e;
        java.util.LinkedList linkedList2 = this.f463375d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            r45.qb1 qb1Var = this.f463377f;
            if (qb1Var != null) {
                fVar.i(3, qb1Var.mo75928xcd1e8d8());
                this.f463377f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
            r45.qb1 qb1Var2 = this.f463377f;
            return qb1Var2 != null ? g17 + b36.f.i(3, qb1Var2.mo75928xcd1e8d8()) : g17;
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
        r45.o23 o23Var = (r45.o23) objArr[1];
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
                o23Var.f463375d.add(c19792x256d2725);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.lb1 lb1Var = new r45.lb1();
                if (bArr3 != null && bArr3.length > 0) {
                    lb1Var.mo11468x92b714fd(bArr3);
                }
                o23Var.f463376e.add(lb1Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.qb1 qb1Var3 = new r45.qb1();
            if (bArr4 != null && bArr4.length > 0) {
                qb1Var3.mo11468x92b714fd(bArr4);
            }
            o23Var.f463377f = qb1Var3;
        }
        return 0;
    }
}
