package g75;

/* loaded from: classes10.dex */
public final class r implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: p, reason: collision with root package name */
    public static final g75.k f350924p = new g75.k(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f350925d;

    /* renamed from: e, reason: collision with root package name */
    public final g75.z f350926e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f350927f;

    /* renamed from: g, reason: collision with root package name */
    public g75.s f350928g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f350929h;

    /* renamed from: i, reason: collision with root package name */
    public final i75.a f350930i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f350931m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f350932n;

    /* renamed from: o, reason: collision with root package name */
    public final j75.k f350933o;

    public r(java.util.Set set, g75.z zVar, java.lang.String str, g75.s sVar, boolean z17) {
        this.f350925d = set;
        this.f350926e = zVar;
        this.f350927f = str;
        this.f350928g = sVar;
        this.f350929h = z17;
        this.f350930i = new i75.a(this);
        jz5.g b17 = jz5.h.b(new g75.q(this));
        this.f350931m = b17;
        this.f350932n = new java.util.HashSet();
        this.f350933o = new j75.k(zVar, this, "MicroMsg.Pipeline.Pipeline", (com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) b17).mo141623x754a37bb());
    }

    public static final void a(g75.r rVar) {
        java.util.HashSet hashSet;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Pipeline.Pipeline", "onCreate " + rVar.hashCode());
        rVar.f350930i.d();
        java.util.Iterator it = rVar.f350925d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = rVar.f350932n;
            if (!hasNext) {
                try {
                    break;
                } catch (java.lang.IllegalArgumentException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Pipeline.Pipeline", e17, "onCreate", new java.lang.Object[0]);
                    g75.z zVar = new g75.z();
                    zVar.l("ErrCode", -1);
                    rVar.e(-1, zVar);
                    rVar.c();
                    return;
                }
            }
            hashSet.add((g75.t) ((java.lang.Class) it.next()).getConstructor(g75.r.class).newInstance(rVar));
        }
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            ((g75.t) it6.next()).getClass();
        }
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            ((g75.t) it7.next()).c();
        }
        java.util.Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            ((g75.t) it8.next()).d();
        }
    }

    public static final void b(g75.r rVar) {
        rVar.getClass();
        try {
            java.util.Iterator it = rVar.f350932n.iterator();
            while (it.hasNext()) {
                ((g75.t) it.next()).e();
            }
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Pipeline.Pipeline", e17, "onDestroy", new java.lang.Object[0]);
            g75.z zVar = new g75.z();
            zVar.l("ErrCode", -2);
            rVar.e(-1, zVar);
            rVar.c();
        }
        rVar.f350930i.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Pipeline.Pipeline", "onDestroy " + rVar.hashCode());
    }

    public final void c() {
        if (this.f350929h) {
            d75.b.g(new g75.l(this));
        } else {
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) this.f350931m).mo141623x754a37bb(), null, new g75.m(this, null), 1, null);
        }
    }

    public final g75.r d() {
        if (this.f350929h) {
            d75.b.g(new g75.n(this));
        } else {
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) this.f350931m).mo141623x754a37bb(), null, new g75.o(this, null), 1, null);
        }
        return this;
    }

    public final void e(int i17, g75.z data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult ");
        sb6.append(hashCode());
        sb6.append(' ');
        java.lang.String str = this.f350927f;
        sb6.append(str);
        sb6.append(' ');
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Pipeline.Pipeline", sb6.toString());
        g75.s sVar = this.f350928g;
        if (sVar != null) {
            sVar.a(new g75.x(str, i17, data));
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f350930i;
    }

    public /* synthetic */ r(java.util.Set set, g75.z zVar, java.lang.String str, g75.s sVar, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(set, zVar, str, (i17 & 8) != 0 ? null : sVar, (i17 & 16) != 0 ? false : z17);
    }
}
