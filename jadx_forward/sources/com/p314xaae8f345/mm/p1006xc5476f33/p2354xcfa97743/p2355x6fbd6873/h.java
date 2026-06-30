package com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873;

/* loaded from: classes9.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.h f258794i = new com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.h();

    /* renamed from: d, reason: collision with root package name */
    public float f258795d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f258796e;

    /* renamed from: f, reason: collision with root package name */
    public float f258797f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f258798g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f258799h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.h)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.h hVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.h) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f258795d), java.lang.Float.valueOf(hVar.f258795d)) && n51.f.a(java.lang.Boolean.valueOf(this.f258796e), java.lang.Boolean.valueOf(hVar.f258796e)) && n51.f.a(java.lang.Float.valueOf(this.f258797f), java.lang.Float.valueOf(hVar.f258797f)) && n51.f.a(java.lang.Boolean.valueOf(this.f258798g), java.lang.Boolean.valueOf(hVar.f258798g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.h();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f258799h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f258795d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f258796e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f258797f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f258798g);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f258795d) : 0;
            if (zArr[2]) {
                d17 += b36.f.a(2, this.f258796e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f258797f);
            }
            return zArr[4] ? d17 + b36.f.a(4, this.f258798g) : d17;
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
        if (intValue == 1) {
            this.f258795d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f258796e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f258797f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f258798g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.h) super.mo11468x92b714fd(bArr);
    }
}
