package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJAIGCSubmitResponse {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47855a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.camstudio.f f47856b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f47857c;

    /* renamed from: d, reason: collision with root package name */
    public final java.nio.ByteBuffer f47858d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47859e;

    public MJAIGCSubmitResponse(java.lang.String str, com.tencent.maas.camstudio.f fVar, java.lang.String str2, java.nio.ByteBuffer byteBuffer, int i17) {
        this.f47855a = str;
        this.f47856b = fVar;
        this.f47857c = str2;
        this.f47858d = byteBuffer;
        this.f47859e = i17;
    }

    public java.nio.ByteBuffer getContextBuffer() {
        return this.f47858d;
    }

    public int getQueryIntervalMS() {
        return this.f47859e;
    }

    public java.lang.String getRequestID() {
        return this.f47855a;
    }

    public int getResultCodeValue() {
        return this.f47856b.f47938d;
    }

    public java.lang.String getTaskID() {
        return this.f47857c;
    }
}
