package com.tencent.mm.memory;

/* loaded from: classes14.dex */
public class i extends com.tencent.mm.memory.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.memory.i f68963d = new com.tencent.mm.memory.i();

    @Override // com.tencent.mm.memory.g
    public java.lang.Object b(java.lang.Comparable comparable) {
        return new byte[((java.lang.Integer) comparable).intValue()];
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
        return 1048576L;
    }

    @Override // com.tencent.mm.memory.g
    public long h() {
        return 5242880L;
    }

    @Override // com.tencent.mm.memory.g
    public java.lang.Comparable i(java.lang.Comparable comparable) {
        return (java.lang.Integer) comparable;
    }

    @Override // com.tencent.mm.memory.g
    public com.tencent.mm.memory.d j(java.lang.Comparable comparable) {
        return new com.tencent.mm.memory.h(((java.lang.Integer) comparable).intValue());
    }

    public synchronized void n(byte[] bArr) {
        java.util.Arrays.fill(bArr, (byte) 0);
        k(bArr);
    }
}
