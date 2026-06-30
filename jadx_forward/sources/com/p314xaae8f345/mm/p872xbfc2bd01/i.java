package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes14.dex */
public class i extends com.p314xaae8f345.mm.p872xbfc2bd01.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p872xbfc2bd01.i f150496d = new com.p314xaae8f345.mm.p872xbfc2bd01.i();

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Object b(java.lang.Comparable comparable) {
        return new byte[((java.lang.Integer) comparable).intValue()];
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long e(java.lang.Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Comparable f(java.lang.Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= 0) {
            return 0;
        }
        return java.lang.Integer.valueOf(bArr.length);
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long g() {
        return 1048576L;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long h() {
        return 5242880L;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Comparable i(java.lang.Comparable comparable) {
        return (java.lang.Integer) comparable;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public com.p314xaae8f345.mm.p872xbfc2bd01.d j(java.lang.Comparable comparable) {
        return new com.p314xaae8f345.mm.p872xbfc2bd01.h(((java.lang.Integer) comparable).intValue());
    }

    public synchronized void n(byte[] bArr) {
        java.util.Arrays.fill(bArr, (byte) 0);
        k(bArr);
    }
}
