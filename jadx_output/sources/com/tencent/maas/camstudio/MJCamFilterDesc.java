package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCamFilterDesc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47874a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f47875b;

    /* renamed from: c, reason: collision with root package name */
    public float f47876c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47877d;

    public MJCamFilterDesc() {
        this.f47877d = false;
    }

    public java.lang.String getFilterID() {
        return this.f47874a;
    }

    public float getIntensity() {
        return this.f47876c;
    }

    public java.lang.String getLutImageFilePath() {
        return this.f47875b;
    }

    public boolean isFilterEnabled() {
        return this.f47877d;
    }

    public MJCamFilterDesc(java.lang.String str, float f17) {
        this.f47877d = true;
        this.f47874a = str;
        this.f47876c = f17;
    }

    public MJCamFilterDesc(java.lang.String str, float f17, boolean z17) {
        this.f47874a = str;
        this.f47876c = f17;
        this.f47877d = z17;
    }

    public MJCamFilterDesc(java.lang.String str, java.lang.String str2, float f17, boolean z17) {
        this.f47874a = str;
        this.f47875b = str2;
        this.f47876c = f17;
        this.f47877d = z17;
    }
}
