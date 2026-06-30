package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 f237823d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var) {
        this.f237823d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.TextView textView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$applyImproveLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var = this.f237823d;
        if (!(e0Var.s(1) || ((e0Var.u().getVisibility() == 0) && !(e0Var.s(2) ^ true)))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.f237730i, "volumeAdjust click ignored: both options off");
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$applyImproveLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.view.View.OnClickListener onClickListener = e0Var.f237744z;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            jz5.l lVar = (jz5.l) e0Var.A.mo152xb9724478();
            int intValue = ((java.lang.Number) lVar.f384366d).intValue();
            int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
            e0Var.t().f237808c = e0Var.D;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j1 t17 = e0Var.t();
            t17.f237809d = e06.p.f(intValue, 0, t17.f237808c);
            t17.f237810e = e06.p.f(intValue2, 0, t17.f237808c);
            boolean z17 = e0Var.s(1) && e0Var.B != null;
            boolean z18 = (!(e0Var.u().getVisibility() == 0) || (e0Var.s(2) ^ true) || e0Var.C == null) ? false : true;
            e0Var.t().f237811f = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.y(z17, e0Var, z18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j1 t18 = e0Var.t();
            t18.getClass();
            if (z17 || z18) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = t18.f237807b;
                if (!(y1Var != null && y1Var.f())) {
                    android.content.Context context = t18.f237806a;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
                    y1Var2.d(true);
                    android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570862el0, (android.view.ViewGroup) null, false);
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ujb);
                    if (textView2 != null) {
                        com.p314xaae8f345.mm.ui.fk.a(textView2);
                    }
                    t18.a(inflate, com.p314xaae8f345.mm.R.id.f567590uj4, com.p314xaae8f345.mm.R.id.f567591uj5, com.p314xaae8f345.mm.R.id.uj6, z17, t18.f237809d, new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.g1(t18));
                    t18.a(inflate, com.p314xaae8f345.mm.R.id.uj8, com.p314xaae8f345.mm.R.id.uj9, com.p314xaae8f345.mm.R.id.uj_, z18, t18.f237810e, new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h1(t18));
                    android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.uj7);
                    if (textView3 != null && (textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567589uj3)) != null) {
                        inflate.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i1(inflate, textView3, textView));
                    }
                    y1Var2.k(inflate);
                    y1Var2.s();
                    t18.f237807b = y1Var2;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicVolumeAdjustDialog", "show: nothing to adjust, skip");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$applyImproveLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
