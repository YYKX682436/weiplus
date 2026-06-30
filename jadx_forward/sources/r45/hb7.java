package r45;

/* loaded from: classes2.dex */
public class hb7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457562d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f457563e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f457564f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hb7)) {
            return false;
        }
        r45.hb7 hb7Var = (r45.hb7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457562d), java.lang.Integer.valueOf(hb7Var.f457562d)) && n51.f.a(this.f457563e, hb7Var.f457563e) && n51.f.a(this.f457564f, hb7Var.f457564f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457564f;
        java.util.LinkedList linkedList2 = this.f457563e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457562d);
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f457562d) + 0 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 8, linkedList);
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
        r45.hb7 hb7Var = (r45.hb7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hb7Var.f457562d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hb7Var.f457563e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.gb7 gb7Var = new r45.gb7();
            if (bArr2 != null && bArr2.length > 0) {
                gb7Var.mo11468x92b714fd(bArr2);
            }
            hb7Var.f457564f.add(gb7Var);
        }
        return 0;
    }
}
