package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f201657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 f201658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f201659f;

    public w3(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var, android.widget.TextView textView) {
        this.f201657d = c0Var;
        this.f201658e = b4Var;
        this.f201659f = textView;
    }

    public static final void a(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var, android.widget.TextView textView) {
        r45.nw1 m76794xd0557130;
        int i17 = !c0Var.f391645d ? 1 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAfterNextLiveInfoWidget", "CgiFinderAudienceReserveLiveNotification do op=" + i17);
        java.lang.String str = b4Var.f199354b.Y().f492179a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0 oo0Var = b4Var.f199354b;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = oo0Var.Y().f492184f;
        long j17 = 0;
        long m76784x5db1b11 = c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = oo0Var.Y().f492184f;
        if (c19792x256d27252 != null && (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) != null) {
            j17 = m76794xd0557130.m75942xfb822ef2(0);
        }
        ke2.b bVar = new ke2.b(str, 2, i17, null, 8, m76784x5db1b11, java.lang.Long.valueOf(j17));
        android.content.Context context = b4Var.f199358f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        bVar.t(context, b4Var.f199353a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
        bVar.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v3(i17, c0Var, textView, b4Var));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$updateNextLiveInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f201657d;
        boolean z17 = c0Var.f391645d;
        android.widget.TextView textView = this.f201659f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var = this.f201658e;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(b4Var.f199353a.getContext(), 1, true);
            k0Var.X1 = true;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t3(b4Var);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u3(c0Var, b4Var, textView);
            k0Var.v();
        } else {
            a(c0Var, b4Var, textView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$updateNextLiveInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
