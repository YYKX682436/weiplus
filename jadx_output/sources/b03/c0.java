package b03;

/* loaded from: classes3.dex */
public final class c0 implements io.flutter.Log.Delegate {
    @Override // io.flutter.Log.Delegate
    public void d(java.lang.String p07, java.lang.String p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
    }

    @Override // io.flutter.Log.Delegate
    public void e(java.lang.String p07, java.lang.String p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mars.xlog.Log.e("MicroMsg.Flutter:".concat(p07), p17);
    }

    @Override // io.flutter.Log.Delegate
    public void i(java.lang.String p07, java.lang.String p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mars.xlog.Log.i("MicroMsg.Flutter:".concat(p07), p17);
    }

    @Override // io.flutter.Log.Delegate
    public void println(int i17, java.lang.String p17, java.lang.String p27) {
        kotlin.jvm.internal.o.g(p17, "p1");
        kotlin.jvm.internal.o.g(p27, "p2");
    }

    @Override // io.flutter.Log.Delegate
    public void v(java.lang.String p07, java.lang.String p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
    }

    @Override // io.flutter.Log.Delegate
    public void w(java.lang.String p07, java.lang.String p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mars.xlog.Log.w("MicroMsg.Flutter:".concat(p07), p17);
    }

    @Override // io.flutter.Log.Delegate
    public void wtf(java.lang.String p07, java.lang.String p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mars.xlog.Log.e("MicroMsg.Flutter:".concat(p07), p17);
    }

    @Override // io.flutter.Log.Delegate
    public void d(java.lang.String p07, java.lang.String p17, java.lang.Throwable p27) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        kotlin.jvm.internal.o.g(p27, "p2");
        p27.toString();
    }

    @Override // io.flutter.Log.Delegate
    public void e(java.lang.String p07, java.lang.String p17, java.lang.Throwable p27) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        kotlin.jvm.internal.o.g(p27, "p2");
        com.tencent.mars.xlog.Log.e("MicroMsg.Flutter:".concat(p07), p17 + ", " + p27);
    }

    @Override // io.flutter.Log.Delegate
    public void i(java.lang.String p07, java.lang.String p17, java.lang.Throwable p27) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        kotlin.jvm.internal.o.g(p27, "p2");
        com.tencent.mars.xlog.Log.i("MicroMsg.Flutter:".concat(p07), p17 + ", " + p27);
    }

    @Override // io.flutter.Log.Delegate
    public void v(java.lang.String p07, java.lang.String p17, java.lang.Throwable p27) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        kotlin.jvm.internal.o.g(p27, "p2");
        p27.toString();
    }

    @Override // io.flutter.Log.Delegate
    public void w(java.lang.String p07, java.lang.String p17, java.lang.Throwable p27) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        kotlin.jvm.internal.o.g(p27, "p2");
        com.tencent.mars.xlog.Log.w("MicroMsg.Flutter:".concat(p07), p17 + ", " + p27);
    }

    @Override // io.flutter.Log.Delegate
    public void wtf(java.lang.String p07, java.lang.String p17, java.lang.Throwable p27) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        kotlin.jvm.internal.o.g(p27, "p2");
        com.tencent.mars.xlog.Log.e("MicroMsg.Flutter:".concat(p07), p17 + ", " + p27);
    }
}
