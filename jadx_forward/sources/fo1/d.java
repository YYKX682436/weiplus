package fo1;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final fo1.d f346391a = new fo1.d();

    public final boolean a(org.json.JSONObject jobj, java.lang.String key, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jobj, "jobj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (!jobj.has(key)) {
            return z17;
        }
        java.lang.Object obj = jobj.get(key);
        return obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : obj instanceof java.lang.Integer ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 1) : obj instanceof java.lang.String ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b("true", obj) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", obj) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("True", obj) : z17;
    }

    public final boolean b(po1.d device) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        return r26.i0.A(device.f438828a, "#OnlineDeviceId@", false, 2, null);
    }

    public final boolean c(po1.d device) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        r26.i0.A(device.f438828a, "#OnlineDeviceId@", false, 2, null);
        java.lang.String substring = device.f438828a.substring(16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        int parseInt = java.lang.Integer.parseInt(substring);
        if (r26.i0.A(device.f438833f, "UNIFY_MAC", false, 2, null)) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_roam_xwechat_version_update_mac, -228327424);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AutoBindHelper", "isVersionSatisfied [Mac]: onlineVersion=" + ((java.lang.Object) jz5.u.a(parseInt)) + ", exptVersion=" + ((java.lang.Object) jz5.u.a(Ni)));
            return java.lang.Integer.compare(parseInt ^ Integer.MIN_VALUE, Ni ^ Integer.MIN_VALUE) >= 0;
        }
        if (!r26.i0.A(device.f438833f, "UNIFY_WINDOWS", false, 2, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AutoBindHelper", "isVersionSatisfied [Others]: deviceInfo = " + device);
            return false;
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_roam_xwechat_version_update_pc, -229376000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AutoBindHelper", "isVersionSatisfied [Windows]: onlineVersion=" + ((java.lang.Object) jz5.u.a(parseInt)) + ", exptVersion=" + ((java.lang.Object) jz5.u.a(Ni2)));
        return java.lang.Integer.compare(parseInt ^ Integer.MIN_VALUE, Ni2 ^ Integer.MIN_VALUE) >= 0;
    }
}
