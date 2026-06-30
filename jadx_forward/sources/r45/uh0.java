package r45;

/* loaded from: classes4.dex */
public class uh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468908d;

    /* renamed from: e, reason: collision with root package name */
    public int f468909e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f468910f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uh0)) {
            return false;
        }
        r45.uh0 uh0Var = (r45.uh0) fVar;
        return n51.f.a(this.f468908d, uh0Var.f468908d) && n51.f.a(java.lang.Integer.valueOf(this.f468909e), java.lang.Integer.valueOf(uh0Var.f468909e)) && n51.f.a(this.f468910f, uh0Var.f468910f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468910f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468908d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f468909e);
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f468908d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f468909e) + b36.f.g(3, 1, linkedList);
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
        r45.uh0 uh0Var = (r45.uh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            uh0Var.f468908d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            uh0Var.f468909e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        uh0Var.f468910f.add(aVar2.k(intValue));
        return 0;
    }
}
