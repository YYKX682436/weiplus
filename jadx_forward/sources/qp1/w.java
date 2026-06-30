package qp1;

/* loaded from: classes14.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f447288a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Integer f447289b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Integer f447290c;

    static {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(j62.e.g().i("clicfg_float_ball_message_ball_time_limit_in_ms", 3000, true, true));
        f447290c = valueOf;
        if (valueOf.intValue() <= 0) {
            f447290c = 3000;
        } else if (valueOf.intValue() > 10000) {
            f447290c = 10000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUtil", "addMessageBallTimeLimitInMs %s", f447290c);
    }

    public static boolean a(java.util.Collection collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    public static boolean b(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        boolean z17 = false;
        if (!(a(list) && list.size() == 1) || !list.contains(c12886x91aa2b6d)) {
            return false;
        }
        if (c12886x91aa2b6d.f174579d != 16) {
            return true;
        }
        synchronized (c12886x91aa2b6d) {
            if (c12886x91aa2b6d.i("hasWvaTask")) {
                z17 = c12886x91aa2b6d.G.getBoolean("hasWvaTask", false);
            }
        }
        return !z17;
    }

    public static java.util.List c(java.util.List list) {
        java.util.List e17 = e(list);
        if (!a(e17)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = ((java.util.Vector) e17).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if (!c12886x91aa2b6d.I) {
                vector.add(c12886x91aa2b6d);
            }
        }
        return vector;
    }

    public static java.util.List d(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if (r(c12886x91aa2b6d)) {
                vector.add(c12886x91aa2b6d);
            }
        }
        return vector;
    }

    public static java.util.List e(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if (!c12886x91aa2b6d.f174578J) {
                vector.add(c12886x91aa2b6d);
            }
        }
        return vector;
    }

    public static java.util.List f(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if (r(c12886x91aa2b6d) && !c12886x91aa2b6d.f174578J) {
                vector.add(c12886x91aa2b6d);
            }
        }
        return vector;
    }

    public static java.util.List g(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if ((c12886x91aa2b6d.f174581f == 2) && !c12886x91aa2b6d.f174578J) {
                vector.add(c12886x91aa2b6d);
            }
        }
        return vector;
    }

    public static java.util.List h(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if (!t(c12886x91aa2b6d)) {
                vector.add(c12886x91aa2b6d);
            }
        }
        return vector;
    }

    public static java.util.List i(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if (c12886x91aa2b6d.I) {
                vector.add(c12886x91aa2b6d);
            }
        }
        return vector;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d j(java.util.List list) {
        if (!a(list)) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if (t(c12886x91aa2b6d)) {
                return c12886x91aa2b6d;
            }
        }
        return null;
    }

    public static int k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f().getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174727e;
    }

    public static int l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f().getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174728f;
    }

    public static int m(java.util.List list) {
        int i17 = 0;
        if (a(list)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next()).f174581f == 1) {
                    i17++;
                }
            }
        }
        return i17;
    }

    public static int n(android.content.Context context) {
        if (f447288a == null) {
            f447288a = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.u(context, false));
        }
        if (!f447288a.booleanValue()) {
            return 0;
        }
        if (f447289b == null) {
            f447289b = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.p(context));
        }
        return f447289b.intValue();
    }

    public static int o(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        int i17 = c12886x91aa2b6d.f174579d;
        return (i17 == 20 && (i17 = c12886x91aa2b6d.f174580e) == 5) ? com.p314xaae8f345.mm.R.raw.f79368xeef5bb1b : i17 != 1 ? i17 != 6 ? i17 != 8 ? i17 != 3 ? i17 != 4 ? com.p314xaae8f345.mm.R.raw.f79376xcdc683c : com.p314xaae8f345.mm.R.raw.f79367xb2ed9490 : com.p314xaae8f345.mm.R.raw.f79366xdb279af4 : com.p314xaae8f345.mm.R.raw.f79375x476b24b : com.p314xaae8f345.mm.R.raw.f79370x33f63a3e : com.p314xaae8f345.mm.R.raw.f79360x9b234591;
    }

    public static int p(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        int i17 = c12886x91aa2b6d.H;
        if (q(i17, 1)) {
            return com.p314xaae8f345.mm.R.raw.f80516xea5ce52c;
        }
        if (q(i17, 2) || q(i17, 128)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = c12886x91aa2b6d.f174587o;
            return ballButtonInfo != null && ballButtonInfo.f174614s ? ballButtonInfo.f174602d ? com.p314xaae8f345.mm.R.C30861xcebc809e.cza : com.p314xaae8f345.mm.R.raw.f78789x4ae29487 : ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).wi() ? com.p314xaae8f345.mm.R.raw.f79377x1dfc7fd9 : com.p314xaae8f345.mm.R.raw.f79385xcc8fc63a;
        }
        if (q(i17, 16)) {
            return com.p314xaae8f345.mm.R.raw.f79358xd17180bc;
        }
        if (q(i17, 32) || q(i17, 64)) {
            return com.p314xaae8f345.mm.R.raw.f81343x255044e1;
        }
        if (q(i17, 256)) {
            return c12886x91aa2b6d.f174580e == 32 ? c12886x91aa2b6d.f174593u : com.p314xaae8f345.mm.R.raw.f79382xcc6e26dc;
        }
        if (q(i17, 4096)) {
            return com.p314xaae8f345.mm.R.raw.f78666x45ec2813;
        }
        return -1;
    }

    public static boolean q(int i17, int i18) {
        return (i17 & i18) != 0;
    }

    public static boolean r(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        return c12886x91aa2b6d != null && c12886x91aa2b6d.f174581f == 1;
    }

    public static boolean s(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        int i17 = c12886x91aa2b6d.f174586n;
        return (i17 == 2 || i17 == 1) && c12886x91aa2b6d.f174587o.f174602d;
    }

    public static boolean t(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d == null) {
            return false;
        }
        if ((c12886x91aa2b6d.f174581f == 2) || r(c12886x91aa2b6d)) {
            return false;
        }
        int i17 = c12886x91aa2b6d.f174579d;
        if (i17 == 20) {
            i17 = c12886x91aa2b6d.f174580e;
        }
        return i17 == 9 || i17 == 21 || i17 == 48 || i17 == 22 || i17 == 32 || i17 == 23 || i17 == 24 || i17 == 35 || i17 == 36 || i17 == 39 || i17 == 53 || i17 == 52 || i17 == 64 || i17 == 66 || i17 == 67 || i17 == 68 || i17 == 65 || i17 == 40;
    }
}
