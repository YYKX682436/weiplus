package x06;

/* loaded from: classes16.dex */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final x06.k0 f532803d;

    /* renamed from: a, reason: collision with root package name */
    public final x06.n0 f532804a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f532805b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f532806c;

    static {
        n16.c cVar = x06.h0.f532788a;
        jz5.f configuredKotlinVersion = jz5.f.f384354h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configuredKotlinVersion, "configuredKotlinVersion");
        x06.i0 i0Var = x06.h0.f532791d;
        jz5.f fVar = i0Var.f532795b;
        x06.w0 globalReportLevel = (fVar == null || fVar.f384358g - configuredKotlinVersion.f384358g > 0) ? i0Var.f532794a : i0Var.f532796c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(globalReportLevel, "globalReportLevel");
        f532803d = new x06.k0(new x06.n0(globalReportLevel, globalReportLevel == x06.w0.f532864f ? null : globalReportLevel, null, 4, null), x06.j0.f532798d);
    }

    public k0(x06.n0 jsr305, yz5.l getReportLevelForAnnotation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsr305, "jsr305");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f532804a = jsr305;
        this.f532805b = getReportLevelForAnnotation;
        this.f532806c = jsr305.f532814d || getReportLevelForAnnotation.mo146xb9724478(x06.h0.f532788a) == x06.w0.f532863e;
    }

    /* renamed from: toString */
    public java.lang.String m174866x9616526c() {
        return "JavaTypeEnhancementState(jsr305=" + this.f532804a + ", getReportLevelForAnnotation=" + this.f532805b + ')';
    }
}
