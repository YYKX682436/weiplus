package com.tencent.maas.camerafun;

/* loaded from: classes5.dex */
public class MJAIGCParams {

    /* renamed from: a, reason: collision with root package name */
    public final int f47801a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f47802b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f47803c;

    public MJAIGCParams(int i17, java.lang.String str) {
        this.f47801a = i17;
        this.f47802b = str;
        this.f47803c = null;
    }

    public java.nio.ByteBuffer getAigcBuffer() {
        return this.f47803c;
    }

    public java.lang.String getImageFilePath() {
        return this.f47802b;
    }

    public int getRequestID() {
        return this.f47801a;
    }

    public java.lang.String toString() {
        return "MJAIGCParams{requestID='" + this.f47801a + "', imageFilePath=" + this.f47802b + '}';
    }

    public MJAIGCParams(int i17, java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        this.f47801a = i17;
        this.f47802b = str;
        this.f47803c = byteBuffer;
    }
}
