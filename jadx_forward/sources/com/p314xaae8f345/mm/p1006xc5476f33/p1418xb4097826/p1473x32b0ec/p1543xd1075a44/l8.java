package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class l8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f200449h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.f f200450i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(android.content.Context context, yz5.l onSetAutoReplayGenCallBack) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSetAutoReplayGenCallBack, "onSetAutoReplayGenCallBack");
        this.f200449h = onSetAutoReplayGenCallBack;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8g;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAutoReplayGenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAutoReplayGenWidget", sb6.toString());
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.f fVar = this.f200450i;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = fVar.f343556b.getId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s3 s3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s3.f184056a;
        if (valueOf != null && valueOf.intValue() == id6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAutoReplayGenWidget", "click left btn");
            s3Var.a(ml2.t1.f409516r3, null);
            y(false);
        } else {
            fg2.f fVar2 = this.f200450i;
            if (fVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = fVar2.f343557c.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAutoReplayGenWidget", "click right btn");
                s3Var.a(ml2.t1.f409519s3, null);
                y(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAutoReplayGenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.sfy;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sfy);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.sfz;
            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sfz);
            if (textView2 != null) {
                i17 = com.p314xaae8f345.mm.R.id.f564839sg0;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564839sg0);
                if (linearLayout != null) {
                    i17 = com.p314xaae8f345.mm.R.id.f564840sg1;
                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564840sg1);
                    if (textView3 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.f564842sg3;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564842sg3);
                        if (c22699x3dcdb352 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.f564843sg4;
                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564843sg4);
                            if (textView4 != null) {
                                this.f200450i = new fg2.f((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView, textView, textView2, linearLayout, textView3, c22699x3dcdb352, textView4);
                                textView.setOnClickListener(this);
                                fg2.f fVar = this.f200450i;
                                if (fVar != null) {
                                    fVar.f343557c.setOnClickListener(this);
                                    return;
                                } else {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                    throw null;
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
    public void w() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_LIVE_MMKV");
        if (M != null) {
            M.putBoolean("HAS_SHOW_AUTO_GEN_REPLAY_ID", true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s3.f184056a.b(ml2.u1.f409600n3);
        super.w();
    }

    public final void y(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAutoReplayGenWidget", "onSetAutoReplayGen: " + z17);
        a();
        this.f200449h.mo146xb9724478(java.lang.Boolean.valueOf(z17));
    }
}
