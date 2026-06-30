package com.tencent.liteav.videoproducer.capture;

/* loaded from: classes14.dex */
final /* synthetic */ class c implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.videoproducer.capture.c f47075a = new com.tencent.liteav.videoproducer.capture.c();

    private c() {
    }

    public static java.util.Comparator a() {
        return f47075a;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.liteav.base.util.Size) obj2).getArea() - ((com.tencent.liteav.base.util.Size) obj).getArea();
    }
}
