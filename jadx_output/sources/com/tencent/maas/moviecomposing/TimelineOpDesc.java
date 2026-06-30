package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class TimelineOpDesc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48420a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48421b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48422c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f48423d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f48424e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f48425f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f48426g;

    public TimelineOpDesc(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, java.lang.String str2) {
        this(str, mJTime, str2, null, null, null, null);
    }

    public java.lang.String getFocusedSegmentID() {
        return this.f48422c;
    }

    public com.tencent.maas.model.time.MJTime getPlayheadTime() {
        return this.f48421b;
    }

    public java.lang.String getRedoValue() {
        return this.f48424e;
    }

    public java.lang.String getTitle() {
        return this.f48420a;
    }

    public java.lang.String getUndoValue() {
        return this.f48423d;
    }

    public java.util.Map<java.lang.String, java.lang.String> getUserInfos() {
        return this.f48426g;
    }

    public java.lang.String getValueFormatter() {
        return this.f48425f;
    }

    public TimelineOpDesc(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(str, mJTime, str2, str3, str4, str5, null);
    }

    public TimelineOpDesc(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        this.f48420a = str;
        this.f48421b = mJTime;
        this.f48422c = str2;
        this.f48423d = str3;
        this.f48424e = str4;
        this.f48425f = str5;
        this.f48426g = hashMap;
    }
}
