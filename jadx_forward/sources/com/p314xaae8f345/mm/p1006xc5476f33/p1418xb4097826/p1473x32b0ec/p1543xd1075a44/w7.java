package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class w7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x7 f201687h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.c f201688i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f201689m;

    /* renamed from: n, reason: collision with root package name */
    public vm2.c0 f201690n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x7 callback) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f201687h = callback;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int n() {
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int id6 = view.getId();
        fg2.c cVar = this.f201688i;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (id6 == cVar.f343488d.getId()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorOptionWidget", "onClick: seat edit");
            df2.q1 q1Var = (df2.q1) this.f201687h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorOptionController", "onSeatEditClick, curUsername=" + q1Var.f312661o);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_LINK_USERNAME", q1Var.f312661o);
            q1Var.X6(qo0.b.f446874d4, bundle);
            a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f201689m = new java.util.ArrayList();
        int i17 = com.p314xaae8f345.mm.R.id.tgb;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tgb);
        if (c22849x81a93d25 != null) {
            i17 = com.p314xaae8f345.mm.R.id.tgc;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tgc);
            if (c22699x3dcdb352 != null) {
                i17 = com.p314xaae8f345.mm.R.id.tgd;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tgd);
                if (linearLayout != null) {
                    i17 = com.p314xaae8f345.mm.R.id.tge;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.tge);
                    if (textView != null) {
                        i17 = com.p314xaae8f345.mm.R.id.f569327zm;
                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f569327zm);
                        if (textView2 != null) {
                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView;
                            this.f201688i = new fg2.c(c1073x7e08a787, c22849x81a93d25, c22699x3dcdb352, linearLayout, textView, textView2, c1073x7e08a787);
                            linearLayout.setOnClickListener(this);
                            fg2.c cVar = this.f201688i;
                            if (cVar == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                throw null;
                            }
                            android.widget.TextView finderLiveAnchorOptionSeatTitle = cVar.f343487c;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveAnchorOptionSeatTitle, "finderLiveAnchorOptionSeatTitle");
                            com.p314xaae8f345.mm.ui.fk.b(finderLiveAnchorOptionSeatTitle);
                            fg2.c cVar2 = this.f201688i;
                            if (cVar2 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                throw null;
                            }
                            android.widget.TextView finderLiveAnchorOptionSeatName = cVar2.f343489e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveAnchorOptionSeatName, "finderLiveAnchorOptionSeatName");
                            com.p314xaae8f345.mm.ui.fk.b(finderLiveAnchorOptionSeatName);
                            fg2.c cVar3 = this.f201688i;
                            if (cVar3 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                throw null;
                            }
                            android.content.Context context = this.f199914d;
                            cVar3.f343486b.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
                            int a17 = com.p314xaae8f345.mm.ui.zk.a(context, 24);
                            fg2.c cVar4 = this.f201688i;
                            if (cVar4 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                throw null;
                            }
                            cVar4.f343486b.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u7(a17));
                            java.util.ArrayList arrayList = this.f201689m;
                            if (arrayList == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataList");
                                throw null;
                            }
                            vm2.c0 c0Var = new vm2.c0(arrayList);
                            c0Var.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v7(this);
                            fg2.c cVar5 = this.f201688i;
                            if (cVar5 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                                throw null;
                            }
                            cVar5.f343486b.mo7960x6cab2c8d(c0Var);
                            this.f201690n = c0Var;
                            return;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        ((df2.q1) this.f201687h).f312659m = null;
    }
}
