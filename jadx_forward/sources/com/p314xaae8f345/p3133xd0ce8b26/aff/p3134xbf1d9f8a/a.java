package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f297298d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f297299e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f297300f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f297301g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f297302h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f297303i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f297304m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f297305n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f297306o = new boolean[9];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a aVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f297298d), java.lang.Long.valueOf(aVar.f297298d)) && n51.f.a(this.f297299e, aVar.f297299e) && n51.f.a(this.f297300f, aVar.f297300f) && n51.f.a(this.f297301g, aVar.f297301g) && n51.f.a(this.f297302h, aVar.f297302h) && n51.f.a(this.f297303i, aVar.f297303i) && n51.f.a(this.f297304m, aVar.f297304m) && n51.f.a(this.f297305n, aVar.f297305n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f297305n;
        java.util.LinkedList linkedList2 = this.f297304m;
        java.util.LinkedList linkedList3 = this.f297303i;
        java.util.LinkedList linkedList4 = this.f297302h;
        java.util.LinkedList linkedList5 = this.f297301g;
        java.util.LinkedList linkedList6 = this.f297300f;
        java.util.LinkedList linkedList7 = this.f297299e;
        boolean[] zArr = this.f297306o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f297298d);
            }
            fVar.g(2, 1, linkedList7);
            fVar.g(3, 2, linkedList6);
            fVar.g(4, 1, linkedList5);
            fVar.g(5, 1, linkedList4);
            fVar.g(6, 2, linkedList3);
            fVar.g(7, 3, linkedList2);
            fVar.g(8, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? b36.f.h(1, this.f297298d) + 0 : 0) + b36.f.g(2, 1, linkedList7) + b36.f.g(3, 2, linkedList6) + b36.f.g(4, 1, linkedList5) + b36.f.g(5, 1, linkedList4) + b36.f.g(6, 2, linkedList3) + b36.f.g(7, 3, linkedList2) + b36.f.g(8, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList7.clear();
            linkedList6.clear();
            linkedList5.clear();
            linkedList4.clear();
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
        switch (intValue) {
            case 1:
                this.f297298d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                linkedList7.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                linkedList6.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[3] = true;
                return 0;
            case 4:
                linkedList5.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                linkedList4.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                linkedList3.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[6] = true;
                return 0;
            case 7:
                linkedList2.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                zArr[7] = true;
                return 0;
            case 8:
                linkedList.add(aVar2.k(intValue));
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
