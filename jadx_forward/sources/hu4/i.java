package hu4;

/* loaded from: classes9.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static long f366763a = -1;

    public static hu4.l a() {
        java.lang.Object l17;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 != null && (l17 = c17.l(339969, null)) != null) {
            hu4.l lVar = new hu4.l();
            lVar.a(hu4.j.h((java.lang.String) l17));
            return lVar;
        }
        return new hu4.l();
    }

    public static r45.p55 b() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 == null) {
            return null;
        }
        java.lang.String str = (java.lang.String) c17.l(339989, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.p55) new r45.p55().mo11468x92b714fd(android.util.Base64.decode(str, 2));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GestureGuardInfoManager", e17, "", new java.lang.Object[0]);
            return null;
        } catch (java.lang.IllegalArgumentException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GestureGuardInfoManager", e18, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static r45.q55 c() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GestureGuardInfoManager", "configstg is null");
            return null;
        }
        java.lang.String str = (java.lang.String) c17.l(339990, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.q55) new r45.q55().mo11468x92b714fd(android.util.Base64.decode(str, 2));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GestureGuardInfoManager", e17, "", new java.lang.Object[0]);
            return null;
        } catch (java.lang.IllegalArgumentException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GestureGuardInfoManager", e18, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static int d() {
        java.lang.Object l17;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 == null || (l17 = c17.l(339972, null)) == null) {
            return -1;
        }
        return ((java.lang.Integer) l17).intValue();
    }

    public static void e() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            c17.w(339969, null);
            c17.i(true);
        }
    }

    public static void f() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            c17.w(339971, null);
            c17.i(true);
        }
    }

    public static void g() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            c17.w(339972, null);
            c17.i(true);
        }
    }

    public static void h(long j17, long j18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeLong(j17);
                dataOutputStream.writeLong(j18);
                dataOutputStream.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TimeInfo", e17, "", new java.lang.Object[0]);
            }
            c17.w(339969, hu4.j.a(byteArrayOutputStream.toByteArray()));
            c17.i(true);
        }
    }

    public static void i(long j17, long j18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeLong(j17);
                dataOutputStream.writeLong(j18);
                dataOutputStream.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TimeInfo", e17, "", new java.lang.Object[0]);
            }
            c17.w(339971, hu4.j.a(byteArrayOutputStream.toByteArray()));
            c17.i(true);
        }
    }

    public static void j(r45.p55 p55Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            try {
                c17.w(339989, android.util.Base64.encodeToString(p55Var.mo14344x5f01b1f6(), 2));
                c17.i(true);
                hu4.j.g();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GestureGuardInfoManager", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
