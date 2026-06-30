package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class w8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea f287748d;

    public w8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea) {
        this.f287748d = c21628xcedb13ea;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        n52.e eVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 u17;
        ot0.q v17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f287748d;
        c21628xcedb13ea.B.n();
        yb5.d dVar = c21628xcedb13ea.f279685f;
        dVar.f542243e.j0(c1163xf1deaba4, i17);
        if (i17 == 1) {
            c21628xcedb13ea.f279802t.f().setTag(com.p314xaae8f345.mm.R.id.bke, java.lang.Boolean.TRUE);
        }
        if (i17 == 0) {
            dVar.B();
            if (c21628xcedb13ea.f279802t.mo54248xf50f67b() == 0) {
                java.lang.Object tag = c21628xcedb13ea.f279802t.f().getTag(com.p314xaae8f345.mm.R.id.bke);
                if (tag == null ? true : ((java.lang.Boolean) tag).booleanValue()) {
                    if (c21628xcedb13ea.F.mo142542xf18228b2()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUIFragment", "[rv.onScrollStateChanged] skip auto load!, current is loading");
                    } else {
                        android.view.View m75885x6a486239 = c21628xcedb13ea.f279802t.m75885x6a486239(0);
                        if (m75885x6a486239 != null) {
                            int m75891xf39fff7a = c21628xcedb13ea.f279802t.m75891xf39fff7a();
                            if (m75885x6a486239.getTop() == m75891xf39fff7a) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "[rv.onScrollStateChanged] auto load top more!");
                                boolean z17 = (c21628xcedb13ea.m78645x9f88d943() == null || c21628xcedb13ea.m78645x9f88d943().mo82159x284e8789() == 0) ? false : true;
                                tb5.v vVar = ((tb5.y) ((tb5.m0) dVar.f542241c.a(tb5.m0.class))).f498638f;
                                vVar.getClass();
                                vVar.f498633q = java.lang.System.currentTimeMillis();
                                c21628xcedb13ea.B.e(true, z17 ? 0 : 200);
                            } else if (m75885x6a486239.getTop() < m75891xf39fff7a) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUIFragment", "[rv.onScrollStateChanged] exception auto load top more wit reset adapter!");
                                c21628xcedb13ea.B.m79877x6cab2c8d(c21628xcedb13ea.f279801s);
                            }
                        }
                    }
                }
            } else if (c21628xcedb13ea.f279802t.mo75762xe81a1f0f() == c21628xcedb13ea.f279802t.mo75756x7444f759() - 1) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var = c21628xcedb13ea.f279802t;
                android.view.View m75885x6a4862392 = v3Var.m75885x6a486239(v3Var.m75886x3d79f549() - 1);
                if (m75885x6a4862392 != null && c21628xcedb13ea.f279802t.m75884x12a4bd21() - c21628xcedb13ea.B.m79074xd3ae1da8() >= m75885x6a4862392.getBottom()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "[rv.onScrollStateChanged] auto load bottom more!");
                    c21628xcedb13ea.B.c(true);
                }
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) c21628xcedb13ea.f279801s).G0(c21628xcedb13ea.f279802t.mo75757x2ce24761() - c21628xcedb13ea.f279802t.mo75761x118cb524(), c21628xcedb13ea.f279802t.mo75762xe81a1f0f());
            sb5.z zVar = c21628xcedb13ea.f279801s;
            int mo75757x2ce24761 = c21628xcedb13ea.f279802t.mo75757x2ce24761() - c21628xcedb13ea.f279802t.mo75761x118cb524();
            int mo75762xe81a1f0f = c21628xcedb13ea.f279802t.mo75762xe81a1f0f();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
            yb5.d dVar2 = kVar.K;
            if (dVar2 != null && (u17 = dVar2.u()) != null && !u17.k2()) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (mo75757x2ce24761 <= mo75762xe81a1f0f) {
                    while (true) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = kVar.mo75871xfb80e389(mo75757x2ce24761);
                        if (mo75871xfb80e389 != null && (v17 = ot0.q.v(mo75871xfb80e389.U1())) != null && v17.f430199i == 5 && !android.text.TextUtils.isEmpty(v17.f430207k)) {
                            zq1.i0 i0Var = new zq1.i0();
                            i0Var.f556516a = v17.f430207k;
                            i0Var.f556518c = 1;
                            i0Var.f556520e = v17.f430179d;
                            i0Var.f556521f = v17.f430187f;
                            i0Var.f556522g = v17.f430191g;
                            i0Var.f556523h = dVar2.D() ? "groupmessage" : "singlemessage";
                            i0Var.f556519d = 2;
                            linkedList.add(i0Var);
                        }
                        if (mo75757x2ce24761 == mo75762xe81a1f0f) {
                            break;
                        } else {
                            mo75757x2ce24761++;
                        }
                    }
                }
                if (((zq1.a0) gm0.j1.s(zq1.a0.class)) != null && linkedList.size() > 0) {
                    linkedList.size();
                    ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).f(linkedList, 2);
                }
            }
        }
        android.view.ViewGroup f17 = c21628xcedb13ea.f279802t.f();
        n30.v vVar2 = c21628xcedb13ea.I;
        if (vVar2 != null && (eVar = ((n52.c) vVar2).f416654a) != null) {
            eVar.a(f17, i17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        n52.e eVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        boolean z17 = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f287748d;
        if (z17 && mo7946xf939df19 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            int w17 = c1162x665295de.w();
            int y17 = (c1162x665295de.y() - w17) + 1;
            c21628xcedb13ea.f279685f.f542243e.i0(c1163xf1deaba4, w17, y17, mo7946xf939df19.mo1894x7e414b06(), i18);
            android.view.ViewGroup f17 = c21628xcedb13ea.f279802t.f();
            n30.v vVar = c21628xcedb13ea.I;
            if (vVar != null && (eVar = ((n52.c) vVar).f416654a) != null) {
                eVar.b(f17, w17, y17);
            }
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.X0(c21628xcedb13ea) > 0 && (c21628xcedb13ea.F instanceof ke5.s)) {
            c21628xcedb13ea.B.n();
            if (c21628xcedb13ea.f279802t.mo75757x2ce24761() <= com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.X0(c21628xcedb13ea) && c21628xcedb13ea.f279802t.mo54248xf50f67b() > 0 && i18 < 0) {
                java.lang.Object tag = c21628xcedb13ea.f279802t.f().getTag(com.p314xaae8f345.mm.R.id.bke);
                if ((tag == null ? true : ((java.lang.Boolean) tag).booleanValue()) && !c21628xcedb13ea.F.mo142542xf18228b2()) {
                    c21628xcedb13ea.B.f(true, 0, true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
