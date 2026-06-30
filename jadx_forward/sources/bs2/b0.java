package bs2;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f105338a;

    /* renamed from: b, reason: collision with root package name */
    public db2.c3 f105339b;

    /* renamed from: c, reason: collision with root package name */
    public bs2.h0 f105340c;

    /* renamed from: d, reason: collision with root package name */
    public bs2.f0 f105341d;

    /* renamed from: f, reason: collision with root package name */
    public long f105343f;

    /* renamed from: g, reason: collision with root package name */
    public long f105344g;

    /* renamed from: h, reason: collision with root package name */
    public long f105345h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f105346i;

    /* renamed from: j, reason: collision with root package name */
    public int f105347j;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f105349l;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f105342e = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f105348k = new java.util.concurrent.ConcurrentHashMap();

    public b0(bs2.n1 n1Var, int i17) {
        this.f105349l = n1Var;
        this.f105338a = i17;
        r45.gt2 b17 = b();
        java.util.LinkedList m75941xfb821914 = b17.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCaches(...)");
        java.util.ArrayList<r45.ft2> arrayList = new java.util.ArrayList();
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.ft2) next).m75939xb282bd08(0) == this.f105338a) {
                arrayList.add(next);
            }
        }
        for (r45.ft2 ft2Var : arrayList) {
            this.f105348k.put(java.lang.Integer.valueOf(ft2Var.m75939xb282bd08(2)), new bs2.c0(ft2Var.m75942xfb822ef2(1)));
        }
        a(b17, "build");
        c(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_PRELOAD_FAIL_RETRY_CNT_INT_SYNC, 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f105349l.f105442c, "init: cache, cgiFailRetryCnt=" + this.f105347j);
    }

    public final void a(r45.gt2 gt2Var, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gt2Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.lang.String str = this.f105349l.f105442c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderRefreshPreloadCacheList#print] tag=");
        sb6.append(tag);
        sb6.append(' ');
        java.util.LinkedList m75941xfb821914 = gt2Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCaches(...)");
        java.util.ArrayList<r45.ft2> arrayList = new java.util.ArrayList();
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.ft2) next).m75939xb282bd08(0) == this.f105338a) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (r45.ft2 ft2Var : arrayList) {
            arrayList2.add(ft2Var.m75939xb282bd08(0) + ':' + ft2Var.m75939xb282bd08(2) + "=>" + ft2Var.m75942xfb822ef2(1));
        }
        sb6.append(arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }

    public final r45.gt2 b() {
        r45.gt2 gt2Var = new r45.gt2();
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CACHE_STRING, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) m17;
        if (str.length() > 0) {
            try {
                gt2Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f105349l.f105442c, e17, "", new java.lang.Object[0]);
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CACHE_STRING, null);
            }
        }
        return gt2Var;
    }

    public final void c(int i17) {
        if (this.f105347j != i17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_PRELOAD_FAIL_RETRY_CNT_INT_SYNC, java.lang.Integer.valueOf(i17));
        }
        this.f105347j = i17;
    }

    /* renamed from: toString */
    public java.lang.String m11093x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(this.f105340c);
        sb6.append(", resp=");
        db2.c3 c3Var = this.f105339b;
        sb6.append(c3Var != null ? java.lang.Integer.valueOf(c3Var.hashCode()) : null);
        sb6.append(", lastTime=");
        sb6.append(this.f105343f);
        sb6.append(", lastRedDotPreloadTime=");
        sb6.append(this.f105344g);
        sb6.append(", overCount=");
        sb6.append(this.f105345h);
        sb6.append(", recycledList=");
        java.util.LinkedList linkedList = this.f105342e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()));
        }
        sb6.append(arrayList);
        sb6.append(']');
        return sb6.toString();
    }
}
