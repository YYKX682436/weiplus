package ym5;

/* loaded from: classes15.dex */
public final class l0 implements android.util.Printer {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Printer f544956d;

    public l0(android.util.Printer printer) {
        this.f544956d = printer;
    }

    @Override // android.util.Printer
    public void println(java.lang.String x17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x17, "x");
        ym5.r0.f545024g = true;
        ym5.r0 r0Var = ym5.r0.f545018a;
        if (ym5.r0.f545021d > 0 && java.lang.System.nanoTime() - ym5.r0.f545019b >= 260000000) {
            ((ym5.p0) ym5.r0.f545026i).mo152xb9724478();
        }
        if (ym5.r0.f545022e > 0 && java.lang.System.nanoTime() - ym5.r0.f545020c >= 50000000) {
            ((ym5.q0) ym5.r0.f545025h).mo152xb9724478();
        }
        android.util.Printer printer = this.f544956d;
        if (printer != null) {
            printer.println(x17);
        }
    }
}
