package mb2;

/* loaded from: classes5.dex */
public final class i extends mb2.a {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f406878e;

    /* renamed from: f, reason: collision with root package name */
    public final e42.b0 f406879f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f406880g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, java.lang.Object obj, e42.b0 expname, yz5.a onConfigChanged) {
        super(obj, "SVR", onConfigChanged);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expname, "expname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConfigChanged, "onConfigChanged");
        this.f406878e = z17;
        this.f406879f = expname;
        this.f406880g = jz5.h.b(mb2.h.f406877d);
        a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13687xc737fdef c13687xc737fdef = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13687xc737fdef.f184352d;
        java.lang.String mo122878x337a8b = expname.mo122878x337a8b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo122878x337a8b, "name(...)");
        c13687xc737fdef.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1436xaf3f8342.p1437x2e06d1.C13687xc737fdef.f184353e;
        if (concurrentHashMap.containsKey(mo122878x337a8b)) {
            return;
        }
        concurrentHashMap.put(mo122878x337a8b, new java.lang.ref.WeakReference(this));
    }

    @Override // mb2.a, mb2.e
    public void a() {
        boolean z17 = this.f406878e;
        this.f406869d = d(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConfigItem", "[updateValueFromSvr] isReadWithHit=" + z17 + " keyName:" + this.f406879f.mo122878x337a8b() + ", has update to " + this.f406869d);
    }

    @Override // mb2.a
    public void b() {
        d(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConfigItem", "[manualHit] keyName:" + this.f406879f.mo122878x337a8b() + ", has update to " + this.f406869d);
    }

    @Override // mb2.a
    public java.lang.Object c() {
        if (((java.lang.Number) this.f406880g.mo141623x754a37bb()).intValue() == 1) {
            a();
        }
        java.lang.Object obj = this.f406869d;
        return obj == null ? this.f406866a : obj;
    }

    public final java.lang.Object d(boolean z17) {
        e42.b0 b0Var = this.f406879f;
        java.lang.Object obj = this.f406866a;
        if (z17) {
            if (obj instanceof java.lang.Integer) {
                e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return java.lang.Integer.valueOf(((h62.d) e0Var).Ni(b0Var, ((java.lang.Integer) obj).intValue()));
            }
            if (obj instanceof java.lang.Long) {
                e42.e0 e0Var2 = (e42.e0) i95.n0.c(e42.e0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                return java.lang.Long.valueOf(((h62.d) e0Var2).Ui(b0Var, ((java.lang.Long) obj).longValue()));
            }
            if (obj instanceof java.lang.Boolean) {
                e42.e0 e0Var3 = (e42.e0) i95.n0.c(e42.e0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                return java.lang.Boolean.valueOf(((h62.d) e0Var3).fj(b0Var, ((java.lang.Boolean) obj).booleanValue()));
            }
            if (obj instanceof java.lang.String) {
                e42.e0 e0Var4 = (e42.e0) i95.n0.c(e42.e0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                return ((h62.d) e0Var4).Zi(b0Var, (java.lang.String) obj, true);
            }
            if (!(obj instanceof java.lang.Float)) {
                return obj;
            }
            e42.e0 e0Var5 = (e42.e0) i95.n0.c(e42.e0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Float");
            return java.lang.Float.valueOf(((h62.d) e0Var5).Di(b0Var, ((java.lang.Float) obj).floatValue()));
        }
        if (obj instanceof java.lang.Integer) {
            e42.e0 e0Var6 = (e42.e0) i95.n0.c(e42.e0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return java.lang.Integer.valueOf(((h62.d) e0Var6).rj(b0Var, ((java.lang.Integer) obj).intValue()));
        }
        if (obj instanceof java.lang.Long) {
            e42.e0 e0Var7 = (e42.e0) i95.n0.c(e42.e0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((java.lang.Long) obj).longValue();
            java.lang.String Zi = ((h62.d) e0Var7).Zi(b0Var, "", false);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                longValue = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(Zi, longValue);
            }
            return java.lang.Long.valueOf(longValue);
        }
        if (obj instanceof java.lang.Boolean) {
            e42.e0 e0Var8 = (e42.e0) i95.n0.c(e42.e0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return java.lang.Boolean.valueOf(((h62.d) e0Var8).sj(b0Var, ((java.lang.Boolean) obj).booleanValue()));
        }
        if (obj instanceof java.lang.String) {
            e42.e0 e0Var9 = (e42.e0) i95.n0.c(e42.e0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            return ((h62.d) e0Var9).Zi(b0Var, (java.lang.String) obj, false);
        }
        if (!(obj instanceof java.lang.Float)) {
            return obj;
        }
        e42.e0 e0Var10 = (e42.e0) i95.n0.c(e42.e0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) obj).floatValue();
        java.lang.String Zi2 = ((h62.d) e0Var10).Zi(b0Var, "", false);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi2)) {
            floatValue = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(Zi2, floatValue);
        }
        return java.lang.Float.valueOf(floatValue);
    }
}
