package m12;

/* loaded from: classes10.dex */
public final class i extends m12.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f404390f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f404391g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.Range f404392h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String inputPath, java.lang.String outputPath) {
        super(inputPath, outputPath);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPath, "inputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        this.f404390f = inputPath;
        this.f404391g = outputPath;
        this.f404392h = new android.util.Range(0, 0);
    }

    @Override // m12.a
    public boolean a() {
        if (!super.a()) {
            return false;
        }
        int intValue = ((java.lang.Number) this.f404392h.getUpper()).intValue();
        java.lang.Object lower = this.f404392h.getLower();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower, "getLower(...)");
        return intValue - ((java.lang.Number) lower).intValue() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // m12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m12.i.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
