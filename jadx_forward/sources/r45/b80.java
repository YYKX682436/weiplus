package r45;

/* loaded from: classes9.dex */
public class b80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f452155d;

    /* renamed from: e, reason: collision with root package name */
    public long f452156e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f452157f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f452158g;

    /* renamed from: h, reason: collision with root package name */
    public int f452159h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b80)) {
            return false;
        }
        r45.b80 b80Var = (r45.b80) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f452155d), java.lang.Long.valueOf(b80Var.f452155d)) && n51.f.a(java.lang.Long.valueOf(this.f452156e), java.lang.Long.valueOf(b80Var.f452156e)) && n51.f.a(this.f452157f, b80Var.f452157f) && n51.f.a(java.lang.Integer.valueOf(this.f452158g), java.lang.Integer.valueOf(b80Var.f452158g)) && n51.f.a(java.lang.Integer.valueOf(this.f452159h), java.lang.Integer.valueOf(b80Var.f452159h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452157f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f452155d);
            fVar.h(2, this.f452156e);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f452158g);
            fVar.e(5, this.f452159h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f452155d) + 0 + b36.f.h(2, this.f452156e) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f452158g) + b36.f.e(5, this.f452159h);
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
        r45.b80 b80Var = (r45.b80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b80Var.f452155d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            b80Var.f452156e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                b80Var.f452158g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            b80Var.f452159h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.a80 a80Var = new r45.a80();
            if (bArr2 != null && bArr2.length > 0) {
                a80Var.mo11468x92b714fd(bArr2);
            }
            b80Var.f452157f.add(a80Var);
        }
        return 0;
    }
}
