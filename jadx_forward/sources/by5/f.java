package by5;

/* loaded from: classes13.dex */
public abstract class f {
    public static synchronized com.p314xaae8f345.p3210x3857dc.a a(java.lang.Object obj) {
        synchronized (by5.f.class) {
            com.p314xaae8f345.p3210x3857dc.a aVar = new com.p314xaae8f345.p3210x3857dc.a();
            if (!(obj instanceof by5.h)) {
                return aVar;
            }
            by5.h hVar = (by5.h) obj;
            java.lang.String str = hVar.f118005b;
            java.lang.String str2 = hVar.f118006c;
            if (str.equals("executeCommand")) {
                java.lang.String[] s17 = com.p314xaae8f345.p3210x3857dc.b.m().s(hVar.f118006c);
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
            aVar.f301738a = true;
            by5.z e17 = by5.a0.e(str2);
            if (e17.f118148a) {
                by5.c4.f("ConfigCmdProc", "handleCommandRevertToVersion, version:" + str2);
                zx5.g.a(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c, e17.b());
            }
            return aVar;
        }
    }
}
