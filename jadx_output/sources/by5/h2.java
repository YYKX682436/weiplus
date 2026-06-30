package by5;

/* loaded from: classes13.dex */
public class h2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        try {
            by5.i c17 = by5.p.c(org.xwalk.core.XWalkEnvironment.f347970c.getDir("xwalkconfig", 0).getAbsolutePath() + java.io.File.separator + "updateConfig.xml");
            if (c17 == null) {
                by5.c4.f("XWebCommandHandler", "recheck cmds ConfigParser failed");
                return qx5.a.a();
            }
            com.tencent.xweb.b m17 = com.tencent.xweb.b.m();
            by5.h[] hVarArr = c17.f36482e;
            java.lang.String str = c17.f36480c;
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
