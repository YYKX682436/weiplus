package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class rp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vp f201198d;

    public rp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vp vpVar) {
        this.f201198d = vpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMicVoiceRoomLbsRequestPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vp vpVar = this.f201198d;
        vpVar.o0(2, 2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qp(vpVar));
        android.widget.CheckBox checkBox = vpVar.R;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        if (!checkBox.isChecked()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sp) ((jz5.n) vpVar.U).mo141623x754a37bb()).b();
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                android.content.Context context = vpVar.f199716e;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mlf);
                e4Var.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vpVar.Q, "isGpsEnable false");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMicVoiceRoomLbsRequestPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!vpVar.k0()) {
                vpVar.K = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(vpVar, false, 1, null);
            }
            vpVar.h0(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMicVoiceRoomLbsRequestPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
