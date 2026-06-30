package by5;

/* loaded from: classes13.dex */
public class h2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        try {
            by5.i c17 = by5.p.c(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getDir("xwalkconfig", 0).getAbsolutePath() + java.io.File.separator + "updateConfig.xml");
            if (c17 == null) {
                by5.c4.f("XWebCommandHandler", "recheck cmds ConfigParser failed");
                return qx5.a.a();
            }
            com.p314xaae8f345.p3210x3857dc.b m17 = com.p314xaae8f345.p3210x3857dc.b.m();
            by5.h[] hVarArr = c17.f118015e;
            java.lang.String str = c17.f118013c;
            synchronized (m17) {
                m17.b(hVarArr, str, true);
            }
            by5.s0.d(68L, 1);
            return qx5.a.b();
        } catch (java.lang.Throwable th6) {
            by5.c4.f("XWebCommandHandler", "recheck cmds failed, error:" + th6);
            return qx5.a.a();
        }
    }
}
