package x06;

/* loaded from: classes16.dex */
public final /* synthetic */ class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final x06.j0 f532798d = new x06.j0();

    public j0() {
        super(1);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e, f06.c
    /* renamed from: getName */
    public final java.lang.String mo9624xfb82e301() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getOwner */
    public final f06.f mo9625x74f198fd() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.i0.b(x06.h0.class, "compiler.common.jvm");
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getSignature */
    public final java.lang.String mo9626x3f6b0a02() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.c p07 = (n16.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        n16.c cVar = x06.h0.f532788a;
        x06.s0.f532854a.getClass();
        x06.s0 configuredReportLevels = x06.r0.f532853b;
        jz5.f fVar = new jz5.f(1, 7, 20);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configuredReportLevels, "configuredReportLevels");
        x06.w0 w0Var = (x06.w0) ((e26.q) ((x06.u0) configuredReportLevels).f532859c).mo146xb9724478(p07);
        if (w0Var != null) {
            return w0Var;
        }
        x06.u0 u0Var = (x06.u0) x06.h0.f532790c;
        u0Var.getClass();
        x06.i0 i0Var = (x06.i0) ((e26.q) u0Var.f532859c).mo146xb9724478(p07);
        if (i0Var == null) {
            return x06.w0.f532863e;
        }
        jz5.f fVar2 = i0Var.f532795b;
        return (fVar2 == null || fVar2.f384358g - fVar.f384358g > 0) ? i0Var.f532794a : i0Var.f532796c;
    }
}
