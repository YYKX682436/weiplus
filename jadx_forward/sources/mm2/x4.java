package mm2;

/* loaded from: classes3.dex */
public final class x4 extends mm2.e {
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 B;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f411061f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f411062g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f411063h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f411064i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f411065m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f411066n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f411067o;

    /* renamed from: p, reason: collision with root package name */
    public dk2.zf f411068p;

    /* renamed from: q, reason: collision with root package name */
    public int f411069q;

    /* renamed from: r, reason: collision with root package name */
    public int f411070r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f411071s;

    /* renamed from: t, reason: collision with root package name */
    public long f411072t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f411073u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f411074v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f411075w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f411076x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f411077y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f411078z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f411061f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f411062g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f411063h = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f411064i = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f411065m = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f411066n = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f411067o = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f411069q = -1;
        this.f411070r = -1;
        this.f411071s = true;
        this.f411074v = new java.util.LinkedHashSet();
        this.f411075w = new java.util.LinkedHashMap();
        this.f411077y = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f411078z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.A = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
    }

    public final boolean N6(java.lang.String msg, java.util.List variantMessages, java.lang.String logTag) {
        java.lang.Object obj;
        dk2.zf zfVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(variantMessages, "variantMessages");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logTag, "logTag");
        java.util.List list = this.f411061f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        synchronized (list) {
            java.util.List list2 = this.f411061f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
            java.util.ListIterator listIterator = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                dk2.zf zfVar2 = (dk2.zf) obj;
                if (zfVar2.mo124533xfb85f7b0() == 10001 && kz5.n0.O(variantMessages, zfVar2.j())) {
                    break;
                }
            }
            zfVar = (dk2.zf) obj;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zfVar != null ? zfVar.j() : null, msg)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveMsgSlice", logTag + " skip duplicate, msg:" + msg);
        return true;
    }

    public final void O6(dk2.zf comment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        try {
            int indexOf = this.f411061f.indexOf(comment);
            java.util.List list = this.f411061f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            synchronized (list) {
                if (indexOf != -1) {
                    this.f411061f.remove(comment);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMFinder.LiveMsgSlice", e17.toString());
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        this.f411061f.clear();
        this.f411062g.clear();
        this.f411064i.clear();
        this.f411066n.clear();
        this.f411065m.clear();
        this.f411074v.clear();
        ((java.util.LinkedHashMap) this.f411075w).clear();
        this.f411063h.clear();
        this.f411077y.clear();
        this.f411071s = true;
        this.f411072t = 0L;
        this.f411076x = false;
    }
}
