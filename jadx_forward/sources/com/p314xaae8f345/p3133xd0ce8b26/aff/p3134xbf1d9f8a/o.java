package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class o extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f297462d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f297463e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f297464f = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o oVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o) fVar;
        return n51.f.a(this.f297462d, oVar.f297462d) && n51.f.a(java.lang.Boolean.valueOf(this.f297463e), java.lang.Boolean.valueOf(oVar.f297463e)) && n51.f.a(java.lang.Long.valueOf(this.f297464f), java.lang.Long.valueOf(oVar.f297464f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f297462d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.a(2, this.f297463e);
            fVar.h(3, this.f297464f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.a(2, this.f297463e) + b36.f.h(3, this.f297464f);
        }
        if (i17 == 2) {
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f297463e = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f297464f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s sVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s();
            if (bArr != null && bArr.length > 0) {
                sVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(sVar);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o) super.mo11468x92b714fd(bArr);
    }
}
