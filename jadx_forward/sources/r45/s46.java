package r45;

/* loaded from: classes7.dex */
public class s46 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f467035d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467036e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f467037f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f467038g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s46)) {
            return false;
        }
        r45.s46 s46Var = (r45.s46) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f467035d), java.lang.Long.valueOf(s46Var.f467035d)) && n51.f.a(this.f467036e, s46Var.f467036e) && n51.f.a(this.f467037f, s46Var.f467037f) && n51.f.a(java.lang.Integer.valueOf(this.f467038g), java.lang.Integer.valueOf(s46Var.f467038g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467037f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f467035d);
            java.lang.String str = this.f467036e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList);
            fVar.e(4, this.f467038g);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f467035d) + 0;
            java.lang.String str2 = this.f467036e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.g(3, 1, linkedList) + b36.f.e(4, this.f467038g);
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
        r45.s46 s46Var = (r45.s46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s46Var.f467035d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            s46Var.f467036e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s46Var.f467037f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        s46Var.f467038g = aVar2.g(intValue);
        return 0;
    }
}
