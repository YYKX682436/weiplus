package r45;

/* loaded from: classes4.dex */
public class zh4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473596d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f473597e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zh4)) {
            return false;
        }
        r45.zh4 zh4Var = (r45.zh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473596d), java.lang.Integer.valueOf(zh4Var.f473596d)) && n51.f.a(this.f473597e, zh4Var.f473597e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473597e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473596d);
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f473596d) + 0 + b36.f.g(2, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.zh4 zh4Var = (r45.zh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zh4Var.f473596d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.yh4 yh4Var = new r45.yh4();
            if (bArr2 != null && bArr2.length > 0) {
                yh4Var.mo11468x92b714fd(bArr2);
            }
            zh4Var.f473597e.add(yh4Var);
        }
        return 0;
    }
}
