package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.adpf.z1 f67522d = new com.tencent.mm.feature.performance.adpf.z1();

    public z1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Looper mainLooper;
        qh.f0 f0Var;
        android.os.Handler handler;
        ph.u e17 = gi.d.e();
        if (e17 == null || (f0Var = e17.f354296h) == null || (handler = f0Var.f363337f) == null || (mainLooper = handler.getLooper()) == null) {
            mainLooper = android.os.Looper.getMainLooper();
        }
        return new android.os.Handler(mainLooper);
    }
}
