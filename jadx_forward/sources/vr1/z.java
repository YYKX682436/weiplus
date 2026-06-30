package vr1;

/* loaded from: classes14.dex */
public final class z implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f521142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr1.b0 f521143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b f521144f;

    public z(vr1.o oVar, vr1.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b activityC12994x7e10022b) {
        this.f521142d = oVar;
        this.f521143e = b0Var;
        this.f521144f = activityC12994x7e10022b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        vr1.t tVar = (vr1.t) obj;
        vr1.o oVar = this.f521142d;
        android.view.View view = oVar.f521117f;
        android.widget.ProgressBar progressBar = view != null ? (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.aly) : null;
        android.view.View view2 = oVar.f521117f;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.alx) : null;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar, vr1.r.f521129a);
        vr1.b0 b0Var = this.f521143e;
        if (b17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = b0Var.f521080d;
            if (!(u3Var != null && u3Var.isShowing())) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(b0Var.m158354x19263085(), "", b0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, false, null);
                b0Var.f521080d = Q;
                if (Q != null) {
                    Q.show();
                }
            }
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = b0Var.f521080d;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            b0Var.f521080d = null;
        }
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) b0Var.f521082f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-emptyWordTv>(...)");
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar, vr1.s.f521130a) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = (android.view.View) ((jz5.n) b0Var.f521083g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view3, "<get-hasClosedContainer>(...)");
        int i18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar, vr1.p.f521127a) ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f521144f.mo74408xb0dfae51(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar, r12));
        if (!(tVar instanceof vr1.q)) {
            if (oVar.f521117f != null) {
                oVar.O6().g0(r1.hashCode(), false);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m172525x4905e9fa = oVar.m172525x4905e9fa();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(m172525x4905e9fa, arrayList3.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m172525x4905e9fa.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(m172525x4905e9fa, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m172525x4905e9fa2 = oVar.m172525x4905e9fa();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(m172525x4905e9fa2, arrayList4.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m172525x4905e9fa2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(m172525x4905e9fa2, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = oVar.f521117f;
        if (view4 != null) {
            vr1.q qVar = (vr1.q) tVar;
            if (qVar.f521128a == vr1.u.f521131d) {
                oVar.O6().g0(view4.hashCode(), false);
                return;
            }
            oVar.O6().O(view4, -2, false);
            vr1.u uVar = qVar.f521128a;
            if (progressBar != null) {
                int i19 = uVar == vr1.u.f521132e ? 0 : 8;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList5);
                android.widget.ProgressBar progressBar2 = progressBar;
                yj0.a.d(progressBar2, arrayList5.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                progressBar.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(progressBar2, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById != null) {
                int i27 = uVar == vr1.u.f521133f ? 0 : 8;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList6);
                android.view.View view5 = findViewById;
                yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initStateObserve$1", "onChanged", "(Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$FinalListState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
