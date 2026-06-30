package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class oa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d f182858d;

    public oa(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d c13577xf2bee52d) {
        this.f182858d = c13577xf2bee52d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean e17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavVoiceBaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (iq.b.C(view.getContext()) || iq.b.v(view.getContext()) || iq.b.e(view.getContext())) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavVoiceBaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean b17 = fp.i.b();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d c13577xf2bee52d = this.f182858d;
        if (!b17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13577xf2bee52d.f181965h)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavVoiceBaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = c13577xf2bee52d.f181965h;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(c13577xf2bee52d.f181966i.f424981e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d.b(c13577xf2bee52d);
        } else if (c13577xf2bee52d.f181966i.b()) {
            c13577xf2bee52d.c();
        } else {
            c13577xf2bee52d.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavVoiceBaseView", "resume play");
            o72.q3 q3Var = c13577xf2bee52d.f181966i;
            q3Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavVoiceLogic", "resume play");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("keep_app_silent");
            com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = q3Var.f424980d;
            if (c1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavVoiceLogic", "resum play error, player is null");
                e17 = false;
            } else {
                e17 = ((sl.j) c1Var).e();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.pa paVar = c13577xf2bee52d.f181967m;
            paVar.f182874a = false;
            paVar.mo50305x3d8a09a2(4096);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d c13577xf2bee52d2 = paVar.f182879f;
            c13577xf2bee52d2.f181963f.setImageResource(com.p314xaae8f345.mm.R.raw.f81342xcd70a442);
            c13577xf2bee52d2.f181963f.setContentDescription(c13577xf2bee52d2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
            c13577xf2bee52d.f181962e.setKeepScreenOn(true);
            if (!e17) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d.b(c13577xf2bee52d);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavVoiceBaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
