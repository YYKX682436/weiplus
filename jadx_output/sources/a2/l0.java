package a2;

/* loaded from: classes14.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.l0 f771d = new a2.l0();

    public l0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 Saver = (w0.c0) obj;
        long j17 = ((d1.e) obj2).f225627a;
        kotlin.jvm.internal.o.g(Saver, "$this$Saver");
        if (d1.e.a(j17, d1.e.f225625d)) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(d1.e.c(j17));
        w0.x xVar = a2.f1.f696a;
        return kz5.c0.d(valueOf, java.lang.Float.valueOf(d1.e.d(j17)));
    }
}
