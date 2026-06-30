package wn1;

/* loaded from: classes9.dex */
public class c0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f528943d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f528944e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f528945f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f528946g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.c0)) {
            return false;
        }
        wn1.c0 c0Var = (wn1.c0) fVar;
        return n51.f.a(this.f528943d, c0Var.f528943d) && n51.f.a(this.f528944e, c0Var.f528944e) && n51.f.a(this.f528945f, c0Var.f528945f) && n51.f.a(this.f528946g, c0Var.f528946g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 3, this.f528943d);
            fVar.g(2, 1, this.f528944e);
            fVar.g(3, 1, this.f528945f);
            java.lang.String str = this.f528946g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 3, this.f528943d) + 0 + b36.f.g(2, 1, this.f528944e) + b36.f.g(3, 1, this.f528945f);
            java.lang.String str2 = this.f528946g;
            return str2 != null ? g17 + b36.f.j(4, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f528943d.clear();
            this.f528944e.clear();
            this.f528945f.clear();
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
        wn1.c0 c0Var = (wn1.c0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c0Var.f528943d.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        if (intValue == 2) {
            c0Var.f528944e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            c0Var.f528945f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        c0Var.f528946g = aVar2.k(intValue);
        return 0;
    }
}
