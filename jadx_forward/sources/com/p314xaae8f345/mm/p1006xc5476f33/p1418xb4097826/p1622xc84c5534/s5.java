package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5 f206882a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f206883b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String mediaId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f206883b;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(concurrentHashMap.get(mediaId));
        if (z17) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(concurrentHashMap.remove(mediaId));
    }
}
