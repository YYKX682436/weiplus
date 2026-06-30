package cl;

/* loaded from: classes16.dex */
public class c2 extends cl.r1 {

    /* renamed from: b, reason: collision with root package name */
    public final com.p159x477cd522.p160x333422.InterfaceC1457xf776215b f124140b;

    public c2() {
        super("console");
        this.f124140b = new cl.w1(this);
    }

    public static void d(cl.c2 c2Var, int i17, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        c2Var.getClass();
        java.lang.String mo16313x9616526c = c1469x28b0ccd7.mo16313x9616526c();
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.J2V8_Console", mo16313x9616526c);
        } else if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.J2V8_Console", mo16313x9616526c);
        }
        c2Var.e(3, "MicroMsg.J2V8_Console", mo16313x9616526c);
    }

    @Override // cl.r1
    public void a() {
    }

    @Override // cl.r1
    public void c(cl.q0 q0Var, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        c1477x4679881.mo16338x1af320a6(new cl.x1(this), "log");
        c1477x4679881.mo16338x1af320a6(new cl.y1(this), "info");
        c1477x4679881.mo16338x1af320a6(new cl.z1(this), "warn");
        c1477x4679881.mo16338x1af320a6(new cl.a2(this), "error");
        c1477x4679881.mo16338x1af320a6(new cl.b2(this), "debug");
        com.p159x477cd522.p160x333422.InterfaceC1457xf776215b interfaceC1457xf776215b = this.f124140b;
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "assert");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "count");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589);
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "profileEnd");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "time");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "timeEnd");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "timeStamp");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "takeHeapSnapshot");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "group");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "groupCollapsed");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "groupEnd");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "clear");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.f55899xc6c33770);
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "dirxml");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "table");
        c1477x4679881.mo16338x1af320a6(interfaceC1457xf776215b, "trace");
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = cl.q0.f124255l;
        if (interfaceC4601x87fc7208 != null) {
            if (i17 == 2) {
                interfaceC4601x87fc7208.mo40556x32c592(0L, str, null, null, 0, 0, 0L, 0L, str2);
                return;
            }
            if (i17 == 3) {
                interfaceC4601x87fc7208.mo40552x32c580(0L, str, null, null, 0, 0, 0L, 0L, str2);
                return;
            }
            if (i17 == 4) {
                interfaceC4601x87fc7208.mo40555x32c585(0L, str, null, null, 0, 0, 0L, 0L, str2);
            } else if (i17 == 5) {
                interfaceC4601x87fc7208.mo40557x32c593(0L, str, null, null, 0, 0, 0L, 0L, str2);
            } else {
                if (i17 != 6) {
                    return;
                }
                interfaceC4601x87fc7208.mo40553x32c581(0L, str, null, null, 0, 0, 0L, 0L, str2);
            }
        }
    }
}
