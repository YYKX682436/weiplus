package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes9.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 f198555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f198558g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var, int i17, int i18, int i19) {
        super(0);
        this.f198555d = e2Var;
        this.f198556e = i17;
        this.f198557f = i18;
        this.f198558g = i19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var = this.f198555d;
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = e2Var.f198592g;
        if (c22851x22587864 != null) {
            c22851x22587864.e(this.f198556e == 0);
        }
        android.view.View view = e2Var.f198598p;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.ArrayList arrayList2 = e2Var.f198603u;
        boolean isEmpty = arrayList2.isEmpty();
        bm2.f fVar = e2Var.f198604v;
        if (isEmpty) {
            android.widget.TextView textView = e2Var.f198597o;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View view2 = e2Var.f198594i;
            if (view2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.widget.TextView textView2 = e2Var.f198597o;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            android.view.View view3 = e2Var.f198594i;
            if (view3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.String query = e2Var.f198600r;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList5.add(new cm2.k((r45.c73) it.next()));
            }
            fVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
            java.util.ArrayList arrayList6 = fVar.f103408d;
            arrayList6.clear();
            arrayList6.addAll(arrayList5);
            fVar.f103410f = query;
        }
        int i17 = this.f198557f;
        if (i17 == 0) {
            fVar.m8146xced61ae5();
        } else {
            int i18 = this.f198558g;
            if (i17 < i18) {
                fVar.m8153xd399a4d9(i17, i18 - i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
