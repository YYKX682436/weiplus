package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.i3 f67588d = new com.tencent.mm.feature.performance.i3();

    public i3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qh.f0 f0Var;
        ph.u e17 = gi.d.e();
        if (e17 == null || (f0Var = e17.f354296h) == null) {
            return new android.os.Handler(android.os.Looper.getMainLooper());
        }
        android.os.Handler handler = f0Var.f363337f;
        kotlin.jvm.internal.o.f(handler, "getHandler(...)");
        return handler;
    }
}
