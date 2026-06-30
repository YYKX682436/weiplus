package com.tencent.liteav.videoproducer.capture;

/* loaded from: classes14.dex */
final /* synthetic */ class d implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.videoproducer.capture.d f47076a = new com.tencent.liteav.videoproducer.capture.d();

    private d() {
    }

    public static java.util.Comparator a() {
        return f47076a;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.liteav.videoproducer.a.a aVar = (com.tencent.liteav.videoproducer.a.a) obj;
        com.tencent.liteav.videoproducer.a.a aVar2 = (com.tencent.liteav.videoproducer.a.a) obj2;
        int i17 = aVar.f46990a;
        int i18 = aVar2.f46990a;
        if (i17 < i18) {
            return -1;
        }
        if (i17 == i18) {
            return aVar.f46991b - aVar2.f46991b;
        }
        return 1;
    }
}
