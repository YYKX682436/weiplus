package gm4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final gm4.a f355090a;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f355091b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f355092c;

    static {
        gm4.a aVar = new gm4.a();
        f355090a = aVar;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean a17 = gm0.j1.a();
            java.lang.String d17 = aVar.d();
            if (f355091b == null) {
                f355091b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(d17);
                f355092c = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingLocalStorage", "initMMKV %s, key: %s, mmkv: %s, cost: %s", java.lang.Boolean.valueOf(a17), d17, f355091b, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingLocalStorage", e17, "checkInitMMKV exception", new java.lang.Object[0]);
            f355092c = false;
        }
    }

    public final boolean a(java.lang.String key, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (f355092c) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f355091b;
            return o4Var != null ? o4Var.getBoolean(key, z17) : z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalStorage", "not init");
        return z17;
    }

    public final byte[] b(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (!f355092c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalStorage", "not init");
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f355091b;
        if (o4Var != null) {
            return o4Var.j(key);
        }
        return null;
    }

    public final int c(java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (f355092c) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f355091b;
            return o4Var != null ? o4Var.getInt(key, i17) : i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalStorage", "not init");
        return i17;
    }

    public final java.lang.String d() {
        if (!gm0.j1.a()) {
            return "_ting_local_storage_mmkv";
        }
        return c01.z1.r() + "_ting_local_storage_mmkv";
    }

    public final java.lang.String e(java.lang.String key, java.lang.String str) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (f355092c) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f355091b;
            return (o4Var == null || (string = o4Var.getString(key, str)) == null) ? str : string;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalStorage", "not init");
        return str;
    }

    public final void f(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f355091b;
        if (o4Var != null) {
            o4Var.remove(key);
        }
    }

    public final void g(java.lang.String key, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (!f355092c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalStorage", "not init");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f355091b;
        if (o4Var != null) {
            o4Var.putBoolean(key, z17);
        }
    }

    public final void h(java.lang.String key, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (!f355092c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalStorage", "not init");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f355091b;
        if (o4Var != null) {
            o4Var.H(key, bArr);
        }
    }

    public final void i(java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (!f355092c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalStorage", "not init");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f355091b;
        if (o4Var != null) {
            o4Var.putInt(key, i17);
        }
    }

    public final void j(java.lang.String key, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (!f355092c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalStorage", "not init");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f355091b;
        if (o4Var != null) {
            o4Var.putString(key, str);
        }
    }
}
