package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.SystemChannel */
/* loaded from: classes15.dex */
public class C28674xd499cfb4 {
    private static final java.lang.String TAG = "SystemChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.Object> f71510x2c0b7d03;

    public C28674xd499cfb4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        this.f71510x2c0b7d03 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<>(c28604xeb2eb192, "flutter/system", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957.f71607x4fbc8495);
    }

    /* renamed from: sendMemoryPressureWarning */
    public void m138352x27cac7ae() {
        io.p3284xd2ae381c.Log.v(TAG, "Sending memory pressure warning to Flutter.");
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f71510x2c0b7d03.m138402x35cf88(hashMap);
    }
}
