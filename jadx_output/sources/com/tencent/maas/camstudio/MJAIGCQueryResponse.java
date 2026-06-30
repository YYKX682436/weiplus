package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJAIGCQueryResponse {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47835a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47836b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.camstudio.f f47837c;

    /* renamed from: d, reason: collision with root package name */
    public final java.nio.ByteBuffer f47838d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47839e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f47840f;

    public MJAIGCQueryResponse(java.lang.String str) {
        this.f47835a = str;
        this.f47836b = false;
        this.f47837c = com.tencent.maas.camstudio.f.nMJAIGCResultCodeFailed;
        this.f47838d = null;
        this.f47839e = 0;
        this.f47840f = new java.util.ArrayList();
    }

    public java.util.List<com.tencent.maas.camstudio.MJAIGCResponseAsset> getAssets() {
        return this.f47840f;
    }

    public java.nio.ByteBuffer getContextBuffer() {
        return this.f47838d;
    }

    public int getQueryIntervalMS() {
        return this.f47839e;
    }

    public int getResultCodeValue() {
        return this.f47837c.f47938d;
    }

    public java.lang.String getTaskID() {
        return this.f47835a;
    }

    public boolean isFinished() {
        return this.f47836b;
    }

    public java.lang.String toString() {
        return "MJAIGCQueryResponse{taskID='" + this.f47835a + "', isFinished=" + this.f47836b + ", resultCode=" + this.f47837c + ", contextBuffer=" + this.f47838d + ", queryIntervalMS=" + this.f47839e + ", assets=" + this.f47840f + '}';
    }

    public MJAIGCQueryResponse(java.lang.String str, boolean z17, com.tencent.maas.camstudio.f fVar, java.nio.ByteBuffer byteBuffer, int i17, java.util.List list) {
        this.f47835a = str;
        this.f47836b = z17;
        this.f47837c = fVar;
        this.f47838d = byteBuffer;
        this.f47839e = i17;
        this.f47840f = list;
    }
}
