package com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a;

/* renamed from: com.tencent.maas.camerafun.MJAIGCParams */
/* loaded from: classes5.dex */
public class C3975xde78a307 {

    /* renamed from: a, reason: collision with root package name */
    public final int f129334a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f129335b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f129336c;

    public C3975xde78a307(int i17, java.lang.String str) {
        this.f129334a = i17;
        this.f129335b = str;
        this.f129336c = null;
    }

    /* renamed from: getAigcBuffer */
    public java.nio.ByteBuffer m32438x608945a() {
        return this.f129336c;
    }

    /* renamed from: getImageFilePath */
    public java.lang.String m32439xe2f5ee86() {
        return this.f129335b;
    }

    /* renamed from: getRequestID */
    public int m32440x28ca0534() {
        return this.f129334a;
    }

    /* renamed from: toString */
    public java.lang.String m32441x9616526c() {
        return "MJAIGCParams{requestID='" + this.f129334a + "', imageFilePath=" + this.f129335b + '}';
    }

    public C3975xde78a307(int i17, java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        this.f129334a = i17;
        this.f129335b = str;
        this.f129336c = byteBuffer;
    }
}
