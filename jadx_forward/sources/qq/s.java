package qq;

@j95.b
/* loaded from: classes.dex */
public final class s extends i95.w implements qq.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f447416d = jz5.h.b(qq.r.f447415d);

    public java.lang.Object Ai(java.lang.String key, java.lang.Object defaultValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        java.lang.String concat = "ecs_test_".concat(key);
        if (defaultValue instanceof java.lang.Integer) {
            return java.lang.Integer.valueOf(Di().getInt(concat, ((java.lang.Number) defaultValue).intValue()));
        }
        if (defaultValue instanceof java.lang.Long) {
            return java.lang.Long.valueOf(Di().getLong(concat, ((java.lang.Number) defaultValue).longValue()));
        }
        if (defaultValue instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) defaultValue;
            java.lang.String string = Di().getString(concat, str);
            return string == null ? str : string;
        }
        if (defaultValue instanceof java.lang.Boolean) {
            return java.lang.Boolean.valueOf(Di().getBoolean(concat, ((java.lang.Boolean) defaultValue).booleanValue()));
        }
        if (defaultValue instanceof java.lang.Float) {
            return java.lang.Float.valueOf(Di().getFloat(concat, ((java.lang.Number) defaultValue).floatValue()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsTestService", "getConfig failed for key: " + key + ", defaultValue: " + defaultValue);
        return defaultValue;
    }

    public int Bi(java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return ((java.lang.Number) Ai(key, java.lang.Integer.valueOf(i17))).intValue();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Di() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f447416d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb;
    }

    public final void wi(java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "EcsMBAutoStartProfile")) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 1) || Di().getInt("ecs_test_EcsMBDebugPanel", 0) == 1) {
                    return;
                }
                Di().putInt("ecs_test_EcsMBDebugPanel", 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsTestService", "linkage: profile switch on, set panel switch to 1");
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "EcsMBDebugPanel") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 0) && Di().getInt("ecs_test_EcsMBAutoStartProfile", 0) != 0) {
                Di().putInt("ecs_test_EcsMBAutoStartProfile", 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsTestService", "linkage: panel switch off, set profile switch to 0");
            }
        }
    }
}
