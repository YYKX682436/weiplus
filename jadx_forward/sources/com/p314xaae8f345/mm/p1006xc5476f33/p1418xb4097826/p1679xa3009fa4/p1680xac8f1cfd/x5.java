package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes5.dex */
public final class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 f217932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217933e;

    public x5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647, in5.s0 s0Var) {
        this.f217932d = c15442xfd56d647;
        this.f217933e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = this.f217932d;
        boolean z17 = c15442xfd56d647.f215029f != 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletUIC", "onSmileyBtnClick: feedId=" + pm0.v.u(c15442xfd56d647.f215039s) + "}, isShowSmiley=" + z17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c15442xfd56d647.U6().findViewById(com.p314xaae8f345.mm.R.id.g4v);
        int i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5;
        int i18 = com.p314xaae8f345.mm.R.raw.f80142x4a505d3f;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletUIC", "onShowSmileyPanel: feedId=" + pm0.v.u(c15442xfd56d647.f215039s) + '}');
            c15442xfd56d647.W6().setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c15442xfd56d647.U6().findViewById(com.p314xaae8f345.mm.R.id.g4v);
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setImageResource(c15442xfd56d647.f215041u ? com.p314xaae8f345.mm.R.raw.f80142x4a505d3f : com.p314xaae8f345.mm.R.raw.f79772xf1451aff);
                c22699x3dcdb3522.m82040x7541828(c15442xfd56d647.m80379x76847179().getResources().getColor(c15442xfd56d647.f215041u ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            }
            c15442xfd56d647.f215029f = 2;
            if (c15442xfd56d647.W6().getLayoutParams().height == 0) {
                int c17 = com.p314xaae8f345.mm.ui.bl.c(c15442xfd56d647.m158354x19263085());
                boolean z18 = c15442xfd56d647.m158354x19263085().getResources().getConfiguration().orientation == 1;
                int i19 = z18 ? c15442xfd56d647.m158354x19263085().getResources().getDisplayMetrics().heightPixels / 3 : c15442xfd56d647.m158354x19263085().getResources().getDisplayMetrics().heightPixels / 2;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 W6 = c15442xfd56d647.W6();
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i19);
                if (z18) {
                    layoutParams.bottomMargin = c17;
                } else {
                    layoutParams.setMarginEnd(c17);
                }
                W6.setLayoutParams(layoutParams);
            }
            c15442xfd56d647.W6().setAlpha(0.0f);
            c15442xfd56d647.W6().animate().alpha(1.0f).setDuration(220L).setListener(null).start();
            android.content.Context context = this.f217933e.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
        } else {
            c15442xfd56d647.c7(false);
            c15442xfd56d647.k7();
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setTag(java.lang.Boolean.valueOf(z17));
            if (z17) {
                if (!c15442xfd56d647.f215041u) {
                    i18 = com.p314xaae8f345.mm.R.raw.f79772xf1451aff;
                }
                c22699x3dcdb352.setImageResource(i18);
            } else {
                c22699x3dcdb352.setImageResource(c15442xfd56d647.f215041u ? com.p314xaae8f345.mm.R.raw.f80318x77fc94e5 : com.p314xaae8f345.mm.R.raw.f79915x64991f25);
            }
            android.content.res.Resources resources = c15442xfd56d647.m80379x76847179().getResources();
            if (!c15442xfd56d647.f215041u) {
                i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an;
            }
            c22699x3dcdb352.m82040x7541828(resources.getColor(i17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
