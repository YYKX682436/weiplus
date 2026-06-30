package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class m6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final int f200576h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f200577i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.a f200578m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.v94 f200579n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(android.content.Context context, int i17, r45.v94 v94Var, yz5.l onSetAnchorLiveReplayCallBack) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSetAnchorLiveReplayCallBack, "onSetAnchorLiveReplayCallBack");
        this.f200576h = i17;
        this.f200577i = onSetAnchorLiveReplayCallBack;
        r45.v94 v94Var2 = new r45.v94();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingWidget", "Initializing with old settings: " + v94Var);
        if (v94Var != null) {
            v94Var2.set(0, java.lang.Boolean.valueOf(v94Var.m75933x41a8a7f2(0)));
            v94Var2.set(2, java.lang.Boolean.valueOf(v94Var.m75933x41a8a7f2(2)));
            v94Var2.set(3, java.lang.Boolean.valueOf(v94Var.m75933x41a8a7f2(3)));
            if (v94Var2.m75933x41a8a7f2(3)) {
                v94Var2.set(1, java.lang.Boolean.valueOf(v94Var.m75933x41a8a7f2(1)));
            } else {
                v94Var2.set(1, java.lang.Boolean.FALSE);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingWidget", "No old settings, using defaults");
        }
        this.f200579n = v94Var2;
    }

    public static final void y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m6 m6Var) {
        fg2.a aVar = m6Var.f200578m;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        r45.v94 v94Var = m6Var.f200579n;
        aVar.f343465g.setVisibility((v94Var.m75933x41a8a7f2(0) && v94Var.m75933x41a8a7f2(3)) ? 0 : 8);
        fg2.a aVar2 = m6Var.f200578m;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        aVar2.f343464f.setVisibility(v94Var.m75933x41a8a7f2(0) ? 0 : 8);
        fg2.a aVar3 = m6Var.f200578m;
        if (aVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        aVar3.f343466h.m81392x52cfa5c6(v94Var.m75933x41a8a7f2(0));
        fg2.a aVar4 = m6Var.f200578m;
        if (aVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        aVar4.f343467i.m81392x52cfa5c6(v94Var.m75933x41a8a7f2(2));
        fg2.a aVar5 = m6Var.f200578m;
        if (aVar5 != null) {
            aVar5.f343468j.m81392x52cfa5c6(v94Var.m75933x41a8a7f2(1));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8b;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorLiveReplaySettingWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingWidget", sb6.toString());
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.a aVar = this.f200578m;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = aVar.f343460b.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingWidget", "click back btn");
            a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorLiveReplaySettingWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.sd9;
        android.view.View a17 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sd9);
        if (a17 != null) {
            i17 = com.p314xaae8f345.mm.R.id.sd_;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sd_);
            if (linearLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.sda;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sda);
                if (c22624x85d69039 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.sdb;
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sdb);
                    if (c1073x7e08a787 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.sdc;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sdc);
                        if (linearLayout2 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.sdd;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sdd);
                            if (textView != null) {
                                i17 = com.p314xaae8f345.mm.R.id.f564841sg2;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564841sg2);
                                if (textView2 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.f564844sg5;
                                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564844sg5);
                                    if (textView3 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.t5y;
                                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.t5y);
                                        if (textView4 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.u4x;
                                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.u4x);
                                            if (textView5 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.f567029u94;
                                                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567029u94);
                                                if (c1073x7e08a7872 != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.u99;
                                                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.u99);
                                                    if (c1073x7e08a7873 != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.u9h;
                                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.u9h);
                                                        if (c1073x7e08a7874 != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.vbj;
                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.vbj);
                                                            if (viewOnClickListenerC22631x1cc07cc8 != null) {
                                                                i17 = com.p314xaae8f345.mm.R.id.vbk;
                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.vbk);
                                                                if (viewOnClickListenerC22631x1cc07cc82 != null) {
                                                                    i17 = com.p314xaae8f345.mm.R.id.vbl;
                                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.vbl);
                                                                    if (viewOnClickListenerC22631x1cc07cc83 != null) {
                                                                        this.f200578m = new fg2.a((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView, a17, linearLayout, c22624x85d69039, c1073x7e08a787, linearLayout2, textView, textView2, textView3, textView4, textView5, c1073x7e08a7872, c1073x7e08a7873, c1073x7e08a7874, viewOnClickListenerC22631x1cc07cc8, viewOnClickListenerC22631x1cc07cc82, viewOnClickListenerC22631x1cc07cc83);
                                                                        a17.setOnClickListener(this);
                                                                        fg2.a aVar = this.f200578m;
                                                                        if (aVar == null) {
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                            throw null;
                                                                        }
                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 anchorLiveReplaySettingGenTipsText = aVar.f343462d;
                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(anchorLiveReplaySettingGenTipsText, "anchorLiveReplaySettingGenTipsText");
                                                                        java.lang.CharSequence a18 = anchorLiveReplaySettingGenTipsText.a();
                                                                        if (a18 == null) {
                                                                            a18 = "";
                                                                        }
                                                                        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                                                                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this.f199914d, a18));
                                                                        f0Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l6(this), java.lang.Math.max(0, a18.length() - 4), a18.length(), 33);
                                                                        anchorLiveReplaySettingGenTipsText.b(f0Var);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDismiss, final setting:[");
        r45.v94 v94Var = this.f200579n;
        sb6.append(v94Var.m75933x41a8a7f2(0));
        sb6.append(',');
        sb6.append(v94Var.m75933x41a8a7f2(1));
        sb6.append(',');
        sb6.append(v94Var.m75933x41a8a7f2(2));
        sb6.append(',');
        sb6.append(v94Var.m75933x41a8a7f2(3));
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingWidget", sb6.toString());
        this.f200577i.mo146xb9724478(v94Var);
        super.t();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        if (!this.f200579n.m75933x41a8a7f2(3)) {
            fg2.a aVar = this.f200578m;
            if (aVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            aVar.f343465g.setVisibility(8);
        }
        fg2.a aVar2 = this.f200578m;
        if (aVar2 != null) {
            aVar2.f343463e.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k6(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }
}
