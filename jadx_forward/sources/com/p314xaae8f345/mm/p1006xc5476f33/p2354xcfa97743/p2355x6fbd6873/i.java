package com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873;

/* loaded from: classes12.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i f258800h = new com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.b f258801d;

    /* renamed from: e, reason: collision with root package name */
    public int f258802e;

    /* renamed from: f, reason: collision with root package name */
    public int f258803f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f258804g = new boolean[4];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i) fVar;
        return n51.f.a(this.f258801d, iVar.f258801d) && n51.f.a(java.lang.Integer.valueOf(this.f258802e), java.lang.Integer.valueOf(iVar.f258802e)) && n51.f.a(java.lang.Integer.valueOf(this.f258803f), java.lang.Integer.valueOf(iVar.f258803f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f258804g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.b bVar = this.f258801d;
            if (bVar != null && zArr[1]) {
                fVar.e(1, bVar.f258760d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f258802e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f258803f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.b bVar2 = this.f258801d;
            if (bVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bVar2.f258760d);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f258802e);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f258803f) : i18;
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
            int g17 = aVar2.g(intValue);
            this.f258801d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.b.VoIPMPCameraDefinition1080P : com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.b.VoIPMPCameraDefinition720P : com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.b.VoIPMPCameraDefinition480P;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f258802e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f258803f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i) super.mo11468x92b714fd(bArr);
    }
}
