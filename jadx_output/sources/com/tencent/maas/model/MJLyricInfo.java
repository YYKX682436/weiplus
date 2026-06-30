package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJLyricInfo {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48267a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48268b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48269c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f48270d;

    public MJLyricInfo(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, java.lang.String str, java.lang.String str2) {
        this.f48267a = mJTime;
        this.f48268b = mJTime2;
        this.f48269c = str;
        this.f48270d = str2;
    }

    public java.lang.String getContent() {
        return this.f48269c;
    }

    public com.tencent.maas.model.time.MJTime getEndTime() {
        return this.f48268b;
    }

    public com.tencent.maas.model.time.MJTime getStartTime() {
        return this.f48267a;
    }

    public java.lang.String getSubContent() {
        return this.f48270d;
    }
}
