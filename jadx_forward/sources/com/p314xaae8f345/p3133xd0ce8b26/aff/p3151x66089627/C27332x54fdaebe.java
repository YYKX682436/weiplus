package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* renamed from: com.tencent.wechat.aff.iam_scan.ZIDL__CzVbChcB */
/* loaded from: classes15.dex */
class C27332x54fdaebe extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d0 f298461a;

    public C27332x54fdaebe(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d0 d0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d0) obj;
        this.f298461a = d0Var;
        d0Var.getClass();
    }

    /* renamed from: ZIDL_AX */
    private native void m113021x1964d17f(long j17, long j18);

    /* renamed from: ZIDL_BX */
    private native void m113022x1964d19e(long j17, long j18);

    /* renamed from: ZIDL_CX */
    private native void m113023x1964d1bd(long j17, long j18);

    /* renamed from: ZIDL_DX */
    private native void m113024x1964d1dc(long j17, long j18);

    /* renamed from: ZIDL_AV */
    public void m113025x1964d17d(long j17, long j18, long j19) {
        zs5.y yVar = ((zs5.u) this.f298461a).f557017a;
        yVar.getClass();
        d75.b.g(new zs5.i(j18, yVar, j19));
    }

    /* renamed from: ZIDL_BV */
    public void m113026x1964d19c(long j17, long j18, long j19, java.nio.ByteBuffer byteBuffer, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e eVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e.f298528i, bArr);
        zs5.u uVar = (zs5.u) this.f298461a;
        if (eVar == null) {
            uVar.getClass();
        } else {
            zs5.y yVar = uVar.f557017a;
            yVar.i(new zs5.r(yVar, j18, j19, byteBuffer, eVar));
        }
    }

    /* renamed from: ZIDL_CV */
    public void m113027x1964d1bb(long j17, byte[] bArr) {
        d75.b.g(new zs5.t((com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1.f298534f, bArr), ((zs5.u) this.f298461a).f557017a));
    }

    /* renamed from: ZIDL_DV */
    public void m113028x1964d1da(long j17, long j18, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j0 j0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j0.f298608f, bArr);
        zs5.u uVar = (zs5.u) this.f298461a;
        if (j0Var == null) {
            uVar.getClass();
            return;
        }
        zs5.y yVar = uVar.f557017a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var = yVar.f557041i;
        if (!(d1Var != null && d1Var.f298518d == j18) || j0Var.f298610e == 0) {
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k0 k0Var = j0Var.f298609d;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k0 k0Var2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k0.FrameCacheReplaced;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k0 k0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k0.FrameCacheConsumed;
        if (k0Var == k0Var2 || k0Var == k0Var3) {
            yVar.i(new zs5.p(yVar, j0Var, j18));
            if (j0Var.f298609d == k0Var3) {
                d75.b.g(new zs5.q(yVar));
            }
        }
    }
}
