package fn4;

/* loaded from: classes15.dex */
public abstract class d {
    public static final fn4.m a(fn4.b bVar) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07;
        int m8008x3d79f549 = bVar.u6().m8008x3d79f549();
        if (m8008x3d79f549 == 0) {
            w07 = null;
        } else {
            int k17 = bVar.u6().m8009xf2b87f0() ? bVar.d2().k() + (bVar.d2().l() / 2) : bVar.d2().f() / 2;
            int i17 = Integer.MAX_VALUE;
            android.view.View view = null;
            for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
                android.view.View m8007x6a486239 = bVar.u6().m8007x6a486239(i18);
                int abs = java.lang.Math.abs((bVar.d2().e(m8007x6a486239) + (bVar.d2().c(m8007x6a486239) / 2)) - k17);
                if (abs < i17) {
                    view = m8007x6a486239;
                    i17 = abs;
                }
            }
            w07 = bVar.mo72292x4905e9fa().w0(view);
        }
        if (w07 instanceof fn4.m) {
            return (fn4.m) w07;
        }
        return null;
    }

    public abstract void b(fn4.b bVar);

    public abstract void c(fn4.b bVar);

    public void d(fn4.b bVar, int i17) {
    }
}
