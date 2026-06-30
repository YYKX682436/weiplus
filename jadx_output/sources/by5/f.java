package by5;

/* loaded from: classes13.dex */
public abstract class f {
    public static synchronized com.tencent.xweb.a a(java.lang.Object obj) {
        synchronized (by5.f.class) {
            com.tencent.xweb.a aVar = new com.tencent.xweb.a();
            if (!(obj instanceof by5.h)) {
                return aVar;
            }
            by5.h hVar = (by5.h) obj;
            java.lang.String str = hVar.f36472b;
            java.lang.String str2 = hVar.f36473c;
            if (str.equals("executeCommand")) {
                java.lang.String[] s17 = com.tencent.xweb.b.m().s(hVar.f36473c);
                if (s17 != null && s17.length >= 2) {
                    str = s17[0];
                    str2 = s17[1];
                }
                return aVar;
            }
            by5.c4.b("ConfigCmdProc", "processCommand, type:" + str + ", value:" + str2);
            if (!"revertToVersion".equals(str)) {
                return aVar;
            }
            aVar.f220205a = true;
            by5.z e17 = by5.a0.e(str2);
            if (e17.f36615a) {
                by5.c4.f("ConfigCmdProc", "handleCommandRevertToVersion, version:" + str2);
                zx5.g.a(org.xwalk.core.XWalkEnvironment.f347970c, e17.b());
            }
            return aVar;
        }
    }
}
