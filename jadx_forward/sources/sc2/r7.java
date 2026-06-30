package sc2;

/* loaded from: classes2.dex */
public abstract class r7 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: t */
    public static final sc2.p6 f487736t = new sc2.p6(null);

    /* renamed from: u */
    public static final float f487737u = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);

    /* renamed from: v */
    public static final float f487738v = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);

    /* renamed from: w */
    public static final java.util.HashMap f487739w = new java.util.HashMap();

    /* renamed from: x */
    public static final java.lang.String f487740x = "priority_group";

    /* renamed from: d */
    public final jz5.g f487741d;

    /* renamed from: e */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f487742e;

    /* renamed from: f */
    public final java.util.HashMap f487743f;

    /* renamed from: g */
    public final jz5.g f487744g;

    /* renamed from: h */
    public final int f487745h;

    /* renamed from: i */
    public final int f487746i;

    /* renamed from: m */
    public final int f487747m;

    /* renamed from: n */
    public yz5.l f487748n;

    /* renamed from: o */
    public final android.util.SparseIntArray f487749o;

    /* renamed from: p */
    public final java.util.concurrent.ConcurrentHashMap f487750p;

    /* renamed from: q */
    public final java.util.concurrent.ConcurrentHashMap f487751q;

    /* renamed from: r */
    public final java.util.HashMap f487752r;

    /* renamed from: s */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f487753s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f487741d = jz5.h.b(sc2.a7.f487297d);
        this.f487742e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f487743f = new java.util.HashMap();
        this.f487744g = jz5.h.b(new sc2.o7(this));
        this.f487745h = com.p314xaae8f345.mm.R.id.eeo;
        this.f487746i = com.p314xaae8f345.mm.R.id.eel;
        this.f487747m = com.p314xaae8f345.mm.R.id.eek;
        this.f487749o = new android.util.SparseIntArray();
        this.f487750p = new java.util.concurrent.ConcurrentHashMap();
        this.f487751q = new java.util.concurrent.ConcurrentHashMap();
        this.f487752r = new java.util.HashMap();
        this.f487753s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(5);
    }

    public static final xc2.p0 O6(sc2.r7 r7Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str, xc2.t tVar, int i17, long j17, xc2.c1 c1Var) {
        java.lang.Object obj;
        r7Var.getClass();
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534777f = abstractC14490x69736cb5;
        p0Var.f534780i = str;
        p0Var.f534789r = tVar.f534834c;
        p0Var.f534790s = i17;
        p0Var.f534778g = j17;
        java.lang.String str2 = tVar.f534837f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        p0Var.f534787p = str2;
        p0Var.T = c1Var;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var.m75939xb282bd08(2) == i17 && wf6Var.m75939xb282bd08(1) == tVar.f534834c) {
                break;
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj;
        int m75939xb282bd08 = wf6Var2 != null ? wf6Var2.m75939xb282bd08(11) : 0;
        p0Var.f534792u = m75939xb282bd08;
        p0Var.f534791t = m75939xb282bd08 * 1000;
        p0Var.f534797z = wf6Var2 != null && wf6Var2.m75939xb282bd08(12) == 1;
        p0Var.B = wf6Var2 != null ? wf6Var2.m75939xb282bd08(20) : 0;
        p0Var.E = (wf6Var2 != null ? wf6Var2.m75939xb282bd08(14) : 0) / 1000;
        p0Var.F = (wf6Var2 != null ? wf6Var2.m75939xb282bd08(15) : 0) / 1000;
        if (wf6Var2 != null) {
        }
        java.util.HashMap hashMap = f487739w;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = r7Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = p0Var.f534777f;
        sc2.w6 w6Var = new sc2.w6(abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.mo2128x1ed62e84() : 0L, i18, p0Var.f534789r, p0Var.f534790s);
        java.lang.Object obj2 = hashMap.get(w6Var);
        if (obj2 == null) {
            obj2 = new sc2.q8();
            hashMap.put(w6Var, obj2);
        }
        p0Var.f534766J = (sc2.q8) obj2;
        return p0Var;
    }

    public static final xc2.k0 P6(sc2.r7 r7Var) {
        return (xc2.k0) ((jz5.n) r7Var.f487741d).mo141623x754a37bb();
    }

    public static final android.view.View Q6(sc2.r7 r7Var, ad2.j jVar, android.view.ViewGroup viewGroup, int i17, boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, int i18, int i19) {
        android.view.View view;
        xc2.p0 p0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622;
        r7Var.getClass();
        sc2.u7 u7Var = (sc2.u7) jVar;
        u7Var.getClass();
        int b17 = sc2.a8.G.b(i17, u7Var.f487822a);
        if (b17 > 0) {
            if (z17) {
                java.lang.String m76501xf2fd2296 = c19786x6a1e2862.m76501xf2fd2296();
                if (m76501xf2fd2296 == null) {
                    m76501xf2fd2296 = "";
                }
                int childCount = viewGroup.getChildCount();
                int i27 = 0;
                while (true) {
                    if (i27 >= childCount) {
                        view = null;
                        break;
                    }
                    view = viewGroup.getChildAt(i27);
                    java.lang.Object tag = view.getTag(r7Var.f487745h);
                    ad2.h hVar = tag instanceof ad2.h ? (ad2.h) tag : null;
                    java.lang.String m76501xf2fd22962 = (hVar == null || (p0Var = hVar.f84680h) == null || (c19786x6a1e28622 = p0Var.f534767a) == null) ? null : c19786x6a1e28622.m76501xf2fd2296();
                    java.lang.Object tag2 = view.getTag(r7Var.f487746i);
                    java.lang.Integer num = tag2 instanceof java.lang.Integer ? (java.lang.Integer) tag2 : null;
                    if (i17 == (num != null ? num.intValue() : -1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76501xf2fd22962, m76501xf2fd2296)) {
                        break;
                    }
                    i27++;
                }
                if (view == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.BaseAdFeedJumperUIC", "[getJumperView] containLayout:" + viewGroup.hashCode() + " layoutChild is null}");
                }
            } else {
                view = null;
            }
            if (view == null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) r7Var.f487743f.get(java.lang.Integer.valueOf(i17));
                r0 = linkedList != null ? (android.view.View) linkedList.poll() : null;
                if (r0 == null) {
                    r0 = com.p314xaae8f345.mm.ui.id.b(r7Var.m80379x76847179()).inflate(b17, viewGroup, false);
                }
            } else {
                r0 = view;
            }
            if (i18 == 5) {
                if (i19 == 0) {
                    android.view.ViewGroup.LayoutParams layoutParams = r0.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin = (int) f487738v;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams2 = r0.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    ((android.widget.LinearLayout.LayoutParams) layoutParams2).topMargin = (int) f487737u;
                }
            }
            if (!z17) {
                viewGroup.addView(r0);
            }
        }
        return r0;
    }

    public static final ad2.h R6(sc2.r7 r7Var, android.view.View view, int i17, ad2.j jVar) {
        int i18 = r7Var.f487745h;
        java.lang.Object tag = view.getTag(i18);
        ad2.h hVar = tag instanceof ad2.h ? (ad2.h) tag : null;
        if (hVar != null) {
            return hVar;
        }
        sc2.u7 u7Var = (sc2.u7) jVar;
        u7Var.getClass();
        ad2.h a17 = sc2.a8.G.a(i17, u7Var.f487822a);
        if (a17 == null) {
            return null;
        }
        view.setTag(i18, a17);
        return a17;
    }

    public static /* synthetic */ int d7(sc2.r7 r7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, java.lang.String str, boolean z17, xc2.c1 c1Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBindView");
        }
        if ((i17 & 4) != 0) {
            str = "timeline";
        }
        java.lang.String str2 = str;
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 16) != 0) {
            c1Var = null;
        }
        return r7Var.b7(abstractC14490x69736cb5, s0Var, str2, z18, c1Var);
    }

    public boolean S6() {
        return true;
    }

    public final void T6(in5.s0 holder, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ka).mo141623x754a37bb()).r()).booleanValue()) {
            ad2.h hVar = (ad2.h) this.f487750p.get(java.lang.Integer.valueOf(holder.hashCode()));
            if (hVar != null) {
                callback.mo146xb9724478(hVar);
                return;
            }
            return;
        }
        ad2.i iVar = (ad2.i) this.f487751q.get(java.lang.Integer.valueOf(holder.hashCode()));
        if (iVar != null) {
            java.util.Iterator it = iVar.f84692d.entrySet().iterator();
            while (it.hasNext()) {
                callback.mo146xb9724478((ad2.h) ((java.util.Map.Entry) it.next()).getValue());
            }
        }
    }

    public final void U6(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ka).mo141623x754a37bb()).r()).booleanValue()) {
            java.util.Iterator it = new java.util.HashMap(this.f487750p).entrySet().iterator();
            while (it.hasNext()) {
                ad2.h hVar = (ad2.h) ((java.util.Map.Entry) it.next()).getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
                callback.mo146xb9724478(hVar);
            }
            return;
        }
        java.util.Iterator it6 = new java.util.HashMap(this.f487751q).entrySet().iterator();
        while (it6.hasNext()) {
            java.util.Iterator it7 = new java.util.HashMap(((ad2.i) ((java.util.Map.Entry) it6.next()).getValue()).f84692d).entrySet().iterator();
            while (it7.hasNext()) {
                ad2.h hVar2 = (ad2.h) ((java.util.Map.Entry) it7.next()).getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
                callback.mo146xb9724478(hVar2);
            }
        }
    }

    public final r45.i16 V6(long j17) {
        sc2.x6 x6Var = (sc2.x6) this.f487753s.b(java.lang.Long.valueOf(j17));
        if (x6Var != null) {
            return x6Var.f487901b;
        }
        return null;
    }

    public abstract xc2.d1 W6(xc2.p0 p0Var);

    public abstract java.util.Map X6();

    public abstract xc2.z2 Y6(xc2.p0 p0Var, int i17);

    public final void Z6(ad2.h observer, in5.s0 holder, android.view.View view, xc2.p0 infoEx, r45.wf6 wf6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initObserver] cur:[");
        sb6.append(infoEx.f534780i);
        sb6.append(':');
        sb6.append(pm0.v.u(mo2128x1ed62e84));
        sb6.append(':');
        sb6.append(holder.hashCode());
        sb6.append(':');
        sb6.append(view.hashCode());
        sb6.append(':');
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        sb6.append(c19786x6a1e2862.hashCode());
        sb6.append("] last:[");
        sb6.append(observer.f84677e);
        sb6.append(':');
        sb6.append(pm0.v.u(observer.f84678f));
        sb6.append(':');
        in5.s0 s0Var = observer.f84681i;
        sb6.append(s0Var != null ? s0Var.hashCode() : 0);
        sb6.append(':');
        android.view.View view2 = observer.f84676d;
        sb6.append(view2 != null ? view2.hashCode() : 0);
        sb6.append(':');
        xc2.p0 p0Var = observer.f84680h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = p0Var != null ? p0Var.f534767a : null;
        sb6.append(c19786x6a1e28622 != null ? c19786x6a1e28622.hashCode() : 0);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", sb6.toString());
        observer.f84681i = holder;
        observer.f84676d = view;
        observer.f84682m = wf6Var;
        xc2.p0 p0Var2 = observer.f84680h;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p0Var2 != null ? p0Var2.f534767a : null, c19786x6a1e2862);
        boolean z17 = observer.f84684o == null;
        boolean z18 = observer.f84685p == null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "[setHandlers] isSameJumpInfo:" + b17 + " eventHandlerIsNull:" + z17 + " cacheHandlerIsNull:" + z18);
        if (!b17 || z17) {
            r45.wf6 wf6Var2 = observer.f84682m;
            observer.f84684o = Y6(infoEx, wf6Var2 != null ? wf6Var2.m75939xb282bd08(2) : -1);
        }
        if (!b17 || z18) {
            observer.f84685p = W6(infoEx);
        }
        java.lang.String str = infoEx.f534780i;
        if (str == null) {
            str = "";
        }
        observer.f84677e = str;
        observer.f84678f = mo2128x1ed62e84;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = infoEx.f534777f;
        observer.f84679g = abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.w() : null;
        observer.f84680h = infoEx;
        observer.f84683n = c19786x6a1e2862.m76480xe2ee1ca3();
        c19786x6a1e2862.m76503x92bc3c07();
    }

    public void a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View view, xc2.p0 infoEx, java.lang.String source, ad2.h observer) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        r45.bo5 bo5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (view == null) {
            return;
        }
        sc2.q8 q8Var = infoEx.f534766J;
        if (!(q8Var != null && q8Var.f487710a) && infoEx.f534791t > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC", "onAfterBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC", "onAfterBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (infoEx.f534789r == 10) {
            int t17 = hc2.f1.t(view);
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = infoEx.f534767a.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator<T> it = m76521x7528c3fb.iterator();
            while (true) {
                marginLayoutParams = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.wf6) obj).m75939xb282bd08(2) == infoEx.f534790s) {
                        break;
                    }
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var == null || (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k)) == null || (bo5Var = (r45.bo5) wf6Var.m75936x14adae67(19)) == null) {
                return;
            }
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i17 = b17.x;
            int i18 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z17) {
                if (i18 >= i17) {
                    i17 = i18;
                }
                i18 = i17;
            }
            float m75939xb282bd08 = i18 * (bo5Var.m75939xb282bd08(1) / 100.0f);
            float measuredWidth = (c15196x85976f5f.getMeasuredWidth() * (bo5Var.m75939xb282bd08(0) / 100.0f)) - (t17 / 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "onAfterBindView viewWidth=" + t17 + " videoWidth=" + c15196x85976f5f.getMeasuredWidth() + " marginTop=" + m75939xb282bd08 + " marginLeft=" + measuredWidth);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = (int) m75939xb282bd08;
                marginLayoutParams2.leftMargin = (int) measuredWidth;
                marginLayoutParams = marginLayoutParams2;
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final int b7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, java.lang.String source, boolean z17, xc2.c1 c1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        long mo2128x1ed62e84 = feed.mo2128x1ed62e84();
        android.content.Context context = itemView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        if (!S6()) {
            f7(holder);
            h7(holder);
            return 0;
        }
        xc2.k0 k0Var = (xc2.k0) ((jz5.n) this.f487741d).mo141623x754a37bb();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.j0 W6 = k0Var.W6(mo2128x1ed62e84, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n, feed.w());
        int hashCode = holder.hashCode();
        int hashCode2 = W6.hashCode();
        android.util.SparseIntArray sparseIntArray = this.f487749o;
        if (!z17 && sparseIntArray.get(hashCode) == hashCode2) {
            return 2;
        }
        f7(holder);
        h7(holder);
        sc2.v6 v6Var = new sc2.v6(this, holder, feed, source, 0L, c1Var, 8, null);
        this.f487752r.put(java.lang.Integer.valueOf(hashCode), v6Var);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            pm0.v.y(W6, abstractActivityC21394xb3d2c0cf, v6Var);
        } else {
            itemView.post(new sc2.d7(W6, abstractActivityC21394xb3d2c0cf, v6Var));
        }
        sparseIntArray.put(hashCode, hashCode2);
        return 1;
    }

    public final void c7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, long j17, in5.s0 holder, java.lang.String source, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        feed.mo2128x1ed62e84();
        android.content.Context context = itemView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "[onBindView] holder:" + holder.hashCode() + ", position:" + i17 + " itemView:" + itemView.hashCode() + ", commentID:" + j17 + ", feedID:" + feed.getFeedObject().m59251x5db1b11());
        if (!S6()) {
            f7(holder);
            h7(holder);
            return;
        }
        xc2.k0 k0Var = (xc2.k0) ((jz5.n) this.f487741d).mo141623x754a37bb();
        long mo2128x1ed62e84 = feed.mo2128x1ed62e84();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.j0 S6 = k0Var.S6(mo2128x1ed62e84, j17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n, feed.w());
        int hashCode = holder.hashCode();
        int hashCode2 = S6.hashCode();
        android.util.SparseIntArray sparseIntArray = this.f487749o;
        if (sparseIntArray.get(hashCode) == hashCode2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "[onBindView] same data hash, skip on bind");
            return;
        }
        f7(holder);
        h7(holder);
        sc2.v6 v6Var = new sc2.v6(this, holder, feed, source, j17, null, 16, null);
        this.f487752r.put(java.lang.Integer.valueOf(hashCode), v6Var);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            pm0.v.y(S6, abstractActivityC21394xb3d2c0cf, v6Var);
        } else {
            itemView.post(new sc2.c7(S6, abstractActivityC21394xb3d2c0cf, v6Var));
        }
        sparseIntArray.put(hashCode, hashCode2);
    }

    public final void e7(in5.s0 holder, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        T6(holder, new sc2.g7(holder, source, this));
    }

    public final void f7(in5.s0 holder) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int hashCode = holder.hashCode();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "[recycleCacheForViewHolder] holder:" + hashCode);
        this.f487749o.delete(hashCode);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f487750p;
        ad2.h hVar = (ad2.h) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode));
        if (hVar != null) {
            hVar.C(holder);
        }
        if (hVar != null && (view = hVar.f84676d) != null) {
            view.setTag(this.f487747m, "");
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(hashCode));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f487751q;
        ad2.i iVar = (ad2.i) concurrentHashMap2.get(java.lang.Integer.valueOf(hashCode));
        concurrentHashMap2.remove(java.lang.Integer.valueOf(hashCode));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[recycleCacheForViewHolder] holder:");
        sb6.append(holder.hashCode());
        sb6.append(" observerWrapper:");
        sb6.append(iVar != null ? java.lang.Integer.valueOf(iVar.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", sb6.toString());
        if (hVar != null) {
            long j17 = hVar.f84678f;
            xc2.p0 p0Var = hVar.f84680h;
            if (p0Var == null || (abstractC14490x69736cb5 = p0Var.f534777f) == null) {
                return;
            }
            long j18 = p0Var.f534778g;
            abstractC14490x69736cb5.getFeedObject().getFeedObject().m76752x103fd925();
            android.app.Activity m80379x76847179 = m80379x76847179();
            if ((m80379x76847179 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179 : null) == null) {
                return;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n;
            jz5.g gVar = this.f487741d;
            p012xc85e97e9.p093xedfae76a.j0 W6 = j18 == 0 ? ((xc2.k0) ((jz5.n) gVar).mo141623x754a37bb()).W6(j17, i17, hVar.f84679g) : ((xc2.k0) ((jz5.n) gVar).mo141623x754a37bb()).S6(j17, j18, i17, hVar.f84679g);
            sc2.v6 v6Var = (sc2.v6) this.f487752r.remove(java.lang.Integer.valueOf(hashCode));
            if (v6Var != null) {
                v6Var.f487846h = null;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
                    W6.mo522xb5bdeb7a(v6Var);
                } else {
                    new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new sc2.n7(W6, v6Var));
                }
            }
        }
    }

    public abstract java.util.Map g7();

    public final void h7(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.Iterator it = X6().entrySet().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.f3639x46306858.findViewById(((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue());
            if (viewGroup != null) {
                i7(holder, viewGroup, false);
                viewGroup.setVisibility(0);
            }
        }
    }

    public final void i7(in5.s0 s0Var, android.view.ViewGroup viewGroup, boolean z17) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            java.lang.Integer num = null;
            if (!z17) {
                java.lang.Object tag = childAt.getTag(this.f487746i);
                java.lang.Integer num2 = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
                int intValue = num2 != null ? num2.intValue() : -1;
                if (intValue >= 0) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
                    java.util.HashMap hashMap = this.f487743f;
                    java.lang.Object obj = hashMap.get(valueOf);
                    if (obj == null) {
                        obj = new java.util.LinkedList();
                        hashMap.put(valueOf, obj);
                    }
                    ((java.util.LinkedList) obj).add(childAt);
                }
            }
            ad2.i iVar = (ad2.i) this.f487751q.get(java.lang.Integer.valueOf(s0Var.hashCode()));
            if (iVar != null) {
                int hashCode = childAt.hashCode();
                ad2.h hVar = (ad2.h) iVar.f84692d.remove(java.lang.Integer.valueOf(hashCode));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[removeObserver] key:");
                sb6.append(hashCode);
                sb6.append(" observer:");
                sb6.append(hVar != null ? hVar.hashCode() : 0);
                sb6.append(" observerWrapper:");
                sb6.append(iVar.hashCode());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedJumperObserverWrapper", sb6.toString());
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[removeAndRecycleView] holder:");
            sb7.append(s0Var.hashCode());
            sb7.append(" view:");
            sb7.append(childAt.hashCode());
            sb7.append(" observerWrapper:");
            if (iVar != null) {
                num = java.lang.Integer.valueOf(iVar.hashCode());
            }
            sb7.append(num);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", sb7.toString());
        }
        if (z17) {
            return;
        }
        viewGroup.setTag(this.f487747m, "");
        viewGroup.removeAllViews();
    }

    public final void k7(in5.s0 holder) {
        boolean z17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        r45.cl2 cl2Var;
        r45.cl2 cl2Var2;
        r45.cl2 cl2Var3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null || !hc2.o0.D(abstractC14490x69736cb5.getFeedObject().getFeedObject(), false)) {
            return;
        }
        long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1.class);
        if (p1Var != null) {
            p1Var.P6(mo2128x1ed62e84);
        }
        android.app.Activity context2 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int m75939xb282bd08 = nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0;
        qc2.b bVar = qc2.b.f443042a;
        r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
        qc2.b.a(bVar, 3, mo2128x1ed62e84, m75939xb282bd08, (m76806xdef68064 == null || (cl2Var3 = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) == null) ? 0L : cl2Var3.m75942xfb822ef2(1), false, "", 0, 0, false, null, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1 p1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1.class);
        if (p1Var2 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed = abstractC14490x69736cb5.getFeedObject().getFeedObject();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
            r45.dm2 m76806xdef680642 = feed.m76806xdef68064();
            long m75942xfb822ef2 = (m76806xdef680642 == null || (cl2Var2 = (r45.cl2) m76806xdef680642.m75936x14adae67(4)) == null) ? 0L : cl2Var2.m75942xfb822ef2(1);
            r45.dm2 m76806xdef680643 = feed.m76806xdef68064();
            if (m76806xdef680643 == null || (cl2Var = (r45.cl2) m76806xdef680643.m75936x14adae67(4)) == null) {
                z17 = false;
                c19786x6a1e2862 = null;
            } else {
                z17 = false;
                c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) cl2Var.m75936x14adae67(0);
            }
            boolean z18 = c19786x6a1e2862 != null ? true : z17;
            if (hc2.o0.D(feed, z17) && m75942xfb822ef2 != 0) {
                java.lang.Boolean bool = (java.lang.Boolean) ((java.util.LinkedHashMap) p1Var2.f217032e).get(java.lang.Long.valueOf(feed.m76784x5db1b11()));
                boolean booleanValue = bool != null ? bool.booleanValue() : z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdTraceUIC", "checkHasReport feedId=" + pm0.v.u(feed.m76784x5db1b11()) + " hasReport=" + booleanValue + " hasComponent=" + z18);
                pm0.z.b(xy2.b.f539688b, "finderAdExposureReport", booleanValue, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o1(feed, m75942xfb822ef2, z18), 60, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1.f216642d.a();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed2 = abstractC14490x69736cb5.getFeedObject().getFeedObject();
        a17.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed2, "feed");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1.f216643e.contains(java.lang.Integer.valueOf(m75939xb282bd08))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1) a17.f216645a.get(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k1(feed2.m76784x5db1b11(), m75939xb282bd08));
            if (j1Var == null || j1Var.f216327f < 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdTraceMgr", "onFeedUnFocused return! unfocus without consume, dispatch and focus, commentScene=" + m75939xb282bd08 + " feedId=" + pm0.v.u(feed2.m76784x5db1b11()));
                return;
            }
            j1Var.f216327f = 4;
            j1Var.f216331j = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdTraceMgr", "onFeedUnFocused dispatchFeed=" + j1Var + " [unFocus-focus]=" + (j1Var.f216331j - j1Var.f216330i) + "ms");
        }
    }

    public final void l7(long j17, long j18) {
        sc2.x6 x6Var = (sc2.x6) this.f487753s.c(java.lang.Long.valueOf(j17), sc2.q7.f487709d);
        if (x6Var == null) {
            return;
        }
        x6Var.f487900a = j18;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        U6(new sc2.e7(newConfig));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f487742e.mo50302x6b17ad39(null);
        U6(sc2.i7.f487508d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f487741d = jz5.h.b(sc2.a7.f487297d);
        this.f487742e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f487743f = new java.util.HashMap();
        this.f487744g = jz5.h.b(new sc2.o7(this));
        this.f487745h = com.p314xaae8f345.mm.R.id.eeo;
        this.f487746i = com.p314xaae8f345.mm.R.id.eel;
        this.f487747m = com.p314xaae8f345.mm.R.id.eek;
        this.f487749o = new android.util.SparseIntArray();
        this.f487750p = new java.util.concurrent.ConcurrentHashMap();
        this.f487751q = new java.util.concurrent.ConcurrentHashMap();
        this.f487752r = new java.util.HashMap();
        this.f487753s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(5);
    }
}
