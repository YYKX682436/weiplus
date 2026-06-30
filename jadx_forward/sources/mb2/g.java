package mb2;

/* loaded from: classes5.dex */
public final class g extends mb2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f406874e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f406875f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f406876g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.Object obj, java.lang.String expname, yz5.a onConfigChanged) {
        super(obj, "SVR", onConfigChanged);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expname, "expname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConfigChanged, "onConfigChanged");
        this.f406874e = expname;
        this.f406875f = jz5.h.b(mb2.f.f406873d);
        try {
            a();
            this.f406876g = true;
        } catch (c01.c e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConfigItem", "[updateValueFromSvr2] catch AccountNotReadyException, ".concat(jz5.a.b(e17)));
            this.f406876g = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13686x15c71625 c13686x15c71625 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13686x15c71625.f184350d;
        java.lang.String key = this.f406874e;
        c13686x15c71625.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13686x15c71625.f184351e;
        if (concurrentHashMap.containsKey(key)) {
            return;
        }
        concurrentHashMap.put(key, new java.lang.ref.WeakReference(this));
    }

    @Override // mb2.a, mb2.e
    public void a() {
        lm0.a s17 = gm0.j1.s(c25.e.class);
        java.lang.String str = this.f406874e;
        java.lang.Object obj = this.f406866a;
        if (s17 == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b() == null) {
            this.f406869d = obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConfigItem", "[updateValueFromSvr2] keyName:" + str + ", has update to " + this.f406869d);
        } else {
            if (obj instanceof java.lang.Integer) {
                ip.j b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                obj = java.lang.Integer.valueOf(b17.b(str, ((java.lang.Integer) obj).intValue()));
            } else if (obj instanceof java.lang.Long) {
                ip.j b18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                obj = (java.lang.Long) java.lang.Integer.valueOf(b18.b(str, ((java.lang.Integer) obj).intValue()));
            } else if (obj instanceof java.lang.String) {
                java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                obj = (java.lang.String) obj;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (d17 != null) {
                    obj = d17;
                }
            }
            this.f406869d = obj;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConfigItem", "[updateValueFromSvr] keyName:" + str + ", has update to " + this.f406869d);
    }

    @Override // mb2.a
    public java.lang.Object c() {
        if (((java.lang.Number) this.f406875f.mo141623x754a37bb()).intValue() == 1 || !this.f406876g) {
            a();
            this.f406876g = true;
        }
        java.lang.Object obj = this.f406869d;
        return obj == null ? this.f406866a : obj;
    }
}
