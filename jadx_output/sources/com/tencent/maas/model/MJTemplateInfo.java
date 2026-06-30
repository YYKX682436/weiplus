package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJTemplateInfo {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48305a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48306b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48307c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f48308d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f48309e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f48310f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f48311g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f48312h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f48313i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f48314j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.maas.model.MJChannelEventConfig f48315k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f48316l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f48317m;

    /* renamed from: n, reason: collision with root package name */
    public final long f48318n;

    /* renamed from: o, reason: collision with root package name */
    public final long f48319o;

    /* renamed from: p, reason: collision with root package name */
    public final long f48320p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f48321q;

    /* renamed from: r, reason: collision with root package name */
    public long f48322r;

    /* renamed from: s, reason: collision with root package name */
    public long f48323s;

    /* renamed from: t, reason: collision with root package name */
    public final java.nio.ByteBuffer f48324t;

    public MJTemplateInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z17, com.tencent.maas.model.MJChannelEventConfig mJChannelEventConfig, java.lang.String str10, java.lang.String str11, long j17, long j18, long j19, java.lang.String str12, java.nio.ByteBuffer byteBuffer) {
        this.f48305a = str;
        this.f48306b = str2;
        this.f48307c = str3;
        this.f48308d = str4;
        this.f48309e = str5;
        this.f48310f = str6;
        this.f48311g = str7;
        this.f48312h = str8;
        this.f48313i = str9;
        this.f48314j = z17;
        this.f48315k = mJChannelEventConfig;
        this.f48316l = str10;
        this.f48317m = str11;
        this.f48318n = j17;
        this.f48319o = j18;
        this.f48320p = j19;
        this.f48321q = str12;
        this.f48322r = 0L;
        this.f48323s = 2147483647L;
        this.f48324t = byteBuffer;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f48305a.equals(((com.tencent.maas.model.MJTemplateInfo) obj).f48305a);
    }

    public java.lang.String getAIModelType() {
        return this.f48321q;
    }

    public java.lang.String getAdaptedCategoryID() {
        return this.f48313i;
    }

    public com.tencent.maas.model.MJChannelEventConfig getChannelEventConfig() {
        return this.f48315k;
    }

    public java.lang.String getDisplayName() {
        return this.f48312h;
    }

    public long getMaximumAssetCount() {
        return this.f48323s;
    }

    public long getMinimumAndroidSDKVersion() {
        return this.f48320p;
    }

    public long getMinimumAssetCount() {
        return this.f48322r;
    }

    public long getMinimumiOSSDKVersion() {
        return this.f48319o;
    }

    public java.lang.String getPreviewImageGifFileMD5() {
        return this.f48309e;
    }

    public java.lang.String getPreviewImageGifURL() {
        return this.f48308d;
    }

    public java.lang.String getPreviewImageWxAMFileMD5() {
        return this.f48311g;
    }

    public java.lang.String getPreviewImageWxAMURL() {
        return this.f48310f;
    }

    public java.nio.ByteBuffer getSessionBuffer() {
        return this.f48324t;
    }

    public java.lang.String getTemplateDescFileMD5() {
        return this.f48317m;
    }

    public java.lang.String getTemplateDescURL() {
        return this.f48316l;
    }

    public long getTemplateDescVersion() {
        return this.f48318n;
    }

    public java.lang.String getTemplateID() {
        return this.f48305a;
    }

    public java.lang.String getThumbnailFileMD5() {
        return this.f48307c;
    }

    public java.lang.String getThumbnailURL() {
        return this.f48306b;
    }

    public int hashCode() {
        return this.f48305a.hashCode();
    }

    public boolean isUnrecommended() {
        return this.f48314j;
    }

    public void setMaximumAssetCount(long j17) {
        this.f48323s = j17;
    }

    public void setMinimumAssetCount(long j17) {
        this.f48322r = j17;
    }

    public java.lang.String toString() {
        return "MJTemplateInfo{templateID='" + this.f48305a + "', displayName='" + this.f48312h + "', templateDescVersion=" + this.f48318n + '}';
    }

    public MJTemplateInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z17, com.tencent.maas.model.MJChannelEventConfig mJChannelEventConfig, java.lang.String str10, java.lang.String str11, long j17, long j18, long j19, java.lang.String str12, long j27, long j28, java.nio.ByteBuffer byteBuffer) {
        this.f48305a = str;
        this.f48306b = str2;
        this.f48307c = str3;
        this.f48308d = str4;
        this.f48309e = str5;
        this.f48310f = str6;
        this.f48311g = str7;
        this.f48312h = str8;
        this.f48313i = str9;
        this.f48314j = z17;
        this.f48315k = mJChannelEventConfig;
        this.f48316l = str10;
        this.f48317m = str11;
        this.f48318n = j17;
        this.f48319o = j18;
        this.f48320p = j19;
        this.f48321q = str12;
        this.f48322r = j27;
        this.f48323s = j28;
        this.f48324t = byteBuffer;
    }

    public MJTemplateInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, com.tencent.maas.model.MJChannelEventConfig mJChannelEventConfig, java.lang.String str5, long j17, long j18, long j19) {
        this.f48305a = str;
        this.f48306b = str2;
        this.f48307c = null;
        this.f48308d = null;
        this.f48309e = null;
        this.f48310f = null;
        this.f48311g = null;
        this.f48312h = str3;
        this.f48313i = str4;
        this.f48314j = z17;
        this.f48315k = mJChannelEventConfig;
        this.f48316l = str5;
        this.f48317m = null;
        this.f48318n = j17;
        this.f48319o = j18;
        this.f48320p = j19;
        this.f48321q = "";
        this.f48322r = 0L;
        this.f48323s = 2147483647L;
        this.f48324t = null;
    }
}
