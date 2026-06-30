package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class pt extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final dk2.hc H;
    public final yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.p f200961J;
    public final yz5.l K;
    public final yz5.l L;
    public boolean M;
    public boolean N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(android.content.Context context, dk2.hc question, yz5.l onFirstResponseOptionSelected, yz5.p onResponseOptionsEntered, yz5.l onDismissedWithoutResponse) {
        super(context, false, null, 0.0f, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(question, "question");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFirstResponseOptionSelected, "onFirstResponseOptionSelected");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onResponseOptionsEntered, "onResponseOptionsEntered");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDismissedWithoutResponse, "onDismissedWithoutResponse");
        this.H = question;
        this.I = onFirstResponseOptionSelected;
        this.f200961J = onResponseOptionsEntered;
        this.K = onDismissedWithoutResponse;
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ot(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ebk;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        return this.H.f315115d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 ltVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        d0();
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.tnv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.content.Context context = this.f199716e;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 2));
        dk2.hc hcVar = this.H;
        int ordinal = hcVar.f315114c.ordinal();
        yz5.l lVar = this.L;
        if (ordinal == 0) {
            ltVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lt(hcVar.f315116e, lVar);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            ltVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gt(hcVar.f315116e, lVar);
        }
        c1163xf1deaba4.mo7960x6cab2c8d(ltVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c1163xf1deaba4.m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.tnw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mt(c1163xf1deaba4, this));
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        int dimension = (int) (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.ail) + (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.ais) * 2));
        int size = hcVar.f315116e.size();
        rootView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nt(rootView, (((size / 2) + (size % 2)) * dimension) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        if (this.N) {
            return;
        }
        this.K.mo146xb9724478(this.H);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View u() {
        android.view.View view = new android.view.View(this.f199716e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "genEmptyView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage", "genEmptyView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }
}
