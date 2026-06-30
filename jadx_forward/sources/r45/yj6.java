package r45;

/* loaded from: classes2.dex */
public class yj6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.nt4 f472692d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f472693e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f472694f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yj6)) {
            return false;
        }
        r45.yj6 yj6Var = (r45.yj6) fVar;
        return n51.f.a(this.f472692d, yj6Var.f472692d) && n51.f.a(this.f472693e, yj6Var.f472693e) && n51.f.a(this.f472694f, yj6Var.f472694f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472694f;
        java.util.LinkedList linkedList2 = this.f472693e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.nt4 nt4Var = this.f472692d;
            if (nt4Var != null) {
                fVar.i(1, nt4Var.mo75928xcd1e8d8());
                this.f472692d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.nt4 nt4Var2 = this.f472692d;
            return (nt4Var2 != null ? 0 + b36.f.i(1, nt4Var2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
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
        r45.yj6 yj6Var = (r45.yj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.nt4 nt4Var3 = new r45.nt4();
                if (bArr2 != null && bArr2.length > 0) {
                    nt4Var3.mo11468x92b714fd(bArr2);
                }
                yj6Var.f472692d = nt4Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.e14 e14Var = new r45.e14();
                if (bArr3 != null && bArr3.length > 0) {
                    e14Var.mo11468x92b714fd(bArr3);
                }
                yj6Var.f472693e.add(e14Var);
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
            r45.rl6 rl6Var = new r45.rl6();
            if (bArr4 != null && bArr4.length > 0) {
                rl6Var.mo11468x92b714fd(bArr4);
            }
            yj6Var.f472694f.add(rl6Var);
        }
        return 0;
    }
}
