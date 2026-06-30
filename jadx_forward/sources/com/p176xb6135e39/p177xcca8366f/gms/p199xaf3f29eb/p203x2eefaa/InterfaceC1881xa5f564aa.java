package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.DataBuffer */
/* loaded from: classes13.dex */
public interface InterfaceC1881xa5f564aa<T> extends java.lang.Iterable<T>, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98, java.io.Closeable {
    void close();

    T get(int i17);

    /* renamed from: getCount */
    int mo17736x7444f759();

    /* renamed from: getMetadata */
    android.os.Bundle mo17737x6107b8a5();

    @java.lang.Deprecated
    /* renamed from: isClosed */
    boolean mo17738xd742d336();

    @Override // java.lang.Iterable
    java.util.Iterator<T> iterator();

    /* renamed from: release */
    void mo17739x41012807();

    /* renamed from: singleRefIterator */
    java.util.Iterator<T> mo17740x55d908b9();
}
