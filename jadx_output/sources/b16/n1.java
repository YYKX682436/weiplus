package b16;

/* loaded from: classes16.dex */
public abstract class n1 extends b16.f1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(a16.l c17) {
        super(c17, null);
        kotlin.jvm.internal.o.g(c17, "c");
    }

    @Override // b16.f1
    public void n(n16.g name, java.util.Collection result) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(result, "result");
    }

    @Override // b16.f1
    public o06.r1 p() {
        return null;
    }

    @Override // b16.f1
    public b16.r0 s(e16.q method, java.util.List methodTypeParameters, f26.o0 returnType, java.util.List valueParameters) {
        kotlin.jvm.internal.o.g(method, "method");
        kotlin.jvm.internal.o.g(methodTypeParameters, "methodTypeParameters");
        kotlin.jvm.internal.o.g(returnType, "returnType");
        kotlin.jvm.internal.o.g(valueParameters, "valueParameters");
        return new b16.r0(returnType, null, valueParameters, methodTypeParameters, false, kz5.p0.f313996d);
    }
}
