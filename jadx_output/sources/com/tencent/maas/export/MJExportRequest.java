package com.tencent.maas.export;

/* loaded from: classes4.dex */
public class MJExportRequest {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48006a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTimeRange f48007b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.instamovie.MJExportSettings f48008c;

    public com.tencent.maas.instamovie.MJExportSettings getExportSettings() {
        return this.f48008c;
    }

    public com.tencent.maas.model.time.MJTimeRange getExportTimeRange() {
        return this.f48007b;
    }

    public java.lang.String getInputClipbundleId() {
        return this.f48006a;
    }

    private MJExportRequest(java.lang.String str, com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.instamovie.MJExportSettings mJExportSettings) {
        this.f48006a = str;
        this.f48007b = mJTimeRange;
        this.f48008c = mJExportSettings;
    }
}
