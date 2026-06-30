package r45;

/* loaded from: classes8.dex */
public class f37 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455530d;

    /* renamed from: e, reason: collision with root package name */
    public int f455531e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f455532f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f37)) {
            return false;
        }
        r45.f37 f37Var = (r45.f37) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455530d), java.lang.Integer.valueOf(f37Var.f455530d)) && n51.f.a(java.lang.Integer.valueOf(this.f455531e), java.lang.Integer.valueOf(f37Var.f455531e)) && n51.f.a(this.f455532f, f37Var.f455532f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455532f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455530d);
            fVar.e(2, this.f455531e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f455530d) + 0 + b36.f.e(2, this.f455531e) + b36.f.g(3, 8, linkedList);
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
        r45.f37 f37Var = (r45.f37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f37Var.f455530d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            f37Var.f455531e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.b27 b27Var = new r45.b27();
            if (bArr2 != null && bArr2.length > 0) {
                b27Var.mo11468x92b714fd(bArr2);
            }
            f37Var.f455532f.add(b27Var);
        }
        return 0;
    }
}
