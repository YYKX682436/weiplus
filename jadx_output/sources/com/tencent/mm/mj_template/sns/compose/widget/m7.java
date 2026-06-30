package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f70083a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f70084b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f70085c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f70086d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f70087e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f70088f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f70089g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f70090h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f70091i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f70092j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.p f70093k;

    /* renamed from: l, reason: collision with root package name */
    public az0.d f70094l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f70095m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f70096n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f70097o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f70098p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f70099q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.mj_template.sns.compose.widget.m5 f70100r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.mj_template.sns.compose.widget.b7 f70101s;

    /* renamed from: t, reason: collision with root package name */
    public final int f70102t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f70103u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f70104v;

    public m7(kotlinx.coroutines.y0 asyncJobScope, java.util.List defaultTemplateList, java.util.List topTemplate, boolean z17, boolean z18, boolean z19, boolean z27, int i17, kotlin.jvm.internal.i iVar) {
        int i18 = i17 & 4;
        kz5.p0 p0Var = kz5.p0.f313996d;
        topTemplate = i18 != 0 ? p0Var : topTemplate;
        z17 = (i17 & 8) != 0 ? true : z17;
        z18 = (i17 & 16) != 0 ? true : z18;
        z19 = (i17 & 32) != 0 ? false : z19;
        z27 = (i17 & 64) != 0 ? false : z27;
        kotlin.jvm.internal.o.g(asyncJobScope, "asyncJobScope");
        kotlin.jvm.internal.o.g(defaultTemplateList, "defaultTemplateList");
        kotlin.jvm.internal.o.g(topTemplate, "topTemplate");
        this.f70083a = asyncJobScope;
        this.f70084b = defaultTemplateList;
        this.f70085c = topTemplate;
        this.f70086d = z17;
        this.f70087e = z18;
        this.f70088f = z19;
        this.f70089g = z27;
        this.f70090h = com.tencent.mm.mj_template.sns.compose.widget.k7.f70037d;
        this.f70091i = com.tencent.mm.mj_template.sns.compose.widget.j7.f70011d;
        this.f70092j = com.tencent.mm.mj_template.sns.compose.widget.l7.f70060d;
        this.f70093k = new com.tencent.mm.mj_template.sns.compose.widget.e7(null);
        this.f70095m = com.tencent.mm.mj_template.sns.compose.widget.d7.f69935d;
        this.f70096n = n0.s4.c(p0Var, null, 2, null);
        this.f70097o = new java.util.LinkedList();
        this.f70098p = new java.util.ArrayList();
        this.f70102t = 3;
        if (!defaultTemplateList.isEmpty()) {
            g(null);
        }
        this.f70104v = new java.util.HashSet();
    }

    public final java.lang.String a() {
        java.lang.String str;
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = this.f70100r;
        return (m5Var == null || (str = m5Var.f70077a) == null) ? "" : str;
    }

    public final java.util.List b() {
        return (java.util.List) this.f70096n.getValue();
    }

    public final void c(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsTemplate.SnsTemplateListState", "empty template list");
        } else {
            this.f70099q = true;
        }
        java.util.List list2 = this.f70098p;
        list2.clear();
        list2.addAll(list);
        g(null);
    }

    public final void d(java.util.List list) {
        java.lang.Object obj;
        boolean z17;
        kotlin.jvm.internal.o.g(list, "list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            com.tencent.maas.model.MJTemplateInfo mJTemplateInfo = (com.tencent.maas.model.MJTemplateInfo) obj2;
            java.util.List list2 = this.f70084b;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((r45.rz6) it.next()).f385320d, mJTemplateInfo.getTemplateID())) {
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
            com.tencent.maas.model.MJTemplateInfo mJTemplateInfo2 = (com.tencent.maas.model.MJTemplateInfo) it6.next();
            java.util.Iterator it7 = ((java.util.ArrayList) this.f70098p).iterator();
            while (true) {
                if (it7.hasNext()) {
                    obj = it7.next();
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.mj_template.sns.compose.widget.k5) obj).f70077a, mJTemplateInfo2.getTemplateID())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.tencent.mm.mj_template.sns.compose.widget.k5 k5Var = (com.tencent.mm.mj_template.sns.compose.widget.k5) obj;
            if (k5Var == null) {
                k5Var = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.b(mJTemplateInfo2, com.tencent.mm.mj_template.sns.compose.widget.k5.f70026n);
            }
            arrayList2.add(k5Var);
        }
        c(arrayList2);
    }

    public final void e(java.lang.String templateId) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "updateCurSelectTemplate: " + templateId + ", curSelectedId: " + a());
        java.util.Iterator it = b().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.mj_template.sns.compose.widget.m5) obj2).f70077a, a())) {
                    break;
                }
            }
        }
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) obj2;
        com.tencent.mm.mj_template.sns.compose.widget.r rVar = m5Var != null ? m5Var.f70078b : null;
        if (rVar != null) {
            rVar.b(false);
        }
        java.util.Iterator it6 = b().iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.mj_template.sns.compose.widget.m5) next).f70077a, templateId)) {
                obj = next;
                break;
            }
        }
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var2 = (com.tencent.mm.mj_template.sns.compose.widget.m5) obj;
        if (m5Var2 != null) {
            m5Var2.f70078b.b(true);
            this.f70100r = m5Var2;
        }
    }

    public final void f(java.lang.String templateId) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        java.util.Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.tencent.mm.mj_template.sns.compose.widget.m5) obj).f70078b.a()) {
                    break;
                }
            }
        }
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) obj;
        com.tencent.mm.mj_template.sns.compose.widget.r rVar = m5Var != null ? m5Var.f70078b : null;
        if (rVar != null) {
            rVar.b(false);
        }
        e(templateId);
    }

    public final void g(mz0.a aVar) {
        java.lang.Object obj;
        java.lang.String str;
        com.tencent.mm.mj_template.sns.compose.widget.k5 c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "updateTemplateList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTemplateList defaultTemplateList: ");
        java.util.List<r45.rz6> list = this.f70084b;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", sb6.toString());
        arrayList.addAll(this.f70085c);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.rz6 rz6Var : list) {
            if (aVar == null || !kotlin.jvm.internal.o.b(rz6Var.f385320d, aVar.f332871a)) {
                c17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.c(rz6Var);
            } else {
                c17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.c(rz6Var);
                c17.f70035l = aVar.f332872b;
            }
            arrayList2.add(c17);
        }
        arrayList.addAll(arrayList2);
        if (this.f70099q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "add homepage item");
            arrayList.addAll(this.f70098p);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "add loading item");
            for (int i17 = 0; i17 < this.f70102t; i17++) {
                arrayList.add(new com.tencent.mm.mj_template.sns.compose.widget.l5());
            }
        }
        java.util.LinkedList linkedList = this.f70097o;
        if (!linkedList.isEmpty()) {
            arrayList.add(new com.tencent.mm.mj_template.sns.compose.widget.f5());
            arrayList.addAll(linkedList);
        }
        if (this.f70087e) {
            arrayList.add(com.tencent.mm.mj_template.sns.compose.widget.h5.f69983e);
        }
        if (this.f70086d) {
            arrayList.add(com.tencent.mm.mj_template.sns.compose.widget.g5.f69969e);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (hashSet.add(((com.tencent.mm.mj_template.sns.compose.widget.m5) obj2).f70077a)) {
                arrayList3.add(obj2);
            }
        }
        this.f70096n.setValue(arrayList3);
        if (a().length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "updateTemplateList curSelectedItemId is null");
            java.util.Iterator it = b().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((com.tencent.mm.mj_template.sns.compose.widget.m5) obj).f70079c) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) obj;
            if (m5Var == null || (str = m5Var.f70077a) == null) {
                return;
            }
            e(str);
        }
    }
}
