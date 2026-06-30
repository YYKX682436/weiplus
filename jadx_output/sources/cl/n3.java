package cl;

/* loaded from: classes7.dex */
public final class n3 implements com.eclipsesource.mmv8.IV8Tracer {
    @Override // com.eclipsesource.mmv8.IV8Tracer
    public void beginSection(java.lang.String scetionName) {
        kotlin.jvm.internal.o.g(scetionName, "scetionName");
        int i17 = sj1.d.f408362a;
        int i18 = sj1.e.f408363a;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sj1.f.f408364a;
        java.lang.String E0 = r26.p0.E0(scetionName, 127);
        java.lang.reflect.Method method = j3.v.f297343b;
        j3.t.a(E0);
    }

    @Override // com.eclipsesource.mmv8.IV8Tracer
    public void endSection() {
        int i17 = sj1.d.f408362a;
        int i18 = sj1.e.f408363a;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sj1.f.f408364a;
        java.lang.reflect.Method method = j3.v.f297343b;
        j3.t.b();
    }
}
