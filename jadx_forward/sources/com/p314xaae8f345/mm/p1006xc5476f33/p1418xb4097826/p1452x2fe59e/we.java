package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class we extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f192502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar) {
        super(0);
        this.f192502d = afVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f192502d;
        afVar.W6();
        android.widget.LinearLayout linearLayout = afVar.f187795m;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("concertLoadingLayout");
            throw null;
        }
        linearLayout.setVisibility(8);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = afVar.F;
        if (c1073x7e08a787 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("concertRetryLayout");
            throw null;
        }
        c1073x7e08a787.setVisibility(0);
        com.p314xaae8f345.mm.p2776x373aa5.C22797x91382fb8 c22797x91382fb8 = afVar.f187793i;
        if (c22797x91382fb8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("concertTicketViewRoot");
            throw null;
        }
        c22797x91382fb8.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15215x9a0c94c4 c15215x9a0c94c4 = afVar.f187790f;
        if (c15215x9a0c94c4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareBtn");
            throw null;
        }
        c15215x9a0c94c4.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15215x9a0c94c4 c15215x9a0c94c42 = afVar.f187797o;
        if (c15215x9a0c94c42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveImgBtn");
            throw null;
        }
        c15215x9a0c94c42.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15215x9a0c94c4 c15215x9a0c94c43 = afVar.f187798p;
        if (c15215x9a0c94c43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("changeImgBtn");
            throw null;
        }
        c15215x9a0c94c43.setVisibility(8);
        android.view.View view = afVar.f187791g;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playDivider");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showRetry$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showRetry$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15215x9a0c94c4 c15215x9a0c94c44 = afVar.f187801q;
        if (c15215x9a0c94c44 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("miniShareBtn");
            throw null;
        }
        c15215x9a0c94c44.setVisibility(8);
        android.view.View view2 = afVar.f187802r;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("miniShareDivider");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showRetry$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$showRetry$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = afVar.E;
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(afVar.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560034l)));
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("concertlayoutBg");
        throw null;
    }
}
