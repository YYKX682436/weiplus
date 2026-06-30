package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class a6 implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f191183d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f191184e;

    /* renamed from: f, reason: collision with root package name */
    public final int f191185f;

    /* renamed from: g, reason: collision with root package name */
    public final int f191186g;

    /* renamed from: h, reason: collision with root package name */
    public final int f191187h;

    /* renamed from: i, reason: collision with root package name */
    public final int f191188i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 f191189m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f191190n;

    /* renamed from: o, reason: collision with root package name */
    public int f191191o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.qt2 f191192p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f191193q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f191194r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f191195s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f191196t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9 f191197u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f191198v;

    public a6(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f context, java.util.ArrayList topicList, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicList, "topicList");
        this.f191183d = context;
        this.f191184e = topicList;
        this.f191185f = i17;
        this.f191186g = i18;
        this.f191187h = i19;
        this.f191188i = i27;
        this.f191192p = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        this.f191193q = "";
        this.f191194r = "";
        this.f191195s = new java.util.LinkedList();
        this.f191196t = new java.util.ArrayList();
        this.f191197u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9();
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 a6Var, int i17, int i18, java.util.LinkedList linkedList, int i19, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.widget.TextView textView;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        java.util.ArrayList arrayList = a6Var.f191196t;
        int size = arrayList.size();
        android.view.View view4 = null;
        if (i17 == 0 && i18 == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), 16));
                if (!p17.getFeedObject().m59264x7efe73ec().isEmpty()) {
                    arrayList.add(p17);
                }
                arrayList2.add(jz5.f0.f384359a);
            }
            a6Var.f191191o = i19;
            a6Var.f191190n = gVar;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = a6Var.f191183d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            int i27 = a6Var.f191185f == 2 ? 1 : 2;
            java.lang.String str = (java.lang.String) kz5.n0.Z(a6Var.f191195s);
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.pj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, V6, a6Var.f191194r, 1, i27, str2, a6Var.f191193q, linkedList.size(), 0L, 0, 384, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var = a6Var.f191189m;
        if (p6Var != null) {
            java.lang.Integer errCode = java.lang.Integer.valueOf(i17);
            java.lang.Integer errType = java.lang.Integer.valueOf(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errCode, "errCode");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errType, "errType");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 a6Var2 = p6Var.f191932e;
            int size2 = a6Var2.f191196t.size();
            jz5.g gVar2 = p6Var.f191939o;
            jz5.g gVar3 = p6Var.f191938n;
            if (size2 > 0) {
                ((android.widget.TextView) ((jz5.n) gVar3).mo141623x754a37bb()).setVisibility(8);
                ((android.widget.LinearLayout) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(8);
                p6Var.g().setVisibility(8);
                p6Var.a().setVisibility(0);
            } else {
                ((android.widget.TextView) ((jz5.n) gVar3).mo141623x754a37bb()).setVisibility(0);
                ((android.widget.LinearLayout) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(8);
                p6Var.g().setVisibility(8);
                p6Var.a().setVisibility(8);
            }
            if (size == 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56636x4905e9fa = p6Var.m56636x4905e9fa();
                if (m56636x4905e9fa != null && (mo7946xf939df192 = m56636x4905e9fa.mo7946xf939df19()) != null) {
                    mo7946xf939df192.m8146xced61ae5();
                }
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56636x4905e9fa2 = p6Var.m56636x4905e9fa();
                if (m56636x4905e9fa2 != null && (mo7946xf939df19 = m56636x4905e9fa2.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8153xd399a4d9(size, size2);
                }
            }
            p6Var.a().e(true);
            p6Var.a().E(!(a6Var2.f191191o == 1));
            if (a6Var2.f191191o == 1) {
                return;
            }
            on5.c m82923x19404fcc = p6Var.a().m82923x19404fcc();
            android.view.View view5 = m82923x19404fcc != null ? m82923x19404fcc.getView() : null;
            if (view5 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                android.view.View view6 = view5;
                yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            on5.c m82923x19404fcc2 = p6Var.a().m82923x19404fcc();
            if (m82923x19404fcc2 != null && (view3 = m82923x19404fcc2.getView()) != null && (textView = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            on5.c m82923x19404fcc3 = p6Var.a().m82923x19404fcc();
            android.widget.TextView textView2 = (m82923x19404fcc3 == null || (view2 = m82923x19404fcc3.getView()) == null) ? null : (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ili);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            on5.c m82923x19404fcc4 = p6Var.a().m82923x19404fcc();
            if (m82923x19404fcc4 != null && (view = m82923x19404fcc4.getView()) != null) {
                view4 = view.findViewById(com.p314xaae8f345.mm.R.id.ilg);
            }
            if (view4 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            android.view.View view7 = view4;
            yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void f(int i17, long j17) {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f191183d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        int i18 = this.f191185f == 2 ? 1 : 2;
        java.lang.String str = (java.lang.String) kz5.n0.Z(this.f191195s);
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.pj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, V6, this.f191194r, 3, i18, str2, this.f191193q, 0, j17, i17, 64, null);
    }

    public final void g(android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f191196t);
        this.f191197u.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9(arrayList, this.f191190n, i17, null, null, 16, null), intent);
    }

    public final void h(java.lang.String query, java.util.LinkedList tags) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tags, "tags");
        this.f191191o = 0;
        this.f191190n = null;
        this.f191196t.clear();
        this.f191195s = tags;
        this.f191193q = query;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f191194r = uuid;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206742e = java.lang.String.valueOf(c01.id.c());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var = this.f191189m;
        if (p6Var != null) {
            p6Var.g().setVisibility(8);
            p6Var.a().setVisibility(8);
            ((android.widget.TextView) ((jz5.n) p6Var.f191938n).mo141623x754a37bb()).setVisibility(8);
            ((android.widget.LinearLayout) ((jz5.n) p6Var.f191939o).mo141623x754a37bb()).setVisibility(0);
            on5.c m82923x19404fcc = p6Var.a().m82923x19404fcc();
            android.view.View view = m82923x19404fcc != null ? m82923x19404fcc.getView() : null;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56636x4905e9fa = p6Var.m56636x4905e9fa();
            if (m56636x4905e9fa != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(m56636x4905e9fa, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "Undefined", "scrollToPosition", "(I)V");
                m56636x4905e9fa.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(m56636x4905e9fa, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        int i17 = this.f191186g;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f191183d;
        if (i17 != -1) {
            pq5.g l17 = new db2.f2(query, this.f191194r, null, this.f191186g, this.f191192p, this.f191187h, this.f191188i).l();
            l17.f(activityC21401x6ce6f73f);
            l17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.y5(this));
        } else {
            pq5.g l18 = new db2.q4(query, this.f191185f, this.f191194r, this.f191195s, null, this.f191192p).l();
            l18.f(activityC21401x6ce6f73f);
            l18.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.z5(this));
        }
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        this.f191189m = null;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f191198v;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206742e = "";
    }
}
