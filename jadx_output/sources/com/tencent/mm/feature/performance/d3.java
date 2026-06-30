package com.tencent.mm.feature.performance;

/* loaded from: classes4.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.d3 f67554d = new com.tencent.mm.feature.performance.d3();

    public d3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("cpu-collect");
        handlerThread.start();
        return new android.os.Handler(handlerThread.getLooper());
    }
}
