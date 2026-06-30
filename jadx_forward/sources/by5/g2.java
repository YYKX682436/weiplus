package by5;

/* loaded from: classes13.dex */
public class g2 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        try {
            com.p314xaae8f345.p3210x3857dc.b m17 = com.p314xaae8f345.p3210x3857dc.b.m();
            synchronized (m17) {
                synchronized (m17) {
                    m17.b(null, "0", false);
                }
                zx5.i0.d("cfg_update", 0, 0);
                return qx5.a.b();
            }
            zx5.i0.d("cfg_update", 0, 0);
            return qx5.a.b();
        } catch (java.lang.Exception e17) {
            by5.c4.g("XWebCommandHandler", "handleCommand, clear config commands error:" + e17.getMessage());
            return qx5.a.a();
        }
    }
}
