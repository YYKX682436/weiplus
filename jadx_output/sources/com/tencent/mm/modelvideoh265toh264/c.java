package com.tencent.mm.modelvideoh265toh264;

/* loaded from: classes14.dex */
public class c extends com.tencent.mm.memory.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.modelvideoh265toh264.c f71653d = new com.tencent.mm.modelvideoh265toh264.c();

    /* renamed from: e, reason: collision with root package name */
    public static int f71654e = 0;

    @Override // com.tencent.mm.memory.g
    public java.lang.Object b(java.lang.Comparable comparable) {
        return new byte[((java.lang.Integer) comparable).intValue()];
    }

    @Override // com.tencent.mm.memory.g
    public void c() {
        super.c();
    }

    @Override // com.tencent.mm.memory.g
    public long e(java.lang.Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // com.tencent.mm.memory.g
    public java.lang.Comparable f(java.lang.Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= 0) {
            return 0;
        }
        return java.lang.Integer.valueOf(bArr.length);
    }

    @Override // com.tencent.mm.memory.g
    public long g() {
        return 10485760L;
    }

    @Override // com.tencent.mm.memory.g
    public long h() {
        if (f71654e <= 0) {
            f71654e = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        }
        return f71654e >= 512 ? 41943040L : 20971520L;
    }

    @Override // com.tencent.mm.memory.g
    public java.lang.Comparable i(java.lang.Comparable comparable) {
        return (java.lang.Integer) comparable;
    }

    @Override // com.tencent.mm.memory.g
    public com.tencent.mm.memory.d j(java.lang.Comparable comparable) {
        return new com.tencent.mm.memory.h(((java.lang.Integer) comparable).intValue());
    }

    @Override // com.tencent.mm.memory.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public synchronized byte[] m(java.lang.Integer num) {
        byte[] bArr;
        bArr = (byte[]) super.m(num);
        if (bArr == null) {
            bArr = new byte[num.intValue()];
        }
        return bArr;
    }
}
