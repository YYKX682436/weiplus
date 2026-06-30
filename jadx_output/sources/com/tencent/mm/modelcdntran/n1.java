package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.modelcdntran.m1 f71103a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f71104b;

    /* renamed from: c, reason: collision with root package name */
    public int f71105c;

    /* renamed from: d, reason: collision with root package name */
    public dn.m f71106d;

    /* renamed from: e, reason: collision with root package name */
    public dn.g f71107e;

    /* renamed from: f, reason: collision with root package name */
    public dn.h f71108f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f71109g;

    public n1(com.tencent.mm.modelcdntran.m1 action, java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f71103a = action;
        this.f71104b = mediaId;
        android.os.SystemClock.elapsedRealtime();
    }

    public final com.tencent.mm.modelcdntran.m1 a() {
        return this.f71103a;
    }

    public final int b() {
        return this.f71105c;
    }

    public java.lang.String toString() {
        return "mediaId:" + this.f71104b + " action:" + this.f71103a + " ret:" + this.f71105c;
    }
}
