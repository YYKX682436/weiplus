package ni3;

/* loaded from: classes10.dex */
public final class n extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: h, reason: collision with root package name */
    public static final ni3.j f419166h = new ni3.j(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f419167d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f419168e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f419169f;

    /* renamed from: g, reason: collision with root package name */
    public ni3.a1 f419170g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f419167d = jz5.h.b(new ni3.m(this));
        this.f419168e = jz5.h.b(new ni3.k(this));
        this.f419169f = jz5.h.b(new ni3.l(this));
    }

    public final java.lang.String O6() {
        if (!m80381x45f41879()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("comment:");
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            sb6.append(nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
            sb6.append(" contextId:");
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            sb6.append(nyVar2 != null ? nyVar2.f216915p : null);
            sb6.append(" activity:");
            sb6.append(m158354x19263085());
            sb6.append(" this:");
            sb6.append(this);
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("comment:");
        android.app.Activity context3 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        sb7.append(nyVar3 != null ? java.lang.Integer.valueOf(nyVar3.f216913n) : null);
        sb7.append(" tabType:");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc6 : null;
        sb7.append(abstractC15124x7bae6180 != null ? java.lang.Integer.valueOf(abstractC15124x7bae6180.f210798p) : null);
        sb7.append(" contextId:");
        android.app.Activity context4 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar4 = context4 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        sb7.append(nyVar4 != null ? nyVar4.f216915p : null);
        sb7.append(" fragment:");
        sb7.append(m158358x197d1fc6());
        return sb7.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa data, int i17, cw2.f8 videoCore, fc2.c cVar, int i18) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 e76;
        kw2.m0 m0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCore, "videoCore");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach ");
        sb6.append(O6());
        sb6.append(" isEnableMonitorView:");
        ni3.j jVar = f419166h;
        sb6.append(jVar.a());
        sb6.append(" isEnableVideoLoadStrategyMonitor:");
        sb6.append(jVar.b());
        sb6.append("  ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamMonitorUIC", sb6.toString());
        if (jVar.a()) {
            android.view.View view = (android.view.View) ((jz5.n) this.f419167d).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) view).addView(com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.afy, this instanceof android.view.ViewGroup ? (android.view.ViewGroup) this : null, false));
            com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9) ((jz5.n) this.f419169f).mo141623x754a37bb();
            if (c16559xedc507d9 != null) {
                c16559xedc507d9.f230996o = true;
                c16559xedc507d9.f230992h = data;
                c16559xedc507d9.f230997p = i18;
                c16559xedc507d9.f230993i = videoCore;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m66991x4905e9fa = c16559xedc507d9.m66991x4905e9fa();
                com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16562x4b95823c c16562x4b95823c = new com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16562x4b95823c(c16559xedc507d9.getContext());
                c16562x4b95823c.m8091xc21abdf5(false);
                m66991x4905e9fa.mo7967x900dcbe1(c16562x4b95823c);
                ni3.t tVar = new ni3.t(c16559xedc507d9);
                tVar.mo8164xbbdced85(true);
                c16559xedc507d9.m66991x4905e9fa().mo7960x6cab2c8d(tVar);
                c16559xedc507d9.m66991x4905e9fa().m7963x830bc99d(true);
                if (cVar != null) {
                    cVar.a(c16559xedc507d9.A);
                }
                c16559xedc507d9.m66991x4905e9fa().setNestedScrollingEnabled(false);
                c16559xedc507d9.m66991x4905e9fa().setOnTouchListener(new ni3.l0(c16559xedc507d9));
                ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().e(c16559xedc507d9.f231002u);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ew ewVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.M1;
                ni3.w callback = c16559xedc507d9.f231001t;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.O1.add(callback);
            }
            android.view.View view2 = (android.view.View) ((jz5.n) this.f419168e).mo141623x754a37bb();
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorUIC", "onAttach", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;ILcom/tencent/mm/plugin/finder/video/FinderVideoCore;Lcom/tencent/mm/plugin/finder/event/base/EventDispatcher;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/monitor/FinderStreamMonitorUIC", "onAttach", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;ILcom/tencent/mm/plugin/finder/video/FinderVideoCore;Lcom/tencent/mm/plugin/finder/event/base/EventDispatcher;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Q6(com.p314xaae8f345.mm.ui.bl.h(m80379x76847179()));
        }
        if (jVar.b()) {
            ni3.a1 a1Var = new ni3.a1();
            this.f419170g = a1Var;
            android.app.Activity context = m80379x76847179();
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar == null || (str = nyVar.f216915p) == null) {
                str = "";
            }
            android.app.Activity context3 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            int i19 = nyVar2 != null ? nyVar2.f216913n : 0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", "attach " + i19 + " tabType:" + i18 + ' ' + str + ' ' + a1Var);
            a1Var.f419060c = data;
            a1Var.f419061d = str;
            a1Var.f419062e = i19;
            a1Var.f419063f = i18;
            a1Var.f419059b = cVar;
            if (cVar != null) {
                cVar.a(a1Var.f419071n);
            }
            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().e(a1Var.f419072o);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ew ewVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.M1;
            ni3.w0 callback2 = a1Var.f419069l;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback2, "callback");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.O1.add(callback2);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = a1Var.f419064g;
            a1Var.i("attach", data, concurrentHashMap);
            ni3.o1 o1Var = a1Var.f419058a;
            o1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StrategyAsyncMonitor", "attach");
            o1Var.f419190d = context;
            o1Var.f419192f = data;
            o1Var.f419194h = concurrentHashMap;
            o1Var.f419193g = videoCore;
            o1Var.f419191e = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            o1Var.e();
            a1Var.f419070m.mo48813x58998cd();
            android.app.Activity context4 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = context4 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar3 == null || (e76 = nyVar3.e7(i18)) == null || (m0Var = e76.f206821o) == null) {
                return;
            }
            m0Var.f394598j = this.f419170g;
        }
    }

    public final void Q6(int i17) {
        jz5.g gVar = this.f419169f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9) ((jz5.n) gVar).mo141623x754a37bb();
        android.view.ViewGroup.LayoutParams layoutParams = c16559xedc507d9 != null ? c16559xedc507d9.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d92 = (com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9) ((jz5.n) gVar).mo141623x754a37bb();
        if (c16559xedc507d92 != null) {
            c16559xedc507d92.requestLayout();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamMonitorUIC", "onCreate " + O6());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.util.LinkedHashMap linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        ni3.b1 b1Var;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamMonitorUIC", "onDestroy " + O6());
        ni3.a1 a1Var = this.f419170g;
        if (a1Var != null) {
            fc2.c cVar = a1Var.f419059b;
            if (cVar != null) {
                cVar.d(a1Var.f419071n);
            }
            ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
            Di.getClass();
            ni3.x0 callback = a1Var.f419072o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            Di.f335222e.remove(callback);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ew ewVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.M1;
            ni3.w0 callback2 = a1Var.f419069l;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback2, "callback");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.O1.remove(callback2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = a1Var.f419060c;
            if (c13920xa5f564aa == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
                throw null;
            }
            int size = c13920xa5f564aa.size();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = a1Var.f419064g;
            java.lang.String str = " \n";
            if (size <= 0) {
                concurrentHashMap = concurrentHashMap2;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa2 = a1Var.f419060c;
                if (c13920xa5f564aa2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
                    throw null;
                }
                int size2 = c13920xa5f564aa2.size();
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry.getValue()).f419203a.h() == 4) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry2.getValue()).f419203a.h() == 9) {
                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                    }
                }
                int size3 = linkedHashMap4.size();
                java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry3 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry3.getValue()).f419203a.h() == 2) {
                        linkedHashMap5.put(entry3.getKey(), entry3.getValue());
                    }
                }
                int size4 = linkedHashMap5.size();
                java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry4 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry4.getValue()).f419207e) {
                        linkedHashMap6.put(entry4.getKey(), entry4.getValue());
                    }
                }
                int size5 = linkedHashMap6.size();
                java.util.LinkedHashMap linkedHashMap7 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry5 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry5.getValue()).f419208f) {
                        linkedHashMap7.put(entry5.getKey(), entry5.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap8 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry6 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry6.getValue()).f419208f && ((ni3.p0) entry6.getValue()).f419209g.f419264a) {
                        linkedHashMap8.put(entry6.getKey(), entry6.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap9 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry7 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry7.getValue()).f419208f && ((ni3.p0) entry7.getValue()).f419210h.f419264a) {
                        linkedHashMap9.put(entry7.getKey(), entry7.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap10 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry8 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry8.getValue()).f419208f && ((ni3.p0) entry8.getValue()).f419211i.f419264a) {
                        linkedHashMap10.put(entry8.getKey(), entry8.getValue());
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa3 = a1Var.f419060c;
                if (c13920xa5f564aa3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
                    throw null;
                }
                java.lang.String str2 = "FinderStreamVideoLoadStrategyMonitor";
                if (c13920xa5f564aa3.size() != concurrentHashMap2.size()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("evaluateStreamQos diff:[");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa4 = a1Var.f419060c;
                    if (c13920xa5f564aa4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
                        throw null;
                    }
                    sb6.append(c13920xa5f564aa4.size());
                    sb6.append(" -- ");
                    sb6.append(concurrentHashMap2.size());
                    sb6.append("] \nsource:");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa5 = a1Var.f419060c;
                    if (c13920xa5f564aa5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
                        throw null;
                    }
                    linkedHashMap = linkedHashMap9;
                    linkedHashMap2 = linkedHashMap10;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(c13920xa5f564aa5, 10));
                    java.util.Iterator<T> it = c13920xa5f564aa5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(pm0.v.u(((so2.j5) it.next()).mo2128x1ed62e84()));
                    }
                    sb6.append(kz5.n0.g0(arrayList, " ", null, null, 0, null, null, 62, null));
                    sb6.append("  \nxxlife:");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(concurrentHashMap2.size());
                    java.util.Iterator it6 = concurrentHashMap2.entrySet().iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(pm0.v.u(((ni3.p0) ((java.util.Map.Entry) it6.next()).getValue()).f419203a.mo2128x1ed62e84()));
                    }
                    sb6.append(kz5.n0.g0(arrayList2, " ", null, null, 0, null, null, 62, null));
                    sb6.append(" \n");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
                } else {
                    linkedHashMap = linkedHashMap9;
                    linkedHashMap2 = linkedHashMap10;
                }
                java.lang.String str3 = "evaluateStreamQos: \n场景：" + a1Var.f419062e + " Tab:" + a1Var.f419063f + " \n总拉取:" + size2 + " 视频:" + linkedHashMap3.size() + " 直播:" + size3 + " 图片:" + size4 + " \n曝光：" + size5 + " 视频起播：" + linkedHashMap7.size() + " \n一段预加载命中率：" + a1Var.b(linkedHashMap8.size(), linkedHashMap7.size()) + " \n二段预加载命中率：" + a1Var.b(linkedHashMap.size(), linkedHashMap7.size()) + " \n预渲染命中率：   " + a1Var.b(linkedHashMap2.size(), linkedHashMap7.size()) + " \n";
                java.util.Map c17 = a1Var.c(linkedHashMap7, linkedHashMap8);
                java.util.LinkedHashMap linkedHashMap11 = new java.util.LinkedHashMap();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) c17;
                for (java.util.Map.Entry entry9 : concurrentHashMap3.entrySet()) {
                    if (((ni3.p0) entry9.getValue()).f419209g.f419266c == 1) {
                        linkedHashMap11.put(entry9.getKey(), entry9.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap12 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry10 : concurrentHashMap3.entrySet()) {
                    if (((ni3.p0) entry10.getValue()).f419209g.f419266c == 2) {
                        linkedHashMap12.put(entry10.getKey(), entry10.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap13 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry11 : concurrentHashMap3.entrySet()) {
                    if (((ni3.p0) entry11.getValue()).f419209g.f419266c == 4) {
                        linkedHashMap13.put(entry11.getKey(), entry11.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap14 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry12 : concurrentHashMap3.entrySet()) {
                    if (((ni3.p0) entry12.getValue()).f419209g.f419266c == 5) {
                        linkedHashMap14.put(entry12.getKey(), entry12.getValue());
                    }
                }
                java.lang.String str4 = "stageOne failCount:" + concurrentHashMap3.size() + " \n" + a1Var.h("文件加载完毕", linkedHashMap11, c17) + a1Var.h("预加载未完成", linkedHashMap12, c17) + a1Var.h("落地不足5s", linkedHashMap13, c17) + a1Var.h("冷启动", linkedHashMap14, c17) + a1Var.h("未知原因", a1Var.c(a1Var.c(a1Var.c(a1Var.c(c17, linkedHashMap11), linkedHashMap12), linkedHashMap13), linkedHashMap14), c17) + '\n';
                java.util.Map c18 = a1Var.c(linkedHashMap7, linkedHashMap);
                java.util.LinkedHashMap linkedHashMap15 = new java.util.LinkedHashMap();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap4 = (java.util.concurrent.ConcurrentHashMap) c18;
                for (java.util.Map.Entry entry13 : concurrentHashMap4.entrySet()) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap5 = concurrentHashMap2;
                    if (((ni3.p0) entry13.getValue()).f419210h.f419266c == 1) {
                        linkedHashMap15.put(entry13.getKey(), entry13.getValue());
                    }
                    concurrentHashMap2 = concurrentHashMap5;
                }
                concurrentHashMap = concurrentHashMap2;
                java.util.LinkedHashMap linkedHashMap16 = new java.util.LinkedHashMap();
                java.util.Iterator it7 = concurrentHashMap4.entrySet().iterator();
                while (it7.hasNext()) {
                    java.util.Map.Entry entry14 = (java.util.Map.Entry) it7.next();
                    java.util.Iterator it8 = it7;
                    java.lang.String str5 = str2;
                    if (((ni3.p0) entry14.getValue()).f419210h.f419266c == 2) {
                        linkedHashMap16.put(entry14.getKey(), entry14.getValue());
                    }
                    str2 = str5;
                    it7 = it8;
                }
                java.lang.String str6 = str2;
                java.util.LinkedHashMap linkedHashMap17 = new java.util.LinkedHashMap();
                java.util.Iterator it9 = concurrentHashMap4.entrySet().iterator();
                while (it9.hasNext()) {
                    java.util.Map.Entry entry15 = (java.util.Map.Entry) it9.next();
                    java.util.Iterator it10 = it9;
                    java.lang.String str7 = str4;
                    if (((ni3.p0) entry15.getValue()).f419210h.f419266c == 4) {
                        linkedHashMap17.put(entry15.getKey(), entry15.getValue());
                    }
                    str4 = str7;
                    it9 = it10;
                }
                java.lang.String str8 = str4;
                java.util.LinkedHashMap linkedHashMap18 = new java.util.LinkedHashMap();
                java.util.Iterator it11 = concurrentHashMap4.entrySet().iterator();
                while (it11.hasNext()) {
                    java.util.Map.Entry entry16 = (java.util.Map.Entry) it11.next();
                    java.util.Iterator it12 = it11;
                    java.lang.String str9 = str3;
                    if (((ni3.p0) entry16.getValue()).f419210h.f419266c == 5) {
                        linkedHashMap18.put(entry16.getKey(), entry16.getValue());
                    }
                    str3 = str9;
                    it11 = it12;
                }
                java.lang.String str10 = str3;
                java.lang.String str11 = "stageTwo failCount:" + concurrentHashMap4.size() + " \n" + a1Var.h("文件加载完毕", linkedHashMap15, c18) + a1Var.h("预加载未完成", linkedHashMap16, c18) + a1Var.h("落地不足5s", linkedHashMap17, c18) + a1Var.h("冷启动", linkedHashMap18, c18) + a1Var.h("未知原因", a1Var.c(a1Var.c(a1Var.c(a1Var.c(c18, linkedHashMap15), linkedHashMap16), linkedHashMap17), linkedHashMap18), c18) + '\n';
                java.util.Map c19 = a1Var.c(linkedHashMap7, linkedHashMap2);
                java.util.LinkedHashMap linkedHashMap19 = new java.util.LinkedHashMap();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap6 = (java.util.concurrent.ConcurrentHashMap) c19;
                for (java.util.Map.Entry entry17 : concurrentHashMap6.entrySet()) {
                    if (((ni3.p0) entry17.getValue()).f419211i.f419266c == 3) {
                        linkedHashMap19.put(entry17.getKey(), entry17.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap20 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry18 : concurrentHashMap6.entrySet()) {
                    if (((ni3.p0) entry18.getValue()).f419211i.f419266c == 4) {
                        linkedHashMap20.put(entry18.getKey(), entry18.getValue());
                    }
                }
                java.lang.String str12 = "stagePreRender failCount:" + concurrentHashMap6.size() + " \n" + a1Var.h("无预加载", linkedHashMap19, c19) + a1Var.h("落地不足5s", linkedHashMap20, c19) + a1Var.h("未知原因", a1Var.c(a1Var.c(c19, linkedHashMap19), linkedHashMap20), c19) + '\n';
                java.util.LinkedHashMap linkedHashMap21 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry19 : linkedHashMap7.entrySet()) {
                    if (((ni3.p0) entry19.getValue()).f419206d.f419235b <= 0) {
                        linkedHashMap21.put(entry19.getKey(), entry19.getValue());
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str6, str10 + ' ' + str8 + ' ' + str11 + ' ' + str12 + ' ' + ("invalidReport failCount:" + linkedHashMap21.size() + " \n" + a1Var.h("上报异常", linkedHashMap21, linkedHashMap7) + '\n'));
            }
            ni3.o1 o1Var = a1Var.f419058a;
            o1Var.f();
            p3325xe03a0797.p3326xc267989b.z0.e(o1Var.f419187a, null, 1, null);
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = o1Var.f419197k;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList4 = o1Var.f419196j;
            java.util.Iterator it13 = copyOnWriteArrayList3.iterator();
            while (true) {
                boolean hasNext = it13.hasNext();
                b1Var = o1Var.f419198l;
                if (!hasNext) {
                    break;
                }
                ni3.k1 k1Var = (ni3.k1) it13.next();
                ni3.o1 o1Var2 = o1Var;
                ni3.l1 l1Var = k1Var.f419154a;
                java.util.Iterator it14 = it13;
                ni3.l1 l1Var2 = ni3.l1.f419160d;
                ni3.a1 a1Var2 = a1Var;
                java.lang.String str13 = k1Var.f419157d;
                java.lang.String str14 = str;
                ni3.p0 p0Var = k1Var.f419155b;
                if (l1Var == l1Var2) {
                    b1Var.getClass();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6604x1a62a334 c6604x1a62a334 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6604x1a62a334();
                    copyOnWriteArrayList = copyOnWriteArrayList3;
                    copyOnWriteArrayList2 = copyOnWriteArrayList4;
                    b1Var.a(101L, p0Var, c6604x1a62a334);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("hit", 1);
                    jSONObject.put("reasonType", -1);
                    jSONObject.put("reasonStr", str13);
                    jSONObject.put("count", k1Var.f419156c + 1);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    c6604x1a62a334.f139539p = c6604x1a62a334.b("aSyncStage1PreloadFail", r26.i0.t(jSONObject2, ",", ";", false), true);
                    c6604x1a62a334.l();
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList3;
                    copyOnWriteArrayList2 = copyOnWriteArrayList4;
                    if (l1Var == ni3.l1.f419161e) {
                        b1Var.getClass();
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6604x1a62a334 c6604x1a62a3342 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6604x1a62a334();
                        b1Var.a(102L, p0Var, c6604x1a62a3342);
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("hit", true);
                        jSONObject3.put("reasonType", -1);
                        jSONObject3.put("reasonStr", str13);
                        jSONObject3.put("count", k1Var.f419156c + 1);
                        java.lang.String jSONObject4 = jSONObject3.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                        c6604x1a62a3342.f139540q = c6604x1a62a3342.b("aSyncStage2PreloadFail", r26.i0.t(jSONObject4, ",", ";", false), true);
                        c6604x1a62a3342.l();
                    }
                }
                copyOnWriteArrayList3 = copyOnWriteArrayList;
                o1Var = o1Var2;
                it13 = it14;
                a1Var = a1Var2;
                str = str14;
                copyOnWriteArrayList4 = copyOnWriteArrayList2;
            }
            ni3.a1 a1Var3 = a1Var;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList5 = copyOnWriteArrayList3;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList6 = copyOnWriteArrayList4;
            java.lang.String str15 = str;
            java.util.Iterator it15 = copyOnWriteArrayList6.iterator();
            while (it15.hasNext()) {
                ni3.j1 j1Var = (ni3.j1) it15.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j1Var);
                b1Var.getClass();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6604x1a62a334 c6604x1a62a3343 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6604x1a62a334();
                b1Var.a(104L, j1Var.f419150a, c6604x1a62a3343);
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put("hit", true);
                jSONObject5.put("reasonType", -1);
                jSONObject5.put("reasonStr", "");
                jSONObject5.put("count", j1Var.f419151b + 1);
                java.lang.String jSONObject6 = jSONObject5.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
                c6604x1a62a3343.f139540q = c6604x1a62a3343.b("aSyncStage2PreloadFail", r26.i0.t(jSONObject6, ",", ";", false), true);
                c6604x1a62a3343.l();
                copyOnWriteArrayList5 = copyOnWriteArrayList5;
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList7 = copyOnWriteArrayList5;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("evaluate \n预加载异常feed:");
            sb7.append(copyOnWriteArrayList7.size());
            sb7.append(" Count:");
            sb7.append(copyOnWriteArrayList7.size());
            sb7.append(" list:");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList7, 10));
            java.util.Iterator it16 = copyOnWriteArrayList7.iterator();
            while (it16.hasNext()) {
                ni3.k1 k1Var2 = (ni3.k1) it16.next();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(k1Var2.f419155b.f419204b);
                sb8.append('.');
                sb8.append(k1Var2.f419154a);
                arrayList3.add(sb8.toString());
            }
            sb7.append(kz5.n0.g0(arrayList3, " ", null, null, 0, null, null, 62, null));
            sb7.append(" \n播放异常feed:");
            sb7.append(copyOnWriteArrayList6.size());
            sb7.append(" Count:");
            sb7.append(copyOnWriteArrayList6.size());
            sb7.append(" list:");
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList6, 10));
            java.util.Iterator it17 = copyOnWriteArrayList6.iterator();
            while (it17.hasNext()) {
                arrayList4.add(java.lang.String.valueOf(((ni3.j1) it17.next()).f419150a.f419204b));
            }
            sb7.append(kz5.n0.g0(arrayList4, " ", null, null, 0, null, null, 62, null));
            sb7.append(str15);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StrategyAsyncMonitor", java.lang.String.valueOf(sb7.toString()));
            copyOnWriteArrayList7.clear();
            copyOnWriteArrayList6.clear();
            a1Var3.f419070m.mo48814x2efc64();
            concurrentHashMap.clear();
            a1Var3.f419065h.clear();
            a1Var3.f419066i.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        ni3.a1 a1Var = this.f419170g;
        if (a1Var != null) {
            a1Var.f419058a.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamMonitorUIC", "onPause " + O6());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        ni3.a1 a1Var = this.f419170g;
        if (a1Var != null) {
            a1Var.f419058a.e();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamMonitorUIC", "onResume " + O6());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        ni3.a1 a1Var = this.f419170g;
        if (a1Var != null) {
            a1Var.f419058a.e();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamMonitorUIC", "onUserVisibleFocused " + O6());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        ni3.a1 a1Var = this.f419170g;
        if (a1Var != null) {
            a1Var.f419058a.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamMonitorUIC", "onUserVisibleUnFocused " + O6());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f419167d = jz5.h.b(new ni3.m(this));
        this.f419168e = jz5.h.b(new ni3.k(this));
        this.f419169f = jz5.h.b(new ni3.l(this));
    }
}
