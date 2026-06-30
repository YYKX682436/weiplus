package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJTemplateMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48325a;

    /* renamed from: b, reason: collision with root package name */
    public final long f48326b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48327c;

    /* renamed from: d, reason: collision with root package name */
    public final long f48328d;

    /* renamed from: e, reason: collision with root package name */
    public final long f48329e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f48330f;

    public MJTemplateMetadata(java.lang.String str, long j17, java.lang.String str2, long j18, long j19) {
        this(str, j17, str2, j18, j19, "");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f48325a.equals(((com.tencent.maas.model.MJTemplateMetadata) obj).f48325a);
    }

    public java.lang.String getAIModelType() {
        return this.f48330f;
    }

    public java.lang.String getDescDownloadURL() {
        return this.f48327c;
    }

    public long getDescVersion() {
        return this.f48326b;
    }

    public long getMinimumAndroidSDKVersion() {
        return this.f48329e;
    }

    public long getMinimumiOSSDKVersion() {
        return this.f48328d;
    }

    public java.lang.String getTemplateID() {
        return this.f48325a;
    }

    public int hashCode() {
        return this.f48325a.hashCode();
    }

    public java.lang.String toString() {
        return "MJTemplateMetadata{templateID='" + this.f48325a + "', descVersion=" + this.f48326b + '}';
    }

    public MJTemplateMetadata(java.lang.String str, long j17, java.lang.String str2, long j18, long j19, java.lang.String str3) {
        this.f48325a = str;
        this.f48326b = j17;
        this.f48327c = str2;
        this.f48328d = j18;
        this.f48329e = j19;
        this.f48330f = str3;
    }
}
