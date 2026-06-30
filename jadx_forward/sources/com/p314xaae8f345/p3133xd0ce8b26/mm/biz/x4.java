package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class x4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f300311d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f300312e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f300313f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f300314g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x4 x4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x4) fVar;
        return n51.f.a(this.f300311d, x4Var.f300311d) && n51.f.a(this.f300312e, x4Var.f300312e) && n51.f.a(this.f300313f, x4Var.f300313f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.x4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300313f;
        java.util.LinkedList linkedList2 = this.f300312e;
        java.util.LinkedList linkedList3 = this.f300311d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList3) + 0 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        boolean[] zArr = this.f300314g;
        if (intValue != 1) {
            if (intValue == 2) {
                linkedList2.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            linkedList.add(aVar2.k(intValue));
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q1 q1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q1();
            if (bArr != null && bArr.length > 0) {
                q1Var.mo11468x92b714fd(bArr);
            }
            linkedList3.add(q1Var);
        }
        zArr[1] = true;
        return 0;
    }
}
