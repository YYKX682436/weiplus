package lc3;

/* loaded from: classes7.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public lc3.e f399423a;

    /* renamed from: b, reason: collision with root package name */
    public oc3.c f399424b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f399425c;

    public final oc3.c e() {
        oc3.c cVar = this.f399424b;
        if (cVar != null) {
            return cVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("meta");
        throw null;
    }

    public abstract java.lang.String f();

    public abstract boolean g();

    public final lc3.a0 h(int i17, java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean z17 = false;
        if (str != null && !r26.i0.y(str, "fail", false)) {
            z17 = true;
        }
        if (z17) {
            str = "fail " + str;
        }
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("errCode", i17);
        a0Var.put("errMsg", f() + ':' + str);
        return a0Var;
    }

    public final lc3.a0 i(lc3.z error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        return j(error, "");
    }

    public final lc3.a0 j(lc3.z error, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String str2 = error.f399478b + ' ' + errMsg;
        int i17 = error.f399477a;
        if (i17 != 0 && !r26.i0.A(str2, "fail", false, 2, null)) {
            str2 = "fail ".concat(str2);
        }
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("errCode", i17);
        a0Var.put("errMsg", f() + ':' + str2);
        return a0Var;
    }

    public final lc3.a0 k() {
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("errCode", 0);
        a0Var.put("errMsg", f() + ":ok");
        return a0Var;
    }

    public final lc3.a0 l(java.util.HashMap map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        lc3.a0 a0Var = new lc3.a0(q(map));
        m(a0Var);
        return a0Var;
    }

    public final lc3.a0 m(lc3.a0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        obj.put("errCode", 0);
        obj.put("errMsg", f() + ":ok");
        return obj;
    }

    public boolean n() {
        return this instanceof iw.a;
    }

    public final void o(oc3.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<set-?>");
        this.f399424b = cVar;
    }

    public boolean p() {
        return this instanceof md3.l;
    }

    public final java.util.Map q(java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object key2 = entry.getKey();
            java.lang.Object value = entry.getValue();
            if ((key2 instanceof java.lang.String) && p3321xbce91901.jvm.p3324x21ffc6bd.m0.h(value)) {
                value = new org.json.JSONObject(q((java.util.Map) value));
            }
            linkedHashMap.put(key, value);
        }
        return kz5.c1.t(linkedHashMap);
    }
}
