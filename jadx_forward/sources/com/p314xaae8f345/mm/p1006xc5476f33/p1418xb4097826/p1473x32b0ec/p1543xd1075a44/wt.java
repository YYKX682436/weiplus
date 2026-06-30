package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class wt extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f201766h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.e f201767i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(android.content.Context context, yz5.a onClickReplayCancelCallback) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickReplayCancelCallback, "onClickReplayCancelCallback");
        this.f201766h = onClickReplayCancelCallback;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayCancelTipWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayCancelTipWidget", sb6.toString());
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.e eVar = this.f201767i;
        if (eVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = eVar.f343525b.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayCancelTipWidget", "click cancel btn");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s3.f184056a.a(ml2.t1.f409522t3, null);
            a();
            this.f201766h.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayCancelTipWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.uys;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.uys);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.uyx;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.uyx);
            if (c22624x85d69039 != null) {
                i17 = com.p314xaae8f345.mm.R.id.uyy;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.uyy);
                if (frameLayout != null) {
                    i17 = com.p314xaae8f345.mm.R.id.uyz;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.uyz);
                    if (textView2 != null) {
                        this.f201767i = new fg2.e((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView, textView, c22624x85d69039, frameLayout, textView2);
                        textView.setOnClickListener(this);
                        fg2.e eVar = this.f201767i;
                        if (eVar == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                            throw null;
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 replayCancelTipDesc = eVar.f343526c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replayCancelTipDesc, "replayCancelTipDesc");
                        java.lang.CharSequence a17 = replayCancelTipDesc.a();
                        if (a17 == null) {
                            a17 = "";
                        }
                        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this.f199914d, a17));
                        f0Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vt(this), java.lang.Math.max(0, a17.length() - 4), a17.length(), 33);
                        replayCancelTipDesc.b(f0Var);
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s3.f184056a.b(ml2.u1.f409603o3);
        super.w();
    }
}
