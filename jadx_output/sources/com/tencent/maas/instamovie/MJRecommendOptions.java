package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJRecommendOptions {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.instamovie.c f48143a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48144b;

    /* renamed from: c, reason: collision with root package name */
    public long f48145c;

    public MJRecommendOptions(com.tencent.maas.instamovie.c cVar, java.lang.String str) {
        this.f48143a = cVar;
        this.f48144b = str;
    }

    public long getEventType() {
        return this.f48145c;
    }

    public int getMode() {
        return this.f48143a.f48184d;
    }

    public java.lang.String getScene() {
        return this.f48144b;
    }
}
