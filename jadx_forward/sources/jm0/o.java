package jm0;

/* loaded from: classes5.dex */
public abstract class o extends i95.w implements p012xc85e97e9.p093xedfae76a.m1, p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: f, reason: collision with root package name */
    public jm0.p f381811f;

    /* renamed from: g, reason: collision with root package name */
    public jm0.r f381812g;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f381809d = jz5.h.b(jm0.n.f381808d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f381810e = jz5.h.b(new jm0.m(this));

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f381813h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean[] f381814i = {java.lang.Boolean.FALSE};

    public final j75.f Ai() {
        m134976x2690a4ac();
        jm0.p pVar = this.f381811f;
        j75.f fVar = pVar != null ? pVar.f381815f : null;
        if (fVar instanceof j75.f) {
            return fVar;
        }
        return null;
    }

    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a Bi() {
        m134976x2690a4ac();
        jm0.r rVar = this.f381812g;
        if (rVar != null) {
            return (com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) rVar.f381818f).mo141623x754a37bb();
        }
        return null;
    }

    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
    }

    public void Ni(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public void Ri(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public void Ui(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public void Vi() {
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public final p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return (jm0.s) ((jz5.n) this.f381810e).mo141623x754a37bb();
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public final p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        return (p012xc85e97e9.p093xedfae76a.l1) ((jz5.n) this.f381809d).mo141623x754a37bb();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public final void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wi(), "onAccountInitialized start");
        Ui(context);
        java.util.HashSet hashSet = this.f381813h;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((jm0.g) it.next()).R6(context);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wi(), "onAccountInitialized before end");
        Ni(context);
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            ((jm0.g) it6.next()).P6(context);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wi(), "onAccountInitialized init end");
        ((jm0.s) ((jz5.n) this.f381810e).mo141623x754a37bb()).d();
        Ri(context);
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            ((jm0.g) it7.next()).Q6(context);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wi(), "onAccountInitialized after end");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public final void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f381814i[0].booleanValue()) {
            synchronized (this.f381814i) {
                if (this.f381814i[0].booleanValue()) {
                    java.util.Iterator it = this.f381813h.iterator();
                    while (it.hasNext()) {
                        ((jm0.g) it.next()).S6();
                    }
                    this.f381813h.clear();
                    Vi();
                    getViewModel().a();
                    ((jm0.s) ((jz5.n) this.f381810e).mo141623x754a37bb()).e();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wi(), "onAccountRelease");
                    this.f381814i[0] = java.lang.Boolean.FALSE;
                }
            }
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!this.f381814i[0].booleanValue()) {
            synchronized (this.f381814i) {
                if (!this.f381814i[0].booleanValue()) {
                    java.util.HashSet<java.lang.Class> hashSet = new java.util.HashSet();
                    Di(hashSet);
                    java.lang.String wi6 = wi();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("create component:");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((java.lang.Class) it.next()).getName());
                    }
                    sb6.append(arrayList);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wi6, sb6.toString());
                    for (java.lang.Class modelClass : hashSet) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
                        if (!jm0.g.class.isAssignableFrom(modelClass)) {
                            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
                        }
                        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(modelClass);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                        jm0.g gVar = (jm0.g) a17;
                        this.f381813h.add(gVar);
                        if (gVar instanceof jm0.p) {
                            this.f381811f = (jm0.p) gVar;
                        }
                        if (gVar instanceof jm0.r) {
                            this.f381812g = (jm0.r) gVar;
                        }
                    }
                    this.f381814i[0] = java.lang.Boolean.TRUE;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wi(), "doCreate start");
        java.util.Iterator it6 = this.f381813h.iterator();
        while (it6.hasNext()) {
            ((jm0.g) it6.next()).getClass();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wi(), "doCreate before end");
        java.util.Iterator it7 = this.f381813h.iterator();
        while (it7.hasNext()) {
            ((jm0.g) it7.next()).N6(context);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wi(), "doCreate end");
        java.util.Iterator it8 = this.f381813h.iterator();
        while (it8.hasNext()) {
            ((jm0.g) it8.next()).getClass();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wi(), "doCreate after end");
    }

    public java.lang.String wi() {
        return "MicroMsg.Mvvm.MvvmPlugin";
    }
}
