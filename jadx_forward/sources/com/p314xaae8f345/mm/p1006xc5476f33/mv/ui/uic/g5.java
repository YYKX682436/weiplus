package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 f232675d;

    public g5(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var) {
        this.f232675d = z5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        fm3.q qVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var = this.f232675d;
        long j17 = z5Var.D;
        if (j17 >= 0 && z5Var.f233115u + j17 <= z5Var.f233114t) {
            fm3.q qVar2 = z5Var.f233117w;
            fm3.o oVar = qVar2 != null ? qVar2.f345646n : null;
            if (oVar != null) {
                oVar.a(j17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w4 w4Var = z5Var.H;
        if (w4Var != null) {
            boolean z17 = z5Var.B;
            jm3.j0 j0Var = (jm3.j0) w4Var;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a = j0Var.f381861a;
            android.view.View X6 = activityC16653xffd2636a.X6();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(X6, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onConfirm", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            X6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(X6, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onConfirm", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC16653xffd2636a.Y6().m81387x205ac394(i65.a.b(activityC16653xffd2636a.mo55332x76847179(), 12));
            pf5.z zVar = pf5.z.f435481a;
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activityC16653xffd2636a).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) a17;
            if (z17) {
                h4Var.f232707u = true;
            }
            android.view.View mo7935xa188593e = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((jz5.n) h4Var.f232697h).mo141623x754a37bb()).mo7935xa188593e(h4Var.f232700n.f233397m);
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) activityC16653xffd2636a.f232410p).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "access$getMvItemEditThumb(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7935xa188593e);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d Y6 = activityC16653xffd2636a.Y6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Y6, "access$getAlbumFakeThumb(...)");
            android.animation.Animator b17 = fm3.x.a(imageView).b(fm3.x.a(mo7935xa188593e), Y6, false);
            b17.addListener(new jm3.g0(activityC16653xffd2636a));
            b17.setDuration(250L);
            b17.start();
            activityC16653xffd2636a.Z6().animate().translationY(0.0f).setListener(new jm3.h0(activityC16653xffd2636a)).start();
            jm3.i0 i0Var = new jm3.i0(z17);
            int i18 = h4Var.f232700n.f233397m;
            fm3.q qVar3 = (fm3.q) kz5.n0.a0(h4Var.f232694e, i18);
            if (qVar3 != null) {
                i0Var.mo149xb9724478(java.lang.Integer.valueOf(i18), qVar3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) zVar.a(activityC16653xffd2636a).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class);
            h4Var2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "disableCurrentSyncMusic");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i iVar = h4Var2.f232700n;
            if (iVar.f233397m + 1 < h4Var2.R6().mo1894x7e414b06() && (qVar = (fm3.q) kz5.n0.a0(h4Var2.f232694e, iVar.f233397m)) != null) {
                qVar.f345644i = false;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5) zVar.a(activityC16653xffd2636a).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5.class)).W6(false);
            activityC16653xffd2636a.Z6().d();
            if (!j0Var.f381862b.P6()) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.V6(activityC16653xffd2636a);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
