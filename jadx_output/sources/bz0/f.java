package bz0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final bz0.f f36735a = new bz0.f();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f36736b = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct f36737c = new com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct();

    /* renamed from: d, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f36738d;

    public final void a(com.tencent.maas.instamovie.base.MJError error) {
        kotlin.jvm.internal.o.g(error, "error");
        f36737c.f58936k = error.f48175ec.getErrorCode();
        com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct maaSCreationReportStruct = f36737c;
        java.lang.String message = error.message;
        kotlin.jvm.internal.o.f(message, "message");
        maaSCreationReportStruct.f58937l = maaSCreationReportStruct.b("exportResultErrorMessage", r26.i0.t(message, ",", ";", false), true);
    }
}
