package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f151616a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f151617b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f151618c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f151619d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f151620e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f151621f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f151622g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f151623h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f151624i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f151625j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.p f151626k;

    /* renamed from: l, reason: collision with root package name */
    public az0.d f151627l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f151628m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f151629n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f151630o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f151631p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f151632q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 f151633r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b7 f151634s;

    /* renamed from: t, reason: collision with root package name */
    public final int f151635t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f151636u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f151637v;

    public m7(p3325xe03a0797.p3326xc267989b.y0 asyncJobScope, java.util.List defaultTemplateList, java.util.List topTemplate, boolean z17, boolean z18, boolean z19, boolean z27, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i18 = i17 & 4;
        kz5.p0 p0Var = kz5.p0.f395529d;
        topTemplate = i18 != 0 ? p0Var : topTemplate;
        z17 = (i17 & 8) != 0 ? true : z17;
        z18 = (i17 & 16) != 0 ? true : z18;
        z19 = (i17 & 32) != 0 ? false : z19;
        z27 = (i17 & 64) != 0 ? false : z27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(asyncJobScope, "asyncJobScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultTemplateList, "defaultTemplateList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topTemplate, "topTemplate");
        this.f151616a = asyncJobScope;
        this.f151617b = defaultTemplateList;
        this.f151618c = topTemplate;
        this.f151619d = z17;
        this.f151620e = z18;
        this.f151621f = z19;
        this.f151622g = z27;
        this.f151623h = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k7.f151570d;
        this.f151624i = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.j7.f151544d;
        this.f151625j = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.l7.f151593d;
        this.f151626k = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e7(null);
        this.f151628m = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.d7.f151468d;
        this.f151629n = n0.s4.c(p0Var, null, 2, null);
        this.f151630o = new java.util.LinkedList();
        this.f151631p = new java.util.ArrayList();
        this.f151635t = 3;
        if (!defaultTemplateList.isEmpty()) {
            g(null);
        }
        this.f151637v = new java.util.HashSet();
    }

    public final java.lang.String a() {
        java.lang.String str;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = this.f151633r;
        return (m5Var == null || (str = m5Var.f151610a) == null) ? "" : str;
    }

    public final java.util.List b() {
        return (java.util.List) this.f151629n.mo128745x754a37bb();
    }

    public final void c(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsTemplate.SnsTemplateListState", "empty template list");
        } else {
            this.f151632q = true;
        }
        java.util.List list2 = this.f151631p;
        list2.clear();
        list2.addAll(list);
        g(null);
    }

    public final void d(java.util.List list) {
        java.lang.Object obj;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 c4121xb12fb285 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285) obj2;
            java.util.List list2 = this.f151617b;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.rz6) it.next()).f466853d, c4121xb12fb285.m33907x3bfa570b())) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 c4121xb12fb2852 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285) it6.next();
            java.util.Iterator it7 = ((java.util.ArrayList) this.f151631p).iterator();
            while (true) {
                if (it7.hasNext()) {
                    obj = it7.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5) obj).f151610a, c4121xb12fb2852.m33907x3bfa570b())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5 k5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5) obj;
            if (k5Var == null) {
                k5Var = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151558m.b(c4121xb12fb2852, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151559n);
            }
            arrayList2.add(k5Var);
        }
        c(arrayList2);
    }

    public final void e(java.lang.String templateId) {
        java.lang.Object obj;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "updateCurSelectTemplate: " + templateId + ", curSelectedId: " + a());
        java.util.Iterator it = b().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj2).f151610a, a())) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj2;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.r rVar = m5Var != null ? m5Var.f151611b : null;
        if (rVar != null) {
            rVar.b(false);
        }
        java.util.Iterator it6 = b().iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) next).f151610a, templateId)) {
                obj = next;
                break;
            }
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var2 = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj;
        if (m5Var2 != null) {
            m5Var2.f151611b.b(true);
            this.f151633r = m5Var2;
        }
    }

    public final void f(java.lang.String templateId) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        java.util.Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj).f151611b.a()) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.r rVar = m5Var != null ? m5Var.f151611b : null;
        if (rVar != null) {
            rVar.b(false);
        }
        e(templateId);
    }

    public final void g(mz0.a aVar) {
        java.lang.Object obj;
        java.lang.String str;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5 c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "updateTemplateList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTemplateList defaultTemplateList: ");
        java.util.List<r45.rz6> list = this.f151617b;
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", sb6.toString());
        arrayList.addAll(this.f151618c);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.rz6 rz6Var : list) {
            if (aVar == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rz6Var.f466853d, aVar.f414404a)) {
                c17 = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151558m.c(rz6Var);
            } else {
                c17 = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151558m.c(rz6Var);
                c17.f151568l = aVar.f414405b;
            }
            arrayList2.add(c17);
        }
        arrayList.addAll(arrayList2);
        if (this.f151632q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "add homepage item");
            arrayList.addAll(this.f151631p);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "add loading item");
            for (int i17 = 0; i17 < this.f151635t; i17++) {
                arrayList.add(new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.l5());
            }
        }
        java.util.LinkedList linkedList = this.f151630o;
        if (!linkedList.isEmpty()) {
            arrayList.add(new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.f5());
            arrayList.addAll(linkedList);
        }
        if (this.f151620e) {
            arrayList.add(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.h5.f151516e);
        }
        if (this.f151619d) {
            arrayList.add(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.g5.f151502e);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (hashSet.add(((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj2).f151610a)) {
                arrayList3.add(obj2);
            }
        }
        this.f151629n.mo148714x53d8522f(arrayList3);
        if (a().length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "updateTemplateList curSelectedItemId is null");
            java.util.Iterator it = b().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj).f151612c) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) obj;
            if (m5Var == null || (str = m5Var.f151610a) == null) {
                return;
            }
            e(str);
        }
    }
}
