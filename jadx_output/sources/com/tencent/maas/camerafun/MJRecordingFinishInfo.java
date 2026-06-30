package com.tencent.maas.camerafun;

/* loaded from: classes5.dex */
public class MJRecordingFinishInfo {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47817a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f47818b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f47819c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f47820d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJRecordingResultTraits f47821e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f47822f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f47823g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJCamOptionResult f47824h;

    public MJRecordingFinishInfo(java.lang.String str, java.lang.String str2, com.tencent.maas.model.time.MJTime mJTime, java.lang.String str3) {
        this.f47823g = new java.util.ArrayList();
        this.f47817a = str;
        this.f47818b = str2;
        this.f47819c = mJTime;
        this.f47820d = str3;
        this.f47821e = null;
        this.f47822f = null;
        this.f47824h = null;
    }

    public java.lang.String toString() {
        return "MJRecordingFinishInfo{outputFilePath='" + this.f47817a + "', recordingDuration=" + this.f47819c.toSeconds() + "s, originalImageSeqDirPath='" + this.f47820d + "'}";
    }

    public MJRecordingFinishInfo(java.lang.String str, java.lang.String str2, com.tencent.maas.model.time.MJTime mJTime, java.lang.String str3, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, com.tencent.maas.camstudio.MJRecordingResultTraits mJRecordingResultTraits, com.tencent.maas.model.time.MJTime mJTime2, java.lang.Object[] objArr) {
        this.f47823g = new java.util.ArrayList();
        this.f47817a = str;
        this.f47818b = str2;
        this.f47819c = mJTime;
        this.f47820d = str3;
        this.f47821e = mJRecordingResultTraits;
        this.f47822f = mJTime2;
        this.f47824h = null;
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                this.f47823g.add((com.tencent.maas.instamovie.base.asset.MJAssetInfo) obj);
            }
        }
    }

    public MJRecordingFinishInfo(java.lang.String str, java.lang.String str2, com.tencent.maas.model.time.MJTime mJTime, java.lang.String str3, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, com.tencent.maas.camstudio.MJRecordingResultTraits mJRecordingResultTraits, com.tencent.maas.model.time.MJTime mJTime2, java.lang.Object[] objArr, com.tencent.maas.camstudio.MJCamOptionResult mJCamOptionResult) {
        this.f47823g = new java.util.ArrayList();
        this.f47817a = str;
        this.f47818b = str2;
        this.f47819c = mJTime;
        this.f47820d = str3;
        this.f47821e = mJRecordingResultTraits;
        this.f47822f = mJTime2;
        this.f47824h = mJCamOptionResult;
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                this.f47823g.add((com.tencent.maas.instamovie.base.asset.MJAssetInfo) obj);
            }
        }
    }
}
