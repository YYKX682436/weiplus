package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class v4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f277810d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f277811e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f277812f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f277813g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f277814h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f277815i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f277816m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2621x8fb0427b.v4)) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.v4 v4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.v4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f277810d), java.lang.Integer.valueOf(v4Var.f277810d)) && n51.f.a(this.f277811e, v4Var.f277811e) && n51.f.a(this.f277812f, v4Var.f277812f) && n51.f.a(this.f277813g, v4Var.f277813g) && n51.f.a(this.f277814h, v4Var.f277814h) && n51.f.a(this.f277815i, v4Var.f277815i) && n51.f.a(this.f277816m, v4Var.f277816m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f277814h;
        java.util.LinkedList linkedList2 = this.f277813g;
        java.util.LinkedList linkedList3 = this.f277812f;
        java.util.LinkedList linkedList4 = this.f277811e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f277810d);
            fVar.g(2, 2, linkedList4);
            fVar.g(3, 2, linkedList3);
            fVar.g(4, 2, linkedList2);
            fVar.g(5, 3, linkedList);
            fVar.g(6, 3, this.f277815i);
            fVar.g(7, 3, this.f277816m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f277810d) + 0 + b36.f.g(2, 2, linkedList4) + b36.f.g(3, 2, linkedList3) + b36.f.g(4, 2, linkedList2) + b36.f.g(5, 3, linkedList) + b36.f.g(6, 3, this.f277815i) + b36.f.g(7, 3, this.f277816m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            this.f277815i.clear();
            this.f277816m.clear();
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
        com.p314xaae8f345.mm.p2621x8fb0427b.v4 v4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.v4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v4Var.f277810d = aVar2.g(intValue);
                return 0;
            case 2:
                v4Var.f277811e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 3:
                v4Var.f277812f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 4:
                v4Var.f277813g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 5:
                v4Var.f277814h.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            case 6:
                v4Var.f277815i.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            case 7:
                v4Var.f277816m.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            default:
                return -1;
        }
    }
}
