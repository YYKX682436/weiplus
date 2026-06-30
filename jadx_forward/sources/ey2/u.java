package ey2;

/* loaded from: classes2.dex */
public final class u extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final so2.n1 f339058d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.en2 f339059e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.qt2 f339060f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 f339061g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f339062h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f339063i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f339064m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f339065n;

    /* renamed from: o, reason: collision with root package name */
    public r45.dy0 f339066o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f339067p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f339068q;

    /* renamed from: r, reason: collision with root package name */
    public int f339069r;

    /* renamed from: s, reason: collision with root package name */
    public final int f339070s;

    /* renamed from: t, reason: collision with root package name */
    public long f339071t;

    /* renamed from: u, reason: collision with root package name */
    public int f339072u;

    /* renamed from: v, reason: collision with root package name */
    public int f339073v;

    /* renamed from: w, reason: collision with root package name */
    public int f339074w;

    /* renamed from: x, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f339075x;

    public u(so2.n1 item, r45.en2 en2Var, r45.qt2 contextObj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        en2Var = (i17 & 2) != 0 ? item.getFeedObject().m59240x7c94657b().m76811x50f46773() : en2Var;
        c13917xbf9dc158 = (i17 & 8) != 0 ? null : c13917xbf9dc158;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f339058d = item;
        this.f339059e = en2Var;
        this.f339060f = contextObj;
        this.f339061g = c13917xbf9dc158;
        this.f339062h = "Finder." + ey2.u.class.getSimpleName() + "_@" + hashCode();
        this.f339067p = jz5.h.b(ey2.t.f339034d);
        this.f339068q = new java.lang.Object();
        this.f339069r = -1;
        this.f339070s = 3;
        this.f339074w = -1;
        this.f339075x = new p012xc85e97e9.p093xedfae76a.j0(new jz5.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa(null, 1, null), new ey2.m(new e06.k(0, 0), ey2.n.f338967f)));
    }

    public final void N6(int i17) {
        jz5.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa;
        this.f339069r = i17;
        if (this.f339065n || this.f339064m || (lVar = (jz5.l) this.f339075x.mo3195x754a37bb()) == null || (c13920xa5f564aa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar.f384366d) == null || i17 < c13920xa5f564aa.size() - this.f339070s) {
            return;
        }
        this.f339065n = true;
        Q6();
    }

    public final java.lang.String O6() {
        r45.ey0 ey0Var;
        so2.n1 item = this.f339058d;
        java.lang.Object obj = null;
        if (item instanceof so2.n1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
            long mo2128x1ed62e84 = item.mo2128x1ed62e84();
            r45.en2 m76811x50f46773 = item.getFeedObject().m59240x7c94657b().m76811x50f46773();
            if (m76811x50f46773 != null && (ey0Var = (r45.ey0) m76811x50f46773.m75936x14adae67(11)) != null) {
                obj = java.lang.Integer.valueOf(ey0Var.m75939xb282bd08(0));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mo2128x1ed62e84);
            sb6.append('_');
            sb6.append(obj);
            obj = sb6.toString();
        }
        if (obj == null) {
            obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y(16);
        }
        return java.lang.String.valueOf(obj);
    }

    public final void P6(java.util.List list) {
        java.util.HashSet hashSet;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa3;
        synchronized (this.f339068q) {
            java.util.List y17 = q26.h0.y(q26.h0.r(q26.h0.o(q26.h0.j(kz5.n0.J(list), new ey2.o(this)), ey2.p.f338995d), new ey2.q(this)));
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(y17, 10));
            java.util.Iterator it = y17.iterator();
            while (it.hasNext()) {
                arrayList.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
            }
            jz5.l lVar = (jz5.l) this.f339075x.mo3195x754a37bb();
            if (lVar == null || (c13920xa5f564aa3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar.f384366d) == null) {
                hashSet = new java.util.HashSet();
            } else {
                hashSet = new java.util.HashSet();
                java.util.Iterator<T> it6 = c13920xa5f564aa3.iterator();
                while (it6.hasNext()) {
                    hashSet.add(java.lang.Long.valueOf(((so2.j5) it6.next()).mo2128x1ed62e84()));
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (!hashSet.contains(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj).mo2128x1ed62e84()))) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                jz5.l lVar2 = (jz5.l) this.f339075x.mo3195x754a37bb();
                int size = (lVar2 == null || (c13920xa5f564aa2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar2.f384366d) == null) ? 0 : c13920xa5f564aa2.size();
                jz5.l lVar3 = (jz5.l) this.f339075x.mo3195x754a37bb();
                if (lVar3 == null || (c13920xa5f564aa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar3.f384366d) == null) {
                    c13920xa5f564aa = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa(null, 1, null);
                }
                c13920xa5f564aa.addAll(arrayList2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f339062h, "mergeExternalData size: " + arrayList2.size());
                this.f339075x.mo7808x76db6cb1(new jz5.l(c13920xa5f564aa, new ey2.m(e06.p.m(size + 1, size + arrayList2.size()), ey2.n.f338966e)));
            } else {
                jz5.l lVar4 = (jz5.l) this.f339075x.mo3195x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa4 = lVar4 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar4.f384366d : null;
                if (c13920xa5f564aa4 != null) {
                    this.f339075x.mo7808x76db6cb1(new jz5.l(c13920xa5f564aa4, new ey2.m(e06.p.m(kz5.c0.h(c13920xa5f564aa4), kz5.c0.h(c13920xa5f564aa4)), ey2.n.f338965d)));
                }
            }
        }
    }

    public final boolean Q6() {
        java.lang.String str;
        r45.ey0 ey0Var;
        r45.ey0 ey0Var2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        r45.ey0 ey0Var3;
        int i17 = 0;
        if (this.f339064m) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestMoreFeedData columnid:");
        r45.en2 en2Var = this.f339059e;
        sb6.append((en2Var == null || (ey0Var3 = (r45.ey0) en2Var.m75936x14adae67(11)) == null) ? null : java.lang.Integer.valueOf(ey0Var3.m75939xb282bd08(0)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f339062h, sb6.toString());
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        cq.k kVar = (cq.k) i95.n0.c(cq.k.class);
        r45.qt2 qt2Var = this.f339060f;
        int m75939xb282bd08 = qt2Var.m75939xb282bd08(5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = this.f339061g;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m56357x44e5026c = c13917xbf9dc158 != null ? c13917xbf9dc158.m56357x44e5026c() : null;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f339063i;
        long m76784x5db1b11 = (en2Var == null || (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) en2Var.m75936x14adae67(7)) == null) ? 0L : c19792x256d2725.m76784x5db1b11();
        float floatValue = ((java.lang.Number) P6.f384367e).floatValue();
        float floatValue2 = ((java.lang.Number) P6.f384366d).floatValue();
        if (en2Var != null && (ey0Var2 = (r45.ey0) en2Var.m75936x14adae67(11)) != null) {
            i17 = ey0Var2.m75939xb282bd08(0);
        }
        int i18 = i17;
        if (en2Var == null || (ey0Var = (r45.ey0) en2Var.m75936x14adae67(11)) == null || (str = ey0Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        ey2.r rVar = new ey2.r(this);
        ey2.s sVar = ey2.s.f339029d;
        kVar.getClass();
        new bq.l(qt2Var, m56357x44e5026c, gVar, m76784x5db1b11, floatValue, floatValue2, 2, 4, i18, str2).l().q(new cq.h(rVar, sVar, kVar, m75939xb282bd08));
        return true;
    }

    /* renamed from: clear */
    public final void m128390x5a5b64d() {
        r45.ey0 ey0Var;
        java.lang.String O6 = O6();
        ey2.l0 l0Var = ey2.l0.f338955a;
        synchronized (ey2.l0.f338958d) {
            java.lang.String str = ey2.u.class.getCanonicalName() + '_' + O6;
            java.util.Map map = ey2.l0.f338956b;
            p012xc85e97e9.p093xedfae76a.l1 l1Var = (p012xc85e97e9.p093xedfae76a.l1) ((java.util.LinkedHashMap) map).get(str);
            if (l1Var != null) {
                l1Var.a();
            }
            map.remove(str);
            ey2.l0.f338957c.remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ey2.l0.f338959e, "clear combinedKey:" + str);
        }
        java.lang.String str2 = this.f339062h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clear columnid:");
        r45.en2 en2Var = this.f339059e;
        sb6.append((en2Var == null || (ey0Var = (r45.ey0) en2Var.m75936x14adae67(11)) == null) ? null : java.lang.Integer.valueOf(ey0Var.m75939xb282bd08(0)));
        sb6.append(" sharedKey:");
        sb6.append(O6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        m128390x5a5b64d();
    }
}
