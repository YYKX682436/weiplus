package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public abstract class n7 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f246048a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f246049b = new java.util.concurrent.ConcurrentHashMap();

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m7 a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaToInfo", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f246049b.get(str);
        if (weakReference != null) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(weakReference.get());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaToInfo", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        return null;
    }

    public static void b(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordEndLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        boolean z17 = x51.o1.f533575a;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f246049b.get(str);
        if (weakReference != null) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(weakReference.get());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordEndLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
    }
}
