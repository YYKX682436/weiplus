package bn0;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final bn0.g f22779a = new bn0.g();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f22780b = jz5.h.b(bn0.e.f22777d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f22781c = jz5.h.b(bn0.f.f22778d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f22782d = jz5.h.b(bn0.d.f22776d);

    public final long a(java.lang.String name, long j17) {
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = name;
        com.tencent.mm.sdk.platformtools.o4 a17 = d().a();
        objArr[1] = java.lang.Long.valueOf(a17 != null ? a17.q(name, j17) : j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "getConfig name = %s, value = %s", objArr);
        com.tencent.mm.sdk.platformtools.o4 a18 = d().a();
        return a18 != null ? a18.q(name, j17) : j17;
    }

    public final java.lang.String b(java.lang.String name, java.lang.String def) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(def, "def");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = name;
        com.tencent.mm.sdk.platformtools.o4 a17 = d().a();
        java.lang.String u17 = a17 != null ? a17.u(name, def) : null;
        if (u17 == null) {
            u17 = def;
        }
        objArr[1] = u17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "getConfig name = %s, value = %s", objArr);
        com.tencent.mm.sdk.platformtools.o4 a18 = d().a();
        java.lang.String u18 = a18 != null ? a18.u(name, def) : null;
        return u18 == null ? def : u18;
    }

    public final boolean c(java.lang.String name, boolean z17) {
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = name;
        com.tencent.mm.sdk.platformtools.o4 a17 = d().a();
        objArr[1] = java.lang.Boolean.valueOf(a17 != null ? a17.i(name, z17) : z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "getConfig name = %s, value = %s", objArr);
        com.tencent.mm.sdk.platformtools.o4 a18 = d().a();
        return a18 != null ? a18.i(name, z17) : z17;
    }

    public final bn0.c d() {
        return (bn0.c) ((jz5.n) f22782d).getValue();
    }

    public final bn0.c e() {
        return (bn0.c) ((jz5.n) f22781c).getValue();
    }

    public final bn0.a f(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = username;
        jz5.g gVar = f22780b;
        com.tencent.mm.sdk.platformtools.o4 a17 = ((bn0.c) ((jz5.n) gVar).getValue()).a();
        objArr[1] = a17 != null ? a17.u(username, "") : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "getLightPushContactData name = %s, value = %s", objArr);
        com.tencent.mm.sdk.platformtools.o4 a18 = ((bn0.c) ((jz5.n) gVar).getValue()).a();
        java.lang.String u17 = a18 != null ? a18.u(username, "") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
            return null;
        }
        bn0.a aVar = new bn0.a(0, 0, 0, 0, "");
        kotlin.jvm.internal.o.d(u17);
        int i17 = 0;
        for (java.lang.Object obj : r26.n0.f0(u17, new java.lang.String[]{";"}, false, 0, 6, null)) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj;
            if (i17 == 0) {
                aVar.f22768a = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
            } else if (i17 == 1) {
                aVar.f22769b = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
            } else if (i17 == 2) {
                aVar.f22770c = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
            } else if (i17 == 3) {
                aVar.f22771d = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
            } else if (i17 == 4) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                aVar.f22772e = str;
            }
            i17 = i18;
        }
        return aVar;
    }

    public final void g(java.lang.String name, long j17) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.sdk.platformtools.o4 a17 = d().a();
        if (a17 != null) {
            a17.B(name, j17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "saveConfig name = %s, value = %s", name, java.lang.Long.valueOf(j17));
    }

    public final void h(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mm.sdk.platformtools.o4 a17 = d().a();
        if (a17 != null) {
            a17.D(name, value);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "saveConfig name = %s, value = %s", name, value);
    }

    public final void i(java.lang.String name, boolean z17) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.sdk.platformtools.o4 a17 = d().a();
        if (a17 != null) {
            a17.G(name, z17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "saveConfig name = %s, value = %s", name, java.lang.Boolean.valueOf(z17));
    }

    public final void j(java.lang.String username, bn0.a data) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.sdk.platformtools.o4 a17 = ((bn0.c) ((jz5.n) f22780b).getValue()).a();
        if (a17 != null) {
            a17.D(username, bn0.h.a(data));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "saveLightPushContactData username = %s, data = %s", username, bn0.h.a(data));
    }

    public final void k(java.lang.String forcePushId, bn0.b data) {
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.sdk.platformtools.o4 a17 = e().a();
        if (a17 != null) {
            a17.D(forcePushId, data.a());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LightPushKV", "saveLightPushForceNotifyData forcePushId = %s, data = %s", forcePushId, data.a());
    }
}
