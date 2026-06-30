package oz3;

/* loaded from: classes12.dex */
public final class d implements oz3.a {

    /* renamed from: a, reason: collision with root package name */
    public static final oz3.d f431788a = new oz3.d();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f431789b = jz5.h.b(oz3.b.f431786d);

    @Override // oz3.a
    public boolean a(oz3.e request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if (!((java.lang.Boolean) ((jz5.n) f431789b).mo141623x754a37bb()).booleanValue()) {
            return false;
        }
        oz3.f fVar = request.f431797h;
        int i17 = fVar.f431801d;
        oz3.f fVar2 = oz3.f.f431798e;
        if ((i17 & 1) != 0) {
            return request.f431796g != null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanCodeOcrNormalReporter", "scanCodeReportOcrNormal ocrReportType " + fVar + " not support normal");
        return false;
    }

    @Override // oz3.a
    public void b(oz3.e request, fk0.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        new mz3.a(request, aVar).l().q(new oz3.c(request));
    }

    @Override // oz3.a
    /* renamed from: name */
    public java.lang.String mo157486x337a8b() {
        return "ScanCodeOcrNormalReporter";
    }
}
