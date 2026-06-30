package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class k7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final java.lang.String H;
    public db2.b1 I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f197974J;
    public java.util.List K;
    public android.widget.TextView L;
    public android.view.View M;
    public android.view.View N;
    public yz5.l P;
    public bm2.x5 Q;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 R;
    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.H = "Finder.FinderLiveMultiNoticeView";
    }

    public static void e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 k7Var, boolean z17, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? 0 : i17;
        db2.b1 b1Var = k7Var.I;
        if (b1Var != null) {
            b1Var.j();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(0);
        linkedList.add(1);
        db2.b1 b1Var2 = new db2.b1(null, null, str3, i19, null, null, null, null, 0, null, linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.qc.f34715x366c91de, null);
        pq5.g l17 = b1Var2.l();
        android.content.Context context = k7Var.f199716e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.j7(k7Var, z17));
        k7Var.I = b1Var2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.axo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f566272fc4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        this.L = textView;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566063ej2);
        this.M = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e7(this, findViewById, rootView));
        }
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fbu);
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.f7(this));
        zl2.r4.c3(zl2.r4.f555483a, findViewById2, 0, 0, 6, null);
        this.N = findViewById2;
        this.Q = new bm2.x5(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.g7(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.h7(this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.f566271fc3);
        android.content.Context context = rootView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c22849x81a93d25.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(context));
        c22849x81a93d25.mo7960x6cab2c8d(this.Q);
        this.R = c22849x81a93d25;
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) rootView.findViewById(com.p314xaae8f345.mm.R.id.f568116lr1);
        c22851x22587864.setPadding(0, 0, 0, com.p314xaae8f345.mm.ui.bk.j(c22851x22587864.getContext()));
        c22851x22587864.D(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15314xbe4d10f8(c22851x22587864.getContext(), null));
        c22851x22587864.m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.i7(this));
        this.S = c22851x22587864;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.R;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.setVisibility(0);
        }
        android.view.View view = this.N;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget", "initView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget", "initView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
