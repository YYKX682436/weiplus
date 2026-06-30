package bm5;

/* loaded from: classes11.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bm5.o1 f104252a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f104253b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f104254c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f104255d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f104256e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f104257f;

    static {
        bm5.o1 o1Var = new bm5.o1();
        f104252a = o1Var;
        f104253b = new java.util.HashMap();
        f104255d = new java.util.concurrent.atomic.AtomicBoolean(false);
        f104256e = jz5.h.b(bm5.l1.f104233d);
        f104257f = jz5.h.b(bm5.k1.f104230d);
        if (com.p314xaae8f345.mm.app.v5.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f135403g == com.p314xaae8f345.mm.app.u5.ISOLATED) {
            return;
        }
        final bm5.m1 m1Var = bm5.m1.f104238d;
        if (!o1Var.a() && ku5.t0.f394148d != null) {
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable(m1Var) { // from class: bm5.n1

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f104240d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m1Var, "function");
                    this.f104240d = m1Var;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f104240d.mo152xb9724478();
                }
            }, "RepairerConfigThread");
            return;
        }
        if (!o1Var.a()) {
            java.lang.Throwable th6 = new java.lang.Throwable();
            qo.m mVar = (qo.m) i95.n0.c(qo.m.class);
            bm5.j1 j1Var = new bm5.j1(th6);
            ((qo.c) mVar).getClass();
            qo.b bVar = new qo.b(j1Var);
            if (gm0.j1.h()) {
                bVar.s();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMKernel", "[+] cb %s was added to post initialized callbacks.", bVar);
                gm0.j1.f354740n.v(bVar);
            }
        }
        m1Var.mo152xb9724478();
    }

    public final boolean a() {
        return ((java.lang.Boolean) f104257f.mo141623x754a37bb()).booleanValue();
    }

    public final java.lang.Object b(bm5.h0 key, java.lang.Object defaultValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        return c(key.name(), defaultValue);
    }

    public final java.lang.Object c(java.lang.String key, java.lang.Object defaultValue) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        java.util.HashMap hashMap = f104253b;
        if (hashMap.containsKey(key)) {
            java.lang.Object obj = hashMap.get(key);
            return obj == null ? defaultValue : obj;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var4 = f104254c;
        boolean z17 = false;
        if (o4Var4 != null && o4Var4.f(key)) {
            z17 = true;
        }
        if (z17) {
            java.util.List f07 = r26.n0.f0(key, new java.lang.String[]{"_"}, false, 0, 6, null);
            java.lang.String str = (java.lang.String) f07.get(f07.size() - 1);
            switch (str.hashCode()) {
                case -1808118735:
                    if (str.equals("String")) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var5 = f104254c;
                        java.lang.String u17 = o4Var5 != null ? o4Var5.u(key, (java.lang.String) defaultValue) : null;
                        if (u17 != null) {
                            defaultValue = u17;
                            break;
                        }
                    }
                    break;
                case 73679:
                    if (str.equals("Int") && (o4Var = f104254c) != null) {
                        defaultValue = java.lang.Integer.valueOf(o4Var.o(key, ((java.lang.Integer) defaultValue).intValue()));
                        break;
                    }
                    break;
                case 2374300:
                    if (str.equals("Long") && (o4Var2 = f104254c) != null) {
                        defaultValue = java.lang.Long.valueOf(o4Var2.q(key, ((java.lang.Long) defaultValue).longValue()));
                        break;
                    }
                    break;
                case 67973692:
                    if (str.equals("Float") && (o4Var3 = f104254c) != null) {
                        defaultValue = java.lang.Float.valueOf(o4Var3.m(key, ((java.lang.Float) defaultValue).floatValue()));
                        break;
                    }
                    break;
            }
            hashMap.put(key, defaultValue);
        }
        return defaultValue;
    }

    public final java.lang.Object d(q55.e keyObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyObj, "keyObj");
        return c(keyObj.l(), keyObj.i());
    }

    public final float e(bm5.h0 key, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.Object b17 = b(key, java.lang.Float.valueOf(f17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.Float");
        return ((java.lang.Float) b17).floatValue();
    }

    public final float f(q55.e keyObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyObj, "keyObj");
        java.lang.Object c17 = c(keyObj.l(), keyObj.i());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type kotlin.Float");
        return ((java.lang.Float) c17).floatValue();
    }

    public final int g(bm5.h0 key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.Object b17 = b(key, java.lang.Integer.valueOf(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) b17).intValue();
    }

    public final int h(q55.e keyObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyObj, "keyObj");
        java.lang.Object c17 = c(keyObj.l(), keyObj.i());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) c17).intValue();
    }

    public final int i(q55.e keyObj, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyObj, "keyObj");
        java.lang.Object c17 = c(keyObj.l(), java.lang.Integer.valueOf(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) c17).intValue();
    }

    public final long j(q55.e keyObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyObj, "keyObj");
        java.lang.Object c17 = c(keyObj.l(), keyObj.i());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type kotlin.Long");
        return ((java.lang.Long) c17).longValue();
    }

    public final java.lang.String k(bm5.h0 key, java.lang.String defaultValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        java.lang.Object b17 = b(key, defaultValue);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.String");
        return (java.lang.String) b17;
    }

    public final java.lang.String l(q55.e keyObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyObj, "keyObj");
        java.lang.Object c17 = c(keyObj.l(), keyObj.i());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type kotlin.String");
        return (java.lang.String) c17;
    }

    public final int m(q55.e keyObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyObj, "keyObj");
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        boolean z17 = true;
        if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
            z17 = false;
        }
        if (z17) {
            java.lang.String str = "ValueStrategy_" + keyObj.l();
            java.util.HashMap hashMap = f104253b;
            if (hashMap.containsKey(str)) {
                java.lang.Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = 0;
                }
                return ((java.lang.Integer) obj).intValue();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f104254c;
            r1 = o4Var != null ? o4Var.o(str, 0) : 0;
            hashMap.put(str, java.lang.Integer.valueOf(r1));
        }
        return r1;
    }

    public final void n(bm5.e1 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        if (f104255d.get()) {
            return;
        }
        ((java.util.concurrent.ConcurrentLinkedDeque) ((jz5.n) f104256e).mo141623x754a37bb()).add(new java.lang.ref.WeakReference(listener));
    }

    public final void o(bm5.h0 key, java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p(key.name(), value);
    }

    public final void p(java.lang.String key, java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.lang.String str = (java.lang.String) r26.n0.f0(key, new java.lang.String[]{"_"}, false, 0, 6, null).get(r0.size() - 1);
        int hashCode = str.hashCode();
        java.util.HashMap hashMap = f104253b;
        switch (hashCode) {
            case -1808118735:
                if (str.equals("String")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f104254c;
                    if (o4Var != null) {
                        o4Var.D(key, (java.lang.String) value);
                    }
                    hashMap.put(key, value);
                    return;
                }
                return;
            case 73679:
                if (str.equals("Int")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = f104254c;
                    if (o4Var2 != null) {
                        o4Var2.A(key, ((java.lang.Integer) value).intValue());
                    }
                    hashMap.put(key, value);
                    return;
                }
                return;
            case 2374300:
                if (str.equals("Long")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3 = f104254c;
                    if (o4Var3 != null) {
                        o4Var3.B(key, ((java.lang.Long) value).longValue());
                    }
                    hashMap.put(key, value);
                    return;
                }
                return;
            case 67973692:
                if (str.equals("Float")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var4 = f104254c;
                    if (o4Var4 != null) {
                        o4Var4.z(key, ((java.lang.Float) value).floatValue());
                    }
                    hashMap.put(key, value);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void q(q55.e keyObj, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyObj, "keyObj");
        java.lang.String str = "ValueStrategy_" + keyObj.l();
        f104253b.put(str, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f104254c;
        if (o4Var != null) {
            o4Var.A(str, i17);
        }
    }
}
