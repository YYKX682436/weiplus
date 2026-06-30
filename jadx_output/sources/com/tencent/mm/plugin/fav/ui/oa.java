package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class oa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavVoiceBaseView f101325d;

    public oa(com.tencent.mm.plugin.fav.ui.FavVoiceBaseView favVoiceBaseView) {
        this.f101325d = favVoiceBaseView;
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
        com.tencent.mm.plugin.fav.ui.FavVoiceBaseView favVoiceBaseView = this.f101325d;
        if (!b17 && !com.tencent.mm.sdk.platformtools.t8.K0(favVoiceBaseView.f100432h)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavVoiceBaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = favVoiceBaseView.f100432h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(favVoiceBaseView.f100433i.f343448e)) {
            com.tencent.mm.plugin.fav.ui.FavVoiceBaseView.b(favVoiceBaseView);
        } else if (favVoiceBaseView.f100433i.b()) {
            favVoiceBaseView.c();
        } else {
            favVoiceBaseView.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavVoiceBaseView", "resume play");
            o72.q3 q3Var = favVoiceBaseView.f100433i;
            q3Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavVoiceLogic", "resume play");
            com.tencent.mm.sdk.platformtools.c3.a("keep_app_silent");
            com.tencent.mm.modelbase.c1 c1Var = q3Var.f343447d;
            if (c1Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavVoiceLogic", "resum play error, player is null");
                e17 = false;
            } else {
                e17 = ((sl.j) c1Var).e();
            }
            com.tencent.mm.plugin.fav.ui.pa paVar = favVoiceBaseView.f100434m;
            paVar.f101341a = false;
            paVar.sendEmptyMessage(4096);
            com.tencent.mm.plugin.fav.ui.FavVoiceBaseView favVoiceBaseView2 = paVar.f101346f;
            favVoiceBaseView2.f100430f.setImageResource(com.tencent.mm.R.raw.voicepost_pauseicon);
            favVoiceBaseView2.f100430f.setContentDescription(favVoiceBaseView2.getContext().getResources().getString(com.tencent.mm.R.string.f490511x5));
            favVoiceBaseView.f100429e.setKeepScreenOn(true);
            if (!e17) {
                com.tencent.mm.plugin.fav.ui.FavVoiceBaseView.b(favVoiceBaseView);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavVoiceBaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
