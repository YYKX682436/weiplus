package com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232;

/* loaded from: classes2.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f299371d;

    /* renamed from: e, reason: collision with root package name */
    public int f299372e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f299373f;

    /* renamed from: g, reason: collision with root package name */
    public int f299374g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f299375h;

    /* renamed from: i, reason: collision with root package name */
    public int f299376i;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h();
    }

    public h() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
        this.f299371d = gVar;
        this.f299372e = 0;
        this.f299373f = gVar;
        this.f299374g = 0;
        this.f299375h = gVar;
        this.f299376i = 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h hVar = (com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h) fVar;
        return n51.f.a(this.f299371d, hVar.f299371d) && n51.f.a(java.lang.Integer.valueOf(this.f299372e), java.lang.Integer.valueOf(hVar.f299372e)) && n51.f.a(this.f299373f, hVar.f299373f) && n51.f.a(java.lang.Integer.valueOf(this.f299374g), java.lang.Integer.valueOf(hVar.f299374g)) && n51.f.a(this.f299375h, hVar.f299375h) && n51.f.a(java.lang.Integer.valueOf(this.f299376i), java.lang.Integer.valueOf(hVar.f299376i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f299371d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f299372e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f299373f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.f299374g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f299375h;
            if (gVar3 != null) {
                fVar.b(5, gVar3);
            }
            fVar.e(6, this.f299376i);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f299371d;
            int b17 = (gVar4 != null ? 0 + b36.f.b(1, gVar4) : 0) + b36.f.e(2, this.f299372e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f299373f;
            if (gVar5 != null) {
                b17 += b36.f.b(3, gVar5);
            }
            int e17 = b17 + b36.f.e(4, this.f299374g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f299375h;
            if (gVar6 != null) {
                e17 += b36.f.b(5, gVar6);
            }
            return e17 + b36.f.e(6, this.f299376i);
        }
        if (i17 == 2) {
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
                this.f299371d = aVar2.d(intValue);
                return 0;
            case 2:
                this.f299372e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f299373f = aVar2.d(intValue);
                return 0;
            case 4:
                this.f299374g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f299375h = aVar2.d(intValue);
                return 0;
            case 6:
                this.f299376i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
