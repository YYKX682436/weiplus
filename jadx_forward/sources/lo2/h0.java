package lo2;

/* loaded from: classes8.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc f401661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc activityC14486x9c4a98dc, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f401661d = activityC14486x9c4a98dc;
        this.f401662e = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lo2.h0(this.f401661d, this.f401662e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        lo2.h0 h0Var = (lo2.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        h0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14486x9c4a98dc activityC14486x9c4a98dc = this.f401661d;
        activityC14486x9c4a98dc.A.addAll(this.f401662e);
        android.widget.FrameLayout frameLayout = activityC14486x9c4a98dc.f202944v;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(8);
        android.view.View view = activityC14486x9c4a98dc.retryView;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
        view.setOnClickListener(null);
        if (activityC14486x9c4a98dc.A.isEmpty()) {
            android.widget.FrameLayout frameLayout2 = activityC14486x9c4a98dc.f202944v;
            if (frameLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                throw null;
            }
            frameLayout2.setVisibility(0);
            android.view.View view2 = activityC14486x9c4a98dc.loadingView;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = activityC14486x9c4a98dc.nothingView;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = activityC14486x9c4a98dc.retryView;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = activityC14486x9c4a98dc.nothingView;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = activityC14486x9c4a98dc.retryView;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.FrameLayout frameLayout3 = activityC14486x9c4a98dc.f202944v;
            if (frameLayout3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                throw null;
            }
            frameLayout3.setVisibility(8);
            if (!activityC14486x9c4a98dc.h7()) {
                activityC14486x9c4a98dc.f7().setVisibility(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = activityC14486x9c4a98dc.f202948z;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf.m8146xced61ae5();
            if (activityC14486x9c4a98dc.G != 1) {
                activityC14486x9c4a98dc.f7().k();
            }
        }
        return jz5.f0.f384359a;
    }
}
