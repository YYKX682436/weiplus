package com.tencent.maas.speech;

/* loaded from: classes5.dex */
public class MJAsyncTTSSubmitRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48547a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48548b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48549c;

    /* renamed from: d, reason: collision with root package name */
    public final float f48550d;

    /* renamed from: e, reason: collision with root package name */
    public final float f48551e;

    public MJAsyncTTSSubmitRequestInfo(java.lang.String str, java.lang.String str2, int i17, float f17, float f18) {
        this.f48547a = str;
        this.f48548b = str2;
        this.f48549c = i17;
        this.f48550d = f17;
        this.f48551e = f18;
    }

    public int getFormat() {
        return this.f48549c;
    }

    public java.lang.String getModel() {
        return this.f48548b;
    }

    public float getSpeed() {
        return this.f48550d;
    }

    public java.lang.String getText() {
        return this.f48547a;
    }

    public float getVolume() {
        return this.f48551e;
    }

    public java.lang.String toString() {
        return "MJAsyncTTSSubmitRequestInfo{text='" + this.f48547a + "', model='" + this.f48548b + "', format=" + this.f48549c + ", speed=" + this.f48550d + ", volume=" + this.f48551e + '}';
    }
}
