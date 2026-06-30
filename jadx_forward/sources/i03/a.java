package i03;

/* loaded from: classes11.dex */
public class a implements io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534.C28744x4ff686dd.ReportCallback {
    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534.C28744x4ff686dd.ReportCallback
    /* renamed from: onReport */
    public void mo134327x57412bf3(java.lang.String str, long j17, java.lang.String str2) {
        int Ai;
        if (gm0.j1.a() && (Ai = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ai()) != 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6613xc175a512 c6613xc175a512 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6613xc175a512();
            c6613xc175a512.f139667d = c6613xc175a512.b("StackTrace", str, true);
            c6613xc175a512.f139668e = j17;
            c6613xc175a512.f139669f = Ai;
            c6613xc175a512.f139670g = c6613xc175a512.b("Revision", a03.h.a(), true);
            c6613xc175a512.f139671h = c6613xc175a512.b("Phase", str2, true);
            c6613xc175a512.f139672i = c6613xc175a512.b("rev", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
            c6613xc175a512.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterAnrReport", "ANR happened\n" + c6613xc175a512.n());
        }
    }
}
