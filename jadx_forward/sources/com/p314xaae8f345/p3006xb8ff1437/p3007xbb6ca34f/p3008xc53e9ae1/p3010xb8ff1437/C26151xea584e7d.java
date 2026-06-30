package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437;

/* renamed from: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker */
/* loaded from: classes12.dex */
public final class C26151xea584e7d {

    /* renamed from: stackMap */
    static final java.util.concurrent.ConcurrentSkipListMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d> f50247x4da4fdb4 = new java.util.concurrent.ConcurrentSkipListMap<>();

    /* renamed from: id, reason: collision with root package name */
    public final int f297073id;

    /* renamed from: playerRef */
    public final java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b> f50248x906aadf2;

    /* renamed from: scene */
    public final java.lang.String f50249x683188c;

    /* renamed from: stack */
    public final java.lang.String f50250x68ac288;

    /* renamed from: trackMs */
    public final long f50251xc060d451 = java.lang.System.currentTimeMillis();

    public C26151xea584e7d(int i17, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b c26150x904f783b, java.lang.String str, java.lang.String str2) {
        this.f297073id = i17;
        this.f50248x906aadf2 = new java.lang.ref.WeakReference<>(c26150x904f783b);
        this.f50249x683188c = str;
        this.f50250x68ac288 = str2;
    }

    /* renamed from: getTrackingMap */
    public static java.util.Map<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d> m100777x49d3c5ef() {
        return f50247x4da4fdb4;
    }
}
