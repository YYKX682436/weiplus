package nu3;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final nu3.f f421743a = new nu3.f();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 f421744b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f421745c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f421746d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f421747e = "";

    /* renamed from: f, reason: collision with root package name */
    public static int f421748f;

    public final void a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setContentType >> ");
        sb6.append(i17);
        sb6.append(", ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = f421744b;
        sb6.append(c6355x3a30521 != null ? c6355x3a30521.f137052o : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = f421744b;
        if (c6355x3a305212 == null) {
            return;
        }
        c6355x3a305212.f137046i = i17;
    }

    public final void b(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentLight >> ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = f421744b;
        sb6.append(c6355x3a30521 != null ? c6355x3a30521.f137052o : null);
        sb6.append(", ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = f421744b;
        if (c6355x3a305212 == null) {
            return;
        }
        c6355x3a305212.f137053p = i17;
    }

    public final void c(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setEnterScene >> ");
        sb6.append(i17);
        sb6.append(", ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = f421744b;
        sb6.append(c6355x3a30521 != null ? c6355x3a30521.f137052o : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = f421744b;
        if (c6355x3a305212 == null) {
            return;
        }
        c6355x3a305212.f137041d = i17;
    }

    public final void d() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f421745c = java.lang.String.valueOf(currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", "setEnterTimeStamp >> " + currentTimeMillis + ", " + f421745c);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521();
        f421744b = c6355x3a30521;
        c6355x3a30521.f137043f = currentTimeMillis;
        c6355x3a30521.f137052o = c6355x3a30521.b("CameraSessionID", f421745c, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = f421744b;
        if (c6355x3a305212 == null) {
            return;
        }
        c6355x3a305212.C = c6355x3a305212.b("CameraEnterSessionID", f421746d, true);
    }

    public final void e(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setExitResult >> ");
        sb6.append(i17);
        sb6.append(", ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = f421744b;
        sb6.append(c6355x3a30521 != null ? c6355x3a30521.f137052o : null);
        sb6.append(", ");
        sb6.append(currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = f421744b;
        if (c6355x3a305212 != null) {
            c6355x3a305212.f137042e = i17;
        }
        if (c6355x3a305212 != null) {
            c6355x3a305212.f137044g = currentTimeMillis;
        }
        if (c6355x3a305212 != null) {
            c6355x3a305212.D = c6355x3a305212.b("ChatUserName", f421747e, true);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305213 = f421744b;
        if (c6355x3a305213 != null) {
            c6355x3a305213.E = f421748f;
        }
        if (c6355x3a305213 != null) {
            c6355x3a305213.k();
        }
    }

    public final void f(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFinalContentSource >> ");
        sb6.append(i17);
        sb6.append(", ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = f421744b;
        sb6.append(c6355x3a30521 != null ? c6355x3a30521.f137052o : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = f421744b;
        if (c6355x3a305212 == null) {
            return;
        }
        c6355x3a305212.f137045h = i17;
    }

    public final void g(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFlashLightStatus >> ");
        sb6.append(i17);
        sb6.append(", ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = f421744b;
        sb6.append(c6355x3a30521 != null ? c6355x3a30521.f137052o : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = f421744b;
        if (c6355x3a305212 == null) {
            return;
        }
        c6355x3a305212.f137047j = i17;
    }

    public final void h(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", "setRecordVideoResult >> code: " + i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521();
        c6355x3a30521.f137059v = i17;
        c6355x3a30521.k();
    }

    public final void i(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVideoDuration >> ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = f421744b;
        sb6.append(c6355x3a30521 != null ? c6355x3a30521.f137052o : null);
        sb6.append(", ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a305212 = f421744b;
        if (c6355x3a305212 == null) {
            return;
        }
        c6355x3a305212.f137051n = i17;
    }
}
