package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class fe implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.je f215928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f215929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f215930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215931g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215932h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f215933i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215934m;

    public fe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.je jeVar, android.widget.TextView textView, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.View view, android.view.View view2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str) {
        this.f215928d = jeVar;
        this.f215929e = textView;
        this.f215930f = h0Var;
        this.f215931g = view;
        this.f215932h = view2;
        this.f215933i = abstractC14490x69736cb5;
        this.f215934m = str;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        r45.u25 u25Var = (r45.u25) obj;
        java.lang.String str2 = this.f215934m;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f215930f;
        jz5.f0 f0Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.je jeVar = this.f215928d;
        if (u25Var != null) {
            jeVar.f216392o = u25Var;
            ed0.t0 t0Var = (ed0.t0) i95.n0.c(ed0.t0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f215933i;
            long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
            ((dd0.k0) t0Var).getClass();
            vx3.i a17 = qx3.d.a(mo2128x1ed62e84);
            boolean z17 = a17 != null ? a17.f522841y : false;
            ed0.t0 t0Var2 = (ed0.t0) i95.n0.c(ed0.t0.class);
            long mo2128x1ed62e842 = abstractC14490x69736cb5.mo2128x1ed62e84();
            ((dd0.k0) t0Var2).getClass();
            vx3.i a18 = qx3.d.a(mo2128x1ed62e842);
            java.lang.String str3 = a18 != null ? a18.f522825i : null;
            ed0.t0 t0Var3 = (ed0.t0) i95.n0.c(ed0.t0.class);
            long mo2128x1ed62e843 = abstractC14490x69736cb5.mo2128x1ed62e84();
            ((dd0.k0) t0Var3).getClass();
            vx3.i a19 = qx3.d.a(mo2128x1ed62e843);
            java.lang.String str4 = a19 != null ? a19.f522826j : null;
            if (!android.text.TextUtils.isEmpty(u25Var.m75945x2fec8307(0))) {
                r45.u25 u25Var2 = jeVar.f216392o;
                if (u25Var2 == null || (str = u25Var2.m75945x2fec8307(0)) == null) {
                    str = "";
                }
            } else if (!android.text.TextUtils.isEmpty(u25Var.m75945x2fec8307(1)) && !android.text.TextUtils.isEmpty(u25Var.m75945x2fec8307(2))) {
                str = u25Var.m75945x2fec8307(1) + " - " + u25Var.m75945x2fec8307(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            } else if (!z17 || android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str4)) {
                str = str2;
            } else {
                str = str3 + " - " + str4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            }
            h0Var.f391656d = str;
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            h0Var.f391656d = str2;
        }
        android.widget.TextView textView = this.f215929e;
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        textView.setText((java.lang.CharSequence) h0Var.f391656d);
        textView.setTextSize(0, jeVar.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
        textView.requestLayout();
        double d17 = jeVar.f216393p * 0.6d;
        android.view.View view = this.f215931g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f215932h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View ringtoneBubbleLeftLayout = this.f215932h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ringtoneBubbleLeftLayout, "$ringtoneBubbleLeftLayout");
        if (jeVar.e7(ringtoneBubbleLeftLayout) > d17) {
            android.view.ViewGroup.LayoutParams layoutParams = ringtoneBubbleLeftLayout.getLayoutParams();
            layoutParams.width = (int) d17;
            ringtoneBubbleLeftLayout.setLayoutParams(layoutParams);
            ringtoneBubbleLeftLayout.requestLayout();
        }
        float dimension = jeVar.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        android.view.View view3 = this.f215931g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view3, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) view3).b(dimension, dimension, dimension, dimension);
        view3.requestLayout();
        jeVar.f216394q.add(ringtoneBubbleLeftLayout);
    }
}
