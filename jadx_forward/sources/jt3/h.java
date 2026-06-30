package jt3;

/* loaded from: classes10.dex */
public final class h implements it3.y {

    /* renamed from: l, reason: collision with root package name */
    public static final jt3.b f383161l = new jt3.b(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f383162a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f383163b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f383164c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f383165d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f383166e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f383167f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce f383168g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f383169h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f383170i;

    /* renamed from: j, reason: collision with root package name */
    public int f383171j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f383172k;

    public h(android.content.Context context, android.view.ViewGroup root, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 provider, int i17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        this.f383162a = context;
        this.f383163b = root;
        this.f383164c = provider;
        this.f383165d = bundle;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f383166e = sparseArray;
        this.f383167f = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.f383171j = -2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        sparseArray.put(0, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e.class);
        if (provider.S) {
            sparseArray.put(1, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17014x80a0845e.class);
        } else {
            sparseArray.put(1, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285.class);
        }
        sparseArray.put(2, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17016x4a873f55.class);
        sparseArray.put(5, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17027xff3f401c.class);
        java.util.HashMap hashMap = provider.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashMap);
        if (!hashMap.isEmpty()) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add route key:");
                java.lang.Object key = entry.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(key, "null cannot be cast to non-null type kotlin.Int");
                sb6.append(((java.lang.Integer) key).intValue());
                sb6.append(" value:");
                sb6.append(entry.getValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", sb6.toString());
                android.util.SparseArray sparseArray2 = this.f383166e;
                java.lang.Object key2 = entry.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(key2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) key2).intValue();
                java.lang.Object value = entry.getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value, "null cannot be cast to non-null type kotlin.String");
                sparseArray2.put(intValue, java.lang.Class.forName((java.lang.String) value));
            }
        }
        nu3.m.f421762a.k(android.os.SystemClock.elapsedRealtime());
        android.util.SparseArray routeMap = this.f383166e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(routeMap, "routeMap");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setRouterMap");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{");
        int size = routeMap.size();
        for (int i18 = 0; i18 < size; i18++) {
            sb7.append(((java.lang.Class) routeMap.valueAt(i18)).getSimpleName());
            sb7.append("#");
        }
        sb7.append("}");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = nu3.m.f421763b;
        c6874x68a054db.f141922f = c6874x68a054db.b("RouterMap", sb7.toString(), true);
        if (i17 == 0) {
            this.f383169h = true;
            java.lang.Object obj = this.f383166e.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            c(0, (java.lang.Class) obj, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "setEnableRecordPage " + this.f383169h);
    }

    public final void b() {
        java.util.Map viewMap = this.f383167f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewMap, "viewMap");
        java.util.Iterator it = viewMap.entrySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce) ((java.util.Map.Entry) it.next()).getValue()).v();
        }
    }

    public final synchronized void c(int i17, java.lang.Class cls, boolean z17) {
        try {
            java.lang.Object newInstance = cls.getConstructor(android.content.Context.class, android.util.AttributeSet.class).newInstance(this.f383162a, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce) newInstance;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "loadViewFromClass key:" + i17 + " name:" + abstractC17010x26b2d1ce.getClass().getName());
            abstractC17010x26b2d1ce.p(this, this.f383164c, this.f383165d);
            this.f383167f.put(java.lang.Integer.valueOf(i17), abstractC17010x26b2d1ce);
            this.f383163b.addView(abstractC17010x26b2d1ce, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (!z17) {
                abstractC17010x26b2d1ce.mo9067x901b6914(8);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RecordUIRouter", e17, "", new java.lang.Object[0]);
        }
    }

    public final void d() {
        java.util.Map viewMap = this.f383167f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewMap, "viewMap");
        java.util.Iterator it = viewMap.entrySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce) ((java.util.Map.Entry) it.next()).getValue()).q();
        }
    }

    public void e(int i17, ct0.b bVar) {
        if (this.f383170i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "isFinishing toWhere:" + i17 + "  MediaCaptureInfo:" + bVar);
            return;
        }
        int a17 = f383161l.a(i17, bVar != null ? bVar.f303747k : null, bVar != null ? bVar.f303748l : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "toWhere:" + i17 + " real:" + a17 + " current:" + this.f383171j + " MediaCaptureInfo:" + bVar);
        if (a17 == this.f383171j) {
            return;
        }
        this.f383171j = a17;
        this.f383172k = true;
        ((ku5.t0) ku5.t0.f394148d).B(new jt3.g(a17, this, bVar, i17));
    }
}
