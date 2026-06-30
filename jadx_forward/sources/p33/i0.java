package p33;

/* loaded from: classes2.dex */
public class i0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433125d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433126e;

    /* renamed from: g, reason: collision with root package name */
    public int f433128g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f433127f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f433129h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.i0)) {
            return false;
        }
        p33.i0 i0Var = (p33.i0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433125d), java.lang.Integer.valueOf(i0Var.f433125d)) && n51.f.a(this.f433126e, i0Var.f433126e) && n51.f.a(this.f433127f, i0Var.f433127f) && n51.f.a(java.lang.Integer.valueOf(this.f433128g), java.lang.Integer.valueOf(i0Var.f433128g)) && n51.f.a(this.f433129h, i0Var.f433129h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f433129h;
        java.util.LinkedList linkedList2 = this.f433127f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433125d);
            java.lang.String str = this.f433126e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList2);
            fVar.e(4, this.f433128g);
            fVar.g(5, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f433125d) + 0;
            java.lang.String str2 = this.f433126e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 1, linkedList2) + b36.f.e(4, this.f433128g) + b36.f.g(5, 1, linkedList);
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
        p33.i0 i0Var = (p33.i0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i0Var.f433125d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            i0Var.f433126e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            i0Var.f433127f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 4) {
            i0Var.f433128g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        i0Var.f433129h.add(aVar2.k(intValue));
        return 0;
    }
}
