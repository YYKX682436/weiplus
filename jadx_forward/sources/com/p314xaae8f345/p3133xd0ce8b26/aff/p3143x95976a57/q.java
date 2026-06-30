package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes9.dex */
public class q extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f298389e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f298388d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f298390f = new boolean[3];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.q();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.q)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.q qVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.q) fVar;
        return n51.f.a(this.f298388d, qVar.f298388d) && n51.f.a(this.f298389e, qVar.f298389e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.q();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298390f;
        java.util.LinkedList linkedList = this.f298388d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(java.lang.Integer.valueOf(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.u) it.next()).f298404d));
            }
            fVar.g(1, 2, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f298389e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                linkedList3.add(java.lang.Integer.valueOf(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.u) it6.next()).f298404d));
            }
            int g17 = 0 + b36.f.g(1, 2, linkedList3);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f298389e;
            return (gVar2 == null || !zArr[2]) ? g17 : g17 + b36.f.b(2, gVar2);
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
        if (intValue == 1) {
            linkedList.add(com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.u.a(aVar2.g(intValue)));
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f298389e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.q) super.mo11468x92b714fd(bArr);
    }
}
