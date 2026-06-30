package com.p314xaae8f345.p3133xd0ce8b26.aff.udr;

/* loaded from: classes7.dex */
public class w extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w f299118f = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f299119d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f299120e = new boolean[2];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w) && n51.f.a(this.f299119d, ((com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w) fVar).f299119d);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299119d;
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0;
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
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x();
            if (bArr != null && bArr.length > 0) {
                xVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(xVar);
        }
        this.f299120e[1] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w) super.mo11468x92b714fd(bArr);
    }
}
