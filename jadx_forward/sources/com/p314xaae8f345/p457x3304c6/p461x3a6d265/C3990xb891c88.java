package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJAIGCQueryResponse */
/* loaded from: classes5.dex */
public class C3990xb891c88 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129368a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129369b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.f f129370c;

    /* renamed from: d, reason: collision with root package name */
    public final java.nio.ByteBuffer f129371d;

    /* renamed from: e, reason: collision with root package name */
    public final int f129372e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f129373f;

    public C3990xb891c88(java.lang.String str) {
        this.f129368a = str;
        this.f129369b = false;
        this.f129370c = com.p314xaae8f345.p457x3304c6.p461x3a6d265.f.nMJAIGCResultCodeFailed;
        this.f129371d = null;
        this.f129372e = 0;
        this.f129373f = new java.util.ArrayList();
    }

    /* renamed from: getAssets */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3992x16f43a8e> m32489x11279679() {
        return this.f129373f;
    }

    /* renamed from: getContextBuffer */
    public java.nio.ByteBuffer m32490x9bbe3319() {
        return this.f129371d;
    }

    /* renamed from: getQueryIntervalMS */
    public int m32491xc7ea3ddd() {
        return this.f129372e;
    }

    /* renamed from: getResultCodeValue */
    public int m32492x632499b1() {
        return this.f129370c.f129471d;
    }

    /* renamed from: getTaskID */
    public java.lang.String m32493x30961456() {
        return this.f129368a;
    }

    /* renamed from: isFinished */
    public boolean m32494xa89067bc() {
        return this.f129369b;
    }

    /* renamed from: toString */
    public java.lang.String m32495x9616526c() {
        return "MJAIGCQueryResponse{taskID='" + this.f129368a + "', isFinished=" + this.f129369b + ", resultCode=" + this.f129370c + ", contextBuffer=" + this.f129371d + ", queryIntervalMS=" + this.f129372e + ", assets=" + this.f129373f + '}';
    }

    public C3990xb891c88(java.lang.String str, boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.f fVar, java.nio.ByteBuffer byteBuffer, int i17, java.util.List list) {
        this.f129368a = str;
        this.f129369b = z17;
        this.f129370c = fVar;
        this.f129371d = byteBuffer;
        this.f129372e = i17;
        this.f129373f = list;
    }
}
