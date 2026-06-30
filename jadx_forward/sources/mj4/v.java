package mj4;

/* loaded from: classes11.dex */
public final class v extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f408614f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f408615d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f408616e;

    static {
        mj4.h.f408597a.getClass();
        f408614f = new java.lang.String[]{l75.n0.m145250x3fdc6f77(mj4.g.f408595b, "TextStatus")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(l75.k0 db6) {
        super(db6, mj4.g.f408595b, "TextStatus", rj4.a.f477729p0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        mj4.h.f408597a.getClass();
        this.f408615d = db6;
        this.f408616e = jz5.h.b(new mj4.q(this));
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(mj4.a item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo51731x24249762 = super.mo51731x24249762(item, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "insert:" + mo51731x24249762 + ", username=" + item.f76535x11b86abb + ", statusId=" + item.f76532x70371252 + ", iconId=" + item.f76517xc80c2659 + ", " + item.f76512x81959a6e + ", pKey=" + item.mo9766x4c6b483e());
        if (mo51731x24249762) {
            y0().put(item.f76535x11b86abb, item);
            mo145247xf35bbb4(item.f76535x11b86abb);
        }
        return mo51731x24249762;
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo11260x413cb2b4(mj4.a item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo55864x413cb2b4 = super.mo55864x413cb2b4(item, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "replace:" + mo55864x413cb2b4 + ", username=" + item.f76535x11b86abb + ", statusId=" + item.f76532x70371252 + ", iconId" + item.f76517xc80c2659 + ", " + item.f76512x81959a6e);
        if (mo55864x413cb2b4) {
            y0().put(item.f76535x11b86abb, item);
            mo145247xf35bbb4(item.f76535x11b86abb);
        }
        return mo55864x413cb2b4;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(mj4.a item, java.lang.String... keys) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        boolean mo51732xbf274172 = super.mo51732xbf274172(item, false, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "update:" + mo51732xbf274172 + ", " + item.f76535x11b86abb + ", statusId=" + item.f76532x70371252 + ", iconId=" + item.f76517xc80c2659 + ", clusterId=" + new mj4.k(item).c() + ", pKey=" + item.mo9766x4c6b483e());
        if (mo51732xbf274172) {
            y0().put(item.f76535x11b86abb, item);
            mo145247xf35bbb4(item.f76535x11b86abb);
        }
        return mo51732xbf274172;
    }

    @Override // l75.n0
    /* renamed from: delete */
    public boolean mo9951xb06685ab(l75.f0 f0Var, java.lang.String[] keys) {
        mj4.a item = (mj4.a) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        boolean mo9951xb06685ab = super.mo9951xb06685ab(item, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
        if (mo9951xb06685ab) {
            y0().remove(item.f76535x11b86abb);
            mo145247xf35bbb4(item.f76535x11b86abb);
        }
        return mo9951xb06685ab;
    }

    @Override // l75.s0, l75.l0
    /* renamed from: doNotify */
    public void mo145247xf35bbb4(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.TextStatus.TextStatusStorage", "db doNotify: " + str, new java.lang.Object[0]);
        super.mo145247xf35bbb4(str);
    }

    @Override // l75.n0
    /* renamed from: update */
    public boolean mo11261xce0038c9(long j17, l75.f0 f0Var) {
        mj4.a item = (mj4.a) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo11261xce0038c9 = super.mo11261xce0038c9(j17, item);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", "update: " + mo11261xce0038c9 + ", " + item.f76535x11b86abb + ", statusId=" + item.f76532x70371252 + ", iconId=" + item.f76517xc80c2659 + ", clusterId=" + new mj4.k(item).c());
        if (mo11261xce0038c9) {
            y0().put(item.f76535x11b86abb, item);
            mo145247xf35bbb4(item.f76535x11b86abb);
        }
        return mo11261xce0038c9;
    }

    public final java.util.concurrent.ConcurrentHashMap y0() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f408616e).mo141623x754a37bb();
    }

    public final mj4.h z0(java.lang.String str) {
        if (str == null) {
            return null;
        }
        mj4.a aVar = (mj4.a) y0().get(str);
        if (aVar != null && !aVar.t0()) {
            return new mj4.k(aVar);
        }
        y0().remove(str);
        return null;
    }
}
