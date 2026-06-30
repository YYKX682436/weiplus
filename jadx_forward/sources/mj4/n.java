package mj4;

/* loaded from: classes11.dex */
public final class n extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f408609e = {l75.n0.m145250x3fdc6f77(mj4.l.W, "TextStatusLike")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f408610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.k0 db6) {
        super(db6, mj4.l.W, "TextStatusLike", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = mj4.l.W;
        this.f408610d = db6;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(mj4.l item, java.lang.String... keys) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        boolean mo51732xbf274172 = super.mo51732xbf274172(item, false, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
        mo145247xf35bbb4(item.f76605x8d8a3769);
        return mo51732xbf274172;
    }

    @Override // l75.s0, l75.l0
    /* renamed from: doNotify */
    public void mo145247xf35bbb4(java.lang.String str) {
        super.mo142179xf35bbb4(str, -1, null);
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        mj4.l item = (mj4.l) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo55864x413cb2b4 = super.mo55864x413cb2b4(item, false);
        mo145247xf35bbb4(item.f76605x8d8a3769);
        return mo55864x413cb2b4;
    }

    @Override // l75.n0
    /* renamed from: update */
    public boolean mo11261xce0038c9(long j17, l75.f0 f0Var) {
        mj4.l item = (mj4.l) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo11261xce0038c9 = super.mo11261xce0038c9(j17, item);
        mo145247xf35bbb4(item.f76605x8d8a3769);
        return mo11261xce0038c9;
    }

    @Override // l75.n0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean mo9951xb06685ab(mj4.l item, java.lang.String... keys) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        boolean mo9951xb06685ab = super.mo9951xb06685ab(item, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
        mo145247xf35bbb4(item.f76605x8d8a3769);
        return mo9951xb06685ab;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(mj4.l item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo51731x24249762 = super.mo51731x24249762(item, false);
        mo145247xf35bbb4(item.f76605x8d8a3769);
        return mo51731x24249762;
    }
}
