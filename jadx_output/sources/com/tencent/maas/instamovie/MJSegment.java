package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJSegment {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48165a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f48166b;

    public MJSegment(java.lang.String str, int i17, com.tencent.maas.instamovie.MJMovieSession mJMovieSession) {
        this.f48165a = str;
        this.f48166b = new java.lang.ref.WeakReference(mJMovieSession);
    }

    public MJSegment(java.lang.String str, int i17) {
        this.f48165a = str;
    }
}
